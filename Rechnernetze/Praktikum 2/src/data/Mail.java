package data;


public class Mail {
	String text;
	String uniqueId;
	boolean toDelete;
	
	public Mail (String text, String uniqueId) {
		this.text = text;
		this.toDelete = false;
		this.uniqueId = uniqueId;
	}
	
	public String getText() {
		return this.text;
	}
	
	public String getId() {
		return uniqueId;
	}
	
	public boolean toDelete() {
		return toDelete;
	}
	
	public void delete() {
		this.toDelete = true;
	}
	
	public void undelete() {
		this.toDelete = false;
	}
	
	public int length() {
		return text.length();
	}
}
