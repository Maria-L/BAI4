package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import data.ChatUser;
import data.Log;

public class ChatServer {
	private static final int MAX_THREADS = 30;
	private static final int WAITING_TIME_MS = 500;
	public static int port = 50000;
		
	private static ServerSocket welcomeSocket;
	private static int threadNameCounter = 0;
	private static volatile int threadCounter = 0;
	private static volatile boolean serverRunning = true;
	
	private static Log log = new Log("ChatServerLog");
	private static volatile List<ChatUser> userList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		System.out.println("ChatServerMain");
		
		welcomeSocket = null;
		Socket connectionSocket = null;
	
		log.newInfo("Der Chat-Server laeuft auf TCP-Port " + port);
	
		try {
			welcomeSocket = new ServerSocket(port);
			welcomeSocket.setSoTimeout(WAITING_TIME_MS);
		
			while(serverRunning) {
				try {
					connectionSocket = welcomeSocket.accept();
					
					if (threadCounter >= MAX_THREADS || !serverRunning) {
						connectionSocket.close();
					} else  {
						incrementThreadCounter();
						(new ChatServerClientThread(++threadNameCounter, connectionSocket)).start();
					}
					
				} catch (SocketTimeoutException e) {
					//System.out.println("Waiting...");
				}
			}
			
			welcomeSocket.close(); 		
				
			while (threadCounter > 0) {
				System.out.println("Number of Threads: " + threadCounter); 
				try {
					Thread.currentThread();
					Thread.sleep(WAITING_TIME_MS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			log.newWarning(e.getMessage());
		}
	}
	

	public static void decrementThreadCounter() {
		threadCounter--;
	}
	
	public static void incrementThreadCounter() {
		threadCounter++;
	}
	
	public static void addUser(String userName, String host) {
		userList.add(new ChatUser(userName, host));
	}
	
	public static void deleteUser(String userName) {
		List<ChatUser> mirror = new ArrayList<ChatUser>(userList);
		for(ChatUser u : mirror) {
			if(u.getUserName().equals(userName)) {
				userList.remove(u);
				break;
			}
		}
	}
	
	public static int getUserCount() {
		return userList.size();
	}
	
	public static List<ChatUser> getUserList() {
		return userList;
	}
}

