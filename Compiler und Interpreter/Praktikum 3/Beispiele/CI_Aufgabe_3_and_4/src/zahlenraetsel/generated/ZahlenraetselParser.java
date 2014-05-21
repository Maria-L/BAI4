// $ANTLR 3.5 C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g 2013-07-03 18:26:18

package zahlenraetsel.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ZahlenraetselParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ZahlenraetselParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ZahlenraetselParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ZahlenraetselParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:17:1: prog : ( stat )+ ;
	public final ZahlenraetselParser.prog_return prog() throws RecognitionException {
		ZahlenraetselParser.prog_return retval = new ZahlenraetselParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat1 =null;


		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:17:5: ( ( stat )+ )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:17:7: ( stat )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:17:7: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==STAT_START) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:17:7: stat
					{
					pushFollow(FOLLOW_stat_in_prog66);
					stat1=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat1.getTree());

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

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:18:1: stat : STAT_START z11= number op1= operator z12= number GLEICH z13= number op21= operator op22= operator op23= operator z31= number op3= operator z32= number GLEICH z33= number GLEICH GLEICH GLEICH z41= number op4= operator z42= number GLEICH z43= number STAT_END -> ^( RAETSEL ^( GLEICH ^( $op1 $z11 $z12) $z13) ^( GLEICH ^( $op3 $z31 $z32) $z33) ^( GLEICH ^( $op4 $z41 $z42) $z43) ^( GLEICH ^( $op21 $z11 $z31) $z41) ^( GLEICH ^( $op22 $z12 $z32) $z42) ^( GLEICH ^( $op23 $z13 $z33) $z43) ) ;
	public final ZahlenraetselParser.stat_return stat() throws RecognitionException {
		ZahlenraetselParser.stat_return retval = new ZahlenraetselParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAT_START2=null;
		Token GLEICH3=null;
		Token GLEICH4=null;
		Token GLEICH5=null;
		Token GLEICH6=null;
		Token GLEICH7=null;
		Token GLEICH8=null;
		Token STAT_END9=null;
		ParserRuleReturnScope z11 =null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope z12 =null;
		ParserRuleReturnScope z13 =null;
		ParserRuleReturnScope op21 =null;
		ParserRuleReturnScope op22 =null;
		ParserRuleReturnScope op23 =null;
		ParserRuleReturnScope z31 =null;
		ParserRuleReturnScope op3 =null;
		ParserRuleReturnScope z32 =null;
		ParserRuleReturnScope z33 =null;
		ParserRuleReturnScope z41 =null;
		ParserRuleReturnScope op4 =null;
		ParserRuleReturnScope z42 =null;
		ParserRuleReturnScope z43 =null;

		CommonTree STAT_START2_tree=null;
		CommonTree GLEICH3_tree=null;
		CommonTree GLEICH4_tree=null;
		CommonTree GLEICH5_tree=null;
		CommonTree GLEICH6_tree=null;
		CommonTree GLEICH7_tree=null;
		CommonTree GLEICH8_tree=null;
		CommonTree STAT_END9_tree=null;
		RewriteRuleTokenStream stream_GLEICH=new RewriteRuleTokenStream(adaptor,"token GLEICH");
		RewriteRuleTokenStream stream_STAT_END=new RewriteRuleTokenStream(adaptor,"token STAT_END");
		RewriteRuleTokenStream stream_STAT_START=new RewriteRuleTokenStream(adaptor,"token STAT_START");
		RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
		RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:18:5: ( STAT_START z11= number op1= operator z12= number GLEICH z13= number op21= operator op22= operator op23= operator z31= number op3= operator z32= number GLEICH z33= number GLEICH GLEICH GLEICH z41= number op4= operator z42= number GLEICH z43= number STAT_END -> ^( RAETSEL ^( GLEICH ^( $op1 $z11 $z12) $z13) ^( GLEICH ^( $op3 $z31 $z32) $z33) ^( GLEICH ^( $op4 $z41 $z42) $z43) ^( GLEICH ^( $op21 $z11 $z31) $z41) ^( GLEICH ^( $op22 $z12 $z32) $z42) ^( GLEICH ^( $op23 $z13 $z33) $z43) ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:18:7: STAT_START z11= number op1= operator z12= number GLEICH z13= number op21= operator op22= operator op23= operator z31= number op3= operator z32= number GLEICH z33= number GLEICH GLEICH GLEICH z41= number op4= operator z42= number GLEICH z43= number STAT_END
			{
			STAT_START2=(Token)match(input,STAT_START,FOLLOW_STAT_START_in_stat73);  
			stream_STAT_START.add(STAT_START2);

			pushFollow(FOLLOW_number_in_stat77);
			z11=number();
			state._fsp--;

			stream_number.add(z11.getTree());
			pushFollow(FOLLOW_operator_in_stat81);
			op1=operator();
			state._fsp--;

			stream_operator.add(op1.getTree());
			pushFollow(FOLLOW_number_in_stat85);
			z12=number();
			state._fsp--;

			stream_number.add(z12.getTree());
			GLEICH3=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_stat87);  
			stream_GLEICH.add(GLEICH3);

			pushFollow(FOLLOW_number_in_stat91);
			z13=number();
			state._fsp--;

			stream_number.add(z13.getTree());
			pushFollow(FOLLOW_operator_in_stat114);
			op21=operator();
			state._fsp--;

			stream_operator.add(op21.getTree());
			pushFollow(FOLLOW_operator_in_stat119);
			op22=operator();
			state._fsp--;

			stream_operator.add(op22.getTree());
			pushFollow(FOLLOW_operator_in_stat124);
			op23=operator();
			state._fsp--;

			stream_operator.add(op23.getTree());
			pushFollow(FOLLOW_number_in_stat145);
			z31=number();
			state._fsp--;

			stream_number.add(z31.getTree());
			pushFollow(FOLLOW_operator_in_stat149);
			op3=operator();
			state._fsp--;

			stream_operator.add(op3.getTree());
			pushFollow(FOLLOW_number_in_stat153);
			z32=number();
			state._fsp--;

			stream_number.add(z32.getTree());
			GLEICH4=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_stat155);  
			stream_GLEICH.add(GLEICH4);

			pushFollow(FOLLOW_number_in_stat159);
			z33=number();
			state._fsp--;

			stream_number.add(z33.getTree());
			GLEICH5=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_stat178);  
			stream_GLEICH.add(GLEICH5);

			GLEICH6=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_stat180);  
			stream_GLEICH.add(GLEICH6);

			GLEICH7=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_stat182);  
			stream_GLEICH.add(GLEICH7);

			pushFollow(FOLLOW_number_in_stat203);
			z41=number();
			state._fsp--;

			stream_number.add(z41.getTree());
			pushFollow(FOLLOW_operator_in_stat207);
			op4=operator();
			state._fsp--;

			stream_operator.add(op4.getTree());
			pushFollow(FOLLOW_number_in_stat211);
			z42=number();
			state._fsp--;

			stream_number.add(z42.getTree());
			GLEICH8=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_stat213);  
			stream_GLEICH.add(GLEICH8);

			pushFollow(FOLLOW_number_in_stat217);
			z43=number();
			state._fsp--;

			stream_number.add(z43.getTree());
			STAT_END9=(Token)match(input,STAT_END,FOLLOW_STAT_END_in_stat225);  
			stream_STAT_END.add(STAT_END9);

			// AST REWRITE
			// elements: op3, op4, z42, z31, z13, GLEICH, op23, z12, GLEICH, z41, z11, z13, z33, GLEICH, GLEICH, z11, z32, z32, z43, z43, op1, op21, op22, GLEICH, GLEICH, z41, z42, z12, z33, z31
			// token labels: 
			// rule labels: z32, z31, z13, retval, z43, z42, z33, z12, z11, z41, op22, op1, op21, op3, op4, op23
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_z32=new RewriteRuleSubtreeStream(adaptor,"rule z32",z32!=null?z32.getTree():null);
			RewriteRuleSubtreeStream stream_z31=new RewriteRuleSubtreeStream(adaptor,"rule z31",z31!=null?z31.getTree():null);
			RewriteRuleSubtreeStream stream_z13=new RewriteRuleSubtreeStream(adaptor,"rule z13",z13!=null?z13.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_z43=new RewriteRuleSubtreeStream(adaptor,"rule z43",z43!=null?z43.getTree():null);
			RewriteRuleSubtreeStream stream_z42=new RewriteRuleSubtreeStream(adaptor,"rule z42",z42!=null?z42.getTree():null);
			RewriteRuleSubtreeStream stream_z33=new RewriteRuleSubtreeStream(adaptor,"rule z33",z33!=null?z33.getTree():null);
			RewriteRuleSubtreeStream stream_z12=new RewriteRuleSubtreeStream(adaptor,"rule z12",z12!=null?z12.getTree():null);
			RewriteRuleSubtreeStream stream_z11=new RewriteRuleSubtreeStream(adaptor,"rule z11",z11!=null?z11.getTree():null);
			RewriteRuleSubtreeStream stream_z41=new RewriteRuleSubtreeStream(adaptor,"rule z41",z41!=null?z41.getTree():null);
			RewriteRuleSubtreeStream stream_op22=new RewriteRuleSubtreeStream(adaptor,"rule op22",op22!=null?op22.getTree():null);
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_op21=new RewriteRuleSubtreeStream(adaptor,"rule op21",op21!=null?op21.getTree():null);
			RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.getTree():null);
			RewriteRuleSubtreeStream stream_op4=new RewriteRuleSubtreeStream(adaptor,"rule op4",op4!=null?op4.getTree():null);
			RewriteRuleSubtreeStream stream_op23=new RewriteRuleSubtreeStream(adaptor,"rule op23",op23!=null?op23.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 23:16: -> ^( RAETSEL ^( GLEICH ^( $op1 $z11 $z12) $z13) ^( GLEICH ^( $op3 $z31 $z32) $z33) ^( GLEICH ^( $op4 $z41 $z42) $z43) ^( GLEICH ^( $op21 $z11 $z31) $z41) ^( GLEICH ^( $op22 $z12 $z32) $z42) ^( GLEICH ^( $op23 $z13 $z33) $z43) )
			{
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:23:19: ^( RAETSEL ^( GLEICH ^( $op1 $z11 $z12) $z13) ^( GLEICH ^( $op3 $z31 $z32) $z33) ^( GLEICH ^( $op4 $z41 $z42) $z43) ^( GLEICH ^( $op21 $z11 $z31) $z41) ^( GLEICH ^( $op22 $z12 $z32) $z42) ^( GLEICH ^( $op23 $z13 $z33) $z43) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RAETSEL, "RAETSEL"), root_1);
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:24:23: ^( GLEICH ^( $op1 $z11 $z12) $z13)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_GLEICH.nextNode(), root_2);
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:24:32: ^( $op1 $z11 $z12)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_op1.nextNode(), root_3);
				adaptor.addChild(root_3, stream_z11.nextTree());
				adaptor.addChild(root_3, stream_z12.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_2, stream_z13.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:25:23: ^( GLEICH ^( $op3 $z31 $z32) $z33)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_GLEICH.nextNode(), root_2);
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:25:32: ^( $op3 $z31 $z32)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_op3.nextNode(), root_3);
				adaptor.addChild(root_3, stream_z31.nextTree());
				adaptor.addChild(root_3, stream_z32.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_2, stream_z33.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:26:23: ^( GLEICH ^( $op4 $z41 $z42) $z43)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_GLEICH.nextNode(), root_2);
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:26:32: ^( $op4 $z41 $z42)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_op4.nextNode(), root_3);
				adaptor.addChild(root_3, stream_z41.nextTree());
				adaptor.addChild(root_3, stream_z42.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_2, stream_z43.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:27:23: ^( GLEICH ^( $op21 $z11 $z31) $z41)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_GLEICH.nextNode(), root_2);
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:27:32: ^( $op21 $z11 $z31)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_op21.nextNode(), root_3);
				adaptor.addChild(root_3, stream_z11.nextTree());
				adaptor.addChild(root_3, stream_z31.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_2, stream_z41.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:28:23: ^( GLEICH ^( $op22 $z12 $z32) $z42)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_GLEICH.nextNode(), root_2);
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:28:32: ^( $op22 $z12 $z32)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_op22.nextNode(), root_3);
				adaptor.addChild(root_3, stream_z12.nextTree());
				adaptor.addChild(root_3, stream_z32.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_2, stream_z42.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:29:23: ^( GLEICH ^( $op23 $z13 $z33) $z43)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_GLEICH.nextNode(), root_2);
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:29:32: ^( $op23 $z13 $z33)
				{
				CommonTree root_3 = (CommonTree)adaptor.nil();
				root_3 = (CommonTree)adaptor.becomeRoot(stream_op23.nextNode(), root_3);
				adaptor.addChild(root_3, stream_z13.nextTree());
				adaptor.addChild(root_3, stream_z33.nextTree());
				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_2, stream_z43.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:30:1: operator : ( MINUS | PLUS );
	public final ZahlenraetselParser.operator_return operator() throws RecognitionException {
		ZahlenraetselParser.operator_return retval = new ZahlenraetselParser.operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set10=null;

		CommonTree set10_tree=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:30:9: ( MINUS | PLUS )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set10=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set10));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operator"


	public static class number_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "number"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:36:1: number : ( SYMBOL )+ -> ^( NUMBER ( SYMBOL )+ ) ;
	public final ZahlenraetselParser.number_return number() throws RecognitionException {
		ZahlenraetselParser.number_return retval = new ZahlenraetselParser.number_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SYMBOL11=null;

		CommonTree SYMBOL11_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:36:8: ( ( SYMBOL )+ -> ^( NUMBER ( SYMBOL )+ ) )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:36:9: ( SYMBOL )+
			{
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:36:9: ( SYMBOL )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==SYMBOL) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:36:9: SYMBOL
					{
					SYMBOL11=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_number514);  
					stream_SYMBOL.add(SYMBOL11);

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// AST REWRITE
			// elements: SYMBOL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 36:17: -> ^( NUMBER ( SYMBOL )+ )
			{
				// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\src\\zahlenraetsel\\grammar\\Zahlenraetsel.g:36:20: ^( NUMBER ( SYMBOL )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUMBER, "NUMBER"), root_1);
				if ( !(stream_SYMBOL.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_SYMBOL.hasNext() ) {
					adaptor.addChild(root_1, stream_SYMBOL.nextNode());
				}
				stream_SYMBOL.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog66 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_STAT_START_in_stat73 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat77 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_operator_in_stat81 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat85 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_stat87 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat91 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_operator_in_stat114 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_operator_in_stat119 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_operator_in_stat124 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat145 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_operator_in_stat149 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat153 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_stat155 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat159 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_stat178 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_stat180 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_stat182 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat203 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_operator_in_stat207 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat211 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_stat213 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_number_in_stat217 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_STAT_END_in_stat225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_number514 = new BitSet(new long[]{0x0000000000000802L});
}
