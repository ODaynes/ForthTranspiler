// Generated from C:/Users/Owen Daynes/Documents/CE305/CE305Assignment2/src\Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MULT=5, DIV=6, PLUS=7, MINUS=8, DOT=9, 
		ASSIGN=10, EQUALS=11, LT=12, LTE=13, GT=14, GTE=15, LPAR=16, RPAR=17, 
		LBRACE=18, RBRACE=19, TYPES=20, WHILE=21, IF=22, ELIF=23, THEN=24, ELSE=25, 
		BOOL=26, OR=27, AND=28, NOT=29, INTEGER=30, FLOAT=31, WS=32, IDENTIFIER=33;
	public static final int
		RULE_prog = 0, RULE_statements = 1, RULE_statement = 2, RULE_arithmetic_statement = 3, 
		RULE_variable_arithmetic = 4, RULE_int_arithmetic = 5, RULE_float_arithmetic = 6, 
		RULE_bool = 7, RULE_assignment = 8, RULE_comparison = 9, RULE_assignable = 10, 
		RULE_if_statement = 11, RULE_while_statement = 12;
	public static final String[] ruleNames = {
		"prog", "statements", "statement", "arithmetic_statement", "variable_arithmetic", 
		"int_arithmetic", "float_arithmetic", "bool", "assignment", "comparison", 
		"assignable", "if_statement", "while_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'boolean'", "'float'", "'int'", "'*'", "'/'", "'+'", "'-'", 
		"'.'", "':='", "'=='", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
		"'}'", null, "'while'", "'if'", "'elif'", "'then'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MULT", "DIV", "PLUS", "MINUS", "DOT", "ASSIGN", 
		"EQUALS", "LT", "LTE", "GT", "GTE", "LPAR", "RPAR", "LBRACE", "RBRACE", 
		"TYPES", "WHILE", "IF", "ELIF", "THEN", "ELSE", "BOOL", "OR", "AND", "NOT", 
		"INTEGER", "FLOAT", "WS", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			statements(0);
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleStatementContext extends StatementsContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiStatementContext extends StatementsContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MultiStatementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultiStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultiStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultiStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleStatementContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(30);
			statement();
			setState(31);
			match(T__0);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiStatementContext(new StatementsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(33);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(34);
					statement();
					setState(35);
					match(T__0);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileLoopContext extends StatementContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithStatementContext extends StatementContext {
		public Arithmetic_statementContext arithmetic_statement() {
			return getRuleContext(Arithmetic_statementContext.class,0);
		}
		public ArithStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArithStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareStatementContext extends StatementContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public CompareStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				while_statement();
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				if_statement();
				}
				break;
			case 3:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				assignment();
				}
				break;
			case 4:
				_localctx = new CompareStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				comparison();
				}
				break;
			case 5:
				_localctx = new ArithStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				arithmetic_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_statementContext extends ParserRuleContext {
		public Arithmetic_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_statement; }
	 
		public Arithmetic_statementContext() { }
		public void copyFrom(Arithmetic_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Int_arithContext extends Arithmetic_statementContext {
		public Int_arithmeticContext int_arithmetic() {
			return getRuleContext(Int_arithmeticContext.class,0);
		}
		public Int_arithContext(Arithmetic_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInt_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInt_arith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInt_arith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Var_arithContext extends Arithmetic_statementContext {
		public Variable_arithmeticContext variable_arithmetic() {
			return getRuleContext(Variable_arithmeticContext.class,0);
		}
		public Var_arithContext(Arithmetic_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_arith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar_arith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_arithContext extends Arithmetic_statementContext {
		public Float_arithmeticContext float_arithmetic() {
			return getRuleContext(Float_arithmeticContext.class,0);
		}
		public Float_arithContext(Arithmetic_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloat_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloat_arith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloat_arith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_statementContext arithmetic_statement() throws RecognitionException {
		Arithmetic_statementContext _localctx = new Arithmetic_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmetic_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Var_arithContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				variable_arithmetic(0);
				}
				break;
			case 2:
				_localctx = new Float_arithContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				float_arithmetic(0);
				}
				break;
			case 3:
				_localctx = new Int_arithContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				int_arithmetic(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_arithmeticContext extends ParserRuleContext {
		public Variable_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_arithmetic; }
	 
		public Variable_arithmeticContext() { }
		public void copyFrom(Variable_arithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarNegativeContext extends Variable_arithmeticContext {
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Variable_arithmeticContext variable_arithmetic() {
			return getRuleContext(Variable_arithmeticContext.class,0);
		}
		public VarNegativeContext(Variable_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVarNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarMultiplicationContext extends Variable_arithmeticContext {
		public Variable_arithmeticContext left;
		public Token op;
		public Variable_arithmeticContext right;
		public List<Variable_arithmeticContext> variable_arithmetic() {
			return getRuleContexts(Variable_arithmeticContext.class);
		}
		public Variable_arithmeticContext variable_arithmetic(int i) {
			return getRuleContext(Variable_arithmeticContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public VarMultiplicationContext(Variable_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVarMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAdditionContext extends Variable_arithmeticContext {
		public Variable_arithmeticContext left;
		public Token op;
		public Variable_arithmeticContext right;
		public List<Variable_arithmeticContext> variable_arithmetic() {
			return getRuleContexts(Variable_arithmeticContext.class);
		}
		public Variable_arithmeticContext variable_arithmetic(int i) {
			return getRuleContext(Variable_arithmeticContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public VarAdditionContext(Variable_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVarAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarBracketedContext extends Variable_arithmeticContext {
		public Variable_arithmeticContext value;
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public Variable_arithmeticContext variable_arithmetic() {
			return getRuleContext(Variable_arithmeticContext.class,0);
		}
		public VarBracketedContext(Variable_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVarBracketed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVarBracketed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVarBracketed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends Variable_arithmeticContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public VariableContext(Variable_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_arithmeticContext variable_arithmetic() throws RecognitionException {
		return variable_arithmetic(0);
	}

	private Variable_arithmeticContext variable_arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_arithmeticContext _localctx = new Variable_arithmeticContext(_ctx, _parentState);
		Variable_arithmeticContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_variable_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new VarNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(55);
				match(MINUS);
				setState(56);
				variable_arithmetic(5);
				}
				break;
			case LPAR:
				{
				_localctx = new VarBracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(LPAR);
				setState(58);
				((VarBracketedContext)_localctx).value = variable_arithmetic(0);
				setState(59);
				match(RPAR);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new VarMultiplicationContext(new Variable_arithmeticContext(_parentctx, _parentState));
						((VarMultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_arithmetic);
						setState(64);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(65);
						((VarMultiplicationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((VarMultiplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						((VarMultiplicationContext)_localctx).right = variable_arithmetic(4);
						}
						break;
					case 2:
						{
						_localctx = new VarAdditionContext(new Variable_arithmeticContext(_parentctx, _parentState));
						((VarAdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_variable_arithmetic);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						((VarAdditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((VarAdditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(69);
						((VarAdditionContext)_localctx).right = variable_arithmetic(3);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Int_arithmeticContext extends ParserRuleContext {
		public Int_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_arithmetic; }
	 
		public Int_arithmeticContext() { }
		public void copyFrom(Int_arithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Int_identifierContext extends Int_arithmeticContext {
		public Token value;
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Int_identifierContext(Int_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInt_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInt_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInt_identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAdditionContext extends Int_arithmeticContext {
		public Int_arithmeticContext left;
		public Token op;
		public Int_arithmeticContext right;
		public List<Int_arithmeticContext> int_arithmetic() {
			return getRuleContexts(Int_arithmeticContext.class);
		}
		public Int_arithmeticContext int_arithmetic(int i) {
			return getRuleContext(Int_arithmeticContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public IntAdditionContext(Int_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntNegativeContext extends Int_arithmeticContext {
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Int_arithmeticContext int_arithmetic() {
			return getRuleContext(Int_arithmeticContext.class,0);
		}
		public IntNegativeContext(Int_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntBracketedContext extends Int_arithmeticContext {
		public Int_arithmeticContext value;
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public Int_arithmeticContext int_arithmetic() {
			return getRuleContext(Int_arithmeticContext.class,0);
		}
		public IntBracketedContext(Int_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntBracketed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntBracketed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntBracketed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Int_arithmeticContext {
		public Token value;
		public TerminalNode INTEGER() { return getToken(GrammarParser.INTEGER, 0); }
		public IntContext(Int_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntMultiplicationContext extends Int_arithmeticContext {
		public Int_arithmeticContext left;
		public Token op;
		public Int_arithmeticContext right;
		public List<Int_arithmeticContext> int_arithmetic() {
			return getRuleContexts(Int_arithmeticContext.class);
		}
		public Int_arithmeticContext int_arithmetic(int i) {
			return getRuleContext(Int_arithmeticContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public IntMultiplicationContext(Int_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_arithmeticContext int_arithmetic() throws RecognitionException {
		return int_arithmetic(0);
	}

	private Int_arithmeticContext int_arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_arithmeticContext _localctx = new Int_arithmeticContext(_ctx, _parentState);
		Int_arithmeticContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_int_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new IntNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(76);
				match(MINUS);
				setState(77);
				int_arithmetic(6);
				}
				break;
			case LPAR:
				{
				_localctx = new IntBracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(LPAR);
				setState(79);
				((IntBracketedContext)_localctx).value = int_arithmetic(0);
				setState(80);
				match(RPAR);
				}
				break;
			case INTEGER:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				((IntContext)_localctx).value = match(INTEGER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new Int_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				((Int_identifierContext)_localctx).value = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new IntMultiplicationContext(new Int_arithmeticContext(_parentctx, _parentState));
						((IntMultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_arithmetic);
						setState(86);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(87);
						((IntMultiplicationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((IntMultiplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						((IntMultiplicationContext)_localctx).right = int_arithmetic(5);
						}
						break;
					case 2:
						{
						_localctx = new IntAdditionContext(new Int_arithmeticContext(_parentctx, _parentState));
						((IntAdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_int_arithmetic);
						setState(89);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(90);
						((IntAdditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((IntAdditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						((IntAdditionContext)_localctx).right = int_arithmetic(4);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Float_arithmeticContext extends ParserRuleContext {
		public Float_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_arithmetic; }
	 
		public Float_arithmeticContext() { }
		public void copyFrom(Float_arithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatMupliticationContext extends Float_arithmeticContext {
		public Float_arithmeticContext left;
		public Token op;
		public Float_arithmeticContext right;
		public List<Float_arithmeticContext> float_arithmetic() {
			return getRuleContexts(Float_arithmeticContext.class);
		}
		public Float_arithmeticContext float_arithmetic(int i) {
			return getRuleContext(Float_arithmeticContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public FloatMupliticationContext(Float_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloatMuplitication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloatMuplitication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloatMuplitication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatNegativeContext extends Float_arithmeticContext {
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Float_arithmeticContext float_arithmetic() {
			return getRuleContext(Float_arithmeticContext.class,0);
		}
		public FloatNegativeContext(Float_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloatNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloatNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloatNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_identifierContext extends Float_arithmeticContext {
		public Token value;
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Float_identifierContext(Float_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloat_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloat_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloat_identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends Float_arithmeticContext {
		public Token value;
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public FloatContext(Float_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatAdditionContext extends Float_arithmeticContext {
		public Float_arithmeticContext left;
		public Token op;
		public Float_arithmeticContext right;
		public List<Float_arithmeticContext> float_arithmetic() {
			return getRuleContexts(Float_arithmeticContext.class);
		}
		public Float_arithmeticContext float_arithmetic(int i) {
			return getRuleContext(Float_arithmeticContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public FloatAdditionContext(Float_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloatAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloatAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloatAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatBracketedContext extends Float_arithmeticContext {
		public Float_arithmeticContext value;
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public Float_arithmeticContext float_arithmetic() {
			return getRuleContext(Float_arithmeticContext.class,0);
		}
		public FloatBracketedContext(Float_arithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloatBracketed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloatBracketed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloatBracketed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_arithmeticContext float_arithmetic() throws RecognitionException {
		return float_arithmetic(0);
	}

	private Float_arithmeticContext float_arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_arithmeticContext _localctx = new Float_arithmeticContext(_ctx, _parentState);
		Float_arithmeticContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_float_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new FloatNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				match(MINUS);
				setState(99);
				float_arithmetic(6);
				}
				break;
			case LPAR:
				{
				_localctx = new FloatBracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(LPAR);
				setState(101);
				((FloatBracketedContext)_localctx).value = float_arithmetic(0);
				setState(102);
				match(RPAR);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				((FloatContext)_localctx).value = match(FLOAT);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new Float_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((Float_identifierContext)_localctx).value = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new FloatMupliticationContext(new Float_arithmeticContext(_parentctx, _parentState));
						((FloatMupliticationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_arithmetic);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						((FloatMupliticationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((FloatMupliticationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						((FloatMupliticationContext)_localctx).right = float_arithmetic(5);
						}
						break;
					case 2:
						{
						_localctx = new FloatAdditionContext(new Float_arithmeticContext(_parentctx, _parentState));
						((FloatAdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_float_arithmetic);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						((FloatAdditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((FloatAdditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						((FloatAdditionContext)_localctx).right = float_arithmetic(4);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanContext extends BoolContext {
		public Token value;
		public TerminalNode BOOL() { return getToken(GrammarParser.BOOL, 0); }
		public BooleanContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanEqualsContext extends BoolContext {
		public BoolContext left;
		public Token op;
		public BoolContext right;
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(GrammarParser.EQUALS, 0); }
		public BooleanEqualsContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBooleanEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanOrContext extends BoolContext {
		public BoolContext left;
		public Token op;
		public BoolContext right;
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public BooleanOrContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBooleanOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanBracketedContext extends BoolContext {
		public BoolContext value;
		public TerminalNode LPAR() { return getToken(GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GrammarParser.RPAR, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BooleanBracketedContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanBracketed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanBracketed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBooleanBracketed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanNotEqualsContext extends BoolContext {
		public BoolContext left;
		public Token op;
		public BoolContext right;
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public BooleanNotEqualsContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBooleanNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanNegativeContext extends BoolContext {
		public BoolContext value;
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BooleanNegativeContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBooleanNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAndContext extends BoolContext {
		public BoolContext left;
		public Token op;
		public BoolContext right;
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public BooleanAndContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBooleanAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new BooleanNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(120);
				match(NOT);
				setState(121);
				((BooleanNegativeContext)_localctx).value = bool(7);
				}
				break;
			case LPAR:
				{
				_localctx = new BooleanBracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(LPAR);
				setState(123);
				((BooleanBracketedContext)_localctx).value = bool(0);
				setState(124);
				match(RPAR);
				}
				break;
			case BOOL:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				((BooleanContext)_localctx).value = match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanNotEqualsContext(new BoolContext(_parentctx, _parentState));
						((BooleanNotEqualsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(129);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(130);
						((BooleanNotEqualsContext)_localctx).op = match(NOT);
						setState(131);
						((BooleanNotEqualsContext)_localctx).right = bool(6);
						}
						break;
					case 2:
						{
						_localctx = new BooleanEqualsContext(new BoolContext(_parentctx, _parentState));
						((BooleanEqualsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						((BooleanEqualsContext)_localctx).op = match(EQUALS);
						setState(134);
						((BooleanEqualsContext)_localctx).right = bool(5);
						}
						break;
					case 3:
						{
						_localctx = new BooleanAndContext(new BoolContext(_parentctx, _parentState));
						((BooleanAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(136);
						((BooleanAndContext)_localctx).op = match(AND);
						setState(137);
						((BooleanAndContext)_localctx).right = bool(4);
						}
						break;
					case 4:
						{
						_localctx = new BooleanOrContext(new BoolContext(_parentctx, _parentState));
						((BooleanOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(138);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(139);
						((BooleanOrContext)_localctx).op = match(OR);
						setState(140);
						((BooleanOrContext)_localctx).right = bool(3);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareFloatContext extends AssignmentContext {
		public Token type;
		public Token variable;
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public DeclareFloatContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclareFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclareFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclareFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareBooleanContext extends AssignmentContext {
		public Token type;
		public Token variable;
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public DeclareBooleanContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclareBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclareBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclareBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignBooleanContext extends AssignmentContext {
		public Token variable;
		public ComparisonContext value;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public AssignBooleanContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareIntContext extends AssignmentContext {
		public Token type;
		public Token variable;
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public DeclareIntContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclareInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclareInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclareInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareAndAssignFloatContext extends AssignmentContext {
		public Token type;
		public Token variable;
		public Float_arithmeticContext value;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Float_arithmeticContext float_arithmetic() {
			return getRuleContext(Float_arithmeticContext.class,0);
		}
		public DeclareAndAssignFloatContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclareAndAssignFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclareAndAssignFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclareAndAssignFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareAndAssignExprContext extends AssignmentContext {
		public Token type;
		public Token variable;
		public ComparisonContext value;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public DeclareAndAssignExprContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclareAndAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclareAndAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclareAndAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareAndAssignIntContext extends AssignmentContext {
		public Token type;
		public Token variable;
		public Int_arithmeticContext value;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Int_arithmeticContext int_arithmetic() {
			return getRuleContext(Int_arithmeticContext.class,0);
		}
		public DeclareAndAssignIntContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclareAndAssignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclareAndAssignInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclareAndAssignInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIntContext extends AssignmentContext {
		public Token variable;
		public Int_arithmeticContext value;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Int_arithmeticContext int_arithmetic() {
			return getRuleContext(Int_arithmeticContext.class,0);
		}
		public AssignIntContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVariableResultContext extends AssignmentContext {
		public Token variable;
		public Variable_arithmeticContext value;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Variable_arithmeticContext variable_arithmetic() {
			return getRuleContext(Variable_arithmeticContext.class,0);
		}
		public AssignVariableResultContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignVariableResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignVariableResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignVariableResult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignFloatContext extends AssignmentContext {
		public Token variable;
		public Float_arithmeticContext value;
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GrammarParser.IDENTIFIER, 0); }
		public Float_arithmeticContext float_arithmetic() {
			return getRuleContext(Float_arithmeticContext.class,0);
		}
		public AssignFloatContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DeclareAndAssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((DeclareAndAssignExprContext)_localctx).type = match(T__1);
				setState(147);
				((DeclareAndAssignExprContext)_localctx).variable = match(IDENTIFIER);
				setState(148);
				match(ASSIGN);
				setState(149);
				((DeclareAndAssignExprContext)_localctx).value = comparison();
				}
				break;
			case 2:
				_localctx = new DeclareAndAssignFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				((DeclareAndAssignFloatContext)_localctx).type = match(T__2);
				setState(151);
				((DeclareAndAssignFloatContext)_localctx).variable = match(IDENTIFIER);
				setState(152);
				match(ASSIGN);
				setState(153);
				((DeclareAndAssignFloatContext)_localctx).value = float_arithmetic(0);
				}
				break;
			case 3:
				_localctx = new DeclareAndAssignIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				((DeclareAndAssignIntContext)_localctx).type = match(T__3);
				setState(155);
				((DeclareAndAssignIntContext)_localctx).variable = match(IDENTIFIER);
				setState(156);
				match(ASSIGN);
				setState(157);
				((DeclareAndAssignIntContext)_localctx).value = int_arithmetic(0);
				}
				break;
			case 4:
				_localctx = new AssignVariableResultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				((AssignVariableResultContext)_localctx).variable = match(IDENTIFIER);
				setState(159);
				match(ASSIGN);
				setState(160);
				((AssignVariableResultContext)_localctx).value = variable_arithmetic(0);
				}
				break;
			case 5:
				_localctx = new AssignBooleanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				((AssignBooleanContext)_localctx).variable = match(IDENTIFIER);
				setState(162);
				match(ASSIGN);
				setState(163);
				((AssignBooleanContext)_localctx).value = comparison();
				}
				break;
			case 6:
				_localctx = new AssignFloatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				((AssignFloatContext)_localctx).variable = match(IDENTIFIER);
				setState(165);
				match(ASSIGN);
				setState(166);
				((AssignFloatContext)_localctx).value = float_arithmetic(0);
				}
				break;
			case 7:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				((AssignIntContext)_localctx).variable = match(IDENTIFIER);
				setState(168);
				match(ASSIGN);
				setState(169);
				((AssignIntContext)_localctx).value = int_arithmetic(0);
				}
				break;
			case 8:
				_localctx = new DeclareBooleanContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				((DeclareBooleanContext)_localctx).type = match(T__1);
				setState(171);
				((DeclareBooleanContext)_localctx).variable = match(IDENTIFIER);
				}
				break;
			case 9:
				_localctx = new DeclareFloatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				((DeclareFloatContext)_localctx).type = match(T__2);
				setState(173);
				((DeclareFloatContext)_localctx).variable = match(IDENTIFIER);
				}
				break;
			case 10:
				_localctx = new DeclareIntContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
				((DeclareIntContext)_localctx).type = match(T__3);
				setState(175);
				((DeclareIntContext)_localctx).variable = match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierComparisonContext extends ComparisonContext {
		public Token left;
		public Token sign;
		public Token right;
		public List<TerminalNode> IDENTIFIER() { return getTokens(GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode LTE() { return getToken(GrammarParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(GrammarParser.GTE, 0); }
		public TerminalNode EQUALS() { return getToken(GrammarParser.EQUALS, 0); }
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public IdentifierComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIdentifierComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIdentifierComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIdentifierComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithComparisonContext extends ComparisonContext {
		public Arithmetic_statementContext left;
		public Token sign;
		public Arithmetic_statementContext right;
		public List<Arithmetic_statementContext> arithmetic_statement() {
			return getRuleContexts(Arithmetic_statementContext.class);
		}
		public Arithmetic_statementContext arithmetic_statement(int i) {
			return getRuleContext(Arithmetic_statementContext.class,i);
		}
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode LTE() { return getToken(GrammarParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(GrammarParser.GTE, 0); }
		public TerminalNode EQUALS() { return getToken(GrammarParser.EQUALS, 0); }
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public ArithComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArithComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArithComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArithComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanComparisonContext extends ComparisonContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BooleanComparisonContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBooleanComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IdentifierComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((IdentifierComparisonContext)_localctx).left = match(IDENTIFIER);
				setState(179);
				((IdentifierComparisonContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << NOT))) != 0)) ) {
					((IdentifierComparisonContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				((IdentifierComparisonContext)_localctx).right = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ArithComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((ArithComparisonContext)_localctx).left = arithmetic_statement();
				setState(182);
				((ArithComparisonContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << NOT))) != 0)) ) {
					((ArithComparisonContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				((ArithComparisonContext)_localctx).right = arithmetic_statement();
				}
				break;
			case 3:
				_localctx = new BooleanComparisonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				bool(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignableContext extends ParserRuleContext {
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
	 
		public AssignableContext() { }
		public void copyFrom(AssignableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignArithmeticContext extends AssignableContext {
		public Arithmetic_statementContext arithmetic_statement() {
			return getRuleContext(Arithmetic_statementContext.class,0);
		}
		public AssignArithmeticContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignComparisonContext extends AssignableContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public AssignComparisonContext(AssignableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignable);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AssignArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				arithmetic_statement();
				}
				break;
			case 2:
				_localctx = new AssignComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				comparison();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StandardIfContext extends If_statementContext {
		public ComparisonContext condition;
		public StatementsContext if_body;
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StandardIfContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStandardIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStandardIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStandardIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends If_statementContext {
		public ComparisonContext condition;
		public StatementsContext if_body;
		public StatementsContext else_body;
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(GrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(GrammarParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GrammarParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfElseContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(IF);
				setState(193);
				((IfElseContext)_localctx).condition = comparison();
				setState(194);
				match(LBRACE);
				setState(195);
				((IfElseContext)_localctx).if_body = statements(0);
				setState(196);
				match(RBRACE);
				setState(197);
				match(ELSE);
				setState(198);
				match(LBRACE);
				setState(199);
				((IfElseContext)_localctx).else_body = statements(0);
				setState(200);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new StandardIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(IF);
				setState(203);
				((StandardIfContext)_localctx).condition = comparison();
				setState(204);
				match(LBRACE);
				setState(205);
				((StandardIfContext)_localctx).if_body = statements(0);
				setState(206);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	 
		public While_statementContext() { }
		public void copyFrom(While_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StandardWhileContext extends While_statementContext {
		public ComparisonContext condition;
		public StatementsContext body;
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StandardWhileContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStandardWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStandardWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStandardWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			_localctx = new StandardWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(WHILE);
			setState(211);
			((StandardWhileContext)_localctx).condition = comparison();
			setState(212);
			match(LBRACE);
			setState(213);
			((StandardWhileContext)_localctx).body = statements(0);
			setState(214);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 4:
			return variable_arithmetic_sempred((Variable_arithmeticContext)_localctx, predIndex);
		case 5:
			return int_arithmetic_sempred((Int_arithmeticContext)_localctx, predIndex);
		case 6:
			return float_arithmetic_sempred((Float_arithmeticContext)_localctx, predIndex);
		case 7:
			return bool_sempred((BoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean variable_arithmetic_sempred(Variable_arithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean int_arithmetic_sempred(Int_arithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_arithmetic_sempred(Float_arithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3"+
		"\5\5\5\67\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7W\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bu\n\b\f\b\16"+
		"\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bd\n\13\3\f\3\f\5\f\u00c1\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d3"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\7\4\n\f\16\20\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\5\3\2\7\b\3\2\t\n\4\2\r\21\37\37\2\u00f5\2\34"+
		"\3\2\2\2\4\37\3\2\2\2\6\61\3\2\2\2\b\66\3\2\2\2\n@\3\2\2\2\fV\3\2\2\2"+
		"\16l\3\2\2\2\20\u0081\3\2\2\2\22\u00b2\3\2\2\2\24\u00bc\3\2\2\2\26\u00c0"+
		"\3\2\2\2\30\u00d2\3\2\2\2\32\u00d4\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3"+
		"\36\3\3\2\2\2\37 \b\3\1\2 !\5\6\4\2!\"\7\3\2\2\")\3\2\2\2#$\f\4\2\2$%"+
		"\5\6\4\2%&\7\3\2\2&(\3\2\2\2\'#\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*\5\3\2\2\2+)\3\2\2\2,\62\5\32\16\2-\62\5\30\r\2.\62\5\22\n\2/\62\5\24"+
		"\13\2\60\62\5\b\5\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61"+
		"\60\3\2\2\2\62\7\3\2\2\2\63\67\5\n\6\2\64\67\5\16\b\2\65\67\5\f\7\2\66"+
		"\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\289\b\6\1\29:\7\n\2"+
		"\2:A\5\n\6\7;<\7\22\2\2<=\5\n\6\2=>\7\23\2\2>A\3\2\2\2?A\7#\2\2@8\3\2"+
		"\2\2@;\3\2\2\2@?\3\2\2\2AJ\3\2\2\2BC\f\5\2\2CD\t\2\2\2DI\5\n\6\6EF\f\4"+
		"\2\2FG\t\3\2\2GI\5\n\6\5HB\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2K\13\3\2\2\2LJ\3\2\2\2MN\b\7\1\2NO\7\n\2\2OW\5\f\7\bPQ\7\22\2\2QR"+
		"\5\f\7\2RS\7\23\2\2SW\3\2\2\2TW\7 \2\2UW\7#\2\2VM\3\2\2\2VP\3\2\2\2VT"+
		"\3\2\2\2VU\3\2\2\2W`\3\2\2\2XY\f\6\2\2YZ\t\2\2\2Z_\5\f\7\7[\\\f\5\2\2"+
		"\\]\t\3\2\2]_\5\f\7\6^X\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2a\r\3\2\2\2b`\3\2\2\2cd\b\b\1\2de\7\n\2\2em\5\16\b\bfg\7\22\2\2gh\5"+
		"\16\b\2hi\7\23\2\2im\3\2\2\2jm\7!\2\2km\7#\2\2lc\3\2\2\2lf\3\2\2\2lj\3"+
		"\2\2\2lk\3\2\2\2mv\3\2\2\2no\f\6\2\2op\t\2\2\2pu\5\16\b\7qr\f\5\2\2rs"+
		"\t\3\2\2su\5\16\b\6tn\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"w\17\3\2\2\2xv\3\2\2\2yz\b\t\1\2z{\7\37\2\2{\u0082\5\20\t\t|}\7\22\2\2"+
		"}~\5\20\t\2~\177\7\23\2\2\177\u0082\3\2\2\2\u0080\u0082\7\34\2\2\u0081"+
		"y\3\2\2\2\u0081|\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0091\3\2\2\2\u0083"+
		"\u0084\f\7\2\2\u0084\u0085\7\37\2\2\u0085\u0090\5\20\t\b\u0086\u0087\f"+
		"\6\2\2\u0087\u0088\7\r\2\2\u0088\u0090\5\20\t\7\u0089\u008a\f\5\2\2\u008a"+
		"\u008b\7\36\2\2\u008b\u0090\5\20\t\6\u008c\u008d\f\4\2\2\u008d\u008e\7"+
		"\35\2\2\u008e\u0090\5\20\t\5\u008f\u0083\3\2\2\2\u008f\u0086\3\2\2\2\u008f"+
		"\u0089\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095"+
		"\7\4\2\2\u0095\u0096\7#\2\2\u0096\u0097\7\f\2\2\u0097\u00b3\5\24\13\2"+
		"\u0098\u0099\7\5\2\2\u0099\u009a\7#\2\2\u009a\u009b\7\f\2\2\u009b\u00b3"+
		"\5\16\b\2\u009c\u009d\7\6\2\2\u009d\u009e\7#\2\2\u009e\u009f\7\f\2\2\u009f"+
		"\u00b3\5\f\7\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00b3\5\n"+
		"\6\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00b3\5\24\13\2\u00a6"+
		"\u00a7\7#\2\2\u00a7\u00a8\7\f\2\2\u00a8\u00b3\5\16\b\2\u00a9\u00aa\7#"+
		"\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00b3\5\f\7\2\u00ac\u00ad\7\4\2\2\u00ad"+
		"\u00b3\7#\2\2\u00ae\u00af\7\5\2\2\u00af\u00b3\7#\2\2\u00b0\u00b1\7\6\2"+
		"\2\u00b1\u00b3\7#\2\2\u00b2\u0094\3\2\2\2\u00b2\u0098\3\2\2\2\u00b2\u009c"+
		"\3\2\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\23\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\t\4\2\2\u00b6\u00bd"+
		"\7#\2\2\u00b7\u00b8\5\b\5\2\u00b8\u00b9\t\4\2\2\u00b9\u00ba\5\b\5\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00bd\5\20\t\2\u00bc\u00b4\3\2\2\2\u00bc\u00b7\3"+
		"\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\25\3\2\2\2\u00be\u00c1\5\b\5\2\u00bf"+
		"\u00c1\5\24\13\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\27\3\2"+
		"\2\2\u00c2\u00c3\7\30\2\2\u00c3\u00c4\5\24\13\2\u00c4\u00c5\7\24\2\2\u00c5"+
		"\u00c6\5\4\3\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00c9\7"+
		"\24\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7\25\2\2\u00cb\u00d3\3\2\2\2\u00cc"+
		"\u00cd\7\30\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\7\24\2\2\u00cf\u00d0"+
		"\5\4\3\2\u00d0\u00d1\7\25\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c2\3\2\2\2"+
		"\u00d2\u00cc\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\7\27\2\2\u00d5\u00d6"+
		"\5\24\13\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\5\4\3\2\u00d8\u00d9\7\25\2"+
		"\2\u00d9\33\3\2\2\2\25)\61\66@HJV^`ltv\u0081\u008f\u0091\u00b2\u00bc\u00c0"+
		"\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}