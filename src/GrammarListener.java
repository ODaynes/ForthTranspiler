// Generated from C:/Users/Owen Daynes/Documents/CE305/CE305Assignment2/src\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleStatement}
	 * labeled alternative in {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(GrammarParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleStatement}
	 * labeled alternative in {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(GrammarParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiStatement}
	 * labeled alternative in {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatement(GrammarParser.MultiStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiStatement}
	 * labeled alternative in {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatement(GrammarParser.MultiStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(GrammarParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(GrammarParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompareStatement(GrammarParser.CompareStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompareStatement(GrammarParser.CompareStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArithStatement(GrammarParser.ArithStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArithStatement(GrammarParser.ArithStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void enterVar_arith(GrammarParser.Var_arithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void exitVar_arith(GrammarParser.Var_arithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void enterFloat_arith(GrammarParser.Float_arithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void exitFloat_arith(GrammarParser.Float_arithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void enterInt_arith(GrammarParser.Int_arithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void exitInt_arith(GrammarParser.Int_arithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varNegative}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterVarNegative(GrammarParser.VarNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varNegative}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitVarNegative(GrammarParser.VarNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varMultiplication}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterVarMultiplication(GrammarParser.VarMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varMultiplication}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitVarMultiplication(GrammarParser.VarMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAddition}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterVarAddition(GrammarParser.VarAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAddition}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitVarAddition(GrammarParser.VarAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varBracketed}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterVarBracketed(GrammarParser.VarBracketedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varBracketed}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitVarBracketed(GrammarParser.VarBracketedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_identifier}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterInt_identifier(GrammarParser.Int_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_identifier}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitInt_identifier(GrammarParser.Int_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAddition}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntAddition(GrammarParser.IntAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAddition}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntAddition(GrammarParser.IntAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intNegative}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntNegative(GrammarParser.IntNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intNegative}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntNegative(GrammarParser.IntNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intBracketed}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntBracketed(GrammarParser.IntBracketedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intBracketed}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntBracketed(GrammarParser.IntBracketedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterInt(GrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitInt(GrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intMultiplication}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntMultiplication(GrammarParser.IntMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intMultiplication}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntMultiplication(GrammarParser.IntMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatMuplitication}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFloatMuplitication(GrammarParser.FloatMupliticationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatMuplitication}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFloatMuplitication(GrammarParser.FloatMupliticationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatNegative}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFloatNegative(GrammarParser.FloatNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatNegative}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFloatNegative(GrammarParser.FloatNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_identifier}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFloat_identifier(GrammarParser.Float_identifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_identifier}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFloat_identifier(GrammarParser.Float_identifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFloat(GrammarParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFloat(GrammarParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatAddition}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFloatAddition(GrammarParser.FloatAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatAddition}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFloatAddition(GrammarParser.FloatAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatBracketed}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterFloatBracketed(GrammarParser.FloatBracketedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatBracketed}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitFloatBracketed(GrammarParser.FloatBracketedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanEquals}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEquals(GrammarParser.BooleanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanEquals}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEquals(GrammarParser.BooleanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanOr}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOr(GrammarParser.BooleanOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanOr}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOr(GrammarParser.BooleanOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanBracketed}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBracketed(GrammarParser.BooleanBracketedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanBracketed}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBracketed(GrammarParser.BooleanBracketedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanNotEquals}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNotEquals(GrammarParser.BooleanNotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanNotEquals}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNotEquals(GrammarParser.BooleanNotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanNegative}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleanNegative(GrammarParser.BooleanNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanNegative}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleanNegative(GrammarParser.BooleanNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAnd}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAnd(GrammarParser.BooleanAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAnd}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAnd(GrammarParser.BooleanAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareAndAssignExpr}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssignExpr(GrammarParser.DeclareAndAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareAndAssignExpr}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssignExpr(GrammarParser.DeclareAndAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareAndAssignFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssignFloat(GrammarParser.DeclareAndAssignFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareAndAssignFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssignFloat(GrammarParser.DeclareAndAssignFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareAndAssignInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndAssignInt(GrammarParser.DeclareAndAssignIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareAndAssignInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndAssignInt(GrammarParser.DeclareAndAssignIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignVariableResult}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVariableResult(GrammarParser.AssignVariableResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignVariableResult}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVariableResult(GrammarParser.AssignVariableResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignBoolean}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignBoolean(GrammarParser.AssignBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignBoolean}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignBoolean(GrammarParser.AssignBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignFloat(GrammarParser.AssignFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignFloat(GrammarParser.AssignFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignInt(GrammarParser.AssignIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignInt(GrammarParser.AssignIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareBoolean}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclareBoolean(GrammarParser.DeclareBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareBoolean}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclareBoolean(GrammarParser.DeclareBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclareFloat(GrammarParser.DeclareFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclareFloat(GrammarParser.DeclareFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclareInt(GrammarParser.DeclareIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclareInt(GrammarParser.DeclareIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComparison(GrammarParser.IdentifierComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComparison(GrammarParser.IdentifierComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterArithComparison(GrammarParser.ArithComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitArithComparison(GrammarParser.ArithComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterBooleanComparison(GrammarParser.BooleanComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitBooleanComparison(GrammarParser.BooleanComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArithmetic}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignArithmetic(GrammarParser.AssignArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArithmetic}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignArithmetic(GrammarParser.AssignArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignComparison}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignComparison(GrammarParser.AssignComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignComparison}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignComparison(GrammarParser.AssignComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(GrammarParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(GrammarParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standardIf}
	 * labeled alternative in {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterStandardIf(GrammarParser.StandardIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardIf}
	 * labeled alternative in {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitStandardIf(GrammarParser.StandardIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standardWhile}
	 * labeled alternative in {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterStandardWhile(GrammarParser.StandardWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standardWhile}
	 * labeled alternative in {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitStandardWhile(GrammarParser.StandardWhileContext ctx);
}