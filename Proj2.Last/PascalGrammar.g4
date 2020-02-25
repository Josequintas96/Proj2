grammar PascalGrammar;

// Generate: antlr4 PascalGrammar.g4
// Compile: javac PascalGrammar*.java 
// Run: grun PascalGrammar program -gui test/input1.txt
// Run2: grun PascalGrammar varDef -tree tests/test1.txt => expression tree following varDef
// Run3: grun PascalGrammar expr -gui tests/test1.txt => print an Parse tree
// rUN4: grun PascalGrammar start -gui tests/test1.txt
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
                {Vb.put($exprS.i, truth);}
                else
                if(ill.equals("real") )
                {Vt.put($exprS.i, count);}
            } varDef2
    | comment varDef2
       
    ;

comment:
    CO1 expr CO2 
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
    | exprS DD e=('true'|'false') ';'  
    {  
        String e2 = $e.text;
        if(e2.equals("true"))
        {
            Vb.replace($exprS.i, true);
        }
        if(e2.equals("false"))
        {
            Vb.replace($exprS.i, false);
        }
        }sExprM
    | el=exprS DD e2=exprS (';') {
    String ill = $e2.i;
        //System.out.println("happen");
        if(Vb.get(ill))
        {
          //  System.out.println("happen1");
            Vb.replace(ill, true);
        }else
        {
         //   System.out.println("happen0");
            Vb.replace($el.i, false);
        }

        } sExprM
    | exprS DD exprI (';') {
        Vt.replace($exprS.i, $exprI.i);
        } sExprM
    
    ;


wrT:
    | 'writeln' PARO exprW  PARC SEMC {System.out.println($exprW.i);
            }  sExprM 
    | 'readln' PARO exprR PARC SEMC 
             sExprM 
    ;

ifelse:
    |'if' PARO e=cond PARC  'then' sExprI[$cond.i] ('else' sExprI[!$cond.i])? SEMC sExprM
    ;

sExprI[Boolean i]:
    |ifelse
    |wrT2 [$i]
    |varWork2 [$i]
    ;  

wrT2 [Boolean a]:
    | 'writeln' PARO exprW  PARC SEMC
            {  if($a){System.out.println($exprW.i);}}  
    | 'readln' PARO exprR2[$a] PARC SEMC {System.out.println($exprR2.text);}        
    ;

exprR2 [Boolean a]:
    |exprS {if($a){
                String e2 = myObj.nextLine();
                boolean isB = false;
                boolean isT = false;
                if(e2.equals("true"))
                {isB = true;isT = true;}
                if(e2.equals("false"))
                {isB = true;isT = false; }

                if(isB)
                {Vb.replace($exprS.i, isT);}
                else
                {Double isD = Double.parseDouble(e2);
                Vt.replace($exprS.i, isD);}
            }}
    ;


varWork2 [Boolean a]:
    | exprS DD e=('true'|'false') ';'  
    {  if($a){
        String e2 = $e.text;
        if(e2.equals("true"))
        {Vb.replace($exprS.i, true);}
        if(e2.equals("false"))
        {Vb.replace($exprS.i, false);}
        }}
    | exprS DD exprI (';') {if($a){
        Vt.replace($exprS.i, $exprI.i);
        } }
    ;

cond returns[Boolean i]:
    | e=exprS '=' l=exprS {
        //System.out.println("happen");
        
        if(Vb.get($e.i) == Vb.get($l.i))
                {//System.out.println("happen2");
                    $i = true;}
                else
                {//System.out.println("happen3");
                    $i = false;};}

    | 'true' {$i=true;}
    | 'false' {$i=false;}
    | ID {
        if(Vb.get($ID.text) != null){
        $i = Vb.get($ID.text);
        if($i)
        {$i = true;}
                else
                {$i = false;};
    }
    else
    {
        Double ill = Vt.get($ID.text);
        if(ill == 0)
        {$i = true;}
                else
                if(ill ==1)
                {$i = false;};
    }
    }

    ;


exprW returns[String i]:
    | e=exprW '+' el=exprW {$i=$e.i; $i+=" "; $i+=$el.i;}
    |'\''exprS'\'' {$i = $exprS.i;}
    | exprS {if(Vb.get($exprS.i)!=null)
        {if(Vb.get($exprS.i)==true)
        {
            $i = "true";
        }
        else
        {
            $i = "false";
        }}
        else
        {
            $i = Double.toString(Vt.get($exprS.i));
        }}
    ;

exprR:
    |exprR ',' exprR
    |exprS {
                String e2 = myObj.nextLine();
                boolean isB = false;
                boolean isT = false;
                if(e2.equals("true"))
                {isB = true;isT = true;}
                if(e2.equals("false"))
                {isB = true;isT = false; }

                if(isB)
                {Vb.replace($exprS.i, isT);}
                else
                {Double isD = Double.parseDouble(e2);
                Vt.replace($exprS.i, isD);}
            }
    ;



// exprS returns[String i]:
//     | e=exprS  e2=exprS {$i= "";$i+=$e.i; $i+=" "; $i+=$e2.i;}
//     | ID exprS  {$i = ""; $i += $ID.text; $i+= $exprS.i; $i +=" ";}
//     | ID { $i = $ID.text; }
//     ;

exprS returns[String i]:
    e=exprS el=exprS {$i = ""; $i +=$e.i; $i +=" "; $i += $el.i;}
    | ID {$i = $ID.text;}
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
