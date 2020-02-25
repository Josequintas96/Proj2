
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class EvalVisitor extends PascalGrammarBaseVisitor< Value >
{


    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();
    public Map<String, Double> memoryI = new HashMap<String, Double>();
    //ublic Map<String, Value> memoryI = new HashMap<String, Value>();
    private Map<String, Boolean> memoryB = new HashMap<String, Boolean>();


    @Override public Value visitProgram(PascalGrammarParser.ProgramContext ctx) 
    {
		System.out.println("Start of Program");
		//System.out.println(ctx.getText());
        //System.out.println(ctx.programHeading().identifier().getText());
        String zep= ctx.programHeading().getText();
        System.out.println(zep);
         return visitChildren(ctx); 
    }
	@Override public Value visitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx) 
	{ 
		System.out.println("Program Heading");
        
        System.out.println(ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public Value visitIdentifier(PascalGrammarParser.IdentifierContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitBlock(PascalGrammarParser.BlockContext ctx) 
	{ 
		System.out.println("Block");
		System.out.println(ctx.getText());
		return visitChildren(ctx); 
	}
	
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
	
	@Override public Value visitVariableDeclarationPart(PascalGrammarParser.VariableDeclarationPartContext ctx) 
	{ 
		System.out.println("Variable Declaration Part");
		return visitChildren(ctx); 
	}
	
    @Override public Value visitVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx) 
    { 
        System.out.println("Variable Declaration Part");
        System.out.println("Type of variable: " + ctx.type().getText());
        System.out.println("Name of variable: " + ctx.identifierList().getText());
		String id = ctx.type().getText();
		String nameT = ctx.identifierList().getText();
        if(id.equals("real"))
        {
            //System.out.println("It is real");
            Value value = this.visit(ctx.type());
            //String SS = "h";// = value.asString();
            //String SS = value.asString();
            //int i =0;
            //Value value = (Value)null;
            //memoryI.put("alta", 0.0);
			memoryI.put(nameT,0.0);
			memory.put(id,value);
            //System.out.println("This is value "+memoryI.get("alta"));
			System.out.println("This is value "+ memoryI.get(nameT));
			System.out.println("This is string "+ nameT);
			System.out.println("This is value2 "+ memoryI.get("alta"));
			//System.out.println("This is value "+ memory.get(id).asString());
            //HelloT();

        };
        if(id.equals("boolean"))
        {
            //System.out.println("It is boolean");
            //Value value = this.visit(ctx.identifierList());
            memoryB.put(nameT, true);
        };
        
        return visitChildren(ctx); }
	
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
	
	@Override public Value visitAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitVariable(PascalGrammarParser.VariableContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitExpression(PascalGrammarParser.ExpressionContext ctx) 
    { 
        System.out.println("Visit Expression");
        System.out.println(ctx.getText());
        return visitChildren(ctx); 
    }
	
	@Override public Value visitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx)
    { 
        System.out.println("Visit Simple Expression");
        System.out.println(ctx.getText());
        return visitChildren(ctx); 
    }
	
	@Override public Value visitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitTerm(PascalGrammarParser.TermContext ctx) 
    { 
        System.out.println("Visit Term");
        System.out.println(ctx.getText());
        //System.out.println(ctx.Value.asDouble());
     return visitChildren(ctx); 
    }
	
    @Override public Value visitFactor(PascalGrammarParser.FactorContext ctx) 
    { 
        System.out.println("Visit Factor");
        System.out.println(ctx.getText());
        return visitChildren(ctx); 
    }
	
    @Override public Value visitUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx) 
    { 
        System.out.println("Visit Indigned Constant");
        System.out.println(ctx.getText());
        return visitChildren(ctx); }
	
	@Override public Value visitFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitParameterList(PascalGrammarParser.ParameterListContext ctx) 
	{ 
		System.out.println("Visit ParameterList");
		//return visitChildren(ctx); 
		Value pepe = visitChildren(ctx);
		String ppr = ctx.COMMA().getText();
		System.out.println(pepe.asString()+ ppr);
		
		//return visitChildren(ctx); 
		return pepe;
		//return new Value(String.valueOf(ctx.getText()));
	}
	
	@Override public Value visitSet(PascalGrammarParser.SetContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitElementList(PascalGrammarParser.ElementListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitElement(PascalGrammarParser.ElementContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx) 
    { 
		
		System.out.println("Visit Procedure Statement");
		String identifier = ctx.identifier().getText();
		if(identifier.equals("writeln"))
		{
		System.out.println(ctx.identifier().getText());
		return visitChildren(ctx); 
		}
		return visitChildren(ctx);
		/*
		System.out.println("Visit Procedure Statement");
		Value pepe2 = visitChildren(ctx); 
		System.out.println(pepe2.asString());
		return pepe2;
		*/
	}
	
	@Override public Value visitActualParameter(PascalGrammarParser.ActualParameterContext ctx) 
	{ 
		//System.out.println("Actual Parameter List: ");
		//return visitChildren(ctx); 
		return new Value(String.valueOf(ctx.getText()));
	}
	
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



    public void HelloT()
    {
        System.out.println("Hello");
        Iterator hmIterator = memoryI.entrySet().iterator(); 
        int i =0;
        // Iterate through the hashmap 
        // and add some bonus marks for every student 
        System.out.println("HashMap after adding bonus marks:"); 
  
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            Double marks = ((Double)mapElement.getValue()); 
            System.out.println(mapElement.getKey() + " : " + marks); 
            System.out.println(i);
            i++;
        } 
    }

}