grammar Hello;
main: conversation* EOF;
conversation: hello | bye;
hello: 'hello' ID+;
bye: 'bye' ID+;
ID: [A-Za-z]+;
WS: [ \t\r\n]+ -> skip;