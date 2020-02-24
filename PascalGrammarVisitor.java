// Generated from PascalGrammar.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link PascalGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PascalGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PascalGrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PascalGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesUnitsPart(PascalGrammarParser.UsesUnitsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclarationPart(PascalGrammarParser.LabelDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(PascalGrammarParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(PascalGrammarParser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(PascalGrammarParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#constantChr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantChr(PascalGrammarParser.ConstantChrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PascalGrammarParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(PascalGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(PascalGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(PascalGrammarParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(PascalGrammarParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PascalGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PascalGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(PascalGrammarParser.TypeDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(PascalGrammarParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(PascalGrammarParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#procedureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureType(PascalGrammarParser.ProcedureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascalGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(PascalGrammarParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(PascalGrammarParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(PascalGrammarParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(PascalGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(PascalGrammarParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(PascalGrammarParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#stringtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringtype(PascalGrammarParser.StringtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PascalGrammarParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(PascalGrammarParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(PascalGrammarParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(PascalGrammarParser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(PascalGrammarParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(PascalGrammarParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(PascalGrammarParser.FixedPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(PascalGrammarParser.RecordSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#variantPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantPart(PascalGrammarParser.VariantPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(PascalGrammarParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(PascalGrammarParser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(PascalGrammarParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(PascalGrammarParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(PascalGrammarParser.FileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(PascalGrammarParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(PascalGrammarParser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(PascalGrammarParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PascalGrammarParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PascalGrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(PascalGrammarParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(PascalGrammarParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(PascalGrammarParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(PascalGrammarParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PascalGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(PascalGrammarParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PascalGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(PascalGrammarParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(PascalGrammarParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PascalGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PascalGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PascalGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(PascalGrammarParser.MultiplicativeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(PascalGrammarParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PascalGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(PascalGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(PascalGrammarParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(PascalGrammarParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PascalGrammarParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(PascalGrammarParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#parameterwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterwidth(PascalGrammarParser.ParameterwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(PascalGrammarParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PascalGrammarParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(PascalGrammarParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(PascalGrammarParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PascalGrammarParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PascalGrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(PascalGrammarParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PascalGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(PascalGrammarParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(PascalGrammarParser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(PascalGrammarParser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PascalGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(PascalGrammarParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PascalGrammarParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(PascalGrammarParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(PascalGrammarParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(PascalGrammarParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(PascalGrammarParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalGrammarParser#recordVariableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx);
}