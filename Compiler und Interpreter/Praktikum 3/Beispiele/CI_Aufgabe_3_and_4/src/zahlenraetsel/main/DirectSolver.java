package zahlenraetsel.main;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.kernel.solver.variables.integer.IntDomainVar;


public class DirectSolver {
	
  private Model model;
  private Map<Character, IntegerVariable> integervars=new HashMap<>();
  
  public DirectSolver(){
	  model=new CPModel();
  }
  
  public Map<String, Integer> solve() {

    model.addConstraint(Choco.allDifferent(integervars.values().toArray(new IntegerVariable[integervars.size()])));
    
     
    // Build a solver, read the model and solve it
    Solver s = new CPSolver();
    s.read(model);
    s.solve();
    
    Map<String, Integer> resultMap=new HashMap<String, Integer>();;
    Iterator <IntDomainVar> it=s.getIntVarIterator();
    while(it.hasNext()){
      IntDomainVar var=it.next();
      resultMap.put(var.getName(), var.getVal());
    }
    return resultMap;
    }
  
  
 
  public void addConstraint(List<Character> summand1, List<Character> summand2, List<Character> summe){
	  addConstraintWithIntegerVariables(convertToIntegerVariableList(summand1), convertToIntegerVariableList(summand2), convertToIntegerVariableList(summe));
	  
  }
  private void addConstraintWithIntegerVariables(List<IntegerVariable> summand1, List <IntegerVariable> summand2, List<IntegerVariable> summe){
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
  private IntegerVariable createOrfind(Character chr){
	  IntegerVariable intvar= integervars.get(chr);
	  if(intvar==null){
		  intvar=Choco.makeIntVar(chr.toString(), 0, 9, Options.V_ENUM); 
		  integervars.put(chr, intvar);
	  }
	  return intvar;
  }
  private List<IntegerVariable> convertToIntegerVariableList(List<Character> characterList){
	  List<IntegerVariable> intvarList=new ArrayList<>();
	  for(Character chr:characterList){
		  intvarList.add(createOrfind(chr));
	  }
	  return intvarList;
  }
}