grammar Puzzle;

options { 
	output=AST;
	ASTLabelType=CommonTree;
}

tokens { 
	CALCULATION;
	
	OPERAND;
	OPERATION;
}

@header {package grammar;}
@lexer::header {package grammar;}

start
	:	
		opr00=operand  op1=operator opr01=operand '=' opr02=operand NEWLINE
		  op2=operator op3=operator   op4=operator NEWLINE
		opr10=operand  op5=operator opr11=operand '=' opr12=operand NEWLINE
		    '='          '='            '=' NEWLINE
		opr20=operand  op6=operator opr21=operand '=' opr22=operand NEWLINE
		EOF

		->
			^(CALCULATION ^($op1 $opr00 $opr01) $opr02)
			^(CALCULATION ^($op5 $opr10 $opr11) $opr12)
			^(CALCULATION ^($op6 $opr20 $opr21) $opr22)

			^(CALCULATION ^($op2 $opr00 $opr10) $opr20)
			^(CALCULATION ^($op3 $opr01 $opr11) $opr21)
			^(CALCULATION ^($op4 $opr02 $opr12) $opr22)
	; 

operand
	:	ID+
	->  ^(OPERAND ID+)
	;

ID  
	:	('a'..'z'|'A'..'Z')
    ;
    
operator
	:	ADD | SUB
	;
	
ADD	:	'+';
SUB :	'-';

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' { skip(); }
    |   '/*' ( options {greedy=false;} : . )* '*/' { skip(); }
    ;

NEWLINE	
	:	'\r'? '\n'
	;