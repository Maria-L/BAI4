package server;

import java.io.*;
import java.net.*;
import java.util.*;


public class Server {
	public static final int MAX_THREADS = 10;
	public static final int PORT = 50000;
	private static int threadCounter = 0;
	private static boolean running = true;
	
	public static void main(String[] args) {
		ServerSocket welcomeSocket;
		Socket connectionSocket;
		
		try {
			welcomeSocket = new ServerSocket(PORT);
			
			while(running) {
				if(threadCounter > MAX_THREADS) {
					welcomeSocket.close();
				} else {
					System.out.println("\nWaiting for connection - listening to port " + PORT + "\n");
					connectionSocket = welcomeSocket.accept();
					
					(new ServerThread(++threadCounter, connectionSocket)).start();
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
	}
}
