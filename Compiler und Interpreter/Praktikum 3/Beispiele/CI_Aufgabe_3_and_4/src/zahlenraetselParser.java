// $ANTLR 3.5 C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g 2013-07-03 18:26:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class zahlenraetselParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "GLEICH", "NEWLINE", "OPERATOR", 
		"STAT_END", "STAT_START", "WS", "ZIFFERNBLOCK"
	};
	public static final int EOF=-1;
	public static final int GLEICH=4;
	public static final int NEWLINE=5;
	public static final int OPERATOR=6;
	public static final int STAT_END=7;
	public static final int STAT_START=8;
	public static final int WS=9;
	public static final int ZIFFERNBLOCK=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public zahlenraetselParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public zahlenraetselParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return zahlenraetselParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:6:1: prog : ( stat )+ ;
	public final zahlenraetselParser.prog_return prog() throws RecognitionException {
		zahlenraetselParser.prog_return retval = new zahlenraetselParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stat1 =null;


		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:6:5: ( ( stat )+ )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:6:7: ( stat )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:6:7: ( stat )+
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
					// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:6:7: stat
					{
					pushFollow(FOLLOW_stat_in_prog30);
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

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:7:1: stat : STAT_START row ops row eqls row STAT_END ;
	public final zahlenraetselParser.stat_return stat() throws RecognitionException {
		zahlenraetselParser.stat_return retval = new zahlenraetselParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STAT_START2=null;
		Token STAT_END8=null;
		ParserRuleReturnScope row3 =null;
		ParserRuleReturnScope ops4 =null;
		ParserRuleReturnScope row5 =null;
		ParserRuleReturnScope eqls6 =null;
		ParserRuleReturnScope row7 =null;

		Object STAT_START2_tree=null;
		Object STAT_END8_tree=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:7:5: ( STAT_START row ops row eqls row STAT_END )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:7:7: STAT_START row ops row eqls row STAT_END
			{
			root_0 = (Object)adaptor.nil();


			STAT_START2=(Token)match(input,STAT_START,FOLLOW_STAT_START_in_stat37); 
			STAT_START2_tree = (Object)adaptor.create(STAT_START2);
			adaptor.addChild(root_0, STAT_START2_tree);

			pushFollow(FOLLOW_row_in_stat39);
			row3=row();
			state._fsp--;

			adaptor.addChild(root_0, row3.getTree());

			pushFollow(FOLLOW_ops_in_stat41);
			ops4=ops();
			state._fsp--;

			adaptor.addChild(root_0, ops4.getTree());

			pushFollow(FOLLOW_row_in_stat43);
			row5=row();
			state._fsp--;

			adaptor.addChild(root_0, row5.getTree());

			pushFollow(FOLLOW_eqls_in_stat45);
			eqls6=eqls();
			state._fsp--;

			adaptor.addChild(root_0, eqls6.getTree());

			pushFollow(FOLLOW_row_in_stat47);
			row7=row();
			state._fsp--;

			adaptor.addChild(root_0, row7.getTree());

			STAT_END8=(Token)match(input,STAT_END,FOLLOW_STAT_END_in_stat49); 
			STAT_END8_tree = (Object)adaptor.create(STAT_END8);
			adaptor.addChild(root_0, STAT_END8_tree);

			System.out.println("Statement");
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class row_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "row"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:8:1: row : ZIFFERNBLOCK OPERATOR ZIFFERNBLOCK GLEICH ZIFFERNBLOCK ;
	public final zahlenraetselParser.row_return row() throws RecognitionException {
		zahlenraetselParser.row_return retval = new zahlenraetselParser.row_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ZIFFERNBLOCK9=null;
		Token OPERATOR10=null;
		Token ZIFFERNBLOCK11=null;
		Token GLEICH12=null;
		Token ZIFFERNBLOCK13=null;

		Object ZIFFERNBLOCK9_tree=null;
		Object OPERATOR10_tree=null;
		Object ZIFFERNBLOCK11_tree=null;
		Object GLEICH12_tree=null;
		Object ZIFFERNBLOCK13_tree=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:8:4: ( ZIFFERNBLOCK OPERATOR ZIFFERNBLOCK GLEICH ZIFFERNBLOCK )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:8:6: ZIFFERNBLOCK OPERATOR ZIFFERNBLOCK GLEICH ZIFFERNBLOCK
			{
			root_0 = (Object)adaptor.nil();


			ZIFFERNBLOCK9=(Token)match(input,ZIFFERNBLOCK,FOLLOW_ZIFFERNBLOCK_in_row57); 
			ZIFFERNBLOCK9_tree = (Object)adaptor.create(ZIFFERNBLOCK9);
			adaptor.addChild(root_0, ZIFFERNBLOCK9_tree);

			OPERATOR10=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_row59); 
			OPERATOR10_tree = (Object)adaptor.create(OPERATOR10);
			adaptor.addChild(root_0, OPERATOR10_tree);

			ZIFFERNBLOCK11=(Token)match(input,ZIFFERNBLOCK,FOLLOW_ZIFFERNBLOCK_in_row61); 
			ZIFFERNBLOCK11_tree = (Object)adaptor.create(ZIFFERNBLOCK11);
			adaptor.addChild(root_0, ZIFFERNBLOCK11_tree);

			GLEICH12=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_row63); 
			GLEICH12_tree = (Object)adaptor.create(GLEICH12);
			adaptor.addChild(root_0, GLEICH12_tree);

			ZIFFERNBLOCK13=(Token)match(input,ZIFFERNBLOCK,FOLLOW_ZIFFERNBLOCK_in_row65); 
			ZIFFERNBLOCK13_tree = (Object)adaptor.create(ZIFFERNBLOCK13);
			adaptor.addChild(root_0, ZIFFERNBLOCK13_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "row"


	public static class ops_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ops"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:9:1: ops : OPERATOR OPERATOR OPERATOR ;
	public final zahlenraetselParser.ops_return ops() throws RecognitionException {
		zahlenraetselParser.ops_return retval = new zahlenraetselParser.ops_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OPERATOR14=null;
		Token OPERATOR15=null;
		Token OPERATOR16=null;

		Object OPERATOR14_tree=null;
		Object OPERATOR15_tree=null;
		Object OPERATOR16_tree=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:9:4: ( OPERATOR OPERATOR OPERATOR )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:9:6: OPERATOR OPERATOR OPERATOR
			{
			root_0 = (Object)adaptor.nil();


			OPERATOR14=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_ops71); 
			OPERATOR14_tree = (Object)adaptor.create(OPERATOR14);
			adaptor.addChild(root_0, OPERATOR14_tree);

			OPERATOR15=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_ops73); 
			OPERATOR15_tree = (Object)adaptor.create(OPERATOR15);
			adaptor.addChild(root_0, OPERATOR15_tree);

			OPERATOR16=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_ops75); 
			OPERATOR16_tree = (Object)adaptor.create(OPERATOR16);
			adaptor.addChild(root_0, OPERATOR16_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ops"


	public static class eqls_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "eqls"
	// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:10:1: eqls : GLEICH GLEICH GLEICH ;
	public final zahlenraetselParser.eqls_return eqls() throws RecognitionException {
		zahlenraetselParser.eqls_return retval = new zahlenraetselParser.eqls_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GLEICH17=null;
		Token GLEICH18=null;
		Token GLEICH19=null;

		Object GLEICH17_tree=null;
		Object GLEICH18_tree=null;
		Object GLEICH19_tree=null;

		try {
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:10:5: ( GLEICH GLEICH GLEICH )
			// C:\\Users\\jannik\\Dropbox\\BAI-1 Lerngruppe\\B-AI4\\CI\\Aufgaben\\SS2013\\Team Sven und Jannik\\CI_Aufgabe_3_and_4\\bin\\zahlenraetsel\\zahlenraetsel.g:10:7: GLEICH GLEICH GLEICH
			{
			root_0 = (Object)adaptor.nil();


			GLEICH17=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_eqls81); 
			GLEICH17_tree = (Object)adaptor.create(GLEICH17);
			adaptor.addChild(root_0, GLEICH17_tree);

			GLEICH18=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_eqls83); 
			GLEICH18_tree = (Object)adaptor.create(GLEICH18);
			adaptor.addChild(root_0, GLEICH18_tree);

			GLEICH19=(Token)match(input,GLEICH,FOLLOW_GLEICH_in_eqls85); 
			GLEICH19_tree = (Object)adaptor.create(GLEICH19);
			adaptor.addChild(root_0, GLEICH19_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "eqls"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog30 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_STAT_START_in_stat37 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_row_in_stat39 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ops_in_stat41 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_row_in_stat43 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_eqls_in_stat45 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_row_in_stat47 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_STAT_END_in_stat49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ZIFFERNBLOCK_in_row57 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_OPERATOR_in_row59 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ZIFFERNBLOCK_in_row61 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_row63 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ZIFFERNBLOCK_in_row65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPERATOR_in_ops71 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_OPERATOR_in_ops73 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_OPERATOR_in_ops75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GLEICH_in_eqls81 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_eqls83 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_GLEICH_in_eqls85 = new BitSet(new long[]{0x0000000000000002L});
}
