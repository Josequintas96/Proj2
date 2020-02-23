// Generated from Program.g4 by ANTLR 4.8

import java.util.*;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.Iterator;
import java.lang.Math; 


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_progI = 2, RULE_comment = 3, 
		RULE_varI = 4, RULE_main_p = 5, RULE_sExprM = 6, RULE_varDef2 = 7, RULE_varWork = 8, 
		RULE_varDef = 9, RULE_wrT = 10, RULE_ifelse = 11, RULE_cond = 12, RULE_sExpr = 13, 
		RULE_expr = 14, RULE_exprS = 15, RULE_exprR = 16, RULE_exprI = 17, RULE_exprW2 = 18, 
		RULE_exprW = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "progI", "comment", "varI", "main_p", "sExprM", 
			"varDef2", "varWork", "varDef", "wrT", "ifelse", "cond", "sExpr", "expr", 
			"exprS", "exprR", "exprI", "exprW2", "exprW"
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

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Double count= 0.0;
	Boolean truth = true;
	HashMap<String, Double> Vt = new HashMap<String, Double>();
	HashMap<String,  Boolean> Vb =new HashMap<>();
	Scanner myObj = new Scanner(System.in);

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ProgramParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			statements();
			setState(41);
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

	public static class StatementsContext extends ParserRuleContext {
		public ProgIContext progI() {
			return getRuleContext(ProgIContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public Main_pContext main_p() {
			return getRuleContext(Main_pContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PO:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				progI();
				setState(45);
				statements();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(T__0);
				setState(48);
				varDef();
				setState(49);
				statements();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				main_p();
				}
				break;
			case CO1:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				comment();
				setState(53);
				statements();
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

	public static class ProgIContext extends ParserRuleContext {
		public TerminalNode PO() { return getToken(ProgramParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public ProgIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProgI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProgI(this);
		}
	}

	public final ProgIContext progI() throws RecognitionException {
		ProgIContext _localctx = new ProgIContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_progI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PO);
			setState(58);
			expr(0);
			setState(59);
			match(SEMC);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode CO1() { return getToken(ProgramParser.CO1, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CO2() { return getToken(ProgramParser.CO2, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CO1);
			setState(62);
			expr(0);
			setState(63);
			match(CO2);
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

	public static class VarIContext extends ParserRuleContext {
		public VarDef2Context varDef2() {
			return getRuleContext(VarDef2Context.class,0);
		}
		public VarIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVarI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVarI(this);
		}
	}

	public final VarIContext varI() throws RecognitionException {
		VarIContext _localctx = new VarIContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__0);
			setState(66);
			varDef2();
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

	public static class Main_pContext extends ParserRuleContext {
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public Main_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterMain_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitMain_p(this);
		}
	}

	public final Main_pContext main_p() throws RecognitionException {
		Main_pContext _localctx = new Main_pContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__1);
			setState(69);
			sExprM();
			setState(70);
			match(T__2);
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

	public static class SExprMContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public VarWorkContext varWork() {
			return getRuleContext(VarWorkContext.class,0);
		}
		public WrTContext wrT() {
			return getRuleContext(WrTContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public SExprMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExprM; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSExprM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSExprM(this);
		}
	}

	public final SExprMContext sExprM() throws RecognitionException {
		SExprMContext _localctx = new SExprMContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sExprM);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				comment();
				setState(74);
				sExprM();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				varWork();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				wrT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				ifelse();
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

	public static class VarDef2Context extends ParserRuleContext {
		public ExprSContext exprS;
		public Token ID;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public VarDef2Context varDef2() {
			return getRuleContext(VarDef2Context.class,0);
		}
		public VarDef2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVarDef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVarDef2(this);
		}
	}

	public final VarDef2Context varDef2() throws RecognitionException {
		VarDef2Context _localctx = new VarDef2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDef2);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((VarDef2Context)_localctx).exprS = exprS();
				setState(83);
				match(T__3);
				setState(84);
				((VarDef2Context)_localctx).ID = match(ID);
				setState(85);
				match(SEMC);

				                String ill = (((VarDef2Context)_localctx).ID!=null?((VarDef2Context)_localctx).ID.getText():null);
				                if(ill.equals("boolean"))
				                {Vb.put(((VarDef2Context)_localctx).exprS.i, truth);
				                System.out.println("B. " + ((VarDef2Context)_localctx).exprS.i + " " + ill);
				                }
				                else
				                {Vt.put(((VarDef2Context)_localctx).exprS.i, count);}
				                System.out.println("A. " + ((VarDef2Context)_localctx).exprS.i + " " + ill);
				            
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				((VarDef2Context)_localctx).exprS = exprS();
				setState(89);
				match(T__3);
				setState(90);
				((VarDef2Context)_localctx).ID = match(ID);
				setState(91);
				match(SEMC);

				                String ill = (((VarDef2Context)_localctx).ID!=null?((VarDef2Context)_localctx).ID.getText():null);
				                if(ill.equals("boolean"))
				                {Vb.put(((VarDef2Context)_localctx).exprS.i, truth);
				                System.out.println("B. " + ((VarDef2Context)_localctx).exprS.i + " " + ill);}
				                else
				                {Vt.put(((VarDef2Context)_localctx).exprS.i, count);
				                System.out.println("A. " + ((VarDef2Context)_localctx).exprS.i + " " + ill);
				            }
				setState(93);
				varDef2();
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

	public static class VarWorkContext extends ParserRuleContext {
		public ExprSContext exprS;
		public ExprIContext exprI;
		public Token e2;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public TerminalNode DD() { return getToken(ProgramParser.DD, 0); }
		public ExprIContext exprI() {
			return getRuleContext(ExprIContext.class,0);
		}
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public TerminalNode BO1() { return getToken(ProgramParser.BO1, 0); }
		public TerminalNode BO2() { return getToken(ProgramParser.BO2, 0); }
		public TerminalNode BO3() { return getToken(ProgramParser.BO3, 0); }
		public TerminalNode BO4() { return getToken(ProgramParser.BO4, 0); }
		public VarWorkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varWork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVarWork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVarWork(this);
		}
	}

	public final VarWorkContext varWork() throws RecognitionException {
		VarWorkContext _localctx = new VarWorkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varWork);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				((VarWorkContext)_localctx).exprS = exprS();
				setState(99);
				match(DD);
				setState(100);
				((VarWorkContext)_localctx).exprI = exprI(0);
				{
				setState(101);
				match(SEMC);
				}

				        System.out.println("This is your map: " + Vt.get(((VarWorkContext)_localctx).exprS.i));
				        Vt.replace(((VarWorkContext)_localctx).exprS.i, ((VarWorkContext)_localctx).exprI.i);
				        System.out.println("This is your map: " + Vt.get(((VarWorkContext)_localctx).exprS.i));
				        
				setState(103);
				sExprM();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				((VarWorkContext)_localctx).exprS = exprS();
				setState(106);
				match(DD);
				setState(107);
				((VarWorkContext)_localctx).e2 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BO1) | (1L << BO2) | (1L << BO3) | (1L << BO4))) != 0)) ) {
					((VarWorkContext)_localctx).e2 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				match(SEMC);
				  
				        if(((VarWorkContext)_localctx).e2.equals("true"))
				        {
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, true);
				        }
				         if(((VarWorkContext)_localctx).e2.equals("TRUE"))
				        {
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, true);
				        }
				        if(((VarWorkContext)_localctx).e2.equals("false"))
				        {
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, false);
				        }
				        if(((VarWorkContext)_localctx).e2.equals("FALSE"))
				        {
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, false);
				        }
				        
				setState(110);
				sExprM();
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

	public static class VarDefContext extends ParserRuleContext {
		public List<VarDef2Context> varDef2() {
			return getRuleContexts(VarDef2Context.class);
		}
		public VarDef2Context varDef2(int i) {
			return getRuleContext(VarDef2Context.class,i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDef);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				varDef2();
				setState(116);
				varDef2();
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

	public static class WrTContext extends ParserRuleContext {
		public ExprW2Context exprW2;
		public ExprW2Context exprW2() {
			return getRuleContext(ExprW2Context.class,0);
		}
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public ExprRContext exprR() {
			return getRuleContext(ExprRContext.class,0);
		}
		public WrTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterWrT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitWrT(this);
		}
	}

	public final WrTContext wrT() throws RecognitionException {
		WrTContext _localctx = new WrTContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_wrT);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case SEMC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__4);
				setState(122);
				((WrTContext)_localctx).exprW2 = exprW2();
				setState(123);
				match(T__5);
				System.out.println(((WrTContext)_localctx).exprW2.i);
				            
				setState(125);
				sExprM();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__6);
				setState(128);
				exprR(0);
				setState(129);
				match(T__5);
				setState(130);
				sExprM();
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

	public static class IfelseContext extends ParserRuleContext {
		public CondContext cond;
		public SExprMContext e;
		public SExprMContext el;
		public TerminalNode PARO() { return getToken(ProgramParser.PARO, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode PARC() { return getToken(ProgramParser.PARC, 0); }
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public List<SExprMContext> sExprM() {
			return getRuleContexts(SExprMContext.class);
		}
		public SExprMContext sExprM(int i) {
			return getRuleContext(SExprMContext.class,i);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitIfelse(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifelse);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case SEMC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__7);
				setState(136);
				match(PARO);
				setState(137);
				((IfelseContext)_localctx).cond = cond();
				setState(138);
				match(PARC);
				setState(139);
				match(T__8);
				setState(140);
				((IfelseContext)_localctx).e = sExprM();
				setState(141);
				match(T__9);
				setState(142);
				((IfelseContext)_localctx).el = sExprM();
				setState(143);
				match(SEMC);
				System.out.println(((IfelseContext)_localctx).cond.i);
				    if(((IfelseContext)_localctx).cond.i)
				    {}
				    else
				    {}
				    
				setState(145);
				sExprM();
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

	public static class CondContext extends ParserRuleContext {
		public Boolean i;
		public ExprIContext e;
		public ExprIContext l;
		public Token ID;
		public TerminalNode BO1() { return getToken(ProgramParser.BO1, 0); }
		public TerminalNode BO3() { return getToken(ProgramParser.BO3, 0); }
		public TerminalNode BO2() { return getToken(ProgramParser.BO2, 0); }
		public TerminalNode BO4() { return getToken(ProgramParser.BO4, 0); }
		public List<ExprIContext> exprI() {
			return getRuleContexts(ExprIContext.class);
		}
		public ExprIContext exprI(int i) {
			return getRuleContext(ExprIContext.class,i);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cond);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==BO1 || _la==BO3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((CondContext)_localctx).i = true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==BO2 || _la==BO4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((CondContext)_localctx).i = false;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				((CondContext)_localctx).e = exprI(0);
				setState(155);
				match(T__10);
				setState(156);
				((CondContext)_localctx).l = exprI(0);

				        System.out.println("This is the numb " + ((CondContext)_localctx).e.i + " " + ((CondContext)_localctx).l.i);
				        if(((CondContext)_localctx).e.i != ((CondContext)_localctx).l.i)
				                {((CondContext)_localctx).i =  true;}
				                else
				                {((CondContext)_localctx).i =  false;};
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				((CondContext)_localctx).ID = match(ID);

				        ((CondContext)_localctx).i =  Vb.get((((CondContext)_localctx).ID!=null?((CondContext)_localctx).ID.getText():null));
				        if(_localctx.i)
				        {((CondContext)_localctx).i =  true;}
				                else
				                {((CondContext)_localctx).i =  false;};
				    
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

	public static class SExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public SExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSExpr(this);
		}
	}

	public final SExprContext sExpr() throws RecognitionException {
		SExprContext _localctx = new SExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			expr(0);
			setState(164);
			match(SEMC);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode PARO() { return getToken(ProgramParser.PARO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARC() { return getToken(ProgramParser.PARC, 0); }
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public TerminalNode INT() { return getToken(ProgramParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARO:
				{
				setState(167);
				match(PARO);
				setState(168);
				expr(0);
				setState(169);
				match(PARC);
				}
				break;
			case ID:
				{
				setState(171);
				match(ID);
				}
				break;
			case INT:
				{
				setState(172);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						match(T__11);
						setState(177);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						match(T__12);
						setState(180);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExprSContext extends ParserRuleContext {
		public String i;
		public Token ID;
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public ExprSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExprS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExprS(this);
		}
	}

	public final ExprSContext exprS() throws RecognitionException {
		ExprSContext _localctx = new ExprSContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprS);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case DD:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((ExprSContext)_localctx).ID = match(ID);
				 ((ExprSContext)_localctx).i =  (((ExprSContext)_localctx).ID!=null?((ExprSContext)_localctx).ID.getText():null); 
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

	public static class ExprRContext extends ParserRuleContext {
		public ExprWContext exprW;
		public ExprWContext exprW() {
			return getRuleContext(ExprWContext.class,0);
		}
		public List<ExprRContext> exprR() {
			return getRuleContexts(ExprRContext.class);
		}
		public ExprRContext exprR(int i) {
			return getRuleContext(ExprRContext.class,i);
		}
		public ExprRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExprR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExprR(this);
		}
	}

	public final ExprRContext exprR() throws RecognitionException {
		return exprR(0);
	}

	private ExprRContext exprR(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprRContext _localctx = new ExprRContext(_ctx, _parentState);
		ExprRContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exprR, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(192);
				((ExprRContext)_localctx).exprW = exprW(0);

				                String e2 = myObj.nextLine();
				                System.out.println("This is read "+ ((ExprRContext)_localctx).exprW.i + " " + e2);
				                boolean isB = false;
				                boolean isT = false;
				                if(e2.equals("true"))
				                {isB = true;isT = true;}
				                if(e2.equals("TRUE"))
				                {isB = true;isT = true; }
				                if(e2.equals("false"))
				                {isB = true;isT = false; }
				                if(e2.equals("FALSE"))
				                {isB = true; isT = false; 
				                }

				                if(isB)
				                {Vb.replace(((ExprRContext)_localctx).exprW.i, isT);}
				                else
				                {Double isD = Double.parseDouble(e2);
				                Vt.replace(((ExprRContext)_localctx).exprW.i, isD);}
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprRContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprR);
					setState(197);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(198);
					match(T__13);
					setState(199);
					exprR(3);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprIContext extends ParserRuleContext {
		public Double i;
		public ExprIContext el;
		public ExprIContext e;
		public Token ID;
		public Token INT;
		public ExprIContext er;
		public TerminalNode PARO() { return getToken(ProgramParser.PARO, 0); }
		public TerminalNode PARC() { return getToken(ProgramParser.PARC, 0); }
		public List<ExprIContext> exprI() {
			return getRuleContexts(ExprIContext.class);
		}
		public ExprIContext exprI(int i) {
			return getRuleContext(ExprIContext.class,i);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public TerminalNode INT() { return getToken(ProgramParser.INT, 0); }
		public ExprIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExprI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExprI(this);
		}
	}

	public final ExprIContext exprI() throws RecognitionException {
		return exprI(0);
	}

	private ExprIContext exprI(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprIContext _localctx = new ExprIContext(_ctx, _parentState);
		ExprIContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exprI, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(206);
				match(PARO);
				setState(207);
				((ExprIContext)_localctx).e = exprI(0);
				setState(208);
				match(PARC);
				 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).e.i;
				}
				break;
			case 3:
				{
				setState(211);
				match(T__14);
				setState(212);
				match(PARO);
				setState(213);
				((ExprIContext)_localctx).e = exprI(0);
				setState(214);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.sqrt(((ExprIContext)_localctx).e.i);
				}
				break;
			case 4:
				{
				setState(217);
				match(T__15);
				setState(218);
				match(PARO);
				setState(219);
				((ExprIContext)_localctx).e = exprI(0);
				setState(220);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.cos(((ExprIContext)_localctx).e.i);
				}
				break;
			case 5:
				{
				setState(223);
				match(T__16);
				setState(224);
				match(PARO);
				setState(225);
				((ExprIContext)_localctx).e = exprI(0);
				setState(226);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.sin(((ExprIContext)_localctx).e.i);
				}
				break;
			case 6:
				{
				setState(229);
				match(T__17);
				setState(230);
				match(PARO);
				setState(231);
				((ExprIContext)_localctx).e = exprI(0);
				setState(232);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.log(((ExprIContext)_localctx).e.i);
				}
				break;
			case 7:
				{
				setState(235);
				match(T__18);
				setState(236);
				match(PARO);
				setState(237);
				((ExprIContext)_localctx).e = exprI(0);
				setState(238);
				match(T__13);
				setState(239);
				((ExprIContext)_localctx).el = exprI(0);
				setState(240);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.pow(((ExprIContext)_localctx).e.i, ((ExprIContext)_localctx).el.i);
				}
				break;
			case 8:
				{
				setState(243);
				((ExprIContext)_localctx).ID = match(ID);
				 ((ExprIContext)_localctx).i =  Vt.get((((ExprIContext)_localctx).ID!=null?((ExprIContext)_localctx).ID.getText():null));
				}
				break;
			case 9:
				{
				setState(245);
				((ExprIContext)_localctx).INT = match(INT);
				((ExprIContext)_localctx).i =  Double.parseDouble((((ExprIContext)_localctx).INT!=null?((ExprIContext)_localctx).INT.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(249);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(250);
						match(T__19);
						setState(251);
						((ExprIContext)_localctx).er = exprI(7);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i / ((ExprIContext)_localctx).er.i; 
						}
						break;
					case 2:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(254);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(255);
						match(T__11);
						setState(256);
						((ExprIContext)_localctx).er = exprI(6);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i * ((ExprIContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(259);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(260);
						match(T__12);
						setState(261);
						((ExprIContext)_localctx).er = exprI(5);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i + ((ExprIContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(264);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(265);
						match(T__20);
						setState(266);
						((ExprIContext)_localctx).er = exprI(4);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i - ((ExprIContext)_localctx).er.i; 
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ExprW2Context extends ParserRuleContext {
		public String i;
		public ExprWContext exprW;
		public ExprSContext exprS;
		public ExprWContext exprW() {
			return getRuleContext(ExprWContext.class,0);
		}
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public ExprW2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprW2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExprW2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExprW2(this);
		}
	}

	public final ExprW2Context exprW2() throws RecognitionException {
		ExprW2Context _localctx = new ExprW2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprW2);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__21);
				setState(275);
				((ExprW2Context)_localctx).exprW = exprW(0);
				setState(276);
				match(T__21);
				((ExprW2Context)_localctx).i =  ((ExprW2Context)_localctx).exprW.i;
				}
				break;
			case T__5:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				((ExprW2Context)_localctx).exprS = exprS();
				if(Vb.get(((ExprW2Context)_localctx).exprS.i)!=null)
				        {((ExprW2Context)_localctx).i =  ((ExprW2Context)_localctx).exprS.i;}
				        else
				        {
				            ((ExprW2Context)_localctx).i =  Double.toString(Vt.get(((ExprW2Context)_localctx).exprS.i));
				        }
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

	public static class ExprWContext extends ParserRuleContext {
		public String i;
		public ExprWContext e;
		public Token ID;
		public ExprWContext e2;
		public TerminalNode PARO() { return getToken(ProgramParser.PARO, 0); }
		public TerminalNode PARC() { return getToken(ProgramParser.PARC, 0); }
		public List<ExprWContext> exprW() {
			return getRuleContexts(ExprWContext.class);
		}
		public ExprWContext exprW(int i) {
			return getRuleContext(ExprWContext.class,i);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public ExprWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExprW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExprW(this);
		}
	}

	public final ExprWContext exprW() throws RecognitionException {
		return exprW(0);
	}

	private ExprWContext exprW(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprWContext _localctx = new ExprWContext(_ctx, _parentState);
		ExprWContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exprW, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARO:
				{
				setState(285);
				match(PARO);
				setState(286);
				((ExprWContext)_localctx).e = exprW(0);
				setState(287);
				match(PARC);
				((ExprWContext)_localctx).i =  "";_localctx.i+=((ExprWContext)_localctx).e.i;
				}
				break;
			case ID:
				{
				setState(290);
				((ExprWContext)_localctx).ID = match(ID);
				((ExprWContext)_localctx).i =  (((ExprWContext)_localctx).ID!=null?((ExprWContext)_localctx).ID.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprWContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprW);
						setState(294);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(295);
						match(T__22);
						setState(296);
						((ExprWContext)_localctx).e2 = exprW(4);
						((ExprWContext)_localctx).i =  "";_localctx.i+=((ExprWContext)_localctx).e.i; _localctx.i+=" "; _localctx.i+=((ExprWContext)_localctx).e2.i;
						}
						break;
					case 2:
						{
						_localctx = new ExprWContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprW);
						setState(299);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(300);
						match(T__23);
						((ExprWContext)_localctx).i = ""; _localctx.i+=((ExprWContext)_localctx).e.i; _localctx.i+="!";
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return exprR_sempred((ExprRContext)_localctx, predIndex);
		case 17:
			return exprI_sempred((ExprIContext)_localctx, predIndex);
		case 19:
			return exprW_sempred((ExprWContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprR_sempred(ExprRContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprI_sempred(ExprIContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprW_sempred(ExprWContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ns\n\n\3\13\3\13\3\13\3"+
		"\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0087"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0096\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a4"+
		"\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b0\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b8\n\20\f\20\16\20\u00bb\13\20"+
		"\3\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22\3\22\5\22\u00c6\n\22\3"+
		"\22\3\22\3\22\7\22\u00cb\n\22\f\22\16\22\u00ce\13\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fa\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0110\n\23\f\23\16\23\u0113\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011d\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0127\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0131\n\25\f\25\16\25\u0134\13\25\3\25\2\6\36\"$(\26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\3\2!$\4\2!!##\4\2\"\""+
		"$$\2\u014c\2*\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b?\3\2\2\2\nC\3\2\2\2\fF\3"+
		"\2\2\2\16Q\3\2\2\2\20a\3\2\2\2\22r\3\2\2\2\24x\3\2\2\2\26\u0086\3\2\2"+
		"\2\30\u0095\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00af\3\2\2\2"+
		" \u00bf\3\2\2\2\"\u00c5\3\2\2\2$\u00f9\3\2\2\2&\u011c\3\2\2\2(\u0126\3"+
		"\2\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2-:\3\2\2\2./\5\6\4\2/\60\5\4\3\2"+
		"\60:\3\2\2\2\61\62\7\3\2\2\62\63\5\24\13\2\63\64\5\4\3\2\64:\3\2\2\2\65"+
		":\5\f\7\2\66\67\5\b\5\2\678\5\4\3\28:\3\2\2\29-\3\2\2\29.\3\2\2\29\61"+
		"\3\2\2\29\65\3\2\2\29\66\3\2\2\2:\5\3\2\2\2;<\7%\2\2<=\5\36\20\2=>\7 "+
		"\2\2>\7\3\2\2\2?@\7\34\2\2@A\5\36\20\2AB\7\35\2\2B\t\3\2\2\2CD\7\3\2\2"+
		"DE\5\20\t\2E\13\3\2\2\2FG\7\4\2\2GH\5\16\b\2HI\7\5\2\2I\r\3\2\2\2JR\3"+
		"\2\2\2KL\5\b\5\2LM\5\16\b\2MR\3\2\2\2NR\5\22\n\2OR\5\26\f\2PR\5\30\r\2"+
		"QJ\3\2\2\2QK\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\17\3\2\2\2Sb\3\2\2"+
		"\2TU\5 \21\2UV\7\6\2\2VW\7&\2\2WX\7 \2\2XY\b\t\1\2Yb\3\2\2\2Z[\5 \21\2"+
		"[\\\7\6\2\2\\]\7&\2\2]^\7 \2\2^_\b\t\1\2_`\5\20\t\2`b\3\2\2\2aS\3\2\2"+
		"\2aT\3\2\2\2aZ\3\2\2\2b\21\3\2\2\2cs\3\2\2\2de\5 \21\2ef\7\33\2\2fg\5"+
		"$\23\2gh\7 \2\2hi\b\n\1\2ij\5\16\b\2js\3\2\2\2kl\5 \21\2lm\7\33\2\2mn"+
		"\t\2\2\2no\7 \2\2op\b\n\1\2pq\5\16\b\2qs\3\2\2\2rc\3\2\2\2rd\3\2\2\2r"+
		"k\3\2\2\2s\23\3\2\2\2ty\3\2\2\2uv\5\20\t\2vw\5\20\t\2wy\3\2\2\2xt\3\2"+
		"\2\2xu\3\2\2\2y\25\3\2\2\2z\u0087\3\2\2\2{|\7\7\2\2|}\5&\24\2}~\7\b\2"+
		"\2~\177\b\f\1\2\177\u0080\5\16\b\2\u0080\u0087\3\2\2\2\u0081\u0082\7\t"+
		"\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7\b\2\2\u0084\u0085\5\16\b\2\u0085"+
		"\u0087\3\2\2\2\u0086z\3\2\2\2\u0086{\3\2\2\2\u0086\u0081\3\2\2\2\u0087"+
		"\27\3\2\2\2\u0088\u0096\3\2\2\2\u0089\u008a\7\n\2\2\u008a\u008b\7\36\2"+
		"\2\u008b\u008c\5\32\16\2\u008c\u008d\7\37\2\2\u008d\u008e\7\13\2\2\u008e"+
		"\u008f\5\16\b\2\u008f\u0090\7\f\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7"+
		" \2\2\u0092\u0093\b\r\1\2\u0093\u0094\5\16\b\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0088\3\2\2\2\u0095\u0089\3\2\2\2\u0096\31\3\2\2\2\u0097\u00a4\3\2\2"+
		"\2\u0098\u0099\t\3\2\2\u0099\u00a4\b\16\1\2\u009a\u009b\t\4\2\2\u009b"+
		"\u00a4\b\16\1\2\u009c\u009d\5$\23\2\u009d\u009e\7\r\2\2\u009e\u009f\5"+
		"$\23\2\u009f\u00a0\b\16\1\2\u00a0\u00a4\3\2\2\2\u00a1\u00a2\7&\2\2\u00a2"+
		"\u00a4\b\16\1\2\u00a3\u0097\3\2\2\2\u00a3\u0098\3\2\2\2\u00a3\u009a\3"+
		"\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a7\7 \2\2\u00a7\35\3\2\2\2\u00a8\u00a9\b\20"+
		"\1\2\u00a9\u00aa\7\36\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\7\37\2\2\u00ac"+
		"\u00b0\3\2\2\2\u00ad\u00b0\7&\2\2\u00ae\u00b0\7\'\2\2\u00af\u00a8\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b9\3\2\2\2\u00b1"+
		"\u00b2\f\6\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b8\5\36\20\7\u00b4\u00b5"+
		"\f\5\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b8\5\36\20\6\u00b7\u00b1\3\2\2"+
		"\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\37\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0\3\2\2\2\u00bd"+
		"\u00be\7&\2\2\u00be\u00c0\b\21\1\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0!\3\2\2\2\u00c1\u00c6\b\22\1\2\u00c2\u00c3\5(\25\2\u00c3\u00c4"+
		"\b\22\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2"+
		"\u00c6\u00cc\3\2\2\2\u00c7\u00c8\f\4\2\2\u00c8\u00c9\7\20\2\2\u00c9\u00cb"+
		"\5\"\22\5\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00fa\b"+
		"\23\1\2\u00d0\u00d1\7\36\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\7\37\2\2"+
		"\u00d3\u00d4\b\23\1\2\u00d4\u00fa\3\2\2\2\u00d5\u00d6\7\21\2\2\u00d6\u00d7"+
		"\7\36\2\2\u00d7\u00d8\5$\23\2\u00d8\u00d9\7\37\2\2\u00d9\u00da\b\23\1"+
		"\2\u00da\u00fa\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\7\36\2\2\u00dd"+
		"\u00de\5$\23\2\u00de\u00df\7\37\2\2\u00df\u00e0\b\23\1\2\u00e0\u00fa\3"+
		"\2\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\7\36\2\2\u00e3\u00e4\5$\23\2\u00e4"+
		"\u00e5\7\37\2\2\u00e5\u00e6\b\23\1\2\u00e6\u00fa\3\2\2\2\u00e7\u00e8\7"+
		"\24\2\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\7\37\2\2"+
		"\u00eb\u00ec\b\23\1\2\u00ec\u00fa\3\2\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00ef"+
		"\7\36\2\2\u00ef\u00f0\5$\23\2\u00f0\u00f1\7\20\2\2\u00f1\u00f2\5$\23\2"+
		"\u00f2\u00f3\7\37\2\2\u00f3\u00f4\b\23\1\2\u00f4\u00fa\3\2\2\2\u00f5\u00f6"+
		"\7&\2\2\u00f6\u00fa\b\23\1\2\u00f7\u00f8\7\'\2\2\u00f8\u00fa\b\23\1\2"+
		"\u00f9\u00cf\3\2\2\2\u00f9\u00d0\3\2\2\2\u00f9\u00d5\3\2\2\2\u00f9\u00db"+
		"\3\2\2\2\u00f9\u00e1\3\2\2\2\u00f9\u00e7\3\2\2\2\u00f9\u00ed\3\2\2\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0111\3\2\2\2\u00fb\u00fc\f\b"+
		"\2\2\u00fc\u00fd\7\26\2\2\u00fd\u00fe\5$\23\t\u00fe\u00ff\b\23\1\2\u00ff"+
		"\u0110\3\2\2\2\u0100\u0101\f\7\2\2\u0101\u0102\7\16\2\2\u0102\u0103\5"+
		"$\23\b\u0103\u0104\b\23\1\2\u0104\u0110\3\2\2\2\u0105\u0106\f\6\2\2\u0106"+
		"\u0107\7\17\2\2\u0107\u0108\5$\23\7\u0108\u0109\b\23\1\2\u0109\u0110\3"+
		"\2\2\2\u010a\u010b\f\5\2\2\u010b\u010c\7\27\2\2\u010c\u010d\5$\23\6\u010d"+
		"\u010e\b\23\1\2\u010e\u0110\3\2\2\2\u010f\u00fb\3\2\2\2\u010f\u0100\3"+
		"\2\2\2\u010f\u0105\3\2\2\2\u010f\u010a\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112%\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\u0114\u0115\7\30\2\2\u0115\u0116\5(\25\2\u0116\u0117\7\30\2\2\u0117\u0118"+
		"\b\24\1\2\u0118\u011d\3\2\2\2\u0119\u011a\5 \21\2\u011a\u011b\b\24\1\2"+
		"\u011b\u011d\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0119\3\2\2\2\u011d\'\3"+
		"\2\2\2\u011e\u011f\b\25\1\2\u011f\u0120\7\36\2\2\u0120\u0121\5(\25\2\u0121"+
		"\u0122\7\37\2\2\u0122\u0123\b\25\1\2\u0123\u0127\3\2\2\2\u0124\u0125\7"+
		"&\2\2\u0125\u0127\b\25\1\2\u0126\u011e\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0132\3\2\2\2\u0128\u0129\f\5\2\2\u0129\u012a\7\31\2\2\u012a\u012b\5"+
		"(\25\6\u012b\u012c\b\25\1\2\u012c\u0131\3\2\2\2\u012d\u012e\f\4\2\2\u012e"+
		"\u012f\7\32\2\2\u012f\u0131\b\25\1\2\u0130\u0128\3\2\2\2\u0130\u012d\3"+
		"\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		")\3\2\2\2\u0134\u0132\3\2\2\2\279Qarx\u0086\u0095\u00a3\u00af\u00b7\u00b9"+
		"\u00bf\u00c5\u00cc\u00f9\u010f\u0111\u011c\u0126\u0130\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}