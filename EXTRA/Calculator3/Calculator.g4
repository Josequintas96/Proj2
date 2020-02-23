grammar Calculator;

// Generate: antlr4 Calculator.g4
// Compile: javac Calculator*.java 
// Run: grun Calculator start  tests/input.txt

@header{
import java.util.*;
}

@members{
int count=0;
}

start: statements EOF;

statements:
    // nothing 
    | statement statements
    ;

statement:
    varDef
    | varDef2
    | sExp
    ;

varDef: ID '=' expr ';' {
System.out.println($ID.text + " = " +
  Integer.toString($expr.i));
 };

 varDef2: ID2 '=' expr ';' {
 System.out.println($ID2.text + " is equal to " +
   Integer.toString($expr.i));
  };


sExp: expr ';' {
    System.out.println("result: " +
        Integer.toString($expr.i));
};

expr returns[int i]:
    '(' e=expr ')' { $i = $e.i; }
    | el=expr '*' er=expr { $i = $el.i * $er.i; }
    | el=expr '+' er=expr { $i = $el.i + $er.i; }
    | el=expr '-' er=expr { $i = $el.i - $er.i; }
    | ID { }
    | ID2 { }
    | INT { $i = Integer.parseInt($INT.text); }
    ;



ID: [_A-Za-z][a-z0-1]*;
ID2: [A-Z][_A-Z0-1]*;
INT: [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
