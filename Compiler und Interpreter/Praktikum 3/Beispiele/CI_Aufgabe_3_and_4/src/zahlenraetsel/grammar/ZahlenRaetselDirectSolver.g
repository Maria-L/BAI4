tree grammar ZahlenRaetselDirectSolver;


options {
  language = Java;
  tokenVocab = Zahlenraetsel;
  ASTLabelType = CommonTree;
}
@header { 
package zahlenraetsel.generated;
import java.util.Map;
import java.util.HashMap;
import zahlenraetsel.main.DirectSolver;
}

raetsel returns [ Map<String, Integer> ergebnis] :
{
DirectSolver directSolver=new DirectSolver();
} 
^(RAETSEL (equ[directSolver])+){ 
$ergebnis=directSolver.solve();};

equ[DirectSolver directSolver]
@after { 
$directSolver.addConstraint($n1.number.getCharacters(), $n2.number.getCharacters(), $n3.number.getCharacters());
}:
^(GLEICH n1=number n2=number n3=number) ;

number returns [Number number]
@after { 
$number = new Number();
$number.setDigits($syms);
}
:^(NUMBER syms+=SYMBOL+);
