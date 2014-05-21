grammar SymbolPuzzle;

// ### Options
options {
  language=Java;
  output=AST;
  ASTLabelType=CommonTree;
}

// ### Tokens
tokens {
  PUZZLE;
  NUMBER;
}

// package for parser
@header {package symbolpuzzle.grammar;}
// package for lexer
@lexer::header {package symbolpuzzle.grammar;}

// ### Parser rules
start :	puzzle -> ^(PUZZLE puzzle) ;

puzzle : s11=number 	o11=operation 	s12=number 	EQUALS 		s13=number
	 o21=operation 			o22=operation 			o23=operation 
	 s31=number 	o31=operation 	s32=number 	EQUALS 		s33=number 
	     EQUALS 			    EQUALS 			    EQUALS 
	 s51=number 	o51=operation 	s52=number 	EQUALS 		s53=number
	
	 -> ^(EQUALS ^($o11 $s11 $s12) $s13)
	    ^(EQUALS ^($o31 $s31 $s32) $s33)
	    ^(EQUALS ^($o51 $s51 $s52) $s53)
	    ^(EQUALS ^($o21 $s11 $s31) $s51)
	    ^(EQUALS ^($o22 $s12 $s32) $s52)
	    ^(EQUALS ^($o23 $s13 $s33) $s53)
       ;

operation : ADD | SUB ;

number : SYMBOL+ -> ^(NUMBER SYMBOL+);

// ### Lexer rules
ADD : '+' ;

SUB : '-' ;

EQUALS : '=' ;

SYMBOL : 'a'..'z' | 'A'..'Z' ;

WS : (' ' | '\t') { $channel=HIDDEN; } ;

NEWLINE : ('\r'? '\n') { $channel=HIDDEN; } ;

BLOCK_COMMENT : '/*' .* '*/' { $channel=HIDDEN; } ;

LINE_COMMENT : ('//' | '#') (~( '\r' | '\n' )*) { $channel=HIDDEN; } ;