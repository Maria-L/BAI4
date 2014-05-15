package client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import data.*;

import data.Log;

public class ServerCommunicationThread extends Thread {
	
	private final int WAITPERIOD = 2500;

	private int name;
	private Socket socket;
	static boolean running = true;
	private String userName;
	private String serverName;

	private InputStream inputStream;
	private OutputStream outputStream;

	private BufferedReader br;
	private DataOutputStream da;

	private Log log = new Log("ServerCommunicationThread");

	public ServerCommunicationThread(String userName, String hostName) {
		this.userName = userName;
		this.serverName = serverName;
	}

	public void run() {

		String inputFromServer;
		String answerToServer;

		// Verbindung zum Host herstellen
		try {
			socket = new Socket(serverName, 50000);

			outputStream = socket.getOutputStream();
			inputStream = socket.getInputStream();

			br = new BufferedReader(new InputStreamReader(inputStream));
			da = new DataOutputStream(outputStream);

		} catch (UnknownHostException e) {
			log.newWarning("Die Hostaddresse konnte nicht aufgeloesst werden");
			running = false;
		} catch (IOException e) {
			log.newWarning("Der Socket zu konnte nicht erstellt werden");
			running = false;
			return;
		}

		inputFromServer = "";
		answerToServer = "";

		// Neuen Nutzer anlegen
		try {
			writeToServer("NEW " + userName);
			
			inputFromServer = readFromServer();
			
			if(inputFromServer.indexOf("OK") != 0) {
				log.newWarning("userName nicht nutzbar");
				running = false;
			}
			
			//Alle WAIDPERIOD ms "INFO" an den Server schicken und die User-Liste erneuern
			while(running) {
				
				writeToServer("INFO");
				inputFromServer = readFromServer();
				String[] buffer = inputFromServer.split(" ");
				List<ChatUser> akku = new ArrayList<>();
				
				for(int i = 2; i < buffer.length; i = i + 2){
					akku.add(new ChatUser(buffer[i], buffer[i+1]));
				}
				
				main.refreshUserList(akku);
				
				try {
					this.wait(WAITPERIOD);
				} catch (InterruptedException e) {
					log.newWarning("Thread wurde unterbrochen");
				}
			}
			
		}

		catch (IOException e) {
			log.newWarning(e.getMessage());
		}

		//Serververbindung beenden
		try {
			writeToServer("BYE");
			answerToServer = readFromServer();
			if(answerToServer.indexOf("BYE") != 0) {
				log.newWarning("Server-Kommuinikation wurde nicht richtig beendet");
			}
			
			socket.close();
		} catch (IOException e) {
			log.newWarning("Socket konnte nicht erfolgreich geschlossen werden");
		}
	}
	
	private static void turnOff() {
		running = false;
	}

	private void writeToServer(String request) throws IOException {

		da.writeBytes(request + "\n");
		log.newInfo("Wrote to Server: " + request);
		System.out.println("Wrote to Server: " + request);

	}

	private String readFromServer() throws IOException {

		String request = br.readLine();
		log.newInfo("Server answer: " + request);
		System.out.println("Server answer: " + request);
		return request;

	}

}
