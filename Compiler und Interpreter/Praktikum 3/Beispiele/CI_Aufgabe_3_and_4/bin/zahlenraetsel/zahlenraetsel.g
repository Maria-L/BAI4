grammar zahlenraetsel;
options {
  language = Java;
  output = AST;
}
prog: stat+;
stat: STAT_START row ops row eqls row STAT_END {System.out.println("Statement");};
row: ZIFFERNBLOCK OPERATOR ZIFFERNBLOCK GLEICH ZIFFERNBLOCK;
ops: OPERATOR OPERATOR OPERATOR;
eqls: GLEICH GLEICH GLEICH;
OPERATOR:'+'|'-';
GLEICH:'=';
STAT_START: '{';
STAT_END: '}';
ZIFFERNBLOCK : ('A'..'Z')+ ;
NEWLINE:'\r'?'\n' {skip();};
WS : (' '|'\t'|'\n'|'\r')+ {skip();} ;