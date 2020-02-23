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
		T__24=25, CO1=26, CO2=27, PARO=28, PARC=29, PO=30, DD=31, SEMC=32, ID=33, 
		INT=34, FLOAT=35, WS=36;
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_progI = 2, RULE_varDef2 = 3, 
		RULE_comment = 4, RULE_main_p = 5, RULE_sExprM = 6, RULE_varWork = 7, 
		RULE_wrT = 8, RULE_ifelse = 9, RULE_sExprI = 10, RULE_wrT2 = 11, RULE_varWork2 = 12, 
		RULE_cond = 13, RULE_exprW = 14, RULE_exprR = 15, RULE_exprS = 16, RULE_exprI = 17, 
		RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "progI", "varDef2", "comment", "main_p", "sExprM", 
			"varWork", "wrT", "ifelse", "sExprI", "wrT2", "varWork2", "cond", "exprW", 
			"exprR", "exprS", "exprI", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "'begin'", "'end.'", "'TRUE'", "'FALSE'", "'true'", 
			"'false'", "'writeln'", "'readln'", "'if'", "'then'", "'else'", "'='", 
			"'+'", "'''", "','", "'Sqrt'", "'Cos'", "'Sin'", "'ln'", "'dopower'", 
			"'/'", "'*'", "'-'", null, null, "'('", "')'", "'program'", "':='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CO1", "CO2", "PARO", "PARC", "PO", "DD", "SEMC", "ID", "INT", 
			"FLOAT", "WS"
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
	Boolean happen = true;

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
			setState(38);
			statements();
			setState(39);
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
		public VarDef2Context varDef2() {
			return getRuleContext(VarDef2Context.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Main_pContext main_p() {
			return getRuleContext(Main_pContext.class,0);
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
			setState(53);
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
				setState(42);
				progI();
				setState(43);
				statements();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(T__0);
				setState(46);
				varDef2();
				setState(47);
				statements();
				}
				break;
			case CO1:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				comment();
				setState(50);
				statements();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				main_p();
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
			setState(55);
			match(PO);
			setState(56);
			expr(0);
			setState(57);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
		enterRule(_localctx, 6, RULE_varDef2);
		try {
			setState(70);
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
				setState(60);
				((VarDef2Context)_localctx).exprS = exprS();
				setState(61);
				match(T__1);
				setState(62);
				((VarDef2Context)_localctx).ID = match(ID);
				setState(63);
				match(SEMC);

				                String ill = (((VarDef2Context)_localctx).ID!=null?((VarDef2Context)_localctx).ID.getText():null);
				                if(ill.equals("boolean"))
				                {Vb.put(((VarDef2Context)_localctx).exprS.i, truth);
				                System.out.println("B. " + ((VarDef2Context)_localctx).exprS.i + " " + ill);
				                }
				                else
				                {Vt.put(((VarDef2Context)_localctx).exprS.i, count);}
				                System.out.println("A. " + ((VarDef2Context)_localctx).exprS.i + " " + ill);
				            
				setState(65);
				varDef2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				comment();
				setState(68);
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
		enterRule(_localctx, 8, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CO1);
			setState(73);
			expr(0);
			setState(74);
			match(CO2);
			System.out.println("Comment");
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
			setState(77);
			match(T__2);
			setState(78);
			sExprM();
			setState(79);
			match(T__3);
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
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public WrTContext wrT() {
			return getRuleContext(WrTContext.class,0);
		}
		public VarWorkContext varWork() {
			return getRuleContext(VarWorkContext.class,0);
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
			setState(88);
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
				ifelse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				comment();
				setState(84);
				sExprM();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				wrT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				varWork();
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
		public Token e;
		public ExprIContext exprI;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public TerminalNode DD() { return getToken(ProgramParser.DD, 0); }
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public ExprIContext exprI() {
			return getRuleContext(ExprIContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_varWork);
		int _la;
		try {
			setState(105);
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
				setState(91);
				((VarWorkContext)_localctx).exprS = exprS();
				setState(92);
				match(DD);
				setState(93);
				((VarWorkContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					((VarWorkContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				match(SEMC);
				  System.out.println("This is B at B " + Vb.get(((VarWorkContext)_localctx).exprS.i));
				        String e2 = (((VarWorkContext)_localctx).e!=null?((VarWorkContext)_localctx).e.getText():null);
				        if(e2.equals("true"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, true);
				        }
				         if(e2.equals("TRUE"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, true);
				        }
				        if(e2.equals("false"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, false);
				        }
				        if(e2.equals("FALSE"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, false);
				        }
				        System.out.println("This is B at E " + Vb.get(((VarWorkContext)_localctx).exprS.i));
				        
				setState(96);
				sExprM();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
		public ExprWContext exprW;
		public ExprRContext exprR;
		public TerminalNode PARO() { return getToken(ProgramParser.PARO, 0); }
		public ExprWContext exprW() {
			return getRuleContext(ExprWContext.class,0);
		}
		public TerminalNode PARC() { return getToken(ProgramParser.PARC, 0); }
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
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
		enterRule(_localctx, 16, RULE_wrT);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__8);
				setState(109);
				match(PARO);
				setState(110);
				((WrTContext)_localctx).exprW = exprW(0);
				setState(111);
				match(PARC);
				setState(112);
				match(SEMC);
				 
				                System.out.println(((WrTContext)_localctx).exprW.i);
				            
				setState(114);
				sExprM();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__9);
				setState(117);
				match(PARO);
				setState(118);
				((WrTContext)_localctx).exprR = exprR(0);
				setState(119);
				match(PARC);
				setState(120);
				match(SEMC);
				System.out.println((((WrTContext)_localctx).exprR!=null?_input.getText(((WrTContext)_localctx).exprR.start,((WrTContext)_localctx).exprR.stop):null));
				setState(122);
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
		public CondContext e;
		public CondContext cond;
		public TerminalNode PARO() { return getToken(ProgramParser.PARO, 0); }
		public TerminalNode PARC() { return getToken(ProgramParser.PARC, 0); }
		public List<SExprIContext> sExprI() {
			return getRuleContexts(SExprIContext.class);
		}
		public SExprIContext sExprI(int i) {
			return getRuleContext(SExprIContext.class,i);
		}
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
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
		enterRule(_localctx, 18, RULE_ifelse);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("It activate");
				setState(128);
				match(T__10);
				setState(129);
				match(PARO);
				setState(130);
				((IfelseContext)_localctx).e = ((IfelseContext)_localctx).cond = cond();
				setState(131);
				match(PARC);
				setState(132);
				match(T__11);
				setState(133);
				sExprI(((IfelseContext)_localctx).cond.i);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(134);
					match(T__12);
					setState(135);
					sExprI(!((IfelseContext)_localctx).cond.i);
					}
				}

				setState(138);
				match(SEMC);
				System.out.println(((IfelseContext)_localctx).cond.i);
				    
				setState(140);
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

	public static class SExprIContext extends ParserRuleContext {
		public Boolean i;
		public WrT2Context wrT2() {
			return getRuleContext(WrT2Context.class,0);
		}
		public VarWork2Context varWork2() {
			return getRuleContext(VarWork2Context.class,0);
		}
		public SExprIContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SExprIContext(ParserRuleContext parent, int invokingState, Boolean i) {
			super(parent, invokingState);
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_sExprI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSExprI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSExprI(this);
		}
	}

	public final SExprIContext sExprI(Boolean i) throws RecognitionException {
		SExprIContext _localctx = new SExprIContext(_ctx, getState(), i);
		enterRule(_localctx, 20, RULE_sExprI);
		try {
			setState(147);
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
				setState(145);
				wrT2(_localctx.i);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				varWork2(_localctx.i);
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

	public static class WrT2Context extends ParserRuleContext {
		public Boolean a;
		public ExprWContext exprW;
		public ExprRContext exprR;
		public TerminalNode PARO() { return getToken(ProgramParser.PARO, 0); }
		public ExprWContext exprW() {
			return getRuleContext(ExprWContext.class,0);
		}
		public TerminalNode PARC() { return getToken(ProgramParser.PARC, 0); }
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public ExprRContext exprR() {
			return getRuleContext(ExprRContext.class,0);
		}
		public WrT2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WrT2Context(ParserRuleContext parent, int invokingState, Boolean a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_wrT2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterWrT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitWrT2(this);
		}
	}

	public final WrT2Context wrT2(Boolean a) throws RecognitionException {
		WrT2Context _localctx = new WrT2Context(_ctx, getState(), a);
		enterRule(_localctx, 22, RULE_wrT2);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case SEMC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__8);
				setState(151);
				match(PARO);
				setState(152);
				((WrT2Context)_localctx).exprW = exprW(0);
				setState(153);
				match(PARC);
				setState(154);
				match(SEMC);
				 {System.out.println("ValueofA " + _localctx.a);}
				                if(_localctx.a){System.out.println(((WrT2Context)_localctx).exprW.i);}
				            
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__9);
				setState(158);
				match(PARO);
				setState(159);
				((WrT2Context)_localctx).exprR = exprR(0);
				setState(160);
				match(PARC);
				setState(161);
				match(SEMC);
				System.out.println((((WrT2Context)_localctx).exprR!=null?_input.getText(((WrT2Context)_localctx).exprR.start,((WrT2Context)_localctx).exprR.stop):null));
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

	public static class VarWork2Context extends ParserRuleContext {
		public Boolean a;
		public ExprSContext exprS;
		public Token e;
		public ExprIContext exprI;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public TerminalNode DD() { return getToken(ProgramParser.DD, 0); }
		public TerminalNode SEMC() { return getToken(ProgramParser.SEMC, 0); }
		public ExprIContext exprI() {
			return getRuleContext(ExprIContext.class,0);
		}
		public VarWork2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarWork2Context(ParserRuleContext parent, int invokingState, Boolean a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_varWork2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterVarWork2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitVarWork2(this);
		}
	}

	public final VarWork2Context varWork2(Boolean a) throws RecognitionException {
		VarWork2Context _localctx = new VarWork2Context(_ctx, getState(), a);
		enterRule(_localctx, 24, RULE_varWork2);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				((VarWork2Context)_localctx).exprS = exprS();
				setState(168);
				match(DD);
				setState(169);
				((VarWork2Context)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					((VarWork2Context)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				match(SEMC);
				  if(_localctx.a){
				        System.out.println("This is B at B " + Vb.get(((VarWork2Context)_localctx).exprS.i));
				        String e2 = (((VarWork2Context)_localctx).e!=null?((VarWork2Context)_localctx).e.getText():null);
				        if(e2.equals("true"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWork2Context)_localctx).exprS.i, true);
				        }
				         if(e2.equals("TRUE"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWork2Context)_localctx).exprS.i, true);
				        }
				        if(e2.equals("false"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWork2Context)_localctx).exprS.i, false);
				        }
				        if(e2.equals("FALSE"))
				        {
				            System.out.println("True happen");
				            Vb.replace(((VarWork2Context)_localctx).exprS.i, false);
				        }
				        System.out.println("This is B at E " + Vb.get(((VarWork2Context)_localctx).exprS.i));
				        }
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				((VarWork2Context)_localctx).exprS = exprS();
				setState(174);
				match(DD);
				setState(175);
				((VarWork2Context)_localctx).exprI = exprI(0);
				{
				setState(176);
				match(SEMC);
				}
				if(_localctx.a){
				         System.out.println("This is your map: " + Vt.get(((VarWork2Context)_localctx).exprS.i));
				        Vt.replace(((VarWork2Context)_localctx).exprS.i, ((VarWork2Context)_localctx).exprI.i);
				        System.out.println("This is your map: " + Vt.get(((VarWork2Context)_localctx).exprS.i));
				        } 
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

	public static class CondContext extends ParserRuleContext {
		public Boolean i;
		public ExprIContext e;
		public ExprIContext l;
		public Token ID;
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
		enterRule(_localctx, 26, RULE_cond);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__6) ) {
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
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__7) ) {
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
				setState(186);
				((CondContext)_localctx).e = exprI(0);
				setState(187);
				match(T__13);
				setState(188);
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
				setState(191);
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

	public static class ExprWContext extends ParserRuleContext {
		public String i;
		public ExprWContext e;
		public ExprSContext exprS;
		public ExprWContext el;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public List<ExprWContext> exprW() {
			return getRuleContexts(ExprWContext.class);
		}
		public ExprWContext exprW(int i) {
			return getRuleContext(ExprWContext.class,i);
		}
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exprW, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(196);
				match(T__15);
				setState(197);
				((ExprWContext)_localctx).exprS = exprS();
				setState(198);
				match(T__15);
				((ExprWContext)_localctx).i =  ((ExprWContext)_localctx).exprS.i;
				}
				break;
			case 3:
				{
				setState(201);
				((ExprWContext)_localctx).exprS = exprS();
				if(Vb.get(((ExprWContext)_localctx).exprS.i)!=null)
				        {((ExprWContext)_localctx).i =  ((ExprWContext)_localctx).exprS.i;}
				        else
				        {
				            ((ExprWContext)_localctx).i =  Double.toString(Vt.get(((ExprWContext)_localctx).exprS.i));
				        }
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprWContext(_parentctx, _parentState);
					_localctx.e = _prevctx;
					_localctx.e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exprW);
					setState(206);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(207);
					match(T__14);
					setState(208);
					((ExprWContext)_localctx).el = exprW(4);
					((ExprWContext)_localctx).i = ((ExprWContext)_localctx).e.i; _localctx.i+=" "; _localctx.i+=((ExprWContext)_localctx).el.i;
					}
					} 
				}
				setState(215);
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

	public static class ExprRContext extends ParserRuleContext {
		public ExprSContext exprS;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exprR, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(217);
				((ExprRContext)_localctx).exprS = exprS();

				                String e2 = myObj.nextLine();
				                System.out.println("This is read "+ ((ExprRContext)_localctx).exprS.i + " " + e2);
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
				                {Vb.replace(((ExprRContext)_localctx).exprS.i, isT);}
				                else
				                {Double isD = Double.parseDouble(e2);
				                Vt.replace(((ExprRContext)_localctx).exprS.i, isD);}
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprRContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprR);
					setState(222);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(223);
					match(T__16);
					setState(224);
					exprR(3);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 32, RULE_exprS);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				((ExprSContext)_localctx).ID = match(ID);
				 ((ExprSContext)_localctx).i =  (((ExprSContext)_localctx).ID!=null?((ExprSContext)_localctx).ID.getText():null); 
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

	public static class ExprIContext extends ParserRuleContext {
		public Double i;
		public ExprIContext el;
		public ExprIContext e;
		public Token ID;
		public Token FLOAT;
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
		public TerminalNode FLOAT() { return getToken(ProgramParser.FLOAT, 0); }
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
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(236);
				match(PARO);
				setState(237);
				((ExprIContext)_localctx).e = exprI(0);
				setState(238);
				match(PARC);
				 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).e.i;
				}
				break;
			case 3:
				{
				setState(241);
				match(T__17);
				setState(242);
				match(PARO);
				setState(243);
				((ExprIContext)_localctx).e = exprI(0);
				setState(244);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.sqrt(((ExprIContext)_localctx).e.i);
				}
				break;
			case 4:
				{
				setState(247);
				match(T__18);
				setState(248);
				match(PARO);
				setState(249);
				((ExprIContext)_localctx).e = exprI(0);
				setState(250);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.cos(((ExprIContext)_localctx).e.i);
				}
				break;
			case 5:
				{
				setState(253);
				match(T__19);
				setState(254);
				match(PARO);
				setState(255);
				((ExprIContext)_localctx).e = exprI(0);
				setState(256);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.sin(((ExprIContext)_localctx).e.i);
				}
				break;
			case 6:
				{
				setState(259);
				match(T__20);
				setState(260);
				match(PARO);
				setState(261);
				((ExprIContext)_localctx).e = exprI(0);
				setState(262);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.log(((ExprIContext)_localctx).e.i);
				}
				break;
			case 7:
				{
				setState(265);
				match(T__21);
				setState(266);
				match(PARO);
				setState(267);
				((ExprIContext)_localctx).e = exprI(0);
				setState(268);
				match(T__16);
				setState(269);
				((ExprIContext)_localctx).el = exprI(0);
				setState(270);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.pow(((ExprIContext)_localctx).e.i, ((ExprIContext)_localctx).el.i);
				}
				break;
			case 8:
				{
				setState(273);
				((ExprIContext)_localctx).ID = match(ID);
				 ((ExprIContext)_localctx).i =  Vt.get((((ExprIContext)_localctx).ID!=null?((ExprIContext)_localctx).ID.getText():null)); 
				}
				break;
			case 9:
				{
				setState(275);
				((ExprIContext)_localctx).FLOAT = match(FLOAT);
				((ExprIContext)_localctx).i =  Double.parseDouble((((ExprIContext)_localctx).FLOAT!=null?((ExprIContext)_localctx).FLOAT.getText():null));
				}
				break;
			case 10:
				{
				setState(277);
				((ExprIContext)_localctx).INT = match(INT);
				((ExprIContext)_localctx).i =  Double.parseDouble((((ExprIContext)_localctx).INT!=null?((ExprIContext)_localctx).INT.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(281);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(282);
						match(T__22);
						setState(283);
						((ExprIContext)_localctx).er = exprI(8);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i / ((ExprIContext)_localctx).er.i; 
						}
						break;
					case 2:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(286);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(287);
						match(T__23);
						setState(288);
						((ExprIContext)_localctx).er = exprI(7);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i * ((ExprIContext)_localctx).er.i; 
						}
						break;
					case 3:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(291);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(292);
						match(T__14);
						setState(293);
						((ExprIContext)_localctx).er = exprI(6);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i + ((ExprIContext)_localctx).er.i; 
						}
						break;
					case 4:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(296);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(297);
						match(T__24);
						setState(298);
						((ExprIContext)_localctx).er = exprI(5);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i - ((ExprIContext)_localctx).er.i; 
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARO:
				{
				setState(307);
				match(PARO);
				setState(308);
				expr(0);
				setState(309);
				match(PARC);
				}
				break;
			case ID:
				{
				setState(311);
				match(ID);
				}
				break;
			case INT:
				{
				setState(312);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(316);
						match(T__23);
						setState(317);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(319);
						match(T__14);
						setState(320);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(322);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			return exprW_sempred((ExprWContext)_localctx, predIndex);
		case 15:
			return exprR_sempred((ExprRContext)_localctx, predIndex);
		case 17:
			return exprI_sempred((ExprIContext)_localctx, predIndex);
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprW_sempred(ExprWContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprR_sempred(ExprRContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprI_sempred(ExprIContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u008b\n\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3"+
		"\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00cf\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d6"+
		"\n\20\f\20\16\20\u00d9\13\20\3\21\3\21\3\21\3\21\5\21\u00df\n\21\3\21"+
		"\3\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7\13\21\3\22\3\22\3\22\5\22"+
		"\u00ec\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u011a\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u0130\n\23\f\23\16\23\u0133\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u013c\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0146\n"+
		"\24\f\24\16\24\u0149\13\24\3\24\2\6\36 $&\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\5\3\2\7\n\4\2\7\7\t\t\4\2\b\b\n\n\2\u0169\2(\3\2\2"+
		"\2\4\67\3\2\2\2\69\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fO\3\2\2\2\16Z\3\2\2"+
		"\2\20k\3\2\2\2\22~\3\2\2\2\24\u0090\3\2\2\2\26\u0095\3\2\2\2\30\u00a6"+
		"\3\2\2\2\32\u00b5\3\2\2\2\34\u00c3\3\2\2\2\36\u00ce\3\2\2\2 \u00de\3\2"+
		"\2\2\"\u00eb\3\2\2\2$\u0119\3\2\2\2&\u013b\3\2\2\2()\5\4\3\2)*\7\2\2\3"+
		"*\3\3\2\2\2+8\3\2\2\2,-\5\6\4\2-.\5\4\3\2.8\3\2\2\2/\60\7\3\2\2\60\61"+
		"\5\b\5\2\61\62\5\4\3\2\628\3\2\2\2\63\64\5\n\6\2\64\65\5\4\3\2\658\3\2"+
		"\2\2\668\5\f\7\2\67+\3\2\2\2\67,\3\2\2\2\67/\3\2\2\2\67\63\3\2\2\2\67"+
		"\66\3\2\2\28\5\3\2\2\29:\7 \2\2:;\5&\24\2;<\7\"\2\2<\7\3\2\2\2=I\3\2\2"+
		"\2>?\5\"\22\2?@\7\4\2\2@A\7#\2\2AB\7\"\2\2BC\b\5\1\2CD\5\b\5\2DI\3\2\2"+
		"\2EF\5\n\6\2FG\5\b\5\2GI\3\2\2\2H=\3\2\2\2H>\3\2\2\2HE\3\2\2\2I\t\3\2"+
		"\2\2JK\7\34\2\2KL\5&\24\2LM\7\35\2\2MN\b\6\1\2N\13\3\2\2\2OP\7\5\2\2P"+
		"Q\5\16\b\2QR\7\6\2\2R\r\3\2\2\2S[\3\2\2\2T[\5\24\13\2UV\5\n\6\2VW\5\16"+
		"\b\2W[\3\2\2\2X[\5\22\n\2Y[\5\20\t\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZX\3"+
		"\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\l\3\2\2\2]^\5\"\22\2^_\7!\2\2_`\t\2\2\2"+
		"`a\7\"\2\2ab\b\t\1\2bc\5\16\b\2cl\3\2\2\2de\5\"\22\2ef\7!\2\2fg\5$\23"+
		"\2gh\7\"\2\2hi\b\t\1\2ij\5\16\b\2jl\3\2\2\2k\\\3\2\2\2k]\3\2\2\2kd\3\2"+
		"\2\2l\21\3\2\2\2m\177\3\2\2\2no\7\13\2\2op\7\36\2\2pq\5\36\20\2qr\7\37"+
		"\2\2rs\7\"\2\2st\b\n\1\2tu\5\16\b\2u\177\3\2\2\2vw\7\f\2\2wx\7\36\2\2"+
		"xy\5 \21\2yz\7\37\2\2z{\7\"\2\2{|\b\n\1\2|}\5\16\b\2}\177\3\2\2\2~m\3"+
		"\2\2\2~n\3\2\2\2~v\3\2\2\2\177\23\3\2\2\2\u0080\u0091\3\2\2\2\u0081\u0082"+
		"\b\13\1\2\u0082\u0083\7\r\2\2\u0083\u0084\7\36\2\2\u0084\u0085\5\34\17"+
		"\2\u0085\u0086\7\37\2\2\u0086\u0087\7\16\2\2\u0087\u008a\5\26\f\2\u0088"+
		"\u0089\7\17\2\2\u0089\u008b\5\26\f\2\u008a\u0088\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\"\2\2\u008d\u008e\b\13\1\2\u008e"+
		"\u008f\5\16\b\2\u008f\u0091\3\2\2\2\u0090\u0080\3\2\2\2\u0090\u0081\3"+
		"\2\2\2\u0091\25\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0096\5\30\r\2\u0094"+
		"\u0096\5\32\16\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3"+
		"\2\2\2\u0096\27\3\2\2\2\u0097\u00a7\3\2\2\2\u0098\u0099\7\13\2\2\u0099"+
		"\u009a\7\36\2\2\u009a\u009b\5\36\20\2\u009b\u009c\7\37\2\2\u009c\u009d"+
		"\7\"\2\2\u009d\u009e\b\r\1\2\u009e\u00a7\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0"+
		"\u00a1\7\36\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\7"+
		"\"\2\2\u00a4\u00a5\b\r\1\2\u00a5\u00a7\3\2\2\2\u00a6\u0097\3\2\2\2\u00a6"+
		"\u0098\3\2\2\2\u00a6\u009f\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00b6\3\2\2"+
		"\2\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7!\2\2\u00ab\u00ac\t\2\2\2\u00ac\u00ad"+
		"\7\"\2\2\u00ad\u00ae\b\16\1\2\u00ae\u00b6\3\2\2\2\u00af\u00b0\5\"\22\2"+
		"\u00b0\u00b1\7!\2\2\u00b1\u00b2\5$\23\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4"+
		"\b\16\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00a9\3\2\2\2"+
		"\u00b5\u00af\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00c4\3\2\2\2\u00b8\u00b9"+
		"\t\3\2\2\u00b9\u00c4\b\17\1\2\u00ba\u00bb\t\4\2\2\u00bb\u00c4\b\17\1\2"+
		"\u00bc\u00bd\5$\23\2\u00bd\u00be\7\20\2\2\u00be\u00bf\5$\23\2\u00bf\u00c0"+
		"\b\17\1\2\u00c0\u00c4\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c4\b\17\1\2"+
		"\u00c3\u00b7\3\2\2\2\u00c3\u00b8\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bc"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\35\3\2\2\2\u00c5\u00cf\b\20\1\2\u00c6"+
		"\u00c7\7\22\2\2\u00c7\u00c8\5\"\22\2\u00c8\u00c9\7\22\2\2\u00c9\u00ca"+
		"\b\20\1\2\u00ca\u00cf\3\2\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd\b\20\1"+
		"\2\u00cd\u00cf\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00cb"+
		"\3\2\2\2\u00cf\u00d7\3\2\2\2\u00d0\u00d1\f\5\2\2\u00d1\u00d2\7\21\2\2"+
		"\u00d2\u00d3\5\36\20\6\u00d3\u00d4\b\20\1\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\37\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00df\b\21\1\2\u00db\u00dc"+
		"\5\"\22\2\u00dc\u00dd\b\21\1\2\u00dd\u00df\3\2\2\2\u00de\u00da\3\2\2\2"+
		"\u00de\u00db\3\2\2\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\f\4\2\2\u00e1\u00e2"+
		"\7\23\2\2\u00e2\u00e4\5 \21\5\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00e5\3"+
		"\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00ec\b\22\1\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec#\3\2\2\2\u00ed\u011a\b\23\1\2"+
		"\u00ee\u00ef\7\36\2\2\u00ef\u00f0\5$\23\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2"+
		"\b\23\1\2\u00f2\u011a\3\2\2\2\u00f3\u00f4\7\24\2\2\u00f4\u00f5\7\36\2"+
		"\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\7\37\2\2\u00f7\u00f8\b\23\1\2\u00f8"+
		"\u011a\3\2\2\2\u00f9\u00fa\7\25\2\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc\5"+
		"$\23\2\u00fc\u00fd\7\37\2\2\u00fd\u00fe\b\23\1\2\u00fe\u011a\3\2\2\2\u00ff"+
		"\u0100\7\26\2\2\u0100\u0101\7\36\2\2\u0101\u0102\5$\23\2\u0102\u0103\7"+
		"\37\2\2\u0103\u0104\b\23\1\2\u0104\u011a\3\2\2\2\u0105\u0106\7\27\2\2"+
		"\u0106\u0107\7\36\2\2\u0107\u0108\5$\23\2\u0108\u0109\7\37\2\2\u0109\u010a"+
		"\b\23\1\2\u010a\u011a\3\2\2\2\u010b\u010c\7\30\2\2\u010c\u010d\7\36\2"+
		"\2\u010d\u010e\5$\23\2\u010e\u010f\7\23\2\2\u010f\u0110\5$\23\2\u0110"+
		"\u0111\7\37\2\2\u0111\u0112\b\23\1\2\u0112\u011a\3\2\2\2\u0113\u0114\7"+
		"#\2\2\u0114\u011a\b\23\1\2\u0115\u0116\7%\2\2\u0116\u011a\b\23\1\2\u0117"+
		"\u0118\7$\2\2\u0118\u011a\b\23\1\2\u0119\u00ed\3\2\2\2\u0119\u00ee\3\2"+
		"\2\2\u0119\u00f3\3\2\2\2\u0119\u00f9\3\2\2\2\u0119\u00ff\3\2\2\2\u0119"+
		"\u0105\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0115\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u0131\3\2\2\2\u011b\u011c\f\t\2\2\u011c"+
		"\u011d\7\31\2\2\u011d\u011e\5$\23\n\u011e\u011f\b\23\1\2\u011f\u0130\3"+
		"\2\2\2\u0120\u0121\f\b\2\2\u0121\u0122\7\32\2\2\u0122\u0123\5$\23\t\u0123"+
		"\u0124\b\23\1\2\u0124\u0130\3\2\2\2\u0125\u0126\f\7\2\2\u0126\u0127\7"+
		"\21\2\2\u0127\u0128\5$\23\b\u0128\u0129\b\23\1\2\u0129\u0130\3\2\2\2\u012a"+
		"\u012b\f\6\2\2\u012b\u012c\7\33\2\2\u012c\u012d\5$\23\7\u012d\u012e\b"+
		"\23\1\2\u012e\u0130\3\2\2\2\u012f\u011b\3\2\2\2\u012f\u0120\3\2\2\2\u012f"+
		"\u0125\3\2\2\2\u012f\u012a\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132%\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135"+
		"\b\24\1\2\u0135\u0136\7\36\2\2\u0136\u0137\5&\24\2\u0137\u0138\7\37\2"+
		"\2\u0138\u013c\3\2\2\2\u0139\u013c\7#\2\2\u013a\u013c\7$\2\2\u013b\u0134"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0147\3\2\2\2\u013d"+
		"\u013e\f\7\2\2\u013e\u013f\7\32\2\2\u013f\u0146\5&\24\b\u0140\u0141\f"+
		"\6\2\2\u0141\u0142\7\21\2\2\u0142\u0146\5&\24\7\u0143\u0144\f\5\2\2\u0144"+
		"\u0146\5&\24\6\u0145\u013d\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\'\3\2\2\2\u0149\u0147\3\2\2\2\30\67HZk~\u008a\u0090\u0095\u00a6\u00b5"+
		"\u00c3\u00ce\u00d7\u00de\u00e5\u00eb\u0119\u012f\u0131\u013b\u0145\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}