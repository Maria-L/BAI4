package zahlenraetsel.main;

public class Sniplett {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="zahlenraetsel.solver.Raetsel";
		System.out.println(str.substring(0, str.lastIndexOf(".")));
		System.out.println(str.substring(str.lastIndexOf(".")+1, str.length()));
	}

}
