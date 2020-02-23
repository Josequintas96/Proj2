// Generated from PascalGrammar.g4 by ANTLR 4.8

import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Iterator;
import java.lang.Math; 


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalGrammarParser}.
 */
public interface PascalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PascalGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PascalGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#progI}.
	 * @param ctx the parse tree
	 */
	void enterProgI(PascalGrammarParser.ProgIContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#progI}.
	 * @param ctx the parse tree
	 */
	void exitProgI(PascalGrammarParser.ProgIContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void enterVarDef2(PascalGrammarParser.VarDef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void exitVarDef2(PascalGrammarParser.VarDef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(PascalGrammarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(PascalGrammarParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#main_p}.
	 * @param ctx the parse tree
	 */
	void enterMain_p(PascalGrammarParser.Main_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#main_p}.
	 * @param ctx the parse tree
	 */
	void exitMain_p(PascalGrammarParser.Main_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#sExprM}.
	 * @param ctx the parse tree
	 */
	void enterSExprM(PascalGrammarParser.SExprMContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#sExprM}.
	 * @param ctx the parse tree
	 */
	void exitSExprM(PascalGrammarParser.SExprMContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#varWork}.
	 * @param ctx the parse tree
	 */
	void enterVarWork(PascalGrammarParser.VarWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#varWork}.
	 * @param ctx the parse tree
	 */
	void exitVarWork(PascalGrammarParser.VarWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#wrT}.
	 * @param ctx the parse tree
	 */
	void enterWrT(PascalGrammarParser.WrTContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#wrT}.
	 * @param ctx the parse tree
	 */
	void exitWrT(PascalGrammarParser.WrTContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(PascalGrammarParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(PascalGrammarParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#sExprI}.
	 * @param ctx the parse tree
	 */
	void enterSExprI(PascalGrammarParser.SExprIContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#sExprI}.
	 * @param ctx the parse tree
	 */
	void exitSExprI(PascalGrammarParser.SExprIContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#wrT2}.
	 * @param ctx the parse tree
	 */
	void enterWrT2(PascalGrammarParser.WrT2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#wrT2}.
	 * @param ctx the parse tree
	 */
	void exitWrT2(PascalGrammarParser.WrT2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#exprR2}.
	 * @param ctx the parse tree
	 */
	void enterExprR2(PascalGrammarParser.ExprR2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#exprR2}.
	 * @param ctx the parse tree
	 */
	void exitExprR2(PascalGrammarParser.ExprR2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#varWork2}.
	 * @param ctx the parse tree
	 */
	void enterVarWork2(PascalGrammarParser.VarWork2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#varWork2}.
	 * @param ctx the parse tree
	 */
	void exitVarWork2(PascalGrammarParser.VarWork2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(PascalGrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(PascalGrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#exprW}.
	 * @param ctx the parse tree
	 */
	void enterExprW(PascalGrammarParser.ExprWContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#exprW}.
	 * @param ctx the parse tree
	 */
	void exitExprW(PascalGrammarParser.ExprWContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#exprR}.
	 * @param ctx the parse tree
	 */
	void enterExprR(PascalGrammarParser.ExprRContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#exprR}.
	 * @param ctx the parse tree
	 */
	void exitExprR(PascalGrammarParser.ExprRContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#exprS}.
	 * @param ctx the parse tree
	 */
	void enterExprS(PascalGrammarParser.ExprSContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#exprS}.
	 * @param ctx the parse tree
	 */
	void exitExprS(PascalGrammarParser.ExprSContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#exprI}.
	 * @param ctx the parse tree
	 */
	void enterExprI(PascalGrammarParser.ExprIContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#exprI}.
	 * @param ctx the parse tree
	 */
	void exitExprI(PascalGrammarParser.ExprIContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PascalGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PascalGrammarParser.ExprContext ctx);
}