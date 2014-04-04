package server;

import java.io.*;
import java.net.*;


public class ServerThread extends Thread {
	
	private final String OK = "OK ";
	private final String ERROR = "ERROR ";
	private final int ASCII_LINEFEED = 10;
	private final int STREAM_DEFAULT = -1;
	private final int INPUT_SIZE_BYTE = 255;
	private final char SPACE = ' ';
	
	private int name;
	private Socket socket;
	boolean running = true; //Schleifenbedingung
	
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
			
			//Daten ein und Ausgabe Stream initialisieren
			outputStream = socket.getOutputStream();
			inputStream = socket.getInputStream();
			
			while(running) {
				//Eingabe auslesen
				try {
					inputFromClient = readFromClient();
				} catch(IllegalArgumentException e) {
					inputFromClient = "ERROR Message too long";
					inputStream.skip(inputStream.available());
				}
				
				/*
				 * Überprüfen ob Leerzeichen in der Eingabe vorhanden sind, wenn
				 * nicht wird die gesamteEingabe als Befehl gewertet -->
				 * benötigt für BYE ansonsten wird die Eingabe am Leerzeichen
				 * gesplittet
				 */
				if(inputFromClient.indexOf(SPACE) > -1) {
					command = inputFromClient.substring(0, inputFromClient.indexOf(SPACE));
					inputFromClient = inputFromClient.substring(inputFromClient.indexOf(SPACE)).trim();
				} else {
					command = inputFromClient.trim();
					inputFromClient = "";
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
				case "ERROR":
					answerToClient = ERROR + " " + inputFromClient;
					break;

				default:
					System.out.println("Command not known");
					answerToClient = "Unknown command";
					break;
				}

				writeToClient(answerToClient);
			}

			if (socket.isConnected()) {
				socket.close();
			}
		} catch (ConnectException e) {
			System.out.println("Client disconnected improperly");
		} catch (SocketException e) {
			System.out.println("Client disconnected improperly");
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		}finally{											//führt die Anweisung sicher aus, auch wenn unbehandelte Exceptions kommen
			Server.decrementThreadCounter(); 				//Ruft die synchronized Methode zum decrementieren der Server Zählvariable auf	
		}
	}

	/*
	 * Liest Nachrichten mit einer maximalen Länge von 255 Byte aus dem inputStream des Servers aus
	 * und sendet eine Erfolg oder Misserfolg Nachricht an den Client
	 * 
	 * @return String request die Anfrage die vom Client gestellt wurde
	 */
	private String readFromClient() throws IOException {
		int read, byteIndex;
		String request;
		byte[] byteArray = new byte[INPUT_SIZE_BYTE];					//Begrenzt die mögliche Nachrichtenlänge auf ein Array der Länge 256 
		
		if (inputStream.available() > 1) {

		}	
		
		byteIndex = 0;
		do {
			if (byteIndex == INPUT_SIZE_BYTE) {
				throw new IllegalArgumentException();
			}
			read = inputStream.read();
			byteArray[byteIndex] = (byte) read;
			byteIndex++;
		} while(read != ASCII_LINEFEED && read != STREAM_DEFAULT);
		
		if(read == STREAM_DEFAULT && byteIndex == 1) {
			throw new ConnectException();
		}
	
		request = new String(byteArray, "UTF-8");

		System.out.println("Thread " + name + " got message: " + request);
		return request;
	}
	
	/*
	 * Methode die einen String entgegen nimmt und ihn byte weise in den OutputStream schreibt
	 */
	private void writeToClient(String reply) throws IOException {
		byte[] byteArray = (reply + (char) ASCII_LINEFEED).getBytes("UTF-8");
		
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
		String akku = new StringBuffer(string).reverse().toString();
		return akku;
	}
}
