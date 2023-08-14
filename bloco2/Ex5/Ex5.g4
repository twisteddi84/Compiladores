grammar Ex5;
program:
stat * EOF;
stat : expr ? NEWLINE;
expr :
    Integer '-' String;

String : [a-zA-Z]+;
Integer : [0-9]+; 
NEWLINE: '\r' ? '\n' ;
WS: [ \t]+ -> skip ;
COMMENT: '#' .* ?' \n ' -> skip; 
