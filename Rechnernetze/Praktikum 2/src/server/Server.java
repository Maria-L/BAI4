package server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import data.*;


public class Server {
	
	private static final int MAX_THREADS = 1;
	private static final int WAITING_TIME_MS = 500;
	public static int port = 11000;
		
	private static ServerSocket welcomeSocket;
	private static int threadNameCounter = 0;
	private static volatile int threadCounter = 0;
	private static volatile boolean serverRunning = true;
	private static String serverPassword = "toastbrot";
	
	
	//Mail-Variablen
	private static volatile List<MailKonto> mailKontoListe = new ArrayList<MailKonto>();
	private static volatile List<Mail> mailListe = new ArrayList<Mail>();
	private static UniqueIdGenerator idGenerator = new UniqueIdGenerator();
	
	//Login-Daten
	private static String userName = "maffen";
	private static String userPassword = "toastbrot";
	

	public static void main(String[] args) {

		
		welcomeSocket = null;
		Socket connectionSocket = null;

		if(args.length != 0 && args[0] != "" && args != null) {
			port = Integer.parseInt(args[0]);
		}
		System.out.println("Port " + port + " is choosen");
		
		mailKontoListe.add(new MailKonto("steffen@theinbox.de", "0bbb4db4d2", "mail.theinbox.de", 110));
		
		(new ServerClientThread(++threadNameCounter)).start();
		
		
		try {		
			welcomeSocket = new ServerSocket(port); 						// Initialisieren der Empfangs Socket, die die Anfragen verteilt
			/*
			 * Timeout auf eine halbe Sekunde gesetzt um zu verhindern, dass der
			 * Server im accept() fest h�ngt, alle 0,5sec wacht er einmal auf
			 * und pr�ft ob serverRunning noch true ist
			 */
			welcomeSocket.setSoTimeout(WAITING_TIME_MS);

			while (serverRunning) {

				try {
					connectionSocket = welcomeSocket.accept();
					if (threadCounter >= MAX_THREADS || !serverRunning){
						connectionSocket.close();
					} else  {
						incrementThreadCounter();
						(new ServerServerThread(++threadNameCounter, connectionSocket)).start();
					}
				} catch (SocketTimeoutException e) {
					//System.out.println("Waiting...");
				}																								// Verbindung auf selben Thread zu verhindern
			}

			welcomeSocket.close(); 											// Annahme Socket schlie�en um keine neuen Threads mehr 
																			// anzunehmen wenn der Server heruntergefahren werden soll
			while (threadCounter > 0) {
				System.out.println("Number of Threads: " + threadCounter); // Darauf warten, dass sich  die Threads beenden
				try {
					Thread.currentThread();
					Thread.sleep(WAITING_TIME_MS);
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
		if (password_.equals(serverPassword)) {
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
	
	public static List<MailKonto> mailKontoList() {
		return mailKontoListe;
	}
	
	public static List<Mail> mails() {
		return mailListe;
	}
	
	public static void addMail(String inhalt, String id) {
		mailListe.add(new Mail(inhalt, id));
	}
	
	public static String userName() {
		return userName;
	}
	
	public static String userPass() {
		return userPassword;
	}
	
	public static String getId() {
		return idGenerator.getId();
	}
	
	public static int maildropSize() {
		int akku = 0;
		
		for(Mail m : mailListe) {
			akku += m.length() + 1;
		}
		
		return akku;
	}
}
