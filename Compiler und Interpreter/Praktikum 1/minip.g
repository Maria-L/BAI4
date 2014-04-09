grammar minip;

start	:	K_PROGRAM declarations K_BEGIN commands K_END
	;
	
declarations
	:	declaration*
	;

declaration
	:	(K_INTEGER | K_REAL | K_STRING | K_BOOLEAN) idList K_SEM
	;
	
idList	:	ID (',' ID)*
	;
	
commands:	(command K_SEM | flowControl)+
	;
	
command	:	definition | read | print
	;
	
flowControl
	:	ifControl | whileControl
	;
	
definition
	:	ID ':=' (STRING | ID definition_ | '(' arith ')' | INTEGER definition__? | REAL definition__?)
	;
	
definition_
	:	arith_ | term_ | praedicate_ | praedicats_ |
	;
	
definition__
	:	arith_ | term_ arith_? | praedicate_ praedicats_?
	;

read	:	K_READ '(' ID ')'
	;

print	:	K_PRINTLN '(' (ID | STRING) ')'
	;

ifControl
	:	K_IF praedicate K_THEN commands (K_ELSE commands)? K_FI
	;
	
whileControl
	:	K_WHILE praedicats K_DO commands K_OD
	;
	
praedicats
	:	praedicate praedicats_?
	;
	
praedicats_
	:	(OP_LOGICAL praedicate)+
	;
	
praedicate
	:	(ID | BOOLEAN)  praedicate_?
	;
	
praedicate_
	:	OP_PRAEDICATE (ID | BOOLEAN)
	;
	
arith	:	term arith_?
	;
	
arith_	:	'+' arith | '-' arith
	;
	
term	:	factor term_?
	;
	
term_	:	'*' term | '/' term
	;
	
factor	:	(ID | REAL | INTEGER)
	|	'(' arith ')'
	|	'-' factor
	;


K_PROGRAM	
	:	'program'
	;
	
K_BEGIN	:	'begin'
	;
	
K_END	:	'end'
	;

K_INTEGER
	:	'integer'
	;
	
K_REAL	:	'real'
	;
	
K_STRING:	'string'
	;
	
K_BOOLEAN
	:	'boolean'
	;
	
K_READ	:	'read'
	;
	
K_PRINTLN
	:	'println'
	;
	
K_IF	:	'if'
	;

K_THEN	:	'then'
	;
	
K_ELSE	:	'else'
	;
	
K_FI	:	'fi'
	;
	
K_WHILE	:	'while'
	;
	
K_DO	:	'do'
	;
	
K_OD	:	'od'
	;
	
K_SEM	:	';'
	;
	
BOOLEAN	:	'true' | 'false'
	;
	
OP_PRAEDICATE
	:   	'=' |'<'|'>'|'!='|'<>'|'>='|'<='
	;
	
OP_LOGICAL
	:	'&&' | '||'
	;
	
ID  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    	;

INTEGER 
	:	'0'..'9'+
    	;

REAL
    	:   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    	|   '.' ('0'..'9')+ EXPONENT?
    	|   ('0'..'9')+ EXPONENT
    	;

COMMENT
    	:   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    	|   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

WS  	:   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    	;

STRING
    	:  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    	;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
