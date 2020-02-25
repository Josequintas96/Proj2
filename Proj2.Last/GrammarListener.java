// Generated from Grammar.g4 by ANTLR 4.8

import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Iterator;
import java.lang.Math; 


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#progI}.
	 * @param ctx the parse tree
	 */
	void enterProgI(GrammarParser.ProgIContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#progI}.
	 * @param ctx the parse tree
	 */
	void exitProgI(GrammarParser.ProgIContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void enterVarDef2(GrammarParser.VarDef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void exitVarDef2(GrammarParser.VarDef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(GrammarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(GrammarParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#main_p}.
	 * @param ctx the parse tree
	 */
	void enterMain_p(GrammarParser.Main_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#main_p}.
	 * @param ctx the parse tree
	 */
	void exitMain_p(GrammarParser.Main_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sExprM}.
	 * @param ctx the parse tree
	 */
	void enterSExprM(GrammarParser.SExprMContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sExprM}.
	 * @param ctx the parse tree
	 */
	void exitSExprM(GrammarParser.SExprMContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varWork}.
	 * @param ctx the parse tree
	 */
	void enterVarWork(GrammarParser.VarWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varWork}.
	 * @param ctx the parse tree
	 */
	void exitVarWork(GrammarParser.VarWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#wrT}.
	 * @param ctx the parse tree
	 */
	void enterWrT(GrammarParser.WrTContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#wrT}.
	 * @param ctx the parse tree
	 */
	void exitWrT(GrammarParser.WrTContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(GrammarParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(GrammarParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sExprI}.
	 * @param ctx the parse tree
	 */
	void enterSExprI(GrammarParser.SExprIContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sExprI}.
	 * @param ctx the parse tree
	 */
	void exitSExprI(GrammarParser.SExprIContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#wrT2}.
	 * @param ctx the parse tree
	 */
	void enterWrT2(GrammarParser.WrT2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#wrT2}.
	 * @param ctx the parse tree
	 */
	void exitWrT2(GrammarParser.WrT2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exprR2}.
	 * @param ctx the parse tree
	 */
	void enterExprR2(GrammarParser.ExprR2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exprR2}.
	 * @param ctx the parse tree
	 */
	void exitExprR2(GrammarParser.ExprR2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#varWork2}.
	 * @param ctx the parse tree
	 */
	void enterVarWork2(GrammarParser.VarWork2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#varWork2}.
	 * @param ctx the parse tree
	 */
	void exitVarWork2(GrammarParser.VarWork2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(GrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(GrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exprW}.
	 * @param ctx the parse tree
	 */
	void enterExprW(GrammarParser.ExprWContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exprW}.
	 * @param ctx the parse tree
	 */
	void exitExprW(GrammarParser.ExprWContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exprR}.
	 * @param ctx the parse tree
	 */
	void enterExprR(GrammarParser.ExprRContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exprR}.
	 * @param ctx the parse tree
	 */
	void exitExprR(GrammarParser.ExprRContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exprS}.
	 * @param ctx the parse tree
	 */
	void enterExprS(GrammarParser.ExprSContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exprS}.
	 * @param ctx the parse tree
	 */
	void exitExprS(GrammarParser.ExprSContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exprI}.
	 * @param ctx the parse tree
	 */
	void enterExprI(GrammarParser.ExprIContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exprI}.
	 * @param ctx the parse tree
	 */
	void exitExprI(GrammarParser.ExprIContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
}