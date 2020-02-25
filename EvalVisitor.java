

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends PascalGrammarBaseVisitor<Value> {
        // used to compare floating point numbers
        public static final double SMALL_VALUE = 0.00000000001;

        // store variables (there's only one global scope!)
        private Map<String, Value> memory = new HashMap<String, Value>();

    @Override public Value visitProgram(PascalGrammarParser.ProgramContext ctx) 
        {
            System.out.println("Start of Program" + ctx);
            return visitChildren(ctx); 
        }
	@Override public Value visitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitIdentifier(PascalGrammarParser.IdentifierContext ctx) { 
        System.out.println(ctx.getText());
        return visitChildren(ctx); }
	
	@Override public Value visitBlock(PascalGrammarParser.BlockContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitUsesUnitsPart(PascalGrammarParser.UsesUnitsPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitLabelDeclarationPart(PascalGrammarParser.LabelDeclarationPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitLabel(PascalGrammarParser.LabelContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitConstantDefinitionPart(PascalGrammarParser.ConstantDefinitionPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitConstantDefinition(PascalGrammarParser.ConstantDefinitionContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitConstantChr(PascalGrammarParser.ConstantChrContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitConstant(PascalGrammarParser.ConstantContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitUnsignedNumber(PascalGrammarParser.UnsignedNumberContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitUnsignedInteger(PascalGrammarParser.UnsignedIntegerContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitUnsignedReal(PascalGrammarParser.UnsignedRealContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitSign(PascalGrammarParser.SignContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitBool(PascalGrammarParser.BoolContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitString(PascalGrammarParser.StringContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitTypeDefinitionPart(PascalGrammarParser.TypeDefinitionPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitTypeDefinition(PascalGrammarParser.TypeDefinitionContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFunctionType(PascalGrammarParser.FunctionTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitProcedureType(PascalGrammarParser.ProcedureTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitType(PascalGrammarParser.TypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitSimpleType(PascalGrammarParser.SimpleTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitScalarType(PascalGrammarParser.ScalarTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitSubrangeType(PascalGrammarParser.SubrangeTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitTypeIdentifier(PascalGrammarParser.TypeIdentifierContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitStructuredType(PascalGrammarParser.StructuredTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitUnpackedStructuredType(PascalGrammarParser.UnpackedStructuredTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitStringtype(PascalGrammarParser.StringtypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitArrayType(PascalGrammarParser.ArrayTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitTypeList(PascalGrammarParser.TypeListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitIndexType(PascalGrammarParser.IndexTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitComponentType(PascalGrammarParser.ComponentTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRecordType(PascalGrammarParser.RecordTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFieldList(PascalGrammarParser.FieldListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFixedPart(PascalGrammarParser.FixedPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRecordSection(PascalGrammarParser.RecordSectionContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitVariantPart(PascalGrammarParser.VariantPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitTag(PascalGrammarParser.TagContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitVariant(PascalGrammarParser.VariantContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitSetType(PascalGrammarParser.SetTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitBaseType(PascalGrammarParser.BaseTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFileType(PascalGrammarParser.FileTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitPointerType(PascalGrammarParser.PointerTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitVariableDeclarationPart(PascalGrammarParser.VariableDeclarationPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitProcedureAndFunctionDeclarationPart(PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitProcedureOrFunctionDeclaration(PascalGrammarParser.ProcedureOrFunctionDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitProcedureDeclaration(PascalGrammarParser.ProcedureDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFormalParameterList(PascalGrammarParser.FormalParameterListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFormalParameterSection(PascalGrammarParser.FormalParameterSectionContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitParameterGroup(PascalGrammarParser.ParameterGroupContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitIdentifierList(PascalGrammarParser.IdentifierListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitConstList(PascalGrammarParser.ConstListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFunctionDeclaration(PascalGrammarParser.FunctionDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitResultType(PascalGrammarParser.ResultTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitStatement(PascalGrammarParser.StatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitUnlabelledStatement(PascalGrammarParser.UnlabelledStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitSimpleStatement(PascalGrammarParser.SimpleStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx) { 
        System.out.println("expresssion: " + ctx.expression().getText());
        return visitChildren(ctx); }
	
	@Override public Value visitVariable(PascalGrammarParser.VariableContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitExpression(PascalGrammarParser.ExpressionContext ctx) { 
        System.out.print("visitExpression: " + ctx.simpleExpression().getText());
        return visitChildren(ctx); }
	
	@Override public Value visitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx) 
    {   //if(ctx.)

        

        if(ctx.additiveoperator() != null)
        {
            System.out.println("visitTerm" + ctx.term().getText());
            System.out.println("visitTerm" + ctx.term().;
            System.out.println("visitadditiveoperator" + ctx.additiveoperator().getText());
            System.out.println("visitadditiveoperator" + ctx.additiveoperator().getType());
            System.out.println("visitSimpleExpression" + ctx.simpleExpression().getText());
            System.out.println("visitSimpleExpression" + ctx.simpleExpression().getType());

            if (ctx.additiveoperator().getText().compareTo("+") == 0){
                
                return(new Value (ctx.term().getText() + ctx.simpleExpression().getText()));
            }
            else if(ctx.additiveoperator().getText().compareTo("-") == 0)
            {
                return(new Value(Double.parseDouble(ctx.term().getText()) - Double.parseDouble(ctx.simpleExpression().getText())));
            }
            else{
                return visitChildren(ctx);
            }
        }    
        else
        {
            System.out.println("visitSimpleExpression: " + ctx);
        return visitChildren(ctx); }
    }
	
	@Override public Value visitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx) { 
            return visitChildren(ctx); 
        }
	
	@Override public Value visitTerm(PascalGrammarParser.TermContext ctx) { 
        //Value sign = 
        return visitChildren(ctx); }
	
	@Override public Value visitMultiplicativeoperator(PascalGrammarParser.MultiplicativeoperatorContext ctx) { 
        /*Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case MuParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case MuParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case MuParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + MuParser.tokenNames[ctx.op.getType()]);
        }*/
        return visitChildren(ctx); 
    }
	
	@Override public Value visitSignedFactor(PascalGrammarParser.SignedFactorContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFactor(PascalGrammarParser.FactorContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitParameterList(PascalGrammarParser.ParameterListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitSet(PascalGrammarParser.SetContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitElementList(PascalGrammarParser.ElementListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitElement(PascalGrammarParser.ElementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitActualParameter(PascalGrammarParser.ActualParameterContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitParameterwidth(PascalGrammarParser.ParameterwidthContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitGotoStatement(PascalGrammarParser.GotoStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitEmptyStatement(PascalGrammarParser.EmptyStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitEmpty(PascalGrammarParser.EmptyContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitStructuredStatement(PascalGrammarParser.StructuredStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitCompoundStatement(PascalGrammarParser.CompoundStatementContext ctx) { return visitChildren(ctx); }

	@Override public Value visitStatements(PascalGrammarParser.StatementsContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitConditionalStatement(PascalGrammarParser.ConditionalStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitIfStatement(PascalGrammarParser.IfStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitCaseStatement(PascalGrammarParser.CaseStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitCaseListElement(PascalGrammarParser.CaseListElementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRepetetiveStatement(PascalGrammarParser.RepetetiveStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitWhileStatement(PascalGrammarParser.WhileStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRepeatStatement(PascalGrammarParser.RepeatStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitForStatement(PascalGrammarParser.ForStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitForList(PascalGrammarParser.ForListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitInitialValue(PascalGrammarParser.InitialValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFinalValue(PascalGrammarParser.FinalValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitWithStatement(PascalGrammarParser.WithStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx) { return visitChildren(ctx); }
}