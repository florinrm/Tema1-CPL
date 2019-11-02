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
			INHERITS = 10, LET = 11, IN = 12, SELFTYPE = 13, WHILE = 14, LOOP = 15, POOL = 16, CASE = 17,
			OF = 18, ESAC = 19, ISVOID = 20, BOOL = 21, TYPE = 22, INT = 23, TYPE_ID = 24, ID = 25,
			FLOAT = 26, STRING = 27, SEMI = 28, COLON = 29, COMMA = 30, ASSIGN = 31, LPAREN = 32,
			RPAREN = 33, LBRACE = 34, RBRACE = 35, PLUS = 36, MINUS = 37, MUL = 38, DIV = 39, RESULTS = 40,
			EQUAL = 41, LT = 42, LE = 43, LINE_COMMENT = 44, BLOCK_COMMENT = 45, WS = 46;
	public static final int
			RULE_program = 0, RULE_class_def = 1, RULE_definition = 2, RULE_declare_type = 3,
			RULE_expr = 4;
	public static final String[] ruleNames = makeRuleNames();
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00aa\4\2\t\2" +
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3" +
					"\2\3\2\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13" +
					"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\5\4\61\n\4\3\4" +
					"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\5\4?\n\4\3\5\3\5\3\5\3\5" +
					"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\6\3\6\3\6\3\6" +
					"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6c\n\6\r\6\16\6" +
					"d\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\6\3\6\7\6t\n\6\f\6\16" +
					"\6w\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0084\n\6\r\6" +
					"\16\6\u0085\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
					"\6\3\6\3\6\3\6\5\6\u009a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a5" +
					"\n\6\f\6\16\6\u00a8\13\6\3\6\2\3\n\7\2\4\6\b\n\2\5\3\2()\3\2&\'\3\2+-" +
					"\2\u00c2\2\17\3\2\2\2\4\25\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\n\u0099\3\2\2" +
					"\2\f\r\5\4\3\2\r\16\7\36\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3\2\2\2" +
					"\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2" +
					"\25\26\7\13\2\2\26\31\7\32\2\2\27\30\7\f\2\2\30\32\7\32\2\2\31\27\3\2" +
					"\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33!\7$\2\2\34\35\5\6\4\2\35\36\7\36\2" +
					"\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2" +
					"\2#!\3\2\2\2$%\7%\2\2%\5\3\2\2\2&\'\7\33\2\2\'\60\7\"\2\2(-\5\b\5\2)*" +
					"\7 \2\2*,\5\b\5\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61\3\2\2\2" +
					"/-\3\2\2\2\60(\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7#\2\2\63\64" +
					"\7\37\2\2\64\65\7\32\2\2\65\66\7$\2\2\66\67\5\n\6\2\678\7%\2\28?\3\2\2" +
					"\29<\5\b\5\2:;\7!\2\2;=\5\n\6\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>&\3\2\2" +
					"\2>9\3\2\2\2?\7\3\2\2\2@A\7\33\2\2AB\7\37\2\2BC\7\32\2\2C\t\3\2\2\2DE" +
					"\b\6\1\2EF\7\33\2\2FG\7!\2\2G\u009a\5\n\6\25HI\7\33\2\2IJ\7\"\2\2JM\5" +
					"\n\6\2KL\7 \2\2LN\5\n\6\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7#\2\2P\u009a" +
					"\3\2\2\2QR\7\4\2\2RS\5\n\6\2ST\7\5\2\2TU\5\n\6\2UV\7\6\2\2VW\5\n\6\23" +
					"W\u009a\3\2\2\2XY\7\20\2\2YZ\5\n\6\2Z[\7\21\2\2[\\\5\n\6\2\\]\7\22\2\2" +
					"]\u009a\3\2\2\2^b\7$\2\2_`\5\n\6\2`a\7\36\2\2ac\3\2\2\2b_\3\2\2\2cd\3" +
					"\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7%\2\2g\u009a\3\2\2\2hi\7\r\2\2" +
					"il\5\b\5\2jk\7!\2\2km\5\n\6\2lj\3\2\2\2lm\3\2\2\2mu\3\2\2\2no\7 \2\2o" +
					"p\5\b\5\2pq\7!\2\2qr\5\n\6\2rt\3\2\2\2sn\3\2\2\2tw\3\2\2\2us\3\2\2\2u" +
					"v\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\16\2\2yz\5\n\6\20z\u009a\3\2\2\2{|\7" +
					"\23\2\2|}\5\n\6\2}\u0083\7\24\2\2~\177\5\b\5\2\177\u0080\7*\2\2\u0080" +
					"\u0081\5\n\6\2\u0081\u0082\7\36\2\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2" +
					"\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087" +
					"\3\2\2\2\u0087\u0088\7\25\2\2\u0088\u009a\3\2\2\2\u0089\u008a\7\n\2\2" +
					"\u008a\u009a\7\32\2\2\u008b\u008c\7\26\2\2\u008c\u009a\5\n\6\r\u008d\u008e" +
					"\7\b\2\2\u008e\u009a\5\n\6\n\u008f\u0090\7\t\2\2\u0090\u009a\5\n\6\b\u0091" +
					"\u0092\7\"\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7#\2\2\u0094\u009a\3\2" +
					"\2\2\u0095\u009a\7\27\2\2\u0096\u009a\7\35\2\2\u0097\u009a\7\34\2\2\u0098" +
					"\u009a\7\31\2\2\u0099D\3\2\2\2\u0099H\3\2\2\2\u0099Q\3\2\2\2\u0099X\3" +
					"\2\2\2\u0099^\3\2\2\2\u0099h\3\2\2\2\u0099{\3\2\2\2\u0099\u0089\3\2\2" +
					"\2\u0099\u008b\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0091" +
					"\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099" +
					"\u0098\3\2\2\2\u009a\u00a6\3\2\2\2\u009b\u009c\f\f\2\2\u009c\u009d\t\2" +
					"\2\2\u009d\u00a5\5\n\6\r\u009e\u009f\f\13\2\2\u009f\u00a0\t\3\2\2\u00a0" +
					"\u00a5\5\n\6\f\u00a1\u00a2\f\t\2\2\u00a2\u00a3\t\4\2\2\u00a3\u00a5\5\n" +
					"\6\n\u00a4\u009b\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5" +
					"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\13\3\2\2" +
					"\2\u00a8\u00a6\3\2\2\2\21\21\31!-\60<>Mdlu\u0085\u0099\u00a4\u00a6";
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

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	private static String[] makeRuleNames() {
		return new String[]{
				"program", "class_def", "definition", "declare_type", "expr"
		};
	}

	private static String[] makeLiteralNames() {
		return new String[]{
				null, null, "'if'", "'then'", "'else'", "'fi'", "'~'", "'not'", "'new'",
				"'class'", "'inherits'", "'let'", "'in'", "'SELF_TYPE'", "'while'", "'loop'",
				"'pool'", "'case'", "'of'", "'esac'", "'isvoid'", null, null, null, null,
				null, null, null, "';'", "':'", "','", "'<-'", "'('", "')'", "'{'", "'}'",
				"'+'", "'-'", "'*'", "'/'", "'=>'", "'='", "'<'", "'<='"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, "ERROR", "IF", "THEN", "ELSE", "FI", "NEGATION", "NOT", "NEW",
				"CLASS", "INHERITS", "LET", "IN", "SELFTYPE", "WHILE", "LOOP", "POOL",
				"CASE", "OF", "ESAC", "ISVOID", "BOOL", "TYPE", "INT", "TYPE_ID", "ID",
				"FLOAT", "STRING", "SEMI", "COLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN",
				"LBRACE", "RBRACE", "PLUS", "MINUS", "MUL", "DIV", "RESULTS", "EQUAL",
				"LT", "LE", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
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
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(10);
							((ProgramContext) _localctx).class_def = class_def();
							((ProgramContext) _localctx).classesProgram.add(((ProgramContext) _localctx).class_def);
							setState(11);
							match(SEMI);
						}
					}
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == CLASS);
				setState(17);
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
				setState(19);
				match(CLASS);
				setState(20);
				((Class_defContext) _localctx).class_type = match(TYPE_ID);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == INHERITS) {
					{
						setState(21);
						match(INHERITS);
						setState(22);
						((Class_defContext) _localctx).inheritedClass = match(TYPE_ID);
					}
				}

				setState(25);
				match(LBRACE);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ID) {
					{
						{
							setState(26);
							((Class_defContext) _localctx).definition = definition();
							((Class_defContext) _localctx).definitions.add(((Class_defContext) _localctx).definition);
							setState(27);
							match(SEMI);
						}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
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
			setState(60);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1:
					_localctx = new FunctionDefinitionContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(36);
					((FunctionDefinitionContext) _localctx).nameFunc = match(ID);
					setState(37);
					match(LPAREN);
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == ID) {
						{
							setState(38);
							((FunctionDefinitionContext) _localctx).declare_type = declare_type();
							((FunctionDefinitionContext) _localctx).params.add(((FunctionDefinitionContext) _localctx).declare_type);
							setState(43);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == COMMA) {
								{
									{
										setState(39);
										match(COMMA);
										setState(40);
										declare_type();
									}
								}
								setState(45);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(48);
					match(RPAREN);
					setState(49);
					match(COLON);
					setState(50);
					((FunctionDefinitionContext) _localctx).returnType = match(TYPE_ID);
					setState(51);
					match(LBRACE);
					setState(52);
					((FunctionDefinitionContext) _localctx).body = expr(0);
					setState(53);
					match(RBRACE);
				}
				break;
				case 2:
					_localctx = new VariableDefinitionContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(55);
					declare_type();
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == ASSIGN) {
						{
							setState(56);
							match(ASSIGN);
							setState(57);
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
				setState(62);
				((Declare_typeContext) _localctx).name = match(ID);
				setState(63);
				match(COLON);
				setState(64);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(151);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
					case 1: {
						_localctx = new VariableAssignmentContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(67);
						((VariableAssignmentContext) _localctx).name = match(ID);
						setState(68);
						match(ASSIGN);
						setState(69);
						((VariableAssignmentContext) _localctx).value = expr(19);
					}
					break;
					case 2: {
						_localctx = new FunctionCallContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(70);
						((FunctionCallContext) _localctx).name = match(ID);
						setState(71);
						match(LPAREN);
						{
							setState(72);
							((FunctionCallContext) _localctx).expr = expr(0);
							((FunctionCallContext) _localctx).arguments.add(((FunctionCallContext) _localctx).expr);
							setState(75);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == COMMA) {
								{
									setState(73);
									match(COMMA);
									setState(74);
									((FunctionCallContext) _localctx).expr = expr(0);
									((FunctionCallContext) _localctx).arguments.add(((FunctionCallContext) _localctx).expr);
								}
							}

						}
						setState(77);
						match(RPAREN);
					}
					break;
					case 3: {
						_localctx = new IfContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(79);
						match(IF);
						setState(80);
						((IfContext) _localctx).condition = expr(0);
						setState(81);
						match(THEN);
						setState(82);
						((IfContext) _localctx).then_branch = expr(0);
						setState(83);
						match(ELSE);
						setState(84);
						((IfContext) _localctx).else_branch = expr(17);
					}
					break;
					case 4: {
						_localctx = new WhileContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(86);
						match(WHILE);
						setState(87);
						((WhileContext) _localctx).condition = expr(0);
						setState(88);
						match(LOOP);
						setState(89);
						((WhileContext) _localctx).body = expr(0);
						setState(90);
						match(POOL);
					}
					break;
					case 5: {
						_localctx = new BodyContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(92);
						match(LBRACE);
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(93);
									((BodyContext) _localctx).expr = expr(0);
									((BodyContext) _localctx).expressios.add(((BodyContext) _localctx).expr);
									setState(94);
									match(SEMI);
								}
							}
							setState(98);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << NEGATION) | (1L << NOT) | (1L << NEW) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << ISVOID) | (1L << BOOL) | (1L << INT) | (1L << ID) | (1L << FLOAT) | (1L << STRING) | (1L << LPAREN) | (1L << LBRACE))) != 0));
						setState(100);
						match(RBRACE);
					}
					break;
					case 6: {
						_localctx = new LetContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(102);
						match(LET);
						setState(103);
						((LetContext) _localctx).declare_type = declare_type();
						((LetContext) _localctx).variables.add(((LetContext) _localctx).declare_type);
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == ASSIGN) {
							{
								setState(104);
								match(ASSIGN);
								setState(105);
								expr(0);
							}
						}

						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(108);
									match(COMMA);
									setState(109);
									((LetContext) _localctx).declare_type = declare_type();
									((LetContext) _localctx).variables.add(((LetContext) _localctx).declare_type);
									{
										setState(110);
										match(ASSIGN);
										setState(111);
										expr(0);
									}
								}
							}
							setState(117);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(118);
						match(IN);
						setState(119);
						((LetContext) _localctx).body = expr(14);
					}
					break;
					case 7: {
						_localctx = new CaseContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(121);
						match(CASE);
						setState(122);
						((CaseContext) _localctx).expression = expr(0);
						setState(123);
						match(OF);
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(124);
									((CaseContext) _localctx).declare_type = declare_type();
									((CaseContext) _localctx).branches.add(((CaseContext) _localctx).declare_type);
									setState(125);
									match(RESULTS);
									setState(126);
									((CaseContext) _localctx).body = expr(0);
									setState(127);
									match(SEMI);
								}
							}
							setState(131);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while (_la == ID);
						setState(133);
						match(ESAC);
					}
					break;
					case 8: {
						_localctx = new InstantiationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(135);
						match(NEW);
						setState(136);
						match(TYPE_ID);
					}
					break;
					case 9: {
						_localctx = new VoidContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(137);
						match(ISVOID);
						setState(138);
						((VoidContext) _localctx).expression = expr(11);
					}
					break;
					case 10: {
						_localctx = new UnaryNegationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(139);
						match(NEGATION);
						setState(140);
						((UnaryNegationContext) _localctx).expression = expr(8);
					}
					break;
					case 11: {
						_localctx = new NegationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(141);
						match(NOT);
						setState(142);
						((NegationContext) _localctx).expression = expr(6);
					}
					break;
					case 12: {
						_localctx = new ParanthesesContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(143);
						match(LPAREN);
						setState(144);
						((ParanthesesContext) _localctx).expression = expr(0);
						setState(145);
						match(RPAREN);
					}
					break;
					case 13: {
						_localctx = new BooleanContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(147);
						match(BOOL);
					}
					break;
					case 14: {
						_localctx = new StringContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(148);
						match(STRING);
					}
					break;
					case 15: {
						_localctx = new FloatContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(149);
						match(FLOAT);
					}
					break;
					case 16: {
						_localctx = new IntContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(150);
						match(INT);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(162);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
								case 1: {
									_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
									((MulDivContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(153);
									if (!(precpred(_ctx, 10)))
										throw new FailedPredicateException(this, "precpred(_ctx, 10)");
									setState(154);
									((MulDivContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == MUL || _la == DIV)) {
										((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(155);
									((MulDivContext) _localctx).rightBranch = expr(11);
								}
								break;
								case 2: {
									_localctx = new MinusPlusContext(new ExprContext(_parentctx, _parentState));
									((MinusPlusContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(156);
									if (!(precpred(_ctx, 9)))
										throw new FailedPredicateException(this, "precpred(_ctx, 9)");
									setState(157);
									((MinusPlusContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == PLUS || _la == MINUS)) {
										((MinusPlusContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(158);
									((MinusPlusContext) _localctx).rightBranch = expr(10);
								}
								break;
								case 3: {
									_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
									((CompareContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(159);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(160);
									((CompareContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << LE))) != 0))) {
										((CompareContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(161);
									((CompareContext) _localctx).rightBranch = expr(8);
								}
								break;
							}
						}
					}
					setState(166);
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
			case 4:
				return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 10);
			case 1:
				return precpred(_ctx, 9);
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
			return getRuleContext(ExprContext.class, 0);
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
			return getRuleContext(ExprContext.class, 0);
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

		public TerminalNode NOT() {
			return getToken(CoolParser.NOT, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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

		public CompareContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
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

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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

		public TerminalNode ISVOID() {
			return getToken(CoolParser.ISVOID, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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

		public MinusPlusContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
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

		public TerminalNode RPAREN() {
			return getToken(CoolParser.RPAREN, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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

		public TerminalNode POOL() {
			return getToken(CoolParser.POOL, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
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

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI);
		}

		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
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

	public static class FloatContext extends ExprContext {
		public FloatContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FLOAT() {
			return getToken(CoolParser.FLOAT, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterFloat(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitFloat(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CoolParserVisitor)
				return ((CoolParserVisitor<? extends T>) visitor).visitFloat(this);
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

		public MulDivContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
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

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode COMMA() {
			return getToken(CoolParser.COMMA, 0);
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

		public TerminalNode NEGATION() {
			return getToken(CoolParser.NEGATION, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
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
		public Declare_typeContext declare_type;
		public List<Declare_typeContext> variables = new ArrayList<Declare_typeContext>();
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

		public List<Declare_typeContext> declare_type() {
			return getRuleContexts(Declare_typeContext.class);
		}

		public Declare_typeContext declare_type(int i) {
			return getRuleContext(Declare_typeContext.class, i);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<TerminalNode> ASSIGN() {
			return getTokens(CoolParser.ASSIGN);
		}

		public TerminalNode ASSIGN(int i) {
			return getToken(CoolParser.ASSIGN, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(CoolParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
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
			return getRuleContext(ExprContext.class, i);
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
		public Declare_typeContext declare_type;
		public List<Declare_typeContext> branches = new ArrayList<Declare_typeContext>();
		public ExprContext body;

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

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<TerminalNode> RESULTS() {
			return getTokens(CoolParser.RESULTS);
		}

		public TerminalNode RESULTS(int i) {
			return getToken(CoolParser.RESULTS, i);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI);
		}

		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}

		public List<Declare_typeContext> declare_type() {
			return getRuleContexts(Declare_typeContext.class);
		}

		public Declare_typeContext declare_type(int i) {
			return getRuleContext(Declare_typeContext.class, i);
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