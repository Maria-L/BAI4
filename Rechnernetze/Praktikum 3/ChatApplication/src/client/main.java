package client;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

import data.ChatUser;
import data.Log;

public class main {
	private static final int MESSAGEMAX = 20;
	
	private static String userName = "";
	private static String hostAddresse = "";
	
	private static volatile List<ChatUser> userList = new ArrayList<ChatUser>();
	private static volatile List<String> recievedMessageList = new ArrayList<String>();
	
	static ServerCommunicationThread serverCommunicationThread = null;
	static RecieveMessageThread recieveMessageThread = null;
	
	private static Log log = new Log("ClientMainThread");
	
	public static void main(String[] args) {
		
		hostAddresse = javax.swing.JOptionPane.showInputDialog("Bitte geben sie die Hostaddresse des ChatServers an");
		userName = javax.swing.JOptionPane.showInputDialog("Bitte geben sie ihren Chat-Namen ein");
		
		DatagramSocket udpSocket = null;
		try {
			udpSocket = new DatagramSocket(50001);
		} catch (SocketException e) {
			log.newWarning("UDP-Socket konnte nicht erstellt werden - Beende");
			return;
		}
		
		serverCommunicationThread = new ServerCommunicationThread(userName, hostAddresse);
		recieveMessageThread = new RecieveMessageThread(udpSocket);
		
		serverCommunicationThread.start();
		recieveMessageThread.start();

	}

	public static void refreshUserList(List<ChatUser> users) {
		userList = new ArrayList<ChatUser>(users);
	}
	
	public static void addMessage(String m) {
		recievedMessageList.add(m);
		if(recievedMessageList.size() > MESSAGEMAX) {
			recievedMessageList.remove(0);
		}
	}
	
	public static List<ChatUser> getUserList() {
		return userList;
	}
	
	public static void terminate() {
		//####################### ??? #########################
	}
}
