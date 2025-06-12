// Generated from c:/Users/User/Desktop/New Language/MyLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, TEXT=17, 
		STRING=18, CODE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "TEXT", "STRING", 
			"CODE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Component'", "'{'", "'}'", "'Style'", "':'", "';'", "'Template'", 
			"'Logic'", "'<'", "'>'", "'</'", "'='", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "TEXT", "STRING", "CODE", "WS"
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

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
		"\u0004\u0000\u0014\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000fb\b\u000f\n\u000f\f\u000fe\t\u000f"+
		"\u0001\u0010\u0004\u0010h\b\u0010\u000b\u0010\f\u0010i\u0001\u0011\u0001"+
		"\u0011\u0005\u0011n\b\u0011\n\u0011\f\u0011q\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0004\u0012v\b\u0012\u000b\u0012\f\u0012w\u0001\u0013"+
		"\u0004\u0013{\b\u0013\u000b\u0013\f\u0013|\u0001\u0013\u0001\u0013\u0001"+
		"o\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001"+
		"\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000<<>>\u0003"+
		"\u0000\t\n\r\r  \u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001"+
		")\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055\u0001"+
		"\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000"+
		"\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000f"+
		"J\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013R\u0001"+
		"\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000"+
		"\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001d"+
		"]\u0001\u0000\u0000\u0000\u001f_\u0001\u0000\u0000\u0000!g\u0001\u0000"+
		"\u0000\u0000#k\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000\u0000\'z\u0001"+
		"\u0000\u0000\u0000)*\u0005C\u0000\u0000*+\u0005o\u0000\u0000+,\u0005m"+
		"\u0000\u0000,-\u0005p\u0000\u0000-.\u0005o\u0000\u0000./\u0005n\u0000"+
		"\u0000/0\u0005e\u0000\u000001\u0005n\u0000\u000012\u0005t\u0000\u0000"+
		"2\u0002\u0001\u0000\u0000\u000034\u0005{\u0000\u00004\u0004\u0001\u0000"+
		"\u0000\u000056\u0005}\u0000\u00006\u0006\u0001\u0000\u0000\u000078\u0005"+
		"S\u0000\u000089\u0005t\u0000\u00009:\u0005y\u0000\u0000:;\u0005l\u0000"+
		"\u0000;<\u0005e\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005:\u0000"+
		"\u0000>\n\u0001\u0000\u0000\u0000?@\u0005;\u0000\u0000@\f\u0001\u0000"+
		"\u0000\u0000AB\u0005T\u0000\u0000BC\u0005e\u0000\u0000CD\u0005m\u0000"+
		"\u0000DE\u0005p\u0000\u0000EF\u0005l\u0000\u0000FG\u0005a\u0000\u0000"+
		"GH\u0005t\u0000\u0000HI\u0005e\u0000\u0000I\u000e\u0001\u0000\u0000\u0000"+
		"JK\u0005L\u0000\u0000KL\u0005o\u0000\u0000LM\u0005g\u0000\u0000MN\u0005"+
		"i\u0000\u0000NO\u0005c\u0000\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005"+
		"<\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005>\u0000\u0000S\u0014"+
		"\u0001\u0000\u0000\u0000TU\u0005<\u0000\u0000UV\u0005/\u0000\u0000V\u0016"+
		"\u0001\u0000\u0000\u0000WX\u0005=\u0000\u0000X\u0018\u0001\u0000\u0000"+
		"\u0000YZ\u0005(\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000[\\\u0005)\u0000"+
		"\u0000\\\u001c\u0001\u0000\u0000\u0000]^\u0005,\u0000\u0000^\u001e\u0001"+
		"\u0000\u0000\u0000_c\u0007\u0000\u0000\u0000`b\u0007\u0001\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d \u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fh\b\u0002\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\"\u0001"+
		"\u0000\u0000\u0000ko\u0005\"\u0000\u0000ln\t\u0000\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rs\u0005\"\u0000\u0000s$\u0001\u0000\u0000\u0000tv\u0002ab\u0000"+
		"ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x&\u0001\u0000\u0000\u0000y{\u0007\u0003"+
		"\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0006\u0013\u0000\u0000\u007f(\u0001\u0000\u0000\u0000\u0006\u0000"+
		"ciow|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}