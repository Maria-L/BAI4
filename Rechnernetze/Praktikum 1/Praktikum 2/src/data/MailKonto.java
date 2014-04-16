package data;


public class MailKonto {
	String user;
	String passwort;
	String serverAddresse;
	int port;
	
	public MailKonto(String user, String passwort, String serverAddresse, int port) {
		this.user = user;
		this.passwort = passwort;
		this.serverAddresse = serverAddresse;
		this.port = port;
	}
	
	public String user() {
		return this.user;
	}
	
	public String passwort() {
		return this.passwort;
	}
	
	public String serverAddresse() {
		return this.serverAddresse;
	}
	
	public int port() {
		return this.port();
	}
}
