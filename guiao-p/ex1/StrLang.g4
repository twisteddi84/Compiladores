grammar StrLang;

program: (command)* EOF;

command: print | assignment;

print: 'print' expr;

assignment: ID ':' expr;

expr:
    expr op=('+'|'-') expr #ExprAddSub
    | 'trim' expr #ExprTrim
    | 'input(' String ')' #ExprInput
    | '(' expr ')' #ExprParenteses
    | expr '/' expr '/' expr #ExprSub
    | String #ExprString
    | ID #ExprID
    ;

ID:[a-zA-Z0-9]+;
String:'"' .*? '"';
WS:[ \t\r\n]+ -> skip;
Comment: '//' .*? '\n'-> skip;