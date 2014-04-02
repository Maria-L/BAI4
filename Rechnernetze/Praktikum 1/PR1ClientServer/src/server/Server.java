package server;

import java.io.*;
import java.net.*;
import java.util.*;


public class Server {
	//Globals
	private static final int MAX_THREADS = 1;
	public static final int PORT = 50000;
		
	private static int threadNameCounter = 0;
	private static int threadCounter = 0;
	private static boolean serverRunning = true;
	private static String password = "toastbrot";
	private static ServerSocket welcomeSocket;
	
	
	public static void main(String[] args) {
		welcomeSocket = null;
		Socket connectionSocket = null;
		
		try {
			//Initialisieren der Empfangs Socket, die die Anfragen verteilt
			welcomeSocket = new ServerSocket(PORT);
			welcomeSocket.setSoTimeout(500);
			
			while(serverRunning) {
				
				try {
					connectionSocket = welcomeSocket.accept();
				} catch (SocketTimeoutException e) {
					System.out.println("Waiting...");
				}
					
				if(threadCounter >= MAX_THREADS && connectionSocket != null) {
					connectionSocket.close();
				} else if(connectionSocket != null) {
					incrementThreadCounter();
					(new ServerThread(++threadNameCounter, connectionSocket)).start();
				}
				
				connectionSocket = null;
			}
			
			//Socket schließen?!?
			welcomeSocket.close();
			
			while(threadCounter > 0) {
				System.out.println("Number of Threads: " + threadCounter);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
		
	}
	
	public static boolean shutdown(String password_) throws IOException {
		if(password_.equals(password)) {
			System.out.println("Server shutting down - no new connections will be accepted");
			serverRunning = false;
			return true;
		} else {
			System.out.println("False password!");
			return false;
		}
	}
	
	public static synchronized void decrementThreadCounter() {
		threadCounter--;
	}
	
	public static synchronized void incrementThreadCounter() {
		threadCounter++;
	}
}
