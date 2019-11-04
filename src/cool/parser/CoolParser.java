// Generated from /home/student/CPL/Teme/Tema1CPL/src/cool/parser/CoolParser.g4 by ANTLR 4.7.2
package cool.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	public static final int
			ERROR = 1, IF = 2, THEN = 3, ELSE = 4, FI = 5, NEGATION = 6, NOT = 7, NEW = 8, CLASS = 9,
			INHERITS = 10, LET = 11, IN = 12, WHILE = 13, LOOP = 14, POOL = 15, CASE = 16, OF = 17,
			ESAC = 18, ISVOID = 19, BOOL = 20, STRING = 21, INT = 22, TYPE_ID = 23, ID = 24, FLOAT = 25,
			SEMI = 26, COLON = 27, COMMA = 28, ASSIGN = 29, LPAREN = 30, RPAREN = 31, LBRACE = 32,
			RBRACE = 33, PLUS = 34, MINUS = 35, MUL = 36, DIV = 37, RESULTS = 38, EQUAL = 39, LT = 40,
			LE = 41, LINE_COMMENT = 42, BLOCK_COMMENT = 43, WS = 44;
	public static final int
			RULE_program = 0, RULE_class_def = 1, RULE_definition = 2, RULE_declare_type = 3,
			RULE_let_variables = 4, RULE_branch = 5, RULE_expr = 6;
	public static final String[] ruleNames = makeRuleNames();
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00b1\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n\2" +
					"\r\2\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\7\3$\n" +
					"\3\f\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63" +
					"\13\4\5\4\65\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\5\4" +
					"C\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b" +
					"\3\b\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b" +
					"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\br\n\b\r\b\16\b" +
					"s\3\b\3\b\3\b\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3\b\3\b\3" +
					"\b\3\b\3\b\6\b\u0088\n\b\r\b\16\b\u0089\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
					"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3" +
					"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\3" +
					"\b\2\3\16\t\2\4\6\b\n\f\16\2\5\3\2&\'\3\2$%\3\2)+\2\u00c7\2\23\3\2\2\2" +
					"\4\31\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16\u00a0\3\2" +
					"\2\2\20\21\5\4\3\2\21\22\7\34\2\2\22\24\3\2\2\2\23\20\3\2\2\2\24\25\3" +
					"\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\30\7\2\2\3\30\3\3" +
					"\2\2\2\31\32\7\13\2\2\32\35\7\31\2\2\33\34\7\f\2\2\34\36\7\31\2\2\35\33" +
					"\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37%\7\"\2\2 !\5\6\4\2!\"\7\34\2\2" +
					"\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2" +
					"\2\2()\7#\2\2)\5\3\2\2\2*+\7\32\2\2+\64\7 \2\2,\61\5\b\5\2-.\7\36\2\2" +
					".\60\5\b\5\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3" +
					"\2\2\2\63\61\3\2\2\2\64,\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7!" +
					"\2\2\678\7\35\2\289\7\31\2\29:\7\"\2\2:;\5\16\b\2;<\7#\2\2<C\3\2\2\2=" +
					"@\5\b\5\2>?\7\37\2\2?A\5\16\b\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B*\3\2\2" +
					"\2B=\3\2\2\2C\7\3\2\2\2DE\7\32\2\2EF\7\35\2\2FG\7\31\2\2G\t\3\2\2\2HK" +
					"\5\b\5\2IJ\7\37\2\2JL\5\16\b\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2\2MN\5\b\5" +
					"\2NO\7(\2\2OP\5\16\b\2PQ\7\34\2\2Q\r\3\2\2\2RS\b\b\1\2ST\7\32\2\2TU\7" +
					" \2\2UZ\5\16\b\2VW\7\36\2\2WY\5\16\b\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2" +
					"Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7!\2\2^\u00a1\3\2\2\2_`\7\4\2\2`a\5" +
					"\16\b\2ab\7\5\2\2bc\5\16\b\2cd\7\6\2\2de\5\16\b\2ef\7\7\2\2f\u00a1\3\2" +
					"\2\2gh\7\17\2\2hi\5\16\b\2ij\7\20\2\2jk\5\16\b\2kl\7\21\2\2l\u00a1\3\2" +
					"\2\2mq\7\"\2\2no\5\16\b\2op\7\34\2\2pr\3\2\2\2qn\3\2\2\2rs\3\2\2\2sq\3" +
					"\2\2\2st\3\2\2\2tu\3\2\2\2uv\7#\2\2v\u00a1\3\2\2\2wx\7\r\2\2x}\5\n\6\2" +
					"yz\7\36\2\2z|\5\n\6\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080" +
					"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u0082\5\16\b\21\u0082" +
					"\u00a1\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0085\5\16\b\2\u0085\u0087\7" +
					"\23\2\2\u0086\u0088\5\f\7\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089" +
					"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\24" +
					"\2\2\u008c\u00a1\3\2\2\2\u008d\u008e\7\n\2\2\u008e\u00a1\7\31\2\2\u008f" +
					"\u0090\7\32\2\2\u0090\u0091\7\37\2\2\u0091\u00a1\5\16\b\f\u0092\u0093" +
					"\7\b\2\2\u0093\u00a1\5\16\b\13\u0094\u0095\7\25\2\2\u0095\u00a1\5\16\b" +
					"\n\u0096\u0097\7\t\2\2\u0097\u00a1\5\16\b\b\u0098\u0099\7 \2\2\u0099\u009a" +
					"\5\16\b\2\u009a\u009b\7!\2\2\u009b\u00a1\3\2\2\2\u009c\u00a1\7\32\2\2" +
					"\u009d\u00a1\7\26\2\2\u009e\u00a1\7\27\2\2\u009f\u00a1\7\30\2\2\u00a0" +
					"R\3\2\2\2\u00a0_\3\2\2\2\u00a0g\3\2\2\2\u00a0m\3\2\2\2\u00a0w\3\2\2\2" +
					"\u00a0\u0083\3\2\2\2\u00a0\u008d\3\2\2\2\u00a0\u008f\3\2\2\2\u00a0\u0092" +
					"\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u0096\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0" +
					"\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2" +
					"\2\2\u00a1\u00ad\3\2\2\2\u00a2\u00a3\f\16\2\2\u00a3\u00a4\t\2\2\2\u00a4" +
					"\u00ac\5\16\b\17\u00a5\u00a6\f\r\2\2\u00a6\u00a7\t\3\2\2\u00a7\u00ac\5" +
					"\16\b\16\u00a8\u00a9\f\t\2\2\u00a9\u00aa\t\4\2\2\u00aa\u00ac\5\16\b\n" +
					"\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af" +
					"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\17\3\2\2\2\u00af" +
					"\u00ad\3\2\2\2\21\25\35%\61\64@BKZs}\u0089\u00a0\u00ab\u00ad";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
	}

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
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

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	private static String[] makeRuleNames() {
		return new String[]{
				"program", "class_def", "definition", "declare_type", "let_variables",
				"branch", "expr"
		};
	}

	private static String[] makeLiteralNames() {
		return new String[]{
				null, null, "'if'", "'then'", "'else'", "'fi'", "'~'", "'not'", "'new'",
				"'class'", "'inherits'", "'let'", "'in'", "'while'", "'loop'", "'pool'",
				"'case'", "'of'", "'esac'", "'isvoid'", null, null, null, null, null,
				null, "';'", "':'", "','", "'<-'", "'('", "')'", "'{'", "'}'", "'+'",
				"'-'", "'*'", "'/'", "'=>'", "'='", "'<'", "'<='"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, "ERROR", "IF", "THEN", "ELSE", "FI", "NEGATION", "NOT", "NEW",
				"CLASS", "INHERITS", "LET", "IN", "WHILE", "LOOP", "POOL", "CASE", "OF",
				"ESAC", "ISVOID", "BOOL", "STRING", "INT", "TYPE_ID", "ID", "FLOAT",
				"SEMI", "COLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
				"PLUS", "MINUS", "MUL", "DIV", "RESULTS", "EQUAL", "LT", "LE", "LINE_COMMENT",
				"BLOCK_COMMENT", "WS"
		};
	}

	@Override
	public String getGrammarFileName() {
		return "CoolParser.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(14);
							((ProgramContext) _localctx).class_def = class_def();
							((ProgramContext) _localctx).classesProgram.add(((ProgramContext) _localctx).class_def);
							setState(15);
							match(SEMI);
						}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == CLASS);
				setState(21);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(23);
				match(CLASS);
				setState(24);
				((Class_defContext) _localctx).class_type = match(TYPE_ID);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == INHERITS) {
					{
						setState(25);
						match(INHERITS);
						setState(26);
						((Class_defContext) _localctx).inheritedClass = match(TYPE_ID);
					}
				}

				setState(29);
				match(LBRACE);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ID) {
					{
						{
							setState(30);
							((Class_defContext) _localctx).definition = definition();
							((Class_defContext) _localctx).definitions.add(((Class_defContext) _localctx).definition);
							setState(31);
							match(SEMI);
						}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1:
					_localctx = new FunctionDefinitionContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(40);
					((FunctionDefinitionContext) _localctx).nameFunc = match(ID);
					setState(41);
					match(LPAREN);
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == ID) {
						{
							setState(42);
							((FunctionDefinitionContext) _localctx).declare_type = declare_type();
							((FunctionDefinitionContext) _localctx).params.add(((FunctionDefinitionContext) _localctx).declare_type);
							setState(47);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == COMMA) {
								{
									{
										setState(43);
										match(COMMA);
										setState(44);
										((FunctionDefinitionContext) _localctx).declare_type = declare_type();
										((FunctionDefinitionContext) _localctx).params.add(((FunctionDefinitionContext) _localctx).declare_type);
									}
								}
								setState(49);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(52);
					match(RPAREN);
					setState(53);
					match(COLON);
					setState(54);
					((FunctionDefinitionContext) _localctx).returnType = match(TYPE_ID);
					setState(55);
					match(LBRACE);
					setState(56);
					((FunctionDefinitionContext) _localctx).body = expr(0);
					setState(57);
					match(RBRACE);
				}
				break;
				case 2:
					_localctx = new VariableDefinitionContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(59);
					declare_type();
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == ASSIGN) {
						{
							setState(60);
							match(ASSIGN);
							setState(61);
							((VariableDefinitionContext) _localctx).initVal = expr(0);
						}
				}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Declare_typeContext declare_type() throws RecognitionException {
		Declare_typeContext _localctx = new Declare_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(66);
				((Declare_typeContext) _localctx).name = match(ID);
				setState(67);
				match(COLON);
				setState(68);
				((Declare_typeContext) _localctx).type = match(TYPE_ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Let_variablesContext let_variables() throws RecognitionException {
		Let_variablesContext _localctx = new Let_variablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_let_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(70);
				declare_type();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ASSIGN) {
					{
						setState(71);
						match(ASSIGN);
						setState(72);
						expr(0);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(75);
				declare_type();
				setState(76);
				match(RESULTS);
				setState(77);
				((BranchContext) _localctx).body = expr(0);
				setState(78);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(158);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
					case 1: {
						_localctx = new FunctionCallContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(81);
						((FunctionCallContext) _localctx).name = match(ID);
						setState(82);
						match(LPAREN);
						{
							setState(83);
							((FunctionCallContext) _localctx).expr = expr(0);
							((FunctionCallContext) _localctx).arguments.add(((FunctionCallContext) _localctx).expr);
							setState(88);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == COMMA) {
								{
									{
										setState(84);
										match(COMMA);
										setState(85);
										((FunctionCallContext) _localctx).expr = expr(0);
										((FunctionCallContext) _localctx).arguments.add(((FunctionCallContext) _localctx).expr);
									}
								}
								setState(90);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
						setState(91);
						match(RPAREN);
					}
					break;
					case 2: {
						_localctx = new IfContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(93);
						match(IF);
						setState(94);
						((IfContext) _localctx).condition = expr(0);
						setState(95);
						match(THEN);
						setState(96);
						((IfContext) _localctx).then_branch = expr(0);
						setState(97);
						match(ELSE);
						setState(98);
						((IfContext) _localctx).else_branch = expr(0);
						setState(99);
						match(FI);
					}
					break;
					case 3: {
						_localctx = new WhileContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(101);
						match(WHILE);
						setState(102);
						((WhileContext) _localctx).condition = expr(0);
						setState(103);
						match(LOOP);
						setState(104);
						((WhileContext) _localctx).body = expr(0);
						setState(105);
						match(POOL);
					}
					break;
					case 4: {
						_localctx = new BodyContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(107);
						match(LBRACE);
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(108);
									((BodyContext) _localctx).expr = expr(0);
									((BodyContext) _localctx).expressios.add(((BodyContext) _localctx).expr);
									setState(109);
									match(SEMI);
								}
							}
							setState(113);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << NEGATION) | (1L << NOT) | (1L << NEW) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << ISVOID) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE))) != 0));
						setState(115);
						match(RBRACE);
					}
					break;
					case 5: {
						_localctx = new LetContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(117);
						match(LET);
						setState(118);
						((LetContext) _localctx).let_variables = let_variables();
						((LetContext) _localctx).variables.add(((LetContext) _localctx).let_variables);
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(119);
									match(COMMA);
									setState(120);
									((LetContext) _localctx).let_variables = let_variables();
									((LetContext) _localctx).variables.add(((LetContext) _localctx).let_variables);
								}
							}
							setState(125);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(126);
						match(IN);
						setState(127);
						((LetContext) _localctx).body = expr(15);
					}
					break;
					case 6: {
						_localctx = new CaseContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(129);
						match(CASE);
						setState(130);
						((CaseContext) _localctx).expression = expr(0);
						setState(131);
						match(OF);
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(132);
									((CaseContext) _localctx).branch = branch();
									((CaseContext) _localctx).branches.add(((CaseContext) _localctx).branch);
								}
							}
							setState(135);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while (_la == ID);
						setState(137);
						match(ESAC);
					}
					break;
					case 7: {
						_localctx = new InstantiationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(139);
						match(NEW);
						setState(140);
						match(TYPE_ID);
					}
					break;
					case 8: {
						_localctx = new VariableAssignmentContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(141);
						((VariableAssignmentContext) _localctx).name = match(ID);
						setState(142);
						match(ASSIGN);
						setState(143);
						((VariableAssignmentContext) _localctx).value = expr(10);
					}
					break;
					case 9: {
						_localctx = new UnaryNegationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(144);
						match(NEGATION);
						setState(145);
						((UnaryNegationContext) _localctx).expression = expr(9);
					}
					break;
					case 10: {
						_localctx = new VoidContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(146);
						match(ISVOID);
						setState(147);
						((VoidContext) _localctx).expression = expr(8);
					}
					break;
					case 11: {
						_localctx = new NegationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(148);
						match(NOT);
						setState(149);
						((NegationContext) _localctx).expression = expr(6);
					}
					break;
					case 12: {
						_localctx = new ParanthesesContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(150);
						match(LPAREN);
						setState(151);
						((ParanthesesContext) _localctx).expression = expr(0);
						setState(152);
						match(RPAREN);
					}
					break;
					case 13: {
						_localctx = new IdContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(154);
						match(ID);
					}
					break;
					case 14: {
						_localctx = new BooleanContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(155);
						match(BOOL);
					}
					break;
					case 15: {
						_localctx = new StringContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(156);
						match(STRING);
					}
					break;
					case 16: {
						_localctx = new IntContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(157);
						match(INT);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(169);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
								case 1: {
									_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
									((MulDivContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(160);
									if (!(precpred(_ctx, 12)))
										throw new FailedPredicateException(this, "precpred(_ctx, 12)");
									setState(161);
									((MulDivContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == MUL || _la == DIV)) {
										((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(162);
									((MulDivContext) _localctx).rightBranch = expr(13);
								}
								break;
								case 2: {
									_localctx = new MinusPlusContext(new ExprContext(_parentctx, _parentState));
									((MinusPlusContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(163);
									if (!(precpred(_ctx, 11)))
										throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(164);
									((MinusPlusContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == PLUS || _la == MINUS)) {
										((MinusPlusContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(165);
									((MinusPlusContext) _localctx).rightBranch = expr(12);
								}
								break;
								case 3: {
									_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
									((CompareContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(166);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(167);
									((CompareContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << LE))) != 0))) {
										((CompareContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(168);
									((CompareContext) _localctx).rightBranch = expr(8);
								}
								break;
							}
						}
					}
					setState(173);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 6:
				return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 12);
			case 1:
				return precpred(_ctx, 11);
			case 2:
				return precpred(_ctx, 7);
		}
		return true;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Class_defContext class_def;
		public List<Class_defContext> classesProgram = new ArrayList<Class_defContext>();
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode EOF() {
			return getToken(CoolParser.EOF, 0);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI);
		}

		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}

		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}

		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Class_defContext extends ParserRuleContext {
		public Token class_type;
		public Token inheritedClass;
		public DefinitionContext definition;
		public List<DefinitionContext> definitions = new ArrayList<DefinitionContext>();
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode CLASS() {
			return getToken(CoolParser.CLASS, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(CoolParser.LBRACE, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(CoolParser.RBRACE, 0);
		}

		public List<TerminalNode> TYPE_ID() {
			return getTokens(CoolParser.TYPE_ID);
		}

		public TerminalNode TYPE_ID(int i) {
			return getToken(CoolParser.TYPE_ID, i);
		}

		public TerminalNode INHERITS() {
			return getToken(CoolParser.INHERITS, 0);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI);
		}

		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}

		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}

		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_class_def;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public DefinitionContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_definition;
		}

		public void copyFrom(DefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class FunctionDefinitionContext extends DefinitionContext {
		public Token nameFunc;
		public Declare_typeContext declare_type;
		public List<Declare_typeContext> params = new ArrayList<Declare_typeContext>();
		public Token returnType;
		public ExprContext body;

		public FunctionDefinitionContext(DefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LPAREN() {
			return getToken(CoolParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(CoolParser.RPAREN, 0);
		}

		public TerminalNode COLON() {
			return getToken(CoolParser.COLON, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(CoolParser.LBRACE, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(CoolParser.RBRACE, 0);
		}

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0);
		}

		public TerminalNode TYPE_ID() {
			return getToken(CoolParser.TYPE_ID, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public List<Declare_typeContext> declare_type() {
			return getRuleContexts(Declare_typeContext.class);
		}

		public Declare_typeContext declare_type(int i) {
			return getRuleContext(Declare_typeContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(CoolParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class VariableDefinitionContext extends DefinitionContext {
		public ExprContext initVal;

		public VariableDefinitionContext(DefinitionContext ctx) {
			copyFrom(ctx);
		}

		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(CoolParser.ASSIGN, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Declare_typeContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public Declare_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode COLON() {
			return getToken(CoolParser.COLON, 0);
		}

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0);
		}

		public TerminalNode TYPE_ID() {
			return getToken(CoolParser.TYPE_ID, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_declare_type;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterDeclare_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitDeclare_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitDeclare_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Let_variablesContext extends ParserRuleContext {
		public Let_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(CoolParser.ASSIGN, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_let_variables;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterLet_variables(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitLet_variables(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitLet_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BranchContext extends ParserRuleContext {
		public ExprContext body;

		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class, 0);
		}

		public TerminalNode RESULTS() {
			return getToken(CoolParser.RESULTS, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(CoolParser.SEMI, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_branch;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterBranch(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitBranch(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExprContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NegationContext extends ExprContext {
		public ExprContext expression;

		public NegationContext(ExprContext ctx) {
			copyFrom(ctx);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public TerminalNode NOT() {
			return getToken(CoolParser.NOT, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class CompareContext extends ExprContext {
		public ExprContext leftBranch;
		public Token op;
		public ExprContext rightBranch;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public CompareContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode LE() {
			return getToken(CoolParser.LE, 0);
		}

		public TerminalNode LT() {
			return getToken(CoolParser.LT, 0);
		}

		public TerminalNode EQUAL() {
			return getToken(CoolParser.EQUAL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class VariableAssignmentContext extends ExprContext {
		public Token name;
		public ExprContext value;

		public VariableAssignmentContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ASSIGN() {
			return getToken(CoolParser.ASSIGN, 0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class VoidContext extends ExprContext {
		public ExprContext expression;

		public VoidContext(ExprContext ctx) {
			copyFrom(ctx);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public TerminalNode ISVOID() {
			return getToken(CoolParser.ISVOID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class StringContext extends ExprContext {
		public StringContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode STRING() {
			return getToken(CoolParser.STRING, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MinusPlusContext extends ExprContext {
		public ExprContext leftBranch;
		public Token op;
		public ExprContext rightBranch;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public MinusPlusContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode PLUS() {
			return getToken(CoolParser.PLUS, 0);
		}

		public TerminalNode MINUS() {
			return getToken(CoolParser.MINUS, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterMinusPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitMinusPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitMinusPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParanthesesContext extends ExprContext {
		public ExprContext expression;

		public ParanthesesContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LPAREN() {
			return getToken(CoolParser.LPAREN, 0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public TerminalNode RPAREN() {
			return getToken(CoolParser.RPAREN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterParantheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitParantheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitParantheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class WhileContext extends ExprContext {
		public ExprContext condition;
		public ExprContext body;

		public WhileContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode WHILE() {
			return getToken(CoolParser.WHILE, 0);
		}

		public TerminalNode LOOP() {
			return getToken(CoolParser.LOOP, 0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}

		public TerminalNode POOL() {
			return getToken(CoolParser.POOL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BodyContext extends ExprContext {
		public ExprContext expr;
		public List<ExprContext> expressios = new ArrayList<ExprContext>();

		public BodyContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LBRACE() {
			return getToken(CoolParser.LBRACE, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(CoolParser.RBRACE, 0);
		}
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IntContext extends ExprContext {
		public IntContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT() {
			return getToken(CoolParser.INT, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MulDivContext extends ExprContext {
		public ExprContext leftBranch;
		public Token op;
		public ExprContext rightBranch;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public MulDivContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode MUL() {
			return getToken(CoolParser.MUL, 0);
		}

		public TerminalNode DIV() {
			return getToken(CoolParser.DIV, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BooleanContext extends ExprContext {
		public BooleanContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BOOL() {
			return getToken(CoolParser.BOOL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FunctionCallContext extends ExprContext {
		public Token name;
		public ExprContext expr;
		public List<ExprContext> arguments = new ArrayList<ExprContext>();

		public FunctionCallContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LPAREN() {
			return getToken(CoolParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(CoolParser.RPAREN, 0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(CoolParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UnaryNegationContext extends ExprContext {
		public ExprContext expression;

		public UnaryNegationContext(ExprContext ctx) {
			copyFrom(ctx);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		public TerminalNode NEGATION() {
			return getToken(CoolParser.NEGATION, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterUnaryNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitUnaryNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitUnaryNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LetContext extends ExprContext {
		public Let_variablesContext let_variables;
		public List<Let_variablesContext> variables = new ArrayList<Let_variablesContext>();
		public ExprContext body;

		public LetContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LET() {
			return getToken(CoolParser.LET, 0);
		}

		public TerminalNode IN() {
			return getToken(CoolParser.IN, 0);
		}

		public List<Let_variablesContext> let_variables() {
			return getRuleContexts(Let_variablesContext.class);
		}

		public Let_variablesContext let_variables(int i) {
			return getRuleContext(Let_variablesContext.class, i);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(CoolParser.COMMA);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IdContext extends ExprContext {
		public IdContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IfContext extends ExprContext {
		public ExprContext condition;
		public ExprContext then_branch;
		public ExprContext else_branch;

		public IfContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IF() {
			return getToken(CoolParser.IF, 0);
		}

		public TerminalNode THEN() {
			return getToken(CoolParser.THEN, 0);
		}

		public TerminalNode ELSE() {
			return getToken(CoolParser.ELSE, 0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}

		public TerminalNode FI() {
			return getToken(CoolParser.FI, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class CaseContext extends ExprContext {
		public ExprContext expression;
		public BranchContext branch;
		public List<BranchContext> branches = new ArrayList<BranchContext>();

		public CaseContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode CASE() {
			return getToken(CoolParser.CASE, 0);
		}

		public TerminalNode OF() {
			return getToken(CoolParser.OF, 0);
		}

		public TerminalNode ESAC() {
			return getToken(CoolParser.ESAC, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}

		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InstantiationContext extends ExprContext {
		public InstantiationContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode NEW() {
			return getToken(CoolParser.NEW, 0);
		}

		public TerminalNode TYPE_ID() {
			return getToken(CoolParser.TYPE_ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}
}