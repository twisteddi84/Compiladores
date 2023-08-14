// Generated from Dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DimanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35124242828792L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_appendContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public List_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterList_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitList_append(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitList_append(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WritelnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterWriteln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitWriteln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitWriteln(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DimanaParser.STRING_LITERAL, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(DimanaParser.NUMBER, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterDimensionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitDimensionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitDimensionDef(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterUnitDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitUnitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitUnitDef(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterVarInicialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitVarInicialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitVarInicialization(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterAssignament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitAssignament(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitAssignament(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35124242828792L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35124242828792L) != 0) );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35124242828792L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class NewContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(DimanaParser.STRING_LITERAL, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public LengthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterListAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitListAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitListAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(DimanaParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ExpressionContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public InputContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListInitContext extends ExpressionContext {
		public Token op;
		public TerminalNode NUMBER() { return getToken(DimanaParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DimanaParser.STRING_LITERAL, 0); }
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public ListInitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterListInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitListInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitListInit(this);
			else return visitor.visitChildren(this);
		}
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716866L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DimanaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimanaListener ) ((DimanaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DimanaVisitor ) return ((DimanaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
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
		"\u0004\u0001.\u00db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\\\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\nj\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bs\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0003\fz\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0004\r\u0084\b\r\u000b\r\f\r\u0085\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u008e\b\u000e\u000b\u000e"+
		"\f\u000e\u008f\u0001\u000e\u0001\u000e\u0004\u000e\u0094\b\u000e\u000b"+
		"\u000e\f\u000e\u0095\u0003\u000e\u0098\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00ba\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00cb\b\u000f\n\u000f\f\u000f\u00ce\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00d9\b\u0010\u0001\u0010\u0000\u0001\u001e\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0005\u0002\u0000**,,\u0001\u0000\u0015\u0016\u0001\u0000"+
		"\u0017\u0018\u0001\u0000\u0019\u001a\u0002\u0000\u0001\u0001\u001b \u00ef"+
		"\u0000%\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u00047"+
		"\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\b?\u0001\u0000"+
		"\u0000\u0000\nC\u0001\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000e"+
		"K\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000\u0000\u0012]\u0001"+
		"\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016m\u0001\u0000\u0000"+
		"\u0000\u0018v\u0001\u0000\u0000\u0000\u001a{\u0001\u0000\u0000\u0000\u001c"+
		"\u0089\u0001\u0000\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000 \u00d8"+
		"\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005"+
		"\u0000\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*6\u0003\u0010\b\u0000"+
		"+6\u0003\u0012\t\u0000,6\u0003\u0014\n\u0000-6\u0003\u0004\u0002\u0000"+
		".6\u0003\u0016\u000b\u0000/6\u0003\u001a\r\u000006\u0003\u001c\u000e\u0000"+
		"16\u0003\u000e\u0007\u000026\u0003\f\u0006\u000036\u0003\b\u0004\u0000"+
		"46\u0003\n\u0005\u00005*\u0001\u0000\u0000\u00005+\u0001\u0000\u0000\u0000"+
		"5,\u0001\u0000\u0000\u00005-\u0001\u0000\u0000\u00005.\u0001\u0000\u0000"+
		"\u00005/\u0001\u0000\u0000\u000050\u0001\u0000\u0000\u000051\u0001\u0000"+
		"\u0000\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u000078\u0003\u001e\u000f"+
		"\u000089\u0005\u0001\u0000\u00009:\u0005*\u0000\u0000:;\u0005\u0002\u0000"+
		"\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0003"+
		"\u001e\u000f\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0005\u0004\u0000"+
		"\u0000@A\u0003\u001e\u000f\u0000AB\u0005\u0002\u0000\u0000B\t\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0003\u001e\u000f\u0000EF\u0005"+
		"\u0002\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0005\u0006\u0000"+
		"\u0000HI\u0005,\u0000\u0000IJ\u0005\u0002\u0000\u0000J\r\u0001\u0000\u0000"+
		"\u0000KL\u0005\u0007\u0000\u0000LM\u0005\b\u0000\u0000MN\u0005*\u0000"+
		"\u0000NO\u0005\t\u0000\u0000OP\u0005+\u0000\u0000PQ\u0005\u0002\u0000"+
		"\u0000Q\u000f\u0001\u0000\u0000\u0000RS\u0005\n\u0000\u0000ST\u0003 \u0010"+
		"\u0000TU\u0003\u0016\u000b\u0000U\\\u0001\u0000\u0000\u0000VW\u0005\n"+
		"\u0000\u0000WX\u0003 \u0010\u0000XY\u0003\u001e\u000f\u0000YZ\u0005\u0002"+
		"\u0000\u0000Z\\\u0001\u0000\u0000\u0000[R\u0001\u0000\u0000\u0000[V\u0001"+
		"\u0000\u0000\u0000\\\u0011\u0001\u0000\u0000\u0000]^\u0005\u000b\u0000"+
		"\u0000^_\u0005*\u0000\u0000_`\u0005\f\u0000\u0000`a\u0003\u001e\u000f"+
		"\u0000ab\u0005\r\u0000\u0000bc\u0005\t\u0000\u0000cd\u0003\u001e\u000f"+
		"\u0000de\u0005\u0002\u0000\u0000e\u0013\u0001\u0000\u0000\u0000fg\u0003"+
		" \u0010\u0000gi\u0005*\u0000\u0000hj\u0003\u0018\f\u0000ih\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005"+
		"\u0002\u0000\u0000l\u0015\u0001\u0000\u0000\u0000mr\u0005*\u0000\u0000"+
		"no\u0005\f\u0000\u0000op\u0003\u001e\u000f\u0000pq\u0005\r\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0003\u0018\f\u0000u\u0017\u0001\u0000"+
		"\u0000\u0000vw\u0005\t\u0000\u0000wy\u0003\u001e\u000f\u0000xz\u0005\u0002"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0019"+
		"\u0001\u0000\u0000\u0000{|\u0005\u000e\u0000\u0000|}\u0005*\u0000\u0000"+
		"}~\u0005\t\u0000\u0000~\u007f\u0003\u001e\u000f\u0000\u007f\u0080\u0005"+
		"\u000f\u0000\u0000\u0080\u0081\u0003\u001e\u000f\u0000\u0081\u0083\u0005"+
		"\u0010\u0000\u0000\u0082\u0084\u0003\u0002\u0001\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0011\u0000\u0000\u0088\u001b\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u008b\u0003"+
		"\u001e\u000f\u0000\u008b\u008d\u0005\u0013\u0000\u0000\u008c\u008e\u0003"+
		"\u0002\u0001\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0097\u0001\u0000\u0000\u0000\u0091\u0093\u0005"+
		"\u0014\u0000\u0000\u0092\u0094\u0003\u0002\u0001\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001"+
		"\u0000\u0000\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0011\u0000\u0000\u009a\u001d\u0001\u0000\u0000\u0000\u009b\u009c\u0006"+
		"\u000f\uffff\uffff\u0000\u009c\u009d\u0003 \u0010\u0000\u009d\u009e\u0005"+
		"!\u0000\u0000\u009e\u009f\u0003\u001e\u000f\u0000\u009f\u00a0\u0005\""+
		"\u0000\u0000\u00a0\u00ba\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005*\u0000"+
		"\u0000\u00a2\u00a3\u0005\f\u0000\u0000\u00a3\u00a4\u0003\u001e\u000f\u0000"+
		"\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00ba\u0001\u0000\u0000\u0000\u00a6"+
		"\u00ba\u0005*\u0000\u0000\u00a7\u00ba\u0005+\u0000\u0000\u00a8\u00ba\u0005"+
		",\u0000\u0000\u00a9\u00aa\u0005!\u0000\u0000\u00aa\u00ab\u0003\u001e\u000f"+
		"\u0000\u00ab\u00ac\u0005\"\u0000\u0000\u00ac\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005$\u0000\u0000\u00ae\u00ba\u0003\u001e\u000f\u0005\u00af"+
		"\u00ba\u0003\u0006\u0003\u0000\u00b0\u00b1\u0005%\u0000\u0000\u00b1\u00ba"+
		"\u0003 \u0010\u0000\u00b2\u00b3\u0005&\u0000\u0000\u00b3\u00b4\u0005!"+
		"\u0000\u0000\u00b4\u00b5\u0005*\u0000\u0000\u00b5\u00ba\u0005\"\u0000"+
		"\u0000\u00b6\u00b7\u0007\u0000\u0000\u0000\u00b7\u00b8\u0005#\u0000\u0000"+
		"\u00b8\u00ba\u0005+\u0000\u0000\u00b9\u009b\u0001\u0000\u0000\u0000\u00b9"+
		"\u00a1\u0001\u0000\u0000\u0000\u00b9\u00a6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00b9\u00a8\u0001\u0000\u0000\u0000\u00b9"+
		"\u00a9\u0001\u0000\u0000\u0000\u00b9\u00ad\u0001\u0000\u0000\u0000\u00b9"+
		"\u00af\u0001\u0000\u0000\u0000\u00b9\u00b0\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00ba"+
		"\u00cc\u0001\u0000\u0000\u0000\u00bb\u00bc\n\u0010\u0000\u0000\u00bc\u00bd"+
		"\u0007\u0001\u0000\u0000\u00bd\u00cb\u0003\u001e\u000f\u0011\u00be\u00bf"+
		"\n\u000f\u0000\u0000\u00bf\u00c0\u0007\u0002\u0000\u0000\u00c0\u00cb\u0003"+
		"\u001e\u000f\u0010\u00c1\u00c2\n\u000e\u0000\u0000\u00c2\u00c3\u0007\u0003"+
		"\u0000\u0000\u00c3\u00cb\u0003\u001e\u000f\u000f\u00c4\u00c5\n\r\u0000"+
		"\u0000\u00c5\u00c6\u0007\u0004\u0000\u0000\u00c6\u00cb\u0003\u001e\u000f"+
		"\u000e\u00c7\u00c8\n\u000b\u0000\u0000\u00c8\u00c9\u0005#\u0000\u0000"+
		"\u00c9\u00cb\u0003\u001e\u000f\f\u00ca\u00bb\u0001\u0000\u0000\u0000\u00ca"+
		"\u00be\u0001\u0000\u0000\u0000\u00ca\u00c1\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u001f\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d9\u0005\'\u0000\u0000\u00d0\u00d9"+
		"\u0005\b\u0000\u0000\u00d1\u00d9\u0005(\u0000\u0000\u00d2\u00d3\u0005"+
		")\u0000\u0000\u00d3\u00d4\u0005\f\u0000\u0000\u00d4\u00d5\u0003 \u0010"+
		"\u0000\u00d5\u00d6\u0005\r\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d9\u0005*\u0000\u0000\u00d8\u00cf\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"!\u0001\u0000\u0000\u0000\u000e%5[iry\u0085\u008f\u0095\u0097\u00b9\u00ca"+
		"\u00cc\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}