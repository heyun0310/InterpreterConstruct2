// Generated from E:/ѧϰ/������/����������/KTest/src/main/java\CMinusMinus.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMinusMinusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Comment=2, LineComment=3, LPAREN=4, RPAREN=5, LBRACK=6, RBRACK=7, 
		LBRACE=8, RBRACE=9, COMMA=10, SEMICOLON=11, ADD=12, SUB=13, MUL=14, DIV=15, 
		EQEQ=16, NE=17, LT=18, EQ=19, IF=20, ELSE=21, WHILE=22, BREAK=23, READ=24, 
		WRITE=25, INT=26, REAL=27, Integer=28, RealNumber=29, ID=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "Comment", "LineComment", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"LBRACE", "RBRACE", "COMMA", "SEMICOLON", "ADD", "SUB", "MUL", "DIV", 
		"EQEQ", "NE", "LT", "EQ", "IF", "ELSE", "WHILE", "BREAK", "READ", "WRITE", 
		"INT", "REAL", "Integer", "RealNumber", "ID", "Digit", "LetterOrUnderscore", 
		"Letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
		"';'", "'+'", "'-'", "'*'", "'/'", "'=='", "'<>'", "'<'", "'='", "'if'", 
		"'else'", "'while'", "'break'", "'read'", "'write'", "'int'", "'real'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "Comment", "LineComment", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"LBRACE", "RBRACE", "COMMA", "SEMICOLON", "ADD", "SUB", "MUL", "DIV", 
		"EQEQ", "NE", "LT", "EQ", "IF", "ELSE", "WHILE", "BREAK", "READ", "WRITE", 
		"INT", "REAL", "Integer", "RealNumber", "ID"
	};
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


	public CMinusMinusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "com/cmm/CMinusMinus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00ce\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\5\4`\n\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\6\35\u00b1\n\35\r\35\16\35\u00b2\3\36\6\36\u00b6\n"+
		"\36\r\36\16\36\u00b7\3\36\3\36\6\36\u00bc\n\36\r\36\16\36\u00bd\3\37\3"+
		"\37\7\37\u00c2\n\37\f\37\16\37\u00c5\13\37\3 \3 \3!\3!\5!\u00cb\n!\3\""+
		"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?\2A\2C\2\3\2\7\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\4\2C\\c|\2\u00d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3F\3\2\2\2\5L\3\2"+
		"\2\2\7U\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2"+
		"\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35y\3"+
		"\2\2\2\37{\3\2\2\2!}\3\2\2\2#\u0080\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2"+
		"\2\2)\u0087\3\2\2\2+\u008a\3\2\2\2-\u008f\3\2\2\2/\u0095\3\2\2\2\61\u009b"+
		"\3\2\2\2\63\u00a0\3\2\2\2\65\u00a6\3\2\2\2\67\u00aa\3\2\2\29\u00b0\3\2"+
		"\2\2;\u00b5\3\2\2\2=\u00bf\3\2\2\2?\u00c6\3\2\2\2A\u00ca\3\2\2\2C\u00cc"+
		"\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2J"+
		"K\b\2\2\2K\4\3\2\2\2LM\7\61\2\2MN\7,\2\2NO\3\2\2\2OP\13\2\2\2PQ\7,\2\2"+
		"QR\7\61\2\2RS\3\2\2\2ST\b\3\2\2T\6\3\2\2\2UV\7\61\2\2VW\7\61\2\2W[\3\2"+
		"\2\2XZ\n\3\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3"+
		"\2\2\2^`\7\17\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\f\2\2bc\3\2\2\2cd"+
		"\b\4\2\2d\b\3\2\2\2ef\7*\2\2f\n\3\2\2\2gh\7+\2\2h\f\3\2\2\2ij\7]\2\2j"+
		"\16\3\2\2\2kl\7_\2\2l\20\3\2\2\2mn\7}\2\2n\22\3\2\2\2op\7\177\2\2p\24"+
		"\3\2\2\2qr\7.\2\2r\26\3\2\2\2st\7=\2\2t\30\3\2\2\2uv\7-\2\2v\32\3\2\2"+
		"\2wx\7/\2\2x\34\3\2\2\2yz\7,\2\2z\36\3\2\2\2{|\7\61\2\2| \3\2\2\2}~\7"+
		"?\2\2~\177\7?\2\2\177\"\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7@\2\2"+
		"\u0082$\3\2\2\2\u0083\u0084\7>\2\2\u0084&\3\2\2\2\u0085\u0086\7?\2\2\u0086"+
		"(\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089*\3\2\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e"+
		",\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091\7j\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094.\3\2\2\2\u0095\u0096\7d\2\2\u0096"+
		"\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099\u009a\7m\2\2"+
		"\u009a\60\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7"+
		"c\2\2\u009e\u009f\7f\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\64\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\66\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae8\3\2\2\2\u00af\u00b1\5? \2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3:\3\2\2\2"+
		"\u00b4\u00b6\5? \2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\60\2\2"+
		"\u00ba\u00bc\5? \2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be<\3\2\2\2\u00bf\u00c3\t\4\2\2\u00c0"+
		"\u00c2\t\5\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4>\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7"+
		"\4\62;\2\u00c7@\3\2\2\2\u00c8\u00cb\5C\"\2\u00c9\u00cb\7a\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cbB\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cd"+
		"D\3\2\2\2\13\2H[_\u00b2\u00b7\u00bd\u00c3\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}