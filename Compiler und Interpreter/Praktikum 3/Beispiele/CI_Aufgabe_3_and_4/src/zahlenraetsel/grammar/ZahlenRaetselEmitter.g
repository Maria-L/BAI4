tree grammar ZahlenRaetselEmitter;


options {
  	language = Java;
  	output = template;
  	tokenVocab = Zahlenraetsel;
  	ASTLabelType = CommonTree;
}
@header { 
	package zahlenraetsel.generated;
	import java.util.Set;
	import java.util.HashSet;
	import java.lang.Character;
}

raetsel [String packagePath, String className, String pathToPuzzleFile] 
	returns [Set<Character> letters, Set<String> constraints]
	:
	{
		$letters=new HashSet<Character>(); 
 		$constraints=new HashSet<String>();
	} 
	^(RAETSEL (eque=equ
        {
		$letters.addAll($eque.letters);
             	$constraints.add($eque.st.toString());
	}
            )+)
-> sums(constraints={$constraints}, letters={$letters}, package={$packagePath}, className={$className}, pathToPuzzleFile={$pathToPuzzleFile});

equ returns [Set<Character> letters]
@after { 
	$letters = new HashSet<Character>();
	$letters.addAll($n1.number.getCharacters());
	$letters.addAll($n2.number.getCharacters());
	$letters.addAll($n3.number.getCharacters());
}	:
	^(GLEICH n1=number n2=number n3=number) 
	-> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number})
	;

number returns [Number number]
@after { 
	$number = new Number();
	$number.setDigits($syms);
}
	: ^(NUMBER syms+=SYMBOL+);
