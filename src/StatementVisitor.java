import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends GrammarBaseVisitor<String> {

    // lists to keep track of which variables have been initialised and as what

    private List<String> initialised = new ArrayList<>();
    private List<String> int_memory = new ArrayList<>();
    private List<String> float_memory = new ArrayList<>();
    private List<String> boolean_memory = new ArrayList<>();

    private List<String> variable_statements = new ArrayList<>();

    // error messages added to list if errors or inconsistencies found during code generation

    private List<String> error_list = new ArrayList<>();

    // standard getter methods to view contents of lists

    public List<String> getInitialised() {
        return initialised;
    }
    public List<String> getIntMemory() {
        return int_memory;
    }
    public List<String> getFloatMemory() {
        return float_memory;
    }
    public List<String> getBooleanMemory() {
        return boolean_memory;
    }
    public List<String> getErrorList() {
        return error_list;
    }

    // top level, all valid programs resolve to prog

    @Override
    public String visitProg(GrammarParser.ProgContext ctx) {

        String visit_result = visit(ctx.statements());

        String result = "";

        for(String res: variable_statements) {
            result += res + "\n";
        }
        result += ": main\n";
        result += visit_result;
        result += " ; \nmain";

        return result;
    }

    // Prog consists of either a single statement, or multiple statements

    @Override
    public String visitSingleStatement(GrammarParser.SingleStatementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public String visitMultiStatement(GrammarParser.MultiStatementContext ctx) {
        return visit(ctx.statements()) + "\n" + visit(ctx.statement());
    }

    // handle while loops

    @Override
    public String visitWhileLoop(GrammarParser.WhileLoopContext ctx) {
        return visit(ctx.while_statement());
    }

    @Override
    public String visitStandardWhile(GrammarParser.StandardWhileContext ctx) {
        return "begin " + visit(ctx.condition) + " while " + visit(ctx.body) + " repeat";
    }

    // handle if statements

    @Override
    public String visitIfStatement(GrammarParser.IfStatementContext ctx) {
        return visit(ctx.if_statement());
    }


    @Override
    public String visitStandardIf(GrammarParser.StandardIfContext ctx) {
        return visit(ctx.condition) + " if " + visit(ctx.if_body) + " endif";
    }

    @Override
    public String visitIfElse(GrammarParser.IfElseContext ctx) {
        return visit(ctx.condition) + " if " + visit(ctx.if_body) + " else " + visit(ctx.else_body) + " endif";
    }

    // handle declarations and assignments

    @Override
    public String visitDeclareAndAssignExpr(GrammarParser.DeclareAndAssignExprContext ctx) {
        if (this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has already been initialised.");
        }

        this.initialised.add(ctx.variable.getText());
        this.boolean_memory.add(ctx.variable.getText());

        variable_statements.add("VARIABLE " + ctx.variable.getText());
        return visit(ctx.value) + " " + ctx.variable.getText() + " !";
    }

    @Override
    public String visitDeclareAndAssignFloat(GrammarParser.DeclareAndAssignFloatContext ctx) {
        if (this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has already been initialised.");
        }

        this.initialised.add(ctx.variable.getText());
        this.float_memory.add(ctx.variable.getText());

        variable_statements.add("FVARIABLE " + ctx.variable.getText());

        return visit(ctx.value) + " " + ctx.variable.getText() + " f!";
    }

    @Override
    public String visitDeclareAndAssignInt(GrammarParser.DeclareAndAssignIntContext ctx) {
        if (this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has already been initialised.");
        }

        this.initialised.add(ctx.variable.getText());
        this.int_memory.add(ctx.variable.getText());


        variable_statements.add("VARIABLE " + ctx.variable.getText());
        return visit(ctx.value) + " " + ctx.variable.getText() + " !";
    }

    // handle declarations

    @Override
    public String visitDeclareBoolean(GrammarParser.DeclareBooleanContext ctx) {
        if (this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has already been initialised.");
        }

        this.initialised.add(ctx.variable.getText());
        this.boolean_memory.add(ctx.variable.getText());

        variable_statements.add("VARIABLE " + ctx.variable.getText());

        return "";
    }

    @Override
    public String visitDeclareFloat(GrammarParser.DeclareFloatContext ctx) {
        if (this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has already been initialised.");
        }

        this.initialised.add(ctx.variable.getText());
        this.float_memory.add(ctx.variable.getText());

        variable_statements.add("FVARIABLE " + ctx.variable.getText());

        return "";
    }

    @Override
    public String visitDeclareInt(GrammarParser.DeclareIntContext ctx) {
        if (this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has already been initialised.");
        } else {
            this.initialised.add(ctx.variable.getText());
            this.int_memory.add(ctx.variable.getText());
        }

        variable_statements.add("VARIABLE " + ctx.variable.getText());
        return "";
    }

    // handle assignments

    @Override
    public String visitAssignmentStatement(GrammarParser.AssignmentStatementContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public String visitAssignVariableResult(GrammarParser.AssignVariableResultContext ctx) {
        return visit(ctx.value) + " " + ctx.variable.getText() + " !";
    }

    @Override
    public String visitAssignBoolean(GrammarParser.AssignBooleanContext ctx) {
        if(!this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has not been initialised.");
        } else {
            if(!this.boolean_memory.contains(ctx.variable.getText())) {
                this.error_list.add("Variable '" + ctx.variable.getText() + "' is an not boolean.");
            }
        }

        return visit(ctx.value) + " " + ctx.variable.getText() + " !";
    }

    @Override
    public String visitAssignFloat(GrammarParser.AssignFloatContext ctx) {
        if(!this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has not been initialised.");
        } else {
            if(!this.float_memory.contains(ctx.variable.getText())) {
                this.error_list.add("Variable '" + ctx.variable.getText() + "' is not a float.");
            }
        }

        return visit(ctx.value) + " " + ctx.variable.getText() + " f!";
    }

    @Override
    public String visitAssignInt(GrammarParser.AssignIntContext ctx) {
        if(!this.initialised.contains(ctx.variable.getText())) {
            this.error_list.add("Variable '" + ctx.variable.getText() + "' has not been initialised.");
        } else {
            if(!this.int_memory.contains(ctx.variable.getText())) {
                this.error_list.add("Variable '" + ctx.variable.getText() + "' is not an integer.");
            }
        }

        return visit(ctx.value) + " " + ctx.variable.getText() + " !";
    }

    @Override
    public String visitAssignArithmetic(GrammarParser.AssignArithmeticContext ctx) {
        return visit(ctx.arithmetic_statement());
    }

    @Override
    public String visitAssignComparison(GrammarParser.AssignComparisonContext ctx) {
        return visit(ctx.comparison());
    }

    // handle comparisons

    @Override
    public String visitCompareStatement(GrammarParser.CompareStatementContext ctx) {
        return visit(ctx.comparison());
    }

    @Override
    public String visitIdentifierComparison(GrammarParser.IdentifierComparisonContext ctx) {
        String leftType = "";
        String rightType = "";
        String operatorPrefix = "";
        if(!this.initialised.contains(ctx.left.getText())) {
            this.error_list.add("Variable '" + ctx.left.getText() + "' has not been initialised.");
        } else {
            if(this.int_memory.contains(ctx.left.getText())) {
                leftType = "int";
            }

            else if(this.float_memory.contains(ctx.left.getText())) {
                leftType = "float";
            }

            else if(this.boolean_memory.contains(ctx.left.getText())) {
                leftType = "boolean";
            }
        }

        if(!this.initialised.contains(ctx.right.getText())) {
            this.error_list.add("Variable '" + ctx.right.getText() + "' has not been initialised.");
        } else {
            if(this.int_memory.contains(ctx.right.getText())) {
                rightType = "int";
            }

            else if(this.float_memory.contains(ctx.right.getText())) {
                rightType = "float";
            }

            else if(this.boolean_memory.contains(ctx.right.getText())) {
                rightType = "boolean";
            }
        }

        if(leftType.equals(rightType)) {
            if(leftType.equals("float")) {
                operatorPrefix = "f";
            }
        } else {
            this.error_list.add("Datatype mismatch between '" + ctx.left.getText() + "' and '" + ctx.right.getText() + "'");
            if(leftType.equals("float") || rightType.equals("float")) {
                operatorPrefix = "f";
            }
        }

        String sign = ctx.sign.getText().toUpperCase();
        if(sign.equals("==")) {
            sign = "=";
        }

        if(sign.equals("!") || sign.equals("NOT")) {
            sign = "= invert";
        }

        return ctx.left.getText() + " " + operatorPrefix + "@ " + ctx.right.getText() + " " + operatorPrefix + "@ " + operatorPrefix + sign;
    }

    @Override
    public String visitArithComparison(GrammarParser.ArithComparisonContext ctx) {
        String sign = ctx.sign.getText().toUpperCase();

        if(sign.equals("==")) {
            sign = "=";
        }

        if(sign.equals("!") || sign.equals("NOT")) {
            sign = "= invert";
        }

        // HERE

        return visit(ctx.left) + " " + visit(ctx.right) + " " + sign;
    }

    @Override
    public String visitBooleanComparison(GrammarParser.BooleanComparisonContext ctx) {
        return visit(ctx.bool());
    }

    // handle arithmetic - passes control to var_arith, float_arith or int_arith

    @Override
    public String visitArithStatement(GrammarParser.ArithStatementContext ctx) {
        return visit(ctx.arithmetic_statement());
    }

    // handle int arithmetic

    @Override
    public String visitInt_arith(GrammarParser.Int_arithContext ctx) {
        return visit(ctx.int_arithmetic());
    }

    @Override
    public String visitInt_identifier(GrammarParser.Int_identifierContext ctx) {
        if(!this.initialised.contains(ctx.value.getText())) {
            this.error_list.add("Variable '" + ctx.value.getText() + "' has not been initialised.");
        } else {
            if(!this.int_memory.contains(ctx.value.getText())) {
                this.error_list.add("Variable '" + ctx.value.getText() + "' is not an integer.");
            }
        }

        return ctx.value.getText() + " @";
    }

    @Override
    public String visitIntAddition(GrammarParser.IntAdditionContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " " + ctx.op.getText();

    }

    @Override
    public String visitIntNegative(GrammarParser.IntNegativeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIntBracketed(GrammarParser.IntBracketedContext ctx) {
        return visit(ctx.value);
    }

    @Override
    public String visitInt(GrammarParser.IntContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitIntMultiplication(GrammarParser.IntMultiplicationContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " " + ctx.op.getText();
    }

    // handle float arithmetic

    @Override
    public String visitFloat_arith(GrammarParser.Float_arithContext ctx) {
        return visit(ctx.float_arithmetic());
    }

    @Override
    public String visitFloatMuplitication(GrammarParser.FloatMupliticationContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " f" + ctx.op.getText();
    }

    @Override
    public String visitFloatNegative(GrammarParser.FloatNegativeContext ctx) {
        return ctx.getText() + "e";
    }

    @Override
    public String visitFloat_identifier(GrammarParser.Float_identifierContext ctx) {
        if(!this.initialised.contains(ctx.value.getText())) {
            this.error_list.add("Variable '" + ctx.value.getText() + "' has not been initialised.");
        } else {
            if(!this.float_memory.contains(ctx.value.getText())) {
                this.error_list.add("Variable '" + ctx.value.getText() + "' is not a float.");
            }
        }

        return ctx.value.getText() + " f@";
    }

    @Override
    public String visitFloat(GrammarParser.FloatContext ctx) {
        return ctx.getText() + "e";
    }

    @Override
    public String visitFloatAddition(GrammarParser.FloatAdditionContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " f" + ctx.op.getText();
    }

    @Override
    public String visitFloatBracketed(GrammarParser.FloatBracketedContext ctx) {
        return visit(ctx.value);
    }


    // handle var arithmetic

    @Override
    public String visitVar_arith(GrammarParser.Var_arithContext ctx) {
        return visit(ctx.variable_arithmetic());
    }


    @Override
    public String visitVarNegative(GrammarParser.VarNegativeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVarMultiplication(GrammarParser.VarMultiplicationContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " " + ctx.op.getText();
    }

    @Override
    public String visitVarAddition(GrammarParser.VarAdditionContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " " + ctx.op.getText();
    }

    @Override
    public String visitVarBracketed(GrammarParser.VarBracketedContext ctx) {
        return visit(ctx.value);
    }

    @Override
    public String visitVariable(GrammarParser.VariableContext ctx) {
        String operator = "@";

        if(!this.initialised.contains(ctx.getText())) {
            this.error_list.add("Variable '" + ctx.getText() + "' has not been initialised.");
        } else {
            if(this.float_memory.contains(ctx.getText())) {
                operator = "f" + operator;
            }
        }

        return ctx.getText() + " " + operator;
    }

    // handle booleans

    @Override
    public String visitBoolean(GrammarParser.BooleanContext ctx) {
        String value = ctx.value.getText().toLowerCase();
        if(value.equals("true")) {
            return "-1";
        } else {
            return "0";
        }
    }

    @Override
    public String visitBooleanEquals(GrammarParser.BooleanEqualsContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " =";
    }

    @Override
    public String visitBooleanOr(GrammarParser.BooleanOrContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " OR";
    }

    @Override
    public String visitBooleanBracketed(GrammarParser.BooleanBracketedContext ctx) {
        return visit(ctx.value);
    }

    @Override
    public String visitBooleanNegative(GrammarParser.BooleanNegativeContext ctx) {
        return visit(ctx.value) + " invert";
    }

    @Override
    public String visitBooleanAnd(GrammarParser.BooleanAndContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " AND" ;
    }

    @Override
    public String visitBooleanNotEquals(GrammarParser.BooleanNotEqualsContext ctx) {
        return visit(ctx.left) + " " + visit(ctx.right) + " = invert";
    }

}
