package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import data.ChatUser;

public class SendMessageThread extends Thread {
	
	static boolean running = true;
	private String userName;
	private String host;
	private String message;
	private DatagramSocket socket;

	public SendMessageThread(ChatUser user, DatagramSocket socket, String message) {
		this.userName = user.getUserName();
		this.message = message;
		this.socket = socket;
		this.host = user.getHost();
	}
	
	public synchronized void run() {
		
		byte[] answerToServer;
		
		message = userName + ": " + message;
		answerToServer = message.getBytes();
		
		for(ChatUser u : main.getUserList()) {
			try {
				DatagramPacket sendPacket = new DatagramPacket(answerToServer, answerToServer.length, InetAddress.getByName(host), 50001);
				socket.send(sendPacket);
			} catch (IOException e) {
				System.out.println("Nachricht an "+ socket + " konnte nicht versandt werden");
			}
		}
	}

}