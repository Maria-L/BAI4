
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Starte:");
		System.out.println("Solver 1 - default:");
		ChocoSolver1.solve();
		System.out.println("Solver 2 - columnwise:");
		ChocoSolver2.solve();
	}

}
