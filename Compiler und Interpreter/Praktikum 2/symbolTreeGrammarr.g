tree grammar symbolTreeGrammar;

options {
    tokenVocab=Expr;
    ASTLabelType=CommonTree;
}

tokens {
	LINE;
	SIGN;
	COLUMN;
}

start	:	^(LINE ^(SIGN ID+) OP ^(SIGN ID+) OP ^(SIGN ID+))+
	|	^(COLUMN ^(SIGN ID+) OP ^(SIGN ID+) OP ^(SIGN ID+))+
	;
	