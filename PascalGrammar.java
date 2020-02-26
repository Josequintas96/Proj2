

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//antlr4 PascalGrammar.g4 -visitor
//java org.antlr.v4.Tool PascalGrammar.g4 -visitor
//javac *.java
//java PascalGrammar tests/test1.pas
//grun PascalGrammar program -gui tests/test1.pas



public class PascalGrammar{
    public static void main(String args[]) throws Exception
    {
        PascalGrammarLexer lex = new PascalGrammarLexer(new ANTLRFileStream(args[0]));
        //CommonTokenStream tok = new CommonTokenStream(lex);

        PascalGrammarParser parser = new PascalGrammarParser(new CommonTokenStream(lex));
        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
        //System.out.println(new MyVisitor().visit(tree));
    }
}