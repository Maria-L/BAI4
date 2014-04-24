package data;


public class MailKonto {
	String user;
	String passwort;
	String serverAddresse;
	int port;
	
	/**
	 * Stellt ein Mail-Konto mit Benutzerdaten und Addresse des Servers dar
	 * 
	 * @param user Benutzername für das Mailkonto
	 * @param passwort Passwort für das Mailkonto
	 * @param serverAddresse Addresse des Mail-Servers (bsp www.web.de oder 217.72.192.251)
	 * @param port Port des POP3 Servers (bsp 995)
	 */
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
		return this.port;
	}
}
