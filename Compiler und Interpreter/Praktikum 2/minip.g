grammar minip;
options {
	/*backtrack=true;*/
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	DECLARATIONS;
	COMMANDS;
	DEFINITION;
	READ;
	PRINT;
	IF;
	THEN;
	ELSE;
	WHILE;
	DO;
}

@header {
	import java.util.HashMap;
}


start	:	K_PROGRAM! declarations K_BEGIN! commands_ K_END!
	;
	
declarations
	:	declaration*				-> ^(DECLARATIONS declaration*)
	;

declaration
	:	type id=ID(',' id_+=ID)* K_SEM		-> ^(type $id $id_*)
	;
	
commands_:	commands				-> ^(COMMANDS commands)
	;
	
commands:	(command K_SEM! | flowControl)+
	;
	
command	:	definition | read | print
	;
	
flowControl
	:	ifControl | whileControl
	;
	
	
definition 
	:	ID ':='^ (STRING
	| 	arith
	| 	praedicats)
	;


read	:	K_READ '(' ID ')'						-> ^(READ ID)
	;

print	:	K_PRINTLN '(' (id=ID | id=STRING) ')'				-> ^(PRINT $id)
	;

ifControl
	:	K_IF praedicats K_THEN id=commands (K_ELSE id_=commands)? K_FI	-> ^(IF praedicats* ^(THEN $id) ^(ELSE $id_)?)
	;
	
whileControl
	:	K_WHILE praedicats K_DO commands K_OD				-> ^(WHILE praedicats* ^(DO commands*))
	;
	
praedicats
	:	'?'! praedicate (OP_LOGICAL^ praedicate)*
	;
	
praedicate
	:	ID (OP_PRAEDICATE^ (ID | BOOLEAN | REAL | INTEGER))?
	| 	(REAL | INTEGER) OP_PRAEDICATE^ (ID | BOOLEAN | REAL | INTEGER)
	| 	BOOLEAN
	;
	
arith	:	term (('+'^ | '-'^) arith)*
	;
	
	
term	:	factor ('*'^ term | '/'^ term)*
	;
	
factor	:	(ID | REAL | INTEGER)
	|	'('! arith ')'!
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
