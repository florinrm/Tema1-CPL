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
            SEMI = 26, COLON = 27, COMMA = 28, ASSIGN = 29, LPAREN = 30, RPAREN = 31, LBRACE = 32,
            RBRACE = 33, PLUS = 34, MINUS = 35, MUL = 36, DIV = 37, RESULTS = 38, EQUAL = 39, LT = 40,
            LE = 41, LINE_COMMENT = 42, BLOCK_COMMENT = 43, WS = 44;

    protected static final DFA[] _decisionToDFA;
	public static final String[] ruleNames = makeRuleNames();
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u017f\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5" +
                    "\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3" +
                    "\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f" +
                    "\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16" +
                    "\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21" +
                    "\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24" +
                    "\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d3\n\25" +
                    "\3\26\3\26\3\26\3\26\7\26\u00d9\n\26\f\26\16\26\u00dc\13\26\3\26\3\26" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\5\27\u00f2\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33" +
                    "\3\33\3\34\6\34\u00fd\n\34\r\34\16\34\u00fe\3\35\3\35\3\35\3\35\3\35\3" +
                    "\35\7\35\u0107\n\35\f\35\16\35\u010a\13\35\5\35\u010c\n\35\3\36\3\36\3" +
                    "\36\3\36\7\36\u0112\n\36\f\36\16\36\u0115\13\36\3\37\6\37\u0118\n\37\r" +
                    "\37\16\37\u0119\3 \3 \5 \u011e\n \3 \3 \3!\3!\3!\5!\u0125\n!\5!\u0127" +
                    "\n!\3!\3!\5!\u012b\n!\3!\5!\u012e\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3" +
                    "&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60" +
                    "\3\61\3\61\3\61\3\62\5\62\u0154\n\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63" +
                    "\u015c\n\63\f\63\16\63\u015f\13\63\3\63\3\63\5\63\u0163\n\63\3\63\3\63" +
                    "\3\64\3\64\3\64\3\64\3\64\7\64\u016c\n\64\f\64\16\64\u016f\13\64\3\64" +
                    "\3\64\3\64\3\64\5\64\u0175\n\64\3\64\3\64\3\65\6\65\u017a\n\65\r\65\16" +
                    "\65\u017b\3\65\3\65\5\u00da\u015d\u016d\2\66\3\4\5\5\7\6\t\7\13\b\r\t" +
                    "\17\n\21\13\23\f\25\r\27\16\31\2\33\17\35\20\37\21!\22#\23%\24\'\25)\26" +
                    "+\27-\2/\2\61\2\63\2\65\2\67\309\31;\32=\2?\2A\33C\34E\35G\36I\37K M!" +
                    "O\"Q#S$U%W&Y\'[(])_*a+c\2e,g-i.\3\2\b\3\2C\\\3\2c|\4\2C\\c|\3\2\62;\4" +
                    "\2--//\5\2\13\f\17\17\"\"\2\u0191\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2" +
                    "\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3" +
                    "\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2" +
                    "\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2" +
                    "\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2" +
                    "G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3" +
                    "\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2" +
                    "\2\2a\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5n\3\2\2\2\7" +
                    "s\3\2\2\2\tx\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2\17\u0081\3\2\2\2\21\u0085" +
                    "\3\2\2\2\23\u008b\3\2\2\2\25\u0094\3\2\2\2\27\u0098\3\2\2\2\31\u009b\3" +
                    "\2\2\2\33\u00a5\3\2\2\2\35\u00ab\3\2\2\2\37\u00b0\3\2\2\2!\u00b5\3\2\2" +
                    "\2#\u00ba\3\2\2\2%\u00bd\3\2\2\2\'\u00c2\3\2\2\2)\u00d2\3\2\2\2+\u00d4" +
                    "\3\2\2\2-\u00f1\3\2\2\2/\u00f3\3\2\2\2\61\u00f5\3\2\2\2\63\u00f7\3\2\2" +
                    "\2\65\u00f9\3\2\2\2\67\u00fc\3\2\2\29\u010b\3\2\2\2;\u010d\3\2\2\2=\u0117" +
                    "\3\2\2\2?\u011b\3\2\2\2A\u012a\3\2\2\2C\u012f\3\2\2\2E\u0131\3\2\2\2G" +
                    "\u0133\3\2\2\2I\u0135\3\2\2\2K\u0138\3\2\2\2M\u013a\3\2\2\2O\u013c\3\2" +
                    "\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0142\3\2\2\2W\u0144\3\2\2\2Y\u0146" +
                    "\3\2\2\2[\u0148\3\2\2\2]\u014b\3\2\2\2_\u014d\3\2\2\2a\u014f\3\2\2\2c" +
                    "\u0153\3\2\2\2e\u0157\3\2\2\2g\u0166\3\2\2\2i\u0179\3\2\2\2kl\7k\2\2l" +
                    "m\7h\2\2m\4\3\2\2\2no\7v\2\2op\7j\2\2pq\7g\2\2qr\7p\2\2r\6\3\2\2\2st\7" +
                    "g\2\2tu\7n\2\2uv\7u\2\2vw\7g\2\2w\b\3\2\2\2xy\7h\2\2yz\7k\2\2z\n\3\2\2" +
                    "\2{|\7\u0080\2\2|\f\3\2\2\2}~\7p\2\2~\177\7q\2\2\177\u0080\7v\2\2\u0080" +
                    "\16\3\2\2\2\u0081\u0082\7p\2\2\u0082\u0083\7g\2\2\u0083\u0084\7y\2\2\u0084" +
                    "\20\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\7n\2\2\u0087\u0088\7c\2\2\u0088" +
                    "\u0089\7u\2\2\u0089\u008a\7u\2\2\u008a\22\3\2\2\2\u008b\u008c\7k\2\2\u008c" +
                    "\u008d\7p\2\2\u008d\u008e\7j\2\2\u008e\u008f\7g\2\2\u008f\u0090\7t\2\2" +
                    "\u0090\u0091\7k\2\2\u0091\u0092\7v\2\2\u0092\u0093\7u\2\2\u0093\24\3\2" +
                    "\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\26" +
                    "\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\30\3\2\2\2\u009b" +
                    "\u009c\7U\2\2\u009c\u009d\7G\2\2\u009d\u009e\7N\2\2\u009e\u009f\7H\2\2" +
                    "\u009f\u00a0\7a\2\2\u00a0\u00a1\7V\2\2\u00a1\u00a2\7[\2\2\u00a2\u00a3" +
                    "\7R\2\2\u00a3\u00a4\7G\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7" +
                    "\7j\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa" +
                    "\34\3\2\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae" +
                    "\u00af\7r\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7q\2\2\u00b2" +
                    "\u00b3\7q\2\2\u00b3\u00b4\7n\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7e\2\2\u00b6" +
                    "\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\"\3\2\2\2\u00ba" +
                    "\u00bb\7q\2\2\u00bb\u00bc\7h\2\2\u00bc$\3\2\2\2\u00bd\u00be\7g\2\2\u00be" +
                    "\u00bf\7u\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7e\2\2\u00c1&\3\2\2\2\u00c2" +
                    "\u00c3\7k\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7q\2\2" +
                    "\u00c6\u00c7\7k\2\2\u00c7\u00c8\7f\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7v\2" +
                    "\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7w\2\2\u00cc\u00d3\7g\2\2\u00cd\u00ce" +
                    "\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1" +
                    "\u00d3\7g\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3*\3\2\2\2\u00d4" +
                    "\u00da\7$\2\2\u00d5\u00d6\7^\2\2\u00d6\u00d9\7$\2\2\u00d7\u00d9\13\2\2" +
                    "\2\u00d8\u00d5\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00db" +
                    "\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd" +
                    "\u00de\7$\2\2\u00de,\3\2\2\2\u00df\u00e0\7K\2\2\u00e0\u00e1\7p\2\2\u00e1" +
                    "\u00f2\7v\2\2\u00e2\u00e3\7H\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2" +
                    "\u00e5\u00e6\7c\2\2\u00e6\u00f2\7v\2\2\u00e7\u00e8\7D\2\2\u00e8\u00e9" +
                    "\7q\2\2\u00e9\u00ea\7q\2\2\u00ea\u00f2\7n\2\2\u00eb\u00ec\7U\2\2\u00ec" +
                    "\u00ed\7v\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2" +
                    "\u00f0\u00f2\7i\2\2\u00f1\u00df\3\2\2\2\u00f1\u00e2\3\2\2\2\u00f1\u00e7" +
                    "\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2.\3\2\2\2\u00f3\u00f4\t\2\2\2\u00f4" +
                    "\60\3\2\2\2\u00f5\u00f6\t\3\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\t\4\2\2\u00f8" +
                    "\64\3\2\2\2\u00f9\u00fa\t\5\2\2\u00fa\66\3\2\2\2\u00fb\u00fd\5\65\33\2" +
                    "\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff" +
                    "\3\2\2\2\u00ff8\3\2\2\2\u0100\u010c\5-\27\2\u0101\u010c\5\31\r\2\u0102" +
                    "\u0108\5/\30\2\u0103\u0107\5\63\32\2\u0104\u0107\7a\2\2\u0105\u0107\5" +
                    "\65\33\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107" +
                    "\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2" +
                    "\2\2\u010a\u0108\3\2\2\2\u010b\u0100\3\2\2\2\u010b\u0101\3\2\2\2\u010b" +
                    "\u0102\3\2\2\2\u010c:\3\2\2\2\u010d\u0113\5\61\31\2\u010e\u0112\5\63\32" +
                    "\2\u010f\u0112\7a\2\2\u0110\u0112\5\65\33\2\u0111\u010e\3\2\2\2\u0111" +
                    "\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2" +
                    "\2\2\u0113\u0114\3\2\2\2\u0114<\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118" +
                    "\5\65\33\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2" +
                    "\u0119\u011a\3\2\2\2\u011a>\3\2\2\2\u011b\u011d\7g\2\2\u011c\u011e\t\6" +
                    "\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f" +
                    "\u0120\5=\37\2\u0120@\3\2\2\2\u0121\u0126\5=\37\2\u0122\u0124\7\60\2\2" +
                    "\u0123\u0125\5=\37\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127" +
                    "\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012b\3\2\2\2\u0128" +
                    "\u0129\7\60\2\2\u0129\u012b\5=\37\2\u012a\u0121\3\2\2\2\u012a\u0128\3" +
                    "\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\5? \2\u012d\u012c\3\2\2\2\u012d" +
                    "\u012e\3\2\2\2\u012eB\3\2\2\2\u012f\u0130\7=\2\2\u0130D\3\2\2\2\u0131" +
                    "\u0132\7<\2\2\u0132F\3\2\2\2\u0133\u0134\7.\2\2\u0134H\3\2\2\2\u0135\u0136" +
                    "\7>\2\2\u0136\u0137\7/\2\2\u0137J\3\2\2\2\u0138\u0139\7*\2\2\u0139L\3" +
                    "\2\2\2\u013a\u013b\7+\2\2\u013bN\3\2\2\2\u013c\u013d\7}\2\2\u013dP\3\2" +
                    "\2\2\u013e\u013f\7\177\2\2\u013fR\3\2\2\2\u0140\u0141\7-\2\2\u0141T\3" +
                    "\2\2\2\u0142\u0143\7/\2\2\u0143V\3\2\2\2\u0144\u0145\7,\2\2\u0145X\3\2" +
                    "\2\2\u0146\u0147\7\61\2\2\u0147Z\3\2\2\2\u0148\u0149\7?\2\2\u0149\u014a" +
                    "\7@\2\2\u014a\\\3\2\2\2\u014b\u014c\7?\2\2\u014c^\3\2\2\2\u014d\u014e" +
                    "\7>\2\2\u014e`\3\2\2\2\u014f\u0150\7>\2\2\u0150\u0151\7?\2\2\u0151b\3" +
                    "\2\2\2\u0152\u0154\7\17\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154" +
                    "\u0155\3\2\2\2\u0155\u0156\7\f\2\2\u0156d\3\2\2\2\u0157\u0158\7\61\2\2" +
                    "\u0158\u0159\7\61\2\2\u0159\u015d\3\2\2\2\u015a\u015c\13\2\2\2\u015b\u015a" +
                    "\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e" +
                    "\u0162\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0163\5c\62\2\u0161\u0163\7\2" +
                    "\2\3\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164" +
                    "\u0165\b\63\2\2\u0165f\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0168\7,\2\2" +
                    "\u0168\u016d\3\2\2\2\u0169\u016c\5g\64\2\u016a\u016c\13\2\2\2\u016b\u0169" +
                    "\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d" +
                    "\u016b\3\2\2\2\u016e\u0174\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7," +
                    "\2\2\u0171\u0175\7\61\2\2\u0172\u0173\7\2\2\3\u0173\u0175\b\64\3\2\u0174" +
                    "\u0170\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b\64" +
                    "\2\2\u0177h\3\2\2\2\u0178\u017a\t\7\2\2\u0179\u0178\3\2\2\2\u017a\u017b" +
                    "\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d" +
                    "\u017e\b\65\2\2\u017ej\3\2\2\2\32\2\u00d2\u00d8\u00da\u00f1\u00fe\u0106" +
                    "\u0108\u010b\u0111\u0113\u0119\u011d\u0124\u0126\u012a\u012d\u0153\u015d" +
                    "\u0162\u016b\u016d\u0174\u017b\4\b\2\2\3\64\2";
	public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
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

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
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
                "DIGIT", "INT", "TYPE_ID", "ID", "DIGITS", "EXPONENT", "FLOAT", "SEMI",
                "COLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "PLUS",
                "MINUS", "MUL", "DIV", "RESULTS", "EQUAL", "LT", "LE", "NEW_LINE", "LINE_COMMENT",
                "BLOCK_COMMENT", "WS"
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
            case 50:
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