grammar Ex6 ;
program :
stat * EOF;
stat : (expr | assignment)? NEWLINE; 
assignment : ID '=' expr; 
expr :
op = ( '+' | '-' ) expr    #ExprUnary
|expr op=( '*' | '/' | '%' ) expr #ExprMultDivMod
| expr op=( '+' | '-' ) expr   #ExprAddSub
| Integer                      #ExprInteger
| '('expr')'                   #ExprParent
| ID                           #ExprID
;

Integer : [0-9]+;
ID : [a-zA-Z]+;
NEWLINE: '\r' ? '\n' ;
WS: [ \t]+ -> skip ;
COMMENT: '#' .* ?' \n ' -> skip; 