grammar Bild1;

options {
	language=Java;
	output=AST;
	ASTLabelType=CommonTree;
	}
tokens{
	PUZZLE;
	ZAHL;
}
// package for parser
@header {package  symbolRaetsel.output;}
// package for lexer
@lexer::header {package symbolRaetsel.output;}



start	:	puzzle-> ^(PUZZLE puzzle); 

puzzle  :   n11=number o11=operator n12=number EQUALS n13=number
			o21=operator o22=operator o23=operator
			n31=number o31=operator n32=number EQUALS n33=number
			EQUALS EQUALS EQUALS
			n51=number o51=operator n52=number EQUALS n53=number		
			->
			 ^(EQUALS ^($o11 $n11 $n12) $n13 )	
			^(EQUALS ^($o31 $n31 $n32) $n33 )
			^(EQUALS ^($o51 $n51 $n52) $n53 )
			
			^(EQUALS ^($o21 $n11 $n31) $n51 )	
			^(EQUALS ^($o22 $n12 $n32) $n52 )
			^(EQUALS ^($o23 $n13 $n33) $n53 );

number	:	ZIFFER+ -> ^(ZAHL ZIFFER+);
operator 
	:	ADD|SUB;
ADD	:	'+';
SUB	:	'-';
EQUALS 	:	'=';
ZIFFER	:	('a'..'z'|'A'..'Z');
    


WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;