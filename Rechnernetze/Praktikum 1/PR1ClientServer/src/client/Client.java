package client;

import java.io.*;
import java.net.*;
import java.util.*;


public class Client {

	public static int port;
	public static String host;

	private static Socket clientSocket;
	private static OutputStream outputStream;
	private static InputStream inputStream;

	private static boolean running = true;

	public static void main(String[] args) {
		Scanner scanFromUser = new Scanner(System.in);
		String inputFromUser = null;
		String inputFromServer = null;

		try {
			// Get IP Address from user
			System.out.println("\nEnter an IP-Address, Sir!\n");
			inputFromUser = scanFromUser.nextLine();
			host = inputFromUser;
			
			// Get port from user
			System.out.println("\nEnter a Port\n");
			inputFromUser = scanFromUser.nextLine();
			port = Integer.valueOf(inputFromUser);

			// Connect to socket
			clientSocket = new Socket(host, port);

			// Initialize streams
			outputStream = clientSocket.getOutputStream();
			inputStream = clientSocket.getInputStream();
			
			
			// Communication with Server
			while (running) {
				// Get input from User
				if (!clientSocket.isConnected()) {
					System.out.println("\nYour emperor is annoyed!\n");
					break;
				}

				System.out.println("\nNow enter greetings to our emperor\n");
				inputFromUser = scanFromUser.nextLine();

				// Send String to Server
				writeToServer(inputFromUser);

				// Get answer from Server
				inputFromServer = readFromServer();
				inputFromServer = inputFromServer.trim();
				
				if(inputFromServer.equals("BYE") 
						|| inputFromUser.indexOf("SHUTDOWN") == 0 && inputFromServer.equals("OK")) {
					running = false;
				}
			}
			
			if (clientSocket.isConnected()) {
				clientSocket.close();
			}

		} catch (IOException e) {
			System.out.println("Connection failed: " + e.toString());
		}
	}
	
	private static void writeToServer(String request) throws IOException {
		byte[] byteArray = (request + "\n").getBytes("UTF-8");
		
		outputStream.write(byteArray, 0, byteArray.length);
	}
	
	private static String readFromServer() throws IOException {
		int read;
		String request;
		byte[] byteArray = new byte[255];
		boolean flag = true;
		
		
		for(int i = 0; i < 255 && flag == true; i++) {
			read = inputStream.read();

			if(read == 10 || read == -1) {
				flag = false;
			} else {
				byteArray[i] = (byte) read; 
			}
		}
		
		if(flag) {
			request = "ERROR Message too long";
			inputStream.skip(inputStream.available());
		} else {
			request =  new String(byteArray, "UTF-8");
		}

		System.out.println("Server answer: " + request);
		return request;
	}
}
