grammar Symbolraetzel;


start		: signline NL OP OP OP NL signline NL EQ EQ EQ NL signline NL*
		;

signline:	signs OP signs EQ signs
		;
		
signs	:	BCHAR+
		;
		
		
BCHAR	:	('A'..'Z')
		;
		
OP	:	('+' | '-')
		;
		
NL	:	'\n'
	;
		
EQ	:	'='
		;
		


COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;
