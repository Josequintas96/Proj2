// Generated from PascalGrammar.g4 by ANTLR 4.8

import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Iterator;
import java.lang.Math; 


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PascalGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PascalGrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#progI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgI(PascalGrammarParser.ProgIContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#varDef2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef2(PascalGrammarParser.VarDef2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PascalGrammarParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#main_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_p(PascalGrammarParser.Main_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#sExprM}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSExprM(PascalGrammarParser.SExprMContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#varWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarWork(PascalGrammarParser.VarWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#wrT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrT(PascalGrammarParser.WrTContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(PascalGrammarParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#sExprI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSExprI(PascalGrammarParser.SExprIContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#wrT2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrT2(PascalGrammarParser.WrT2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#exprR2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprR2(PascalGrammarParser.ExprR2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#varWork2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarWork2(PascalGrammarParser.VarWork2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(PascalGrammarParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#exprW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprW(PascalGrammarParser.ExprWContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#exprR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprR(PascalGrammarParser.ExprRContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#exprS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprS(PascalGrammarParser.ExprSContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#exprI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprI(PascalGrammarParser.ExprIContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PascalGrammarParser.ExprContext ctx);
}