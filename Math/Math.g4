grammar Math;


// Generate: antlr4 Math.g4
// Compile: javac Math*.java 
// Run: grun Math compileUnit -gui Tests/test1.txt
// Run2: grun Math varDef -tree tests/test1.txt => expression tree following varDef
// Run3: grun Math expr -gui tests/test1.txt => print an Parse tree
// Run4: grun Math start -gui tests/test1.txt



compileUnit
    :   expr EOF
    ;

expr
    :   '(' expr ')'                         # parensExpr
    |   op=('+'|'-') expr                    # unaryExpr
    |   left=expr op=('*'|'/') right=expr    # infixExpr
    |   left=expr op=('+'|'-') right=expr    # infixExpr
    |   func=ID '(' expr ')'                 # funcExpr
    |   value=NUM                            # numberExpr
    ;

OP_ADD: '+';
OP_SUB: '-';
OP_MUL: '*';
OP_DIV: '/';

NUM :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
ID  :   [a-zA-Z]+;
WS  :   [ \t\r\n] -> channel(HIDDEN);