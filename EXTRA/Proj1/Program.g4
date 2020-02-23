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
}

start: statements EOF;


//rules

statements:
    //nothing
    | progI statements
    | 'var' varDef statements
    | main_p
    | comment statements
    ;

progI:
    PO expr SEMC
    ;

comment:
    CO1 expr CO2
    ;

varI:
    'var' varDef2
    ;

main_p:
    'begin' sExprM 'end.'
    ;

sExprM:
    |comment sExprM
    | varWork
    | wrT 
    | ifelse
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
            }
    | exprS ':' ID ';' {
                String ill = $ID.text;
                if(ill.equals("boolean"))
                {Vb.put($exprS.i, truth);
                System.out.println("B. " + $exprS.i + " " + ill);}
                else
                {Vt.put($exprS.i, count);
                System.out.println("A. " + $exprS.i + " " + ill);
            }} varDef2
       
    ;

varWork:
    | exprS DD exprI (';') {
        System.out.println("This is your map: " + Vt.get($exprS.i));
        Vt.replace($exprS.i, $exprI.i);
        System.out.println("This is your map: " + Vt.get($exprS.i));
        } sExprM
    | exprS DD e2=('TRUE'|'FALSE'|'true'|'false') ';'  
    {  
        if($e2.equals("true"))
        {
            Vb.replace($exprS.i, true);
        }
         if($e2.equals("TRUE"))
        {
            Vb.replace($exprS.i, true);
        }
        if($e2.equals("false"))
        {
            Vb.replace($exprS.i, false);
        }
        if($e2.equals("FALSE"))
        {
            Vb.replace($exprS.i, false);
        }
        }sExprM
    ;

varDef: 
    |varDef2 varDef2
    ;

wrT:
    | 'writeln(' exprW2 ');' 
            {System.out.println($exprW2.i);
            } sExprM 
    | 'readln(' exprR ');'
             sExprM 
    ;

// wrT:
//     | 'writeln(\'' exprW '\');' 
//             {System.out.println($exprW.i);
//             } sExprM 
//     | 'readln(' exprR ');'
//              sExprM 
//     ;

ifelse:
    | 'if' '(' cond ')' 'then' e=sExprM 'else' el=sExprM ';' {System.out.println($cond.i);
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

sExpr: expr ';';

expr:
    '(' expr ')'
    | expr '*' expr
    | expr '+' expr
    | ID
    | INT
    ;

exprS returns[String i]:
    | ID { $i = $ID.text; }
    ;

exprR:
    |exprR ',' exprR
    |exprW {
                String e2 = myObj.nextLine();
                System.out.println("This is read "+ $exprW.i + " " + e2);
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
                {Vb.replace($exprW.i, isT);}
                else
                {Double isD = Double.parseDouble(e2);
                Vt.replace($exprW.i, isD);}
            }
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
    | ID { $i = Vt.get($ID.text);}
    | INT {$i = Double.parseDouble($INT.text);}
    ;



exprW2 returns[String i]:
    '\''exprW'\'' {$i = $exprW.i;}
    | exprS {if(Vb.get($exprS.i)!=null)
        {$i = $exprS.i;}
        else
        {
            $i = Double.toString(Vt.get($exprS.i));
        }}
    ;

exprW returns[String i]:
    '(' e=exprW ')' {$i= "";$i+=$e.i;}
    | e=exprW ' ' e2=exprW {$i= "";$i+=$e.i; $i+=" "; $i+=$e2.i;}
    | e=exprW '!'{$i =""; $i+=$e.i; $i+="!";}
    | ID {$i = $ID.text;}
    ;


//tokens
DD: ':=';
CO1: '(''*';
CO2: '*'')';
PARO: '(';
PARC: ')';
SEMC: ';';
BO1: 'TRUE';
BO2: 'FALSE';
BO3: 'true';
BO4: 'false';
PO: 'program';
ID: [_A-Za-z][_A-Za-z0-9!]*;
INT: [0-9]+ ;
//BOOL: ;
WS : [ \t\r\n]+ -> skip ;

//lexer
//parser ==> 
//lexer +  parser turn your code into a tree;  
//interpreter