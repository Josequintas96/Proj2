// Generated from Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINECOMMENT=3, NEWLINE=4, IF=5, THEN=6, ELSE=7, ENDIF=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, EQUALS=13, GT=14, LT=15, GE=16, LE=17, 
		ULINE=18, DOT=19, GETS=20, LABEL=21, INT=22, FLOAT=23, HEX=24, RES_PARM=25, 
		VARIABLE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "LINECOMMENT", "NEWLINE", "IF", "THEN", "ELSE", "ENDIF", 
			"PLUS", "MINUS", "MULT", "DIV", "EQUALS", "GT", "LT", "GE", "LE", "ULINE", 
			"DOT", "GETS", "LABEL", "INT", "FLOAT", "HEX", "RES_PARM", "VARIABLE", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "HEXDIGIT", 
			"DIGIT", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'='", "'>'", "'<'", "'>='", "'<='", "'_'", "'.'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LINECOMMENT", "NEWLINE", "IF", "THEN", "ELSE", 
			"ENDIF", "PLUS", "MINUS", "MULT", "DIV", "EQUALS", "GT", "LT", "GE", 
			"LE", "ULINE", "DOT", "GETS", "LABEL", "INT", "FLOAT", "HEX", "RES_PARM", 
			"VARIABLE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0142\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\6\2s\n\2\r\2\16\2t\3\3\3"+
		"\3\3\3\3\3\7\3{\n\3\f\3\16\3~\13\3\3\3\3\3\3\3\3\4\3\4\7\4\u0085\n\4\f"+
		"\4\16\4\u0088\13\4\3\4\3\4\3\5\5\5\u008d\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u00c1\n\26"+
		"\3\26\3\26\3\26\7\26\u00c6\n\26\f\26\16\26\u00c9\13\26\3\27\6\27\u00cc"+
		"\n\27\r\27\16\27\u00cd\3\30\7\30\u00d1\n\30\f\30\16\30\u00d4\13\30\3\30"+
		"\3\30\6\30\u00d8\n\30\r\30\16\30\u00d9\3\31\3\31\3\31\6\31\u00df\n\31"+
		"\r\31\16\31\u00e0\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5"+
		"\66\u0123\n\66\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\58\u0141\n8\3|\29\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2"+
		"K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2\3\2\36\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\4\2ZZzz\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg"+
		"\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2P"+
		"Ppp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2[[{{\4\2\\\\||\2\u014b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\3r\3\2\2\2\5v\3\2\2\2\7\u0082\3\2\2\2\t\u008c\3\2\2\2\13\u0090\3\2"+
		"\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2\2\21\u009d\3\2\2\2\23\u00a3\3\2\2"+
		"\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2"+
		"\35\u00ad\3\2\2\2\37\u00af\3\2\2\2!\u00b1\3\2\2\2#\u00b4\3\2\2\2%\u00b7"+
		"\3\2\2\2\'\u00b9\3\2\2\2)\u00bb\3\2\2\2+\u00c0\3\2\2\2-\u00cb\3\2\2\2"+
		"/\u00d2\3\2\2\2\61\u00db\3\2\2\2\63\u00e2\3\2\2\2\65\u00e5\3\2\2\2\67"+
		"\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f0\3\2"+
		"\2\2A\u00f2\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3\2\2\2I\u00fa"+
		"\3\2\2\2K\u00fc\3\2\2\2M\u00fe\3\2\2\2O\u0100\3\2\2\2Q\u0102\3\2\2\2S"+
		"\u0104\3\2\2\2U\u0106\3\2\2\2W\u0108\3\2\2\2Y\u010a\3\2\2\2[\u010c\3\2"+
		"\2\2]\u010e\3\2\2\2_\u0110\3\2\2\2a\u0112\3\2\2\2c\u0114\3\2\2\2e\u0116"+
		"\3\2\2\2g\u0118\3\2\2\2i\u011a\3\2\2\2k\u0122\3\2\2\2m\u0124\3\2\2\2o"+
		"\u0140\3\2\2\2qs\t\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\4\3"+
		"\2\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}"+
		"\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080\u0081"+
		"\7\61\2\2\u0081\6\3\2\2\2\u0082\u0086\7%\2\2\u0083\u0085\n\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\t\5\2\u008a"+
		"\b\3\2\2\2\u008b\u008d\7\17\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2"+
		"\2\u008d\u008e\3\2\2\2\u008e\u008f\7\f\2\2\u008f\n\3\2\2\2\u0090\u0091"+
		"\5G$\2\u0091\u0092\5A!\2\u0092\f\3\2\2\2\u0093\u0094\5]/\2\u0094\u0095"+
		"\5E#\2\u0095\u0096\5? \2\u0096\u0097\5Q)\2\u0097\16\3\2\2\2\u0098\u0099"+
		"\5? \2\u0099\u009a\5M\'\2\u009a\u009b\5[.\2\u009b\u009c\5? \2\u009c\20"+
		"\3\2\2\2\u009d\u009e\5? \2\u009e\u009f\5Q)\2\u009f\u00a0\5=\37\2\u00a0"+
		"\u00a1\5G$\2\u00a1\u00a2\5A!\2\u00a2\22\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4"+
		"\24\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8"+
		"\30\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\34\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7>\2\2\u00b0"+
		" \3\2\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7?\2\2\u00b3\"\3\2\2\2\u00b4"+
		"\u00b5\7>\2\2\u00b5\u00b6\7?\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7a\2\2\u00b8"+
		"&\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7<\2\2\u00bc"+
		"\u00bd\7?\2\2\u00bd*\3\2\2\2\u00be\u00c1\5o8\2\u00bf\u00c1\5%\23\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c7\3\2\2\2\u00c2\u00c6\5o"+
		"8\2\u00c3\u00c6\5m\67\2\u00c4\u00c6\5%\23\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8,\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc"+
		"\5m\67\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce.\3\2\2\2\u00cf\u00d1\5m\67\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\5\'\24\2\u00d6\u00d8\5m\67\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\60\3\2\2\2\u00db\u00dc\7\62\2\2\u00dc\u00de\t\4\2\2\u00dd"+
		"\u00df\5k\66\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\5m\67\2\u00e3\u00e4"+
		"\5+\26\2\u00e4\64\3\2\2\2\u00e5\u00e6\7&\2\2\u00e6\u00e7\5+\26\2\u00e7"+
		"\66\3\2\2\2\u00e8\u00e9\t\5\2\2\u00e98\3\2\2\2\u00ea\u00eb\t\6\2\2\u00eb"+
		":\3\2\2\2\u00ec\u00ed\t\7\2\2\u00ed<\3\2\2\2\u00ee\u00ef\t\b\2\2\u00ef"+
		">\3\2\2\2\u00f0\u00f1\t\t\2\2\u00f1@\3\2\2\2\u00f2\u00f3\t\n\2\2\u00f3"+
		"B\3\2\2\2\u00f4\u00f5\t\13\2\2\u00f5D\3\2\2\2\u00f6\u00f7\t\f\2\2\u00f7"+
		"F\3\2\2\2\u00f8\u00f9\t\r\2\2\u00f9H\3\2\2\2\u00fa\u00fb\t\16\2\2\u00fb"+
		"J\3\2\2\2\u00fc\u00fd\t\17\2\2\u00fdL\3\2\2\2\u00fe\u00ff\t\20\2\2\u00ff"+
		"N\3\2\2\2\u0100\u0101\t\21\2\2\u0101P\3\2\2\2\u0102\u0103\t\22\2\2\u0103"+
		"R\3\2\2\2\u0104\u0105\t\23\2\2\u0105T\3\2\2\2\u0106\u0107\t\24\2\2\u0107"+
		"V\3\2\2\2\u0108\u0109\t\25\2\2\u0109X\3\2\2\2\u010a\u010b\t\26\2\2\u010b"+
		"Z\3\2\2\2\u010c\u010d\t\27\2\2\u010d\\\3\2\2\2\u010e\u010f\t\30\2\2\u010f"+
		"^\3\2\2\2\u0110\u0111\t\31\2\2\u0111`\3\2\2\2\u0112\u0113\t\32\2\2\u0113"+
		"b\3\2\2\2\u0114\u0115\t\33\2\2\u0115d\3\2\2\2\u0116\u0117\t\4\2\2\u0117"+
		"f\3\2\2\2\u0118\u0119\t\34\2\2\u0119h\3\2\2\2\u011a\u011b\t\35\2\2\u011b"+
		"j\3\2\2\2\u011c\u0123\5m\67\2\u011d\u011e\7c\2\2\u011e\u011f\7\60\2\2"+
		"\u011f\u0120\7\60\2\2\u0120\u0123\7h\2\2\u0121\u0123\4CH\2\u0122\u011c"+
		"\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0121\3\2\2\2\u0123l\3\2\2\2\u0124"+
		"\u0125\4\62;\2\u0125n\3\2\2\2\u0126\u0141\5\67\34\2\u0127\u0141\59\35"+
		"\2\u0128\u0141\5;\36\2\u0129\u0141\5=\37\2\u012a\u0141\5? \2\u012b\u0141"+
		"\5A!\2\u012c\u0141\5C\"\2\u012d\u0141\5E#\2\u012e\u0141\5G$\2\u012f\u0141"+
		"\5I%\2\u0130\u0141\5K&\2\u0131\u0141\5M\'\2\u0132\u0141\5O(\2\u0133\u0141"+
		"\5Q)\2\u0134\u0141\5S*\2\u0135\u0141\5U+\2\u0136\u0141\5W,\2\u0137\u0141"+
		"\5Y-\2\u0138\u0141\5[.\2\u0139\u0141\5]/\2\u013a\u0141\5_\60\2\u013b\u0141"+
		"\5a\61\2\u013c\u0141\5c\62\2\u013d\u0141\5e\63\2\u013e\u0141\5g\64\2\u013f"+
		"\u0141\5i\65\2\u0140\u0126\3\2\2\2\u0140\u0127\3\2\2\2\u0140\u0128\3\2"+
		"\2\2\u0140\u0129\3\2\2\2\u0140\u012a\3\2\2\2\u0140\u012b\3\2\2\2\u0140"+
		"\u012c\3\2\2\2\u0140\u012d\3\2\2\2\u0140\u012e\3\2\2\2\u0140\u012f\3\2"+
		"\2\2\u0140\u0130\3\2\2\2\u0140\u0131\3\2\2\2\u0140\u0132\3\2\2\2\u0140"+
		"\u0133\3\2\2\2\u0140\u0134\3\2\2\2\u0140\u0135\3\2\2\2\u0140\u0136\3\2"+
		"\2\2\u0140\u0137\3\2\2\2\u0140\u0138\3\2\2\2\u0140\u0139\3\2\2\2\u0140"+
		"\u013a\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013d\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141p\3\2\2\2\20\2t|\u0086"+
		"\u008c\u00c0\u00c5\u00c7\u00cd\u00d2\u00d9\u00e0\u0122\u0140\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}