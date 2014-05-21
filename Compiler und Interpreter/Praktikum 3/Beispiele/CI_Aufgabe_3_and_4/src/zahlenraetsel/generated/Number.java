package zahlenraetsel.generated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.tree.Tree;

public class Number {
	char[] digits;
	int maxSize;

	public void setDigits(List<?extends Object> objects) {
		@SuppressWarnings("unchecked")
		List<Tree> tokens=(List<Tree>)objects;
		digits =new char[tokens.size()];
		for (int i = 0; i < tokens.size(); i++) {
			Tree tree = tokens.get(i);
			char c = Character.toLowerCase(tree.getText().charAt(0));
			digits[i] = c;
		}
	}
	
	public List<Character> getCharacters() {
		List<Character> number = new ArrayList<Character>();
		for (int i = maxSize - digits.length; i > 0; i--) {
			number.add(null);
		}
		for (int i = 0; i < digits.length; i++) {
			number.add(digits[i]);
		}
		return number;
	}

	public int getSize() {
		return digits.length;
	}
}
