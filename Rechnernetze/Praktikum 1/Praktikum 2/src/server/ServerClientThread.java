package server;

import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;
import java.io.*;
import java.net.*;
import java.util.*;
import data.*;

public class ServerClientThread extends Thread {
	
	private final String OK = "OK ";
	private final String ERROR = "ERROR ";
	private final int ASCII_LINEFEED = 10;
	private final int STREAM_DEFAULT = -1;
	private final int INPUT_SIZE_BYTE = 65535;
	private final char SPACE = ' ';
	private final int POPPERIOD = 30000;
	
	private int name;
	private Socket socket;
	boolean running = true;
	
	private InputStream inputStream;
	private OutputStream outputStream;
	
	
	public ServerClientThread(int name) {
		this.name = name;
	}
	
	public void run() {
		
		String inputFromServer;
		String answerToServer;
		String command;
		String[] inputArray;
		
		int i;
		
		
		while(running) {
			
			run:
			for(MailKonto mailKonto : Server.mailKontoList()) {
				
				//Verbindung zum Host herstellen
				try {
					socket = new Socket(mailKonto.serverAddresse(), mailKonto.port());
					outputStream = socket.getOutputStream();
					inputStream = socket.getInputStream();
				} catch (UnknownHostException e) {
					System.out.println("Die Hostaddresse " + mailKonto.serverAddresse() + " konnte nicht aufgelöst werden");
					continue run;
				} catch (IOException e) {
					System.out.println("Der Socket zu " + mailKonto.serverAddresse() + " konnte nicht erstellt werden");
					continue run;
				}
				
				//Nachrichtenaustausch mit dem Server
				try {
					//Erwarte nach Aufbau der Verbindung ein "+OK"
					inputFromServer = readFromServer();
					
					if(inputFromServer.indexOf("+OK") != 0) {
						System.out.println("Mailserver von " + mailKonto.serverAddresse() + " lehnt eine Verbindung gääääänzlich ab - nicht mit dir!");
						continue run;
					}
					
					//Schreibe "USER username" an den Server
					writeToServer("USER " + mailKonto.user());
					
					//Erwarte "+OK"
					inputFromServer = readFromServer();
					
					if(inputFromServer.indexOf("+OK") != 0) {
						System.out.println("Der User " + mailKonto.user() + " ist bei dem Server " + mailKonto.serverAddresse() + " nicht bekannt");
						continue run;
					}
					
					//Schreibe "PASS userpasswort" an den Server
					writeToServer("PASS " + mailKonto.passwort());
					
					//Erwarte "+OK"
					inputFromServer = readFromServer();
					
					if(inputFromServer.indexOf("+OK") != 0) {
						System.out.println("Das Passwort von " + mailKonto.user() + " war falsch");
						continue;
					}
					/*
					//Schreibe "STAT" an den Server
					writeToServer("STAT");
					
					//Erwarte "+OK anzahlNachrichten größeNachrichten"
					inputFromServer = readFromServer();
					
					if(inputFromServer.indexOf("+OK") != 0) {
						System.out.println("Der Server " + mailKonto.serverAddresse() + " hat eine unbekannte Nachricht verschickt");
						continue run;
					}
					
					inputArray = inputFromServer.split(" ");
					
					i = Integer.parseInt(inputArray[1].trim());
					*/
					
					//Schreibe "LIST" an den Server
					writeToServer("LIST");
					
					//Erwarten +OK gefolgt von einer i langen Aufzählung an "nachrichtenNummer nachrichtengröße"
					inputFromServer = readFromServer();
					
					if(inputFromServer.indexOf("+OK") != 0) {
						System.out.println("Der Server " + mailKonto.serverAddresse() + " hat eine unbekannte Nachricht verschickt");
						continue run;
					}
					
					inputFromServer = readFromServer();
					
					//Solange entweder das erste Zeichen ungleich oder die beiden ersten Zeichen gleich Punkt sind
					while(inputFromServer.charAt(0) == '.' && inputFromServer.charAt(1) == '.' 
							|| inputFromServer.indexOf('.') != 0) {
						
					}
					
				
				} catch (IOException e) {
					System.out.println("Fehler beim lesen oder schreiben zu " + mailKonto.serverAddresse());
					continue run;
				}
			}
			
			try {
				this.wait(POPPERIOD);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			
	}
	
	
	
	
	
	
	private void writeToServer(String request) throws IOException {
		byte[] byteArray = (request + "\n").getBytes("UTF-8");
		
		outputStream.write(byteArray, 0, byteArray.length);
	}
	
	private String readFromServer() throws IOException {
		int read, byteIndex;
		String request;
		byte[] byteArray = new byte[255]; 
		
		if (inputStream.available() > 1) {

		}
		
		byteIndex = 0;
		do {
			if (byteIndex == 255) {
				throw new IllegalArgumentException();
			}
			read = inputStream.read();
			byteArray[byteIndex] = (byte) read;
			byteIndex++;
		} while(read != 10 && read != -1);
		
		if(read == -1 && byteIndex == 1) {
			throw new ConnectException();
		}
	
		request = new String(byteArray, "UTF-8");

		System.out.println("Server answer: " + request);
		return request;
	}
}
