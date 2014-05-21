package main;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;


public class ChocoSolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Model m = new CPModel();
		
		IntegerVariable d = Choco.makeIntVar("d", 0, 9);
		IntegerVariable o = Choco.makeIntVar("o", 0, 9);
		IntegerVariable n = Choco.makeIntVar("n", 0, 9);
		IntegerVariable a = Choco.makeIntVar("a", 0, 9);
		IntegerVariable l = Choco.makeIntVar("l", 0, 9);
		IntegerVariable g = Choco.makeIntVar("g", 0, 9);
		IntegerVariable e = Choco.makeIntVar("e", 0, 9);
		IntegerVariable r = Choco.makeIntVar("r", 0, 9);
		IntegerVariable b = Choco.makeIntVar("b", 0, 9);
		IntegerVariable t = Choco.makeIntVar("t", 0, 9);
		
		m.addConstraint(Choco.eq(Choco.mod(Choco.sum(d, d), 10), t));
	}
}
