
import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class ChocoSolver2 {

	/**
	 * Aus dem Choco2 Tutorial
	 */
	public static void solve() {
		
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
		
		// Carries
		IntegerVariable carry1 = Choco.makeIntVar("c1" , 0, 1, Options.V_BOUND);
		IntegerVariable carry2 = Choco.makeIntVar("c2" , 0, 1, Options.V_BOUND);
		IntegerVariable carry3 = Choco.makeIntVar("c3" , 0, 1, Options.V_BOUND);
		IntegerVariable carry4 = Choco.makeIntVar("c4" , 0, 1, Options.V_BOUND);
		IntegerVariable carry5 = Choco.makeIntVar("c5" , 0, 1, Options.V_BOUND);
		IntegerVariable carry6 = Choco.makeIntVar("c6" , 0, 1, Options.V_BOUND);
		
		// Declare every name as a variable
		IntegerVariable donald = Choco.makeIntVar("donald", 0, 1000000, Options.V_BOUND);
		IntegerVariable gerald = Choco.makeIntVar("gerald", 0, 1000000, Options.V_BOUND);
		IntegerVariable robert = Choco.makeIntVar("robert", 0, 1000000, Options.V_BOUND);
		
		// Array of coefficients
		int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};
		
		// Declare every combination of letter as an integer expression
		IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d, o, n, a, l, d}, c);
		IntegerExpressionVariable geraldLetters = Choco.scalar(new IntegerVariable[]{g, e, r, a, l, d}, c);
		IntegerExpressionVariable robertLetters = Choco.scalar(new IntegerVariable[]{r, o, b, e, r, t}, c);
		
		// Add equality between name and letters combination
		/*model.addConstraint(Choco.eq(donaldLetters, donald));
		model.addConstraint(Choco.eq(geraldLetters, gerald));
		model.addConstraint(Choco.eq(robertLetters, robert));*/
		
		// a + b + c1 - e + (c2 * 10) = 0
		// Alternative: a + b + c1 (mod 10) = e; c2 = floor( (a + b + c1) / 10 )
		Constraint c1 = Choco.eq( Choco.minus( Choco.plus( carry1, Choco.plus(d, d) ), Choco.plus(t, Choco.mult(carry2, 10)) ), 0 );
		Constraint c2 = Choco.eq( Choco.minus( Choco.plus( carry2, Choco.plus(l, l) ), Choco.plus(r, Choco.mult(carry3, 10)) ), 0 );
		Constraint c3 = Choco.eq( Choco.minus( Choco.plus( carry3, Choco.plus(a, a) ), Choco.plus(e, Choco.mult(carry4, 10)) ), 0 );
		Constraint c4 = Choco.eq( Choco.minus( Choco.plus( carry4, Choco.plus(n, r) ), Choco.plus(b, Choco.mult(carry5, 10)) ), 0 );
		Constraint c5 = Choco.eq( Choco.minus( Choco.plus( carry5, Choco.plus(o, e) ), Choco.plus(o, Choco.mult(carry6, 10)) ), 0 );
		Constraint c6 = Choco.eq( Choco.minus( Choco.plus( carry6, Choco.plus(d, g) ), Choco.plus(r, Choco.mult(carry1, 10)) ), 0 );
		
		model.addConstraint( c1, c2 ,c3, c4, c5, c6);
		
		// Add constraint name sum
		model.addConstraint(Choco.eq(Choco.plus(donald, gerald), robert));
		
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
