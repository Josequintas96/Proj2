import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//antlr4 Math.g4 -visitor
//java Math Tests/test1.txt
class MyVisitor extends MathBaseVisitor<Integer>{

    @Override public Integer visitCompileUnit(MathParser.CompileUnitContext ctx) 
    {   System.out.println("CompileUnit");
        return visitChildren(ctx); }
	
    @Override public Integer visitInfixExpr(MathParser.InfixExprContext ctx) 
    {   System.out.println("Expr");
        return visitChildren(ctx); }
	
    @Override public Integer visitUnaryExpr(MathParser.UnaryExprContext ctx) 
    {   System.out.println("UnaryExpr");
        return visitChildren(ctx); }

    @Override public Integer visitFuncExpr(MathParser.FuncExprContext ctx) 
    {   System.out.println("FunceCEXPR");
        return visitChildren(ctx); }

    @Override public Integer visitNumberExpr(MathParser.NumberExprContext ctx) 
    {   //System.out.println("NumberExpr " + ctx.getText());
        System.out.println("NumberExpr " + ctx.NUM().getText());
    
        return visitChildren(ctx); }

    @Override public Integer visitParensExpr(MathParser.ParensExprContext ctx) 
    {   System.out.println("ParensExpr");
        return visitChildren(ctx); }

}



public class Math{
    public static void main(String args[]) throws Exception
    {
        ANTLRFileStream str = new ANTLRFileStream(args[0]);
        MathLexer lex = new MathLexer(str);
        CommonTokenStream tok = new CommonTokenStream(lex);

        MathParser parser = new MathParser(tok);
        ParseTree tree = parser.compileUnit();

        System.out.println(new MyVisitor().visit(tree));

    }

}

