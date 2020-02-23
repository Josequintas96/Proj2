// Generated from Program.g4 by ANTLR 4.8

import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Iterator;
import java.lang.Math; 


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		DD=25, CO1=26, CO2=27, PARO=28, PARC=29, SEMC=30, BO1=31, BO2=32, BO3=33, 
		BO4=34, PO=35, ID=36, INT=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "DD", 
			"CO1", "CO2", "PARO", "PARC", "SEMC", "BO1", "BO2", "BO3", "BO4", "PO", 
			"ID", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'begin'", "'end.'", "' : '", "'writeln('", "');'", "'readln('", 
			"'if'", "'then'", "'else'", "'='", "'*'", "'+'", "','", "'Sqrt'", "'Cos'", 
			"'Sin'", "'ln'", "'dopower'", "'/'", "'-'", "'''", "' '", "'!'", "':='", 
			null, null, "'('", "')'", "';'", "'TRUE'", "'FALSE'", "'true'", "'false'", 
			"'program'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "DD", "CO1", "CO2", "PARO", "PARC", "SEMC", "BO1", "BO2", "BO3", 
			"BO4", "PO", "ID", "INT", "WS"
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


	Double count= 0.0;
	Boolean truth = true;
	HashMap<String, Double> Vt = new HashMap<String, Double>();
	HashMap<String,  Boolean> Vb =new HashMap<>();
	Scanner myObj = new Scanner(System.in);


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\7%\u00dd\n%\f%\16%\u00e0\13%\3&\6&\u00e3\n&\r&\16&\u00e4\3"+
		"\'\6\'\u00e8\n\'\r\'\16\'\u00e9\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\6"+
		"\5\2C\\aac|\7\2##\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ef\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5S\3\2\2\2\7Y\3\2\2\2\t^\3\2"+
		"\2\2\13b\3\2\2\2\rk\3\2\2\2\17n\3\2\2\2\21v\3\2\2\2\23y\3\2\2\2\25~\3"+
		"\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2"+
		"\2\2\37\u008b\3\2\2\2!\u0090\3\2\2\2#\u0094\3\2\2\2%\u0098\3\2\2\2\'\u009b"+
		"\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00b0\3\2\2\2\67\u00b3\3\2\2\29\u00b6"+
		"\3\2\2\2;\u00b8\3\2\2\2=\u00ba\3\2\2\2?\u00bc\3\2\2\2A\u00c1\3\2\2\2C"+
		"\u00c7\3\2\2\2E\u00cc\3\2\2\2G\u00d2\3\2\2\2I\u00da\3\2\2\2K\u00e2\3\2"+
		"\2\2M\u00e7\3\2\2\2OP\7x\2\2PQ\7c\2\2QR\7t\2\2R\4\3\2\2\2ST\7d\2\2TU\7"+
		"g\2\2UV\7i\2\2VW\7k\2\2WX\7p\2\2X\6\3\2\2\2YZ\7g\2\2Z[\7p\2\2[\\\7f\2"+
		"\2\\]\7\60\2\2]\b\3\2\2\2^_\7\"\2\2_`\7<\2\2`a\7\"\2\2a\n\3\2\2\2bc\7"+
		"y\2\2cd\7t\2\2de\7k\2\2ef\7v\2\2fg\7g\2\2gh\7n\2\2hi\7p\2\2ij\7*\2\2j"+
		"\f\3\2\2\2kl\7+\2\2lm\7=\2\2m\16\3\2\2\2no\7t\2\2op\7g\2\2pq\7c\2\2qr"+
		"\7f\2\2rs\7n\2\2st\7p\2\2tu\7*\2\2u\20\3\2\2\2vw\7k\2\2wx\7h\2\2x\22\3"+
		"\2\2\2yz\7v\2\2z{\7j\2\2{|\7g\2\2|}\7p\2\2}\24\3\2\2\2~\177\7g\2\2\177"+
		"\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\26\3\2\2\2\u0083"+
		"\u0084\7?\2\2\u0084\30\3\2\2\2\u0085\u0086\7,\2\2\u0086\32\3\2\2\2\u0087"+
		"\u0088\7-\2\2\u0088\34\3\2\2\2\u0089\u008a\7.\2\2\u008a\36\3\2\2\2\u008b"+
		"\u008c\7U\2\2\u008c\u008d\7s\2\2\u008d\u008e\7t\2\2\u008e\u008f\7v\2\2"+
		"\u008f \3\2\2\2\u0090\u0091\7E\2\2\u0091\u0092\7q\2\2\u0092\u0093\7u\2"+
		"\2\u0093\"\3\2\2\2\u0094\u0095\7U\2\2\u0095\u0096\7k\2\2\u0096\u0097\7"+
		"p\2\2\u0097$\3\2\2\2\u0098\u0099\7n\2\2\u0099\u009a\7p\2\2\u009a&\3\2"+
		"\2\2\u009b\u009c\7f\2\2\u009c\u009d\7q\2\2\u009d\u009e\7r\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"(\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6"+
		",\3\2\2\2\u00a7\u00a8\7)\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7\"\2\2\u00aa"+
		"\60\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7<\2\2\u00ae"+
		"\u00af\7?\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7*\2\2\u00b1\u00b2\7,\2\2\u00b2"+
		"\66\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b5\7+\2\2\u00b58\3\2\2\2\u00b6"+
		"\u00b7\7*\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7+\2\2\u00b9<\3\2\2\2\u00ba\u00bb"+
		"\7=\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7T\2\2\u00be\u00bf"+
		"\7W\2\2\u00bf\u00c0\7G\2\2\u00c0@\3\2\2\2\u00c1\u00c2\7H\2\2\u00c2\u00c3"+
		"\7C\2\2\u00c3\u00c4\7N\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6\7G\2\2\u00c6"+
		"B\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7w\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7g\2\2\u00d1F\3\2\2\2\u00d2"+
		"\u00d3\7r\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7i\2\2"+
		"\u00d6\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7o\2\2\u00d9H\3\2\2"+
		"\2\u00da\u00de\t\2\2\2\u00db\u00dd\t\3\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00dfJ\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5L\3\2\2\2\u00e6\u00e8"+
		"\t\5\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\'\2\2\u00ecN\3\2\2\2"+
		"\6\2\u00de\u00e4\u00e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}