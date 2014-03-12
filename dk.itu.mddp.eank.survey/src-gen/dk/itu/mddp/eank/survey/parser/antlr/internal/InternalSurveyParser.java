package dk.itu.mddp.eank.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.mddp.eank.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "':'", "','", "'MultipleChoice'", "'is required'", "'ask'", "'you'", "'can'", "'choose'", "'from'", "'these'", "'or'", "'free'", "'form'", "'choice'", "'conditionals'", "'Open'", "'AnswerLength'", "'required'", "'Rating'", "'{'", "'question'", "'Min'", "'Max'", "'first'", "'last'", "'RatingForks'", "'}'", "'Ranking'", "'forks'", "'choices'", "'Dichotomous'", "'yes'", "'no'", "'SumConstant'", "'Staple'", "'mid'", "'condition'", "'matcher'", "'questions'", "'-'", "'RatingFork'", "'min'", "'max'", "'RankingFork'", "'forkedquestions'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSurveyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g"; }



     	private SurveyGrammarAccess grammarAccess;
     	
        public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SurveyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_surveys_1_0= ruleSurvey ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_surveys_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:79:28: ( ( () ( (lv_surveys_1_0= ruleSurvey ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( () ( (lv_surveys_1_0= ruleSurvey ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( () ( (lv_surveys_1_0= ruleSurvey ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:2: () ( (lv_surveys_1_0= ruleSurvey ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:80:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:86:2: ( (lv_surveys_1_0= ruleSurvey ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:87:1: (lv_surveys_1_0= ruleSurvey )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:88:3: lv_surveys_1_0= ruleSurvey
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getSurveysSurveyParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_ruleModel140);
                    lv_surveys_1_0=ruleSurvey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"surveys",
                            		lv_surveys_1_0, 
                            		"Survey");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:112:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:113:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:114:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion177);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:121:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleChoice_0 = null;

        EObject this_Open_1 = null;

        EObject this_Rating_Impl_2 = null;

        EObject this_Ranking_3 = null;

        EObject this_Dichotomous_4 = null;

        EObject this_SumConstant_5 = null;

        EObject this_Staple_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:124:28: ( (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:125:1: (this_MultipleChoice_0= ruleMultipleChoice | this_Open_1= ruleOpen | this_Rating_Impl_2= ruleRating_Impl | this_Ranking_3= ruleRanking | this_Dichotomous_4= ruleDichotomous | this_SumConstant_5= ruleSumConstant | this_Staple_6= ruleStaple )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                switch ( input.LA(2) ) {
                case 39:
                    {
                    alt2=4;
                    }
                    break;
                case 42:
                    {
                    alt2=5;
                    }
                    break;
                case 46:
                    {
                    alt2=7;
                    }
                    break;
                case 45:
                    {
                    alt2=6;
                    }
                    break;
                case 30:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }

                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 42:
                {
                alt2=5;
                }
                break;
            case 45:
                {
                alt2=6;
                }
                break;
            case 46:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:126:5: this_MultipleChoice_0= ruleMultipleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_ruleQuestion234);
                    this_MultipleChoice_0=ruleMultipleChoice();

                    state._fsp--;

                     
                            current = this_MultipleChoice_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:136:5: this_Open_1= ruleOpen
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpen_in_ruleQuestion261);
                    this_Open_1=ruleOpen();

                    state._fsp--;

                     
                            current = this_Open_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:146:5: this_Rating_Impl_2= ruleRating_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRating_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_ruleQuestion288);
                    this_Rating_Impl_2=ruleRating_Impl();

                    state._fsp--;

                     
                            current = this_Rating_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:156:5: this_Ranking_3= ruleRanking
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRankingParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_ruleQuestion315);
                    this_Ranking_3=ruleRanking();

                    state._fsp--;

                     
                            current = this_Ranking_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:166:5: this_Dichotomous_4= ruleDichotomous
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getDichotomousParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_ruleQuestion342);
                    this_Dichotomous_4=ruleDichotomous();

                    state._fsp--;

                     
                            current = this_Dichotomous_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:176:5: this_SumConstant_5= ruleSumConstant
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSumConstantParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_ruleQuestion369);
                    this_SumConstant_5=ruleSumConstant();

                    state._fsp--;

                     
                            current = this_SumConstant_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:186:5: this_Staple_6= ruleStaple
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getStapleParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStaple_in_ruleQuestion396);
                    this_Staple_6=ruleStaple();

                    state._fsp--;

                     
                            current = this_Staple_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:202:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:203:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:204:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey431);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey441); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:211:1: ruleSurvey returns [EObject current=null] : ( () otherlv_1= 'Name' otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* )? ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questions_3_0 = null;

        EObject lv_questions_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:214:28: ( ( () otherlv_1= 'Name' otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:1: ( () otherlv_1= 'Name' otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:1: ( () otherlv_1= 'Name' otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:2: () otherlv_1= 'Name' otherlv_2= ':' ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:215:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:216:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSurveyAccess().getSurveyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey487); 

                	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getNameKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey499); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:229:1: ( ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||LA4_0==27||(LA4_0>=29 && LA4_0<=30)||LA4_0==39||LA4_0==42||(LA4_0>=45 && LA4_0<=46)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:229:2: ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:229:2: ( (lv_questions_3_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:230:1: (lv_questions_3_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:230:1: (lv_questions_3_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:231:3: lv_questions_3_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey521);
                    lv_questions_3_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		add(
                           			current, 
                           			"questions",
                            		lv_questions_3_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:247:2: (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:247:4: otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey534); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:251:1: ( (lv_questions_5_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:252:1: (lv_questions_5_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:252:1: (lv_questions_5_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:253:3: lv_questions_5_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleSurvey555);
                    	    lv_questions_5_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"questions",
                    	            		lv_questions_5_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:277:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:278:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:279:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString596);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:286:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:289:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:290:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:290:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:290:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString647); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:298:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString673); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMultipleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:315:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:316:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:317:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice720);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice730); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleChoice"


    // $ANTLR start "ruleMultipleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:324:1: ruleMultipleChoice returns [EObject current=null] : ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choice_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )* )? (otherlv_14= 'or' (otherlv_15= 'free' )? (otherlv_16= 'form' )? (otherlv_17= 'choice' )? ( (lv_other_18_0= ruleEString ) ) )? (otherlv_19= 'conditionals' otherlv_20= ':' ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) ) (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )* )? ) ;
    public final EObject ruleMultipleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_question_5_0 = null;

        EObject lv_choice_11_0 = null;

        EObject lv_choice_13_0 = null;

        AntlrDatatypeRuleToken lv_other_18_0 = null;

        EObject lv_MultipleChoiceForks_21_0 = null;

        EObject lv_MultipleChoiceForks_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:327:28: ( ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choice_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )* )? (otherlv_14= 'or' (otherlv_15= 'free' )? (otherlv_16= 'form' )? (otherlv_17= 'choice' )? ( (lv_other_18_0= ruleEString ) ) )? (otherlv_19= 'conditionals' otherlv_20= ':' ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) ) (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:328:1: ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choice_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )* )? (otherlv_14= 'or' (otherlv_15= 'free' )? (otherlv_16= 'form' )? (otherlv_17= 'choice' )? ( (lv_other_18_0= ruleEString ) ) )? (otherlv_19= 'conditionals' otherlv_20= ':' ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) ) (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:328:1: ( () otherlv_1= 'MultipleChoice' otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choice_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )* )? (otherlv_14= 'or' (otherlv_15= 'free' )? (otherlv_16= 'form' )? (otherlv_17= 'choice' )? ( (lv_other_18_0= ruleEString ) ) )? (otherlv_19= 'conditionals' otherlv_20= ':' ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) ) (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:328:2: () otherlv_1= 'MultipleChoice' otherlv_2= ':' (otherlv_3= 'is required' )? ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )? ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choice_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )* )? (otherlv_14= 'or' (otherlv_15= 'free' )? (otherlv_16= 'form' )? (otherlv_17= 'choice' )? ( (lv_other_18_0= ruleEString ) ) )? (otherlv_19= 'conditionals' otherlv_20= ':' ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) ) (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )* )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:328:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:329:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice776); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice788); 

                	newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:342:1: (otherlv_3= 'is required' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:342:3: otherlv_3= 'is required'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMultipleChoice801); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getIsRequiredKeyword_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:346:3: ( (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:346:4: (otherlv_4= 'ask' )? ( (lv_question_5_0= ruleEString ) )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:346:4: (otherlv_4= 'ask' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==16) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:346:6: otherlv_4= 'ask'
                            {
                            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice817); 

                                	newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceAccess().getAskKeyword_4_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:350:3: ( (lv_question_5_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:351:1: (lv_question_5_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:351:1: (lv_question_5_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:352:3: lv_question_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice840);
                    lv_question_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:368:4: ( (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choice_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=17 && LA14_0<=19)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:368:5: (otherlv_6= 'you' )? (otherlv_7= 'can' )? otherlv_8= 'choose' (otherlv_9= 'from' )? (otherlv_10= 'these' )? ( (lv_choice_11_0= ruleChoice ) ) (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )*
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:368:5: (otherlv_6= 'you' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==17) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:368:7: otherlv_6= 'you'
                            {
                            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice856); 

                                	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceAccess().getYouKeyword_5_0());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:372:3: (otherlv_7= 'can' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:372:5: otherlv_7= 'can'
                            {
                            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultipleChoice871); 

                                	newLeafNode(otherlv_7, grammarAccess.getMultipleChoiceAccess().getCanKeyword_5_1());
                                

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice885); 

                        	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceAccess().getChooseKeyword_5_2());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:380:1: (otherlv_9= 'from' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:380:3: otherlv_9= 'from'
                            {
                            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultipleChoice898); 

                                	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceAccess().getFromKeyword_5_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:384:3: (otherlv_10= 'these' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==21) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:384:5: otherlv_10= 'these'
                            {
                            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice913); 

                                	newLeafNode(otherlv_10, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_5_4());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:388:3: ( (lv_choice_11_0= ruleChoice ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:389:1: (lv_choice_11_0= ruleChoice )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:389:1: (lv_choice_11_0= ruleChoice )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:390:3: lv_choice_11_0= ruleChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_5_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice936);
                    lv_choice_11_0=ruleChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"choice",
                            		lv_choice_11_0, 
                            		"Choice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:406:2: (otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            int LA13_2 = input.LA(2);

                            if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_ID)) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:406:4: otherlv_12= ',' ( (lv_choice_13_0= ruleChoice ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice949); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_5_6_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:410:1: ( (lv_choice_13_0= ruleChoice ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:411:1: (lv_choice_13_0= ruleChoice )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:411:1: (lv_choice_13_0= ruleChoice )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:412:3: lv_choice_13_0= ruleChoice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_5_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleMultipleChoice970);
                    	    lv_choice_13_0=ruleChoice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"choice",
                    	            		lv_choice_13_0, 
                    	            		"Choice");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:428:6: (otherlv_14= 'or' (otherlv_15= 'free' )? (otherlv_16= 'form' )? (otherlv_17= 'choice' )? ( (lv_other_18_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:428:8: otherlv_14= 'or' (otherlv_15= 'free' )? (otherlv_16= 'form' )? (otherlv_17= 'choice' )? ( (lv_other_18_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultipleChoice987); 

                        	newLeafNode(otherlv_14, grammarAccess.getMultipleChoiceAccess().getOrKeyword_6_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:432:1: (otherlv_15= 'free' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:432:3: otherlv_15= 'free'
                            {
                            otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMultipleChoice1000); 

                                	newLeafNode(otherlv_15, grammarAccess.getMultipleChoiceAccess().getFreeKeyword_6_1());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:436:3: (otherlv_16= 'form' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:436:5: otherlv_16= 'form'
                            {
                            otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice1015); 

                                	newLeafNode(otherlv_16, grammarAccess.getMultipleChoiceAccess().getFormKeyword_6_2());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:440:3: (otherlv_17= 'choice' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:440:5: otherlv_17= 'choice'
                            {
                            otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice1030); 

                                	newLeafNode(otherlv_17, grammarAccess.getMultipleChoiceAccess().getChoiceKeyword_6_3());
                                

                            }
                            break;

                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:444:3: ( (lv_other_18_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:445:1: (lv_other_18_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:445:1: (lv_other_18_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:446:3: lv_other_18_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_6_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice1053);
                    lv_other_18_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"other",
                            		lv_other_18_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:462:4: (otherlv_19= 'conditionals' otherlv_20= ':' ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) ) (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:462:6: otherlv_19= 'conditionals' otherlv_20= ':' ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) ) (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )*
                    {
                    otherlv_19=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice1068); 

                        	newLeafNode(otherlv_19, grammarAccess.getMultipleChoiceAccess().getConditionalsKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice1080); 

                        	newLeafNode(otherlv_20, grammarAccess.getMultipleChoiceAccess().getColonKeyword_7_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:470:1: ( (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:471:1: (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:471:1: (lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:472:3: lv_MultipleChoiceForks_21_0= ruleMultipleChoiceFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1101);
                    lv_MultipleChoiceForks_21_0=ruleMultipleChoiceFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	        }
                           		add(
                           			current, 
                           			"MultipleChoiceForks",
                            		lv_MultipleChoiceForks_21_0, 
                            		"MultipleChoiceFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:488:2: (otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==13) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:488:4: otherlv_22= ',' ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) )
                    	    {
                    	    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice1114); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getMultipleChoiceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:492:1: ( (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:493:1: (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:493:1: (lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:494:3: lv_MultipleChoiceForks_23_0= ruleMultipleChoiceFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1135);
                    	    lv_MultipleChoiceForks_23_0=ruleMultipleChoiceFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"MultipleChoiceForks",
                    	            		lv_MultipleChoiceForks_23_0, 
                    	            		"MultipleChoiceFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleChoice"


    // $ANTLR start "entryRuleOpen"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:518:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:519:2: (iv_ruleOpen= ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:520:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen1175);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen1185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:527:1: ruleOpen returns [EObject current=null] : ( () otherlv_1= 'Open' otherlv_2= ':' (otherlv_3= 'is required' )? ( (lv_question_4_0= ruleEString ) )? (otherlv_5= 'AnswerLength' ( (lv_AnswerLength_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_question_4_0 = null;

        AntlrDatatypeRuleToken lv_AnswerLength_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:530:28: ( ( () otherlv_1= 'Open' otherlv_2= ':' (otherlv_3= 'is required' )? ( (lv_question_4_0= ruleEString ) )? (otherlv_5= 'AnswerLength' ( (lv_AnswerLength_6_0= ruleEString ) ) )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:531:1: ( () otherlv_1= 'Open' otherlv_2= ':' (otherlv_3= 'is required' )? ( (lv_question_4_0= ruleEString ) )? (otherlv_5= 'AnswerLength' ( (lv_AnswerLength_6_0= ruleEString ) ) )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:531:1: ( () otherlv_1= 'Open' otherlv_2= ':' (otherlv_3= 'is required' )? ( (lv_question_4_0= ruleEString ) )? (otherlv_5= 'AnswerLength' ( (lv_AnswerLength_6_0= ruleEString ) ) )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:531:2: () otherlv_1= 'Open' otherlv_2= ':' (otherlv_3= 'is required' )? ( (lv_question_4_0= ruleEString ) )? (otherlv_5= 'AnswerLength' ( (lv_AnswerLength_6_0= ruleEString ) ) )?
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:531:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:532:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOpenAccess().getOpenAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOpen1231); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAccess().getOpenKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpen1243); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenAccess().getColonKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:545:1: (otherlv_3= 'is required' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:545:3: otherlv_3= 'is required'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpen1256); 

                        	newLeafNode(otherlv_3, grammarAccess.getOpenAccess().getIsRequiredKeyword_3());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:549:3: ( (lv_question_4_0= ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:550:1: (lv_question_4_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:550:1: (lv_question_4_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:551:3: lv_question_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1279);
                    lv_question_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:567:3: (otherlv_5= 'AnswerLength' ( (lv_AnswerLength_6_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:567:5: otherlv_5= 'AnswerLength' ( (lv_AnswerLength_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleOpen1293); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenAccess().getAnswerLengthKeyword_5_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:571:1: ( (lv_AnswerLength_6_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:572:1: (lv_AnswerLength_6_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:572:1: (lv_AnswerLength_6_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:573:3: lv_AnswerLength_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenAccess().getAnswerLengthEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpen1314);
                    lv_AnswerLength_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenRule());
                    	        }
                           		set(
                           			current, 
                           			"AnswerLength",
                            		lv_AnswerLength_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleRating_Impl"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:597:1: entryRuleRating_Impl returns [EObject current=null] : iv_ruleRating_Impl= ruleRating_Impl EOF ;
    public final EObject entryRuleRating_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating_Impl = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:598:2: (iv_ruleRating_Impl= ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:599:2: iv_ruleRating_Impl= ruleRating_Impl EOF
            {
             newCompositeNode(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1352);
            iv_ruleRating_Impl=ruleRating_Impl();

            state._fsp--;

             current =iv_ruleRating_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl1362); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRating_Impl"


    // $ANTLR start "ruleRating_Impl"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:606:1: ruleRating_Impl returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Rating' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'RatingForks' otherlv_15= '{' ( (lv_RatingForks_16_0= ruleRatingFork ) ) (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleRating_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_question_5_0 = null;

        AntlrDatatypeRuleToken lv_Min_7_0 = null;

        AntlrDatatypeRuleToken lv_Max_9_0 = null;

        AntlrDatatypeRuleToken lv_first_11_0 = null;

        AntlrDatatypeRuleToken lv_last_13_0 = null;

        EObject lv_RatingForks_16_0 = null;

        EObject lv_RatingForks_18_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:609:28: ( ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Rating' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'RatingForks' otherlv_15= '{' ( (lv_RatingForks_16_0= ruleRatingFork ) ) (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:610:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Rating' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'RatingForks' otherlv_15= '{' ( (lv_RatingForks_16_0= ruleRatingFork ) ) (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:610:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Rating' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'RatingForks' otherlv_15= '{' ( (lv_RatingForks_16_0= ruleRatingFork ) ) (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:610:2: () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Rating' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'RatingForks' otherlv_15= '{' ( (lv_RatingForks_16_0= ruleRatingFork ) ) (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:610:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:611:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRating_ImplAccess().getRatingAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:616:2: ( (lv_required_1_0= 'required' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:617:1: (lv_required_1_0= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:617:1: (lv_required_1_0= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:618:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRating_Impl1414); 

                            newLeafNode(lv_required_1_0, grammarAccess.getRating_ImplAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRating_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRating_Impl1440); 

                	newLeafNode(otherlv_2, grammarAccess.getRating_ImplAccess().getRatingKeyword_2());
                
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating_Impl1452); 

                	newLeafNode(otherlv_3, grammarAccess.getRating_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:639:1: (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:639:3: otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRating_Impl1465); 

                        	newLeafNode(otherlv_4, grammarAccess.getRating_ImplAccess().getQuestionKeyword_4_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:643:1: ( (lv_question_5_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:644:1: (lv_question_5_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:644:1: (lv_question_5_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:645:3: lv_question_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1486);
                    lv_question_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:661:4: (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:661:6: otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating_Impl1501); 

                        	newLeafNode(otherlv_6, grammarAccess.getRating_ImplAccess().getMinKeyword_5_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:665:1: ( (lv_Min_7_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:666:1: (lv_Min_7_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:666:1: (lv_Min_7_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:667:3: lv_Min_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1522);
                    lv_Min_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:683:4: (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:683:6: otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating_Impl1537); 

                        	newLeafNode(otherlv_8, grammarAccess.getRating_ImplAccess().getMaxKeyword_6_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:687:1: ( (lv_Max_9_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:688:1: (lv_Max_9_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:688:1: (lv_Max_9_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:689:3: lv_Max_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating_Impl1558);
                    lv_Max_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:705:4: (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:705:6: otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating_Impl1573); 

                        	newLeafNode(otherlv_10, grammarAccess.getRating_ImplAccess().getFirstKeyword_7_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:709:1: ( (lv_first_11_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:710:1: (lv_first_11_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:710:1: (lv_first_11_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:711:3: lv_first_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1594);
                    lv_first_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"first",
                            		lv_first_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:727:4: (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:727:6: otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating_Impl1609); 

                        	newLeafNode(otherlv_12, grammarAccess.getRating_ImplAccess().getLastKeyword_8_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:731:1: ( (lv_last_13_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:732:1: (lv_last_13_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:732:1: (lv_last_13_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:733:3: lv_last_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating_Impl1630);
                    lv_last_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"last",
                            		lv_last_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:749:4: (otherlv_14= 'RatingForks' otherlv_15= '{' ( (lv_RatingForks_16_0= ruleRatingFork ) ) (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )* otherlv_19= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:749:6: otherlv_14= 'RatingForks' otherlv_15= '{' ( (lv_RatingForks_16_0= ruleRatingFork ) ) (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleRating_Impl1645); 

                        	newLeafNode(otherlv_14, grammarAccess.getRating_ImplAccess().getRatingForksKeyword_9_0());
                        
                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating_Impl1657); 

                        	newLeafNode(otherlv_15, grammarAccess.getRating_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:757:1: ( (lv_RatingForks_16_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:758:1: (lv_RatingForks_16_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:758:1: (lv_RatingForks_16_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:759:3: lv_RatingForks_16_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1678);
                    lv_RatingForks_16_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"RatingForks",
                            		lv_RatingForks_16_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:775:2: (otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==13) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:775:4: otherlv_17= ',' ( (lv_RatingForks_18_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRating_Impl1691); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getRating_ImplAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:779:1: ( (lv_RatingForks_18_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:780:1: (lv_RatingForks_18_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:780:1: (lv_RatingForks_18_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:781:3: lv_RatingForks_18_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleRating_Impl1712);
                    	    lv_RatingForks_18_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRating_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"RatingForks",
                    	            		lv_RatingForks_18_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1726); 

                        	newLeafNode(otherlv_19, grammarAccess.getRating_ImplAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRating_Impl1740); 

                	newLeafNode(otherlv_20, grammarAccess.getRating_ImplAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRating_Impl"


    // $ANTLR start "entryRuleRanking"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:813:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:814:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:815:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking1776);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking1786); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRanking"


    // $ANTLR start "ruleRanking"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:822:1: ruleRanking returns [EObject current=null] : ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Ranking' otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) )? (otherlv_5= 'forks' otherlv_6= '{' ( (lv_forks_7_0= ruleRankingFork ) ) (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )* otherlv_10= '}' )? otherlv_11= 'choices' otherlv_12= '{' ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleRanking() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_question_4_0 = null;

        EObject lv_forks_7_0 = null;

        EObject lv_forks_9_0 = null;

        EObject lv_choices_13_0 = null;

        EObject lv_choices_15_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:825:28: ( ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Ranking' otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) )? (otherlv_5= 'forks' otherlv_6= '{' ( (lv_forks_7_0= ruleRankingFork ) ) (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )* otherlv_10= '}' )? otherlv_11= 'choices' otherlv_12= '{' ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:826:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Ranking' otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) )? (otherlv_5= 'forks' otherlv_6= '{' ( (lv_forks_7_0= ruleRankingFork ) ) (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )* otherlv_10= '}' )? otherlv_11= 'choices' otherlv_12= '{' ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:826:1: ( ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Ranking' otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) )? (otherlv_5= 'forks' otherlv_6= '{' ( (lv_forks_7_0= ruleRankingFork ) ) (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )* otherlv_10= '}' )? otherlv_11= 'choices' otherlv_12= '{' ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* otherlv_16= '}' otherlv_17= '}' )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:826:2: ( (lv_required_0_0= 'required' ) )? otherlv_1= 'Ranking' otherlv_2= '{' (otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) )? (otherlv_5= 'forks' otherlv_6= '{' ( (lv_forks_7_0= ruleRankingFork ) ) (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )* otherlv_10= '}' )? otherlv_11= 'choices' otherlv_12= '{' ( (lv_choices_13_0= ruleChoice ) ) (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )* otherlv_16= '}' otherlv_17= '}'
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:826:2: ( (lv_required_0_0= 'required' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:827:1: (lv_required_0_0= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:827:1: (lv_required_0_0= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:828:3: lv_required_0_0= 'required'
                    {
                    lv_required_0_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleRanking1829); 

                            newLeafNode(lv_required_0_0, grammarAccess.getRankingAccess().getRequiredRequiredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRankingRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleRanking1855); 

                	newLeafNode(otherlv_1, grammarAccess.getRankingAccess().getRankingKeyword_1());
                
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRanking1867); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:849:1: (otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:849:3: otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRanking1880); 

                        	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getQuestionKeyword_3_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:853:1: ( (lv_question_4_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:854:1: (lv_question_4_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:854:1: (lv_question_4_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:855:3: lv_question_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking1901);
                    lv_question_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:871:4: (otherlv_5= 'forks' otherlv_6= '{' ( (lv_forks_7_0= ruleRankingFork ) ) (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )* otherlv_10= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:871:6: otherlv_5= 'forks' otherlv_6= '{' ( (lv_forks_7_0= ruleRankingFork ) ) (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRanking1916); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getForksKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRanking1928); 

                        	newLeafNode(otherlv_6, grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:879:1: ( (lv_forks_7_0= ruleRankingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:880:1: (lv_forks_7_0= ruleRankingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:880:1: (lv_forks_7_0= ruleRankingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:881:3: lv_forks_7_0= ruleRankingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_ruleRanking1949);
                    lv_forks_7_0=ruleRankingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"forks",
                            		lv_forks_7_0, 
                            		"RankingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:897:2: (otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==13) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:897:4: otherlv_8= ',' ( (lv_forks_9_0= ruleRankingFork ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRanking1962); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRankingAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:901:1: ( (lv_forks_9_0= ruleRankingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:902:1: (lv_forks_9_0= ruleRankingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:902:1: (lv_forks_9_0= ruleRankingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:903:3: lv_forks_9_0= ruleRankingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_ruleRanking1983);
                    	    lv_forks_9_0=ruleRankingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forks",
                    	            		lv_forks_9_0, 
                    	            		"RankingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRanking1997); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRanking2011); 

                	newLeafNode(otherlv_11, grammarAccess.getRankingAccess().getChoicesKeyword_5());
                
            otherlv_12=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRanking2023); 

                	newLeafNode(otherlv_12, grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_6());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:931:1: ( (lv_choices_13_0= ruleChoice ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:932:1: (lv_choices_13_0= ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:932:1: (lv_choices_13_0= ruleChoice )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:933:3: lv_choices_13_0= ruleChoice
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2044);
            lv_choices_13_0=ruleChoice();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	        }
                   		add(
                   			current, 
                   			"choices",
                    		lv_choices_13_0, 
                    		"Choice");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:949:2: (otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==13) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:949:4: otherlv_14= ',' ( (lv_choices_15_0= ruleChoice ) )
            	    {
            	    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRanking2057); 

            	        	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getCommaKeyword_8_0());
            	        
            	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:953:1: ( (lv_choices_15_0= ruleChoice ) )
            	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:954:1: (lv_choices_15_0= ruleChoice )
            	    {
            	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:954:1: (lv_choices_15_0= ruleChoice )
            	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:955:3: lv_choices_15_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_ruleRanking2078);
            	    lv_choices_15_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_15_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_16=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRanking2092); 

                	newLeafNode(otherlv_16, grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_17=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRanking2104); 

                	newLeafNode(otherlv_17, grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRanking"


    // $ANTLR start "entryRuleDichotomous"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:987:1: entryRuleDichotomous returns [EObject current=null] : iv_ruleDichotomous= ruleDichotomous EOF ;
    public final EObject entryRuleDichotomous() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDichotomous = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:988:2: (iv_ruleDichotomous= ruleDichotomous EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:989:2: iv_ruleDichotomous= ruleDichotomous EOF
            {
             newCompositeNode(grammarAccess.getDichotomousRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_entryRuleDichotomous2140);
            iv_ruleDichotomous=ruleDichotomous();

            state._fsp--;

             current =iv_ruleDichotomous; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomous2150); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDichotomous"


    // $ANTLR start "ruleDichotomous"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:996:1: ruleDichotomous returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Dichotomous' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'yes' otherlv_7= '{' ( (lv_yes_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? (otherlv_12= 'no' otherlv_13= '{' ( (lv_no_14_0= ruleQuestion ) ) (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleDichotomous() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_question_5_0 = null;

        EObject lv_yes_8_0 = null;

        EObject lv_yes_10_0 = null;

        EObject lv_no_14_0 = null;

        EObject lv_no_16_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:999:28: ( ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Dichotomous' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'yes' otherlv_7= '{' ( (lv_yes_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? (otherlv_12= 'no' otherlv_13= '{' ( (lv_no_14_0= ruleQuestion ) ) (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1000:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Dichotomous' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'yes' otherlv_7= '{' ( (lv_yes_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? (otherlv_12= 'no' otherlv_13= '{' ( (lv_no_14_0= ruleQuestion ) ) (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1000:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Dichotomous' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'yes' otherlv_7= '{' ( (lv_yes_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? (otherlv_12= 'no' otherlv_13= '{' ( (lv_no_14_0= ruleQuestion ) ) (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1000:2: () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Dichotomous' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'yes' otherlv_7= '{' ( (lv_yes_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )* otherlv_11= '}' )? (otherlv_12= 'no' otherlv_13= '{' ( (lv_no_14_0= ruleQuestion ) ) (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1000:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1001:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDichotomousAccess().getDichotomousAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1006:2: ( (lv_required_1_0= 'required' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1007:1: (lv_required_1_0= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1007:1: (lv_required_1_0= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1008:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDichotomous2202); 

                            newLeafNode(lv_required_1_0, grammarAccess.getDichotomousAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDichotomousRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDichotomous2228); 

                	newLeafNode(otherlv_2, grammarAccess.getDichotomousAccess().getDichotomousKeyword_2());
                
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDichotomous2240); 

                	newLeafNode(otherlv_3, grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1029:1: (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1029:3: otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDichotomous2253); 

                        	newLeafNode(otherlv_4, grammarAccess.getDichotomousAccess().getQuestionKeyword_4_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1033:1: ( (lv_question_5_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1034:1: (lv_question_5_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1034:1: (lv_question_5_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1035:3: lv_question_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getQuestionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDichotomous2274);
                    lv_question_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1051:4: (otherlv_6= 'yes' otherlv_7= '{' ( (lv_yes_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )* otherlv_11= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1051:6: otherlv_6= 'yes' otherlv_7= '{' ( (lv_yes_8_0= ruleQuestion ) ) (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDichotomous2289); 

                        	newLeafNode(otherlv_6, grammarAccess.getDichotomousAccess().getYesKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDichotomous2301); 

                        	newLeafNode(otherlv_7, grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1059:1: ( (lv_yes_8_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1060:1: (lv_yes_8_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1060:1: (lv_yes_8_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1061:3: lv_yes_8_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2322);
                    lv_yes_8_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		add(
                           			current, 
                           			"yes",
                            		lv_yes_8_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1077:2: (otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==13) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1077:4: otherlv_9= ',' ( (lv_yes_10_0= ruleQuestion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDichotomous2335); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getDichotomousAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1081:1: ( (lv_yes_10_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1082:1: (lv_yes_10_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1082:1: (lv_yes_10_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1083:3: lv_yes_10_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2356);
                    	    lv_yes_10_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"yes",
                    	            		lv_yes_10_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDichotomous2370); 

                        	newLeafNode(otherlv_11, grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1103:3: (otherlv_12= 'no' otherlv_13= '{' ( (lv_no_14_0= ruleQuestion ) ) (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )* otherlv_17= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1103:5: otherlv_12= 'no' otherlv_13= '{' ( (lv_no_14_0= ruleQuestion ) ) (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDichotomous2385); 

                        	newLeafNode(otherlv_12, grammarAccess.getDichotomousAccess().getNoKeyword_6_0());
                        
                    otherlv_13=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDichotomous2397); 

                        	newLeafNode(otherlv_13, grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1111:1: ( (lv_no_14_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1112:1: (lv_no_14_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1112:1: (lv_no_14_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1113:3: lv_no_14_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2418);
                    lv_no_14_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	        }
                           		add(
                           			current, 
                           			"no",
                            		lv_no_14_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1129:2: (otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==13) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1129:4: otherlv_15= ',' ( (lv_no_16_0= ruleQuestion ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDichotomous2431); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getDichotomousAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1133:1: ( (lv_no_16_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1134:1: (lv_no_16_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1134:1: (lv_no_16_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1135:3: lv_no_16_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleDichotomous2452);
                    	    lv_no_16_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDichotomousRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"no",
                    	            		lv_no_16_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDichotomous2466); 

                        	newLeafNode(otherlv_17, grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDichotomous2480); 

                	newLeafNode(otherlv_18, grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDichotomous"


    // $ANTLR start "entryRuleSumConstant"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1167:1: entryRuleSumConstant returns [EObject current=null] : iv_ruleSumConstant= ruleSumConstant EOF ;
    public final EObject entryRuleSumConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumConstant = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1168:2: (iv_ruleSumConstant= ruleSumConstant EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1169:2: iv_ruleSumConstant= ruleSumConstant EOF
            {
             newCompositeNode(grammarAccess.getSumConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_entryRuleSumConstant2516);
            iv_ruleSumConstant=ruleSumConstant();

            state._fsp--;

             current =iv_ruleSumConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumConstant2526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumConstant"


    // $ANTLR start "ruleSumConstant"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1176:1: ruleSumConstant returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'SumConstant' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSumConstant() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_question_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1179:28: ( ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'SumConstant' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1180:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'SumConstant' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1180:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'SumConstant' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1180:2: () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'SumConstant' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1180:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1181:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSumConstantAccess().getSumConstantAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1186:2: ( (lv_required_1_0= 'required' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1187:1: (lv_required_1_0= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1187:1: (lv_required_1_0= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1188:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSumConstant2578); 

                            newLeafNode(lv_required_1_0, grammarAccess.getSumConstantAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSumConstantRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleSumConstant2604); 

                	newLeafNode(otherlv_2, grammarAccess.getSumConstantAccess().getSumConstantKeyword_2());
                
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSumConstant2616); 

                	newLeafNode(otherlv_3, grammarAccess.getSumConstantAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1209:1: (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1209:3: otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSumConstant2629); 

                        	newLeafNode(otherlv_4, grammarAccess.getSumConstantAccess().getQuestionKeyword_4_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1213:1: ( (lv_question_5_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1214:1: (lv_question_5_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1214:1: (lv_question_5_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1215:3: lv_question_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumConstantAccess().getQuestionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSumConstant2650);
                    lv_question_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumConstantRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSumConstant2664); 

                	newLeafNode(otherlv_6, grammarAccess.getSumConstantAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumConstant"


    // $ANTLR start "entryRuleStaple"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1243:1: entryRuleStaple returns [EObject current=null] : iv_ruleStaple= ruleStaple EOF ;
    public final EObject entryRuleStaple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaple = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1244:2: (iv_ruleStaple= ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1245:2: iv_ruleStaple= ruleStaple EOF
            {
             newCompositeNode(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple2700);
            iv_ruleStaple=ruleStaple();

            state._fsp--;

             current =iv_ruleStaple; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple2710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaple"


    // $ANTLR start "ruleStaple"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1252:1: ruleStaple returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Staple' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'mid' ( (lv_mid_15_0= ruleEString ) ) )? (otherlv_16= 'RatingForks' otherlv_17= '{' ( (lv_RatingForks_18_0= ruleRatingFork ) ) (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleStaple() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_question_5_0 = null;

        AntlrDatatypeRuleToken lv_Min_7_0 = null;

        AntlrDatatypeRuleToken lv_Max_9_0 = null;

        AntlrDatatypeRuleToken lv_first_11_0 = null;

        AntlrDatatypeRuleToken lv_last_13_0 = null;

        AntlrDatatypeRuleToken lv_mid_15_0 = null;

        EObject lv_RatingForks_18_0 = null;

        EObject lv_RatingForks_20_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1255:28: ( ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Staple' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'mid' ( (lv_mid_15_0= ruleEString ) ) )? (otherlv_16= 'RatingForks' otherlv_17= '{' ( (lv_RatingForks_18_0= ruleRatingFork ) ) (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1256:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Staple' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'mid' ( (lv_mid_15_0= ruleEString ) ) )? (otherlv_16= 'RatingForks' otherlv_17= '{' ( (lv_RatingForks_18_0= ruleRatingFork ) ) (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1256:1: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Staple' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'mid' ( (lv_mid_15_0= ruleEString ) ) )? (otherlv_16= 'RatingForks' otherlv_17= '{' ( (lv_RatingForks_18_0= ruleRatingFork ) ) (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1256:2: () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Staple' otherlv_3= '{' (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )? (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )? (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )? (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )? (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )? (otherlv_14= 'mid' ( (lv_mid_15_0= ruleEString ) ) )? (otherlv_16= 'RatingForks' otherlv_17= '{' ( (lv_RatingForks_18_0= ruleRatingFork ) ) (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1256:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1257:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStapleAccess().getStapleAction_0(),
                        current);
                

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1262:2: ( (lv_required_1_0= 'required' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1263:1: (lv_required_1_0= 'required' )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1263:1: (lv_required_1_0= 'required' )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1264:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleStaple2762); 

                            newLeafNode(lv_required_1_0, grammarAccess.getStapleAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStapleRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleStaple2788); 

                	newLeafNode(otherlv_2, grammarAccess.getStapleAccess().getStapleKeyword_2());
                
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStaple2800); 

                	newLeafNode(otherlv_3, grammarAccess.getStapleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1285:1: (otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1285:3: otherlv_4= 'question' ( (lv_question_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStaple2813); 

                        	newLeafNode(otherlv_4, grammarAccess.getStapleAccess().getQuestionKeyword_4_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1289:1: ( (lv_question_5_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1290:1: (lv_question_5_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1290:1: (lv_question_5_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1291:3: lv_question_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple2834);
                    lv_question_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"question",
                            		lv_question_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1307:4: (otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==33) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1307:6: otherlv_6= 'Min' ( (lv_Min_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStaple2849); 

                        	newLeafNode(otherlv_6, grammarAccess.getStapleAccess().getMinKeyword_5_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1311:1: ( (lv_Min_7_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1312:1: (lv_Min_7_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1312:1: (lv_Min_7_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1313:3: lv_Min_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple2870);
                    lv_Min_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"Min",
                            		lv_Min_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1329:4: (otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1329:6: otherlv_8= 'Max' ( (lv_Max_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStaple2885); 

                        	newLeafNode(otherlv_8, grammarAccess.getStapleAccess().getMaxKeyword_6_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1333:1: ( (lv_Max_9_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1334:1: (lv_Max_9_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1334:1: (lv_Max_9_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1335:3: lv_Max_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStaple2906);
                    lv_Max_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"Max",
                            		lv_Max_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1351:4: (otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1351:6: otherlv_10= 'first' ( (lv_first_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStaple2921); 

                        	newLeafNode(otherlv_10, grammarAccess.getStapleAccess().getFirstKeyword_7_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1355:1: ( (lv_first_11_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1356:1: (lv_first_11_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1356:1: (lv_first_11_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1357:3: lv_first_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple2942);
                    lv_first_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"first",
                            		lv_first_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1373:4: (otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1373:6: otherlv_12= 'last' ( (lv_last_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStaple2957); 

                        	newLeafNode(otherlv_12, grammarAccess.getStapleAccess().getLastKeyword_8_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1377:1: ( (lv_last_13_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1378:1: (lv_last_13_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1378:1: (lv_last_13_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1379:3: lv_last_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple2978);
                    lv_last_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"last",
                            		lv_last_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1395:4: (otherlv_14= 'mid' ( (lv_mid_15_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1395:6: otherlv_14= 'mid' ( (lv_mid_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleStaple2993); 

                        	newLeafNode(otherlv_14, grammarAccess.getStapleAccess().getMidKeyword_9_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1399:1: ( (lv_mid_15_0= ruleEString ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1400:1: (lv_mid_15_0= ruleEString )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1400:1: (lv_mid_15_0= ruleEString )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1401:3: lv_mid_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStaple3014);
                    lv_mid_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		set(
                           			current, 
                           			"mid",
                            		lv_mid_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1417:4: (otherlv_16= 'RatingForks' otherlv_17= '{' ( (lv_RatingForks_18_0= ruleRatingFork ) ) (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )* otherlv_21= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==37) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1417:6: otherlv_16= 'RatingForks' otherlv_17= '{' ( (lv_RatingForks_18_0= ruleRatingFork ) ) (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStaple3029); 

                        	newLeafNode(otherlv_16, grammarAccess.getStapleAccess().getRatingForksKeyword_10_0());
                        
                    otherlv_17=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStaple3041); 

                        	newLeafNode(otherlv_17, grammarAccess.getStapleAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1425:1: ( (lv_RatingForks_18_0= ruleRatingFork ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1426:1: (lv_RatingForks_18_0= ruleRatingFork )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1426:1: (lv_RatingForks_18_0= ruleRatingFork )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1427:3: lv_RatingForks_18_0= ruleRatingFork
                    {
                     
                    	        newCompositeNode(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3062);
                    lv_RatingForks_18_0=ruleRatingFork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	        }
                           		add(
                           			current, 
                           			"RatingForks",
                            		lv_RatingForks_18_0, 
                            		"RatingFork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1443:2: (otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==13) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1443:4: otherlv_19= ',' ( (lv_RatingForks_20_0= ruleRatingFork ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStaple3075); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getStapleAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1447:1: ( (lv_RatingForks_20_0= ruleRatingFork ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1448:1: (lv_RatingForks_20_0= ruleRatingFork )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1448:1: (lv_RatingForks_20_0= ruleRatingFork )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1449:3: lv_RatingForks_20_0= ruleRatingFork
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_ruleStaple3096);
                    	    lv_RatingForks_20_0=ruleRatingFork();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStapleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"RatingForks",
                    	            		lv_RatingForks_20_0, 
                    	            		"RatingFork");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3110); 

                        	newLeafNode(otherlv_21, grammarAccess.getStapleAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStaple3124); 

                	newLeafNode(otherlv_22, grammarAccess.getStapleAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaple"


    // $ANTLR start "entryRuleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1481:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1482:2: (iv_ruleChoice= ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1483:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice3160);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice3170); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1490:1: ruleChoice returns [EObject current=null] : ( (lv_Description_0_0= ruleEString ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_Description_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1493:28: ( ( (lv_Description_0_0= ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1494:1: ( (lv_Description_0_0= ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1494:1: ( (lv_Description_0_0= ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1495:1: (lv_Description_0_0= ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1495:1: (lv_Description_0_0= ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1496:3: lv_Description_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoice3215);
            lv_Description_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"Description",
                    		lv_Description_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleMultipleChoiceFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1520:1: entryRuleMultipleChoiceFork returns [EObject current=null] : iv_ruleMultipleChoiceFork= ruleMultipleChoiceFork EOF ;
    public final EObject entryRuleMultipleChoiceFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoiceFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1521:2: (iv_ruleMultipleChoiceFork= ruleMultipleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1522:2: iv_ruleMultipleChoiceFork= ruleMultipleChoiceFork EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_entryRuleMultipleChoiceFork3250);
            iv_ruleMultipleChoiceFork=ruleMultipleChoiceFork();

            state._fsp--;

             current =iv_ruleMultipleChoiceFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoiceFork3260); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleChoiceFork"


    // $ANTLR start "ruleMultipleChoiceFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1529:1: ruleMultipleChoiceFork returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= 'matcher' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'questions' otherlv_4= ':' ( (lv_forkedquestions_5_0= ruleQuestion ) ) (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )* )? ) ;
    public final EObject ruleMultipleChoiceFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_forkedquestions_5_0 = null;

        EObject lv_forkedquestions_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1532:28: ( (otherlv_0= 'condition' otherlv_1= 'matcher' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'questions' otherlv_4= ':' ( (lv_forkedquestions_5_0= ruleQuestion ) ) (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )* )? ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1533:1: (otherlv_0= 'condition' otherlv_1= 'matcher' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'questions' otherlv_4= ':' ( (lv_forkedquestions_5_0= ruleQuestion ) ) (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )* )? )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1533:1: (otherlv_0= 'condition' otherlv_1= 'matcher' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'questions' otherlv_4= ':' ( (lv_forkedquestions_5_0= ruleQuestion ) ) (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )* )? )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1533:3: otherlv_0= 'condition' otherlv_1= 'matcher' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'questions' otherlv_4= ':' ( (lv_forkedquestions_5_0= ruleQuestion ) ) (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )* )?
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMultipleChoiceFork3297); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceForkAccess().getConditionKeyword_0());
                
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleMultipleChoiceFork3309); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoiceForkAccess().getMatcherKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1541:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1542:1: (otherlv_2= RULE_ID )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1542:1: (otherlv_2= RULE_ID )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1543:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceForkRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleChoiceFork3329); 

            		newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceForkAccess().getMatcherChoiceCrossReference_2_0()); 
            	

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1554:2: (otherlv_3= 'questions' otherlv_4= ':' ( (lv_forkedquestions_5_0= ruleQuestion ) ) (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1554:4: otherlv_3= 'questions' otherlv_4= ':' ( (lv_forkedquestions_5_0= ruleQuestion ) ) (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )*
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultipleChoiceFork3342); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceForkAccess().getQuestionsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoiceFork3354); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultipleChoiceForkAccess().getColonKeyword_3_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1562:1: ( (lv_forkedquestions_5_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1563:1: (lv_forkedquestions_5_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1563:1: (lv_forkedquestions_5_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1564:3: lv_forkedquestions_5_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3375);
                    lv_forkedquestions_5_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceForkRule());
                    	        }
                           		add(
                           			current, 
                           			"forkedquestions",
                            		lv_forkedquestions_5_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1580:2: (otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==13) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1580:4: otherlv_6= ',' ( (lv_forkedquestions_7_0= ruleQuestion ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoiceFork3388); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceForkAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1584:1: ( (lv_forkedquestions_7_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1585:1: (lv_forkedquestions_7_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1585:1: (lv_forkedquestions_7_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1586:3: lv_forkedquestions_7_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3409);
                    	    lv_forkedquestions_7_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceForkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forkedquestions",
                    	            		lv_forkedquestions_7_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleChoiceFork"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1610:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1611:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1612:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3450);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1619:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1622:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1623:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1623:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1623:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1623:2: (kw= '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==51) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1624:2: kw= '-'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEInt3500); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3517); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleRatingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1644:1: entryRuleRatingFork returns [EObject current=null] : iv_ruleRatingFork= ruleRatingFork EOF ;
    public final EObject entryRuleRatingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRatingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1645:2: (iv_ruleRatingFork= ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1646:2: iv_ruleRatingFork= ruleRatingFork EOF
            {
             newCompositeNode(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork3562);
            iv_ruleRatingFork=ruleRatingFork();

            state._fsp--;

             current =iv_ruleRatingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork3572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRatingFork"


    // $ANTLR start "ruleRatingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1653:1: ruleRatingFork returns [EObject current=null] : ( () otherlv_1= 'RatingFork' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'conditionals' otherlv_8= '{' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleRatingFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;

        EObject lv_forkedquestion_9_0 = null;

        EObject lv_forkedquestion_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1656:28: ( ( () otherlv_1= 'RatingFork' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'conditionals' otherlv_8= '{' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1657:1: ( () otherlv_1= 'RatingFork' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'conditionals' otherlv_8= '{' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1657:1: ( () otherlv_1= 'RatingFork' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'conditionals' otherlv_8= '{' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1657:2: () otherlv_1= 'RatingFork' otherlv_2= '{' (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )? (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )? (otherlv_7= 'conditionals' otherlv_8= '{' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1657:2: ()
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1658:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRatingForkAccess().getRatingForkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRatingFork3618); 

                	newLeafNode(otherlv_1, grammarAccess.getRatingForkAccess().getRatingForkKeyword_1());
                
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRatingFork3630); 

                	newLeafNode(otherlv_2, grammarAccess.getRatingForkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1671:1: (otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1671:3: otherlv_3= 'min' ( (lv_min_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleRatingFork3643); 

                        	newLeafNode(otherlv_3, grammarAccess.getRatingForkAccess().getMinKeyword_3_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1675:1: ( (lv_min_4_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1676:1: (lv_min_4_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1676:1: (lv_min_4_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1677:3: lv_min_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork3664);
                    lv_min_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1693:4: (otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==54) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1693:6: otherlv_5= 'max' ( (lv_max_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRatingFork3679); 

                        	newLeafNode(otherlv_5, grammarAccess.getRatingForkAccess().getMaxKeyword_4_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1697:1: ( (lv_max_6_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1698:1: (lv_max_6_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1698:1: (lv_max_6_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1699:3: lv_max_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRatingFork3700);
                    lv_max_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1715:4: (otherlv_7= 'conditionals' otherlv_8= '{' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==26) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1715:6: otherlv_7= 'conditionals' otherlv_8= '{' ( (lv_forkedquestion_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRatingFork3715); 

                        	newLeafNode(otherlv_7, grammarAccess.getRatingForkAccess().getConditionalsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRatingFork3727); 

                        	newLeafNode(otherlv_8, grammarAccess.getRatingForkAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1723:1: ( (lv_forkedquestion_9_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1724:1: (lv_forkedquestion_9_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1724:1: (lv_forkedquestion_9_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1725:3: lv_forkedquestion_9_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRatingFork3748);
                    lv_forkedquestion_9_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	        }
                           		add(
                           			current, 
                           			"forkedquestion",
                            		lv_forkedquestion_9_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1741:2: (otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==13) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1741:4: otherlv_10= ',' ( (lv_forkedquestion_11_0= ruleQuestion ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRatingFork3761); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRatingForkAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1745:1: ( (lv_forkedquestion_11_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1746:1: (lv_forkedquestion_11_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1746:1: (lv_forkedquestion_11_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1747:3: lv_forkedquestion_11_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRatingFork3782);
                    	    lv_forkedquestion_11_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRatingForkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forkedquestion",
                    	            		lv_forkedquestion_11_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRatingFork3796); 

                        	newLeafNode(otherlv_12, grammarAccess.getRatingForkAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRatingFork3810); 

                	newLeafNode(otherlv_13, grammarAccess.getRatingForkAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRatingFork"


    // $ANTLR start "entryRuleRankingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1779:1: entryRuleRankingFork returns [EObject current=null] : iv_ruleRankingFork= ruleRankingFork EOF ;
    public final EObject entryRuleRankingFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRankingFork = null;


        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1780:2: (iv_ruleRankingFork= ruleRankingFork EOF )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1781:2: iv_ruleRankingFork= ruleRankingFork EOF
            {
             newCompositeNode(grammarAccess.getRankingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_entryRuleRankingFork3846);
            iv_ruleRankingFork=ruleRankingFork();

            state._fsp--;

             current =iv_ruleRankingFork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingFork3856); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRankingFork"


    // $ANTLR start "ruleRankingFork"
    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1788:1: ruleRankingFork returns [EObject current=null] : (otherlv_0= 'RankingFork' otherlv_1= '{' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= 'matcher' ( ( ruleEString ) ) (otherlv_8= 'forkedquestions' otherlv_9= '{' ( (lv_forkedquestions_10_0= ruleQuestion ) ) (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleRankingFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_min_3_0 = null;

        AntlrDatatypeRuleToken lv_max_5_0 = null;

        EObject lv_forkedquestions_10_0 = null;

        EObject lv_forkedquestions_12_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1791:28: ( (otherlv_0= 'RankingFork' otherlv_1= '{' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= 'matcher' ( ( ruleEString ) ) (otherlv_8= 'forkedquestions' otherlv_9= '{' ( (lv_forkedquestions_10_0= ruleQuestion ) ) (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1792:1: (otherlv_0= 'RankingFork' otherlv_1= '{' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= 'matcher' ( ( ruleEString ) ) (otherlv_8= 'forkedquestions' otherlv_9= '{' ( (lv_forkedquestions_10_0= ruleQuestion ) ) (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1792:1: (otherlv_0= 'RankingFork' otherlv_1= '{' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= 'matcher' ( ( ruleEString ) ) (otherlv_8= 'forkedquestions' otherlv_9= '{' ( (lv_forkedquestions_10_0= ruleQuestion ) ) (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1792:3: otherlv_0= 'RankingFork' otherlv_1= '{' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= 'matcher' ( ( ruleEString ) ) (otherlv_8= 'forkedquestions' otherlv_9= '{' ( (lv_forkedquestions_10_0= ruleQuestion ) ) (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleRankingFork3893); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingForkAccess().getRankingForkKeyword_0());
                
            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRankingFork3905); 

                	newLeafNode(otherlv_1, grammarAccess.getRankingForkAccess().getLeftCurlyBracketKeyword_1());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1800:1: (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1800:3: otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleRankingFork3918); 

                        	newLeafNode(otherlv_2, grammarAccess.getRankingForkAccess().getMinKeyword_2_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1804:1: ( (lv_min_3_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1805:1: (lv_min_3_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1805:1: (lv_min_3_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1806:3: lv_min_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingForkAccess().getMinEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingFork3939);
                    lv_min_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1822:4: (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1822:6: otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleRankingFork3954); 

                        	newLeafNode(otherlv_4, grammarAccess.getRankingForkAccess().getMaxKeyword_3_0());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1826:1: ( (lv_max_5_0= ruleEInt ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1827:1: (lv_max_5_0= ruleEInt )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1827:1: (lv_max_5_0= ruleEInt )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1828:3: lv_max_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingForkAccess().getMaxEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRankingFork3975);
                    lv_max_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleRankingFork3989); 

                	newLeafNode(otherlv_6, grammarAccess.getRankingForkAccess().getMatcherKeyword_4());
                
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1848:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1849:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1849:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1850:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRankingForkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRankingForkAccess().getMatcherChoiceCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRankingFork4012);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1863:2: (otherlv_8= 'forkedquestions' otherlv_9= '{' ( (lv_forkedquestions_10_0= ruleQuestion ) ) (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )* otherlv_13= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==56) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1863:4: otherlv_8= 'forkedquestions' otherlv_9= '{' ( (lv_forkedquestions_10_0= ruleQuestion ) ) (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleRankingFork4025); 

                        	newLeafNode(otherlv_8, grammarAccess.getRankingForkAccess().getForkedquestionsKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRankingFork4037); 

                        	newLeafNode(otherlv_9, grammarAccess.getRankingForkAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1871:1: ( (lv_forkedquestions_10_0= ruleQuestion ) )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1872:1: (lv_forkedquestions_10_0= ruleQuestion )
                    {
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1872:1: (lv_forkedquestions_10_0= ruleQuestion )
                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1873:3: lv_forkedquestions_10_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRankingFork4058);
                    lv_forkedquestions_10_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	        }
                           		add(
                           			current, 
                           			"forkedquestions",
                            		lv_forkedquestions_10_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1889:2: (otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==13) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1889:4: otherlv_11= ',' ( (lv_forkedquestions_12_0= ruleQuestion ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRankingFork4071); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getRankingForkAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1893:1: ( (lv_forkedquestions_12_0= ruleQuestion ) )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1894:1: (lv_forkedquestions_12_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1894:1: (lv_forkedquestions_12_0= ruleQuestion )
                    	    // ../dk.itu.mddp.eank.survey/src-gen/dk/itu/mddp/eank/survey/parser/antlr/internal/InternalSurvey.g:1895:3: lv_forkedquestions_12_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRankingFork4092);
                    	    lv_forkedquestions_12_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingForkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"forkedquestions",
                    	            		lv_forkedquestions_12_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRankingFork4106); 

                        	newLeafNode(otherlv_13, grammarAccess.getRankingForkAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleRankingFork4120); 

                	newLeafNode(otherlv_14, grammarAccess.getRankingForkAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRankingFork"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_ruleModel140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_ruleQuestion234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_ruleQuestion261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_ruleQuestion288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_ruleQuestion315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_ruleQuestion342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_ruleQuestion369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_ruleQuestion396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey487 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey499 = new BitSet(new long[]{0x0000648068004002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey521 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleSurvey534 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleSurvey555 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString596 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice776 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice788 = new BitSet(new long[]{0x00000000044F8032L});
        public static final BitSet FOLLOW_15_in_ruleMultipleChoice801 = new BitSet(new long[]{0x00000000044F0032L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice817 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice840 = new BitSet(new long[]{0x00000000044E0002L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice856 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleMultipleChoice871 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice885 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_20_in_ruleMultipleChoice898 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice913 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice936 = new BitSet(new long[]{0x0000000004402002L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice949 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleMultipleChoice970 = new BitSet(new long[]{0x0000000004402002L});
        public static final BitSet FOLLOW_22_in_ruleMultipleChoice987 = new BitSet(new long[]{0x0000000003810030L});
        public static final BitSet FOLLOW_23_in_ruleMultipleChoice1000 = new BitSet(new long[]{0x0000000003010030L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice1015 = new BitSet(new long[]{0x0000000002010030L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice1030 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice1053 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice1068 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice1080 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1101 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice1114 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_ruleMultipleChoice1135 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen1175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleOpen1231 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpen1243 = new BitSet(new long[]{0x0000000010018032L});
        public static final BitSet FOLLOW_15_in_ruleOpen1256 = new BitSet(new long[]{0x0000000010010032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1279 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleOpen1293 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpen1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl1352 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleRating_Impl1414 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleRating_Impl1440 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRating_Impl1452 = new BitSet(new long[]{0x0000007F00000000L});
        public static final BitSet FOLLOW_32_in_ruleRating_Impl1465 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1486 = new BitSet(new long[]{0x0000007E00000000L});
        public static final BitSet FOLLOW_33_in_ruleRating_Impl1501 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1522 = new BitSet(new long[]{0x0000007C00000000L});
        public static final BitSet FOLLOW_34_in_ruleRating_Impl1537 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating_Impl1558 = new BitSet(new long[]{0x0000007800000000L});
        public static final BitSet FOLLOW_35_in_ruleRating_Impl1573 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1594 = new BitSet(new long[]{0x0000007000000000L});
        public static final BitSet FOLLOW_36_in_ruleRating_Impl1609 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating_Impl1630 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleRating_Impl1645 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRating_Impl1657 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1678 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleRating_Impl1691 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleRating_Impl1712 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1726 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRating_Impl1740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking1776 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking1786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleRanking1829 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleRanking1855 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRanking1867 = new BitSet(new long[]{0x0000030100000000L});
        public static final BitSet FOLLOW_32_in_ruleRanking1880 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking1901 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_40_in_ruleRanking1916 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRanking1928 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_ruleRankingFork_in_ruleRanking1949 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleRanking1962 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_ruleRankingFork_in_ruleRanking1983 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleRanking1997 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleRanking2011 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRanking2023 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2044 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleRanking2057 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_ruleChoice_in_ruleRanking2078 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleRanking2092 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRanking2104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_entryRuleDichotomous2140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomous2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDichotomous2202 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleDichotomous2228 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDichotomous2240 = new BitSet(new long[]{0x0000184100000000L});
        public static final BitSet FOLLOW_32_in_ruleDichotomous2253 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDichotomous2274 = new BitSet(new long[]{0x0000184000000000L});
        public static final BitSet FOLLOW_43_in_ruleDichotomous2289 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDichotomous2301 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2322 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleDichotomous2335 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2356 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleDichotomous2370 = new BitSet(new long[]{0x0000104000000000L});
        public static final BitSet FOLLOW_44_in_ruleDichotomous2385 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDichotomous2397 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2418 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleDichotomous2431 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleDichotomous2452 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleDichotomous2466 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleDichotomous2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_entryRuleSumConstant2516 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumConstant2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSumConstant2578 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleSumConstant2604 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSumConstant2616 = new BitSet(new long[]{0x0000004100000000L});
        public static final BitSet FOLLOW_32_in_ruleSumConstant2629 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSumConstant2650 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleSumConstant2664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple2700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleStaple2762 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleStaple2788 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleStaple2800 = new BitSet(new long[]{0x0000807F00000000L});
        public static final BitSet FOLLOW_32_in_ruleStaple2813 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple2834 = new BitSet(new long[]{0x0000807E00000000L});
        public static final BitSet FOLLOW_33_in_ruleStaple2849 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple2870 = new BitSet(new long[]{0x0000807C00000000L});
        public static final BitSet FOLLOW_34_in_ruleStaple2885 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStaple2906 = new BitSet(new long[]{0x0000807800000000L});
        public static final BitSet FOLLOW_35_in_ruleStaple2921 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple2942 = new BitSet(new long[]{0x0000807000000000L});
        public static final BitSet FOLLOW_36_in_ruleStaple2957 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple2978 = new BitSet(new long[]{0x0000806000000000L});
        public static final BitSet FOLLOW_47_in_ruleStaple2993 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStaple3014 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_37_in_ruleStaple3029 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleStaple3041 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3062 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleStaple3075 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleRatingFork_in_ruleStaple3096 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleStaple3110 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleStaple3124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice3160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice3170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoice3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_entryRuleMultipleChoiceFork3250 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoiceFork3260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleMultipleChoiceFork3297 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleMultipleChoiceFork3309 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoiceFork3329 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_50_in_ruleMultipleChoiceFork3342 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoiceFork3354 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3375 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoiceFork3388 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMultipleChoiceFork3409 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEInt3500 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork3562 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork3572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleRatingFork3618 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRatingFork3630 = new BitSet(new long[]{0x0060004004000000L});
        public static final BitSet FOLLOW_53_in_ruleRatingFork3643 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork3664 = new BitSet(new long[]{0x0040004004000000L});
        public static final BitSet FOLLOW_54_in_ruleRatingFork3679 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRatingFork3700 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_26_in_ruleRatingFork3715 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRatingFork3727 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRatingFork3748 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleRatingFork3761 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRatingFork3782 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleRatingFork3796 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRatingFork3810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRankingFork_in_entryRuleRankingFork3846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingFork3856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleRankingFork3893 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRankingFork3905 = new BitSet(new long[]{0x0062000000000000L});
        public static final BitSet FOLLOW_53_in_ruleRankingFork3918 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingFork3939 = new BitSet(new long[]{0x0042000000000000L});
        public static final BitSet FOLLOW_54_in_ruleRankingFork3954 = new BitSet(new long[]{0x0008000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRankingFork3975 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleRankingFork3989 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRankingFork4012 = new BitSet(new long[]{0x0100004000000000L});
        public static final BitSet FOLLOW_56_in_ruleRankingFork4025 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRankingFork4037 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRankingFork4058 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_13_in_ruleRankingFork4071 = new BitSet(new long[]{0x0000648068004000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRankingFork4092 = new BitSet(new long[]{0x0000004000002000L});
        public static final BitSet FOLLOW_38_in_ruleRankingFork4106 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleRankingFork4120 = new BitSet(new long[]{0x0000000000000002L});
    }


}