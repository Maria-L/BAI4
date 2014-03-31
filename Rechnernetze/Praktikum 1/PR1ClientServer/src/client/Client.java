package client;

import java.io.*;
import java.net.*;
import java.util.*;


public class Client {
	public static int port;
	public static String ip;
	
	private static Socket clientSocket;
	
	private static DataOutputStream out;
	private static BufferedReader in;
	
	private static boolean running = true;
	
	public static void main(String[] args) {
		Scanner scanFromUser = new Scanner(System.in);
		String inputFromUser = null;
		String inputFromServer = null;
		
		try {
			//Get IP Address from user
			System.out.println("\nEnter an IP-Address, Sir!\n");
			inputFromUser = scanFromUser.nextLine();
			ip = inputFromUser;
			
			//Get port from user
			System.out.println("\nEnter a Port\n");
			inputFromUser = scanFromUser.nextLine();
			port = Integer.valueOf(inputFromUser);
			
			//Connect to socket
			clientSocket = new Socket(ip, port);
			
			//Initialice Streams
			out = new DataOutputStream(clientSocket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			
			//Communication with Server
			while(running) {
				//Get input from User
				System.out.println("\nNow enter greetings to our emperor\n");
				inputFromUser = scanFromUser.nextLine();
				
				//Send String to Server
				writeToServer(inputFromUser);
				
				//Get answer from Server
				inputFromServer = readFromServer();
				
				if(inputFromServer.indexOf("QUIT") > -1) {
					running = false;
				}
			}
			
			clientSocket.close();
			
		} catch (IOException e) {
			System.out.println("Connection failed: " + e.toString());
		}
	}
	
	private static void writeToServer(String request) throws IOException {
		out.writeBytes(request + '\n');
	}
	
	private static String readFromServer() throws IOException {
		String reply = in.readLine();
		System.out.println("\nServer Answer: " + reply + "\n");
		return reply;
	}
}
