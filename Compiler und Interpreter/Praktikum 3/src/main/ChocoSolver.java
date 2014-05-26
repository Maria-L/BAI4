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
		
		IntegerVariable c1 = Choco.makeIntVar("c1", 0, 1);
		IntegerVariable c2 = Choco.makeIntVar("c2", 0, 1);
		IntegerVariable c3 = Choco.makeIntVar("c3", 0, 1);
		IntegerVariable c4 = Choco.makeIntVar("c4", 0, 1);
		IntegerVariable c5 = Choco.makeIntVar("c5", 0, 1);
		
		
		m.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
		
		m.addConstraint(Choco.eq(Choco.mod(Choco.sum(d, d), 10), t));
		m.addConstraint(Choco.ifThenElse(Choco.leq(Choco.sum(d, d), 9), 
				Choco.eq(c1, 0),
				Choco.eq(c1, 1)));
		
		m.addConstraint(Choco.eq(Choco.mod(Choco.sum(l, l, c1), 10), r));
		m.addConstraint(Choco.ifThenElse(Choco.leq(Choco.sum(l, l, c1), 9), 
				Choco.eq(c2, 0), 
				Choco.eq(c2, 1)));
		
		m.addConstraint(Choco.eq(Choco.mod(Choco.sum(a, a, c2), 10), e));
		m.addConstraint(Choco.ifThenElse(Choco.leq(Choco.sum(a, a, c2), 9), 
				Choco.eq(c3, 0), 
				Choco.eq(c3, 1)));
		
		m.addConstraint(Choco.eq(Choco.mod(Choco.sum(n, r, c3), 10), b));
		m.addConstraint(Choco.ifThenElse(Choco.leq(Choco.sum(n, r, c3), 9), 
				Choco.eq(c4, 0), 
				Choco.eq(c4, 1)));
		
		m.addConstraint(Choco.eq(Choco.mod(Choco.sum(o, e, c4), 10), o));
		m.addConstraint(Choco.ifThenElse(Choco.leq(Choco.sum(o, e, c4), 9), 
				Choco.eq(c5, 0), 
				Choco.eq(c5, 1)));
		
		m.addConstraint(Choco.eq(Choco.mod(Choco.sum(d, g, c5), 10), r));
		m.addConstraint(Choco.leq(Choco.sum(d, g, c5), 9));
		
		Solver s = new CPSolver();
		s.read(m);
		s.solve();
		
		System.out.println("donald = " + s.getVar(d).getVal() + s.getVar(o).getVal() + s.getVar(n).getVal() + s.getVar(a).getVal() + s.getVar(l).getVal() + s.getVar(d).getVal()); 
		System.out.println("gerald = " + s.getVar(g).getVal() + s.getVar(e).getVal() + s.getVar(r).getVal() + s.getVar(a).getVal() + s.getVar(l).getVal() + s.getVar(d).getVal()); 
		System.out.println("robert = " + s.getVar(r).getVal() + s.getVar(o).getVal() + s.getVar(b).getVal() + s.getVar(e).getVal() + s.getVar(r).getVal() + s.getVar(t).getVal()); 
	}
}
