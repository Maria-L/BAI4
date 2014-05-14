package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import data.Log;

public class ChatClientThread extends Thread {
	
	private final String NEW = "NEW";
	private final String INFO = "INFO";
	private final String BYE = "BYE";
	
	private int name;
	private Socket socket;
	boolean running = true;
	
	private InputStream inputStream;
	private OutputStream outputStream;
	
	private BufferedReader br;
	private DataOutputStream da;

	private Log log;
	
	
	public ChatClientThread(int name, Socket socket) {
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
		} catch (IOException e) {
			log.newWarning("Der Socket zu konnte nicht erstellt werden");
		}
		
		while(running) {		//Runningschleife Anfang
			
			command = "";
			argument = "";
			
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
				
				ChatServer.addUser(argument, socket.getInetAddress().getCanonicalHostName());
				break;
				
			case INFO:
				
				
				break;
				
			case BYE:
				
				writeToClient("BYE");
				running = false;
				break;
			}
			
			} catch (IOException e) {
				log.newWarning(e.getMessage());
			}
			
		}						//Runningschleife Ende
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
