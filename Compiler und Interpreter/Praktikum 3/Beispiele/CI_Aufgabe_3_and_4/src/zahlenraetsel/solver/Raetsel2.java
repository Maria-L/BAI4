package zahlenraetsel.solver;
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


public class Raetsel2 {
  public static void main(String[] args) throws IOException{
        FileInputStream fstream = new FileInputStream("./src/zahlenraetsel/main/raetsel2.txt");
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

  
    model.addConstraint(Choco.allDifferent(f, g, d, e, b, c, a));
    
     addConstraint(
            Arrays.asList(a, b, c), 
            Arrays.asList(d, d, e), 
            Arrays.asList(f, c, f), 
            model
            );
      

     addConstraint(
            Arrays.asList(f, c, f), 
            Arrays.asList(b, c, a), 
            Arrays.asList(d, g, a, e), 
            model
            );
      

     addConstraint(
            Arrays.asList(a, b, c), 
            Arrays.asList(c, b), 
            Arrays.asList(a, e, e), 
            model
            );
      

     addConstraint(
            Arrays.asList(d, d, e), 
            Arrays.asList(b, g, e), 
            Arrays.asList(c, b, g), 
            model
            );
      

     addConstraint(
            Arrays.asList(c, b), 
            Arrays.asList(b, g, e), 
            Arrays.asList(b, c, a), 
            model
            );
      

     addConstraint(
            Arrays.asList(a, e, e), 
            Arrays.asList(c, b, g), 
            Arrays.asList(d, g, a, e), 
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