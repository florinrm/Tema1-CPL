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
			RULE_expr = 4;
	public static final String[] ruleNames = makeRuleNames();
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00ab\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2" +
					"\3\2\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13" +
					"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\5\4\61\n\4\3\4" +
					"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\5\4?\n\4\3\5\3\5\3\5\3\5" +
					"\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
					"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6a\n\6\r\6\16\6b\3\6\3" +
					"\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13" +
					"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0082\n\6\r\6\16\6" +
					"\u0083\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
					"\3\6\3\6\3\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
					"\7\6\u00a6\n\6\f\6\16\6\u00a9\13\6\3\6\2\3\n\7\2\4\6\b\n\2\5\3\2&\'\3" +
					"\2$%\3\2)+\2\u00c3\2\17\3\2\2\2\4\25\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\n\u009a" +
					"\3\2\2\2\f\r\5\4\3\2\r\16\7\34\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3" +
					"\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3" +
					"\2\2\2\25\26\7\13\2\2\26\31\7\31\2\2\27\30\7\f\2\2\30\32\7\31\2\2\31\27" +
					"\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33!\7\"\2\2\34\35\5\6\4\2\35\36\7" +
					"\34\2\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$" +
					"\3\2\2\2#!\3\2\2\2$%\7#\2\2%\5\3\2\2\2&\'\7\32\2\2\'\60\7 \2\2(-\5\b\5" +
					"\2)*\7\36\2\2*,\5\b\5\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61\3" +
					"\2\2\2/-\3\2\2\2\60(\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7!\2\2" +
					"\63\64\7\35\2\2\64\65\7\31\2\2\65\66\7\"\2\2\66\67\5\n\6\2\678\7#\2\2" +
					"8?\3\2\2\29<\5\b\5\2:;\7\37\2\2;=\5\n\6\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2" +
					"\2>&\3\2\2\2>9\3\2\2\2?\7\3\2\2\2@A\7\32\2\2AB\7\35\2\2BC\7\31\2\2C\t" +
					"\3\2\2\2DE\b\6\1\2EF\7\32\2\2FG\7 \2\2GJ\5\n\6\2HI\7\36\2\2IK\5\n\6\2" +
					"JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7!\2\2M\u009b\3\2\2\2NO\7\4\2\2OP\5\n" +
					"\6\2PQ\7\5\2\2QR\5\n\6\2RS\7\6\2\2ST\5\n\6\2TU\7\7\2\2U\u009b\3\2\2\2" +
					"VW\7\17\2\2WX\5\n\6\2XY\7\20\2\2YZ\5\n\6\2Z[\7\21\2\2[\u009b\3\2\2\2\\" +
					"`\7\"\2\2]^\5\n\6\2^_\7\34\2\2_a\3\2\2\2`]\3\2\2\2ab\3\2\2\2b`\3\2\2\2" +
					"bc\3\2\2\2cd\3\2\2\2de\7#\2\2e\u009b\3\2\2\2fg\7\r\2\2gj\5\b\5\2hi\7\37" +
					"\2\2ik\5\n\6\2jh\3\2\2\2jk\3\2\2\2ks\3\2\2\2lm\7\36\2\2mn\5\b\5\2no\7" +
					"\37\2\2op\5\n\6\2pr\3\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv" +
					"\3\2\2\2us\3\2\2\2vw\7\16\2\2wx\5\n\6\21x\u009b\3\2\2\2yz\7\22\2\2z{\5" +
					"\n\6\2{\u0081\7\23\2\2|}\5\b\5\2}~\7(\2\2~\177\5\n\6\2\177\u0080\7\34" +
					"\2\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081" +
					"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\24\2\2" +
					"\u0086\u009b\3\2\2\2\u0087\u0088\7\n\2\2\u0088\u009b\7\31\2\2\u0089\u008a" +
					"\7\32\2\2\u008a\u008b\7\37\2\2\u008b\u009b\5\n\6\f\u008c\u008d\7\b\2\2" +
					"\u008d\u009b\5\n\6\13\u008e\u008f\7\25\2\2\u008f\u009b\5\n\6\n\u0090\u0091" +
					"\7\t\2\2\u0091\u009b\5\n\6\b\u0092\u0093\7 \2\2\u0093\u0094\5\n\6\2\u0094" +
					"\u0095\7!\2\2\u0095\u009b\3\2\2\2\u0096\u009b\7\32\2\2\u0097\u009b\7\26" +
					"\2\2\u0098\u009b\7\27\2\2\u0099\u009b\7\30\2\2\u009aD\3\2\2\2\u009aN\3" +
					"\2\2\2\u009aV\3\2\2\2\u009a\\\3\2\2\2\u009af\3\2\2\2\u009ay\3\2\2\2\u009a" +
					"\u0087\3\2\2\2\u009a\u0089\3\2\2\2\u009a\u008c\3\2\2\2\u009a\u008e\3\2" +
					"\2\2\u009a\u0090\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009a" +
					"\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00a7\3\2" +
					"\2\2\u009c\u009d\f\16\2\2\u009d\u009e\t\2\2\2\u009e\u00a6\5\n\6\17\u009f" +
					"\u00a0\f\r\2\2\u00a0\u00a1\t\3\2\2\u00a1\u00a6\5\n\6\16\u00a2\u00a3\f" +
					"\t\2\2\u00a3\u00a4\t\4\2\2\u00a4\u00a6\5\n\6\n\u00a5\u009c\3\2\2\2\u00a5" +
					"\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2" +
					"\2\2\u00a7\u00a8\3\2\2\2\u00a8\13\3\2\2\2\u00a9\u00a7\3\2\2\2\21\21\31" +
					"!-\60<>Jbjs\u0083\u009a\u00a5\u00a7";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		return "CoolParser.g4"; }

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
		return _ATN; }

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
										((FunctionDefinitionContext) _localctx).declare_type = declare_type();
										((FunctionDefinitionContext) _localctx).params.add(((FunctionDefinitionContext) _localctx).declare_type);
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
				setState(152);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
					case 1: {
						_localctx = new FunctionCallContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(67);
						((FunctionCallContext) _localctx).name = match(ID);
						setState(68);
						match(LPAREN);
						{
							setState(69);
							((FunctionCallContext) _localctx).expr = expr(0);
							((FunctionCallContext) _localctx).arguments.add(((FunctionCallContext) _localctx).expr);
							setState(72);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == COMMA) {
								{
									setState(70);
									match(COMMA);
									setState(71);
									((FunctionCallContext) _localctx).expr = expr(0);
									((FunctionCallContext) _localctx).arguments.add(((FunctionCallContext) _localctx).expr);
								}
							}

						}
						setState(74);
						match(RPAREN);
					}
					break;
					case 2: {
						_localctx = new IfContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(76);
						match(IF);
						setState(77);
						((IfContext) _localctx).condition = expr(0);
						setState(78);
						match(THEN);
						setState(79);
						((IfContext) _localctx).then_branch = expr(0);
						setState(80);
						match(ELSE);
						setState(81);
						((IfContext) _localctx).else_branch = expr(0);
						setState(82);
						match(FI);
					}
					break;
					case 3: {
						_localctx = new WhileContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(84);
						match(WHILE);
						setState(85);
						((WhileContext) _localctx).condition = expr(0);
						setState(86);
						match(LOOP);
						setState(87);
						((WhileContext) _localctx).body = expr(0);
						setState(88);
						match(POOL);
					}
					break;
					case 4: {
						_localctx = new BodyContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(90);
						match(LBRACE);
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(91);
									((BodyContext) _localctx).expr = expr(0);
									((BodyContext) _localctx).expressios.add(((BodyContext) _localctx).expr);
									setState(92);
									match(SEMI);
								}
							}
							setState(96);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << NEGATION) | (1L << NOT) | (1L << NEW) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << ISVOID) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ID) | (1L << LPAREN) | (1L << LBRACE))) != 0));
						setState(98);
						match(RBRACE);
					}
					break;
					case 5: {
						_localctx = new LetContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(100);
						match(LET);
						setState(101);
						((LetContext) _localctx).declare_type = declare_type();
						((LetContext) _localctx).variables.add(((LetContext) _localctx).declare_type);
						setState(104);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == ASSIGN) {
							{
								setState(102);
								match(ASSIGN);
								setState(103);
								expr(0);
							}
						}

						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(106);
									match(COMMA);
									setState(107);
									((LetContext) _localctx).declare_type = declare_type();
									((LetContext) _localctx).variables.add(((LetContext) _localctx).declare_type);
									{
										setState(108);
										match(ASSIGN);
										setState(109);
										expr(0);
									}
								}
							}
							setState(115);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(116);
						match(IN);
						setState(117);
						((LetContext) _localctx).body = expr(15);
					}
					break;
					case 6: {
						_localctx = new CaseContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(119);
						match(CASE);
						setState(120);
						((CaseContext) _localctx).expression = expr(0);
						setState(121);
						match(OF);
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(122);
									((CaseContext) _localctx).declare_type = declare_type();
									((CaseContext) _localctx).branches.add(((CaseContext) _localctx).declare_type);
									setState(123);
									match(RESULTS);
									setState(124);
									((CaseContext) _localctx).body = expr(0);
									setState(125);
									match(SEMI);
								}
							}
							setState(129);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while (_la == ID);
						setState(131);
						match(ESAC);
					}
					break;
					case 7: {
						_localctx = new InstantiationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(133);
						match(NEW);
						setState(134);
						match(TYPE_ID);
					}
					break;
					case 8: {
						_localctx = new VariableAssignmentContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(135);
						((VariableAssignmentContext) _localctx).name = match(ID);
						setState(136);
						match(ASSIGN);
						setState(137);
						((VariableAssignmentContext) _localctx).value = expr(10);
					}
					break;
					case 9: {
						_localctx = new UnaryNegationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(138);
						match(NEGATION);
						setState(139);
						((UnaryNegationContext) _localctx).expression = expr(9);
					}
					break;
					case 10: {
						_localctx = new VoidContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(140);
						match(ISVOID);
						setState(141);
						((VoidContext) _localctx).expression = expr(8);
					}
					break;
					case 11: {
						_localctx = new NegationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(142);
						match(NOT);
						setState(143);
						((NegationContext) _localctx).expression = expr(6);
					}
					break;
					case 12: {
						_localctx = new ParanthesesContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(144);
						match(LPAREN);
						setState(145);
						((ParanthesesContext) _localctx).expression = expr(0);
						setState(146);
						match(RPAREN);
					}
					break;
					case 13: {
						_localctx = new IdContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(148);
						match(ID);
					}
					break;
					case 14: {
						_localctx = new BooleanContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(149);
						match(BOOL);
					}
					break;
					case 15: {
						_localctx = new StringContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(150);
						match(STRING);
					}
					break;
					case 16: {
						_localctx = new IntContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(151);
						match(INT);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(163);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
								case 1: {
									_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
									((MulDivContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(154);
									if (!(precpred(_ctx, 12)))
										throw new FailedPredicateException(this, "precpred(_ctx, 12)");
									setState(155);
									((MulDivContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == MUL || _la == DIV)) {
										((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(156);
									((MulDivContext) _localctx).rightBranch = expr(13);
								}
								break;
								case 2: {
									_localctx = new MinusPlusContext(new ExprContext(_parentctx, _parentState));
									((MinusPlusContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(157);
									if (!(precpred(_ctx, 11)))
										throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(158);
									((MinusPlusContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == PLUS || _la == MINUS)) {
										((MinusPlusContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(159);
									((MinusPlusContext) _localctx).rightBranch = expr(12);
								}
								break;
								case 3: {
									_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
									((CompareContext) _localctx).leftBranch = _prevctx;
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(160);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(161);
									((CompareContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << LE))) != 0))) {
										((CompareContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(162);
									((CompareContext) _localctx).rightBranch = expr(8);
								}
								break;
							}
						}
					}
					setState(167);
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
			return getTokens(CoolParser.SEMI); }

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
			return RULE_program; }
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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitProgram(this);
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
			return getTokens(CoolParser.TYPE_ID); }

		public TerminalNode TYPE_ID(int i) {
			return getToken(CoolParser.TYPE_ID, i);
		}

		public TerminalNode INHERITS() {
			return getToken(CoolParser.INHERITS, 0);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI); }

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
			return RULE_class_def; }
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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitClass_def(this);
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
			return RULE_definition; }

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
			return getToken(CoolParser.TYPE_ID, 0); }

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
			return getTokens(CoolParser.COMMA); }

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
			copyFrom(ctx); }

		public Declare_typeContext declare_type() {
			return getRuleContext(Declare_typeContext.class, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(CoolParser.ASSIGN, 0); }

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
			return RULE_declare_type; }
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
			return RULE_expr; }
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
			return getToken(CoolParser.NOT, 0); }

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitNegation(this);
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
			copyFrom(ctx); }

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
			return getToken(CoolParser.EQUAL, 0); }

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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitCompare(this);
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
			return getToken(CoolParser.ID, 0); }

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			return getToken(CoolParser.ISVOID, 0); }

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			return getToken(CoolParser.STRING, 0); }

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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitString(this);
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
			copyFrom(ctx); }

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode PLUS() {
			return getToken(CoolParser.PLUS, 0);
		}

		public TerminalNode MINUS() {
			return getToken(CoolParser.MINUS, 0); }

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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitMinusPlus(this);
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
			return getToken(CoolParser.RPAREN, 0); }

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			return getToken(CoolParser.LOOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode POOL() {
			return getToken(CoolParser.POOL, 0); }

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitWhile(this);
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
			return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI); }

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			return getToken(CoolParser.INT, 0); }

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
			copyFrom(ctx); }

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode MUL() {
			return getToken(CoolParser.MUL, 0);
		}

		public TerminalNode DIV() {
			return getToken(CoolParser.DIV, 0); }

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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BooleanContext extends ExprContext {
		public BooleanContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BOOL() {
			return getToken(CoolParser.BOOL, 0); }

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
			if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitBoolean(this);
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
			return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode ID() {
			return getToken(CoolParser.ID, 0); }

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode COMMA() {
			return getToken(CoolParser.COMMA, 0); }

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
			return getToken(CoolParser.NEGATION, 0); }

		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			return getToken(CoolParser.LET, 0); }
		public List<Declare_typeContext> declare_type() {
			return getRuleContexts(Declare_typeContext.class);
		}

		public TerminalNode IN() {
			return getToken(CoolParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public Declare_typeContext declare_type(int i) {
			return getRuleContext(Declare_typeContext.class, i);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<TerminalNode> ASSIGN() {
			return getTokens(CoolParser.ASSIGN); }

		public TerminalNode ASSIGN(int i) {
			return getToken(CoolParser.ASSIGN, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(CoolParser.COMMA); }

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
			return getToken(CoolParser.ELSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode FI() {
			return getToken(CoolParser.FI, 0); }

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			return getToken(CoolParser.OF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode ESAC() {
			return getToken(CoolParser.ESAC, 0); }

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<TerminalNode> RESULTS() {
			return getTokens(CoolParser.RESULTS); }

		public TerminalNode RESULTS(int i) {
			return getToken(CoolParser.RESULTS, i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<Declare_typeContext> declare_type() {
			return getRuleContexts(Declare_typeContext.class);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(CoolParser.SEMI); }

		public Declare_typeContext declare_type(int i) {
			return getRuleContext(Declare_typeContext.class,i);
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
			return getToken(CoolParser.TYPE_ID, 0); }

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