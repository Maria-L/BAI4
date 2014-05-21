tree grammar SymbolPuzzleWalker;

// ### Options
options {
  // Importiert die Tokens ueber die SymbolPuzzle.token Datei
  tokenVocab=SymbolPuzzle;
  ASTLabelType=CommonTree;
  output=AST;
}

// package for walker
@header {package symbolpuzzle.grammar;}

// ### Parser rules
start :	puzzle ;

puzzle : ^(PUZZLE calc calc calc calc calc calc) ;

calc : ^(EQUALS ^(ADD term1 term2) term3)
     | ^(EQUALS ^(SUB term1 term2) term3) -> ^(EQUALS["="] ^(ADD["+"] term3 term2) term1)
     ;
     
term1 : number ;
term2 : number ;
term3 : number ;

number : ^(NUMBER SYMBOL+);