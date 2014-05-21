package main;

import choco.RowSolution;
import choco.RowSolutionLettersOnly;
import choco.TutorialSolution;
import choco.TutorialSolutionLettersOnly;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Gegebene Lösung aus Tutorial");
		TutorialSolution tutorial = new TutorialSolution();
		tutorial.solve();
		
		System.out.println("\nAbgeändert nur mit Letter Variablen");
		TutorialSolutionLettersOnly tutorial2 = new TutorialSolutionLettersOnly();
		tutorial2.solve();
		
		System.out.println("\nEigene Spaltenweise Lösung");
		RowSolution solution = new RowSolution();
		solution.solve();
		
		System.out.println("\nEigene Spaltenweise Lösung nur mit Letter Variablen");
		RowSolutionLettersOnly solutionLettersOnly = new RowSolutionLettersOnly();
		solutionLettersOnly.solve();
	}

}
