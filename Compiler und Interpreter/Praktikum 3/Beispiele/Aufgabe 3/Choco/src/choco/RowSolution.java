package choco;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class RowSolution {

	public void solve() {
		// Build model
		Model model = new CPModel();
		
		// Declare every letter as a variable
		IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
		IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
		IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
		IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
		IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
		IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
		IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
		IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
		IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
		IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);
		
		//Declare Carry for every Position
		IntegerVariable carry1 = Choco.constant(0);
		IntegerVariable carry2 = Choco.makeIntVar("carry2", 0, 1, Options.V_ENUM);
		IntegerVariable carry3 = Choco.makeIntVar("carry3", 0, 1, Options.V_ENUM);
		IntegerVariable carry4 = Choco.makeIntVar("carry4", 0, 1, Options.V_ENUM);
		IntegerVariable carry5 = Choco.makeIntVar("carry5", 0, 1, Options.V_ENUM);
		IntegerVariable carry6 = Choco.makeIntVar("carry6", 0, 1, Options.V_ENUM);
		
		
		// Declare every name as a variable
		IntegerVariable donald = Choco.makeIntVar("donald", 0, 1000000, Options.V_BOUND);
		IntegerVariable gerald = Choco.makeIntVar("gerald", 0, 1000000, Options.V_BOUND);
		IntegerVariable robert = Choco.makeIntVar("robert", 0, 1000000, Options.V_BOUND);
		
		// Array of coefficients
		int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};
		
		// Declare every combination of letter as an integer expression
		IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d, o, n, a,
		l, d}, c);
		IntegerExpressionVariable geraldLetters = Choco.scalar(new IntegerVariable[]{g, e, r, a,
		l, d}, c);
		IntegerExpressionVariable robertLetters = Choco.scalar(new IntegerVariable[]{r, o, b, e,
		r, t}, c);
		
		// Add equality between name and letters combination
		model.addConstraint(Choco.eq(donaldLetters, donald));
		model.addConstraint(Choco.eq(geraldLetters, gerald));
		model.addConstraint(Choco.eq(robertLetters, robert));
		
		//Constraint net
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(d, d), 0), Choco.plus(t, Choco.mult(carry2, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(l, l), carry2), Choco.plus(r, Choco.mult(carry3, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(a, a), carry3), Choco.plus(e, Choco.mult(carry4, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(n, r), carry4), Choco.plus(b, Choco.mult(carry5, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(o, e), carry5), Choco.plus(o, Choco.mult(carry6, 10))));
		model.addConstraint(Choco.eq(Choco.plus(Choco.plus(d, g), carry6), Choco.plus(r, Choco.mult(carry1, 10))));
		
		// Add constraint of all different letters.
		model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
		// Build a solver, read the model and solve it
		Solver s = new CPSolver();
		s.read(model);
		s.solve();
		// Print name value
		System.out.println("donald = " + s.getVar(donald).getVal());
		System.out.println("gerald = " + s.getVar(gerald).getVal());
		System.out.println("robert = " + s.getVar(robert).getVal());
		}
}
