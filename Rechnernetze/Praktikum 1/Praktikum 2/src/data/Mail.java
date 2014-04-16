package data;


public class Mail {
	String text;
	boolean toDelete;
	
	public Mail (String text) {
		this.text = text;
		toDelete = false;
	}
	
	public String getText() {
		return this.text;
	}
	
	public boolean toDelete() {
		return toDelete;
	}
}
