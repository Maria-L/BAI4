/*
Beispiel:
BGDG+BEEA=CAGG
   +    +    +
CKAF- JDK=CAHG
   =    =    =
FFCB+ GBB=GBED
*/

grammar raetsel;

options {
  language=Java;
  output=AST;
  ASTLabelType=CommonTree;
}


tokens {
	RAETSEL;
	NUMBER;
}

start:	raetsel -> ^(RAETSEL raetsel );

raetsel :     b11=BLOCK o11=op b12=BLOCK EQS b13=BLOCK
            	o21=op 	  o22=op 	o23=op
            b21=BLOCK o31=op b22=BLOCK EQS b23=BLOCK
            	EQS    	    EQS 	  EQS
            b31=BLOCK o51=op b32=BLOCK EQS b33=BLOCK
            EOF -> 	^(EQS ^($o11 $b11 $b12 ) $b13) /*Zeilen*/
            		^(EQS ^($o31 $b21 $b22 ) $b23)
            		^(EQS ^($o51 $b31 $b32 ) $b33)
            		^(EQS ^($o21 $b11 $b21 ) $b31)	/* Spalten */
            		^(EQS ^($o22 $b12 $b22 ) $b32)
            		^(EQS ^($o23 $b13 $b23 ) $b33);
            //{ System.out.println("parsing finished"); };

            //{ System.out.println("calculation"); };



/* Operator */
op:         (ADD|SUB);


/* ATOME */
ID:         ('a'..'z'|'A'..'Z');
/* Identifier-Block */
BLOCK:      ID+;

ADD:        ('+');
SUB:        ('-');
EQS:        ('=');

WS:         (' '|'\t'|'\n'| '\r' )  { $channel=HIDDEN; };

/* Comments */
//BLOCK_COMMENT : '/*' .*? '*/'  { $channel=HIDDEN; };
//LINE_COMMENT : ('//'|'#') ~['\r\n']* { $channel=HIDDEN; };
