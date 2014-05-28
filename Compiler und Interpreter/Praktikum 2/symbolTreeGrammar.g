tree grammar symbolTreeGrammar;

options {
    tokenVocab=symbole;
    ASTLabelType=CommonTree;
    output=AST;
}


start	:	line line line column column column
	;
	
line	:	^(LINE firstOp ADD secondOp EQ thirdOp)		-> ^(LINE firstOp ADD["+"] secondOp EQ thirdOp)
	|	^(LINE firstOp SUB secondOp EQ thirdOp)		-> ^(LINE secondOp ADD["+"] thirdOp EQ firstOp)
	;
	
column	:	^(COLUMN firstOp ADD secondOp EQ thirdOp)	-> ^(COLUMN firstOp ADD["+"] secondOp EQ thirdOp)
	|	^(COLUMN firstOp SUB secondOp EQ thirdOp)	-> ^(COLUMN secondOp ADD["+"] thirdOp EQ firstOp)
	;
	
firstOp	:	^(SIGN BCHAR+)
	;
	
secondOp:	^(SIGN BCHAR+)
	;
	
thirdOp	:	^(SIGN BCHAR+)
	;