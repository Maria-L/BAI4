package server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Object;


public class ServerThread extends Thread {
	//####### Start Globals ######
	
	private final int RECEIVEBUFFERSIZE = 255;
	private final String OK = "OK";
	private final String ERROR = "ERROR";
	
	//###### Start Variables ######
	private int name;
	private Socket socket;
	boolean running = true;
	
	private BufferedReader inputStream;
	private DataOutputStream outputStream;
	
	//Konstruktor
	public ServerThread(int name, Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
	//Run started from start()
	//Methods
	public void run() {
		String inputFromClient;
		String answerToClient;
		String command;
		
		System.out.println("\nServerThread no " + name + " is running\n");
		
		try {
			socket.setReceiveBufferSize(RECEIVEBUFFERSIZE);
			
			inputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outputStream = new DataOutputStream(socket.getOutputStream());

			while(running) {
				inputFromClient = readFromClient();
				
				if(inputFromClient.indexOf(' ') > -1) {
					command = inputFromClient.substring(0, inputFromClient.indexOf(' '));
					inputFromClient = inputFromClient.substring(inputFromClient.indexOf(' '));
				} else {
					command = inputFromClient;
				}
				
				switch(command) {
					case "LOWERCASE":
						answerToClient = OK + inputFromClient.toLowerCase();
						break;
						
					case "UPPERCASE":
						answerToClient = OK + inputFromClient.toUpperCase();
						break;
						
					case "REVERSE":
						answerToClient = OK + reverse(inputFromClient);
						break;
						
					case "BYE":
						answerToClient = "BYE";
						running = false;
						break;
						
					case "SHUTDOWN":
						if(Server.shutdown(inputFromClient)) {
							running = false;
							answerToClient = OK;
						} else {
							answerToClient = ERROR;
						}
						break;
						
					default:
						answerToClient = "Unknown command";
						break;
				}
				
				writeToClient(answerToClient);
			}
			
			Server.decrementThreadCounter();
			
			if (socket.isConnected()) {
				socket.close();
			}
			
		} catch (IOException e){
			System.out.println("\nError: " + e.toString() + "\n");
		}
	}
	
	private String readFromClient() throws IOException {
		String request = inputStream.readLine();
		System.out.println("\nThread " + name + " got message: " + request + "\n");
		return request;
	}
	
	/*
	 * 
	 */
	private void writeToClient(String reply) throws IOException {
		outputStream.writeBytes(reply + "\n");
		System.out.println("Thread " + name + " answered: " + reply + "\n");
	}
	
	/*
	 * 
	 */
	private String reverse(String string) {
		String akku = "";
		for(int i = 0; i < string.length(); i++) {
			akku = string.valueOf(i) + akku;
		}
		return akku;
	}
}
