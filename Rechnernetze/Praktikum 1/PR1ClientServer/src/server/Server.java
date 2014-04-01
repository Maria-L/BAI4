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
			
			while(serverRunning) {
				System.out.println("\nWaiting for connection - listening to port " + PORT + "\n");
				//TODO 
				connectionSocket = welcomeSocket.accept();
					
				//TODO Check Thread safety
				if(threadCounter >= MAX_THREADS) {
					connectionSocket.close();
				} else {
					threadCounter++;
					(new ServerThread(++threadNameCounter, connectionSocket)).start();
				}
			}
			
			while(threadCounter > 0) {
				System.out.println("Number of Threads: " + threadCounter + "\n");
			}
			
			welcomeSocket.close();
			
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
		
	}
	
	public static boolean shutdown(String password_) throws IOException {
		if(password_.indexOf(password) == 1) {
			System.out.println("\nServer shutting down - no new connections will be accepted\n");
			serverRunning = false;
			welcomeSocket.close();
			return true;
		} else {
			System.out.println("\nFalse password!\n");
			return false;
		}
	}
	
	public static void decrementThreadCounter() {
		threadCounter--;
	}
}
