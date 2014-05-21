package chocoSolver.aufgabe3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.kernel.solver.variables.integer.IntDomainVar;


public class SymbolSolver {

	public static void main(String[] args) {
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
		
		model.addConstraint(Choco.allDifferent(d,o,n,a,l,g,e,r,b,t));
		
		addConstraint(
				Arrays.asList(d,o,n,a,l,d), 
				Arrays.asList(g,e,r,a,l,d), 
				Arrays.asList(r,o,b,e,r,t), 
				model
				);
		
		// Build a solver, read the model and solve it
		Solver s = new CPSolver();
		s.read(model);
		s.solve();
		Iterator<IntDomainVar> it=s.getIntVarIterator();
		while(it.hasNext()){
			IntDomainVar var=it.next();
			System.out.println(var.getName() + " " +var.getVal());
		}
		}
	private static void addConstraint(List<IntegerVariable> summand1, List<IntegerVariable> summand2, List<IntegerVariable> summe, Model model){
		Collections.reverse(summand1);
		Collections.reverse(summand2);
		Collections.reverse(summe);
		Iterator<IntegerVariable> itSummand1=summand1.iterator();
		Iterator<IntegerVariable> itSummand2=summand2.iterator();
		Iterator<IntegerVariable> itSumme=summe.iterator();
		IntegerExpressionVariable uebertrag=Choco.constant(0);
		while(itSummand1.hasNext() || itSummand2.hasNext() ){
			IntegerExpressionVariable zifferReihe1=(itSummand1.hasNext() ? itSummand1.next() : Choco.constant(0));
			IntegerExpressionVariable zifferReihe2=(itSummand2.hasNext() ? itSummand2.next() : Choco.constant(0));
			IntegerExpressionVariable zifferSumme=itSumme.next();
			
			IntegerExpressionVariable  sp1=Choco.mod( Choco.sum(zifferReihe1,zifferReihe2, uebertrag),10);
			model.addConstraint(Choco.eq(zifferSumme, sp1));
			uebertrag=Choco.div(Choco.sum(zifferReihe1,zifferReihe2, uebertrag),10);
		}
		if(itSumme.hasNext()){
			IntegerExpressionVariable zifferSumme=itSumme.next();
			model.addConstraint(Choco.eq(zifferSumme,uebertrag));
		}
		else{
			model.addConstraint(Choco.eq(0,uebertrag));
		}
		
	}
}
