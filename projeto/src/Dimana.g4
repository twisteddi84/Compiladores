grammar Dimana;

program: stat* EOF;

stat:
	dimensionDef
	| unitDef
	| varInicialization
	| list_append
	| assignament
	| loop
	| conditional
	| prefix
	| use
	| write
	| writeln;

list_append: expression '>>' ID ';';

read: 'read' expression;

write: 'write' expression ';';

writeln: 'writeln' expression ';';

use: 'use' STRING_LITERAL ';';

prefix: 'prefix' 'real' ID '=' NUMBER ';';

dimensionDef:
	'dimension' type assignament
	| 'dimension' type expression ';';

unitDef: 'unit' ID '[' (expression) ']' '=' expression ';';

varInicialization: type ID init? ';';

assignament: ID ('[' expression ']')? init;

init: '=' expression (';')?;

loop:
	'for' ID '=' expression 'to' expression 'do' (stat)+ 'end;';

conditional:
	'if' expression 'then' if_stat = stat+ (
		'else' else_stat = stat+
	)? 'end;';

expression:
	e1 = expression op = ('*' | '/') e2 = expression	# multDiv
	| e1 = expression op = ('+' | '-') e2 = expression	# addSub
	| e1 = expression op = ('&' | '|') e2 = expression	# andOr
	| e1 = expression op = (
		'<'
		| '>'
		| '>>'
		| '<='
		| '>='
		| '=='
		| '!='
	) e2 = expression						# relational
	| type '(' expression ')'				# cast
	| e1 = expression ',' e2 = expression	# comma
	| ID '[' expression ']'					# listAccess
	| ID									# id
	| NUMBER								# number
	| STRING_LITERAL						# string
	| '(' expression ')'					# parenthesis
	| '!' expression						# not
	| read									# input
	| 'new' type							# new
	| 'length' '(' ID ')'					# length
	| op = (STRING_LITERAL | ID) ',' NUMBER	# listInit;

type: 'integer' | 'real' | 'string' | 'list' '[' type ']' | ID;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: ([0-9]+ ('.' [0-9]+)? | '.' [0-9]+) ([eE] [+-]? [0-9]+)?;
STRING_LITERAL: '"' .*? '"';
COMM: '#' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;
