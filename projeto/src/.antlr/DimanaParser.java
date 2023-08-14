// Generated from /Users/duartecruz/Library/CloudStorage/OneDrive-UniversidadedeAveiro/2º Semestre Duarte/C/Projeto/comp-2023-dimana-06/src/Dimana.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DimanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, ID=42, NUMBER=43, STRING_LITERAL=44, COMM=45, 
		WS=46;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_list_append = 2, RULE_read = 3, 
		RULE_write = 4, RULE_writeln = 5, RULE_use = 6, RULE_prefix = 7, RULE_dimensionDef = 8, 
		RULE_unitDef = 9, RULE_varInicialization = 10, RULE_assignament = 11, 
		RULE_init = 12, RULE_loop = 13, RULE_conditional = 14, RULE_expression = 15, 
		RULE_type = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "list_append", "read", "write", "writeln", "use", 
			"prefix", "dimensionDef", "unitDef", "varInicialization", "assignament", 
			"init", "loop", "conditional", "expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>>'", "';'", "'read'", "'write'", "'writeln'", "'use'", "'prefix'", 
			"'real'", "'='", "'dimension'", "'unit'", "'['", "']'", "'for'", "'to'", 
			"'do'", "'end;'", "'if'", "'then'", "'else'", "'*'", "'/'", "'+'", "'-'", 
			"'&'", "'|'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'('", "')'", 
			"','", "'!'", "'new'", "'length'", "'integer'", "'string'", "'list'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "NUMBER", "STRING_LITERAL", 
			"COMM", "WS"
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

	@Override
	public String getGrammarFileName() { return "Dimana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DimanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DimanaParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__17) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ID) | (1L << NUMBER) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(34);
				stat();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public DimensionDefContext dimensionDef() {
			return getRuleContext(DimensionDefContext.class,0);
		}
		public UnitDefContext unitDef() {
			return getRuleContext(UnitDefContext.class,0);
		}
		public VarInicializationContext varInicialization() {
			return getRuleContext(VarInicializationContext.class,0);
		}
		public List_appendContext list_append() {
			return getRuleContext(List_appendContext.class,0);
		}
		public AssignamentContext assignament() {
			return getRuleContext(AssignamentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public WritelnContext writeln() {
			return getRuleContext(WritelnContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				dimensionDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				unitDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				varInicialization();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				list_append();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				assignament();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				conditional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				prefix();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(50);
				use();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(51);
				write();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(52);
				writeln();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_appendContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public List_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_append; }
	}

	public final List_appendContext list_append() throws RecognitionException {
		List_appendContext _localctx = new List_appendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			expression(0);
			setState(56);
			match(T__0);
			setState(57);
			match(ID);
			setState(58);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(61);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__3);
			setState(64);
			expression(0);
			setState(65);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritelnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
	}

	public final WritelnContext writeln() throws RecognitionException {
		WritelnContext _localctx = new WritelnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_writeln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__4);
			setState(68);
			expression(0);
			setState(69);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DimanaParser.STRING_LITERAL, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			match(STRING_LITERAL);
			setState(73);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(DimanaParser.NUMBER, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__6);
			setState(76);
			match(T__7);
			setState(77);
			match(ID);
			setState(78);
			match(T__8);
			setState(79);
			match(NUMBER);
			setState(80);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignamentContext assignament() {
			return getRuleContext(AssignamentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimensionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionDef; }
	}

	public final DimensionDefContext dimensionDef() throws RecognitionException {
		DimensionDefContext _localctx = new DimensionDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dimensionDef);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__9);
				setState(83);
				type();
				setState(84);
				assignament();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__9);
				setState(87);
				type();
				setState(88);
				expression(0);
				setState(89);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitDef; }
	}

	public final UnitDefContext unitDef() throws RecognitionException {
		UnitDefContext _localctx = new UnitDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unitDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__10);
			setState(94);
			match(ID);
			setState(95);
			match(T__11);
			{
			setState(96);
			expression(0);
			}
			setState(97);
			match(T__12);
			setState(98);
			match(T__8);
			setState(99);
			expression(0);
			setState(100);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarInicializationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VarInicializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInicialization; }
	}

	public final VarInicializationContext varInicialization() throws RecognitionException {
		VarInicializationContext _localctx = new VarInicializationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varInicialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(104);
				init();
				}
			}

			setState(107);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignamentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignament; }
	}

	public final AssignamentContext assignament() throws RecognitionException {
		AssignamentContext _localctx = new AssignamentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignament);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(110);
				match(T__11);
				setState(111);
				expression(0);
				setState(112);
				match(T__12);
				}
			}

			setState(116);
			init();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__8);
			setState(119);
			expression(0);
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(120);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__13);
			setState(124);
			match(ID);
			setState(125);
			match(T__8);
			setState(126);
			expression(0);
			setState(127);
			match(T__14);
			setState(128);
			expression(0);
			setState(129);
			match(T__15);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				stat();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__17) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ID) | (1L << NUMBER) | (1L << STRING_LITERAL))) != 0) );
			setState(135);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public StatContext if_stat;
		public StatContext else_stat;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__17);
			setState(138);
			expression(0);
			setState(139);
			match(T__18);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				((ConditionalContext)_localctx).if_stat = stat();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__17) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ID) | (1L << NUMBER) | (1L << STRING_LITERAL))) != 0) );
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(145);
				match(T__19);
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					((ConditionalContext)_localctx).else_stat = stat();
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__17) | (1L << T__32) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << ID) | (1L << NUMBER) | (1L << STRING_LITERAL))) != 0) );
				}
			}

			setState(153);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(DimanaParser.STRING_LITERAL, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LengthContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public LengthContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndOrContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ListAccessContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(DimanaParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InputContext extends ExpressionContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public InputContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CommaContext extends ExpressionContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommaContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultDivContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultDivContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ListInitContext extends ExpressionContext {
		public Token op;
		public TerminalNode NUMBER() { return getToken(DimanaParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DimanaParser.STRING_LITERAL, 0); }
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public ListInitContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(156);
				type();
				setState(157);
				match(T__32);
				setState(158);
				expression(0);
				setState(159);
				match(T__33);
				}
				break;
			case 2:
				{
				_localctx = new ListAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(ID);
				setState(162);
				match(T__11);
				setState(163);
				expression(0);
				setState(164);
				match(T__12);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(T__32);
				setState(170);
				expression(0);
				setState(171);
				match(T__33);
				}
				break;
			case 7:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__35);
				setState(174);
				expression(5);
				}
				break;
			case 8:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				read();
				}
				break;
			case 9:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(T__36);
				setState(177);
				type();
				}
				break;
			case 10:
				{
				_localctx = new LengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__37);
				setState(179);
				match(T__32);
				setState(180);
				match(ID);
				setState(181);
				match(T__33);
				}
				break;
			case 11:
				{
				_localctx = new ListInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				((ListInitContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING_LITERAL) ) {
					((ListInitContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				match(T__34);
				setState(184);
				match(NUMBER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExpressionContext(_parentctx, _parentState));
						((MultDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(188);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((MultDivContext)_localctx).e2 = expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(191);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((AddSubContext)_localctx).e2 = expression(16);
						}
						break;
					case 3:
						{
						_localctx = new AndOrContext(new ExpressionContext(_parentctx, _parentState));
						((AndOrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(194);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						((AndOrContext)_localctx).e2 = expression(15);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(197);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						((RelationalContext)_localctx).e2 = expression(14);
						}
						break;
					case 5:
						{
						_localctx = new CommaContext(new ExpressionContext(_parentctx, _parentState));
						((CommaContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(200);
						match(T__34);
						setState(201);
						((CommaContext)_localctx).e2 = expression(12);
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__38);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__7);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(T__40);
				setState(211);
				match(T__11);
				setState(212);
				type();
				setState(213);
				match(T__12);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\5\fl\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\ru\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\5\16|\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\6\17\u0086\n\17\r\17\16\17\u0087\3\17\3\17\3\20\3\20\3\20\3\20\6\20\u0090"+
		"\n\20\r\20\16\20\u0091\3\20\3\20\6\20\u0096\n\20\r\20\16\20\u0097\5\20"+
		"\u009a\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bc\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00cd\n\21\f\21"+
		"\16\21\u00d0\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00db"+
		"\n\22\3\22\2\3 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\4\2,"+
		",..\3\2\27\30\3\2\31\32\3\2\33\34\4\2\3\3\35\"\2\u00f1\2\'\3\2\2\2\4\67"+
		"\3\2\2\2\69\3\2\2\2\b>\3\2\2\2\nA\3\2\2\2\fE\3\2\2\2\16I\3\2\2\2\20M\3"+
		"\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26h\3\2\2\2\30o\3\2\2\2\32x\3\2\2\2\34"+
		"}\3\2\2\2\36\u008b\3\2\2\2 \u00bb\3\2\2\2\"\u00da\3\2\2\2$&\5\4\3\2%$"+
		"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2"+
		"\3+\3\3\2\2\2,8\5\22\n\2-8\5\24\13\2.8\5\26\f\2/8\5\6\4\2\608\5\30\r\2"+
		"\618\5\34\17\2\628\5\36\20\2\638\5\20\t\2\648\5\16\b\2\658\5\n\6\2\66"+
		"8\5\f\7\2\67,\3\2\2\2\67-\3\2\2\2\67.\3\2\2\2\67/\3\2\2\2\67\60\3\2\2"+
		"\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2"+
		"\2\67\66\3\2\2\28\5\3\2\2\29:\5 \21\2:;\7\3\2\2;<\7,\2\2<=\7\4\2\2=\7"+
		"\3\2\2\2>?\7\5\2\2?@\5 \21\2@\t\3\2\2\2AB\7\6\2\2BC\5 \21\2CD\7\4\2\2"+
		"D\13\3\2\2\2EF\7\7\2\2FG\5 \21\2GH\7\4\2\2H\r\3\2\2\2IJ\7\b\2\2JK\7.\2"+
		"\2KL\7\4\2\2L\17\3\2\2\2MN\7\t\2\2NO\7\n\2\2OP\7,\2\2PQ\7\13\2\2QR\7-"+
		"\2\2RS\7\4\2\2S\21\3\2\2\2TU\7\f\2\2UV\5\"\22\2VW\5\30\r\2W^\3\2\2\2X"+
		"Y\7\f\2\2YZ\5\"\22\2Z[\5 \21\2[\\\7\4\2\2\\^\3\2\2\2]T\3\2\2\2]X\3\2\2"+
		"\2^\23\3\2\2\2_`\7\r\2\2`a\7,\2\2ab\7\16\2\2bc\5 \21\2cd\7\17\2\2de\7"+
		"\13\2\2ef\5 \21\2fg\7\4\2\2g\25\3\2\2\2hi\5\"\22\2ik\7,\2\2jl\5\32\16"+
		"\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\4\2\2n\27\3\2\2\2ot\7,\2\2pq\7\16"+
		"\2\2qr\5 \21\2rs\7\17\2\2su\3\2\2\2tp\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5"+
		"\32\16\2w\31\3\2\2\2xy\7\13\2\2y{\5 \21\2z|\7\4\2\2{z\3\2\2\2{|\3\2\2"+
		"\2|\33\3\2\2\2}~\7\20\2\2~\177\7,\2\2\177\u0080\7\13\2\2\u0080\u0081\5"+
		" \21\2\u0081\u0082\7\21\2\2\u0082\u0083\5 \21\2\u0083\u0085\7\22\2\2\u0084"+
		"\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\23\2\2\u008a"+
		"\35\3\2\2\2\u008b\u008c\7\24\2\2\u008c\u008d\5 \21\2\u008d\u008f\7\25"+
		"\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0099\3\2\2\2\u0093\u0095\7\26"+
		"\2\2\u0094\u0096\5\4\3\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\23\2\2\u009c"+
		"\37\3\2\2\2\u009d\u009e\b\21\1\2\u009e\u009f\5\"\22\2\u009f\u00a0\7#\2"+
		"\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7$\2\2\u00a2\u00bc\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4\u00a5\7\16\2\2\u00a5\u00a6\5 \21\2\u00a6\u00a7\7\17\2\2"+
		"\u00a7\u00bc\3\2\2\2\u00a8\u00bc\7,\2\2\u00a9\u00bc\7-\2\2\u00aa\u00bc"+
		"\7.\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\5 \21\2\u00ad\u00ae\7$\2\2\u00ae"+
		"\u00bc\3\2\2\2\u00af\u00b0\7&\2\2\u00b0\u00bc\5 \21\7\u00b1\u00bc\5\b"+
		"\5\2\u00b2\u00b3\7\'\2\2\u00b3\u00bc\5\"\22\2\u00b4\u00b5\7(\2\2\u00b5"+
		"\u00b6\7#\2\2\u00b6\u00b7\7,\2\2\u00b7\u00bc\7$\2\2\u00b8\u00b9\t\2\2"+
		"\2\u00b9\u00ba\7%\2\2\u00ba\u00bc\7-\2\2\u00bb\u009d\3\2\2\2\u00bb\u00a3"+
		"\3\2\2\2\u00bb\u00a8\3\2\2\2\u00bb\u00a9\3\2\2\2\u00bb\u00aa\3\2\2\2\u00bb"+
		"\u00ab\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b2\3\2"+
		"\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00ce\3\2\2\2\u00bd"+
		"\u00be\f\22\2\2\u00be\u00bf\t\3\2\2\u00bf\u00cd\5 \21\23\u00c0\u00c1\f"+
		"\21\2\2\u00c1\u00c2\t\4\2\2\u00c2\u00cd\5 \21\22\u00c3\u00c4\f\20\2\2"+
		"\u00c4\u00c5\t\5\2\2\u00c5\u00cd\5 \21\21\u00c6\u00c7\f\17\2\2\u00c7\u00c8"+
		"\t\6\2\2\u00c8\u00cd\5 \21\20\u00c9\u00ca\f\r\2\2\u00ca\u00cb\7%\2\2\u00cb"+
		"\u00cd\5 \21\16\u00cc\u00bd\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c3\3"+
		"\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d1\u00db\7)\2\2\u00d2\u00db\7\n\2\2\u00d3\u00db\7*\2\2\u00d4\u00d5"+
		"\7+\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\5\"\22\2\u00d7\u00d8\7\17\2\2"+
		"\u00d8\u00db\3\2\2\2\u00d9\u00db\7,\2\2\u00da\u00d1\3\2\2\2\u00da\u00d2"+
		"\3\2\2\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"#\3\2\2\2\20\'\67]kt{\u0087\u0091\u0097\u0099\u00bb\u00cc\u00ce\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}