grammar Symbolraetsel;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}

tokens{
	NUMBER;
}

start: var01=zBlock  op0102=op  var02=zBlock  EQ  eq03=zBlock
       op0111=op  op0212=op  op0313=op
       var11=zBlock op1112=op  var12=zBlock  EQ  eq13=zBlock
       EQ  EQ  EQ
      eq21=zBlock  op2122=op  eq22=zBlock  EQ  eq23=zBlock 
      
      	-> ^(EQ ^($op0102 $var01 $var02) $eq03) //Horizontal
	   ^(EQ ^($op1112 $var11 $var12) $eq13) //Horizontal
	   ^(EQ ^($op2122 $eq21 $eq22) $eq23)  //Horizontal
	   ^(EQ ^($op0111 $var01 $var11) $eq21) //Vertikal
	   ^(EQ ^($op0212 $var02 $var12) $eq22)  //Vertikal
	   ^(EQ ^($op0313 $eq03 $eq13) $eq23);  //Vertikal
	

op: ADD | SUB;
	   
	   
zBlock: SYM+ -> ^(NUMBER SYM+);


SYM:   'a'..'z'|'A'..'Z';
EQ:'=';
ADD: '+';
SUB: '-';
WS : (' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;} ;