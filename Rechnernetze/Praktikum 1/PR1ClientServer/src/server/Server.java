package server;

import java.io.*;
import java.net.*;


public class Server {
	
	private static final int MAX_THREADS = 10;
	public static int port = 50000;
		
	private static ServerSocket welcomeSocket;
	private static int threadNameCounter = 0;
	private static volatile int threadCounter = 0;
	private static volatile boolean serverRunning = true;
	private static String password = "toastbrot";
	

	public static void main(String[] args) {
		welcomeSocket = null;
		Socket connectionSocket = null;

		if(args.length != 0 && args[0] != "" && args != null) {
			port = Integer.parseInt(args[0]);
		}
		System.out.println("Port " + port + " is choosen");
		
		
		try {		
			welcomeSocket = new ServerSocket(port); 						// Initialisieren der Empfangs Socket, die die Anfragen verteilt
			/*
			 * Timeout auf eine halbe Sekunde gesetzt um zu verhindern, dass der
			 * Server im accept() fest hängt, alle 0,5sec wacht er einmal auf
			 * und prüft ob serverRunning noch true ist
			 */
			welcomeSocket.setSoTimeout(500);

			while (serverRunning) {

				try {
					connectionSocket = welcomeSocket.accept();
					if (threadCounter >= MAX_THREADS || !serverRunning){
						connectionSocket.close();
					} else  {
						incrementThreadCounter();
						(new ServerThread(++threadNameCounter, connectionSocket)).start();
					}
				} catch (SocketTimeoutException e) {
					System.out.println("Waiting...");
				}																								// Verbindung auf selben Thread zu verhindern
			}

			welcomeSocket.close(); 											// Annahme Socket schlieï¿½en um keine neuen Threads mehr 
																			// anzunehmen wenn der Server heruntergefahren werden soll
			while (threadCounter > 0) {
				System.out.println("Number of Threads: " + threadCounter); // Darauf warten, dass sich  die Threads beenden
				try {
					Thread.currentThread().sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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
	public static void decrementThreadCounter() {
		threadCounter--;
	}

	public static void incrementThreadCounter() {
		threadCounter++;
	}
}
