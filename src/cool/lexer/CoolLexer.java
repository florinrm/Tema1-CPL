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
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0187\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
                    "\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3" +
                    "\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b" +
                    "\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13" +
                    "\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3" +
                    "\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3" +
                    "\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3" +
                    "\25\3\25\5\25\u00d7\n\25\3\26\3\26\3\26\3\26\7\26\u00dd\n\26\f\26\16\26" +
                    "\u00e0\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3" +
                    "\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\3\30\3\30" +
                    "\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u0101\n\34\r\34\16\34\u0102\3" +
                    "\35\3\35\3\35\3\35\3\35\3\35\7\35\u010b\n\35\f\35\16\35\u010e\13\35\5" +
                    "\35\u0110\n\35\3\36\3\36\3\36\3\36\7\36\u0116\n\36\f\36\16\36\u0119\13" +
                    "\36\3\37\6\37\u011c\n\37\r\37\16\37\u011d\3 \3 \5 \u0122\n \3 \3 \3!\3" +
                    "!\3!\5!\u0129\n!\5!\u012b\n!\3!\3!\5!\u012f\n!\3!\5!\u0132\n!\3\"\3\"" +
                    "\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-" +
                    "\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64" +
                    "\5\64\u015c\n\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0164\n\65\f\65\16" +
                    "\65\u0167\13\65\3\65\3\65\5\65\u016b\n\65\3\65\3\65\3\66\3\66\3\66\3\66" +
                    "\3\66\7\66\u0174\n\66\f\66\16\66\u0177\13\66\3\66\3\66\3\66\3\66\5\66" +
                    "\u017d\n\66\3\66\3\66\3\67\6\67\u0182\n\67\r\67\16\67\u0183\3\67\3\67" +
                    "\5\u00de\u0165\u0175\28\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r" +
                    "\27\16\31\2\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\2" +
                    "\65\2\67\309\31;\32=\2?\2A\33C\34E\35G\36I\37K M!O\"Q#S$U%W&Y\'[(])_*" +
                    "a+c,e-g\2i.k/m\60\3\2\b\3\2C\\\3\2c|\4\2C\\c|\3\2\62;\4\2--//\5\2\13\f" +
                    "\17\17\"\"\2\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13" +
                    "\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2" +
                    "\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3" +
                    "\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\67\3\2\2\2\29\3" +
                    "\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2" +
                    "\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2" +
                    "W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3" +
                    "\2\2\2\2e\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5r\3\2\2" +
                    "\2\7w\3\2\2\2\t|\3\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17\u0085\3\2\2" +
                    "\2\21\u0089\3\2\2\2\23\u008f\3\2\2\2\25\u0098\3\2\2\2\27\u009c\3\2\2\2" +
                    "\31\u009f\3\2\2\2\33\u00a9\3\2\2\2\35\u00af\3\2\2\2\37\u00b4\3\2\2\2!" +
                    "\u00b9\3\2\2\2#\u00be\3\2\2\2%\u00c1\3\2\2\2\'\u00c6\3\2\2\2)\u00d6\3" +
                    "\2\2\2+\u00d8\3\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63" +
                    "\u00fb\3\2\2\2\65\u00fd\3\2\2\2\67\u0100\3\2\2\29\u010f\3\2\2\2;\u0111" +
                    "\3\2\2\2=\u011b\3\2\2\2?\u011f\3\2\2\2A\u012e\3\2\2\2C\u0133\3\2\2\2E" +
                    "\u0135\3\2\2\2G\u0137\3\2\2\2I\u0139\3\2\2\2K\u013b\3\2\2\2M\u013d\3\2" +
                    "\2\2O\u0140\3\2\2\2Q\u0142\3\2\2\2S\u0144\3\2\2\2U\u0146\3\2\2\2W\u0148" +
                    "\3\2\2\2Y\u014a\3\2\2\2[\u014c\3\2\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a" +
                    "\u0153\3\2\2\2c\u0155\3\2\2\2e\u0157\3\2\2\2g\u015b\3\2\2\2i\u015f\3\2" +
                    "\2\2k\u016e\3\2\2\2m\u0181\3\2\2\2op\7k\2\2pq\7h\2\2q\4\3\2\2\2rs\7v\2" +
                    "\2st\7j\2\2tu\7g\2\2uv\7p\2\2v\6\3\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2\2z{" +
                    "\7g\2\2{\b\3\2\2\2|}\7h\2\2}~\7k\2\2~\n\3\2\2\2\177\u0080\7\u0080\2\2" +
                    "\u0080\f\3\2\2\2\u0081\u0082\7p\2\2\u0082\u0083\7q\2\2\u0083\u0084\7v" +
                    "\2\2\u0084\16\3\2\2\2\u0085\u0086\7p\2\2\u0086\u0087\7g\2\2\u0087\u0088" +
                    "\7y\2\2\u0088\20\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b\7n\2\2\u008b\u008c" +
                    "\7c\2\2\u008c\u008d\7u\2\2\u008d\u008e\7u\2\2\u008e\22\3\2\2\2\u008f\u0090" +
                    "\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7j\2\2\u0092\u0093\7g\2\2\u0093" +
                    "\u0094\7t\2\2\u0094\u0095\7k\2\2\u0095\u0096\7v\2\2\u0096\u0097\7u\2\2" +
                    "\u0097\24\3\2\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\u009b\7" +
                    "v\2\2\u009b\26\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\30" +
                    "\3\2\2\2\u009f\u00a0\7U\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7N\2\2\u00a2" +
                    "\u00a3\7H\2\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7V\2\2\u00a5\u00a6\7[\2\2" +
                    "\u00a6\u00a7\7R\2\2\u00a7\u00a8\7G\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7" +
                    "y\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae" +
                    "\7g\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2" +
                    "\7q\2\2\u00b2\u00b3\7r\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6" +
                    "\7q\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7n\2\2\u00b8 \3\2\2\2\u00b9\u00ba" +
                    "\7e\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd" +
                    "\"\3\2\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7h\2\2\u00c0$\3\2\2\2\u00c1" +
                    "\u00c2\7g\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7e\2\2" +
                    "\u00c5&\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7x\2" +
                    "\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7f\2\2\u00cc(\3\2" +
                    "\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d7" +
                    "\7g\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4" +
                    "\u00d5\7u\2\2\u00d5\u00d7\7g\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d1\3\2\2" +
                    "\2\u00d7*\3\2\2\2\u00d8\u00de\7$\2\2\u00d9\u00da\7^\2\2\u00da\u00dd\7" +
                    "$\2\2\u00db\u00dd\13\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd" +
                    "\u00e0\3\2\2\2\u00de\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2" +
                    "\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2,\3\2\2\2\u00e3\u00e4" +
                    "\7K\2\2\u00e4\u00e5\7p\2\2\u00e5\u00f6\7v\2\2\u00e6\u00e7\7H\2\2\u00e7" +
                    "\u00e8\7n\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7c\2\2\u00ea\u00f6\7v\2\2" +
                    "\u00eb\u00ec\7D\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7q\2\2\u00ee\u00f6" +
                    "\7n\2\2\u00ef\u00f0\7U\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2" +
                    "\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f6\7i\2\2\u00f5\u00e3\3\2\2" +
                    "\2\u00f5\u00e6\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6." +
                    "\3\2\2\2\u00f7\u00f8\t\2\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\t\3\2\2\u00fa" +
                    "\62\3\2\2\2\u00fb\u00fc\t\4\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\t\5\2\2\u00fe" +
                    "\66\3\2\2\2\u00ff\u0101\5\65\33\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2" +
                    "\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u01038\3\2\2\2\u0104\u0110" +
                    "\5-\27\2\u0105\u0110\5\31\r\2\u0106\u010c\5/\30\2\u0107\u010b\5\63\32" +
                    "\2\u0108\u010b\7a\2\2\u0109\u010b\5\65\33\2\u010a\u0107\3\2\2\2\u010a" +
                    "\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2" +
                    "\2\2\u010c\u010d\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f" +
                    "\u0104\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0106\3\2\2\2\u0110:\3\2\2\2" +
                    "\u0111\u0117\5\61\31\2\u0112\u0116\5\63\32\2\u0113\u0116\7a\2\2\u0114" +
                    "\u0116\5\65\33\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3" +
                    "\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118" +
                    "<\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\5\65\33\2\u011b\u011a\3\2\2" +
                    "\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e>" +
                    "\3\2\2\2\u011f\u0121\7g\2\2\u0120\u0122\t\6\2\2\u0121\u0120\3\2\2\2\u0121" +
                    "\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\5=\37\2\u0124@\3\2\2\2" +
                    "\u0125\u012a\5=\37\2\u0126\u0128\7\60\2\2\u0127\u0129\5=\37\2\u0128\u0127" +
                    "\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0126\3\2\2\2\u012a" +
                    "\u012b\3\2\2\2\u012b\u012f\3\2\2\2\u012c\u012d\7\60\2\2\u012d\u012f\5" +
                    "=\37\2\u012e\u0125\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\3\2\2\2\u0130" +
                    "\u0132\5? \2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132B\3\2\2\2\u0133" +
                    "\u0134\7\60\2\2\u0134D\3\2\2\2\u0135\u0136\7B\2\2\u0136F\3\2\2\2\u0137" +
                    "\u0138\7=\2\2\u0138H\3\2\2\2\u0139\u013a\7<\2\2\u013aJ\3\2\2\2\u013b\u013c" +
                    "\7.\2\2\u013cL\3\2\2\2\u013d\u013e\7>\2\2\u013e\u013f\7/\2\2\u013fN\3" +
                    "\2\2\2\u0140\u0141\7*\2\2\u0141P\3\2\2\2\u0142\u0143\7+\2\2\u0143R\3\2" +
                    "\2\2\u0144\u0145\7}\2\2\u0145T\3\2\2\2\u0146\u0147\7\177\2\2\u0147V\3" +
                    "\2\2\2\u0148\u0149\7-\2\2\u0149X\3\2\2\2\u014a\u014b\7/\2\2\u014bZ\3\2" +
                    "\2\2\u014c\u014d\7,\2\2\u014d\\\3\2\2\2\u014e\u014f\7\61\2\2\u014f^\3" +
                    "\2\2\2\u0150\u0151\7?\2\2\u0151\u0152\7@\2\2\u0152`\3\2\2\2\u0153\u0154" +
                    "\7?\2\2\u0154b\3\2\2\2\u0155\u0156\7>\2\2\u0156d\3\2\2\2\u0157\u0158\7" +
                    ">\2\2\u0158\u0159\7?\2\2\u0159f\3\2\2\2\u015a\u015c\7\17\2\2\u015b\u015a" +
                    "\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\f\2\2\u015e" +
                    "h\3\2\2\2\u015f\u0160\7\61\2\2\u0160\u0161\7\61\2\2\u0161\u0165\3\2\2" +
                    "\2\u0162\u0164\13\2\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165" +
                    "\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a\3\2\2\2\u0167\u0165\3\2" +
                    "\2\2\u0168\u016b\5g\64\2\u0169\u016b\7\2\2\3\u016a\u0168\3\2\2\2\u016a" +
                    "\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b\65\2\2\u016dj\3\2\2\2" +
                    "\u016e\u016f\7\61\2\2\u016f\u0170\7,\2\2\u0170\u0175\3\2\2\2\u0171\u0174" +
                    "\5k\66\2\u0172\u0174\13\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2" +
                    "\u0174\u0177\3\2\2\2\u0175\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017c" +
                    "\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7,\2\2\u0179\u017d\7\61\2\2\u017a" +
                    "\u017b\7\2\2\3\u017b\u017d\b\66\3\2\u017c\u0178\3\2\2\2\u017c\u017a\3" +
                    "\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b\66\2\2\u017fl\3\2\2\2\u0180\u0182" +
                    "\t\7\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183" +
                    "\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b\67\2\2\u0186n\3\2\2\2" +
                    "\32\2\u00d6\u00dc\u00de\u00f5\u0102\u010a\u010c\u010f\u0115\u0117\u011d" +
                    "\u0121\u0128\u012a\u012e\u0131\u015b\u0165\u016a\u0173\u0175\u017c\u0183" +
                    "\4\b\2\2\3\66\2";
	public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
	public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static final String[] ruleNames = makeRuleNames();
	public static String[] modeNames = {
            "DEFAULT_MODE"
    };
    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
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

	public CoolLexer(CharStream input) {
		super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	private static String[] makeRuleNames() {
        return new String[]{
                "IF", "THEN", "ELSE", "FI", "NEGATION", "NOT", "NEW", "CLASS", "INHERITS",
                "LET", "IN", "SELFTYPE", "WHILE", "LOOP", "POOL", "CASE", "OF", "ESAC",
                "ISVOID", "BOOL", "STRING", "TYPE", "UPPERLETTER", "LOWERCASE", "LETTER",
                "DIGIT", "INT", "TYPE_ID", "ID", "DIGITS", "EXPONENT", "FLOAT", "DOT",
                "ANNOTATION", "SEMI", "COLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN",
                "LBRACE", "RBRACE", "PLUS", "MINUS", "MUL", "DIV", "RESULTS", "EQUAL",
                "LT", "LE", "NEW_LINE", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
            case 52:
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