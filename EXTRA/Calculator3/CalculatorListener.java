// Generated from Calculator.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CalculatorParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CalculatorParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CalculatorParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CalculatorParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void enterVarDef2(CalculatorParser.VarDef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void exitVarDef2(CalculatorParser.VarDef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#sExp}.
	 * @param ctx the parse tree
	 */
	void enterSExp(CalculatorParser.SExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#sExp}.
	 * @param ctx the parse tree
	 */
	void exitSExp(CalculatorParser.SExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
}