package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import data.Log;
import data.Mail;


public class ServerServerThread extends Thread {
	
	private final int STATE_AUTHORIZATION 	= 0;
	private final int STATE_TRANSACTION 	= 1;
	private final int STATE_UPDATE 			= 2;
	
	private final String COMMAND_QUIT = "QUIT";
	private final String COMMAND_STAT = "STAT";
	private final String COMMAND_USER = "USER";
	private final String COMMAND_PASS = "PASS";
	private final String COMMAND_LIST = "LIST";
	private final String COMMAND_RETR = "RETR";
	private final String COMMAND_DELE = "DELE";
	private final String COMMAND_NOOP = "NOOP";
	private final String COMMAND_RSET = "RSET";
	private final String COMMAND_UIDL = "UIDL";

	private int name;
	private Socket socket;
	
	private InputStream inputStream;
	private OutputStream outputStream;
	
	private BufferedReader br;
	private DataOutputStream da;
	
	private Log log;
	
	private String command;
	private String argument;
	private String inputFromUser;
	private boolean running;
	private int current_state;
	private boolean validUser;
	
	public ServerServerThread(int name, Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
	public void run() {
		command = "";
		running = true;
		current_state = STATE_AUTHORIZATION;
		validUser = false;
		
		log = new Log("ServerLog");
		
		log.newInfo("ServerLog - Beginn");
		
		try {
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();
			
			br = new BufferedReader(new InputStreamReader(inputStream));
			da = new DataOutputStream(outputStream);
			
		} catch (IOException e) {
			log.newWarning("Thread " + name + " konnte die Verbindung zum Client nicht herstellen");
			System.out.println("Thread " + name + " konnte die Verbindung zum Client nicht herstellen");
		}
		
		log.newInfo("Thread " + name + " hat eine Verbindung zum Client hergestellt");
		
		
		try {
			
			writeToClient("+OK Verbindung zu POP3-Proxy Aufgebaut");
			
			
			while(running) {				//Runningschleife Anfang
				
				//Clientinput empfangen und aufsplitten
				inputFromUser = readFromClient();
				
				if(inputFromUser == null || inputFromUser.length() == 0) {
					command = "";
					argument = "";
				} else {
					command = inputFromUser.split(" ")[0];
					
					int firstBlank = inputFromUser.indexOf(' ');
					if(firstBlank > 0) {
						argument = inputFromUser.substring(firstBlank + 1);
					} else {
						argument = "";
					}
				}
				
				//Input verarbeiten
			
				switch(current_state) {
				//########## Authorization State ##########
				case STATE_AUTHORIZATION:
					//Kommando auswählen
					switch(command) {
					case COMMAND_USER:
						log.newInfo("Client-Username: " + argument);
						log.newInfo("Server-Username: " + Server.userName());
						if(Server.userName().indexOf(argument) == 0) {
							validUser = true;
							writeToClient("+OK Benutzername bekannt");
						} else {
							writeToClient("-ERR Benutzername nicht bekannt");
						}
						break;
					
					case COMMAND_PASS:
						if(!validUser) {
							writeToClient("-ERR Kein Benutzername angegeben");
						} else if(Server.userPass().indexOf(argument) == 0){
							current_state = STATE_TRANSACTION;
							writeToClient("+OK Erfolgreich eingeloggt");
						} else {
							writeToClient("-ERR Falsches Passwort");
						}
						break;
						
					case COMMAND_QUIT:
						running = false;
						writeToClient("+OK Verbindung wird geschlossen");
						break;
						
					default:
						writeToClient("-ERR Unbekannter Befehl");
						break;
					}
					
					break;
					
					
				//########## Transaction State ##########
				case STATE_TRANSACTION:
					//Kommando auswählen
					switch(command) {
					case COMMAND_STAT:
						writeToClient("+OK " + Server.mails().size() + " " + Server.maildropSize());
						break;
					
					case COMMAND_LIST:
						if(argument.equals("")) {											//Kein Argument gegeben - Informationen über alle Mails ausgeben
							writeToClient("+OK Mail-Liste folgt");
							for(int i = 1; i <= Server.mails().size(); i++) {
								writeToClient(i + " " + Server.mails().get(i - 1).length());
							}
							writeToClient(".");
						} else {															//Argument gegeben - Suche die gegebene Mail heraus
							int messageNum = Integer.parseInt(argument.split(" ")[0]);
							
							if(messageNum <= Server.mails().size()) {
								writeToClient("+OK " + messageNum + " " + Server.mails().get(messageNum - 1).length());
							} else {
								writeToClient("-ERR Keine Nachricht mit der Nummer " + messageNum + " vorhanden");
							}
						}
						break;
					
					case COMMAND_RETR:
						if(argument.equals("")) {
							writeToClient("-ERR Keine Mail-Nummer gegeben");
						} else {
							
							writeToClient("+OK");
							
							int messageNum = Integer.parseInt(argument.split(" ")[0]);
							
							if(messageNum <= Server.mails().size()) {
								
								String[] messageArray = Server.mails().get(messageNum - 1).getText().split("\n");
								
								for(String m : messageArray) {
									writeToClient(m);
								}
								writeToClient(".");
								
							} else {
								writeToClient("-ERR Keine Nachricht mit der Nummer " + messageNum + " vorhanden");
							}
						}
						
						break;
						
					case COMMAND_DELE:
						
						if(argument.equals("")) {
							writeToClient("-ERR Keine Mail-Nummer gegeben");
						} else {
							int messageNum = Integer.parseInt(argument.split(" ")[0]);
							
							if(messageNum <= Server.mails().size()) {
								Server.mails().get(messageNum - 1).delete();
								writeToClient("+OK");
							} else {
								writeToClient("-ERR Keine Nachricht mit der Nummer " + messageNum + " vorhanden");
							}
						}
						
						break;
						
					case COMMAND_NOOP:
						writeToClient("+OK");
						break;
						
					case COMMAND_RSET:
						for(Mail m : Server.mails()) {
							m.undelete();
						}
						writeToClient("+OK");
						break;
						
					case COMMAND_UIDL:
						
						if(argument.equals("")) {
							writeToClient("+OK Mail-ID Liste folgt");
							for(int i = 1; i <= Server.mails().size(); i++) {
								writeToClient(i + " " + Server.mails().get(i - 1).getId());
							}
							writeToClient(".");
							
						} else {
							int messageNum = Integer.parseInt(argument.split(" ")[0]);
							
							if(messageNum <= Server.mails().size()) {
								writeToClient("+OK " + messageNum + " " + Server.mails().get(messageNum - 1).getId());
							} else {
								writeToClient("-ERR Keine Nachricht mit der Nummer " + messageNum + " vorhanden");
							}
						}
						
						break;
						
					case COMMAND_QUIT:
						List<Mail> mail_mirror = new ArrayList<Mail>();
						
						for(Mail m : Server.mails()) {
							mail_mirror.add(m);
						}
						
						Server.mails().removeAll(mail_mirror);
						
						writeToClient("+OK Es wurden " + mail_mirror.size() + " Nachrichten gelöscht");
						
						break;
						
					default:
						writeToClient("-ERR Unbekannter Befehl");
						break;
					
					}
					break;
				//########## Update State ##########
				case STATE_UPDATE:
					
					break;
				}
			}								//Runningschleife Ende
			
			
		} catch(IOException e) {
			
		}
	}
	
	
private void writeToClient(String request) throws IOException {
		
		da.writeBytes(request + "\n");
		log.newInfo("Wrote to Client: " + request);
		System.out.println("Wrote to Client: " + request);
		
		
		/*byte[] byteArray = (request + "\n").getBytes("UTF-8");
		Server.log.log(Level.SEVERE, "Wrote to Server " + request);
		outputStream.write(byteArray, 0, byteArray.length);*/
	}
	
	private String readFromClient() throws IOException {
		
		String request = br.readLine();
		log.newInfo("Client answer: " + request);
		System.out.println("Client answer: " + request);
		return request;
		
		
		/*int read, byteIndex;
		String request;
		byte[] byteArray = new byte[INPUT_SIZE_BYTE]; 
		
		if (inputStream.available() > 1) {

		}
		
		byteIndex = 0;
		do {
			if (byteIndex == INPUT_SIZE_BYTE) {
				throw new IllegalArgumentException();
			}
			read = inputStream.read();
			byteArray[byteIndex] = (byte) read;
			byteIndex++;
		} while(read != 10  && read != -1);
		
		if(read == -1 && byteIndex == 1) {
			throw new ConnectException();
		}
	
		request = new String(byteArray, "UTF-8");

		//System.out.println("Server answer: " + request);
		Server.log.log(Level.SEVERE, "Server Answer " + request);
		return request;*/
	}
}
