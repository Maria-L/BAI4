package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import data.ChatUser;

public class SendMessageThread extends Thread {
	
	private final int MAXMESSAGELENGTH = 100;
	
	static boolean running = true;
	private String userName;
	private String message;
	private DatagramSocket socket;

	public SendMessageThread(ChatUser user, DatagramSocket socket, String message) {
		this.userName = user.getUserName();
		this.message = message;
		this.socket = socket;
		}
	
	public synchronized void run() throws IllegalArgumentException {
		
		if(message.length() > MAXMESSAGELENGTH) {
			throw new IllegalArgumentException("Die eingegebene Nachricht ist zu lang.");
		}
		
		byte[] answerToServer;
		
		message = userName + ": " + message;
		answerToServer = message.getBytes();
		
		for(ChatUser u : ChatClientMain.getUserList()) {
			try {
				DatagramPacket sendPacket = new DatagramPacket(answerToServer, answerToServer.length, InetAddress.getByName(u.getHost()), 50001);
				socket.send(sendPacket);
			} catch (IOException e) {
				System.out.println("Nachricht an "+ socket + " konnte nicht versandt werden");
			}
		}
	}

}