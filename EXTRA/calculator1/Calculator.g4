grammar Calculator;

// Generate: antlr4 Calculator.g4
// Compile: javac Calculator*.java
// Run: grun Calculator expr -tree tests/input1.txt => expresion tree
// Run2: grun Calculator varDef -tree tests/input1.txt => expression tree following varDef

// Run3: grun Calculator expr -gui tests/input1.txt => print an Parse tree
@header{
import java.util.*;
}

@members{
Double count=0.0;

HashMap<String, Double> Vt = new HashMap<>();
}

start: statements EOF;

statements:
    // nothing
    | statement statements
    ;

statement:
    varDef
    | sExpr {System.out.println(count + " Super Hello");}
    ;

varDef: ID '=' expr ';'
    |varDef varDef
    ;

sExpr:
       sExpr sExpr
       |expr ';' {System.out.println("Hello " + $expr.i);
                  Vt.put($expr.i, count);
                            count++;

                    Set entrySet = Vt.entrySet();
                               Iterator it = entrySet.iterator();
                                System.out.println("HashMap Key-Value Pairs : ");
                                while(it.hasNext()){
                                Map.Entry me = (Map.Entry)it.next();
                                System.out.println("Key is: "+me.getKey() +
                                " & " +
                                " value is: "+me.getValue());}

                 }
       |expr'.' {System.out.println(Vt.get("bella"));};

//expr returns[String i]:
//    '(' e=expr ')' { $i = $e.i; }
//    | ID { }
//    | ID2 { }
//    ;

expr returns[String i]:
    '(' e=expr ')' {$i = $e.i;}
    | e=expr ' ' e2=expr {$i= "";
                                 $i+=$e.i; $i+=" "; $i+=$e2.i;}
    |ID { $i = $ID.text; }
    ;


ID: [_A-Za-z][_A-Za-z0-1]*;
INT: [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
