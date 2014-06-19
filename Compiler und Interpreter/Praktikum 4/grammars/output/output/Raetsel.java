package output;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.kernel.solver.variables.integer.IntDomainVar;


public class Raetsel {
  public static void main(String[] args) throws IOException{
        FileInputStream fstream = new FileInputStream("raetsel.txt");
        DataInputStream in = new DataInputStream(fstream);
        StringBuilder strBuilder=new StringBuilder();
        int i=in.read();
        while(i!=-1){
          strBuilder.append((char)i);
          i=in.read();
        }
        in.close();
        String raetsel=strBuilder.toString();
        System.out.println(raetsel);
        
        raetsel=raetsel.toLowerCase();
        Map<String, Integer> solution=solve();
        for(Entry<String, Integer> entry:solution.entrySet()){
          
          raetsel=raetsel.replace(entry.getKey(),entry.getValue().toString());
        }
        System.out.println(raetsel);
  }
  
  public static Map<String, Integer> solve() {
    // Build model
    Model model = new CPModel();
    // Declare every letter as a variable
    IntegerVariable f = Choco.makeIntVar("f", 0, 9, Options.V_ENUM); 
    IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM); 
    IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM); 
    IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM); 
    IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM); 
    IntegerVariable c = Choco.makeIntVar("c", 0, 9, Options.V_ENUM); 
    IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM); 
    IntegerVariable j = Choco.makeIntVar("j", 0, 9, Options.V_ENUM); 
    IntegerVariable h = Choco.makeIntVar("h", 0, 9, Options.V_ENUM); 
    IntegerVariable i = Choco.makeIntVar("i", 0, 9, Options.V_ENUM); 

  
    model.addConstraint(Choco.allDifferent(f, g, d, e, b, c, a, j, h, i));
    
     addConstraint(
            Arrays.asList(g, i), 
            Arrays.asList(j, b, j), 
            Arrays.asList(j, f, d), 
            model
            );
      

     addConstraint(
            Arrays.asList(d, a, c), 
            Arrays.asList(h, f, c), 
            Arrays.asList(i, i, i), 
            model
            );
      

     addConstraint(
            Arrays.asList(a, h), 
            Arrays.asList(i, i, i), 
            Arrays.asList(j, b, j), 
            model
            );
      

     addConstraint(
            Arrays.asList(a, a, a), 
            Arrays.asList(a, h), 
            Arrays.asList(a, c, e), 
            model
            );
      

     addConstraint(
            Arrays.asList(a, c, e), 
            Arrays.asList(d, a, c), 
            Arrays.asList(j, f, d), 
            model
            );
      

     addConstraint(
            Arrays.asList(h, f, c), 
            Arrays.asList(g, i), 
            Arrays.asList(a, a, a), 
            model
            );
      
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
    
  private static void addConstraint(List<IntegerVariable> summand1, List <IntegerVariable> summand2, List<IntegerVariable> summe, Model model){
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