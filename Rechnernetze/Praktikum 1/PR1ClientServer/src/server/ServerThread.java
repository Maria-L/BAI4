package server;

import java.io.*;
import java.net.*;
import java.util.*;


public class ServerThread extends Thread {
	private int name;
	private Socket socket;
	
	private BufferedReader inputStream;
	private DataOutputStream outputStream;
	
	boolean running = true;
	
	public ServerThread(int name, Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
	public void run() {
		String inputFromClient;
		
		System.out.println("\nServerThread no " + name + " is running\n");
		
		try {
			inputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outputStream = new DataOutputStream(socket.getOutputStream());

			while(running) {
				inputFromClient = inputStream.readLine();
				
				//Dinge müssen passieren
				
				outputStream.writeBytes(inputFromClient + "\n");
				
				if(inputFromClient.indexOf("QUIT") > -1) {
					running = false;
				}
			}
			
			socket.close();
		} catch (IOException e){
			System.out.println("\nError: " + e.toString() + "\n");
		}
	}
}
