// Generated from /home/diogofilipe84/Desktop/2º Ano EI/C/guiao-p/17_18/CalComplex.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalComplexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Complexo=4, ID=5, WS=6, Comment=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Complexo", "ID", "WS", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", "';'", "'output'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Complexo", "ID", "WS", "Comment"
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


	public CalComplexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalComplex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tS\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5\37\n\5\f\5\16\5\"\13\5\3\5\3\5\6\5&\n"+
		"\5\r\5\16\5\'\3\5\5\5+\n\5\3\5\6\5.\n\5\r\5\16\5/\3\5\3\5\7\5\64\n\5\f"+
		"\5\16\5\67\13\5\3\5\5\5:\n\5\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\b\3\b\3\b\3\b\3L\2\t"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\7\3\2\62;\4\2--//\4\2C\\c|\5\2\62;"+
		"C\\c|\5\2\13\f\17\17\"\"\2[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\24\3\2\2\2"+
		"\7\26\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\rB\3\2\2\2\17F\3\2\2\2\21\22\7?\2"+
		"\2\22\23\7@\2\2\23\4\3\2\2\2\24\25\7=\2\2\25\6\3\2\2\2\26\27\7q\2\2\27"+
		"\30\7w\2\2\30\31\7v\2\2\31\32\7r\2\2\32\33\7w\2\2\33\34\7v\2\2\34\b\3"+
		"\2\2\2\35\37\t\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!#\3\2\2\2\" \3\2\2\2#:\7k\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(:\3\2\2\2)+\7/\2\2*)\3\2\2\2*+\3\2\2\2+-\3\2\2\2,.\t\2\2"+
		"\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\65\t\3\2"+
		"\2\62\64\t\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\668\3\2\2\2\67\65\3\2\2\28:\7k\2\29 \3\2\2\29%\3\2\2\29*\3\2\2\2:\n"+
		"\3\2\2\2;?\t\4\2\2<>\t\5\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@"+
		"\f\3\2\2\2A?\3\2\2\2BC\t\6\2\2CD\3\2\2\2DE\b\7\2\2E\16\3\2\2\2FG\7%\2"+
		"\2GH\7%\2\2HL\3\2\2\2IK\13\2\2\2JI\3\2\2\2KN\3\2\2\2LM\3\2\2\2LJ\3\2\2"+
		"\2MO\3\2\2\2NL\3\2\2\2OP\7\f\2\2PQ\3\2\2\2QR\b\b\2\2R\20\3\2\2\2\13\2"+
		" \'*/\659?L\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}