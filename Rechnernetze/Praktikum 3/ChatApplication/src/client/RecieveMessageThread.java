package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecieveMessageThread extends Thread {
	private final int BUFFER_SIZE = 130;
	
	private DatagramSocket socket;
	private static boolean running = true;
	private String answerFromClient;
	
	public RecieveMessageThread(DatagramSocket socket) {
		this.socket = socket;
	}

	public void run() {
		while(running) {
			try {
				answerFromClient = "";
				
				byte[] recieveData = new byte[BUFFER_SIZE];
				DatagramPacket recievePacket = new DatagramPacket(recieveData, BUFFER_SIZE);
				
				socket.receive(recievePacket);
				answerFromClient = new String(recievePacket.getData(), 0, recievePacket.getLength());
				
				main.addMessage(answerFromClient);
			} catch (IOException e) {
				System.out.println("Nachricht konnte nicht empfangen werden");
			}
		}
	}
	
	private static void turnOff() {
		running = false;
	}

}
