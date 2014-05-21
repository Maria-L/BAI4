tree grammar BildRaetselChef;

options{
	tokenVocab=Bild1;
	ASTLabelType=CommonTree;
	output=AST;
}

@header {package symbolRaetsel.output;}

start :	puzzle ;

puzzle : ^(PUZZLE calc calc calc calc calc calc) ;

calc : ^(EQUALS ^(ADD term1 term2) term3)
     | ^(EQUALS ^(SUB term1 term2) term3) -> ^(EQUALS["="] ^(ADD["+"] term3 term2) term1)
     ;
     
term1 : number ;
term2 : number ;
term3 : number ;

number : ^(ZAHL ZIFFER+);