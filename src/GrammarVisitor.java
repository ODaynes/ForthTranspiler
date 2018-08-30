// Generated from C:/Users/Owen Daynes/Documents/CE305/CE305Assignment2/src\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleStatement}
	 * labeled alternative in {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(GrammarParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiStatement}
	 * labeled alternative in {@link GrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStatement(GrammarParser.MultiStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(GrammarParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareStatement(GrammarParser.CompareStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithStatement}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithStatement(GrammarParser.ArithStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_arith(GrammarParser.Var_arithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_arith(GrammarParser.Float_arithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_arith}
	 * labeled alternative in {@link GrammarParser#arithmetic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_arith(GrammarParser.Int_arithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varNegative}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNegative(GrammarParser.VarNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varMultiplication}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMultiplication(GrammarParser.VarMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAddition}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAddition(GrammarParser.VarAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varBracketed}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBracketed(GrammarParser.VarBracketedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link GrammarParser#variable_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_identifier}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_identifier(GrammarParser.Int_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAddition}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAddition(GrammarParser.IntAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intNegative}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntNegative(GrammarParser.IntNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intBracketed}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntBracketed(GrammarParser.IntBracketedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(GrammarParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intMultiplication}
	 * labeled alternative in {@link GrammarParser#int_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntMultiplication(GrammarParser.IntMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatMuplitication}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatMuplitication(GrammarParser.FloatMupliticationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatNegative}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatNegative(GrammarParser.FloatNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_identifier}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_identifier(GrammarParser.Float_identifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(GrammarParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatAddition}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAddition(GrammarParser.FloatAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatBracketed}
	 * labeled alternative in {@link GrammarParser#float_arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatBracketed(GrammarParser.FloatBracketedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanEquals}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanEquals(GrammarParser.BooleanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanOr}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOr(GrammarParser.BooleanOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanBracketed}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanBracketed(GrammarParser.BooleanBracketedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanNotEquals}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanNotEquals(GrammarParser.BooleanNotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanNegative}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanNegative(GrammarParser.BooleanNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAnd}
	 * labeled alternative in {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAnd(GrammarParser.BooleanAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareAndAssignExpr}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndAssignExpr(GrammarParser.DeclareAndAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareAndAssignFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndAssignFloat(GrammarParser.DeclareAndAssignFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareAndAssignInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndAssignInt(GrammarParser.DeclareAndAssignIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignVariableResult}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariableResult(GrammarParser.AssignVariableResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignBoolean}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBoolean(GrammarParser.AssignBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFloat(GrammarParser.AssignFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInt(GrammarParser.AssignIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareBoolean}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareBoolean(GrammarParser.DeclareBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareFloat}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareFloat(GrammarParser.DeclareFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareInt}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareInt(GrammarParser.DeclareIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComparison(GrammarParser.IdentifierComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithComparison(GrammarParser.ArithComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanComparison}
	 * labeled alternative in {@link GrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanComparison(GrammarParser.BooleanComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignArithmetic}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArithmetic(GrammarParser.AssignArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignComparison}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignComparison(GrammarParser.AssignComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(GrammarParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardIf}
	 * labeled alternative in {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardIf(GrammarParser.StandardIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standardWhile}
	 * labeled alternative in {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardWhile(GrammarParser.StandardWhileContext ctx);
}