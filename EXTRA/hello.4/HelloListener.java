// Generated from Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HelloParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HelloParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(HelloParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(HelloParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HelloParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HelloParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#rel_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_expr(HelloParser.Rel_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#rel_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_expr(HelloParser.Rel_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#eq_expr}.
	 * @param ctx the parse tree
	 */
	void enterEq_expr(HelloParser.Eq_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#eq_expr}.
	 * @param ctx the parse tree
	 */
	void exitEq_expr(HelloParser.Eq_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(HelloParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(HelloParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(HelloParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(HelloParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(HelloParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(HelloParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(HelloParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(HelloParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HelloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HelloParser.NumberContext ctx);
}