grammar FracLang;

program: (command? ';')* EOF;

command: display | assignment;

display: 'display' expr;

assignment: ID '<=' expr;

expr:
    op=('+'|'-') expr #ExprSinal
    | expr op= ('*'|':') expr #ExprMultDiv
    | expr op= ('+'|'-') expr #ExprAddSub
    | '(' expr ')' #ExprParent
    | 'read' String #ExprRead
    | 'reduce' expr #ExprReduce
    | Fraction #ExprFraction
    | ID #ExprID
    ;

ID: [a-z]+;
String:'"' .*? '"';
Fraction: [0-9]+ ('/' [0-9]+)?;
WS: [ \t\r\n] ->skip;
Comment: '--' .*? '\n'-> skip;