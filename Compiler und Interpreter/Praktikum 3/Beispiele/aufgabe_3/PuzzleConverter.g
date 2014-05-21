tree grammar PuzzleConverter;

options {
  tokenVocab=Puzzle;
  ASTLabelType=CommonTree;
  output=AST;
}

@header {package grammar;}

start :	puzzle;

puzzle : calc calc calc calc calc calc ;

calc : ^(CALCULATION ^(ADD operand operand) operand)
     | ^(CALCULATION ^(SUB op1=operand op2=operand) op3=operand)
       -> ^(CALCULATION ^(ADD["+"] $op3 $op2) $op1)
     ;

operand:	^(OPERAND ID+);