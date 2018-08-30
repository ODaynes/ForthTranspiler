/**
 * Created by Owen Daynes on 07/03/2018.
 */
public class ExpressionVisitor extends GrammarBaseVisitor<String> {

    // Float statement handling

//    @Override public String visitFloatExpr(GrammarParser.FloatExprContext ctx) { return visit(ctx.float_statement()); }
//
//    @Override public String visitUnaryFloatMinusExpr(GrammarParser.UnaryFloatMinusExprContext ctx) {
//        return "0 " + visit(ctx.float_statement()) + " f-" ;
//    }
//
//    @Override public String visitBracketedFloatExpr(GrammarParser.BracketedFloatExprContext ctx) {
//        return visit(ctx.float_statement());
//    }
//
//    @Override public String visitMultiplyFloatExpr(GrammarParser.MultiplyFloatExprContext ctx) {
//        return visit(ctx.float_statement(0)) + " " + visit(ctx.float_statement(1)) + " f" + ctx.op.getText();
//    }
//
//    @Override public String visitAdditionFloatExpr(GrammarParser.AdditionFloatExprContext ctx) {
//        return visit(ctx.float_statement(0)) + " " + visit(ctx.float_statement(1)) + " f" + ctx.op.getText();
//    }
//
//    @Override public String visitFloat(GrammarParser.FloatContext ctx) {
//        return ctx.getText() + "e0 ";
//    }
//
//
//    // Integer statement handling
//
//    @Override
//    public String visitIntExpr(GrammarParser.IntExprContext ctx) {
//        return visit(ctx.int_statement());
//    }
//
//    @Override
//    public String visitUnaryMinusExpr(GrammarParser.UnaryMinusExprContext ctx) {
//        return "0 " + visit(ctx.int_statement()) + " - ";
//    }
//
//    @Override
//    public String visitBracketedExpr(GrammarParser.BracketedExprContext ctx) {
//        return visit(ctx.int_statement());
//    }
//
//    @Override
//    public String visitMultiplyExpr(GrammarParser.MultiplyExprContext ctx) {
//        return visit(ctx.int_statement(0)) + " " + visit(ctx.int_statement(1)) + " " + ctx.op.getText();
//    }
//
//    @Override
//    public String visitAdditionExpr(GrammarParser.AdditionExprContext ctx) {
//        return visit(ctx.int_statement(0)) + " " + visit(ctx.int_statement(1)) + " " + ctx.op.getText();
//    }
//
//    @Override
//    public String visitInt(GrammarParser.IntContext ctx) {
//        return ctx.getText();
//    }
}
