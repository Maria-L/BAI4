tree grammar SymbolRaetselWalker;


options {
  tokenVocab=SymbolRaetsel;
  ASTLabelType=CommonTree;
  output=AST;
}

@header {package de.haw.ci.grammar;}

start : equation equation equation equation equation equation;

equation : ^(EQ ^(ADD firstoperand secondoperand) equalsnum)
     | ^(EQ ^(SUB firstoperand secondoperand) equalsnum) -> ^(EQ ^(ADD["+"] equalsnum secondoperand) firstoperand) //Umstellung
     ;
     
firstoperand : number;
secondoperand : number;
equalsnum : number;

number : ^(NUMBER SYM+);