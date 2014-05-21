package choco;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.kernel.solver.variables.integer.IntDomainVar;

public class UnserDing {
	
	public void derShit(){
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
		
		int[] u = new int[]{0,1};
		
		IntegerVariable u1 = Choco.makeIntVar("u1", u, Options.V_ENUM);
		IntegerVariable u2 = Choco.makeIntVar("u2", u, Options.V_ENUM);
		IntegerVariable u3 = Choco.makeIntVar("u3", u, Options.V_ENUM);
		IntegerVariable u4 = Choco.makeIntVar("u4", u, Options.V_ENUM);
		IntegerVariable u5 = Choco.makeIntVar("u5", u, Options.V_ENUM);
		
		// Declare every name as a variable
		IntegerVariable donald = Choco.makeIntVar("donald", 0, 1000000, Options.V_BOUND);
		IntegerVariable gerald = Choco.makeIntVar("gerald", 0, 1000000, Options.V_BOUND);
		IntegerVariable robert = Choco.makeIntVar("robert", 0, 1000000, Options.V_BOUND);
		
		// Array of coefficients
//		int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};
//		
//		// Declare every combination of letter as an integer expression
//		IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d, o, n, a, l, d}, c);
//		IntegerExpressionVariable geraldLetters = Choco.scalar(new IntegerVariable[]{g, e, r, a, l, d}, c);
//		IntegerExpressionVariable robertLetters = Choco.scalar(new IntegerVariable[]{r, o, b, e, r, t}, c);
//		
//		// Add equality between name and letters combination
//		model.addConstraint(Choco.eq(donaldLetters, donald));
//		model.addConstraint(Choco.eq(geraldLetters, gerald));
//		model.addConstraint(Choco.eq(robertLetters, robert));
//		
//		// Add constraint name sum
//		model.addConstraint(Choco.eq(Choco.plus(donald, gerald), robert));
		
		model.addConstraint(Choco.eq(Choco.plus(d, d), Choco.plus(Choco.mult(u1, 10),t)));
		model.addConstraint(Choco.eq(Choco.plus(u1, Choco.plus(l, l)), Choco.plus(Choco.mult(u2, 10),r)));
		// a + a = e daraus folgt a = 5
		model.addConstraint(Choco.eq(Choco.plus(u2, Choco.plus(a, a)), Choco.plus(Choco.mult(u3, 10),e)));
		model.addConstraint(Choco.eq(Choco.plus(u3, Choco.plus(n, r)), Choco.plus(Choco.mult(u4, 10),b)));
		// o + e = o daraus folgt e = 0
		model.addConstraint(Choco.eq(Choco.plus(u4, Choco.plus(o, e)), Choco.plus(Choco.mult(u5, 10),o)));
		model.addConstraint(Choco.eq(Choco.plus(u5, Choco.plus(d, g)), r));
		// Add constraint of all different letters.
		model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
		
		// Build a solver, read the model and solve it
		Solver s = new CPSolver();
		s.read(model);
		s.solve();
		
		// Print name value
		
		
		IntDomainVar[] ary = s.getVar(d,o,n,a,l,d);
		StringBuilder sb = new StringBuilder().append("donald = ");
		for (IntDomainVar i : ary)
		{
			sb.append(i.getVal());
		}
		System.out.println(sb);
		ary = s.getVar(g,e,r,a,l,d);
		sb = new StringBuilder().append("gerald = ");
		for (IntDomainVar i : ary)
		{
			sb.append(i.getVal());
		}
		System.out.println(sb);
		ary = s.getVar(r,o,b,e,r,t);
		sb = new StringBuilder().append("robert = ");
		for (IntDomainVar i : ary)
		{
			sb.append(i.getVal());
		}
		System.out.println(sb);
		
		
		
//		System.out.println("gerald = " + s.getVar(gerald).getVal());
//		System.out.println("robert = " + s.getVar(robert).getVal());
	}

}
