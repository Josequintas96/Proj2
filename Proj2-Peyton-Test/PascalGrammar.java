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

public class PascalGrammar{
    public static void main(String args[]) throws Exception
    {
        ANTLRFileStream str = new ANTLRFileStream(args[0]);
        PascalGrammarLexer lex = new PascalGrammarLexer(str);
        CommonTokenStream tok = new CommonTokenStream(lex);

        PascalGrammarParser parser = new PascalGrammarParser(tok);
        ParseTree tree = parser.program();

		EvalVisitor visitor = new EvalVisitor();
		System.out.println( visitor.visit(tree));
		//visitor.HelloT();
		// System.out.println(new Visitor().visit(tree));
    }
}