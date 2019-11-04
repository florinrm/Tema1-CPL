// Generated from /home/student/CPL/Teme/Tema1CPL/src/cool/lexer/CoolLexer.g4 by ANTLR 4.7.2
package cool.lexer;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	public static final int
			ERROR = 1, IF = 2, THEN = 3, ELSE = 4, FI = 5, NEGATION = 6, NOT = 7, NEW = 8, CLASS = 9,
			INHERITS = 10, LET = 11, IN = 12, WHILE = 13, LOOP = 14, POOL = 15, CASE = 16, OF = 17,
			ESAC = 18, ISVOID = 19, BOOL = 20, STRING = 21, INT = 22, TYPE_ID = 23, ID = 24, FLOAT = 25,
			DOT = 26, ANNOTATION = 27, SEMI = 28, COLON = 29, COMMA = 30, ASSIGN = 31, LPAREN = 32,
			RPAREN = 33, LBRACE = 34, RBRACE = 35, PLUS = 36, MINUS = 37, MUL = 38, DIV = 39, RESULTS = 40,
			EQUAL = 41, LT = 42, LE = 43, LINE_COMMENT = 44, BLOCK_COMMENT = 45, WS = 46;
	public static final String[] ruleNames = makeRuleNames();
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01a4\b\1\4\2" +
					"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
					"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
					"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
					"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
					" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
					"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
					"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\3" +
					"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3" +
					"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n" +
					"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3" +
					"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20" +
					"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23" +
					"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25" +
					"\3\25\3\25\3\25\3\25\3\25\5\25\u00dd\n\25\3\26\3\26\3\27\3\27\3\27\3\27" +
					"\3\27\3\27\3\30\3\30\3\30\5\30\u00ea\n\30\3\31\3\31\3\31\7\31\u00ef\n" +
					"\31\f\31\16\31\u00f2\13\31\3\31\3\31\3\31\3\31\3\31\7\31\u00f9\n\31\f" +
					"\31\16\31\u00fc\13\31\3\31\5\31\u00ff\n\31\3\32\3\32\3\32\3\32\3\32\3" +
					"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0113" +
					"\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u011e\n\37\r\37" +
					"\16\37\u011f\3 \3 \3 \3 \3 \3 \7 \u0128\n \f \16 \u012b\13 \5 \u012d\n" +
					" \3!\3!\3!\3!\7!\u0133\n!\f!\16!\u0136\13!\3\"\6\"\u0139\n\"\r\"\16\"" +
					"\u013a\3#\3#\5#\u013f\n#\3#\3#\3$\3$\3$\5$\u0146\n$\5$\u0148\n$\3$\3$" +
					"\5$\u014c\n$\3$\5$\u014f\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3" +
					"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3" +
					"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\5\67\u0179\n\67\3\67\3\67" +
					"\38\38\38\38\78\u0181\n8\f8\168\u0184\138\38\38\58\u0188\n8\38\38\39\3" +
					"9\39\39\39\79\u0191\n9\f9\169\u0194\139\39\39\39\39\59\u019a\n9\39\39" +
					"\3:\6:\u019f\n:\r:\16:\u01a0\3:\3:\5\u00fa\u0182\u0192\2;\3\4\5\5\7\6" +
					"\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\2\33\17\35\20\37\21!\22#\23" +
					"%\24\'\25)\26+\2-\2/\2\61\27\63\2\65\2\67\29\2;\2=\30?\31A\32C\2E\2G\33" +
					"I\34K\35M\36O\37Q S!U\"W#Y$[%]&_\'a(c)e*g+i,k-m\2o.q/s\60\3\2\13\5\2\62" +
					";CHch\n\2$$\61\61^^ddhhppttvv\4\2$$^^\3\2C\\\3\2c|\4\2C\\c|\3\2\62;\4" +
					"\2--//\5\2\13\f\17\17\"\"\2\u01b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2" +
					"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3" +
					"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2" +
					"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\61\3\2\2" +
					"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2" +
					"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3" +
					"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2" +
					"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3" +
					"u\3\2\2\2\5x\3\2\2\2\7}\3\2\2\2\t\u0082\3\2\2\2\13\u0085\3\2\2\2\r\u0087" +
					"\3\2\2\2\17\u008b\3\2\2\2\21\u008f\3\2\2\2\23\u0095\3\2\2\2\25\u009e\3" +
					"\2\2\2\27\u00a2\3\2\2\2\31\u00a5\3\2\2\2\33\u00af\3\2\2\2\35\u00b5\3\2" +
					"\2\2\37\u00ba\3\2\2\2!\u00bf\3\2\2\2#\u00c4\3\2\2\2%\u00c7\3\2\2\2\'\u00cc" +
					"\3\2\2\2)\u00dc\3\2\2\2+\u00de\3\2\2\2-\u00e0\3\2\2\2/\u00e6\3\2\2\2\61" +
					"\u00fe\3\2\2\2\63\u0112\3\2\2\2\65\u0114\3\2\2\2\67\u0116\3\2\2\29\u0118" +
					"\3\2\2\2;\u011a\3\2\2\2=\u011d\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C" +
					"\u0138\3\2\2\2E\u013c\3\2\2\2G\u014b\3\2\2\2I\u0150\3\2\2\2K\u0152\3\2" +
					"\2\2M\u0154\3\2\2\2O\u0156\3\2\2\2Q\u0158\3\2\2\2S\u015a\3\2\2\2U\u015d" +
					"\3\2\2\2W\u015f\3\2\2\2Y\u0161\3\2\2\2[\u0163\3\2\2\2]\u0165\3\2\2\2_" +
					"\u0167\3\2\2\2a\u0169\3\2\2\2c\u016b\3\2\2\2e\u016d\3\2\2\2g\u0170\3\2" +
					"\2\2i\u0172\3\2\2\2k\u0174\3\2\2\2m\u0178\3\2\2\2o\u017c\3\2\2\2q\u018b" +
					"\3\2\2\2s\u019e\3\2\2\2uv\7k\2\2vw\7h\2\2w\4\3\2\2\2xy\7v\2\2yz\7j\2\2" +
					"z{\7g\2\2{|\7p\2\2|\6\3\2\2\2}~\7g\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080" +
					"\u0081\7g\2\2\u0081\b\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7k\2\2\u0084" +
					"\n\3\2\2\2\u0085\u0086\7\u0080\2\2\u0086\f\3\2\2\2\u0087\u0088\7p\2\2" +
					"\u0088\u0089\7q\2\2\u0089\u008a\7v\2\2\u008a\16\3\2\2\2\u008b\u008c\7" +
					"p\2\2\u008c\u008d\7g\2\2\u008d\u008e\7y\2\2\u008e\20\3\2\2\2\u008f\u0090" +
					"\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092\u0093\7u\2\2\u0093" +
					"\u0094\7u\2\2\u0094\22\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097" +
					"\u0098\7j\2\2\u0098\u0099\7g\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2" +
					"\u009b\u009c\7v\2\2\u009c\u009d\7u\2\2\u009d\24\3\2\2\2\u009e\u009f\7" +
					"n\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\26\3\2\2\2\u00a2\u00a3" +
					"\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7U\2\2\u00a6\u00a7" +
					"\7G\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9\7H\2\2\u00a9\u00aa\7a\2\2\u00aa" +
					"\u00ab\7V\2\2\u00ab\u00ac\7[\2\2\u00ac\u00ad\7R\2\2\u00ad\u00ae\7G\2\2" +
					"\u00ae\32\3\2\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7" +
					"k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4\34\3\2\2\2\u00b5\u00b6" +
					"\7n\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7r\2\2\u00b9" +
					"\36\3\2\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7q\2\2\u00bd" +
					"\u00be\7n\2\2\u00be \3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7c\2\2\u00c1" +
					"\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\"\3\2\2\2\u00c4\u00c5\7q\2\2\u00c5" +
					"\u00c6\7h\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7u\2\2\u00c9" +
					"\u00ca\7c\2\2\u00ca\u00cb\7e\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd" +
					"\u00ce\7u\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7k\2\2" +
					"\u00d1\u00d2\7f\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2" +
					"\2\u00d5\u00d6\7w\2\2\u00d6\u00dd\7g\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9" +
					"\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dd\7g\2\2\u00dc" +
					"\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd*\3\2\2\2\u00de\u00df\t\2\2\2" +
					"\u00df,\3\2\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\5+\26\2\u00e2\u00e3\5+" +
					"\26\2\u00e3\u00e4\5+\26\2\u00e4\u00e5\5+\26\2\u00e5.\3\2\2\2\u00e6\u00e9" +
					"\7^\2\2\u00e7\u00ea\t\3\2\2\u00e8\u00ea\5-\27\2\u00e9\u00e7\3\2\2\2\u00e9" +
					"\u00e8\3\2\2\2\u00ea\60\3\2\2\2\u00eb\u00f0\7$\2\2\u00ec\u00ef\5/\30\2" +
					"\u00ed\u00ef\n\4\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2" +
					"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2" +
					"\u00f0\3\2\2\2\u00f3\u00ff\7$\2\2\u00f4\u00fa\7$\2\2\u00f5\u00f6\7^\2" +
					"\2\u00f6\u00f9\7$\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f7" +
					"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb" +
					"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7$\2\2\u00fe\u00eb\3\2" +
					"\2\2\u00fe\u00f4\3\2\2\2\u00ff\62\3\2\2\2\u0100\u0101\7K\2\2\u0101\u0102" +
					"\7p\2\2\u0102\u0113\7v\2\2\u0103\u0104\7H\2\2\u0104\u0105\7n\2\2\u0105" +
					"\u0106\7q\2\2\u0106\u0107\7c\2\2\u0107\u0113\7v\2\2\u0108\u0109\7D\2\2" +
					"\u0109\u010a\7q\2\2\u010a\u010b\7q\2\2\u010b\u0113\7n\2\2\u010c\u010d" +
					"\7U\2\2\u010d\u010e\7v\2\2\u010e\u010f\7t\2\2\u010f\u0110\7k\2\2\u0110" +
					"\u0111\7p\2\2\u0111\u0113\7i\2\2\u0112\u0100\3\2\2\2\u0112\u0103\3\2\2" +
					"\2\u0112\u0108\3\2\2\2\u0112\u010c\3\2\2\2\u0113\64\3\2\2\2\u0114\u0115" +
					"\t\5\2\2\u0115\66\3\2\2\2\u0116\u0117\t\6\2\2\u01178\3\2\2\2\u0118\u0119" +
					"\t\7\2\2\u0119:\3\2\2\2\u011a\u011b\t\b\2\2\u011b<\3\2\2\2\u011c\u011e" +
					"\5;\36\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f" +
					"\u0120\3\2\2\2\u0120>\3\2\2\2\u0121\u012d\5\63\32\2\u0122\u012d\5\31\r" +
					"\2\u0123\u0129\5\65\33\2\u0124\u0128\59\35\2\u0125\u0128\7a\2\2\u0126" +
					"\u0128\5;\36\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2" +
					"\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a" +
					"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0121\3\2\2\2\u012c\u0122\3\2" +
					"\2\2\u012c\u0123\3\2\2\2\u012d@\3\2\2\2\u012e\u0134\5\67\34\2\u012f\u0133" +
					"\59\35\2\u0130\u0133\7a\2\2\u0131\u0133\5;\36\2\u0132\u012f\3\2\2\2\u0132" +
					"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2" +
					"\2\2\u0134\u0135\3\2\2\2\u0135B\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139" +
					"\5;\36\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a" +
					"\u013b\3\2\2\2\u013bD\3\2\2\2\u013c\u013e\7g\2\2\u013d\u013f\t\t\2\2\u013e" +
					"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\5C" +
					"\"\2\u0141F\3\2\2\2\u0142\u0147\5C\"\2\u0143\u0145\7\60\2\2\u0144\u0146" +
					"\5C\"\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147" +
					"\u0143\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014c\3\2\2\2\u0149\u014a\7\60" +
					"\2\2\u014a\u014c\5C\"\2\u014b\u0142\3\2\2\2\u014b\u0149\3\2\2\2\u014c" +
					"\u014e\3\2\2\2\u014d\u014f\5E#\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2" +
					"\2\u014fH\3\2\2\2\u0150\u0151\7\60\2\2\u0151J\3\2\2\2\u0152\u0153\7B\2" +
					"\2\u0153L\3\2\2\2\u0154\u0155\7=\2\2\u0155N\3\2\2\2\u0156\u0157\7<\2\2" +
					"\u0157P\3\2\2\2\u0158\u0159\7.\2\2\u0159R\3\2\2\2\u015a\u015b\7>\2\2\u015b" +
					"\u015c\7/\2\2\u015cT\3\2\2\2\u015d\u015e\7*\2\2\u015eV\3\2\2\2\u015f\u0160" +
					"\7+\2\2\u0160X\3\2\2\2\u0161\u0162\7}\2\2\u0162Z\3\2\2\2\u0163\u0164\7" +
					"\177\2\2\u0164\\\3\2\2\2\u0165\u0166\7-\2\2\u0166^\3\2\2\2\u0167\u0168" +
					"\7/\2\2\u0168`\3\2\2\2\u0169\u016a\7,\2\2\u016ab\3\2\2\2\u016b\u016c\7" +
					"\61\2\2\u016cd\3\2\2\2\u016d\u016e\7?\2\2\u016e\u016f\7@\2\2\u016ff\3" +
					"\2\2\2\u0170\u0171\7?\2\2\u0171h\3\2\2\2\u0172\u0173\7>\2\2\u0173j\3\2" +
					"\2\2\u0174\u0175\7>\2\2\u0175\u0176\7?\2\2\u0176l\3\2\2\2\u0177\u0179" +
					"\7\17\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2" +
					"\u017a\u017b\7\f\2\2\u017bn\3\2\2\2\u017c\u017d\7/\2\2\u017d\u017e\7/" +
					"\2\2\u017e\u0182\3\2\2\2\u017f\u0181\13\2\2\2\u0180\u017f\3\2\2\2\u0181" +
					"\u0184\3\2\2\2\u0182\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0187\3\2" +
					"\2\2\u0184\u0182\3\2\2\2\u0185\u0188\5m\67\2\u0186\u0188\7\2\2\3\u0187" +
					"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b8" +
					"\2\2\u018ap\3\2\2\2\u018b\u018c\7*\2\2\u018c\u018d\7,\2\2\u018d\u0192" +
					"\3\2\2\2\u018e\u0191\5q9\2\u018f\u0191\13\2\2\2\u0190\u018e\3\2\2\2\u0190" +
					"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0193\3\2\2\2\u0192\u0190\3\2" +
					"\2\2\u0193\u0199\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7,\2\2\u0196" +
					"\u019a\7+\2\2\u0197\u0198\7\2\2\3\u0198\u019a\b9\3\2\u0199\u0195\3\2\2" +
					"\2\u0199\u0197\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b9\2\2\u019cr\3" +
					"\2\2\2\u019d\u019f\t\n\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0" +
					"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b:" +
					"\2\2\u01a3t\3\2\2\2\36\2\u00dc\u00e9\u00ee\u00f0\u00f8\u00fa\u00fe\u0112" +
					"\u011f\u0127\u0129\u012c\u0132\u0134\u013a\u013e\u0145\u0147\u014b\u014e" +
					"\u0178\u0182\u0187\u0190\u0192\u0199\u01a0\4\b\2\2\39\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

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

	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	private static String[] makeRuleNames() {
		return new String[]{
				"IF", "THEN", "ELSE", "FI", "NEGATION", "NOT", "NEW", "CLASS", "INHERITS",
				"LET", "IN", "SELFTYPE", "WHILE", "LOOP", "POOL", "CASE", "OF", "ESAC",
				"ISVOID", "BOOL", "HEX", "UNICODE", "ESC", "STRING", "TYPE", "UPPERLETTER",
				"LOWERCASE", "LETTER", "DIGIT", "INT", "TYPE_ID", "ID", "DIGITS", "EXPONENT",
				"FLOAT", "DOT", "ANNOTATION", "SEMI", "COLON", "COMMA", "ASSIGN", "LPAREN",
				"RPAREN", "LBRACE", "RBRACE", "PLUS", "MINUS", "MUL", "DIV", "RESULTS",
				"EQUAL", "LT", "LE", "NEW_LINE", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}

	private static String[] makeLiteralNames() {
		return new String[]{
				null, null, "'if'", "'then'", "'else'", "'fi'", "'~'", "'not'", "'new'",
				"'class'", "'inherits'", "'let'", "'in'", "'while'", "'loop'", "'pool'",
				"'case'", "'of'", "'esac'", "'isvoid'", null, null, null, null, null,
				null, "'.'", "'@'", "';'", "':'", "','", "'<-'", "'('", "')'", "'{'",
				"'}'", "'+'", "'-'", "'*'", "'/'", "'=>'", "'='", "'<'", "'<='"
		};
	}

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, "ERROR", "IF", "THEN", "ELSE", "FI", "NEGATION", "NOT", "NEW",
				"CLASS", "INHERITS", "LET", "IN", "WHILE", "LOOP", "POOL", "CASE", "OF",
				"ESAC", "ISVOID", "BOOL", "STRING", "INT", "TYPE_ID", "ID", "FLOAT",
				"DOT", "ANNOTATION", "SEMI", "COLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN",
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

	private void raiseError(String msg) {
		setText(msg);
		setType(ERROR);
	}

	@Override
	public String getGrammarFileName() {
		return "CoolLexer.g4";
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
	public String[] getChannelNames() {
		return channelNames;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
			case 55:
				BLOCK_COMMENT_action((RuleContext) _localctx, actionIndex);
				break;
		}
	}

	private void BLOCK_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 0:
				System.err.println("EOF in comment");
				break;
		}
	}
}