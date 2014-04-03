package server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Object;


public class ServerThread extends Thread {
	
	private final int RECEIVEBUFFERSIZE = 255;
	private final String OK = "OK ";
	private final String ERROR = "ERROR ";
	
	private int name;
	private Socket socket;
	boolean running = true; //Schleifenbedingung
	
	//private BufferedReader inputStream;
	//private DataOutputStream outputStream;
	private InputStream inputStream;
	private OutputStream outputStream;
	
	public ServerThread(int name, Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
	//Run started from start()
	public void run() {
		
		String inputFromClient;
		String answerToClient;
		String command;

		System.out.println("ServerThread no " + name + " is running");

		try {
			socket.setReceiveBufferSize(RECEIVEBUFFERSIZE); // Socket mit gewünschter Buffersize initialisieren
			
			//Daten ein und Ausgabe Stream initialisieren
			outputStream = socket.getOutputStream();
			inputStream = socket.getInputStream();
			
			while(running) {
				//Eingabe auslesen
				inputFromClient = readFromClient();
				
				/*
				 * Überprüfen ob Leerzeichen in der Eingabe vorhanden sind, wenn
				 * nicht wird die gesamteEingabe als Befehl gewertet -->
				 * benötigt für BYEansonsten wird die Eingabe am Leerzeichen
				 * gesplittet
				 */
				if(inputFromClient.indexOf(' ') > -1) {
					command = inputFromClient.substring(0, inputFromClient.indexOf(' '));
					inputFromClient = inputFromClient.substring(inputFromClient.indexOf(' ')).trim();
				} else {
					command = inputFromClient.trim();
				}
				
				// Auswertung des Befehlsteils der Eingabe
				switch (command) {
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
					if (Server.shutdown(inputFromClient)) {
						running = false;
						answerToClient = OK;
					} else {
						answerToClient = ERROR + "wrong password";
					}
					break;

				default:
					System.out.println("Command not known");
					answerToClient = "Unknown command";
					break;
				}

				writeToClient(answerToClient);
			}

			Server.decrementThreadCounter(); 				//Ruft die synchronized Methode zum decrementieren der Server Zählvariable auf

			if (socket.isConnected()) {
				socket.close();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}
	}
	
	/*
	 * Liest Nachrichten mit einer maximalen Länge von 255 Byte aus dem inputStream des Servers aus
	 * und sendet eine Erfolg oder Misserfolg Nachricht an den Client
	 * 
	 * @return String request die Anfrage die vom Client gestellt wurde
	 */
	private String readFromClient() throws IOException {
		int read;
		String request;
		byte[] byteArray = new byte[255];					//Begrenzt die mögliche Nachrichtenlänge auf ein Array der Länge 256 
		boolean flag = true;

		for (int i = 0; i < 255 && flag == true; i++) {		//maximale Länge von 255 Byte wird überpüft
			read = inputStream.read();

			if (read == 10 || read == -1) {					//10 ist die ASCII Codierung für Leerzeichen, dieses darf hier nicht vorn stehen
				flag = false;
			} else {
				byteArray[i] = (byte) read;
			}
		}

		if (flag) {
			request = "ERROR Message too long";
			inputStream.skip(inputStream.available());
		} else {
			request = new String(byteArray, "UTF-8");
		}

		System.out.println("Thread " + name + " got message: " + request);
		return request;
	}
	
	/*
	 * Methode die einen String entgegen nimmt und ihn byte weise in den OutputStream schreibt
	 */
	private void writeToClient(String reply) throws IOException {
		byte[] byteArray = (reply + "\n").getBytes("UTF-8");
		
		outputStream.write(byteArray, 0, byteArray.length);

		System.out.println("Thread " + name + " answered: " + reply);
	}
	
	/*
	 * Methode um einen String umzudrehen
	 * 
	 * @param String string übergebene Nachricht die umgedreht werden soll
	 * 
	 * @return String akku der umgedrehte String
	 */
	private String reverse(String string) {
		String akku = "";
		for (int i = 0; i < string.length(); i++) {
			akku = string.charAt(i) + akku;
		}
		return akku;
	}
}
