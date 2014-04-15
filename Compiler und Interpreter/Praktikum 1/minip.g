grammar minip;

@header {
	import java.util.HashMap;
}

@members {
	HashMap<String, String> idTable = new HashMap<String, String>();
}

start	:	K_PROGRAM declarations K_BEGIN commands K_END
	;
	
declarations
	:	declaration*
	{System.out.println(idTable.toString());}
	;

declaration
	:	type id=ID {idTable.put($id.text, $type.text);} (',' id_=ID {idTable.put($id_.text, $type.text);})* K_SEM
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
	
/*definition
	:	ID ':=' 
	(STRING 
	| BOOLEAN praedicats_?
	| ID definition__ 
	| '(' arith ')' (arith_ | term_)? 
	| INTEGER definition_ 
	| REAL definition_)
	;
	
definition_
	:	arith_ | term_ arith_? | praedicate_ praedicats_? |
	;
	
definition__
	:	arith_ | term_ arith_? | praedicate_? praedicats_?
	;*/
	
definition 
options {backtrack = true;}
	:	ID ':=' (STRING 
	| {false}?=> praedicats 
	| arith);


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
	:	ID praedicate_? | (REAL | INTEGER) praedicate_ | BOOLEAN
	;
	
praedicate_
	:	OP_PRAEDICATE (ID | BOOLEAN | REAL | INTEGER)
	;
	
/*arith	:	term arith_?
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
	;*/
	
arith	:	term ('+' arith | '-' arith)*
	;
	
	
term	:	factor ('*' term | '/' term)*
	;

	
factor	:	(ID | REAL | INTEGER)
	|	'(' arith ')'
	;

type	:	K_INTEGER | K_REAL | K_STRING | K_BOOLEAN
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
    	: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
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
