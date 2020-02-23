// Generated from c:\School\PLC\Proj2\Proj2.Last\PascalGrammar.g4 by ANTLR 4.7.1

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
public class PascalGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, CO1=24, CO2=25, 
		PARO=26, PARC=27, PO=28, DD=29, SEMC=30, ID=31, INT=32, FLOAT=33, WS=34;
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_progI = 2, RULE_varDef2 = 3, 
		RULE_comment = 4, RULE_main_p = 5, RULE_sExprM = 6, RULE_varWork = 7, 
		RULE_wrT = 8, RULE_ifelse = 9, RULE_sExprI = 10, RULE_wrT2 = 11, RULE_exprR2 = 12, 
		RULE_varWork2 = 13, RULE_cond = 14, RULE_exprW = 15, RULE_exprR = 16, 
		RULE_exprS = 17, RULE_exprI = 18, RULE_expr = 19;
	public static final String[] ruleNames = {
		"start", "statements", "progI", "varDef2", "comment", "main_p", "sExprM", 
		"varWork", "wrT", "ifelse", "sExprI", "wrT2", "exprR2", "varWork2", "cond", 
		"exprW", "exprR", "exprS", "exprI", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "':'", "'begin'", "'end.'", "'true'", "'false'", "'writeln'", 
		"'readln'", "'if'", "'then'", "'else'", "'='", "'+'", "'''", "','", "'Sqrt'", 
		"'Cos'", "'Sin'", "'ln'", "'dopower'", "'/'", "'*'", "'-'", null, null, 
		"'('", "')'", "'program'", "':='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"CO1", "CO2", "PARO", "PARC", "PO", "DD", "SEMC", "ID", "INT", "FLOAT", 
		"WS"
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

	@Override
	public String getGrammarFileName() { return "PascalGrammar.g4"; }

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

	public PascalGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PascalGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
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
				varDef2();
				setState(49);
				statements();
				}
				break;
			case CO1:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				comment();
				setState(52);
				statements();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
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
		public TerminalNode PO() { return getToken(PascalGrammarParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMC() { return getToken(PascalGrammarParser.SEMC, 0); }
		public ProgIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progI; }
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

	public static class VarDef2Context extends ParserRuleContext {
		public ExprSContext exprS;
		public Token ID;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
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
	}

	public final VarDef2Context varDef2() throws RecognitionException {
		VarDef2Context _localctx = new VarDef2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDef2);
		try {
			setState(72);
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
				setState(62);
				((VarDef2Context)_localctx).exprS = exprS(0);
				setState(63);
				match(T__1);
				setState(64);
				((VarDef2Context)_localctx).ID = match(ID);
				setState(65);
				match(SEMC);

				                String ill = (((VarDef2Context)_localctx).ID!=null?((VarDef2Context)_localctx).ID.getText():null);
				                if(ill.equals("boolean"))
				                {Vb.put(((VarDef2Context)_localctx).exprS.i, truth);}
				                else
				                if(ill.equals("real") )
				                {Vt.put(((VarDef2Context)_localctx).exprS.i, count);}
				            
				setState(67);
				varDef2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				comment();
				setState(70);
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
		public TerminalNode CO1() { return getToken(PascalGrammarParser.CO1, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CO2() { return getToken(PascalGrammarParser.CO2, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(CO1);
			setState(75);
			expr(0);
			setState(76);
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

	public static class Main_pContext extends ParserRuleContext {
		public SExprMContext sExprM() {
			return getRuleContext(SExprMContext.class,0);
		}
		public Main_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_p; }
	}

	public final Main_pContext main_p() throws RecognitionException {
		Main_pContext _localctx = new Main_pContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__2);
			setState(79);
			sExprM();
			setState(80);
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
	}

	public final SExprMContext sExprM() throws RecognitionException {
		SExprMContext _localctx = new SExprMContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sExprM);
		try {
			setState(89);
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
				setState(83);
				ifelse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				comment();
				setState(85);
				sExprM();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				wrT();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
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
		public ExprSContext el;
		public ExprSContext e2;
		public ExprIContext exprI;
		public List<ExprSContext> exprS() {
			return getRuleContexts(ExprSContext.class);
		}
		public ExprSContext exprS(int i) {
			return getRuleContext(ExprSContext.class,i);
		}
		public TerminalNode DD() { return getToken(PascalGrammarParser.DD, 0); }
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
	}

	public final VarWorkContext varWork() throws RecognitionException {
		VarWorkContext _localctx = new VarWorkContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varWork);
		int _la;
		try {
			setState(113);
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
				setState(92);
				((VarWorkContext)_localctx).exprS = exprS(0);
				setState(93);
				match(DD);
				setState(94);
				((VarWorkContext)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
					((VarWorkContext)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				match(SEMC);
				  
				        String e2 = (((VarWorkContext)_localctx).e!=null?((VarWorkContext)_localctx).e.getText():null);
				        if(e2.equals("true"))
				        {
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, true);
				        }
				        if(e2.equals("false"))
				        {
				            Vb.replace(((VarWorkContext)_localctx).exprS.i, false);
				        }
				        
				setState(97);
				sExprM();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				((VarWorkContext)_localctx).el = exprS(0);
				setState(100);
				match(DD);
				setState(101);
				((VarWorkContext)_localctx).e2 = exprS(0);
				{
				setState(102);
				match(SEMC);
				}

				    String ill = ((VarWorkContext)_localctx).e2.i;
				        //System.out.println("happen");
				        if(Vb.get(ill))
				        {
				          //  System.out.println("happen1");
				            Vb.replace(ill, true);
				        }else
				        {
				         //   System.out.println("happen0");
				            Vb.replace(((VarWorkContext)_localctx).el.i, false);
				        }

				        
				setState(104);
				sExprM();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				((VarWorkContext)_localctx).exprS = exprS(0);
				setState(107);
				match(DD);
				setState(108);
				((VarWorkContext)_localctx).exprI = exprI(0);
				{
				setState(109);
				match(SEMC);
				}

				        Vt.replace(((VarWorkContext)_localctx).exprS.i, ((VarWorkContext)_localctx).exprI.i);
				        
				setState(111);
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
		public TerminalNode PARO() { return getToken(PascalGrammarParser.PARO, 0); }
		public ExprWContext exprW() {
			return getRuleContext(ExprWContext.class,0);
		}
		public TerminalNode PARC() { return getToken(PascalGrammarParser.PARC, 0); }
		public TerminalNode SEMC() { return getToken(PascalGrammarParser.SEMC, 0); }
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
	}

	public final WrTContext wrT() throws RecognitionException {
		WrTContext _localctx = new WrTContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_wrT);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
			case SEMC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__6);
				setState(117);
				match(PARO);
				setState(118);
				((WrTContext)_localctx).exprW = exprW(0);
				setState(119);
				match(PARC);
				setState(120);
				match(SEMC);
				System.out.println(((WrTContext)_localctx).exprW.i);
				            
				setState(122);
				sExprM();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__7);
				setState(125);
				match(PARO);
				setState(126);
				exprR(0);
				setState(127);
				match(PARC);
				setState(128);
				match(SEMC);
				setState(129);
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
		public TerminalNode PARO() { return getToken(PascalGrammarParser.PARO, 0); }
		public TerminalNode PARC() { return getToken(PascalGrammarParser.PARC, 0); }
		public List<SExprIContext> sExprI() {
			return getRuleContexts(SExprIContext.class);
		}
		public SExprIContext sExprI(int i) {
			return getRuleContext(SExprIContext.class,i);
		}
		public TerminalNode SEMC() { return getToken(PascalGrammarParser.SEMC, 0); }
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
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifelse);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
			case SEMC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__8);
				setState(135);
				match(PARO);
				setState(136);
				((IfelseContext)_localctx).e = ((IfelseContext)_localctx).cond = cond();
				setState(137);
				match(PARC);
				setState(138);
				match(T__9);
				setState(139);
				sExprI(((IfelseContext)_localctx).cond.i);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(140);
					match(T__10);
					setState(141);
					sExprI(!((IfelseContext)_localctx).cond.i);
					}
				}

				setState(144);
				match(SEMC);
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

	public static class SExprIContext extends ParserRuleContext {
		public Boolean i;
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
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
	}

	public final SExprIContext sExprI(Boolean i) throws RecognitionException {
		SExprIContext _localctx = new SExprIContext(_ctx, getState(), i);
		enterRule(_localctx, 20, RULE_sExprI);
		try {
			setState(153);
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
				ifelse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				wrT2(_localctx.i);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
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
		public ExprR2Context exprR2;
		public TerminalNode PARO() { return getToken(PascalGrammarParser.PARO, 0); }
		public ExprWContext exprW() {
			return getRuleContext(ExprWContext.class,0);
		}
		public TerminalNode PARC() { return getToken(PascalGrammarParser.PARC, 0); }
		public TerminalNode SEMC() { return getToken(PascalGrammarParser.SEMC, 0); }
		public ExprR2Context exprR2() {
			return getRuleContext(ExprR2Context.class,0);
		}
		public WrT2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WrT2Context(ParserRuleContext parent, int invokingState, Boolean a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_wrT2; }
	}

	public final WrT2Context wrT2(Boolean a) throws RecognitionException {
		WrT2Context _localctx = new WrT2Context(_ctx, getState(), a);
		enterRule(_localctx, 22, RULE_wrT2);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case SEMC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__6);
				setState(157);
				match(PARO);
				setState(158);
				((WrT2Context)_localctx).exprW = exprW(0);
				setState(159);
				match(PARC);
				setState(160);
				match(SEMC);
				  if(_localctx.a){System.out.println(((WrT2Context)_localctx).exprW.i);}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(T__7);
				setState(164);
				match(PARO);
				setState(165);
				((WrT2Context)_localctx).exprR2 = exprR2(_localctx.a);
				setState(166);
				match(PARC);
				setState(167);
				match(SEMC);
				System.out.println((((WrT2Context)_localctx).exprR2!=null?_input.getText(((WrT2Context)_localctx).exprR2.start,((WrT2Context)_localctx).exprR2.stop):null));
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

	public static class ExprR2Context extends ParserRuleContext {
		public Boolean a;
		public ExprSContext exprS;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public ExprR2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprR2Context(ParserRuleContext parent, int invokingState, Boolean a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_exprR2; }
	}

	public final ExprR2Context exprR2(Boolean a) throws RecognitionException {
		ExprR2Context _localctx = new ExprR2Context(_ctx, getState(), a);
		enterRule(_localctx, 24, RULE_exprR2);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARC:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((ExprR2Context)_localctx).exprS = exprS(0);
				if(_localctx.a){
				                String e2 = myObj.nextLine();
				                boolean isB = false;
				                boolean isT = false;
				                if(e2.equals("true"))
				                {isB = true;isT = true;}
				                if(e2.equals("false"))
				                {isB = true;isT = false; }

				                if(isB)
				                {Vb.replace(((ExprR2Context)_localctx).exprS.i, isT);}
				                else
				                {Double isD = Double.parseDouble(e2);
				                Vt.replace(((ExprR2Context)_localctx).exprS.i, isD);}
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

	public static class VarWork2Context extends ParserRuleContext {
		public Boolean a;
		public ExprSContext exprS;
		public Token e;
		public ExprIContext exprI;
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public TerminalNode DD() { return getToken(PascalGrammarParser.DD, 0); }
		public ExprIContext exprI() {
			return getRuleContext(ExprIContext.class,0);
		}
		public VarWork2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarWork2Context(ParserRuleContext parent, int invokingState, Boolean a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_varWork2; }
	}

	public final VarWork2Context varWork2(Boolean a) throws RecognitionException {
		VarWork2Context _localctx = new VarWork2Context(_ctx, getState(), a);
		enterRule(_localctx, 26, RULE_varWork2);
		int _la;
		try {
			setState(191);
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
				setState(179);
				((VarWork2Context)_localctx).exprS = exprS(0);
				setState(180);
				match(DD);
				setState(181);
				((VarWork2Context)_localctx).e = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
					((VarWork2Context)_localctx).e = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(SEMC);
				  if(_localctx.a){
				        String e2 = (((VarWork2Context)_localctx).e!=null?((VarWork2Context)_localctx).e.getText():null);
				        if(e2.equals("true"))
				        {Vb.replace(((VarWork2Context)_localctx).exprS.i, true);}
				        if(e2.equals("false"))
				        {Vb.replace(((VarWork2Context)_localctx).exprS.i, false);}
				        }
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				((VarWork2Context)_localctx).exprS = exprS(0);
				setState(186);
				match(DD);
				setState(187);
				((VarWork2Context)_localctx).exprI = exprI(0);
				{
				setState(188);
				match(SEMC);
				}
				if(_localctx.a){
				        Vt.replace(((VarWork2Context)_localctx).exprS.i, ((VarWork2Context)_localctx).exprI.i);
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
		public ExprSContext e;
		public ExprSContext l;
		public Token ID;
		public List<ExprSContext> exprS() {
			return getRuleContexts(ExprSContext.class);
		}
		public ExprSContext exprS(int i) {
			return getRuleContext(ExprSContext.class,i);
		}
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cond);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				((CondContext)_localctx).e = exprS(0);
				setState(195);
				match(T__11);
				setState(196);
				((CondContext)_localctx).l = exprS(0);

				        //System.out.println("happen");
				        
				        if(Vb.get(((CondContext)_localctx).e.i) == Vb.get(((CondContext)_localctx).l.i))
				                {//System.out.println("happen2");
				                    ((CondContext)_localctx).i =  true;}
				                else
				                {//System.out.println("happen3");
				                    ((CondContext)_localctx).i =  false;};
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(T__4);
				((CondContext)_localctx).i = true;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(T__5);
				((CondContext)_localctx).i = false;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				((CondContext)_localctx).ID = match(ID);

				        if(Vb.get((((CondContext)_localctx).ID!=null?((CondContext)_localctx).ID.getText():null)) != null){
				        ((CondContext)_localctx).i =  Vb.get((((CondContext)_localctx).ID!=null?((CondContext)_localctx).ID.getText():null));
				        if(_localctx.i)
				        {((CondContext)_localctx).i =  true;}
				                else
				                {((CondContext)_localctx).i =  false;};
				    }
				    else
				    {
				        Double ill = Vt.get((((CondContext)_localctx).ID!=null?((CondContext)_localctx).ID.getText():null));
				        if(ill == 0)
				        {((CondContext)_localctx).i =  true;}
				                else
				                if(ill ==1)
				                {((CondContext)_localctx).i =  false;};
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
	}

	public final ExprWContext exprW() throws RecognitionException {
		return exprW(0);
	}

	private ExprWContext exprW(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprWContext _localctx = new ExprWContext(_ctx, _parentState);
		ExprWContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exprW, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(208);
				match(T__13);
				setState(209);
				((ExprWContext)_localctx).exprS = exprS(0);
				setState(210);
				match(T__13);
				((ExprWContext)_localctx).i =  ((ExprWContext)_localctx).exprS.i;
				}
				break;
			case 3:
				{
				setState(213);
				((ExprWContext)_localctx).exprS = exprS(0);
				if(Vb.get(((ExprWContext)_localctx).exprS.i)!=null)
				        {if(Vb.get(((ExprWContext)_localctx).exprS.i)==true)
				        {
				            ((ExprWContext)_localctx).i =  "true";
				        }
				        else
				        {
				            ((ExprWContext)_localctx).i =  "false";
				        }}
				        else
				        {
				            ((ExprWContext)_localctx).i =  Double.toString(Vt.get(((ExprWContext)_localctx).exprS.i));
				        }
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					setState(218);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(219);
					match(T__12);
					setState(220);
					((ExprWContext)_localctx).el = exprW(4);
					((ExprWContext)_localctx).i = ((ExprWContext)_localctx).e.i; _localctx.i+=" "; _localctx.i+=((ExprWContext)_localctx).el.i;
					}
					} 
				}
				setState(227);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(229);
				((ExprRContext)_localctx).exprS = exprS(0);

				                String e2 = myObj.nextLine();
				                boolean isB = false;
				                boolean isT = false;
				                if(e2.equals("true"))
				                {isB = true;isT = true;}
				                if(e2.equals("false"))
				                {isB = true;isT = false; }

				                if(isB)
				                {Vb.replace(((ExprRContext)_localctx).exprS.i, isT);}
				                else
				                {Double isD = Double.parseDouble(e2);
				                Vt.replace(((ExprRContext)_localctx).exprS.i, isD);}
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprRContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprR);
					setState(234);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(235);
					match(T__14);
					setState(236);
					exprR(3);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public ExprSContext e;
		public Token ID;
		public ExprSContext el;
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public List<ExprSContext> exprS() {
			return getRuleContexts(ExprSContext.class);
		}
		public ExprSContext exprS(int i) {
			return getRuleContext(ExprSContext.class,i);
		}
		public ExprSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprS; }
	}

	public final ExprSContext exprS() throws RecognitionException {
		return exprS(0);
	}

	private ExprSContext exprS(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprSContext _localctx = new ExprSContext(_ctx, _parentState);
		ExprSContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exprS, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			((ExprSContext)_localctx).ID = match(ID);
			((ExprSContext)_localctx).i =  (((ExprSContext)_localctx).ID!=null?((ExprSContext)_localctx).ID.getText():null);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprSContext(_parentctx, _parentState);
					_localctx.e = _prevctx;
					_localctx.e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exprS);
					setState(246);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(247);
					((ExprSContext)_localctx).el = exprS(3);
					((ExprSContext)_localctx).i =  ""; _localctx.i +=((ExprSContext)_localctx).e.i; _localctx.i +=" "; _localctx.i += ((ExprSContext)_localctx).el.i;
					}
					} 
				}
				setState(254);
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

	public static class ExprIContext extends ParserRuleContext {
		public Double i;
		public ExprIContext el;
		public ExprIContext e;
		public Token ID;
		public Token FLOAT;
		public Token INT;
		public ExprIContext er;
		public TerminalNode PARO() { return getToken(PascalGrammarParser.PARO, 0); }
		public TerminalNode PARC() { return getToken(PascalGrammarParser.PARC, 0); }
		public List<ExprIContext> exprI() {
			return getRuleContexts(ExprIContext.class);
		}
		public ExprIContext exprI(int i) {
			return getRuleContext(ExprIContext.class,i);
		}
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(PascalGrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(PascalGrammarParser.INT, 0); }
		public ExprIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprI; }
	}

	public final ExprIContext exprI() throws RecognitionException {
		return exprI(0);
	}

	private ExprIContext exprI(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprIContext _localctx = new ExprIContext(_ctx, _parentState);
		ExprIContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exprI, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(256);
				match(PARO);
				setState(257);
				((ExprIContext)_localctx).e = exprI(0);
				setState(258);
				match(PARC);
				 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).e.i;
				}
				break;
			case 3:
				{
				setState(261);
				match(T__15);
				setState(262);
				match(PARO);
				setState(263);
				((ExprIContext)_localctx).e = exprI(0);
				setState(264);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.sqrt(((ExprIContext)_localctx).e.i);
				}
				break;
			case 4:
				{
				setState(267);
				match(T__16);
				setState(268);
				match(PARO);
				setState(269);
				((ExprIContext)_localctx).e = exprI(0);
				setState(270);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.cos(((ExprIContext)_localctx).e.i);
				}
				break;
			case 5:
				{
				setState(273);
				match(T__17);
				setState(274);
				match(PARO);
				setState(275);
				((ExprIContext)_localctx).e = exprI(0);
				setState(276);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.sin(((ExprIContext)_localctx).e.i);
				}
				break;
			case 6:
				{
				setState(279);
				match(T__18);
				setState(280);
				match(PARO);
				setState(281);
				((ExprIContext)_localctx).e = exprI(0);
				setState(282);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.log(((ExprIContext)_localctx).e.i);
				}
				break;
			case 7:
				{
				setState(285);
				match(T__19);
				setState(286);
				match(PARO);
				setState(287);
				((ExprIContext)_localctx).e = exprI(0);
				setState(288);
				match(T__14);
				setState(289);
				((ExprIContext)_localctx).el = exprI(0);
				setState(290);
				match(PARC);
				((ExprIContext)_localctx).i =  Math.pow(((ExprIContext)_localctx).e.i, ((ExprIContext)_localctx).el.i);
				}
				break;
			case 8:
				{
				setState(293);
				((ExprIContext)_localctx).ID = match(ID);
				 ((ExprIContext)_localctx).i =  Vt.get((((ExprIContext)_localctx).ID!=null?((ExprIContext)_localctx).ID.getText():null)); 
				}
				break;
			case 9:
				{
				setState(295);
				((ExprIContext)_localctx).FLOAT = match(FLOAT);
				((ExprIContext)_localctx).i =  Double.parseDouble((((ExprIContext)_localctx).FLOAT!=null?((ExprIContext)_localctx).FLOAT.getText():null));
				}
				break;
			case 10:
				{
				setState(297);
				((ExprIContext)_localctx).INT = match(INT);
				((ExprIContext)_localctx).i =  Double.parseDouble((((ExprIContext)_localctx).INT!=null?((ExprIContext)_localctx).INT.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprIContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprI);
						setState(301);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(302);
						match(T__20);
						setState(303);
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
						setState(306);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(307);
						match(T__21);
						setState(308);
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
						setState(311);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(312);
						match(T__12);
						setState(313);
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
						setState(316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(317);
						match(T__22);
						setState(318);
						((ExprIContext)_localctx).er = exprI(5);
						 ((ExprIContext)_localctx).i =  ((ExprIContext)_localctx).el.i - ((ExprIContext)_localctx).er.i; 
						}
						break;
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(PascalGrammarParser.ID, 0); }
		public TerminalNode INT() { return getToken(PascalGrammarParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARO:
				{
				setState(327);
				match(PARO);
				setState(328);
				expr(0);
				setState(329);
				match(PARC);
				}
				break;
			case ID:
				{
				setState(331);
				match(ID);
				}
				break;
			case INT:
				{
				setState(332);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(335);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(336);
					expr(4);
					}
					} 
				}
				setState(341);
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
		case 15:
			return exprW_sempred((ExprWContext)_localctx, predIndex);
		case 16:
			return exprR_sempred((ExprRContext)_localctx, predIndex);
		case 17:
			return exprS_sempred((ExprSContext)_localctx, predIndex);
		case 18:
			return exprI_sempred((ExprIContext)_localctx, predIndex);
		case 19:
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
	private boolean exprS_sempred(ExprSContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprI_sempred(ExprIContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3\13\3\13\3\13"+
		"\5\13\u0096\n\13\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16\3\16"+
		"\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00c2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00db\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2\n\21\f\21\16"+
		"\21\u00e5\13\21\3\22\3\22\3\22\3\22\5\22\u00eb\n\22\3\22\3\22\3\22\7\22"+
		"\u00f0\n\22\f\22\16\22\u00f3\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00fd\n\23\f\23\16\23\u0100\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012e\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0144\n\24\f\24\16\24\u0147\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0150\n\25\3\25\3\25\7\25\u0154"+
		"\n\25\f\25\16\25\u0157\13\25\3\25\2\7 \"$&(\26\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(\2\3\3\2\7\b\2\u0177\2*\3\2\2\2\49\3\2\2\2\6;\3\2"+
		"\2\2\bJ\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16[\3\2\2\2\20s\3\2\2\2\22\u0085"+
		"\3\2\2\2\24\u0095\3\2\2\2\26\u009b\3\2\2\2\30\u00ac\3\2\2\2\32\u00b2\3"+
		"\2\2\2\34\u00c1\3\2\2\2\36\u00cf\3\2\2\2 \u00da\3\2\2\2\"\u00ea\3\2\2"+
		"\2$\u00f4\3\2\2\2&\u012d\3\2\2\2(\u014f\3\2\2\2*+\5\4\3\2+,\7\2\2\3,\3"+
		"\3\2\2\2-:\3\2\2\2./\5\6\4\2/\60\5\4\3\2\60:\3\2\2\2\61\62\7\3\2\2\62"+
		"\63\5\b\5\2\63\64\5\4\3\2\64:\3\2\2\2\65\66\5\n\6\2\66\67\5\4\3\2\67:"+
		"\3\2\2\28:\5\f\7\29-\3\2\2\29.\3\2\2\29\61\3\2\2\29\65\3\2\2\298\3\2\2"+
		"\2:\5\3\2\2\2;<\7\36\2\2<=\5(\25\2=>\7 \2\2>\7\3\2\2\2?K\3\2\2\2@A\5$"+
		"\23\2AB\7\4\2\2BC\7!\2\2CD\7 \2\2DE\b\5\1\2EF\5\b\5\2FK\3\2\2\2GH\5\n"+
		"\6\2HI\5\b\5\2IK\3\2\2\2J?\3\2\2\2J@\3\2\2\2JG\3\2\2\2K\t\3\2\2\2LM\7"+
		"\32\2\2MN\5(\25\2NO\7\33\2\2O\13\3\2\2\2PQ\7\5\2\2QR\5\16\b\2RS\7\6\2"+
		"\2S\r\3\2\2\2T\\\3\2\2\2U\\\5\24\13\2VW\5\n\6\2WX\5\16\b\2X\\\3\2\2\2"+
		"Y\\\5\22\n\2Z\\\5\20\t\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[Y\3\2\2\2[Z\3\2"+
		"\2\2\\\17\3\2\2\2]t\3\2\2\2^_\5$\23\2_`\7\37\2\2`a\t\2\2\2ab\7 \2\2bc"+
		"\b\t\1\2cd\5\16\b\2dt\3\2\2\2ef\5$\23\2fg\7\37\2\2gh\5$\23\2hi\7 \2\2"+
		"ij\b\t\1\2jk\5\16\b\2kt\3\2\2\2lm\5$\23\2mn\7\37\2\2no\5&\24\2op\7 \2"+
		"\2pq\b\t\1\2qr\5\16\b\2rt\3\2\2\2s]\3\2\2\2s^\3\2\2\2se\3\2\2\2sl\3\2"+
		"\2\2t\21\3\2\2\2u\u0086\3\2\2\2vw\7\t\2\2wx\7\34\2\2xy\5 \21\2yz\7\35"+
		"\2\2z{\7 \2\2{|\b\n\1\2|}\5\16\b\2}\u0086\3\2\2\2~\177\7\n\2\2\177\u0080"+
		"\7\34\2\2\u0080\u0081\5\"\22\2\u0081\u0082\7\35\2\2\u0082\u0083\7 \2\2"+
		"\u0083\u0084\5\16\b\2\u0084\u0086\3\2\2\2\u0085u\3\2\2\2\u0085v\3\2\2"+
		"\2\u0085~\3\2\2\2\u0086\23\3\2\2\2\u0087\u0096\3\2\2\2\u0088\u0089\7\13"+
		"\2\2\u0089\u008a\7\34\2\2\u008a\u008b\5\36\20\2\u008b\u008c\7\35\2\2\u008c"+
		"\u008d\7\f\2\2\u008d\u0090\5\26\f\2\u008e\u008f\7\r\2\2\u008f\u0091\5"+
		"\26\f\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\7 \2\2\u0093\u0094\5\16\b\2\u0094\u0096\3\2\2\2\u0095\u0087\3\2"+
		"\2\2\u0095\u0088\3\2\2\2\u0096\25\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u009c"+
		"\5\24\13\2\u0099\u009c\5\30\r\2\u009a\u009c\5\34\17\2\u009b\u0097\3\2"+
		"\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\27\3\2\2\2\u009d\u00ad\3\2\2\2\u009e\u009f\7\t\2\2\u009f\u00a0\7\34\2"+
		"\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7\35\2\2\u00a2\u00a3\7 \2\2\u00a3\u00a4"+
		"\b\r\1\2\u00a4\u00ad\3\2\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\7\34\2\2"+
		"\u00a7\u00a8\5\32\16\2\u00a8\u00a9\7\35\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ab"+
		"\b\r\1\2\u00ab\u00ad\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac"+
		"\u00a5\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\5$\23"+
		"\2\u00b0\u00b1\b\16\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00c2\3\2\2\2\u00b5\u00b6\5$\23"+
		"\2\u00b6\u00b7\7\37\2\2\u00b7\u00b8\t\2\2\2\u00b8\u00b9\7 \2\2\u00b9\u00ba"+
		"\b\17\1\2\u00ba\u00c2\3\2\2\2\u00bb\u00bc\5$\23\2\u00bc\u00bd\7\37\2\2"+
		"\u00bd\u00be\5&\24\2\u00be\u00bf\7 \2\2\u00bf\u00c0\b\17\1\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2"+
		"\35\3\2\2\2\u00c3\u00d0\3\2\2\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\7\16\2"+
		"\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\b\20\1\2\u00c8\u00d0\3\2\2\2\u00c9"+
		"\u00ca\7\7\2\2\u00ca\u00d0\b\20\1\2\u00cb\u00cc\7\b\2\2\u00cc\u00d0\b"+
		"\20\1\2\u00cd\u00ce\7!\2\2\u00ce\u00d0\b\20\1\2\u00cf\u00c3\3\2\2\2\u00cf"+
		"\u00c4\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\37\3\2\2\2\u00d1\u00db\b\21\1\2\u00d2\u00d3\7\20\2\2\u00d3"+
		"\u00d4\5$\23\2\u00d4\u00d5\7\20\2\2\u00d5\u00d6\b\21\1\2\u00d6\u00db\3"+
		"\2\2\2\u00d7\u00d8\5$\23\2\u00d8\u00d9\b\21\1\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d1\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00e3\3\2"+
		"\2\2\u00dc\u00dd\f\5\2\2\u00dd\u00de\7\17\2\2\u00de\u00df\5 \21\6\u00df"+
		"\u00e0\b\21\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2\u00e5\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00eb\b\22\1\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\b\22\1\2"+
		"\u00e9\u00eb\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00f1"+
		"\3\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7\21\2\2\u00ee\u00f0\5\"\22\5"+
		"\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2#\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\b\23\1\2\u00f5"+
		"\u00f6\7!\2\2\u00f6\u00f7\b\23\1\2\u00f7\u00fe\3\2\2\2\u00f8\u00f9\f\4"+
		"\2\2\u00f9\u00fa\5$\23\5\u00fa\u00fb\b\23\1\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f8\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff%\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u012e\b\24\1\2\u0102\u0103"+
		"\7\34\2\2\u0103\u0104\5&\24\2\u0104\u0105\7\35\2\2\u0105\u0106\b\24\1"+
		"\2\u0106\u012e\3\2\2\2\u0107\u0108\7\22\2\2\u0108\u0109\7\34\2\2\u0109"+
		"\u010a\5&\24\2\u010a\u010b\7\35\2\2\u010b\u010c\b\24\1\2\u010c\u012e\3"+
		"\2\2\2\u010d\u010e\7\23\2\2\u010e\u010f\7\34\2\2\u010f\u0110\5&\24\2\u0110"+
		"\u0111\7\35\2\2\u0111\u0112\b\24\1\2\u0112\u012e\3\2\2\2\u0113\u0114\7"+
		"\24\2\2\u0114\u0115\7\34\2\2\u0115\u0116\5&\24\2\u0116\u0117\7\35\2\2"+
		"\u0117\u0118\b\24\1\2\u0118\u012e\3\2\2\2\u0119\u011a\7\25\2\2\u011a\u011b"+
		"\7\34\2\2\u011b\u011c\5&\24\2\u011c\u011d\7\35\2\2\u011d\u011e\b\24\1"+
		"\2\u011e\u012e\3\2\2\2\u011f\u0120\7\26\2\2\u0120\u0121\7\34\2\2\u0121"+
		"\u0122\5&\24\2\u0122\u0123\7\21\2\2\u0123\u0124\5&\24\2\u0124\u0125\7"+
		"\35\2\2\u0125\u0126\b\24\1\2\u0126\u012e\3\2\2\2\u0127\u0128\7!\2\2\u0128"+
		"\u012e\b\24\1\2\u0129\u012a\7#\2\2\u012a\u012e\b\24\1\2\u012b\u012c\7"+
		"\"\2\2\u012c\u012e\b\24\1\2\u012d\u0101\3\2\2\2\u012d\u0102\3\2\2\2\u012d"+
		"\u0107\3\2\2\2\u012d\u010d\3\2\2\2\u012d\u0113\3\2\2\2\u012d\u0119\3\2"+
		"\2\2\u012d\u011f\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u0129\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u0145\3\2\2\2\u012f\u0130\f\t\2\2\u0130\u0131\7\27"+
		"\2\2\u0131\u0132\5&\24\n\u0132\u0133\b\24\1\2\u0133\u0144\3\2\2\2\u0134"+
		"\u0135\f\b\2\2\u0135\u0136\7\30\2\2\u0136\u0137\5&\24\t\u0137\u0138\b"+
		"\24\1\2\u0138\u0144\3\2\2\2\u0139\u013a\f\7\2\2\u013a\u013b\7\17\2\2\u013b"+
		"\u013c\5&\24\b\u013c\u013d\b\24\1\2\u013d\u0144\3\2\2\2\u013e\u013f\f"+
		"\6\2\2\u013f\u0140\7\31\2\2\u0140\u0141\5&\24\7\u0141\u0142\b\24\1\2\u0142"+
		"\u0144\3\2\2\2\u0143\u012f\3\2\2\2\u0143\u0134\3\2\2\2\u0143\u0139\3\2"+
		"\2\2\u0143\u013e\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\'\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\b\25\1"+
		"\2\u0149\u014a\7\34\2\2\u014a\u014b\5(\25\2\u014b\u014c\7\35\2\2\u014c"+
		"\u0150\3\2\2\2\u014d\u0150\7!\2\2\u014e\u0150\7\"\2\2\u014f\u0148\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0155\3\2\2\2\u0151"+
		"\u0152\f\5\2\2\u0152\u0154\5(\25\6\u0153\u0151\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156)\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\309J[s\u0085\u0090\u0095\u009b\u00ac\u00b2\u00c1\u00cf\u00da"+
		"\u00e3\u00ea\u00f1\u00fe\u012d\u0143\u0145\u014f\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}