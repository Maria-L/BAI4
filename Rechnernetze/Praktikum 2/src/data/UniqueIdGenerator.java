package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class UniqueIdGenerator {
	Integer currentNum;
	String fileName = "lastUniqueId.txt";
	
	public UniqueIdGenerator() {
		File f = new File(fileName);
		
		if(f.exists() && !f.isDirectory()) {
			try {
				BufferedReader input = new BufferedReader(new FileReader(f));
				currentNum = Integer.parseInt(input.readLine());
				input.close();
			}  catch (IOException e) {
				System.out.println(f.getName() + " konnte nicht gelesen werden - benutze 0 als Startwert");
				currentNum = new Integer(0);
			}
		} else {
			currentNum = new Integer(0);
		}
	}
	
	public String getId() {
		currentNum++;
		
		try {
			PrintWriter pw = new PrintWriter(fileName);
			pw.println(currentNum.toString());
			pw.flush();
			pw.close();
		} catch (IOException e) {
			System.out.println("Neue UniqueId konnte nicht geschrieben werden");
		}
		
		return currentNum.toString();
	}
}
