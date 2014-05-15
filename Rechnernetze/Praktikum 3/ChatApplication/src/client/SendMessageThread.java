package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

import data.ChatUser;

public class SendMessageThread extends Thread {
	
	private DatagramSocket socket;
	static boolean running = true;
	private String userName;
	private String message;
	private DatagramSocket host;

	public SendMessageThread(String userName, DatagramSocket host, String message) {
		this.userName = userName;
		this.message = message;
		this.host = host;
	}
	
	public void run() {
		
		byte[] answerToServer;
		
		try {
			socket = new DatagramSocket();
		} catch (IOException e) {
			System.out.println("Der Socket konnte nicht erstellt werden");
			running = false;
		}
		
		message = userName + ": " + message;
		answerToServer = message.getBytes();
		
		for(ChatUser u : main.getUserList()) {
			try {
				DatagramPacket sendPacket = new DatagramPacket(answerToServer, answerToServer.length, host.getInetAddress(), 50001);
				socket.send(sendPacket);
			} catch (IOException e) {
				System.out.println("Nachricht an "+ host + " konnte nicht versandt werden");
			}
		}
	}

}