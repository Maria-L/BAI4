package data;

public class UniqueIdGenerator {
	Integer currentNum;
	
	public UniqueIdGenerator() {
		currentNum = new Integer(0);
	}
	
	public String getId() {
		currentNum++;
		return currentNum.toString();
	}
}
