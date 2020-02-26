import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.*;
import java.io.*;

public class EvalVisitor extends PascalGrammarBaseVisitor<Value> {
        // used to compare floating point numbers
        public static final double SMALL_VALUE = 0.00000000001;

        // store variables (there's only one global scope!)
		private Map<String, Value> memory = new HashMap<String, Value>();
		Scanner scan = new Scanner(System.in);  


        	//public Vector Scope = new vector(Map<String, Double> memoryI = new HashMap<String, Double>());
	 //public Map<String, Double> memoryI = new HashMap<String, Double>();
     //ublic Map<String, Value> memoryI = new HashMap<String, Value>();
     //private Map<String, Boolean> memoryB = new HashMap<String, Boolean>();

    @Override public Value visitProgram(PascalGrammarParser.ProgramContext ctx) 
        {
            System.out.println("Start of Program" + ctx);
            return visitChildren(ctx); 
        }
	@Override public Value visitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitIdentifier(PascalGrammarParser.IdentifierContext ctx) { 
        //system.out.println(ctx.getText());
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
	
    @Override public Value visitUnsignedInteger(PascalGrammarParser.UnsignedIntegerContext ctx) 
    { 
        return new Value(Double.valueOf(ctx.getText()));
    } 
	
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
	
	@Override public Value visitVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx) 
        { 
			/*
            System.out.println("Variable Declaration Part");
            System.out.println("Type of variable: " + ctx.type().getText());
			System.out.println("Name of variable: " + ctx.identifierList().getText());
			*/
            String id = ctx.type().getText();
            String nameT = ctx.identifierList().getText();
            if(id.equals("real"))
            {
				Value vTT = new Value(0.0);

				/*
				memoryI.put(nameT,0.0);
				memory.put(id,value);
				System.out.println("This is value "+ memoryI.get(nameT));
                System.out.println("This is string "+ nameT);
				System.out.println("This is value2 "+ memoryI.get("alta"));
				*/

				memory.put(nameT,vTT);
				Value vTT2 = memory.get(nameT);
                System.out.println("This is string "+ nameT + " and its value "+ vTT2.asDouble());
                //HelloT();
    
            };
            if(id.equals("boolean"))
            {
				//memoryB.put(nameT, true);
				Value vTT = new Value(true);

				memory.put(nameT,vTT);
				
				// System.out.println("This is string "+ nameT + " and its value "+ memory.get(nameT));
				Value vTT2 = memory.get(nameT);
                System.out.println("This is string "+ nameT + " and its value "+ vTT2.asString());
                HelloT();

            };

            
        
        return visitChildren(ctx); 
    }
	
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
        //system.out.println("expresssion: " + ctx.expression().getText());
        return visitChildren(ctx); }
	
	@Override public Value visitVariable(PascalGrammarParser.VariableContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitExpression(PascalGrammarParser.ExpressionContext ctx) { 
        //system.out.print("visitExpression: " + visitChildren(ctx));
        return visitChildren(ctx); }
	
	@Override public Value visitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx) 
    {   //if(ctx.)

  
            ////system.out.println("VC: " + visitChildren(ctx.term()));
        //while(shouldVisitNextChild(ctx))
        //{
        ////system.out.print("visitChild" + visitChildren(ctx));
        //}
        if(ctx.additiveoperator() != null)
        {
            ////system.out.println("visitTerm" + ctx.term().getText());
            ////system.out.println("visitTerm" + ctx.term.getType());
            ////system.out.println("visitadditiveoperator" + ctx.additiveoperator().getText());
            ////system.out.println("visitSimpleExpression" + ctx.simpleExpression().getText());

            Value left = visitChildren(ctx.term());
            Value sign = visitChildren(ctx.additiveoperator());
            Value right = visitChildren(ctx.simpleExpression());//.getText());
            ////system.out.println("1" + left.asString());
            ////system.out.println("hi" + sign.asString());
            ////system.out.println("2" + right.asString());
            if (ctx.additiveoperator().getText().compareTo("+") == 0){
                
                Double ans = left.asDouble() + right.asDouble();
                //system.out.println("ans: " + ans);
                return new Value(ans);
            }
            else if(ctx.additiveoperator().getText().compareTo("-") == 0)
            {
                ////system.out.println("got Here");
                ////system.out.println(left.asDouble());
                ////system.out.println(right.asDouble());
                Double ans = left.asDouble() - right.asDouble();
                //system.out.println("ans: " + ans);
                return new Value(ans);
            }
            else if(ctx.additiveoperator().getText().compareTo("or") == 0)
            {
                Value ans;
                if(left.asBoolean() || right.asBoolean())
                {
                    ans = new Value(true);
                }
                else
                {
                    ans = new Value(false);
                }
                //system.out.println("ans: " + ans);
                return ans;
            }
            else{
                ////system.out.println("visitSimpleExpressionWRRROOOONNGG22222 :  " + ctx);
                return visitChildren(ctx);
            }
        }    
        else
        {
            ////system.out.println("visitSimpleExpressionWRRROOOONNGG :  " + ctx);
        return visitChildren(ctx); }
    }
	
	@Override public Value visitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx) { 
            return visitChildren(ctx); 
        }
	
	@Override public Value visitTerm(PascalGrammarParser.TermContext ctx) { 
        if(ctx.multiplicativeoperator() != null)
        {
            Value left = visitChildren(ctx.signedFactor());
            Value sign = visitChildren(ctx.multiplicativeoperator());
            Value right = visitChildren(ctx.term());
            if (ctx.multiplicativeoperator().getText().compareTo("*") == 0){
                
                Double ans = left.asDouble() * right.asDouble();
                return new Value(ans);
            }
            else if(ctx.multiplicativeoperator().getText().compareTo("/") == 0)
            {
                Double ans = left.asDouble() / right.asDouble();
                return new Value(ans);
            }
            else if(ctx.multiplicativeoperator().getText().compareTo("DIV") == 0)
            {
                Double ans = left.asDouble() / right.asDouble();

                return new Value(ans);
            }
            else if(ctx.multiplicativeoperator().getText().compareTo("MOD") == 0)
            {
                Double ans = left.asDouble() % right.asDouble();
                return new Value(ans);
            }
            else if(ctx.multiplicativeoperator().getText().compareTo("AND") == 0)
            {
                Value ans;
                if(left.asBoolean() && right.asBoolean())
                {
                    ans = new Value(true);
                }
                else
                {
                    ans = new Value(false);
                }
                //system.out.println("ans: " + ans);
                return ans;
            }
            else{
                //system.out.println("No Expression Matched for Multiplicativeoperator :  " + ctx);
                return visitChildren(ctx);
            }
        }    
        else
        {
        return visitChildren(ctx); }
    }
	
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
	
	@Override public Value visitParameterList(PascalGrammarParser.ParameterListContext ctx) 
	{ 
		//System.out.println("Visit Parameter");
		return visitChildren(ctx); 
	}
	
	@Override public Value visitSet(PascalGrammarParser.SetContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitElementList(PascalGrammarParser.ElementListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitElement(PascalGrammarParser.ElementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx) 
    { 
		
		//System.out.println("Visit Procedure Statement");
		String identifier = ctx.identifier().getText();
		if(identifier.equals("writeln"))
		{
			/*
			//String ss1 = ctx.parameterList().actualParameter().getText();
			//String ss2 = String.valueOf(ctx.parameterList().actualparameter().getText());
			//System.out.println("Hello Worlds:  " +  "   "+ ss1);
			System.out.println(ctx.parameterList().getText());
			Value val = visitChildren(ctx.parameterList()); 
			System.out.println("This is the value: " + val.asString());
			*/
			int i =0;
			String answ = "";
			while(ctx.parameterList().actualParameter(i) != null)
			{
				
				// Vy; //= new Value(cc);
				String key = ctx.parameterList().actualParameter(i).getText();
				if(memory.get(key) != null )
				{
					//System.out.println("not null");
					Value Vy = memory.get(key);
					answ += Vy.asString();
				}
				else
				{
					Value Vy = new Value(ctx.parameterList().actualParameter(i).getText());
					answ += Vy.asString();
				}
				//System.out.println("number: " + i + " and key is: " + key);
				//visitChildren(ctx);
				i++;
			}
				System.out.println(answ);
			return null;
		//return visitChildren(ctx); 
		}


		if(identifier.equals("readln"))
		{
			//System.out.println(ctx.identifier().getText());
			int i =0;
			while(ctx.parameterList().actualParameter(i) != null)
			{
				String cc;
				cc = scan.nextLine(); 
				Value Vy = new Value(cc);
				String key = ctx.parameterList().actualParameter(i).getText();
				//System.out.println("number: " + i + " and key is: " + key);
				memory.replace(key, Vy);
				//visitChildren(ctx);
				i++;
			}
			//HelloT();
			return null;
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
		//System.out.println("Visit ActualParameter");
		//String X = 
		if(memory.get(ctx.getText() ) != null )
		{
			System.out.println("not null");
			return memory.get(ctx.getText());
		}
		System.out.println("NULL");
		return visitChildren(ctx); 
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
	
    @Override public Value visitForStatement(PascalGrammarParser.ForStatementContext ctx) 	
    { 
		String VforI = String.valueOf(ctx.identifier().getText());
		//System.out.println("For statement");
		//System.out.println(VforI);
		Double InitialV = Double.parseDouble(String.valueOf(ctx.forList().initialValue().getText()));
		//system.out.println("This is a double: " + InitialV);
		//for(int x = InitialValueS)
		Double FinalV = Double.parseDouble(String.valueOf(ctx.forList().finalValue().getText()));
		for(double x = InitialV; x < FinalV; x++)
		{
			visitChildren(ctx.statement()); 
			//System.out.println(x);
		}
		//return visitChildren(ctx.statement()); 
		return null;
	}
	
	@Override public Value visitForList(PascalGrammarParser.ForListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitInitialValue(PascalGrammarParser.InitialValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFinalValue(PascalGrammarParser.FinalValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitWithStatement(PascalGrammarParser.WithStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx) { return visitChildren(ctx); }

	
	
	
	public void HelloT()
    {
        System.out.println("Hello");
        Iterator hmIterator = memory.entrySet().iterator(); 
        int i =0;
        // Iterate through the hashmap 
        // and add some bonus marks for every student 
        System.out.println("HashMap after adding bonus marks:"); 
  
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            Value marks = ((Value)mapElement.getValue()); 
            System.out.println(mapElement.getKey() + " : " + marks.asString()); 
            System.out.println(i);
            i++;
        } 
    }

}
