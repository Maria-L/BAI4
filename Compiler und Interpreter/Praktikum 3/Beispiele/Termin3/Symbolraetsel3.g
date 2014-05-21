	grammar Symbolraetsel3;

	options {
		output=AST;
	}

	tokens{
	PLUS_;
	}

	start    :    (zeile|(newline!))* EOF;

	zeile 	:	berechnung;

	berechnung 
		:	term1 PLUS term2 ERGEBNIS ergebnis -> ^(ERGEBNIS ^(PLUS_ term1 term2) ergebnis)
		|	term1 MINUS term2 ERGEBNIS ergebnis -> ^(ERGEBNIS ^(PLUS_ ergebnis term2) term1);

	term1	:	string;
	term2	:	string;

	ergebnis:	string;

	string	:	STRING;
	newline	:	NEWLINE;

	STRING	:	('a'..'z')+;
	PLUS	:	'+';
	MINUS	:	'-';
	NEWLINE	:	'\n';
	ERGEBNIS:	'=';