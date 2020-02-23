grammar Hello;

prog
 : statements[""] EOF {System.out.println($statements.str);}
 ;

statements[String indent] returns [String str]
@init{$str = "";}
 : (statement[indent] {$str += indent + $statement.str + "\n";})*
 ;

statement[String indent] returns [String str]
 : if_statement[indent] {$str = $if_statement.str;}
 | assignment           {$str = $assignment.str;}
 ;

if_statement[String indent] returns [String str]
 : IF expr THEN s1=statements[indent + "  "] {$str = "if (" + $expr.str + ")\n" + indent + "{\n" + $s1.str;}
   (ELSE s2=statements[indent + "  "]        {$str += indent + "}\n" + indent + "else\n" + indent + "{\n" + $s2.str;} )?
   ENDIF                                     {$str += indent + "}";}
 ;

assignment returns [String str]
 : identifier GETS expr {$str = $identifier.str + " = " + $expr.str + ";";}
 ;

expr returns [String str]
 : rel_expr {$str = $rel_expr.str;}
 ;

rel_expr returns [String str]
 : e1=eq_expr {$str = $e1.str;} ( LT e2=eq_expr {$str += " < "  + $e2.str;}
                                | GT e2=eq_expr {$str += " > "  + $e2.str;}
                                | LE e2=eq_expr {$str += " <= " + $e2.str;}
                                | GE e2=eq_expr {$str += " >= " + $e2.str;}
                                )?
 ;

eq_expr returns [String str]
 : e1=add_expr {$str = $e1.str;} (EQUALS e2=add_expr {$str += " == " + $e2.str;})?
 ;

add_expr returns [String str]
 : e1=mult_expr {$str = $e1.str;} ( PLUS  e2=mult_expr {$str += " + " + $e2.str;}
                                  | MINUS e2=mult_expr {$str += " - " + $e2.str;}
                                  )*
 ;

mult_expr returns [String str]
 : e1=unary_expr {$str = $e1.str;} ( MULT e2=unary_expr {$str += " * " + $e2.str;}
                                   | DIV  e2=unary_expr {$str += " / " + $e2.str;}
                                   )*
 ;

unary_expr returns [String str]
 : MINUS term {$str = "-" + $term.str;}
 | term       {$str = $term.str;}
 ;

term returns [String str]
 : identifier {$str = $identifier.str;}
 | number     {$str = $number.text;}
 ;

identifier returns [String str]
 : LABEL    {$str = $LABEL.text;}
 | RES_PARM {$str = $RES_PARM.text;}
 | VARIABLE {$str = $VARIABLE.text.substring(1);}
 ;

number
 : INT
 | FLOAT
 | HEX
 ;

WS          : (' '|'\t')+ ;
COMMENT     : '/*' .*? '*/' ;
LINECOMMENT : '#' ~('\n'|'\r')* NEWLINE ;
NEWLINE     : '\r'?'\n';
IF          : I F;
THEN        : T H E N;
ELSE        : E L S E;
ENDIF       : E N D I F;
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
EQUALS      : '=';
GT          : '>';
LT          : '<';
GE          : '>=';
LE          : '<=';
ULINE       : '_';
DOT         : '.';
GETS        : ':=';
LABEL       : (LETTER | ULINE) (LETTER | DIGIT | ULINE)*;
INT         : DIGIT+;            // no '-' here, unary_expr handles this
FLOAT       : DIGIT* DOT DIGIT+; // no '-' here, unary_expr handles this
HEX         : '0' ('x'|'X') HEXDIGIT+;
RES_PARM    : DIGIT LABEL;
VARIABLE    : '$' LABEL;

fragment A:'A'|'a';    fragment B:'B'|'b';    fragment C:'C'|'c';    fragment D:'D'|'d';
fragment E:'E'|'e';    fragment F:'F'|'f';    fragment G:'G'|'g';    fragment H:'H'|'h';
fragment I:'I'|'i';    fragment J:'J'|'j';    fragment K:'K'|'k';    fragment L:'L'|'l';
fragment M:'M'|'m';    fragment N:'N'|'n';    fragment O:'O'|'o';    fragment P:'P'|'p';
fragment Q:'Q'|'q';    fragment R:'R'|'r';    fragment S:'S'|'s';    fragment T:'T'|'t';
fragment U:'U'|'u';    fragment V:'V'|'v';    fragment W:'W'|'w';    fragment X:'X'|'x';
fragment Y:'Y'|'y';    fragment Z:'Z'|'z';

fragment HEXDIGIT : DIGIT |'a..f'|'A'..'F';
fragment DIGIT    : '0'..'9';
fragment LETTER   : A | B | C | D | E | F | G | H | I | J | K | L | M
                  | N | O | P | Q | R | S | T | U | V | W | X | Y | Z
                  ;