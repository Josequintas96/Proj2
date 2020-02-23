grammar Program;

// Generate: antlr4 Program.g4
// Compile: javac Program*.java
// Run: grun Program expr -tree tests/test1.txt => expresion tree
// Run2: grun Program varDef -tree tests/test1.txt => expression tree following varDef
// Run3: grun CaProgramlculator expr -gui tests/test1.txt => print an Parse tree
// rUN4: grun Program start -gui tests/test1.txt
@header{
import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Iterator;
import java.lang.Math; 

}

@members{
Double count= 0.0;
Boolean truth = true;
HashMap<String, Double> Vt = new HashMap<String, Double>();
HashMap<String,  Boolean> Vb =new HashMap<>();
Scanner myObj = new Scanner(System.in);
Boolean happen = true;
}

start: statements EOF;


//rules

statements:
    //nothing
    | progI statements
    | 'var' varDef2 statements
    | comment statements
    | main_p
    ;

progI:
    PO expr SEMC
    ;

varDef2: 
    //nothing
    | exprS ':' ID ';' 
            {
                String ill = $ID.text;
                if(ill.equals("boolean"))
                {Vb.put($exprS.i, truth);
                System.out.println("B. " + $exprS.i + " " + ill);
                }
                else
                {Vt.put($exprS.i, count);}
                System.out.println("A. " + $exprS.i + " " + ill);
            } varDef2
    | comment varDef2
       
    ;

comment:
    CO1 expr CO2 {System.out.println("Comment");}
    ;

main_p:
    'begin' sExprM 'end.'
    ;

sExprM:
    | ifelse
    | comment sExprM
    |  wrT
    | varWork
    ;


varWork:
    | exprS DD e=('TRUE'|'FALSE'|'true'|'false') ';'  
    {  System.out.println("This is B at B " + Vb.get($exprS.i));
        String e2 = $e.text;
        if(e2.equals("true"))
        {
            System.out.println("True happen");
            Vb.replace($exprS.i, true);
        }
         if(e2.equals("TRUE"))
        {
            System.out.println("True happen");
            Vb.replace($exprS.i, true);
        }
        if(e2.equals("false"))
        {
            System.out.println("True happen");
            Vb.replace($exprS.i, false);
        }
        if(e2.equals("FALSE"))
        {
            System.out.println("True happen");
            Vb.replace($exprS.i, false);
        }
        System.out.println("This is B at E " + Vb.get($exprS.i));
        }sExprM
    | exprS DD exprI (';') {
         System.out.println("This is your map: " + Vt.get($exprS.i));
        Vt.replace($exprS.i, $exprI.i);
        System.out.println("This is your map: " + Vt.get($exprS.i));
        } sExprM
    
    ;


wrT:
    | 'writeln' PARO exprW  PARC SEMC
            {System.out.println($exprW.i);
            } sExprM 
    | 'readln' PARO exprR PARC SEMC {System.out.println($exprR.text);}
             sExprM 
    ;

ifelse:
    |'if'  cond 'then' e=sExprM 'else' el=sExprM SEMC {System.out.println($cond.i);}
    | 'if' PARO cond PARC 'then' e=sExprM 'else' el=sExprM SEMC {System.out.println($cond.i);
    if($cond.i)
    {}
    else
    {}
    } sExprM
    ;

cond returns[Boolean i]:
    | ('TRUE'|'true') {$i=true;}
    | ('FALSE'|'false') {$i=false;}
    | e=exprI '=' l=exprI {
        System.out.println("This is the numb " + $e.i + " " + $l.i);
        if($e.i != $l.i)
                {$i = true;}
                else
                {$i = false;};}
    | ID {
        $i = Vb.get($ID.text);
        if($i)
        {$i = true;}
                else
                {$i = false;};
    }

    ;


exprW returns[String i]:
    | e=exprW '+' el=exprW {$i=$e.i; $i+=" "; $i+=$el.i;}
    |'\''exprS'\'' {$i = $exprS.i;}
    | exprS {if(Vb.get($exprS.i)!=null)
        {$i = $exprS.i;}
        else
        {
            $i = Double.toString(Vt.get($exprS.i));
        }}
    ;

exprR:
    |exprR ',' exprR
    |exprS {
                String e2 = myObj.nextLine();
                System.out.println("This is read "+ $exprS.i + " " + e2);
                boolean isB = false;
                boolean isT = false;
                if(e2.equals("true"))
                {isB = true;isT = true;}
                if(e2.equals("TRUE"))
                {isB = true;isT = true; }
                if(e2.equals("false"))
                {isB = true;isT = false; }
                if(e2.equals("FALSE"))
                {isB = true; isT = false; 
                }

                if(isB)
                {Vb.replace($exprS.i, isT);}
                else
                {Double isD = Double.parseDouble(e2);
                Vt.replace($exprS.i, isD);}
            }
    ;



exprS returns[String i]:
    | ID { $i = $ID.text; }
    ;

exprI returns[Double i]:
    |PARO e=exprI PARC { $i = $e.i;}
    | 'Sqrt' PARO e=exprI PARC {$i = Math.sqrt($e.i);}
    |'Cos' PARO e=exprI PARC {$i = Math.cos($e.i);}
    |'Sin' PARO e=exprI PARC {$i = Math.sin($e.i);}
    |'ln' PARO e=exprI PARC {$i = Math.log($e.i);}
    |'dopower' PARO e=exprI ',' el=exprI PARC {$i = Math.pow($e.i, $el.i);}
    | el=exprI '/' er=exprI { $i = $el.i / $er.i; }
    | el=exprI '*' er=exprI { $i = $el.i * $er.i; }
    | el=exprI '+' er=exprI { $i = $el.i + $er.i; }
    | el=exprI '-' er=exprI { $i = $el.i - $er.i; }
    | ID { $i = Vt.get($ID.text); }
    | FLOAT {$i = Double.parseDouble($FLOAT.text);}
    | INT {$i = Double.parseDouble($INT.text);}
    ;

expr:
    '(' expr ')'
    | expr '*' expr
    | expr '+' expr
    | expr expr
    | ID
    | INT
    ;

//tokens
CO1: '(''*';
CO2: '*'')';
PARO: '(';
PARC: ')';
PO: 'program';
DD: ':=';
SEMC: ';';
ID: [_A-Za-z][_A-Za-z0-9!]*;
INT: [0-9]+ ;
FLOAT: [0-9]+[.][0-9]+;
WS : [ \t\r\n]+ -> skip ;

//lexer
//parser ==> 
//lexer +  parser turn your code into a tree;  
//interpreter

//curly braches setting global variable
