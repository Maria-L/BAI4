tree grammar symbolTreeEmitter;

options {
	language = Java;
	output = template;
	tokenVocab = symbole;
	ASTLabelType = CommonTree;
}

@header {
	package symbolStuff;
	import java.util.Set;
	import java.util.HashSet;
	import java.lang.Character;
}

start [String packagePath, String className, String pathToPuzzleFile]
	returns [Set<Character> letters, Set<String> constraints]
	:
	{
		$letters = new HashSet<Character>();
		$constraints = new HashSet<String>();
	}
	ln1=line ln2=line ln3=line cl1=column cl2=column cl3=column
	{
		$letters.addAll($ln1.letters);
		$letters.addAll($ln2.letters);
		$letters.addAll($ln3.letters);
		$letters.addAll($cl1.letters);
		$letters.addAll($cl2.letters);
		$letters.addAll($cl3.letters);

		$constraints.add($ln1.st.toString());
		$constraints.add($ln2.st.toString());
		$constraints.add($ln3.st.toString());
		$constraints.add($cl1.st.toString());
		$constraints.add($cl2.st.toString());
		$constraints.add($cl3.st.toString());
	}
	-> sums(constraints={$constraints}, letters={$letters}, package={$packagePath}, 
		className={$className}, pathToPuzzleFile={$pathToPuzzleFile})
	;

line	returns[Set<Character> letters]
@after 	{
		$letters = new HashSet<Character>();
		$letters.addAll($n1.number.getCharacters());
		$letters.addAll($n2.number.getCharacters());
		$letters.addAll($n3.number.getCharacters());
}
	: ^(LINE n1=number ADD n2=number EQ n3=number)
	-> sum(num1={$n1.number}, num2={$n2.number}, num3={$n3.number})
	;


column	returns[Set<Character> letters]
@after 	{
		$letters = new HashSet<Character>();
		$letters.addAll($n1.number.getCharacters());
		$letters.addAll($n2.number.getCharacters());
		$letters.addAll($n3.number.getCharacters());
}
	: ^(COLUMN n1=number ADD n2=number EQ n3=number)
	-> sum(num1={$n1.number}, num2={$n2.number}, num3={$n3.number})
	;

number	returns [Number number]
@after 	{
	$number = new Number();
	$number.setDigits($signs);
}
	: ^(SIGN signs+=BCHAR+)
	;