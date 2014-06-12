grammar Zahlenraetsel;

options { 
  language = Java;
  output = AST;
  ASTLabelType=CommonTree;
}

tokens{
	RAETSEL;
	NUMBER;
}

@parser::header {
	package zahlenraetsel.generated;
}

@lexer::header {
	package zahlenraetsel.generated;
}

prog: stat+;
stat: STAT_START z11=number op1=operator z12=number GLEICH z13=number  
                 op21=operator  op22=operator  op23=operator
                 z31=number op3=operator z32=number GLEICH z33=number
                 GLEICH GLEICH GLEICH
                 z41=number op4=operator z42=number GLEICH z43=number
      STAT_END -> ^(RAETSEL 
                      ^(GLEICH ^($op1 $z11 $z12) $z13)
                      ^(GLEICH ^($op3 $z31 $z32) $z33)
                      ^(GLEICH ^($op4 $z41 $z42) $z43)
                      ^(GLEICH ^($op21 $z11 $z31) $z41)
                      ^(GLEICH ^($op22 $z12 $z32) $z42)
                      ^(GLEICH ^($op23 $z13 $z33) $z43));
operator:MINUS | PLUS;
MINUS:'-';
PLUS:'+';
GLEICH:'=';
STAT_START: '{';
STAT_END: '}';
number :SYMBOL+ -> ^(NUMBER SYMBOL+);
SYMBOL: ('A'..'Z');
WS : (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;} ;
