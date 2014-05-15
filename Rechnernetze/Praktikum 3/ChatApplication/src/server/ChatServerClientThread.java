package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import data.ChatUser;
import data.Log;

public class ChatServerClientThread extends Thread {
	
	private final String NEW = "NEW";
	private final String INFO = "INFO";
	private final String BYE = "BYE";
	
	private int name;
	private Socket socket;
	boolean running = true;
	private String userName;
	private Pattern userNamePattern = Pattern.compile("[^a-z0-9 ], Pattern.CASEINSENSITIVE");
	
	private InputStream inputStream;
	private OutputStream outputStream;
	
	private BufferedReader br;
	private DataOutputStream da;

	private Log log = new Log("ChatServerClientThread");
	
	
	public ChatServerClientThread(int name, Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
	public void run() {
		
		String inputFromUser;
		String answerToUser;
		String command;
		String argument;
		
		
		//Ausnullen zur Sicherheit
		socket = null;
		outputStream = null;
		inputStream = null;
		
		//Verbindung zum Host herstellen
		try {
			outputStream = socket.getOutputStream();
			inputStream = socket.getInputStream();
			
			br = new BufferedReader(new InputStreamReader(inputStream));
			da = new DataOutputStream(outputStream);
			
		} catch (UnknownHostException e) {
			log.newWarning("Die Hostaddresse konnte nicht aufgel�st werden");
			running = false;
		} catch (IOException e) {
			log.newWarning("Der Socket zu konnte nicht erstellt werden");
			running = false;
		}
		
		while(running) {		//Runningschleife Anfang
			
			command = "";
			argument = "";
			inputFromUser = "";
			answerToUser = "";
	
			//Clientinput empfangen und aufsplitten
			try {
				inputFromUser = readFromClient();
				
				if(inputFromUser == null) {
					break;
				} else if(inputFromUser.length() == 0) {
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
			} catch (IOException e) {
				log.newWarning(e.getMessage());
			}
			
			//Input verarbeiten
			try {
			
				switch(command) {
				
				case NEW: 
					Matcher m = userNamePattern.matcher(argument);
					
					if(userName != "") {
						writeToClient("ERROR Es wurde schon ein Name gewaehlt");
						running = false;
					} else if (argument.length() > 20) {
						writeToClient("ERROR Der Name enthaelt zu viele Zeichen");
						running = false;
					} else if (m.find()) {
						writeToClient("ERROR Der Name enthaelt Sonderzeichen");
						running = false;
					} else {
						ChatServer.addUser(argument, socket.getInetAddress().getCanonicalHostName());
						userName = argument;
						writeToClient("OK");
					}
					break;
					
				case INFO:
					
					if(userName.equals(""))
					answerToUser = "LIST " + ChatServer.getUserCount();
					
					for(ChatUser u : ChatServer.getUserList()) {
						answerToUser += " " + u.getHost() + " " + u.getUserName();
					}
					
					writeToClient(answerToUser);
					break;
					
				case BYE:
					
					running = false;
					ChatServer.deleteUser(userName);
					writeToClient("BYE");
					break;
				}
			
			} catch (IOException e) {
				log.newWarning(e.getMessage());
			}
			
		}						//Runningschleife Ende
		
		try {
			socket.close();
		} catch (IOException e) {
			log.newWarning("Socket konnte nicht erfolgreich geschlossen werden");
		}
	}
	
	private void writeToClient(String request) throws IOException {
		
		da.writeBytes(request + "\n");
		log.newInfo("Wrote to Server: " + request);
		System.out.println("Wrote to Server: " + request);
	
	}
	
	private String readFromClient() throws IOException {
		
		String request = br.readLine();
		log.newInfo("Server answer: " + request);
		System.out.println("Server answer: " + request);
		return request;
		
	}
}
