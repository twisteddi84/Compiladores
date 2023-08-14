grammar CalComplex;

program:(command)* EOF;

command: output | assignment;

assignment: expr '=>' ID ';';

output:'output' expr ';';

expr:
    Complexo #ExprComplexo
    | ID #ExprID
    ;

Complexo: [0-9]*'i' | [0-9]+ | '-'?[0-9]+ ('+' | '-')[0-9]*'i';


ID: [a-zA-Z][a-zA-Z0-9]*;
WS: [ \t\r\n] -> skip;
Comment: '##' .*? '\n'-> skip;