package choco;

import java.util.Iterator;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.kernel.solver.variables.integer.IntDomainVar;

public class RowSolutionLettersOnly {

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
		Iterator<IntDomainVar> it=s.getIntVarIterator();
		while(it.hasNext()){
			IntDomainVar var=it.next();
			System.out.println(var.getName() + " = " +var.getVal());
		}
		}
}
