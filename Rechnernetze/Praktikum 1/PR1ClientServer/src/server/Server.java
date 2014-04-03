package server;

import java.io.*;
import java.net.*;
import java.util.*;


public class Server {
	
	private static final int MAX_THREADS = 1;
	public static final int PORT = 50000;
		
	private static ServerSocket welcomeSocket;
	private static int threadNameCounter = 0;
	private static int threadCounter = 0;
	private static volatile boolean serverRunning = true;
	private static String password = "toastbrot";
	

	public static void main(String[] args) {
		welcomeSocket = null;
		Socket connectionSocket = null;

		try {		
			
			welcomeSocket = new ServerSocket(PORT); 						// Initialisieren der Empfangs Socket, die die Anfragen verteilt
			/*
			 * Timeout auf eine halbe Sekunde gesetzt um zu verhindern, dass der
			 * Server im accept() fest hängt, alle 0,5sec wacht er einmal auf
			 * und prüft ob serverRunning noch true ist
			 */
			welcomeSocket.setSoTimeout(500);

			while (serverRunning) {

				try {
					connectionSocket = welcomeSocket.accept();
				} catch (SocketTimeoutException e) {
					System.out.println("Waiting...");
				}

				if (threadCounter >= MAX_THREADS && connectionSocket != null) {
					connectionSocket.close();
				} else if (connectionSocket != null) {
					incrementThreadCounter();
					(new ServerThread(++threadNameCounter, connectionSocket)).start();
				}

				connectionSocket = null; 									// Connection ausnullen um erneute
																			// Verbindung auf selben Thread zu verhindern
			}

			welcomeSocket.close(); 											// Annahme Socket schließen um keine neuen Threads mehr 
																			// anzunehmen wenn der Server heruntergefahren werden soll
			while (threadCounter > 0) {
				System.out.println("Number of Threads: " + threadCounter); 	// Darauf warten, dass																			// sich  die Threads beenden
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
	}

	/*
	 * Eine Methode zum geregelten herunterfahren des Servers
	 * 
	 * @param String password_ Passwort zur authentifizierung
	 * 
	 * @Exception IOException sollte das Passwort falsch sein
	 */
	public static boolean shutdown(String password_) throws IOException {
		if (password_.equals(password)) {
			System.out.println("Server shutting down - no new connections will be accepted");
			serverRunning = false;
			return true;
		} else {
			System.out.println("False password!");
			return false;
		}
	}
	
	/*
	 * Syncronized Methoden zum decrementieren und incrementieren des
	 * ThreadCounters um Thread Sicherheit zu schaffen.
	 */
	public static synchronized void decrementThreadCounter() {
		threadCounter--;
	}

	public static synchronized void incrementThreadCounter() {
		threadCounter++;
	}
}
