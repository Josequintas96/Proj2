import org.antlr.v4.runtime.misc.NotNull;


//import PascalGrammarParser.ElementListContext;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.lang.*;
import java.time.temporal.TemporalAccessor;
import java.io.*;
import javafx.util.Pair;

public class EvalVisitor extends PascalGrammarBaseVisitor<Value> {
        // used to compare floating point numbers
        public static final double SMALL_VALUE = 0.00000000001;

        // store variables (there's only one global scope!)
        private Map<String, PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext> functions = new HashMap<String, PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext>();
        //HashMap<String, Value> memoryX = new HashMap<String, Value>();
        Scanner scan = new Scanner(System.in);  
        private Scope scope = new Scope();
        Vector <Pair< String, Value>> temp = new Vector();

    @Override public Value visitProgram(PascalGrammarParser.ProgramContext ctx) 
        {
            System.out.println("Start of Program" + ctx);
            return visitChildren(ctx); 
        }
	@Override public Value visitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitIdentifier(PascalGrammarParser.IdentifierContext ctx) { 
        
                  
                    //System.out.println("number: " + i + " and key is: " + key);
                    //visitChildren(ctx);
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
	
    @Override public Value visitUnsignedReal(PascalGrammarParser.UnsignedRealContext ctx) 
    { 
        return new Value(Double.valueOf(ctx.getText())); 
    }
	
	@Override public Value visitSign(PascalGrammarParser.SignContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitBool(PascalGrammarParser.BoolContext ctx) { 
        //" hidsfsdf" + ctx.getText());
        return new Value(Boolean.parseBoolean(ctx.getText()));
     }
	
    @Override public Value visitString(PascalGrammarParser.StringContext ctx) 
    { 
        return new Value(ctx.getText());
     }
	
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
            //HashMap<String, Value> memoryI= new HashMap<String, Value>();
            String nameV = ctx.identifierList().getText();
            String typeV = ctx.type().getText();
            if(typeV.equals("real"))
            {
                scope.push(nameV,new Value(0.0));
            }
            if(typeV.equals("boolean"))
            {
                scope.push(nameV,new Value(true));
            }
            if(typeV.equals("string"))
            {
                scope.push(nameV,new Value(""));
            }
        return visitChildren(ctx);

    }
	
	@Override public Value visitProcedureAndFunctionDeclarationPart(PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext ctx) { 
        
        if (ctx.procedureOrFunctionDeclaration().procedureDeclaration() != null)
        {
        functions.put(ctx.procedureOrFunctionDeclaration().procedureDeclaration().identifier().getText(), ctx);
        }
        if (ctx.procedureOrFunctionDeclaration().functionDeclaration() != null)
        {
        functions.put(ctx.procedureOrFunctionDeclaration().functionDeclaration().identifier().getText(), ctx);
        }
        return null; }
	
	@Override public Value visitProcedureOrFunctionDeclaration(PascalGrammarParser.ProcedureOrFunctionDeclarationContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitProcedureDeclaration(PascalGrammarParser.ProcedureDeclarationContext ctx) 
    { 
        return visitChildren(ctx);
    }
	
	@Override public Value visitFormalParameterList(PascalGrammarParser.FormalParameterListContext ctx) { 
        
        
                return visitChildren(ctx);}
	
	@Override public Value visitFormalParameterSection(PascalGrammarParser.FormalParameterSectionContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitParameterGroup(PascalGrammarParser.ParameterGroupContext ctx) { 
        
                return visitChildren(ctx);     
            }
        
	
	@Override public Value visitIdentifierList(PascalGrammarParser.IdentifierListContext ctx) { 
        for(int i =0; i < temp.size(); i++)
        {
        Pair <String, Value> p = new Pair(ctx.identifier(i).getText(),temp.get(i).getValue());
        temp.set(i, p) ;

        }
        return visitChildren(ctx); }
	
	@Override public Value visitConstList(PascalGrammarParser.ConstListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFunctionDeclaration(PascalGrammarParser.FunctionDeclarationContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitResultType(PascalGrammarParser.ResultTypeContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitStatement(PascalGrammarParser.StatementContext ctx) { 
        Value v = visitChildren(ctx);
        if(v != null)
        {
      //  System.out.println("value at statement is: " + v.asString());
        }
        return  v;}
	
	@Override public Value visitUnlabelledStatement(PascalGrammarParser.UnlabelledStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitSimpleStatement(PascalGrammarParser.SimpleStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx) { 
 
        //System.out.println(visitChildren(ctx.expression()).asString());
        Value V = visitChildren( ctx.expression());
        //System.out.println("V is here" +V.asString());
        scope.exists(ctx.variable().getText(), V );
        return visitChildren(ctx); 
    }
	
	@Override public Value visitVariable(PascalGrammarParser.VariableContext ctx) { 
        String key = ctx.getText();
        //System.out.println(key);

        if(scope.Find(key) != null )
        {
            //System.out.println("not null");
            //System.out.println(key + "memoryStirng: " + memory.get(key).asString());
            //System.out.println("memory.get here: " +memory.get(key).asDouble());
            return scope.Find(key);
        }
        else{
        //System.out.println(key + " :That variable does not exist");
        return visitChildren(ctx);
        }
     }
	
	@Override public Value visitExpression(PascalGrammarParser.ExpressionContext ctx) { 
        //System.out.println(ctx.expression());
            //System.out.println("visit expression" +ctx.getText());
            if(ctx.relationaloperator() != null)
        {
            
            //System.out.println("in the inside IDK why this is wrong");
            Value left = visitChildren(ctx.simpleExpression());
            String sign = ctx.relationaloperator().getText();
            Value right = visitChildren(ctx.expression());//.getText());
            //System.out.println("Left is here: " + left.asString());
            //System.out.println("Sign is here: " + sign);
            //System.out.println("Right is here: " + right.asString());
            if (sign.compareTo("=") == 0){
                Value ans;
                    ans = new Value((left.asString()).equals(right.asString()));
                    //System.out.println("this is the equations: " + ans.asString());
                return ans;
            }
            
            if (sign.compareTo("<>") == 0){
                Value ans;
                ans = new Value(!(left.asString()).equals(right.asString()));
                //System.out.println("this is the equations: " + ans.asString());
            return ans;
            }
            if (sign.compareTo("<") == 0){
                Value ans;
                ans = new Value((Double.parseDouble(left.asString())) < (Double.parseDouble(right.asString())));
                //System.out.println("this is the equations: " + ans.asString());
            return ans;
            }
            if (sign.compareTo(">") == 0){
                Value ans;
                ans = new Value((Double.parseDouble(left.asString())) > (Double.parseDouble(right.asString())));
                //System.out.println("this is the equations: " + ans.asString());
            return ans;
            }
            if (sign.compareTo("<=") == 0){
                Value ans;
                ans = new Value((Double.parseDouble(left.asString())) <= (Double.parseDouble(right.asString())));
                //System.out.println("this is the equations: " + ans.asString());
            return ans;
            }
            if (sign.compareTo(">=") == 0){
                Value ans;
            ans = new Value((Double.parseDouble(left.asString())) >= (Double.parseDouble(right.asString())));
            //System.out.println("this is the equations: " + ans.asString());
            
            return ans;
            }
        //System.out.println("outside");
        }
        //System.out.println("o");
        //System.out.println("o3");
        return visitChildren(ctx); 
    }
	
	@Override public Value visitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx) { 
        //System.out.println("testing relationaloperation");
        return visitChildren(ctx); }
	
    @Override public Value visitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx) 
    {   //if(ctx.)

  
            //System.out.println("VC: " + visitChildren(ctx.term()));
        //while(shouldVisitNextChild(ctx))
        //{
        //System.out.print("visitChild" + visitChildren(ctx));
        //}
        if(ctx.additiveoperator() != null)
        {
            //System.out.println("visitTerm" + ctx.term().getText());
            //System.out.println("visitTerm" + ctx.term.getType());
            //System.out.println("visitadditiveoperator" + ctx.additiveoperator().getText());
            //System.out.println("visitSimpleExpression" + ctx.simpleExpression().getText());

            Value left = visitChildren(ctx.term());
            String sign = ctx.additiveoperator().getText();
            Value right = visitChildren(ctx.simpleExpression());//.getText());
            //System.out.println("Left is here: " + left.asString());
            //System.out.println("Sign is here: " + sign);
            //System.out.println("Right is here: " + right.asDouble());
            if (sign.compareTo("+") == 0){
                Value ans;
                //System.out.println("got to +");
                if(ctx.term().signedFactor().factor().unsignedConstant() != null)
                {
                    if(ctx.term().signedFactor().factor().unsignedConstant().string() != null)
                    {
                    //System.out.println("Adding as string");
                     ans = new Value (left.asString() + right.asString());
                     return new Value(ans);
                    }
                }
                //System.out.println("got Here");
                    ans = new Value(Double.parseDouble(left.asString()) + Double.parseDouble(right.asString()));
                
                //System.out.println("I dont know how i got here");
                //System.out.println("ans: " + ans);
                return new Value(ans);
            }
            else if(sign.compareTo("-") == 0)
            {
                //System.out.println("got Here");
                //System.out.println(left.asDouble());
                //System.out.println(right.asDouble());
                //System.out.println("Before Subtraction: " + Double.parseDouble(left.asString()) + " - " + Double.parseDouble(right.asString()));
                Value ans = new Value (Double.parseDouble(left.asString()) - Double.parseDouble(right.asString()));
                //System.out.println("Finished Subtraction: " + ans);
                return new Value(ans);
            }
            else if(sign.compareTo("or") == 0)
            {
                //System.out.println("gotHere1");
                Value ans;
                //System.out.println("gotHere2" + left);

                if(left.asBoolean() || right.asBoolean())
                {
                    //System.out.println("gotHere3");
                    ans = new Value(true);
                }
                else
                {
                    ans = new Value(false);
                }
                //System.out.println("ans: " + ans);
                return ans;
            }
            else{
                System.out.println("Incorrect Type");
                return visitChildren(ctx);
            }
        }    
        else
        {
            //System.out.println("visitSimpleExpressionWRRROOOONNGG :  " + ctx);
        return visitChildren(ctx); }
    }
	
	@Override public Value visitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx) { 
            return visitChildren(ctx); 
        }
	
	@Override public Value visitTerm(PascalGrammarParser.TermContext ctx) { 
        if(ctx.multiplicativeoperator() != null)
        {
            Value left = visitChildren(ctx.signedFactor());
            String sign = ctx.multiplicativeoperator().getText();
            Value right = visitChildren(ctx.term());
            //System.out.println("got to multiplicativeoperator");
            if (sign.compareTo("*") == 0){
               //System.out.println("left" + left.asString());
                //System.out.println("right" + right.asString());

                Double ans = Double.parseDouble(left.asString()) * Double.parseDouble(right.asString());
                //System.out.println("did the multiplication" + ans);
                return new Value(ans);
            }
            else if(sign.compareTo("/") == 0)
            {
                //System.out.println("got to division");
                Double ans = Double.parseDouble(left.asString()) / Double.parseDouble(right.asString());
                return new Value(ans);
            }
            else if(sign.compareTo("div") == 0)
            {
                Double ans = Double.parseDouble(left.asString()) / Double.parseDouble(right.asString());

                return new Value(ans);
            }
            else if(sign.compareTo("mod") == 0)
            {
                Double ans = Double.parseDouble(left.asString()) % Double.parseDouble(right.asString());
                return new Value(ans);
            }
            else if(sign.compareTo("and") == 0)
            {
                //System.out.println("gotHere1");
                Value ans;
                //System.out.println("gotHere2" + left);

                if(left.asBoolean() && right.asBoolean())
                {
                    //System.out.println("gotHere3");
                    ans = new Value(true);
                }
                else
                {
                    ans = new Value(false);
                }
                //System.out.println("ans: " + ans);
                return ans;
            }
            else{
                System.out.println("Incorrect Type");
                return visitChildren(ctx);
            }
        }    
        else
        {
        //System.out.println("o3");
        return visitChildren(ctx); }
    }
	
	@Override public Value visitMultiplicativeoperator(PascalGrammarParser.MultiplicativeoperatorContext ctx) { 
        return visitChildren(ctx); 
    }
	
	@Override public Value visitSignedFactor(PascalGrammarParser.SignedFactorContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitFactor(PascalGrammarParser.FactorContext ctx) 
    { 
        if(ctx.expression() != null)
        {
            return visitChildren(ctx.expression());
        }
        return visitChildren(ctx); 
    }
	
	@Override public Value visitUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx) 
    {         
        String identifier = ctx.identifier().getText();
        if(identifier.equals("cos"))
		{
            return new Value(Math.cos(visitChildren(ctx.parameterList()).asDouble()));
        } 
        if(identifier.equals("sin"))
		{
            return new Value(Math.sin(visitChildren(ctx.parameterList()).asDouble()));
        } 
        if(identifier.equals("sqrt"))
		{
            return new Value(Math.sqrt(visitChildren(ctx.parameterList()).asDouble()));
        } 
        if(identifier.equals("ln"))
		{
            return new Value((Math.log(visitChildren(ctx.parameterList()).asDouble())));
        } 
        if(identifier.equals("dopower"))
		{
            //System.out.println(visitChildren(ctx.parameterList().actualParameter(0)).asDouble());
            return new Value(Math.pow(visitChildren(ctx.parameterList().actualParameter(0)).asDouble(), visitChildren(ctx.parameterList().actualParameter(1)).asDouble()));
        } 
        if(functions.containsKey(identifier))
        {
            
            PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext c = functions.get(identifier);
            if(c.procedureOrFunctionDeclaration() != null)
            {
            if(c.procedureOrFunctionDeclaration().functionDeclaration() != null)
            {
                //System.out.println("got to begining of functiondeclaration");
                visitParameterList(ctx.parameterList());
                //System.out.println("create new scope for function");
                scope.newScope(1);
                scope.push(identifier,new Value(0.0));
                //System.out.println("created new scope for function");
                visitFormalParameterList(c.procedureOrFunctionDeclaration().functionDeclaration().formalParameterList());
                for(int i =0; i <temp.size(); i++)
                {   
                    
                //System.out.println("key: " + temp.elementAt(i).getKey());
                //System.out.println("value: " + temp.elementAt(i).getValue());
                    Pair< String, Value> p = new Pair(temp.elementAt(i).getKey(), temp.elementAt(i).getValue());
                    //System.out.println(p.getKey());
                    temp.set(i, p);
                    
                }
                while(temp.size() != 0)
                {
                    //System.out.println("key: " + temp.elementAt(temp.size()-1).getKey());
                    //System.out.println("value: " + temp.elementAt(temp.size()-1).getValue());
                    scope.push(temp.elementAt(temp.size()-1).getKey(), temp.elementAt(temp.size()-1).getValue());
                    temp.removeElementAt(temp.size()-1);
                }
                
                visitBlock(c.procedureOrFunctionDeclaration().functionDeclaration().block());
                //System.out.println("Delete scope for function");
                Value r = scope.Find(identifier);
                //System.out.println("o1");
                scope.pop();
                //System.out.println("o2");
                return r;
            }
                
            }
        }
        return visitChildren(ctx);
    }
	
	@Override public Value visitParameterList(PascalGrammarParser.ParameterListContext ctx) { 
        //System.out.println("at parameterList");
        int i=0;
        while(ctx.actualParameter(i) != null)
        {
        Pair <String, Value> p = new Pair("temp",visitChildren(ctx.actualParameter(i)));
        temp.add(p); 
        //System.out.println("value of new variable" + temp.get(i).getValue());
        i++;

        }
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
            int i =0;
                String answ = "";
                while(ctx.parameterList().actualParameter(i) != null)
                {
                    
                    // Vy; //= new Value(cc);
                    Value key = visitChildren(ctx.parameterList().actualParameter(i));
                    
                        answ += key.asString();
                    //System.out.println("number: " + i + " and key is: " + key);
                    //visitChildren(ctx);
                    i++;
                }
                    answ = answ.replace("\'","");
                    System.out.println(answ);
                return null;
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
                scope.replace(key, Vy);
                //visitChildren(ctx);
                i++;
            }
            return visitChildren(ctx);
        }
        //System.out.println("got heer");
        if(identifier.equals("continue"))
        {
            return new Value("continueX");
        }
        if(identifier.equals("break"))
        {
            return new Value("breakX");
        }
        if(functions.containsKey(identifier))
        {
            
            PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext c = functions.get(identifier);
            if(c.procedureOrFunctionDeclaration() != null)
            {
            if(c.procedureOrFunctionDeclaration().procedureDeclaration() != null)
            {
                
                visitChildren(c.procedureOrFunctionDeclaration().procedureDeclaration().formalParameterList());
                for(int i =0; i <temp.size(); i++)
                {
                    Pair< String, Value> p = new Pair(ctx.parameterList().actualParameter(i), temp.elementAt(i).getValue());
                    temp.set(i, p);
                    
                }
               //ln("new scope for procedureDeclaration");
                scope.newScope(1);
                while(temp.size() != 0)
                {
                scope.push(temp.elementAt(temp.size()-1).getKey(), temp.elementAt(temp.size()-1).getValue());
                    temp.removeElementAt(temp.size()-1);
                }
                Value r = visitChildren(c.procedureOrFunctionDeclaration().procedureDeclaration().block());
                //System.out.println("delete scope for procedureDeclaration");
                scope.pop();
                return r;
            }
        }
        //System.out.println("create scope for idk");
            scope.newScope(1);
            visitChildren(c);
            scope.pop();
            //System.out.println("delete scope for idk");
        }
        return visitChildren(ctx);
    }
	
    @Override public Value visitActualParameter(PascalGrammarParser.ActualParameterContext ctx) 
    { 
        { 
           
            return visitChildren(ctx); 
        }
     }
	
	@Override public Value visitParameterwidth(PascalGrammarParser.ParameterwidthContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitGotoStatement(PascalGrammarParser.GotoStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitEmptyStatement(PascalGrammarParser.EmptyStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitEmpty(PascalGrammarParser.EmptyContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitStructuredStatement(PascalGrammarParser.StructuredStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitCompoundStatement(PascalGrammarParser.CompoundStatementContext ctx) { 
        Value v = visitStatements(ctx.statements());
        if(v != null)
        {
        //System.out.println("value at compoundStatement is: " + v.asString());
        }
        return  v;} 

	@Override public Value visitStatements(PascalGrammarParser.StatementsContext ctx) { 
        int i =0;
        //System.out.println("got here");
        while(ctx.statement(i) != null)
        {   
            Value v = visitStatement(ctx.statement(i));
            //System.out.println("visited statement: " + i);
            if(v != null)
            {
                //System.out.println(v);
                if (v.asString().equals("breakX"))
                {
                    //System.out.println("There is a Break");
                    Value t = new Value("breakX");
                    return t;
                }
                if(v.asString().equals("continueX"))
                {
                    //System.out.println("There is a Continue");
                    return null;
                }
                //System.out.println(v.asString() + "value after coninue and break");
            }
            i++;
        }
    return null; }
	
	@Override public Value visitConditionalStatement(PascalGrammarParser.ConditionalStatementContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitIfStatement(PascalGrammarParser.IfStatementContext ctx) 
    { 
        //System.out.println("Visit Ifstatement");
        //System.out.println("at the if statement: " + ctx.expression().getText());
        Value host = visitExpression(ctx.expression());
        //String host = condT.asString();
		if(host.asBoolean() ==true)
		{
            //System.out.println("It is true");
			return visitChildren(ctx.statement(0));
        }
        if(host.asString().equals("false") && ctx.statement(1) != null)
		{
            //System.out.println("It is false");
			return visitChildren(ctx.statement(1));
		}
		//return visitChildren(ctx); 
        //return null;
        return visitChildren(ctx);
    }
	
	@Override public Value visitCaseStatement(PascalGrammarParser.CaseStatementContext ctx) {
         
        Value host = visitExpression(ctx.expression());
        int i =0;
        while(ctx.caseListElement(i) != null)
        {
            //System.out.println("case i equals: " + ctx.caseListElement(i).constList().getText());
            //System.out.println("host is equal to :" + host.asString());
            if(ctx.caseListElement(i).constList().getText().equals(host.asString()))
            {
                return visitChildren(ctx.caseListElement(i));
            }
            i = i+ 1;
        
        }
        return visitChildren(ctx); 
    }
	
	@Override public Value visitCaseListElement(PascalGrammarParser.CaseListElementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRepetetiveStatement(PascalGrammarParser.RepetetiveStatementContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitWhileStatement(PascalGrammarParser.WhileStatementContext ctx) 
    { 
        
        //Value Vtt = visitExpression(ctx.expression());
        //System.out.println(Vtt.asBoolean());
        scope.newScope(0);
		while(visitExpression(ctx.expression()).asBoolean() == true)
		{
            Value v = visitChildren(ctx.statement()); 
            //System.out.println(x);
            //System.out.println("almost a break but no break" + v);
            if(v != null)
            {
                //System.out.println("almost a break but no break");
                if(v.asString().equals("breakX"))
                {
                    //System.out.println("breaked in the for look");
                    return null;
                }
            }   
        }
        scope.pop();
		return null;
     }
	
	@Override public Value visitRepeatStatement(PascalGrammarParser.RepeatStatementContext ctx) { return visitChildren(ctx); }
	
    @Override public Value visitForStatement(PascalGrammarParser.ForStatementContext ctx) 	
    { 
        scope.newScope(0);
		String VforI = String.valueOf(ctx.identifier().getText());
		//System.out.println("For statement");
		//System.out.println(VforI);
        Double InitialV = Double.parseDouble(String.valueOf(ctx.forList().initialValue().getText()));
        scope.exists(VforI, new Value(InitialV));
		//System.out.println("This is a double: " + InitialV);
		//for(int x = InitialValueS)
		Double FinalV = Double.parseDouble(String.valueOf(ctx.forList().finalValue().getText()));
		for(double x = InitialV; x < FinalV; x++)
		{
            scope.exists(VforI, new Value(x));
			Value v = visitChildren(ctx.statement()); 
            //System.out.println(x);
            //System.out.println("almost a break but no break" + v);
            if(v != null)
            {
                //System.out.println("almost a break but no break");
                if(v.asString().equals("breakX"))
                {
                    //System.out.println("breaked in the for look");
                    return null;
                }
            }   
		}
        //return visitChildren(ctx.statement()); 
        scope.pop();
		return null;
	}
	
	@Override public Value visitForList(PascalGrammarParser.ForListContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitInitialValue(PascalGrammarParser.InitialValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitFinalValue(PascalGrammarParser.FinalValueContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitWithStatement(PascalGrammarParser.WithStatementContext ctx) { return visitChildren(ctx); }
	
	@Override public Value visitRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx) { return visitChildren(ctx); }
}