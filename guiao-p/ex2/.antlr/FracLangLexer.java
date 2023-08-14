// Generated from /home/diogofilipe84/Desktop/2º Ano EI/C/guiao-p/ex2/FracLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FracLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, String=13, Fraction=14, WS=15, Comment=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ID", "String", "Fraction", "WS", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'display'", "'<='", "'+'", "'-'", "'*'", "':'", "'('", 
			"')'", "'read'", "'reduce'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "String", "Fraction", "WS", "Comment"
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


	public FracLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FracLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\6\rJ\n\r\r\r\16\rK\3\16\3\16\7\16P\n\16\f\16\16\16S\13\16\3\16"+
		"\3\16\3\17\6\17X\n\17\r\17\16\17Y\3\17\3\17\6\17^\n\17\r\17\16\17_\5\17"+
		"b\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21l\n\21\f\21\16\21o"+
		"\13\21\3\21\3\21\3\21\3\21\4Qm\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\3\2c|\3\2\62;\5\2\13"+
		"\f\17\17\"\"\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7-\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64"+
		"\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25<\3\2\2\2\27A\3\2\2\2"+
		"\31I\3\2\2\2\33M\3\2\2\2\35W\3\2\2\2\37c\3\2\2\2!g\3\2\2\2#$\7=\2\2$\4"+
		"\3\2\2\2%&\7f\2\2&\'\7k\2\2\'(\7u\2\2()\7r\2\2)*\7n\2\2*+\7c\2\2+,\7{"+
		"\2\2,\6\3\2\2\2-.\7>\2\2./\7?\2\2/\b\3\2\2\2\60\61\7-\2\2\61\n\3\2\2\2"+
		"\62\63\7/\2\2\63\f\3\2\2\2\64\65\7,\2\2\65\16\3\2\2\2\66\67\7<\2\2\67"+
		"\20\3\2\2\289\7*\2\29\22\3\2\2\2:;\7+\2\2;\24\3\2\2\2<=\7t\2\2=>\7g\2"+
		"\2>?\7c\2\2?@\7f\2\2@\26\3\2\2\2AB\7t\2\2BC\7g\2\2CD\7f\2\2DE\7w\2\2E"+
		"F\7e\2\2FG\7g\2\2G\30\3\2\2\2HJ\t\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2L\32\3\2\2\2MQ\7$\2\2NP\13\2\2\2ON\3\2\2\2PS\3\2\2\2QR\3\2\2"+
		"\2QO\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7$\2\2U\34\3\2\2\2VX\t\3\2\2WV\3\2"+
		"\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Za\3\2\2\2[]\7\61\2\2\\^\t\3\2\2]\\"+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a[\3\2\2\2ab\3\2\2\2b"+
		"\36\3\2\2\2cd\t\4\2\2de\3\2\2\2ef\b\20\2\2f \3\2\2\2gh\7/\2\2hi\7/\2\2"+
		"im\3\2\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2\2\2np\3\2\2"+
		"\2om\3\2\2\2pq\7\f\2\2qr\3\2\2\2rs\b\21\2\2s\"\3\2\2\2\t\2KQY_am\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}