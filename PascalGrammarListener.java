// Generated from PascalGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalGrammarParser}.
 */
public interface PascalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PascalGrammarParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascalGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascalGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void enterUsesUnitsPart(PascalGrammarParser.UsesUnitsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void exitUsesUnitsPart(PascalGrammarParser.UsesUnitsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(PascalGrammarParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(PascalGrammarParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PascalGrammarParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PascalGrammarParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(PascalGrammarParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(PascalGrammarParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PascalGrammarParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PascalGrammarParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(PascalGrammarParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(PascalGrammarParser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascalGrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascalGrammarParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascalGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascalGrammarParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(PascalGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(PascalGrammarParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(PascalGrammarParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(PascalGrammarParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascalGrammarParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascalGrammarParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PascalGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PascalGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PascalGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PascalGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(PascalGrammarParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(PascalGrammarParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(PascalGrammarParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(PascalGrammarParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(PascalGrammarParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(PascalGrammarParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(PascalGrammarParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(PascalGrammarParser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(PascalGrammarParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(PascalGrammarParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(PascalGrammarParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(PascalGrammarParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(PascalGrammarParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(PascalGrammarParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(PascalGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(PascalGrammarParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(PascalGrammarParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(PascalGrammarParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(PascalGrammarParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(PascalGrammarParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(PascalGrammarParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(PascalGrammarParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PascalGrammarParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PascalGrammarParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(PascalGrammarParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(PascalGrammarParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(PascalGrammarParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(PascalGrammarParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(PascalGrammarParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(PascalGrammarParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(PascalGrammarParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(PascalGrammarParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(PascalGrammarParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(PascalGrammarParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(PascalGrammarParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(PascalGrammarParser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(PascalGrammarParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(PascalGrammarParser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(PascalGrammarParser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(PascalGrammarParser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(PascalGrammarParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(PascalGrammarParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(PascalGrammarParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(PascalGrammarParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(PascalGrammarParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(PascalGrammarParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(PascalGrammarParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(PascalGrammarParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(PascalGrammarParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(PascalGrammarParser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(PascalGrammarParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(PascalGrammarParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PascalGrammarParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PascalGrammarParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(PascalGrammarParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(PascalGrammarParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(PascalGrammarParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascalGrammarParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascalGrammarParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PascalGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PascalGrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(PascalGrammarParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(PascalGrammarParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(PascalGrammarParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(PascalGrammarParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PascalGrammarParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PascalGrammarParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(PascalGrammarParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(PascalGrammarParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PascalGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PascalGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(PascalGrammarParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(PascalGrammarParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(PascalGrammarParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(PascalGrammarParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalGrammarParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalGrammarParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascalGrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(PascalGrammarParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalGrammarParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(PascalGrammarParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(PascalGrammarParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(PascalGrammarParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascalGrammarParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascalGrammarParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(PascalGrammarParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(PascalGrammarParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascalGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascalGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PascalGrammarParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PascalGrammarParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(PascalGrammarParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(PascalGrammarParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PascalGrammarParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PascalGrammarParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascalGrammarParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(PascalGrammarParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(PascalGrammarParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(PascalGrammarParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(PascalGrammarParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(PascalGrammarParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(PascalGrammarParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalGrammarParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalGrammarParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(PascalGrammarParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(PascalGrammarParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalGrammarParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalGrammarParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalGrammarParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalGrammarParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(PascalGrammarParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(PascalGrammarParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(PascalGrammarParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(PascalGrammarParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(PascalGrammarParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(PascalGrammarParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(PascalGrammarParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(PascalGrammarParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PascalGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PascalGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(PascalGrammarParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(PascalGrammarParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascalGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascalGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PascalGrammarParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PascalGrammarParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PascalGrammarParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PascalGrammarParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PascalGrammarParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PascalGrammarParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(PascalGrammarParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(PascalGrammarParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammarParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammarParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(PascalGrammarParser.RecordVariableListContext ctx);
}