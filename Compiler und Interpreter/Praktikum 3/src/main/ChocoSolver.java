package main;

import choco.Choco;
import choco.cp.model.CPModel;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;


public class ChocoSolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3;
		int M = n * (n * n + 1) / 2;
		
		Model m = new CPModel();
		
		IntegerVariable [][] cells = new IntegerVariable[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				cells[i][j] = Choco.makeIntVar("cell" + j, 1, n*n);
				m.addVariables(cells[i][j]);
			}
		}
		
		Constraint[] rows = new Constraint[n];
		for(int i = 0; i < n; i++) {
			rows[i] = Choco.eq(Choco.sum(cells[i]), M);
		}
		
		m.addConstraints(rows);
		
		IntegerVariable[][] cellsDual = new IntegerVariable[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
					cellsDual[i][j] = cells[j][i];
			}
		}
		
		Constraint[] cols = new Constraint[n];
		for(int i = 0; i < n; i++) {
			cols[i] = Choco.eq(Choco.sum(cellsDual[i]), M);
		}
		
		m.addConstraints(cols);
		
		IntegerVariable[][] diags = new IntegerVariable[2][n];
		for(int i = 0; i < n; i++){
			diags[0][i] = cells[i][i];
			diags[1][i] = cells[i][(n-1)-i];
		}
		
		m.addConstraint(Choco.eq(Choco.sum(diags[0]), M));
		m.addConstraint(Choco.eq(Choco.sum(diags[1]), M));
		
		IntegerVariable[] allVars = new IntegerVariable[n*n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
					allVars[i*n+j] = cells[i][j];
			}
		}
		
		m.addConstraint(Choco.allDifferent(allVars));
		
		
		Solver s = new CPSolver();
	}

}
