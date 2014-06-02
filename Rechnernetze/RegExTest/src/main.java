import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {
	
	private static Pattern userNamePattern = Pattern.compile(".*[^a-z0-9A-Z]+.*");

	public static void main(String[] args) {
		
		String argument = "?=!$";
		
		
		Matcher m = userNamePattern.matcher(argument);
		
		System.out.println(m.matches());

	}

}
