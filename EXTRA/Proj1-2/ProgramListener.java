// Generated from Program.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ProgramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ProgramParser.ProgContext ctx);
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
	 * Enter a parse tree produced by {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ProgramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ProgramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ProgramParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ProgramParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ProgramParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ProgramParser.AssignmentContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ProgramParser#rel_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_expr(ProgramParser.Rel_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#rel_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_expr(ProgramParser.Rel_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#eq_expr}.
	 * @param ctx the parse tree
	 */
	void enterEq_expr(ProgramParser.Eq_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#eq_expr}.
	 * @param ctx the parse tree
	 */
	void exitEq_expr(ProgramParser.Eq_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(ProgramParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(ProgramParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(ProgramParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(ProgramParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(ProgramParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(ProgramParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ProgramParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ProgramParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ProgramParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ProgramParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ProgramParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ProgramParser.NumberContext ctx);
}