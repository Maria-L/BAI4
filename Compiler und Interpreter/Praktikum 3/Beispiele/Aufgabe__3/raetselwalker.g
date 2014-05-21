tree grammar raetselwalker;

options {
	tokenVocab=raetsel;
	ASTLabelType=CommonTree;
	output=AST;
}

//@header {package raetsel;}
 
start: 	^(RAETSEL eqs eqs eqs eqs eqs eqs );

eqs:	^(EQS ^(ADD t1 t2) t3 ) |
	^(EQS ^(SUB t1 t2) t3 ) -> ^(EQS ^(ADD["+"] t3 t2) t1 );

op:     (ADD|SUB);

t1:	BLOCK;
t2:	BLOCK;
t3:	BLOCK;