package data;

import java.net.Socket;

public class ChatUser {
	private String userName;
	private String host;
	
	
	public ChatUser(String name, String socket) {
		this.userName = name;
		this.host = socket;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getHost() {
		return host;
	}
}
