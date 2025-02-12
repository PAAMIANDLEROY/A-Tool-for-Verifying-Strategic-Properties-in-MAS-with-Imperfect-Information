// Generated from /media/angelo/WorkData/git/A-Tool-for-Verifying-Strategic-Properties-in-MAS-with-Imperfect-Information/abstraction/src/main/antlr4/ATL.g4 by ANTLR 4.9.2
package fr.univ_evry.ibisc.atl.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ATOM=25, WS=26;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "ATOM", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'not'", "'next'", "'X'", "'eventually'", "'F'", "'always'", 
			"'G'", "'until'", "'U'", "'release'", "'R'", "'&&'", "'and'", "'||'", 
			"'or'", "'->'", "'implies'", "'<'", "'>'", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ATOM", "WS"
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


	public ATLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ATL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\7\32\u0093\n\32\f\32\16\32\u0096\13\32\3\33\6\33\u0099\n\33"+
		"\r\33\16\33\u009a\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\3\2\5\4\2aac|\5\2\62;aac|\5\2\13\f\16\17\"\"\2"+
		"\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2"+
		"\2\7=\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21X\3\2\2"+
		"\2\23Z\3\2\2\2\25`\3\2\2\2\27b\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35o\3\2"+
		"\2\2\37s\3\2\2\2!v\3\2\2\2#y\3\2\2\2%|\3\2\2\2\'\u0084\3\2\2\2)\u0086"+
		"\3\2\2\2+\u0088\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61\u008e\3\2\2\2"+
		"\63\u0090\3\2\2\2\65\u0098\3\2\2\2\678\7#\2\28\4\3\2\2\29:\7p\2\2:;\7"+
		"q\2\2;<\7v\2\2<\6\3\2\2\2=>\7p\2\2>?\7g\2\2?@\7z\2\2@A\7v\2\2A\b\3\2\2"+
		"\2BC\7Z\2\2C\n\3\2\2\2DE\7g\2\2EF\7x\2\2FG\7g\2\2GH\7p\2\2HI\7v\2\2IJ"+
		"\7w\2\2JK\7c\2\2KL\7n\2\2LM\7n\2\2MN\7{\2\2N\f\3\2\2\2OP\7H\2\2P\16\3"+
		"\2\2\2QR\7c\2\2RS\7n\2\2ST\7y\2\2TU\7c\2\2UV\7{\2\2VW\7u\2\2W\20\3\2\2"+
		"\2XY\7I\2\2Y\22\3\2\2\2Z[\7w\2\2[\\\7p\2\2\\]\7v\2\2]^\7k\2\2^_\7n\2\2"+
		"_\24\3\2\2\2`a\7W\2\2a\26\3\2\2\2bc\7t\2\2cd\7g\2\2de\7n\2\2ef\7g\2\2"+
		"fg\7c\2\2gh\7u\2\2hi\7g\2\2i\30\3\2\2\2jk\7T\2\2k\32\3\2\2\2lm\7(\2\2"+
		"mn\7(\2\2n\34\3\2\2\2op\7c\2\2pq\7p\2\2qr\7f\2\2r\36\3\2\2\2st\7~\2\2"+
		"tu\7~\2\2u \3\2\2\2vw\7q\2\2wx\7t\2\2x\"\3\2\2\2yz\7/\2\2z{\7@\2\2{$\3"+
		"\2\2\2|}\7k\2\2}~\7o\2\2~\177\7r\2\2\177\u0080\7n\2\2\u0080\u0081\7k\2"+
		"\2\u0081\u0082\7g\2\2\u0082\u0083\7u\2\2\u0083&\3\2\2\2\u0084\u0085\7"+
		">\2\2\u0085(\3\2\2\2\u0086\u0087\7@\2\2\u0087*\3\2\2\2\u0088\u0089\7]"+
		"\2\2\u0089,\3\2\2\2\u008a\u008b\7_\2\2\u008b.\3\2\2\2\u008c\u008d\7*\2"+
		"\2\u008d\60\3\2\2\2\u008e\u008f\7+\2\2\u008f\62\3\2\2\2\u0090\u0094\t"+
		"\2\2\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\64\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0097\u0099\t\4\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\33\2\2"+
		"\u009d\66\3\2\2\2\5\2\u0094\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}