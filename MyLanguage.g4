grammar MyLanguage;


program: component*;
component: 'Component' ID '{' style? template? logic? '}';
style: 'Style' '{' (property ':' value ';')* '}';
template: 'Template' '{' element* '}';
logic: 'Logic' '{' function* '}';

element: '<' ID attributes? '>' element* '</' ID '>' | TEXT;
attributes: (attribute)+;
attribute: ID '=' STRING;

function: ID '(' parameterList? ')' '{' CODE '}';
parameterList: ID (',' ID)*;

property: ID;
value: STRING;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
TEXT: ~[<>]+;
STRING: '"' .*? '"';
CODE: ('a' | 'b')+; // Matches one or more 'a' or 'b'
WS: [ \t\n\r]+ -> skip;
