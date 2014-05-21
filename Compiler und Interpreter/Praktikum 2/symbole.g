grammar symbole;

options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	LINE;
	COLUMN;
	SIGN;
	START;
}



start		: 	si1=signs 	op1=OP 	si2=signs 	EQ 	si3=signs NL+ 
			op3=OP 			op4=OP			op5=OP NL+ 
			si4=signs 	op6=OP 	si7=signs 	EQ 	si8=signs NL+ 
			EQ 			EQ 			EQ NL+ 
			si9=signs 	op7=OP 	si10=signs 	EQ 	si11=signs NL*
		->
		^(START
		^(LINE $si1 $op1 $si2 EQ $si3)
		^(LINE $si4 $op6 $si7 EQ $si8)
		^(LINE $si9 $op7 $si10 EQ $si11)
		^(COLUMN $si1 $op3 $si4 EQ $si9)
		^(COLUMN $si2 $op4 $si7 EQ $si10)
		^(COLUMN $si3 $op5 $si8 EQ $si11))
		
		;

signline:	signs OP signs EQ signs 
		;

		
signs	:	id+=BCHAR+ -> ^(SIGN $id*)
		;
		
		
BCHAR	:	('A'..'Z')
		;
		
OP	:	('+' | '-')
		;
		
NL	:	'\n'
	;
		
EQ	:	'='
		;
		


COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;
