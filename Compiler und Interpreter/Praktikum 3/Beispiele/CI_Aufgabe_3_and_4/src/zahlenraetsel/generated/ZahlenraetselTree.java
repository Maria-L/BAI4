// $ANTLR 3.5 C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g 2013-07-03 18:26:12

package zahlenraetsel.generated;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class ZahlenraetselTree extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "GLEICH", "MINUS", "NUMBER", "PLUS", 
		"RAETSEL", "STAT_END", "STAT_START", "SYMBOL", "WS"
	};
	public static final int EOF=-1;
	public static final int GLEICH=4;
	public static final int MINUS=5;
	public static final int NUMBER=6;
	public static final int PLUS=7;
	public static final int RAETSEL=8;
	public static final int STAT_END=9;
	public static final int STAT_START=10;
	public static final int SYMBOL=11;
	public static final int WS=12;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ZahlenraetselTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ZahlenraetselTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ZahlenraetselTree.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g"; }


	public static class prog_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:13:1: prog : ( raetsel )+ ;
	public final ZahlenraetselTree.prog_return prog() throws RecognitionException {
		ZahlenraetselTree.prog_return retval = new ZahlenraetselTree.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope raetsel1 =null;


		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:13:5: ( ( raetsel )+ )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:13:7: ( raetsel )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:13:7: ( raetsel )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==RAETSEL) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:13:7: raetsel
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_raetsel_in_prog57);
					raetsel1=raetsel();
					state._fsp--;

					adaptor.addChild(root_0, raetsel1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class raetsel_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "raetsel"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:14:1: raetsel : ^( RAETSEL equ equ equ equ equ equ ) ;
	public final ZahlenraetselTree.raetsel_return raetsel() throws RecognitionException {
		ZahlenraetselTree.raetsel_return retval = new ZahlenraetselTree.raetsel_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree RAETSEL2=null;
		TreeRuleReturnScope equ3 =null;
		TreeRuleReturnScope equ4 =null;
		TreeRuleReturnScope equ5 =null;
		TreeRuleReturnScope equ6 =null;
		TreeRuleReturnScope equ7 =null;
		TreeRuleReturnScope equ8 =null;

		CommonTree RAETSEL2_tree=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:14:8: ( ^( RAETSEL equ equ equ equ equ equ ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:14:10: ^( RAETSEL equ equ equ equ equ equ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			RAETSEL2=(CommonTree)match(input,RAETSEL,FOLLOW_RAETSEL_in_raetsel65); 
			RAETSEL2_tree = (CommonTree)adaptor.dupNode(RAETSEL2);


			root_1 = (CommonTree)adaptor.becomeRoot(RAETSEL2_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_equ_in_raetsel67);
			equ3=equ();
			state._fsp--;

			adaptor.addChild(root_1, equ3.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_equ_in_raetsel69);
			equ4=equ();
			state._fsp--;

			adaptor.addChild(root_1, equ4.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_equ_in_raetsel71);
			equ5=equ();
			state._fsp--;

			adaptor.addChild(root_1, equ5.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_equ_in_raetsel73);
			equ6=equ();
			state._fsp--;

			adaptor.addChild(root_1, equ6.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_equ_in_raetsel75);
			equ7=equ();
			state._fsp--;

			adaptor.addChild(root_1, equ7.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_equ_in_raetsel77);
			equ8=equ();
			state._fsp--;

			adaptor.addChild(root_1, equ8.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "raetsel"


	public static class equ_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equ"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:15:1: equ : ( ^( GLEICH ^( MINUS minuend= number subtrahend= number ) differenz= number ) -> ^( GLEICH $differenz $subtrahend $minuend) | ^( GLEICH ^( PLUS ! number number ) number ) );
	public final ZahlenraetselTree.equ_return equ() throws RecognitionException {
		ZahlenraetselTree.equ_return retval = new ZahlenraetselTree.equ_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree GLEICH9=null;
		CommonTree MINUS10=null;
		CommonTree GLEICH11=null;
		CommonTree PLUS12=null;
		TreeRuleReturnScope minuend =null;
		TreeRuleReturnScope subtrahend =null;
		TreeRuleReturnScope differenz =null;
		TreeRuleReturnScope number13 =null;
		TreeRuleReturnScope number14 =null;
		TreeRuleReturnScope number15 =null;

		CommonTree GLEICH9_tree=null;
		CommonTree MINUS10_tree=null;
		CommonTree GLEICH11_tree=null;
		CommonTree PLUS12_tree=null;
		RewriteRuleNodeStream stream_GLEICH=new RewriteRuleNodeStream(adaptor,"token GLEICH");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:15:4: ( ^( GLEICH ^( MINUS minuend= number subtrahend= number ) differenz= number ) -> ^( GLEICH $differenz $subtrahend $minuend) | ^( GLEICH ^( PLUS ! number number ) number ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==GLEICH) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2==MINUS) ) {
						alt2=1;
					}
					else if ( (LA2_2==PLUS) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:16:3: ^( GLEICH ^( MINUS minuend= number subtrahend= number ) differenz= number )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GLEICH9=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_equ85); 
					 
					stream_GLEICH.add(GLEICH9);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MINUS10=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_equ88); 
					 
					stream_MINUS.add(MINUS10);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_number_in_equ92);
					minuend=number();
					state._fsp--;

					stream_number.add(minuend.getTree());
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_number_in_equ96);
					subtrahend=number();
					state._fsp--;

					stream_number.add(subtrahend.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_number_in_equ101);
					differenz=number();
					state._fsp--;

					stream_number.add(differenz.getTree());
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: differenz, minuend, subtrahend, GLEICH
					// token labels: 
					// rule labels: retval, subtrahend, differenz, minuend
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_subtrahend=new RewriteRuleSubtreeStream(adaptor,"rule subtrahend",subtrahend!=null?subtrahend.getTree():null);
					RewriteRuleSubtreeStream stream_differenz=new RewriteRuleSubtreeStream(adaptor,"rule differenz",differenz!=null?differenz.getTree():null);
					RewriteRuleSubtreeStream stream_minuend=new RewriteRuleSubtreeStream(adaptor,"rule minuend",minuend!=null?minuend.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 16:70: -> ^( GLEICH $differenz $subtrahend $minuend)
					{
						// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:16:73: ^( GLEICH $differenz $subtrahend $minuend)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_GLEICH.nextNode()
						, root_1);
						adaptor.addChild(root_1, stream_differenz.nextTree());
						adaptor.addChild(root_1, stream_subtrahend.nextTree());
						adaptor.addChild(root_1, stream_minuend.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:18:3: ^( GLEICH ^( PLUS ! number number ) number )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GLEICH11=(CommonTree)match(input,GLEICH,FOLLOW_GLEICH_in_equ122); 
					GLEICH11_tree = (CommonTree)adaptor.dupNode(GLEICH11);


					root_1 = (CommonTree)adaptor.becomeRoot(GLEICH11_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					CommonTree root_2 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					PLUS12=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_equ125); 

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_number_in_equ128);
					number13=number();
					state._fsp--;

					adaptor.addChild(root_2, number13.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_number_in_equ130);
					number14=number();
					state._fsp--;

					adaptor.addChild(root_2, number14.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_number_in_equ133);
					number15=number();
					state._fsp--;

					adaptor.addChild(root_1, number15.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equ"


	public static class number_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "number"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:19:1: number : ^( NUMBER ( SYMBOL )+ ) ;
	public final ZahlenraetselTree.number_return number() throws RecognitionException {
		ZahlenraetselTree.number_return retval = new ZahlenraetselTree.number_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree NUMBER16=null;
		CommonTree SYMBOL17=null;

		CommonTree NUMBER16_tree=null;
		CommonTree SYMBOL17_tree=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:19:8: ( ^( NUMBER ( SYMBOL )+ ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:19:9: ^( NUMBER ( SYMBOL )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			NUMBER16=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_number141); 
			NUMBER16_tree = (CommonTree)adaptor.dupNode(NUMBER16);


			root_1 = (CommonTree)adaptor.becomeRoot(NUMBER16_tree, root_1);

			match(input, Token.DOWN, null); 
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:19:18: ( SYMBOL )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==SYMBOL) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\ZahlenraetselTree.g:19:18: SYMBOL
					{
					_last = (CommonTree)input.LT(1);
					SYMBOL17=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_number143); 
					SYMBOL17_tree = (CommonTree)adaptor.dupNode(SYMBOL17);


					adaptor.addChild(root_1, SYMBOL17_tree);

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"

	// Delegated rules



	public static final BitSet FOLLOW_raetsel_in_prog57 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_RAETSEL_in_raetsel65 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_equ_in_raetsel67 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_equ_in_raetsel69 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_equ_in_raetsel71 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_equ_in_raetsel73 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_equ_in_raetsel75 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_equ_in_raetsel77 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GLEICH_in_equ85 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_equ88 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_number_in_equ92 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_equ96 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_number_in_equ101 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GLEICH_in_equ122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_equ125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_number_in_equ128 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_number_in_equ130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_number_in_equ133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_number141 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SYMBOL_in_number143 = new BitSet(new long[]{0x0000000000000808L});
}
