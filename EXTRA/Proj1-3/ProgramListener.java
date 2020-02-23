// Generated from Program.g4 by ANTLR 4.8

import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Iterator;
import java.lang.Math; 


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ProgramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ProgramParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ProgramParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ProgramParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#progI}.
	 * @param ctx the parse tree
	 */
	void enterProgI(ProgramParser.ProgIContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#progI}.
	 * @param ctx the parse tree
	 */
	void exitProgI(ProgramParser.ProgIContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void enterVarDef2(ProgramParser.VarDef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#varDef2}.
	 * @param ctx the parse tree
	 */
	void exitVarDef2(ProgramParser.VarDef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(ProgramParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(ProgramParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#main_p}.
	 * @param ctx the parse tree
	 */
	void enterMain_p(ProgramParser.Main_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#main_p}.
	 * @param ctx the parse tree
	 */
	void exitMain_p(ProgramParser.Main_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#sExprM}.
	 * @param ctx the parse tree
	 */
	void enterSExprM(ProgramParser.SExprMContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#sExprM}.
	 * @param ctx the parse tree
	 */
	void exitSExprM(ProgramParser.SExprMContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#varWork}.
	 * @param ctx the parse tree
	 */
	void enterVarWork(ProgramParser.VarWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#varWork}.
	 * @param ctx the parse tree
	 */
	void exitVarWork(ProgramParser.VarWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#wrT}.
	 * @param ctx the parse tree
	 */
	void enterWrT(ProgramParser.WrTContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#wrT}.
	 * @param ctx the parse tree
	 */
	void exitWrT(ProgramParser.WrTContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(ProgramParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(ProgramParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#sExprI}.
	 * @param ctx the parse tree
	 */
	void enterSExprI(ProgramParser.SExprIContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#sExprI}.
	 * @param ctx the parse tree
	 */
	void exitSExprI(ProgramParser.SExprIContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#wrT2}.
	 * @param ctx the parse tree
	 */
	void enterWrT2(ProgramParser.WrT2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#wrT2}.
	 * @param ctx the parse tree
	 */
	void exitWrT2(ProgramParser.WrT2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#varWork2}.
	 * @param ctx the parse tree
	 */
	void enterVarWork2(ProgramParser.VarWork2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#varWork2}.
	 * @param ctx the parse tree
	 */
	void exitVarWork2(ProgramParser.VarWork2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(ProgramParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(ProgramParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#exprW}.
	 * @param ctx the parse tree
	 */
	void enterExprW(ProgramParser.ExprWContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#exprW}.
	 * @param ctx the parse tree
	 */
	void exitExprW(ProgramParser.ExprWContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#exprR}.
	 * @param ctx the parse tree
	 */
	void enterExprR(ProgramParser.ExprRContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#exprR}.
	 * @param ctx the parse tree
	 */
	void exitExprR(ProgramParser.ExprRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#exprS}.
	 * @param ctx the parse tree
	 */
	void enterExprS(ProgramParser.ExprSContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#exprS}.
	 * @param ctx the parse tree
	 */
	void exitExprS(ProgramParser.ExprSContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#exprI}.
	 * @param ctx the parse tree
	 */
	void enterExprI(ProgramParser.ExprIContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#exprI}.
	 * @param ctx the parse tree
	 */
	void exitExprI(ProgramParser.ExprIContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProgramParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProgramParser.ExprContext ctx);
}