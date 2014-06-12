tree grammar ZahlenraetselTree;

options {
  	language = Java;
  	output = AST;
  	tokenVocab = Zahlenraetsel;
  	ASTLabelType = CommonTree;
}
@header {
	package zahlenraetsel.generated;
}

prog	: raetsel+
	;

raetsel	: ^(RAETSEL equ equ equ equ equ equ)
	;
equ	: ^(GLEICH ^(MINUS minuend=number subtrahend=number )differenz=number) 	-> ^(GLEICH $differenz $subtrahend $minuend)
	| ^(GLEICH ^(PLUS! number number )number)
	;

number 	: ^(NUMBER SYMBOL+);
