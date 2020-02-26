

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
//grun PascalGrammar program -gui tests/test1.pas



public class PascalGrammar{
    public static void main(String args[]) throws Exception
    {
        PascalGrammarLexer lex = new PascalGrammarLexer(new ANTLRFileStream(args[0]));
        //CommonTokenStream tok = new CommonTokenStream(lex);

        PascalGrammarParser parser = new PascalGrammarParser(new CommonTokenStream(lex));
        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
        //System.out.println(new MyVisitor().visit(tree));
    }
}




/*
class MyVisitor extends PascalGrammarBaseVisitor< Integer >
{
    @Override public Integer visitProgram(PascalGrammarParser.ProgramContext ctx) 
    {
        System.out.println("Start of Program");
         return visitChildren(ctx); 
    }
	@Override public Integer visitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitIdentifier(PascalGrammarParser.IdentifierContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitBlock(PascalGrammarParser.BlockContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitUsesUnitsPart(PascalGrammarParser.UsesUnitsPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitLabelDeclarationPart(PascalGrammarParser.LabelDeclarationPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitLabel(PascalGrammarParser.LabelContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitConstantDefinitionPart(PascalGrammarParser.ConstantDefinitionPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitConstantDefinition(PascalGrammarParser.ConstantDefinitionContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitConstantChr(PascalGrammarParser.ConstantChrContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitConstant(PascalGrammarParser.ConstantContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitUnsignedNumber(PascalGrammarParser.UnsignedNumberContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitUnsignedInteger(PascalGrammarParser.UnsignedIntegerContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitUnsignedReal(PascalGrammarParser.UnsignedRealContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSign(PascalGrammarParser.SignContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitBool(PascalGrammarParser.BoolContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitString(PascalGrammarParser.StringContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitTypeDefinitionPart(PascalGrammarParser.TypeDefinitionPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitTypeDefinition(PascalGrammarParser.TypeDefinitionContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFunctionType(PascalGrammarParser.FunctionTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitProcedureType(PascalGrammarParser.ProcedureTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitType(PascalGrammarParser.TypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSimpleType(PascalGrammarParser.SimpleTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitScalarType(PascalGrammarParser.ScalarTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSubrangeType(PascalGrammarParser.SubrangeTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitTypeIdentifier(PascalGrammarParser.TypeIdentifierContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitStructuredType(PascalGrammarParser.StructuredTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitUnpackedStructuredType(PascalGrammarParser.UnpackedStructuredTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitStringtype(PascalGrammarParser.StringtypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitArrayType(PascalGrammarParser.ArrayTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitTypeList(PascalGrammarParser.TypeListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitIndexType(PascalGrammarParser.IndexTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitComponentType(PascalGrammarParser.ComponentTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitRecordType(PascalGrammarParser.RecordTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFieldList(PascalGrammarParser.FieldListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFixedPart(PascalGrammarParser.FixedPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitRecordSection(PascalGrammarParser.RecordSectionContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitVariantPart(PascalGrammarParser.VariantPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitTag(PascalGrammarParser.TagContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitVariant(PascalGrammarParser.VariantContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSetType(PascalGrammarParser.SetTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitBaseType(PascalGrammarParser.BaseTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFileType(PascalGrammarParser.FileTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitPointerType(PascalGrammarParser.PointerTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitVariableDeclarationPart(PascalGrammarParser.VariableDeclarationPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitProcedureAndFunctionDeclarationPart(PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitProcedureOrFunctionDeclaration(PascalGrammarParser.ProcedureOrFunctionDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitProcedureDeclaration(PascalGrammarParser.ProcedureDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFormalParameterList(PascalGrammarParser.FormalParameterListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFormalParameterSection(PascalGrammarParser.FormalParameterSectionContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitParameterGroup(PascalGrammarParser.ParameterGroupContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitIdentifierList(PascalGrammarParser.IdentifierListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitConstList(PascalGrammarParser.ConstListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFunctionDeclaration(PascalGrammarParser.FunctionDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitResultType(PascalGrammarParser.ResultTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitStatement(PascalGrammarParser.StatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitUnlabelledStatement(PascalGrammarParser.UnlabelledStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSimpleStatement(PascalGrammarParser.SimpleStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitVariable(PascalGrammarParser.VariableContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitExpression(PascalGrammarParser.ExpressionContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitTerm(PascalGrammarParser.TermContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitMultiplicativeoperator(PascalGrammarParser.MultiplicativeoperatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSignedFactor(PascalGrammarParser.SignedFactorContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFactor(PascalGrammarParser.FactorContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitParameterList(PascalGrammarParser.ParameterListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitSet(PascalGrammarParser.SetContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitElementList(PascalGrammarParser.ElementListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitElement(PascalGrammarParser.ElementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitActualParameter(PascalGrammarParser.ActualParameterContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitParameterwidth(PascalGrammarParser.ParameterwidthContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitGotoStatement(PascalGrammarParser.GotoStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitEmptyStatement(PascalGrammarParser.EmptyStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitEmpty(PascalGrammarParser.EmptyContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitStructuredStatement(PascalGrammarParser.StructuredStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitCompoundStatement(PascalGrammarParser.CompoundStatementContext ctx) { return visitChildren(ctx); }

	@Override public Integer visitStatements(PascalGrammarParser.StatementsContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitConditionalStatement(PascalGrammarParser.ConditionalStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitIfStatement(PascalGrammarParser.IfStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitCaseStatement(PascalGrammarParser.CaseStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitCaseListElement(PascalGrammarParser.CaseListElementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitRepetetiveStatement(PascalGrammarParser.RepetetiveStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitWhileStatement(PascalGrammarParser.WhileStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitRepeatStatement(PascalGrammarParser.RepeatStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitForStatement(PascalGrammarParser.ForStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitForList(PascalGrammarParser.ForListContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitInitialValue(PascalGrammarParser.InitialValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitFinalValue(PascalGrammarParser.FinalValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitWithStatement(PascalGrammarParser.WithStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Integer visitRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx) { return visitChildren(ctx); }
}*/