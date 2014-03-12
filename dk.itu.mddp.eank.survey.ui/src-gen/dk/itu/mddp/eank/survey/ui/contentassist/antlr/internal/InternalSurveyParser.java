package dk.itu.mddp.eank.survey.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.mddp.eank.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "':'", "','", "'MultipleChoice'", "'is required'", "'ask'", "'you'", "'can'", "'choose'", "'from'", "'these'", "'or'", "'free'", "'form'", "'choice'", "'conditionals'", "'Open'", "'AnswerLength'", "'Rating'", "'{'", "'}'", "'question'", "'Min'", "'Max'", "'first'", "'last'", "'RatingForks'", "'Ranking'", "'choices'", "'forks'", "'Dichotomous'", "'yes'", "'no'", "'SumConstant'", "'Staple'", "'mid'", "'condition'", "'matcher'", "'questions'", "'-'", "'RatingFork'", "'min'", "'max'", "'RankingFork'", "'forkedquestions'", "'required'"
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
    public String getGrammarFileName() { return "../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g"; }


     
     	private SurveyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SurveyGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:61:1: ( ruleModel EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:1: ( rule__Model__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:89:1: ( ruleQuestion EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:97:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:101:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Question__Alternatives ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Question__Alternatives ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:103:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:1: ( rule__Question__Alternatives )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:2: rule__Question__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Alternatives_in_ruleQuestion154);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:116:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:117:1: ( ruleSurvey EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:118:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey181);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:125:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:129:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__Survey__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:131:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:1: ( rule__Survey__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:2: rule__Survey__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0_in_ruleSurvey214);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:145:1: ( ruleEString EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:1: ( rule__EString__Alternatives )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMultipleChoice"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:174:1: entryRuleMultipleChoice : ruleMultipleChoice EOF ;
    public final void entryRuleMultipleChoice() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:175:1: ( ruleMultipleChoice EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:176:1: ruleMultipleChoice EOF
            {
             before(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice303);
            ruleMultipleChoice();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleChoice"


    // $ANTLR start "ruleMultipleChoice"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:183:1: ruleMultipleChoice : ( ( rule__MultipleChoice__Group__0 ) ) ;
    public final void ruleMultipleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:187:2: ( ( ( rule__MultipleChoice__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( ( rule__MultipleChoice__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( ( rule__MultipleChoice__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:189:1: ( rule__MultipleChoice__Group__0 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:190:1: ( rule__MultipleChoice__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:190:2: rule__MultipleChoice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__0_in_ruleMultipleChoice336);
            rule__MultipleChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleChoice"


    // $ANTLR start "entryRuleOpen"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:202:1: entryRuleOpen : ruleOpen EOF ;
    public final void entryRuleOpen() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:203:1: ( ruleOpen EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:204:1: ruleOpen EOF
            {
             before(grammarAccess.getOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpen_in_entryRuleOpen363);
            ruleOpen();

            state._fsp--;

             after(grammarAccess.getOpenRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpen370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:211:1: ruleOpen : ( ( rule__Open__Group__0 ) ) ;
    public final void ruleOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:215:2: ( ( ( rule__Open__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ( ( rule__Open__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ( ( rule__Open__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:217:1: ( rule__Open__Group__0 )
            {
             before(grammarAccess.getOpenAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:218:1: ( rule__Open__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:218:2: rule__Open__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__0_in_ruleOpen396);
            rule__Open__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleRating_Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:230:1: entryRuleRating_Impl : ruleRating_Impl EOF ;
    public final void entryRuleRating_Impl() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:231:1: ( ruleRating_Impl EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:232:1: ruleRating_Impl EOF
            {
             before(grammarAccess.getRating_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl423);
            ruleRating_Impl();

            state._fsp--;

             after(grammarAccess.getRating_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating_Impl430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRating_Impl"


    // $ANTLR start "ruleRating_Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:239:1: ruleRating_Impl : ( ( rule__Rating_Impl__Group__0 ) ) ;
    public final void ruleRating_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:243:2: ( ( ( rule__Rating_Impl__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ( ( rule__Rating_Impl__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ( ( rule__Rating_Impl__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:245:1: ( rule__Rating_Impl__Group__0 )
            {
             before(grammarAccess.getRating_ImplAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:246:1: ( rule__Rating_Impl__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:246:2: rule__Rating_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__0_in_ruleRating_Impl456);
            rule__Rating_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRating_Impl"


    // $ANTLR start "entryRuleRanking"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:258:1: entryRuleRanking : ruleRanking EOF ;
    public final void entryRuleRanking() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:259:1: ( ruleRanking EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:260:1: ruleRanking EOF
            {
             before(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking483);
            ruleRanking();

            state._fsp--;

             after(grammarAccess.getRankingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRanking"


    // $ANTLR start "ruleRanking"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:267:1: ruleRanking : ( ( rule__Ranking__Group__0 ) ) ;
    public final void ruleRanking() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:271:2: ( ( ( rule__Ranking__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ( ( rule__Ranking__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ( ( rule__Ranking__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:273:1: ( rule__Ranking__Group__0 )
            {
             before(grammarAccess.getRankingAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:274:1: ( rule__Ranking__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:274:2: rule__Ranking__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__0_in_ruleRanking516);
            rule__Ranking__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRanking"


    // $ANTLR start "entryRuleDichotomous"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:286:1: entryRuleDichotomous : ruleDichotomous EOF ;
    public final void entryRuleDichotomous() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:287:1: ( ruleDichotomous EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:288:1: ruleDichotomous EOF
            {
             before(grammarAccess.getDichotomousRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_entryRuleDichotomous543);
            ruleDichotomous();

            state._fsp--;

             after(grammarAccess.getDichotomousRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDichotomous550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDichotomous"


    // $ANTLR start "ruleDichotomous"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:295:1: ruleDichotomous : ( ( rule__Dichotomous__Group__0 ) ) ;
    public final void ruleDichotomous() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:299:2: ( ( ( rule__Dichotomous__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ( ( rule__Dichotomous__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ( ( rule__Dichotomous__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:301:1: ( rule__Dichotomous__Group__0 )
            {
             before(grammarAccess.getDichotomousAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:302:1: ( rule__Dichotomous__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:302:2: rule__Dichotomous__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__0_in_ruleDichotomous576);
            rule__Dichotomous__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDichotomousAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDichotomous"


    // $ANTLR start "entryRuleSumConstant"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:314:1: entryRuleSumConstant : ruleSumConstant EOF ;
    public final void entryRuleSumConstant() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:315:1: ( ruleSumConstant EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:316:1: ruleSumConstant EOF
            {
             before(grammarAccess.getSumConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_entryRuleSumConstant603);
            ruleSumConstant();

            state._fsp--;

             after(grammarAccess.getSumConstantRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumConstant610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSumConstant"


    // $ANTLR start "ruleSumConstant"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:323:1: ruleSumConstant : ( ( rule__SumConstant__Group__0 ) ) ;
    public final void ruleSumConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:327:2: ( ( ( rule__SumConstant__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:1: ( ( rule__SumConstant__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:1: ( ( rule__SumConstant__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:329:1: ( rule__SumConstant__Group__0 )
            {
             before(grammarAccess.getSumConstantAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:330:1: ( rule__SumConstant__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:330:2: rule__SumConstant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__0_in_ruleSumConstant636);
            rule__SumConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSumConstant"


    // $ANTLR start "entryRuleStaple"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:342:1: entryRuleStaple : ruleStaple EOF ;
    public final void entryRuleStaple() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:343:1: ( ruleStaple EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:344:1: ruleStaple EOF
            {
             before(grammarAccess.getStapleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStaple_in_entryRuleStaple663);
            ruleStaple();

            state._fsp--;

             after(grammarAccess.getStapleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStaple670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaple"


    // $ANTLR start "ruleStaple"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:351:1: ruleStaple : ( ( rule__Staple__Group__0 ) ) ;
    public final void ruleStaple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:355:2: ( ( ( rule__Staple__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ( ( rule__Staple__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ( ( rule__Staple__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:357:1: ( rule__Staple__Group__0 )
            {
             before(grammarAccess.getStapleAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:358:1: ( rule__Staple__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:358:2: rule__Staple__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__0_in_ruleStaple696);
            rule__Staple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaple"


    // $ANTLR start "entryRuleChoice"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:370:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:371:1: ( ruleChoice EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:372:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice723);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:379:1: ruleChoice : ( ( rule__Choice__DescriptionAssignment ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:383:2: ( ( ( rule__Choice__DescriptionAssignment ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( ( rule__Choice__DescriptionAssignment ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( ( rule__Choice__DescriptionAssignment ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: ( rule__Choice__DescriptionAssignment )
            {
             before(grammarAccess.getChoiceAccess().getDescriptionAssignment()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:1: ( rule__Choice__DescriptionAssignment )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:2: rule__Choice__DescriptionAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__DescriptionAssignment_in_ruleChoice756);
            rule__Choice__DescriptionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getDescriptionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleMultipleChoiceFork"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:398:1: entryRuleMultipleChoiceFork : ruleMultipleChoiceFork EOF ;
    public final void entryRuleMultipleChoiceFork() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:399:1: ( ruleMultipleChoiceFork EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:400:1: ruleMultipleChoiceFork EOF
            {
             before(grammarAccess.getMultipleChoiceForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_entryRuleMultipleChoiceFork783);
            ruleMultipleChoiceFork();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceForkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoiceFork790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleChoiceFork"


    // $ANTLR start "ruleMultipleChoiceFork"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:407:1: ruleMultipleChoiceFork : ( ( rule__MultipleChoiceFork__Group__0 ) ) ;
    public final void ruleMultipleChoiceFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:411:2: ( ( ( rule__MultipleChoiceFork__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: ( ( rule__MultipleChoiceFork__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: ( ( rule__MultipleChoiceFork__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: ( rule__MultipleChoiceFork__Group__0 )
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:414:1: ( rule__MultipleChoiceFork__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:414:2: rule__MultipleChoiceFork__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__0_in_ruleMultipleChoiceFork816);
            rule__MultipleChoiceFork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleChoiceFork"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:426:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:427:1: ( ruleEInt EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:428:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt843);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:435:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:439:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:440:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:440:1: ( ( rule__EInt__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:441:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:442:1: ( rule__EInt__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:442:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt876);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleRatingFork"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:454:1: entryRuleRatingFork : ruleRatingFork EOF ;
    public final void entryRuleRatingFork() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:455:1: ( ruleRatingFork EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:456:1: ruleRatingFork EOF
            {
             before(grammarAccess.getRatingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_entryRuleRatingFork903);
            ruleRatingFork();

            state._fsp--;

             after(grammarAccess.getRatingForkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRatingFork910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRatingFork"


    // $ANTLR start "ruleRatingFork"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:463:1: ruleRatingFork : ( ( rule__RatingFork__Group__0 ) ) ;
    public final void ruleRatingFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:467:2: ( ( ( rule__RatingFork__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:468:1: ( ( rule__RatingFork__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:468:1: ( ( rule__RatingFork__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:469:1: ( rule__RatingFork__Group__0 )
            {
             before(grammarAccess.getRatingForkAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:470:1: ( rule__RatingFork__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:470:2: rule__RatingFork__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__0_in_ruleRatingFork936);
            rule__RatingFork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatingForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRatingFork"


    // $ANTLR start "entryRuleRankingFork"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:482:1: entryRuleRankingFork : ruleRankingFork EOF ;
    public final void entryRuleRankingFork() throws RecognitionException {
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:483:1: ( ruleRankingFork EOF )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:484:1: ruleRankingFork EOF
            {
             before(grammarAccess.getRankingForkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_entryRuleRankingFork963);
            ruleRankingFork();

            state._fsp--;

             after(grammarAccess.getRankingForkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRankingFork970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRankingFork"


    // $ANTLR start "ruleRankingFork"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:491:1: ruleRankingFork : ( ( rule__RankingFork__Group__0 ) ) ;
    public final void ruleRankingFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:495:2: ( ( ( rule__RankingFork__Group__0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:496:1: ( ( rule__RankingFork__Group__0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:496:1: ( ( rule__RankingFork__Group__0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:497:1: ( rule__RankingFork__Group__0 )
            {
             before(grammarAccess.getRankingForkAccess().getGroup()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:498:1: ( rule__RankingFork__Group__0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:498:2: rule__RankingFork__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__0_in_ruleRankingFork996);
            rule__RankingFork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRankingForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRankingFork"


    // $ANTLR start "rule__Question__Alternatives"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:510:1: rule__Question__Alternatives : ( ( ruleMultipleChoice ) | ( ruleOpen ) | ( ruleRating_Impl ) | ( ruleRanking ) | ( ruleDichotomous ) | ( ruleSumConstant ) | ( ruleStaple ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:514:1: ( ( ruleMultipleChoice ) | ( ruleOpen ) | ( ruleRating_Impl ) | ( ruleRanking ) | ( ruleDichotomous ) | ( ruleSumConstant ) | ( ruleStaple ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 56:
                {
                switch ( input.LA(2) ) {
                case 44:
                    {
                    alt1=6;
                    }
                    break;
                case 41:
                    {
                    alt1=5;
                    }
                    break;
                case 29:
                    {
                    alt1=3;
                    }
                    break;
                case 38:
                    {
                    alt1=4;
                    }
                    break;
                case 45:
                    {
                    alt1=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 41:
                {
                alt1=5;
                }
                break;
            case 44:
                {
                alt1=6;
                }
                break;
            case 45:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:515:1: ( ruleMultipleChoice )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:515:1: ( ruleMultipleChoice )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:516:1: ruleMultipleChoice
                    {
                     before(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_rule__Question__Alternatives1032);
                    ruleMultipleChoice();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:521:6: ( ruleOpen )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:521:6: ( ruleOpen )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:522:1: ruleOpen
                    {
                     before(grammarAccess.getQuestionAccess().getOpenParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOpen_in_rule__Question__Alternatives1049);
                    ruleOpen();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getOpenParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:527:6: ( ruleRating_Impl )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:527:6: ( ruleRating_Impl )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:528:1: ruleRating_Impl
                    {
                     before(grammarAccess.getQuestionAccess().getRating_ImplParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRating_Impl_in_rule__Question__Alternatives1066);
                    ruleRating_Impl();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRating_ImplParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:533:6: ( ruleRanking )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:533:6: ( ruleRanking )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:534:1: ruleRanking
                    {
                     before(grammarAccess.getQuestionAccess().getRankingParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_rule__Question__Alternatives1083);
                    ruleRanking();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRankingParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:539:6: ( ruleDichotomous )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:539:6: ( ruleDichotomous )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:540:1: ruleDichotomous
                    {
                     before(grammarAccess.getQuestionAccess().getDichotomousParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDichotomous_in_rule__Question__Alternatives1100);
                    ruleDichotomous();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getDichotomousParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:545:6: ( ruleSumConstant )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:545:6: ( ruleSumConstant )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:546:1: ruleSumConstant
                    {
                     before(grammarAccess.getQuestionAccess().getSumConstantParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSumConstant_in_rule__Question__Alternatives1117);
                    ruleSumConstant();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSumConstantParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:551:6: ( ruleStaple )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:551:6: ( ruleStaple )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:552:1: ruleStaple
                    {
                     before(grammarAccess.getQuestionAccess().getStapleParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStaple_in_rule__Question__Alternatives1134);
                    ruleStaple();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getStapleParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:562:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:566:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:567:1: ( RULE_STRING )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:567:1: ( RULE_STRING )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:568:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1166); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:573:6: ( RULE_ID )
                    {
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:573:6: ( RULE_ID )
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:574:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1183); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:587:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:591:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:592:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01214);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01217);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:599:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:603:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:604:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:604:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:605:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:606:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:608:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:618:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:622:1: ( rule__Model__Group__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:623:2: rule__Model__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11275);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:629:1: rule__Model__Group__1__Impl : ( ( rule__Model__SurveysAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:633:1: ( ( ( rule__Model__SurveysAssignment_1 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:634:1: ( ( rule__Model__SurveysAssignment_1 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:634:1: ( ( rule__Model__SurveysAssignment_1 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:635:1: ( rule__Model__SurveysAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getSurveysAssignment_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:636:1: ( rule__Model__SurveysAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:636:2: rule__Model__SurveysAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__SurveysAssignment_1_in_rule__Model__Group__1__Impl1302);
                    rule__Model__SurveysAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getSurveysAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:650:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:654:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:655:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01337);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01340);
            rule__Survey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:662:1: rule__Survey__Group__0__Impl : ( () ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:666:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:667:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:667:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:668:1: ()
            {
             before(grammarAccess.getSurveyAccess().getSurveyAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:669:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:671:1: 
            {
            }

             after(grammarAccess.getSurveyAccess().getSurveyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:681:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:685:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:686:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11398);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11401);
            rule__Survey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: rule__Survey__Group__1__Impl : ( 'Name' ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:697:1: ( ( 'Name' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:698:1: ( 'Name' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:698:1: ( 'Name' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:699:1: 'Name'
            {
             before(grammarAccess.getSurveyAccess().getNameKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__1__Impl1429); 
             after(grammarAccess.getSurveyAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:712:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:716:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:717:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21460);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21463);
            rule__Survey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:724:1: rule__Survey__Group__2__Impl : ( ':' ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:1: ( ( ':' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:729:1: ( ':' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:729:1: ( ':' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:730:1: ':'
            {
             before(grammarAccess.getSurveyAccess().getColonKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group__2__Impl1491); 
             after(grammarAccess.getSurveyAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:743:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:747:1: ( rule__Survey__Group__3__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:748:2: rule__Survey__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31522);
            rule__Survey__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3"


    // $ANTLR start "rule__Survey__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:754:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__Group_3__0 )? ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:758:1: ( ( ( rule__Survey__Group_3__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:759:1: ( ( rule__Survey__Group_3__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:759:1: ( ( rule__Survey__Group_3__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:760:1: ( rule__Survey__Group_3__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:761:1: ( rule__Survey__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||LA4_0==27||LA4_0==29||LA4_0==38||LA4_0==41||(LA4_0>=44 && LA4_0<=45)||LA4_0==56) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:761:2: rule__Survey__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__0_in_rule__Survey__Group__3__Impl1549);
                    rule__Survey__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3__Impl"


    // $ANTLR start "rule__Survey__Group_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:779:1: rule__Survey__Group_3__0 : rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1 ;
    public final void rule__Survey__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:783:1: ( rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:784:2: rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__0__Impl_in_rule__Survey__Group_3__01588);
            rule__Survey__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__1_in_rule__Survey__Group_3__01591);
            rule__Survey__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3__0"


    // $ANTLR start "rule__Survey__Group_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:791:1: rule__Survey__Group_3__0__Impl : ( ( rule__Survey__QuestionsAssignment_3_0 ) ) ;
    public final void rule__Survey__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:795:1: ( ( ( rule__Survey__QuestionsAssignment_3_0 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: ( ( rule__Survey__QuestionsAssignment_3_0 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: ( ( rule__Survey__QuestionsAssignment_3_0 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:797:1: ( rule__Survey__QuestionsAssignment_3_0 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_3_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:798:1: ( rule__Survey__QuestionsAssignment_3_0 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:798:2: rule__Survey__QuestionsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_3_0_in_rule__Survey__Group_3__0__Impl1618);
            rule__Survey__QuestionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3__0__Impl"


    // $ANTLR start "rule__Survey__Group_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:808:1: rule__Survey__Group_3__1 : rule__Survey__Group_3__1__Impl ;
    public final void rule__Survey__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:812:1: ( rule__Survey__Group_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:813:2: rule__Survey__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__1__Impl_in_rule__Survey__Group_3__11648);
            rule__Survey__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3__1"


    // $ANTLR start "rule__Survey__Group_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:819:1: rule__Survey__Group_3__1__Impl : ( ( rule__Survey__Group_3_1__0 )* ) ;
    public final void rule__Survey__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:823:1: ( ( ( rule__Survey__Group_3_1__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:824:1: ( ( rule__Survey__Group_3_1__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:824:1: ( ( rule__Survey__Group_3_1__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:825:1: ( rule__Survey__Group_3_1__0 )*
            {
             before(grammarAccess.getSurveyAccess().getGroup_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:826:1: ( rule__Survey__Group_3_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:826:2: rule__Survey__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3_1__0_in_rule__Survey__Group_3__1__Impl1675);
            	    rule__Survey__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3__1__Impl"


    // $ANTLR start "rule__Survey__Group_3_1__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:840:1: rule__Survey__Group_3_1__0 : rule__Survey__Group_3_1__0__Impl rule__Survey__Group_3_1__1 ;
    public final void rule__Survey__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:844:1: ( rule__Survey__Group_3_1__0__Impl rule__Survey__Group_3_1__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:845:2: rule__Survey__Group_3_1__0__Impl rule__Survey__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3_1__0__Impl_in_rule__Survey__Group_3_1__01710);
            rule__Survey__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3_1__1_in_rule__Survey__Group_3_1__01713);
            rule__Survey__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3_1__0"


    // $ANTLR start "rule__Survey__Group_3_1__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:852:1: rule__Survey__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Survey__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:856:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:857:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:857:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:858:1: ','
            {
             before(grammarAccess.getSurveyAccess().getCommaKeyword_3_1_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group_3_1__0__Impl1741); 
             after(grammarAccess.getSurveyAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3_1__0__Impl"


    // $ANTLR start "rule__Survey__Group_3_1__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:871:1: rule__Survey__Group_3_1__1 : rule__Survey__Group_3_1__1__Impl ;
    public final void rule__Survey__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:875:1: ( rule__Survey__Group_3_1__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:876:2: rule__Survey__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3_1__1__Impl_in_rule__Survey__Group_3_1__11772);
            rule__Survey__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3_1__1"


    // $ANTLR start "rule__Survey__Group_3_1__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:882:1: rule__Survey__Group_3_1__1__Impl : ( ( rule__Survey__QuestionsAssignment_3_1_1 ) ) ;
    public final void rule__Survey__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:886:1: ( ( ( rule__Survey__QuestionsAssignment_3_1_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:887:1: ( ( rule__Survey__QuestionsAssignment_3_1_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:887:1: ( ( rule__Survey__QuestionsAssignment_3_1_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:888:1: ( rule__Survey__QuestionsAssignment_3_1_1 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionsAssignment_3_1_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:889:1: ( rule__Survey__QuestionsAssignment_3_1_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:889:2: rule__Survey__QuestionsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__QuestionsAssignment_3_1_1_in_rule__Survey__Group_3_1__1__Impl1799);
            rule__Survey__QuestionsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_3_1__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:903:1: rule__MultipleChoice__Group__0 : rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1 ;
    public final void rule__MultipleChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:907:1: ( rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:908:2: rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__0__Impl_in_rule__MultipleChoice__Group__01833);
            rule__MultipleChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__1_in_rule__MultipleChoice__Group__01836);
            rule__MultipleChoice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__0"


    // $ANTLR start "rule__MultipleChoice__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:915:1: rule__MultipleChoice__Group__0__Impl : ( () ) ;
    public final void rule__MultipleChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:919:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:920:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:920:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:921:1: ()
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:922:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:924:1: 
            {
            }

             after(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: rule__MultipleChoice__Group__1 : rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2 ;
    public final void rule__MultipleChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:938:1: ( rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:939:2: rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__1__Impl_in_rule__MultipleChoice__Group__11894);
            rule__MultipleChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__2_in_rule__MultipleChoice__Group__11897);
            rule__MultipleChoice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__1"


    // $ANTLR start "rule__MultipleChoice__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:946:1: rule__MultipleChoice__Group__1__Impl : ( 'MultipleChoice' ) ;
    public final void rule__MultipleChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:950:1: ( ( 'MultipleChoice' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:951:1: ( 'MultipleChoice' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:951:1: ( 'MultipleChoice' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:952:1: 'MultipleChoice'
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MultipleChoice__Group__1__Impl1925); 
             after(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: rule__MultipleChoice__Group__2 : rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3 ;
    public final void rule__MultipleChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:969:1: ( rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:970:2: rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__2__Impl_in_rule__MultipleChoice__Group__21956);
            rule__MultipleChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__3_in_rule__MultipleChoice__Group__21959);
            rule__MultipleChoice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__2"


    // $ANTLR start "rule__MultipleChoice__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:977:1: rule__MultipleChoice__Group__2__Impl : ( ':' ) ;
    public final void rule__MultipleChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:981:1: ( ( ':' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:982:1: ( ':' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:982:1: ( ':' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:983:1: ':'
            {
             before(grammarAccess.getMultipleChoiceAccess().getColonKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MultipleChoice__Group__2__Impl1987); 
             after(grammarAccess.getMultipleChoiceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__2__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: rule__MultipleChoice__Group__3 : rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4 ;
    public final void rule__MultipleChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1000:1: ( rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1001:2: rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__3__Impl_in_rule__MultipleChoice__Group__32018);
            rule__MultipleChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__4_in_rule__MultipleChoice__Group__32021);
            rule__MultipleChoice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__3"


    // $ANTLR start "rule__MultipleChoice__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1008:1: rule__MultipleChoice__Group__3__Impl : ( ( 'is required' )? ) ;
    public final void rule__MultipleChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1012:1: ( ( ( 'is required' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1013:1: ( ( 'is required' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1013:1: ( ( 'is required' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1014:1: ( 'is required' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getIsRequiredKeyword_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1015:1: ( 'is required' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1016:2: 'is required'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__MultipleChoice__Group__3__Impl2050); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getIsRequiredKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__3__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1027:1: rule__MultipleChoice__Group__4 : rule__MultipleChoice__Group__4__Impl rule__MultipleChoice__Group__5 ;
    public final void rule__MultipleChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1031:1: ( rule__MultipleChoice__Group__4__Impl rule__MultipleChoice__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1032:2: rule__MultipleChoice__Group__4__Impl rule__MultipleChoice__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__4__Impl_in_rule__MultipleChoice__Group__42083);
            rule__MultipleChoice__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__5_in_rule__MultipleChoice__Group__42086);
            rule__MultipleChoice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__4"


    // $ANTLR start "rule__MultipleChoice__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1039:1: rule__MultipleChoice__Group__4__Impl : ( ( rule__MultipleChoice__Group_4__0 )? ) ;
    public final void rule__MultipleChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1043:1: ( ( ( rule__MultipleChoice__Group_4__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1044:1: ( ( rule__MultipleChoice__Group_4__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1044:1: ( ( rule__MultipleChoice__Group_4__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1045:1: ( rule__MultipleChoice__Group_4__0 )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1046:1: ( rule__MultipleChoice__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1046:2: rule__MultipleChoice__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_4__0_in_rule__MultipleChoice__Group__4__Impl2113);
                    rule__MultipleChoice__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__4__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1056:1: rule__MultipleChoice__Group__5 : rule__MultipleChoice__Group__5__Impl rule__MultipleChoice__Group__6 ;
    public final void rule__MultipleChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1060:1: ( rule__MultipleChoice__Group__5__Impl rule__MultipleChoice__Group__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1061:2: rule__MultipleChoice__Group__5__Impl rule__MultipleChoice__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__5__Impl_in_rule__MultipleChoice__Group__52144);
            rule__MultipleChoice__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__6_in_rule__MultipleChoice__Group__52147);
            rule__MultipleChoice__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__5"


    // $ANTLR start "rule__MultipleChoice__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1068:1: rule__MultipleChoice__Group__5__Impl : ( ( rule__MultipleChoice__Group_5__0 )? ) ;
    public final void rule__MultipleChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: ( ( ( rule__MultipleChoice__Group_5__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:1: ( ( rule__MultipleChoice__Group_5__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:1: ( ( rule__MultipleChoice__Group_5__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1074:1: ( rule__MultipleChoice__Group_5__0 )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1075:1: ( rule__MultipleChoice__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=17 && LA8_0<=19)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1075:2: rule__MultipleChoice__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__0_in_rule__MultipleChoice__Group__5__Impl2174);
                    rule__MultipleChoice__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__5__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1085:1: rule__MultipleChoice__Group__6 : rule__MultipleChoice__Group__6__Impl rule__MultipleChoice__Group__7 ;
    public final void rule__MultipleChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1089:1: ( rule__MultipleChoice__Group__6__Impl rule__MultipleChoice__Group__7 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1090:2: rule__MultipleChoice__Group__6__Impl rule__MultipleChoice__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__6__Impl_in_rule__MultipleChoice__Group__62205);
            rule__MultipleChoice__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__7_in_rule__MultipleChoice__Group__62208);
            rule__MultipleChoice__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__6"


    // $ANTLR start "rule__MultipleChoice__Group__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1097:1: rule__MultipleChoice__Group__6__Impl : ( ( rule__MultipleChoice__Group_6__0 )? ) ;
    public final void rule__MultipleChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1101:1: ( ( ( rule__MultipleChoice__Group_6__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1102:1: ( ( rule__MultipleChoice__Group_6__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1102:1: ( ( rule__MultipleChoice__Group_6__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1103:1: ( rule__MultipleChoice__Group_6__0 )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_6()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1104:1: ( rule__MultipleChoice__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1104:2: rule__MultipleChoice__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__0_in_rule__MultipleChoice__Group__6__Impl2235);
                    rule__MultipleChoice__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__6__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__7"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1114:1: rule__MultipleChoice__Group__7 : rule__MultipleChoice__Group__7__Impl ;
    public final void rule__MultipleChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1118:1: ( rule__MultipleChoice__Group__7__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1119:2: rule__MultipleChoice__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__7__Impl_in_rule__MultipleChoice__Group__72266);
            rule__MultipleChoice__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__7"


    // $ANTLR start "rule__MultipleChoice__Group__7__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1125:1: rule__MultipleChoice__Group__7__Impl : ( ( rule__MultipleChoice__Group_7__0 )? ) ;
    public final void rule__MultipleChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1129:1: ( ( ( rule__MultipleChoice__Group_7__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1130:1: ( ( rule__MultipleChoice__Group_7__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1130:1: ( ( rule__MultipleChoice__Group_7__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1131:1: ( rule__MultipleChoice__Group_7__0 )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_7()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1132:1: ( rule__MultipleChoice__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1132:2: rule__MultipleChoice__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__0_in_rule__MultipleChoice__Group__7__Impl2293);
                    rule__MultipleChoice__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__7__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_4__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1158:1: rule__MultipleChoice__Group_4__0 : rule__MultipleChoice__Group_4__0__Impl rule__MultipleChoice__Group_4__1 ;
    public final void rule__MultipleChoice__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: ( rule__MultipleChoice__Group_4__0__Impl rule__MultipleChoice__Group_4__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1163:2: rule__MultipleChoice__Group_4__0__Impl rule__MultipleChoice__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_4__0__Impl_in_rule__MultipleChoice__Group_4__02340);
            rule__MultipleChoice__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_4__1_in_rule__MultipleChoice__Group_4__02343);
            rule__MultipleChoice__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_4__0"


    // $ANTLR start "rule__MultipleChoice__Group_4__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1170:1: rule__MultipleChoice__Group_4__0__Impl : ( ( 'ask' )? ) ;
    public final void rule__MultipleChoice__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1174:1: ( ( ( 'ask' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1175:1: ( ( 'ask' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1175:1: ( ( 'ask' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1176:1: ( 'ask' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getAskKeyword_4_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1177:1: ( 'ask' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1178:2: 'ask'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__MultipleChoice__Group_4__0__Impl2372); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getAskKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_4__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_4__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1189:1: rule__MultipleChoice__Group_4__1 : rule__MultipleChoice__Group_4__1__Impl ;
    public final void rule__MultipleChoice__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1193:1: ( rule__MultipleChoice__Group_4__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1194:2: rule__MultipleChoice__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_4__1__Impl_in_rule__MultipleChoice__Group_4__12405);
            rule__MultipleChoice__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_4__1"


    // $ANTLR start "rule__MultipleChoice__Group_4__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1200:1: rule__MultipleChoice__Group_4__1__Impl : ( ( rule__MultipleChoice__QuestionAssignment_4_1 ) ) ;
    public final void rule__MultipleChoice__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1204:1: ( ( ( rule__MultipleChoice__QuestionAssignment_4_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1205:1: ( ( rule__MultipleChoice__QuestionAssignment_4_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1205:1: ( ( rule__MultipleChoice__QuestionAssignment_4_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1206:1: ( rule__MultipleChoice__QuestionAssignment_4_1 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getQuestionAssignment_4_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1207:1: ( rule__MultipleChoice__QuestionAssignment_4_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1207:2: rule__MultipleChoice__QuestionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__QuestionAssignment_4_1_in_rule__MultipleChoice__Group_4__1__Impl2432);
            rule__MultipleChoice__QuestionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getQuestionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_4__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1221:1: rule__MultipleChoice__Group_5__0 : rule__MultipleChoice__Group_5__0__Impl rule__MultipleChoice__Group_5__1 ;
    public final void rule__MultipleChoice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1225:1: ( rule__MultipleChoice__Group_5__0__Impl rule__MultipleChoice__Group_5__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:2: rule__MultipleChoice__Group_5__0__Impl rule__MultipleChoice__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__0__Impl_in_rule__MultipleChoice__Group_5__02466);
            rule__MultipleChoice__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__1_in_rule__MultipleChoice__Group_5__02469);
            rule__MultipleChoice__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__0"


    // $ANTLR start "rule__MultipleChoice__Group_5__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1233:1: rule__MultipleChoice__Group_5__0__Impl : ( ( 'you' )? ) ;
    public final void rule__MultipleChoice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1237:1: ( ( ( 'you' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1238:1: ( ( 'you' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1238:1: ( ( 'you' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1239:1: ( 'you' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getYouKeyword_5_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1240:1: ( 'you' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1241:2: 'you'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__MultipleChoice__Group_5__0__Impl2498); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getYouKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1252:1: rule__MultipleChoice__Group_5__1 : rule__MultipleChoice__Group_5__1__Impl rule__MultipleChoice__Group_5__2 ;
    public final void rule__MultipleChoice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1256:1: ( rule__MultipleChoice__Group_5__1__Impl rule__MultipleChoice__Group_5__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1257:2: rule__MultipleChoice__Group_5__1__Impl rule__MultipleChoice__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__1__Impl_in_rule__MultipleChoice__Group_5__12531);
            rule__MultipleChoice__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__2_in_rule__MultipleChoice__Group_5__12534);
            rule__MultipleChoice__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__1"


    // $ANTLR start "rule__MultipleChoice__Group_5__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1264:1: rule__MultipleChoice__Group_5__1__Impl : ( ( 'can' )? ) ;
    public final void rule__MultipleChoice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1268:1: ( ( ( 'can' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1269:1: ( ( 'can' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1269:1: ( ( 'can' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1270:1: ( 'can' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getCanKeyword_5_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1271:1: ( 'can' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1272:2: 'can'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__MultipleChoice__Group_5__1__Impl2563); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getCanKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1283:1: rule__MultipleChoice__Group_5__2 : rule__MultipleChoice__Group_5__2__Impl rule__MultipleChoice__Group_5__3 ;
    public final void rule__MultipleChoice__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1287:1: ( rule__MultipleChoice__Group_5__2__Impl rule__MultipleChoice__Group_5__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1288:2: rule__MultipleChoice__Group_5__2__Impl rule__MultipleChoice__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__2__Impl_in_rule__MultipleChoice__Group_5__22596);
            rule__MultipleChoice__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__3_in_rule__MultipleChoice__Group_5__22599);
            rule__MultipleChoice__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__2"


    // $ANTLR start "rule__MultipleChoice__Group_5__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1295:1: rule__MultipleChoice__Group_5__2__Impl : ( 'choose' ) ;
    public final void rule__MultipleChoice__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1299:1: ( ( 'choose' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1300:1: ( 'choose' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1300:1: ( 'choose' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1301:1: 'choose'
            {
             before(grammarAccess.getMultipleChoiceAccess().getChooseKeyword_5_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MultipleChoice__Group_5__2__Impl2627); 
             after(grammarAccess.getMultipleChoiceAccess().getChooseKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__2__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1314:1: rule__MultipleChoice__Group_5__3 : rule__MultipleChoice__Group_5__3__Impl rule__MultipleChoice__Group_5__4 ;
    public final void rule__MultipleChoice__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1318:1: ( rule__MultipleChoice__Group_5__3__Impl rule__MultipleChoice__Group_5__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1319:2: rule__MultipleChoice__Group_5__3__Impl rule__MultipleChoice__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__3__Impl_in_rule__MultipleChoice__Group_5__32658);
            rule__MultipleChoice__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__4_in_rule__MultipleChoice__Group_5__32661);
            rule__MultipleChoice__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__3"


    // $ANTLR start "rule__MultipleChoice__Group_5__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1326:1: rule__MultipleChoice__Group_5__3__Impl : ( ( 'from' )? ) ;
    public final void rule__MultipleChoice__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1330:1: ( ( ( 'from' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1331:1: ( ( 'from' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1331:1: ( ( 'from' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1332:1: ( 'from' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getFromKeyword_5_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1333:1: ( 'from' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1334:2: 'from'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__MultipleChoice__Group_5__3__Impl2690); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getFromKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__3__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1345:1: rule__MultipleChoice__Group_5__4 : rule__MultipleChoice__Group_5__4__Impl rule__MultipleChoice__Group_5__5 ;
    public final void rule__MultipleChoice__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1349:1: ( rule__MultipleChoice__Group_5__4__Impl rule__MultipleChoice__Group_5__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1350:2: rule__MultipleChoice__Group_5__4__Impl rule__MultipleChoice__Group_5__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__4__Impl_in_rule__MultipleChoice__Group_5__42723);
            rule__MultipleChoice__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__5_in_rule__MultipleChoice__Group_5__42726);
            rule__MultipleChoice__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__4"


    // $ANTLR start "rule__MultipleChoice__Group_5__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1357:1: rule__MultipleChoice__Group_5__4__Impl : ( ( 'these' )? ) ;
    public final void rule__MultipleChoice__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1361:1: ( ( ( 'these' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1362:1: ( ( 'these' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1362:1: ( ( 'these' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1363:1: ( 'these' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getTheseKeyword_5_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1364:1: ( 'these' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1365:2: 'these'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__MultipleChoice__Group_5__4__Impl2755); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getTheseKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__4__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1376:1: rule__MultipleChoice__Group_5__5 : rule__MultipleChoice__Group_5__5__Impl rule__MultipleChoice__Group_5__6 ;
    public final void rule__MultipleChoice__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1380:1: ( rule__MultipleChoice__Group_5__5__Impl rule__MultipleChoice__Group_5__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1381:2: rule__MultipleChoice__Group_5__5__Impl rule__MultipleChoice__Group_5__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__5__Impl_in_rule__MultipleChoice__Group_5__52788);
            rule__MultipleChoice__Group_5__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__6_in_rule__MultipleChoice__Group_5__52791);
            rule__MultipleChoice__Group_5__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__5"


    // $ANTLR start "rule__MultipleChoice__Group_5__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1388:1: rule__MultipleChoice__Group_5__5__Impl : ( ( rule__MultipleChoice__ChoiceAssignment_5_5 ) ) ;
    public final void rule__MultipleChoice__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1392:1: ( ( ( rule__MultipleChoice__ChoiceAssignment_5_5 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1393:1: ( ( rule__MultipleChoice__ChoiceAssignment_5_5 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1393:1: ( ( rule__MultipleChoice__ChoiceAssignment_5_5 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1394:1: ( rule__MultipleChoice__ChoiceAssignment_5_5 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getChoiceAssignment_5_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1395:1: ( rule__MultipleChoice__ChoiceAssignment_5_5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1395:2: rule__MultipleChoice__ChoiceAssignment_5_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__ChoiceAssignment_5_5_in_rule__MultipleChoice__Group_5__5__Impl2818);
            rule__MultipleChoice__ChoiceAssignment_5_5();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getChoiceAssignment_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__5__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1405:1: rule__MultipleChoice__Group_5__6 : rule__MultipleChoice__Group_5__6__Impl ;
    public final void rule__MultipleChoice__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1409:1: ( rule__MultipleChoice__Group_5__6__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1410:2: rule__MultipleChoice__Group_5__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5__6__Impl_in_rule__MultipleChoice__Group_5__62848);
            rule__MultipleChoice__Group_5__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__6"


    // $ANTLR start "rule__MultipleChoice__Group_5__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1416:1: rule__MultipleChoice__Group_5__6__Impl : ( ( rule__MultipleChoice__Group_5_6__0 )* ) ;
    public final void rule__MultipleChoice__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1420:1: ( ( ( rule__MultipleChoice__Group_5_6__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:1: ( ( rule__MultipleChoice__Group_5_6__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:1: ( ( rule__MultipleChoice__Group_5_6__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1422:1: ( rule__MultipleChoice__Group_5_6__0 )*
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_5_6()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:1: ( rule__MultipleChoice__Group_5_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    int LA16_2 = input.LA(2);

                    if ( ((LA16_2>=RULE_STRING && LA16_2<=RULE_ID)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:2: rule__MultipleChoice__Group_5_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5_6__0_in_rule__MultipleChoice__Group_5__6__Impl2875);
            	    rule__MultipleChoice__Group_5_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMultipleChoiceAccess().getGroup_5_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5__6__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5_6__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1447:1: rule__MultipleChoice__Group_5_6__0 : rule__MultipleChoice__Group_5_6__0__Impl rule__MultipleChoice__Group_5_6__1 ;
    public final void rule__MultipleChoice__Group_5_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1451:1: ( rule__MultipleChoice__Group_5_6__0__Impl rule__MultipleChoice__Group_5_6__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1452:2: rule__MultipleChoice__Group_5_6__0__Impl rule__MultipleChoice__Group_5_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5_6__0__Impl_in_rule__MultipleChoice__Group_5_6__02920);
            rule__MultipleChoice__Group_5_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5_6__1_in_rule__MultipleChoice__Group_5_6__02923);
            rule__MultipleChoice__Group_5_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5_6__0"


    // $ANTLR start "rule__MultipleChoice__Group_5_6__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1459:1: rule__MultipleChoice__Group_5_6__0__Impl : ( ',' ) ;
    public final void rule__MultipleChoice__Group_5_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1463:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1464:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1464:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1465:1: ','
            {
             before(grammarAccess.getMultipleChoiceAccess().getCommaKeyword_5_6_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MultipleChoice__Group_5_6__0__Impl2951); 
             after(grammarAccess.getMultipleChoiceAccess().getCommaKeyword_5_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5_6__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_5_6__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1478:1: rule__MultipleChoice__Group_5_6__1 : rule__MultipleChoice__Group_5_6__1__Impl ;
    public final void rule__MultipleChoice__Group_5_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1482:1: ( rule__MultipleChoice__Group_5_6__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:2: rule__MultipleChoice__Group_5_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_5_6__1__Impl_in_rule__MultipleChoice__Group_5_6__12982);
            rule__MultipleChoice__Group_5_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5_6__1"


    // $ANTLR start "rule__MultipleChoice__Group_5_6__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1489:1: rule__MultipleChoice__Group_5_6__1__Impl : ( ( rule__MultipleChoice__ChoiceAssignment_5_6_1 ) ) ;
    public final void rule__MultipleChoice__Group_5_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1493:1: ( ( ( rule__MultipleChoice__ChoiceAssignment_5_6_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1494:1: ( ( rule__MultipleChoice__ChoiceAssignment_5_6_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1494:1: ( ( rule__MultipleChoice__ChoiceAssignment_5_6_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1495:1: ( rule__MultipleChoice__ChoiceAssignment_5_6_1 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getChoiceAssignment_5_6_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1496:1: ( rule__MultipleChoice__ChoiceAssignment_5_6_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1496:2: rule__MultipleChoice__ChoiceAssignment_5_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__ChoiceAssignment_5_6_1_in_rule__MultipleChoice__Group_5_6__1__Impl3009);
            rule__MultipleChoice__ChoiceAssignment_5_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getChoiceAssignment_5_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_5_6__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_6__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1510:1: rule__MultipleChoice__Group_6__0 : rule__MultipleChoice__Group_6__0__Impl rule__MultipleChoice__Group_6__1 ;
    public final void rule__MultipleChoice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1514:1: ( rule__MultipleChoice__Group_6__0__Impl rule__MultipleChoice__Group_6__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1515:2: rule__MultipleChoice__Group_6__0__Impl rule__MultipleChoice__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__0__Impl_in_rule__MultipleChoice__Group_6__03043);
            rule__MultipleChoice__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__1_in_rule__MultipleChoice__Group_6__03046);
            rule__MultipleChoice__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__0"


    // $ANTLR start "rule__MultipleChoice__Group_6__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1522:1: rule__MultipleChoice__Group_6__0__Impl : ( 'or' ) ;
    public final void rule__MultipleChoice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1526:1: ( ( 'or' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1527:1: ( 'or' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1527:1: ( 'or' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1528:1: 'or'
            {
             before(grammarAccess.getMultipleChoiceAccess().getOrKeyword_6_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MultipleChoice__Group_6__0__Impl3074); 
             after(grammarAccess.getMultipleChoiceAccess().getOrKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_6__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1541:1: rule__MultipleChoice__Group_6__1 : rule__MultipleChoice__Group_6__1__Impl rule__MultipleChoice__Group_6__2 ;
    public final void rule__MultipleChoice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: ( rule__MultipleChoice__Group_6__1__Impl rule__MultipleChoice__Group_6__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1546:2: rule__MultipleChoice__Group_6__1__Impl rule__MultipleChoice__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__1__Impl_in_rule__MultipleChoice__Group_6__13105);
            rule__MultipleChoice__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__2_in_rule__MultipleChoice__Group_6__13108);
            rule__MultipleChoice__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__1"


    // $ANTLR start "rule__MultipleChoice__Group_6__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1553:1: rule__MultipleChoice__Group_6__1__Impl : ( ( 'free' )? ) ;
    public final void rule__MultipleChoice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1557:1: ( ( ( 'free' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1558:1: ( ( 'free' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1558:1: ( ( 'free' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1559:1: ( 'free' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getFreeKeyword_6_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1560:1: ( 'free' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1561:2: 'free'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__MultipleChoice__Group_6__1__Impl3137); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getFreeKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_6__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1572:1: rule__MultipleChoice__Group_6__2 : rule__MultipleChoice__Group_6__2__Impl rule__MultipleChoice__Group_6__3 ;
    public final void rule__MultipleChoice__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: ( rule__MultipleChoice__Group_6__2__Impl rule__MultipleChoice__Group_6__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1577:2: rule__MultipleChoice__Group_6__2__Impl rule__MultipleChoice__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__2__Impl_in_rule__MultipleChoice__Group_6__23170);
            rule__MultipleChoice__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__3_in_rule__MultipleChoice__Group_6__23173);
            rule__MultipleChoice__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__2"


    // $ANTLR start "rule__MultipleChoice__Group_6__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1584:1: rule__MultipleChoice__Group_6__2__Impl : ( ( 'form' )? ) ;
    public final void rule__MultipleChoice__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1588:1: ( ( ( 'form' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1589:1: ( ( 'form' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1589:1: ( ( 'form' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1590:1: ( 'form' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getFormKeyword_6_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1591:1: ( 'form' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1592:2: 'form'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__MultipleChoice__Group_6__2__Impl3202); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getFormKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__2__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_6__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1603:1: rule__MultipleChoice__Group_6__3 : rule__MultipleChoice__Group_6__3__Impl rule__MultipleChoice__Group_6__4 ;
    public final void rule__MultipleChoice__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1607:1: ( rule__MultipleChoice__Group_6__3__Impl rule__MultipleChoice__Group_6__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1608:2: rule__MultipleChoice__Group_6__3__Impl rule__MultipleChoice__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__3__Impl_in_rule__MultipleChoice__Group_6__33235);
            rule__MultipleChoice__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__4_in_rule__MultipleChoice__Group_6__33238);
            rule__MultipleChoice__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__3"


    // $ANTLR start "rule__MultipleChoice__Group_6__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1615:1: rule__MultipleChoice__Group_6__3__Impl : ( ( 'choice' )? ) ;
    public final void rule__MultipleChoice__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1619:1: ( ( ( 'choice' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1620:1: ( ( 'choice' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1620:1: ( ( 'choice' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1621:1: ( 'choice' )?
            {
             before(grammarAccess.getMultipleChoiceAccess().getChoiceKeyword_6_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1622:1: ( 'choice' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1623:2: 'choice'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__MultipleChoice__Group_6__3__Impl3267); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceAccess().getChoiceKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__3__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_6__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1634:1: rule__MultipleChoice__Group_6__4 : rule__MultipleChoice__Group_6__4__Impl ;
    public final void rule__MultipleChoice__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1638:1: ( rule__MultipleChoice__Group_6__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1639:2: rule__MultipleChoice__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_6__4__Impl_in_rule__MultipleChoice__Group_6__43300);
            rule__MultipleChoice__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__4"


    // $ANTLR start "rule__MultipleChoice__Group_6__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1645:1: rule__MultipleChoice__Group_6__4__Impl : ( ( rule__MultipleChoice__OtherAssignment_6_4 ) ) ;
    public final void rule__MultipleChoice__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1649:1: ( ( ( rule__MultipleChoice__OtherAssignment_6_4 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1650:1: ( ( rule__MultipleChoice__OtherAssignment_6_4 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1650:1: ( ( rule__MultipleChoice__OtherAssignment_6_4 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1651:1: ( rule__MultipleChoice__OtherAssignment_6_4 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getOtherAssignment_6_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1652:1: ( rule__MultipleChoice__OtherAssignment_6_4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1652:2: rule__MultipleChoice__OtherAssignment_6_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__OtherAssignment_6_4_in_rule__MultipleChoice__Group_6__4__Impl3327);
            rule__MultipleChoice__OtherAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getOtherAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_6__4__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_7__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1672:1: rule__MultipleChoice__Group_7__0 : rule__MultipleChoice__Group_7__0__Impl rule__MultipleChoice__Group_7__1 ;
    public final void rule__MultipleChoice__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1676:1: ( rule__MultipleChoice__Group_7__0__Impl rule__MultipleChoice__Group_7__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1677:2: rule__MultipleChoice__Group_7__0__Impl rule__MultipleChoice__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__0__Impl_in_rule__MultipleChoice__Group_7__03367);
            rule__MultipleChoice__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__1_in_rule__MultipleChoice__Group_7__03370);
            rule__MultipleChoice__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__0"


    // $ANTLR start "rule__MultipleChoice__Group_7__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1684:1: rule__MultipleChoice__Group_7__0__Impl : ( 'conditionals' ) ;
    public final void rule__MultipleChoice__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1688:1: ( ( 'conditionals' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1689:1: ( 'conditionals' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1689:1: ( 'conditionals' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1690:1: 'conditionals'
            {
             before(grammarAccess.getMultipleChoiceAccess().getConditionalsKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MultipleChoice__Group_7__0__Impl3398); 
             after(grammarAccess.getMultipleChoiceAccess().getConditionalsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_7__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1703:1: rule__MultipleChoice__Group_7__1 : rule__MultipleChoice__Group_7__1__Impl rule__MultipleChoice__Group_7__2 ;
    public final void rule__MultipleChoice__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1707:1: ( rule__MultipleChoice__Group_7__1__Impl rule__MultipleChoice__Group_7__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1708:2: rule__MultipleChoice__Group_7__1__Impl rule__MultipleChoice__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__1__Impl_in_rule__MultipleChoice__Group_7__13429);
            rule__MultipleChoice__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__2_in_rule__MultipleChoice__Group_7__13432);
            rule__MultipleChoice__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__1"


    // $ANTLR start "rule__MultipleChoice__Group_7__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1715:1: rule__MultipleChoice__Group_7__1__Impl : ( ':' ) ;
    public final void rule__MultipleChoice__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1719:1: ( ( ':' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1720:1: ( ':' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1720:1: ( ':' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1721:1: ':'
            {
             before(grammarAccess.getMultipleChoiceAccess().getColonKeyword_7_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MultipleChoice__Group_7__1__Impl3460); 
             after(grammarAccess.getMultipleChoiceAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_7__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1734:1: rule__MultipleChoice__Group_7__2 : rule__MultipleChoice__Group_7__2__Impl rule__MultipleChoice__Group_7__3 ;
    public final void rule__MultipleChoice__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1738:1: ( rule__MultipleChoice__Group_7__2__Impl rule__MultipleChoice__Group_7__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1739:2: rule__MultipleChoice__Group_7__2__Impl rule__MultipleChoice__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__2__Impl_in_rule__MultipleChoice__Group_7__23491);
            rule__MultipleChoice__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__3_in_rule__MultipleChoice__Group_7__23494);
            rule__MultipleChoice__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__2"


    // $ANTLR start "rule__MultipleChoice__Group_7__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1746:1: rule__MultipleChoice__Group_7__2__Impl : ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_2 ) ) ;
    public final void rule__MultipleChoice__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1750:1: ( ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1751:1: ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1751:1: ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1752:1: ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_2 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksAssignment_7_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1753:1: ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1753:2: rule__MultipleChoice__MultipleChoiceForksAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__MultipleChoiceForksAssignment_7_2_in_rule__MultipleChoice__Group_7__2__Impl3521);
            rule__MultipleChoice__MultipleChoiceForksAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__2__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_7__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1763:1: rule__MultipleChoice__Group_7__3 : rule__MultipleChoice__Group_7__3__Impl ;
    public final void rule__MultipleChoice__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1767:1: ( rule__MultipleChoice__Group_7__3__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1768:2: rule__MultipleChoice__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7__3__Impl_in_rule__MultipleChoice__Group_7__33551);
            rule__MultipleChoice__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__3"


    // $ANTLR start "rule__MultipleChoice__Group_7__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1774:1: rule__MultipleChoice__Group_7__3__Impl : ( ( rule__MultipleChoice__Group_7_3__0 )* ) ;
    public final void rule__MultipleChoice__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1778:1: ( ( ( rule__MultipleChoice__Group_7_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1779:1: ( ( rule__MultipleChoice__Group_7_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1779:1: ( ( rule__MultipleChoice__Group_7_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1780:1: ( rule__MultipleChoice__Group_7_3__0 )*
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup_7_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1781:1: ( rule__MultipleChoice__Group_7_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1781:2: rule__MultipleChoice__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7_3__0_in_rule__MultipleChoice__Group_7__3__Impl3578);
            	    rule__MultipleChoice__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMultipleChoiceAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7__3__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_7_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1799:1: rule__MultipleChoice__Group_7_3__0 : rule__MultipleChoice__Group_7_3__0__Impl rule__MultipleChoice__Group_7_3__1 ;
    public final void rule__MultipleChoice__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1803:1: ( rule__MultipleChoice__Group_7_3__0__Impl rule__MultipleChoice__Group_7_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1804:2: rule__MultipleChoice__Group_7_3__0__Impl rule__MultipleChoice__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7_3__0__Impl_in_rule__MultipleChoice__Group_7_3__03617);
            rule__MultipleChoice__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7_3__1_in_rule__MultipleChoice__Group_7_3__03620);
            rule__MultipleChoice__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7_3__0"


    // $ANTLR start "rule__MultipleChoice__Group_7_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1811:1: rule__MultipleChoice__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__MultipleChoice__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1815:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1816:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1816:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1817:1: ','
            {
             before(grammarAccess.getMultipleChoiceAccess().getCommaKeyword_7_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MultipleChoice__Group_7_3__0__Impl3648); 
             after(grammarAccess.getMultipleChoiceAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7_3__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group_7_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1830:1: rule__MultipleChoice__Group_7_3__1 : rule__MultipleChoice__Group_7_3__1__Impl ;
    public final void rule__MultipleChoice__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1834:1: ( rule__MultipleChoice__Group_7_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1835:2: rule__MultipleChoice__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group_7_3__1__Impl_in_rule__MultipleChoice__Group_7_3__13679);
            rule__MultipleChoice__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7_3__1"


    // $ANTLR start "rule__MultipleChoice__Group_7_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1841:1: rule__MultipleChoice__Group_7_3__1__Impl : ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1 ) ) ;
    public final void rule__MultipleChoice__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1845:1: ( ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1846:1: ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1846:1: ( ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1847:1: ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksAssignment_7_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1848:1: ( rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1848:2: rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1_in_rule__MultipleChoice__Group_7_3__1__Impl3706);
            rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group_7_3__1__Impl"


    // $ANTLR start "rule__Open__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1862:1: rule__Open__Group__0 : rule__Open__Group__0__Impl rule__Open__Group__1 ;
    public final void rule__Open__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1866:1: ( rule__Open__Group__0__Impl rule__Open__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1867:2: rule__Open__Group__0__Impl rule__Open__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__0__Impl_in_rule__Open__Group__03740);
            rule__Open__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__1_in_rule__Open__Group__03743);
            rule__Open__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__0"


    // $ANTLR start "rule__Open__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1874:1: rule__Open__Group__0__Impl : ( () ) ;
    public final void rule__Open__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1878:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1879:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1879:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1880:1: ()
            {
             before(grammarAccess.getOpenAccess().getOpenAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1881:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1883:1: 
            {
            }

             after(grammarAccess.getOpenAccess().getOpenAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__0__Impl"


    // $ANTLR start "rule__Open__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1893:1: rule__Open__Group__1 : rule__Open__Group__1__Impl rule__Open__Group__2 ;
    public final void rule__Open__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1897:1: ( rule__Open__Group__1__Impl rule__Open__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1898:2: rule__Open__Group__1__Impl rule__Open__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__1__Impl_in_rule__Open__Group__13801);
            rule__Open__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__2_in_rule__Open__Group__13804);
            rule__Open__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__1"


    // $ANTLR start "rule__Open__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1905:1: rule__Open__Group__1__Impl : ( 'Open' ) ;
    public final void rule__Open__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1909:1: ( ( 'Open' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1910:1: ( 'Open' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1910:1: ( 'Open' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1911:1: 'Open'
            {
             before(grammarAccess.getOpenAccess().getOpenKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Open__Group__1__Impl3832); 
             after(grammarAccess.getOpenAccess().getOpenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__1__Impl"


    // $ANTLR start "rule__Open__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1924:1: rule__Open__Group__2 : rule__Open__Group__2__Impl rule__Open__Group__3 ;
    public final void rule__Open__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1928:1: ( rule__Open__Group__2__Impl rule__Open__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1929:2: rule__Open__Group__2__Impl rule__Open__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__2__Impl_in_rule__Open__Group__23863);
            rule__Open__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__3_in_rule__Open__Group__23866);
            rule__Open__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__2"


    // $ANTLR start "rule__Open__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1936:1: rule__Open__Group__2__Impl : ( ':' ) ;
    public final void rule__Open__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1940:1: ( ( ':' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1941:1: ( ':' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1941:1: ( ':' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1942:1: ':'
            {
             before(grammarAccess.getOpenAccess().getColonKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Open__Group__2__Impl3894); 
             after(grammarAccess.getOpenAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__2__Impl"


    // $ANTLR start "rule__Open__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1955:1: rule__Open__Group__3 : rule__Open__Group__3__Impl rule__Open__Group__4 ;
    public final void rule__Open__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1959:1: ( rule__Open__Group__3__Impl rule__Open__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:2: rule__Open__Group__3__Impl rule__Open__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__3__Impl_in_rule__Open__Group__33925);
            rule__Open__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__4_in_rule__Open__Group__33928);
            rule__Open__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__3"


    // $ANTLR start "rule__Open__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1967:1: rule__Open__Group__3__Impl : ( ( 'is required' )? ) ;
    public final void rule__Open__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1971:1: ( ( ( 'is required' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1972:1: ( ( 'is required' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1972:1: ( ( 'is required' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1973:1: ( 'is required' )?
            {
             before(grammarAccess.getOpenAccess().getIsRequiredKeyword_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1974:1: ( 'is required' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1975:2: 'is required'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Open__Group__3__Impl3957); 

                    }
                    break;

            }

             after(grammarAccess.getOpenAccess().getIsRequiredKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__3__Impl"


    // $ANTLR start "rule__Open__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1986:1: rule__Open__Group__4 : rule__Open__Group__4__Impl rule__Open__Group__5 ;
    public final void rule__Open__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1990:1: ( rule__Open__Group__4__Impl rule__Open__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1991:2: rule__Open__Group__4__Impl rule__Open__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__4__Impl_in_rule__Open__Group__43990);
            rule__Open__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__5_in_rule__Open__Group__43993);
            rule__Open__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__4"


    // $ANTLR start "rule__Open__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1998:1: rule__Open__Group__4__Impl : ( ( rule__Open__QuestionAssignment_4 )? ) ;
    public final void rule__Open__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2002:1: ( ( ( rule__Open__QuestionAssignment_4 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2003:1: ( ( rule__Open__QuestionAssignment_4 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2003:1: ( ( rule__Open__QuestionAssignment_4 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2004:1: ( rule__Open__QuestionAssignment_4 )?
            {
             before(grammarAccess.getOpenAccess().getQuestionAssignment_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2005:1: ( rule__Open__QuestionAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2005:2: rule__Open__QuestionAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Open__QuestionAssignment_4_in_rule__Open__Group__4__Impl4020);
                    rule__Open__QuestionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpenAccess().getQuestionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__4__Impl"


    // $ANTLR start "rule__Open__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2015:1: rule__Open__Group__5 : rule__Open__Group__5__Impl ;
    public final void rule__Open__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2019:1: ( rule__Open__Group__5__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2020:2: rule__Open__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group__5__Impl_in_rule__Open__Group__54051);
            rule__Open__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__5"


    // $ANTLR start "rule__Open__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2026:1: rule__Open__Group__5__Impl : ( ( rule__Open__Group_5__0 )? ) ;
    public final void rule__Open__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2030:1: ( ( ( rule__Open__Group_5__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2031:1: ( ( rule__Open__Group_5__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2031:1: ( ( rule__Open__Group_5__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2032:1: ( rule__Open__Group_5__0 )?
            {
             before(grammarAccess.getOpenAccess().getGroup_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2033:1: ( rule__Open__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2033:2: rule__Open__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Open__Group_5__0_in_rule__Open__Group__5__Impl4078);
                    rule__Open__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpenAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__5__Impl"


    // $ANTLR start "rule__Open__Group_5__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2055:1: rule__Open__Group_5__0 : rule__Open__Group_5__0__Impl rule__Open__Group_5__1 ;
    public final void rule__Open__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2059:1: ( rule__Open__Group_5__0__Impl rule__Open__Group_5__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2060:2: rule__Open__Group_5__0__Impl rule__Open__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group_5__0__Impl_in_rule__Open__Group_5__04121);
            rule__Open__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Open__Group_5__1_in_rule__Open__Group_5__04124);
            rule__Open__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group_5__0"


    // $ANTLR start "rule__Open__Group_5__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2067:1: rule__Open__Group_5__0__Impl : ( 'AnswerLength' ) ;
    public final void rule__Open__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2071:1: ( ( 'AnswerLength' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2072:1: ( 'AnswerLength' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2072:1: ( 'AnswerLength' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2073:1: 'AnswerLength'
            {
             before(grammarAccess.getOpenAccess().getAnswerLengthKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Open__Group_5__0__Impl4152); 
             after(grammarAccess.getOpenAccess().getAnswerLengthKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group_5__0__Impl"


    // $ANTLR start "rule__Open__Group_5__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2086:1: rule__Open__Group_5__1 : rule__Open__Group_5__1__Impl ;
    public final void rule__Open__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2090:1: ( rule__Open__Group_5__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2091:2: rule__Open__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__Group_5__1__Impl_in_rule__Open__Group_5__14183);
            rule__Open__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group_5__1"


    // $ANTLR start "rule__Open__Group_5__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2097:1: rule__Open__Group_5__1__Impl : ( ( rule__Open__AnswerLengthAssignment_5_1 ) ) ;
    public final void rule__Open__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2101:1: ( ( ( rule__Open__AnswerLengthAssignment_5_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2102:1: ( ( rule__Open__AnswerLengthAssignment_5_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2102:1: ( ( rule__Open__AnswerLengthAssignment_5_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2103:1: ( rule__Open__AnswerLengthAssignment_5_1 )
            {
             before(grammarAccess.getOpenAccess().getAnswerLengthAssignment_5_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2104:1: ( rule__Open__AnswerLengthAssignment_5_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2104:2: rule__Open__AnswerLengthAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Open__AnswerLengthAssignment_5_1_in_rule__Open__Group_5__1__Impl4210);
            rule__Open__AnswerLengthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getAnswerLengthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group_5__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2118:1: rule__Rating_Impl__Group__0 : rule__Rating_Impl__Group__0__Impl rule__Rating_Impl__Group__1 ;
    public final void rule__Rating_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2122:1: ( rule__Rating_Impl__Group__0__Impl rule__Rating_Impl__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2123:2: rule__Rating_Impl__Group__0__Impl rule__Rating_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__0__Impl_in_rule__Rating_Impl__Group__04244);
            rule__Rating_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__1_in_rule__Rating_Impl__Group__04247);
            rule__Rating_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__0"


    // $ANTLR start "rule__Rating_Impl__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2130:1: rule__Rating_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Rating_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2134:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2135:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2135:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2136:1: ()
            {
             before(grammarAccess.getRating_ImplAccess().getRatingAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2137:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2139:1: 
            {
            }

             after(grammarAccess.getRating_ImplAccess().getRatingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2149:1: rule__Rating_Impl__Group__1 : rule__Rating_Impl__Group__1__Impl rule__Rating_Impl__Group__2 ;
    public final void rule__Rating_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2153:1: ( rule__Rating_Impl__Group__1__Impl rule__Rating_Impl__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2154:2: rule__Rating_Impl__Group__1__Impl rule__Rating_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__1__Impl_in_rule__Rating_Impl__Group__14305);
            rule__Rating_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__2_in_rule__Rating_Impl__Group__14308);
            rule__Rating_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__1"


    // $ANTLR start "rule__Rating_Impl__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2161:1: rule__Rating_Impl__Group__1__Impl : ( ( rule__Rating_Impl__RequiredAssignment_1 )? ) ;
    public final void rule__Rating_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2165:1: ( ( ( rule__Rating_Impl__RequiredAssignment_1 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2166:1: ( ( rule__Rating_Impl__RequiredAssignment_1 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2166:1: ( ( rule__Rating_Impl__RequiredAssignment_1 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2167:1: ( rule__Rating_Impl__RequiredAssignment_1 )?
            {
             before(grammarAccess.getRating_ImplAccess().getRequiredAssignment_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2168:1: ( rule__Rating_Impl__RequiredAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2168:2: rule__Rating_Impl__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__RequiredAssignment_1_in_rule__Rating_Impl__Group__1__Impl4335);
                    rule__Rating_Impl__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRating_ImplAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2178:1: rule__Rating_Impl__Group__2 : rule__Rating_Impl__Group__2__Impl rule__Rating_Impl__Group__3 ;
    public final void rule__Rating_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2182:1: ( rule__Rating_Impl__Group__2__Impl rule__Rating_Impl__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2183:2: rule__Rating_Impl__Group__2__Impl rule__Rating_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__2__Impl_in_rule__Rating_Impl__Group__24366);
            rule__Rating_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__3_in_rule__Rating_Impl__Group__24369);
            rule__Rating_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__2"


    // $ANTLR start "rule__Rating_Impl__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2190:1: rule__Rating_Impl__Group__2__Impl : ( 'Rating' ) ;
    public final void rule__Rating_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2194:1: ( ( 'Rating' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2195:1: ( 'Rating' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2195:1: ( 'Rating' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2196:1: 'Rating'
            {
             before(grammarAccess.getRating_ImplAccess().getRatingKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Rating_Impl__Group__2__Impl4397); 
             after(grammarAccess.getRating_ImplAccess().getRatingKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__2__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2209:1: rule__Rating_Impl__Group__3 : rule__Rating_Impl__Group__3__Impl rule__Rating_Impl__Group__4 ;
    public final void rule__Rating_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2213:1: ( rule__Rating_Impl__Group__3__Impl rule__Rating_Impl__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2214:2: rule__Rating_Impl__Group__3__Impl rule__Rating_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__3__Impl_in_rule__Rating_Impl__Group__34428);
            rule__Rating_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__4_in_rule__Rating_Impl__Group__34431);
            rule__Rating_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__3"


    // $ANTLR start "rule__Rating_Impl__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2221:1: rule__Rating_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Rating_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2225:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2226:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2226:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2227:1: '{'
            {
             before(grammarAccess.getRating_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Rating_Impl__Group__3__Impl4459); 
             after(grammarAccess.getRating_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__3__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2240:1: rule__Rating_Impl__Group__4 : rule__Rating_Impl__Group__4__Impl rule__Rating_Impl__Group__5 ;
    public final void rule__Rating_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2244:1: ( rule__Rating_Impl__Group__4__Impl rule__Rating_Impl__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2245:2: rule__Rating_Impl__Group__4__Impl rule__Rating_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__4__Impl_in_rule__Rating_Impl__Group__44490);
            rule__Rating_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__5_in_rule__Rating_Impl__Group__44493);
            rule__Rating_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__4"


    // $ANTLR start "rule__Rating_Impl__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2252:1: rule__Rating_Impl__Group__4__Impl : ( ( rule__Rating_Impl__Group_4__0 )? ) ;
    public final void rule__Rating_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2256:1: ( ( ( rule__Rating_Impl__Group_4__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2257:1: ( ( rule__Rating_Impl__Group_4__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2257:1: ( ( rule__Rating_Impl__Group_4__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2258:1: ( rule__Rating_Impl__Group_4__0 )?
            {
             before(grammarAccess.getRating_ImplAccess().getGroup_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2259:1: ( rule__Rating_Impl__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2259:2: rule__Rating_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_4__0_in_rule__Rating_Impl__Group__4__Impl4520);
                    rule__Rating_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRating_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__4__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2269:1: rule__Rating_Impl__Group__5 : rule__Rating_Impl__Group__5__Impl rule__Rating_Impl__Group__6 ;
    public final void rule__Rating_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2273:1: ( rule__Rating_Impl__Group__5__Impl rule__Rating_Impl__Group__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2274:2: rule__Rating_Impl__Group__5__Impl rule__Rating_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__5__Impl_in_rule__Rating_Impl__Group__54551);
            rule__Rating_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__6_in_rule__Rating_Impl__Group__54554);
            rule__Rating_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__5"


    // $ANTLR start "rule__Rating_Impl__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2281:1: rule__Rating_Impl__Group__5__Impl : ( ( rule__Rating_Impl__Group_5__0 )? ) ;
    public final void rule__Rating_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2285:1: ( ( ( rule__Rating_Impl__Group_5__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2286:1: ( ( rule__Rating_Impl__Group_5__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2286:1: ( ( rule__Rating_Impl__Group_5__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2287:1: ( rule__Rating_Impl__Group_5__0 )?
            {
             before(grammarAccess.getRating_ImplAccess().getGroup_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2288:1: ( rule__Rating_Impl__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2288:2: rule__Rating_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_5__0_in_rule__Rating_Impl__Group__5__Impl4581);
                    rule__Rating_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRating_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__5__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2298:1: rule__Rating_Impl__Group__6 : rule__Rating_Impl__Group__6__Impl rule__Rating_Impl__Group__7 ;
    public final void rule__Rating_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2302:1: ( rule__Rating_Impl__Group__6__Impl rule__Rating_Impl__Group__7 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2303:2: rule__Rating_Impl__Group__6__Impl rule__Rating_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__6__Impl_in_rule__Rating_Impl__Group__64612);
            rule__Rating_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__7_in_rule__Rating_Impl__Group__64615);
            rule__Rating_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__6"


    // $ANTLR start "rule__Rating_Impl__Group__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2310:1: rule__Rating_Impl__Group__6__Impl : ( ( rule__Rating_Impl__Group_6__0 )? ) ;
    public final void rule__Rating_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2314:1: ( ( ( rule__Rating_Impl__Group_6__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2315:1: ( ( rule__Rating_Impl__Group_6__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2315:1: ( ( rule__Rating_Impl__Group_6__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2316:1: ( rule__Rating_Impl__Group_6__0 )?
            {
             before(grammarAccess.getRating_ImplAccess().getGroup_6()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2317:1: ( rule__Rating_Impl__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2317:2: rule__Rating_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_6__0_in_rule__Rating_Impl__Group__6__Impl4642);
                    rule__Rating_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRating_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__6__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__7"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2327:1: rule__Rating_Impl__Group__7 : rule__Rating_Impl__Group__7__Impl rule__Rating_Impl__Group__8 ;
    public final void rule__Rating_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2331:1: ( rule__Rating_Impl__Group__7__Impl rule__Rating_Impl__Group__8 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2332:2: rule__Rating_Impl__Group__7__Impl rule__Rating_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__7__Impl_in_rule__Rating_Impl__Group__74673);
            rule__Rating_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__8_in_rule__Rating_Impl__Group__74676);
            rule__Rating_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__7"


    // $ANTLR start "rule__Rating_Impl__Group__7__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2339:1: rule__Rating_Impl__Group__7__Impl : ( ( rule__Rating_Impl__Group_7__0 )? ) ;
    public final void rule__Rating_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2343:1: ( ( ( rule__Rating_Impl__Group_7__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2344:1: ( ( rule__Rating_Impl__Group_7__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2344:1: ( ( rule__Rating_Impl__Group_7__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2345:1: ( rule__Rating_Impl__Group_7__0 )?
            {
             before(grammarAccess.getRating_ImplAccess().getGroup_7()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2346:1: ( rule__Rating_Impl__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2346:2: rule__Rating_Impl__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_7__0_in_rule__Rating_Impl__Group__7__Impl4703);
                    rule__Rating_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRating_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__7__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__8"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2356:1: rule__Rating_Impl__Group__8 : rule__Rating_Impl__Group__8__Impl rule__Rating_Impl__Group__9 ;
    public final void rule__Rating_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2360:1: ( rule__Rating_Impl__Group__8__Impl rule__Rating_Impl__Group__9 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2361:2: rule__Rating_Impl__Group__8__Impl rule__Rating_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__8__Impl_in_rule__Rating_Impl__Group__84734);
            rule__Rating_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__9_in_rule__Rating_Impl__Group__84737);
            rule__Rating_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__8"


    // $ANTLR start "rule__Rating_Impl__Group__8__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2368:1: rule__Rating_Impl__Group__8__Impl : ( ( rule__Rating_Impl__Group_8__0 )? ) ;
    public final void rule__Rating_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2372:1: ( ( ( rule__Rating_Impl__Group_8__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2373:1: ( ( rule__Rating_Impl__Group_8__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2373:1: ( ( rule__Rating_Impl__Group_8__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2374:1: ( rule__Rating_Impl__Group_8__0 )?
            {
             before(grammarAccess.getRating_ImplAccess().getGroup_8()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2375:1: ( rule__Rating_Impl__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2375:2: rule__Rating_Impl__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_8__0_in_rule__Rating_Impl__Group__8__Impl4764);
                    rule__Rating_Impl__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRating_ImplAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__8__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__9"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2385:1: rule__Rating_Impl__Group__9 : rule__Rating_Impl__Group__9__Impl rule__Rating_Impl__Group__10 ;
    public final void rule__Rating_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2389:1: ( rule__Rating_Impl__Group__9__Impl rule__Rating_Impl__Group__10 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2390:2: rule__Rating_Impl__Group__9__Impl rule__Rating_Impl__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__9__Impl_in_rule__Rating_Impl__Group__94795);
            rule__Rating_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__10_in_rule__Rating_Impl__Group__94798);
            rule__Rating_Impl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__9"


    // $ANTLR start "rule__Rating_Impl__Group__9__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2397:1: rule__Rating_Impl__Group__9__Impl : ( ( rule__Rating_Impl__Group_9__0 )? ) ;
    public final void rule__Rating_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2401:1: ( ( ( rule__Rating_Impl__Group_9__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2402:1: ( ( rule__Rating_Impl__Group_9__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2402:1: ( ( rule__Rating_Impl__Group_9__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2403:1: ( rule__Rating_Impl__Group_9__0 )?
            {
             before(grammarAccess.getRating_ImplAccess().getGroup_9()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2404:1: ( rule__Rating_Impl__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2404:2: rule__Rating_Impl__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__0_in_rule__Rating_Impl__Group__9__Impl4825);
                    rule__Rating_Impl__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRating_ImplAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__9__Impl"


    // $ANTLR start "rule__Rating_Impl__Group__10"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2414:1: rule__Rating_Impl__Group__10 : rule__Rating_Impl__Group__10__Impl ;
    public final void rule__Rating_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2418:1: ( rule__Rating_Impl__Group__10__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2419:2: rule__Rating_Impl__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group__10__Impl_in_rule__Rating_Impl__Group__104856);
            rule__Rating_Impl__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__10"


    // $ANTLR start "rule__Rating_Impl__Group__10__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2425:1: rule__Rating_Impl__Group__10__Impl : ( '}' ) ;
    public final void rule__Rating_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2429:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2430:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2430:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2431:1: '}'
            {
             before(grammarAccess.getRating_ImplAccess().getRightCurlyBracketKeyword_10()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Rating_Impl__Group__10__Impl4884); 
             after(grammarAccess.getRating_ImplAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group__10__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_4__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2466:1: rule__Rating_Impl__Group_4__0 : rule__Rating_Impl__Group_4__0__Impl rule__Rating_Impl__Group_4__1 ;
    public final void rule__Rating_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2470:1: ( rule__Rating_Impl__Group_4__0__Impl rule__Rating_Impl__Group_4__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2471:2: rule__Rating_Impl__Group_4__0__Impl rule__Rating_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_4__0__Impl_in_rule__Rating_Impl__Group_4__04937);
            rule__Rating_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_4__1_in_rule__Rating_Impl__Group_4__04940);
            rule__Rating_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_4__0"


    // $ANTLR start "rule__Rating_Impl__Group_4__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2478:1: rule__Rating_Impl__Group_4__0__Impl : ( 'question' ) ;
    public final void rule__Rating_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2482:1: ( ( 'question' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2483:1: ( 'question' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2483:1: ( 'question' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2484:1: 'question'
            {
             before(grammarAccess.getRating_ImplAccess().getQuestionKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Rating_Impl__Group_4__0__Impl4968); 
             after(grammarAccess.getRating_ImplAccess().getQuestionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_4__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2497:1: rule__Rating_Impl__Group_4__1 : rule__Rating_Impl__Group_4__1__Impl ;
    public final void rule__Rating_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2501:1: ( rule__Rating_Impl__Group_4__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2502:2: rule__Rating_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_4__1__Impl_in_rule__Rating_Impl__Group_4__14999);
            rule__Rating_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_4__1"


    // $ANTLR start "rule__Rating_Impl__Group_4__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2508:1: rule__Rating_Impl__Group_4__1__Impl : ( ( rule__Rating_Impl__QuestionAssignment_4_1 ) ) ;
    public final void rule__Rating_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2512:1: ( ( ( rule__Rating_Impl__QuestionAssignment_4_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2513:1: ( ( rule__Rating_Impl__QuestionAssignment_4_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2513:1: ( ( rule__Rating_Impl__QuestionAssignment_4_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2514:1: ( rule__Rating_Impl__QuestionAssignment_4_1 )
            {
             before(grammarAccess.getRating_ImplAccess().getQuestionAssignment_4_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2515:1: ( rule__Rating_Impl__QuestionAssignment_4_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2515:2: rule__Rating_Impl__QuestionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__QuestionAssignment_4_1_in_rule__Rating_Impl__Group_4__1__Impl5026);
            rule__Rating_Impl__QuestionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getQuestionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_5__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2529:1: rule__Rating_Impl__Group_5__0 : rule__Rating_Impl__Group_5__0__Impl rule__Rating_Impl__Group_5__1 ;
    public final void rule__Rating_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2533:1: ( rule__Rating_Impl__Group_5__0__Impl rule__Rating_Impl__Group_5__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2534:2: rule__Rating_Impl__Group_5__0__Impl rule__Rating_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_5__0__Impl_in_rule__Rating_Impl__Group_5__05060);
            rule__Rating_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_5__1_in_rule__Rating_Impl__Group_5__05063);
            rule__Rating_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_5__0"


    // $ANTLR start "rule__Rating_Impl__Group_5__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2541:1: rule__Rating_Impl__Group_5__0__Impl : ( 'Min' ) ;
    public final void rule__Rating_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2545:1: ( ( 'Min' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2546:1: ( 'Min' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2546:1: ( 'Min' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2547:1: 'Min'
            {
             before(grammarAccess.getRating_ImplAccess().getMinKeyword_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Rating_Impl__Group_5__0__Impl5091); 
             after(grammarAccess.getRating_ImplAccess().getMinKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_5__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2560:1: rule__Rating_Impl__Group_5__1 : rule__Rating_Impl__Group_5__1__Impl ;
    public final void rule__Rating_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2564:1: ( rule__Rating_Impl__Group_5__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2565:2: rule__Rating_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_5__1__Impl_in_rule__Rating_Impl__Group_5__15122);
            rule__Rating_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_5__1"


    // $ANTLR start "rule__Rating_Impl__Group_5__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2571:1: rule__Rating_Impl__Group_5__1__Impl : ( ( rule__Rating_Impl__MinAssignment_5_1 ) ) ;
    public final void rule__Rating_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2575:1: ( ( ( rule__Rating_Impl__MinAssignment_5_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2576:1: ( ( rule__Rating_Impl__MinAssignment_5_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2576:1: ( ( rule__Rating_Impl__MinAssignment_5_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2577:1: ( rule__Rating_Impl__MinAssignment_5_1 )
            {
             before(grammarAccess.getRating_ImplAccess().getMinAssignment_5_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2578:1: ( rule__Rating_Impl__MinAssignment_5_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2578:2: rule__Rating_Impl__MinAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__MinAssignment_5_1_in_rule__Rating_Impl__Group_5__1__Impl5149);
            rule__Rating_Impl__MinAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getMinAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_6__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2592:1: rule__Rating_Impl__Group_6__0 : rule__Rating_Impl__Group_6__0__Impl rule__Rating_Impl__Group_6__1 ;
    public final void rule__Rating_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2596:1: ( rule__Rating_Impl__Group_6__0__Impl rule__Rating_Impl__Group_6__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2597:2: rule__Rating_Impl__Group_6__0__Impl rule__Rating_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_6__0__Impl_in_rule__Rating_Impl__Group_6__05183);
            rule__Rating_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_6__1_in_rule__Rating_Impl__Group_6__05186);
            rule__Rating_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_6__0"


    // $ANTLR start "rule__Rating_Impl__Group_6__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2604:1: rule__Rating_Impl__Group_6__0__Impl : ( 'Max' ) ;
    public final void rule__Rating_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2608:1: ( ( 'Max' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2609:1: ( 'Max' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2609:1: ( 'Max' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2610:1: 'Max'
            {
             before(grammarAccess.getRating_ImplAccess().getMaxKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Rating_Impl__Group_6__0__Impl5214); 
             after(grammarAccess.getRating_ImplAccess().getMaxKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_6__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2623:1: rule__Rating_Impl__Group_6__1 : rule__Rating_Impl__Group_6__1__Impl ;
    public final void rule__Rating_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2627:1: ( rule__Rating_Impl__Group_6__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2628:2: rule__Rating_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_6__1__Impl_in_rule__Rating_Impl__Group_6__15245);
            rule__Rating_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_6__1"


    // $ANTLR start "rule__Rating_Impl__Group_6__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2634:1: rule__Rating_Impl__Group_6__1__Impl : ( ( rule__Rating_Impl__MaxAssignment_6_1 ) ) ;
    public final void rule__Rating_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2638:1: ( ( ( rule__Rating_Impl__MaxAssignment_6_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2639:1: ( ( rule__Rating_Impl__MaxAssignment_6_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2639:1: ( ( rule__Rating_Impl__MaxAssignment_6_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2640:1: ( rule__Rating_Impl__MaxAssignment_6_1 )
            {
             before(grammarAccess.getRating_ImplAccess().getMaxAssignment_6_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2641:1: ( rule__Rating_Impl__MaxAssignment_6_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2641:2: rule__Rating_Impl__MaxAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__MaxAssignment_6_1_in_rule__Rating_Impl__Group_6__1__Impl5272);
            rule__Rating_Impl__MaxAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getMaxAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_7__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2655:1: rule__Rating_Impl__Group_7__0 : rule__Rating_Impl__Group_7__0__Impl rule__Rating_Impl__Group_7__1 ;
    public final void rule__Rating_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2659:1: ( rule__Rating_Impl__Group_7__0__Impl rule__Rating_Impl__Group_7__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2660:2: rule__Rating_Impl__Group_7__0__Impl rule__Rating_Impl__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_7__0__Impl_in_rule__Rating_Impl__Group_7__05306);
            rule__Rating_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_7__1_in_rule__Rating_Impl__Group_7__05309);
            rule__Rating_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_7__0"


    // $ANTLR start "rule__Rating_Impl__Group_7__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2667:1: rule__Rating_Impl__Group_7__0__Impl : ( 'first' ) ;
    public final void rule__Rating_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2671:1: ( ( 'first' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2672:1: ( 'first' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2672:1: ( 'first' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2673:1: 'first'
            {
             before(grammarAccess.getRating_ImplAccess().getFirstKeyword_7_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Rating_Impl__Group_7__0__Impl5337); 
             after(grammarAccess.getRating_ImplAccess().getFirstKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_7__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2686:1: rule__Rating_Impl__Group_7__1 : rule__Rating_Impl__Group_7__1__Impl ;
    public final void rule__Rating_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2690:1: ( rule__Rating_Impl__Group_7__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2691:2: rule__Rating_Impl__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_7__1__Impl_in_rule__Rating_Impl__Group_7__15368);
            rule__Rating_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_7__1"


    // $ANTLR start "rule__Rating_Impl__Group_7__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2697:1: rule__Rating_Impl__Group_7__1__Impl : ( ( rule__Rating_Impl__FirstAssignment_7_1 ) ) ;
    public final void rule__Rating_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2701:1: ( ( ( rule__Rating_Impl__FirstAssignment_7_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2702:1: ( ( rule__Rating_Impl__FirstAssignment_7_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2702:1: ( ( rule__Rating_Impl__FirstAssignment_7_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2703:1: ( rule__Rating_Impl__FirstAssignment_7_1 )
            {
             before(grammarAccess.getRating_ImplAccess().getFirstAssignment_7_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2704:1: ( rule__Rating_Impl__FirstAssignment_7_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2704:2: rule__Rating_Impl__FirstAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__FirstAssignment_7_1_in_rule__Rating_Impl__Group_7__1__Impl5395);
            rule__Rating_Impl__FirstAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getFirstAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_8__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2718:1: rule__Rating_Impl__Group_8__0 : rule__Rating_Impl__Group_8__0__Impl rule__Rating_Impl__Group_8__1 ;
    public final void rule__Rating_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2722:1: ( rule__Rating_Impl__Group_8__0__Impl rule__Rating_Impl__Group_8__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2723:2: rule__Rating_Impl__Group_8__0__Impl rule__Rating_Impl__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_8__0__Impl_in_rule__Rating_Impl__Group_8__05429);
            rule__Rating_Impl__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_8__1_in_rule__Rating_Impl__Group_8__05432);
            rule__Rating_Impl__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_8__0"


    // $ANTLR start "rule__Rating_Impl__Group_8__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2730:1: rule__Rating_Impl__Group_8__0__Impl : ( 'last' ) ;
    public final void rule__Rating_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2734:1: ( ( 'last' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2735:1: ( 'last' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2735:1: ( 'last' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2736:1: 'last'
            {
             before(grammarAccess.getRating_ImplAccess().getLastKeyword_8_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Rating_Impl__Group_8__0__Impl5460); 
             after(grammarAccess.getRating_ImplAccess().getLastKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_8__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_8__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2749:1: rule__Rating_Impl__Group_8__1 : rule__Rating_Impl__Group_8__1__Impl ;
    public final void rule__Rating_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2753:1: ( rule__Rating_Impl__Group_8__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2754:2: rule__Rating_Impl__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_8__1__Impl_in_rule__Rating_Impl__Group_8__15491);
            rule__Rating_Impl__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_8__1"


    // $ANTLR start "rule__Rating_Impl__Group_8__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2760:1: rule__Rating_Impl__Group_8__1__Impl : ( ( rule__Rating_Impl__LastAssignment_8_1 ) ) ;
    public final void rule__Rating_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2764:1: ( ( ( rule__Rating_Impl__LastAssignment_8_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2765:1: ( ( rule__Rating_Impl__LastAssignment_8_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2765:1: ( ( rule__Rating_Impl__LastAssignment_8_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2766:1: ( rule__Rating_Impl__LastAssignment_8_1 )
            {
             before(grammarAccess.getRating_ImplAccess().getLastAssignment_8_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2767:1: ( rule__Rating_Impl__LastAssignment_8_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2767:2: rule__Rating_Impl__LastAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__LastAssignment_8_1_in_rule__Rating_Impl__Group_8__1__Impl5518);
            rule__Rating_Impl__LastAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getLastAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_8__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_9__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2781:1: rule__Rating_Impl__Group_9__0 : rule__Rating_Impl__Group_9__0__Impl rule__Rating_Impl__Group_9__1 ;
    public final void rule__Rating_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2785:1: ( rule__Rating_Impl__Group_9__0__Impl rule__Rating_Impl__Group_9__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2786:2: rule__Rating_Impl__Group_9__0__Impl rule__Rating_Impl__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__0__Impl_in_rule__Rating_Impl__Group_9__05552);
            rule__Rating_Impl__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__1_in_rule__Rating_Impl__Group_9__05555);
            rule__Rating_Impl__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__0"


    // $ANTLR start "rule__Rating_Impl__Group_9__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2793:1: rule__Rating_Impl__Group_9__0__Impl : ( 'RatingForks' ) ;
    public final void rule__Rating_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2797:1: ( ( 'RatingForks' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2798:1: ( 'RatingForks' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2798:1: ( 'RatingForks' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2799:1: 'RatingForks'
            {
             before(grammarAccess.getRating_ImplAccess().getRatingForksKeyword_9_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Rating_Impl__Group_9__0__Impl5583); 
             after(grammarAccess.getRating_ImplAccess().getRatingForksKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_9__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2812:1: rule__Rating_Impl__Group_9__1 : rule__Rating_Impl__Group_9__1__Impl rule__Rating_Impl__Group_9__2 ;
    public final void rule__Rating_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2816:1: ( rule__Rating_Impl__Group_9__1__Impl rule__Rating_Impl__Group_9__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2817:2: rule__Rating_Impl__Group_9__1__Impl rule__Rating_Impl__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__1__Impl_in_rule__Rating_Impl__Group_9__15614);
            rule__Rating_Impl__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__2_in_rule__Rating_Impl__Group_9__15617);
            rule__Rating_Impl__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__1"


    // $ANTLR start "rule__Rating_Impl__Group_9__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2824:1: rule__Rating_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Rating_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2828:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2829:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2829:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2830:1: '{'
            {
             before(grammarAccess.getRating_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Rating_Impl__Group_9__1__Impl5645); 
             after(grammarAccess.getRating_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__1__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_9__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2843:1: rule__Rating_Impl__Group_9__2 : rule__Rating_Impl__Group_9__2__Impl rule__Rating_Impl__Group_9__3 ;
    public final void rule__Rating_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2847:1: ( rule__Rating_Impl__Group_9__2__Impl rule__Rating_Impl__Group_9__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2848:2: rule__Rating_Impl__Group_9__2__Impl rule__Rating_Impl__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__2__Impl_in_rule__Rating_Impl__Group_9__25676);
            rule__Rating_Impl__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__3_in_rule__Rating_Impl__Group_9__25679);
            rule__Rating_Impl__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__2"


    // $ANTLR start "rule__Rating_Impl__Group_9__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2855:1: rule__Rating_Impl__Group_9__2__Impl : ( ( rule__Rating_Impl__RatingForksAssignment_9_2 ) ) ;
    public final void rule__Rating_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2859:1: ( ( ( rule__Rating_Impl__RatingForksAssignment_9_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2860:1: ( ( rule__Rating_Impl__RatingForksAssignment_9_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2860:1: ( ( rule__Rating_Impl__RatingForksAssignment_9_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2861:1: ( rule__Rating_Impl__RatingForksAssignment_9_2 )
            {
             before(grammarAccess.getRating_ImplAccess().getRatingForksAssignment_9_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2862:1: ( rule__Rating_Impl__RatingForksAssignment_9_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2862:2: rule__Rating_Impl__RatingForksAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__RatingForksAssignment_9_2_in_rule__Rating_Impl__Group_9__2__Impl5706);
            rule__Rating_Impl__RatingForksAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getRatingForksAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__2__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_9__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2872:1: rule__Rating_Impl__Group_9__3 : rule__Rating_Impl__Group_9__3__Impl rule__Rating_Impl__Group_9__4 ;
    public final void rule__Rating_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2876:1: ( rule__Rating_Impl__Group_9__3__Impl rule__Rating_Impl__Group_9__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2877:2: rule__Rating_Impl__Group_9__3__Impl rule__Rating_Impl__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__3__Impl_in_rule__Rating_Impl__Group_9__35736);
            rule__Rating_Impl__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__4_in_rule__Rating_Impl__Group_9__35739);
            rule__Rating_Impl__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__3"


    // $ANTLR start "rule__Rating_Impl__Group_9__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2884:1: rule__Rating_Impl__Group_9__3__Impl : ( ( rule__Rating_Impl__Group_9_3__0 )* ) ;
    public final void rule__Rating_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2888:1: ( ( ( rule__Rating_Impl__Group_9_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2889:1: ( ( rule__Rating_Impl__Group_9_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2889:1: ( ( rule__Rating_Impl__Group_9_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2890:1: ( rule__Rating_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getRating_ImplAccess().getGroup_9_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2891:1: ( rule__Rating_Impl__Group_9_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==13) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2891:2: rule__Rating_Impl__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9_3__0_in_rule__Rating_Impl__Group_9__3__Impl5766);
            	    rule__Rating_Impl__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRating_ImplAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__3__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_9__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2901:1: rule__Rating_Impl__Group_9__4 : rule__Rating_Impl__Group_9__4__Impl ;
    public final void rule__Rating_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2905:1: ( rule__Rating_Impl__Group_9__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2906:2: rule__Rating_Impl__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9__4__Impl_in_rule__Rating_Impl__Group_9__45797);
            rule__Rating_Impl__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__4"


    // $ANTLR start "rule__Rating_Impl__Group_9__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2912:1: rule__Rating_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Rating_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2916:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2917:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2917:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2918:1: '}'
            {
             before(grammarAccess.getRating_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Rating_Impl__Group_9__4__Impl5825); 
             after(grammarAccess.getRating_ImplAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9__4__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_9_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2941:1: rule__Rating_Impl__Group_9_3__0 : rule__Rating_Impl__Group_9_3__0__Impl rule__Rating_Impl__Group_9_3__1 ;
    public final void rule__Rating_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2945:1: ( rule__Rating_Impl__Group_9_3__0__Impl rule__Rating_Impl__Group_9_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2946:2: rule__Rating_Impl__Group_9_3__0__Impl rule__Rating_Impl__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9_3__0__Impl_in_rule__Rating_Impl__Group_9_3__05866);
            rule__Rating_Impl__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9_3__1_in_rule__Rating_Impl__Group_9_3__05869);
            rule__Rating_Impl__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9_3__0"


    // $ANTLR start "rule__Rating_Impl__Group_9_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2953:1: rule__Rating_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Rating_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2957:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2958:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2958:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2959:1: ','
            {
             before(grammarAccess.getRating_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Rating_Impl__Group_9_3__0__Impl5897); 
             after(grammarAccess.getRating_ImplAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9_3__0__Impl"


    // $ANTLR start "rule__Rating_Impl__Group_9_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2972:1: rule__Rating_Impl__Group_9_3__1 : rule__Rating_Impl__Group_9_3__1__Impl ;
    public final void rule__Rating_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2976:1: ( rule__Rating_Impl__Group_9_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2977:2: rule__Rating_Impl__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__Group_9_3__1__Impl_in_rule__Rating_Impl__Group_9_3__15928);
            rule__Rating_Impl__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9_3__1"


    // $ANTLR start "rule__Rating_Impl__Group_9_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2983:1: rule__Rating_Impl__Group_9_3__1__Impl : ( ( rule__Rating_Impl__RatingForksAssignment_9_3_1 ) ) ;
    public final void rule__Rating_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2987:1: ( ( ( rule__Rating_Impl__RatingForksAssignment_9_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2988:1: ( ( rule__Rating_Impl__RatingForksAssignment_9_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2988:1: ( ( rule__Rating_Impl__RatingForksAssignment_9_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2989:1: ( rule__Rating_Impl__RatingForksAssignment_9_3_1 )
            {
             before(grammarAccess.getRating_ImplAccess().getRatingForksAssignment_9_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2990:1: ( rule__Rating_Impl__RatingForksAssignment_9_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2990:2: rule__Rating_Impl__RatingForksAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating_Impl__RatingForksAssignment_9_3_1_in_rule__Rating_Impl__Group_9_3__1__Impl5955);
            rule__Rating_Impl__RatingForksAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRating_ImplAccess().getRatingForksAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__Group_9_3__1__Impl"


    // $ANTLR start "rule__Ranking__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3004:1: rule__Ranking__Group__0 : rule__Ranking__Group__0__Impl rule__Ranking__Group__1 ;
    public final void rule__Ranking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3008:1: ( rule__Ranking__Group__0__Impl rule__Ranking__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3009:2: rule__Ranking__Group__0__Impl rule__Ranking__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__0__Impl_in_rule__Ranking__Group__05989);
            rule__Ranking__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__1_in_rule__Ranking__Group__05992);
            rule__Ranking__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__0"


    // $ANTLR start "rule__Ranking__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3016:1: rule__Ranking__Group__0__Impl : ( ( rule__Ranking__RequiredAssignment_0 )? ) ;
    public final void rule__Ranking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3020:1: ( ( ( rule__Ranking__RequiredAssignment_0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3021:1: ( ( rule__Ranking__RequiredAssignment_0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3021:1: ( ( rule__Ranking__RequiredAssignment_0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3022:1: ( rule__Ranking__RequiredAssignment_0 )?
            {
             before(grammarAccess.getRankingAccess().getRequiredAssignment_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3023:1: ( rule__Ranking__RequiredAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3023:2: rule__Ranking__RequiredAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ranking__RequiredAssignment_0_in_rule__Ranking__Group__0__Impl6019);
                    rule__Ranking__RequiredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRankingAccess().getRequiredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__0__Impl"


    // $ANTLR start "rule__Ranking__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3033:1: rule__Ranking__Group__1 : rule__Ranking__Group__1__Impl rule__Ranking__Group__2 ;
    public final void rule__Ranking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3037:1: ( rule__Ranking__Group__1__Impl rule__Ranking__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3038:2: rule__Ranking__Group__1__Impl rule__Ranking__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__1__Impl_in_rule__Ranking__Group__16050);
            rule__Ranking__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__2_in_rule__Ranking__Group__16053);
            rule__Ranking__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__1"


    // $ANTLR start "rule__Ranking__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3045:1: rule__Ranking__Group__1__Impl : ( 'Ranking' ) ;
    public final void rule__Ranking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3049:1: ( ( 'Ranking' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3050:1: ( 'Ranking' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3050:1: ( 'Ranking' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3051:1: 'Ranking'
            {
             before(grammarAccess.getRankingAccess().getRankingKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Ranking__Group__1__Impl6081); 
             after(grammarAccess.getRankingAccess().getRankingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__1__Impl"


    // $ANTLR start "rule__Ranking__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3064:1: rule__Ranking__Group__2 : rule__Ranking__Group__2__Impl rule__Ranking__Group__3 ;
    public final void rule__Ranking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3068:1: ( rule__Ranking__Group__2__Impl rule__Ranking__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3069:2: rule__Ranking__Group__2__Impl rule__Ranking__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__2__Impl_in_rule__Ranking__Group__26112);
            rule__Ranking__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__3_in_rule__Ranking__Group__26115);
            rule__Ranking__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__2"


    // $ANTLR start "rule__Ranking__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3076:1: rule__Ranking__Group__2__Impl : ( '{' ) ;
    public final void rule__Ranking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3080:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3081:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3081:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3082:1: '{'
            {
             before(grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Ranking__Group__2__Impl6143); 
             after(grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__2__Impl"


    // $ANTLR start "rule__Ranking__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3095:1: rule__Ranking__Group__3 : rule__Ranking__Group__3__Impl rule__Ranking__Group__4 ;
    public final void rule__Ranking__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3099:1: ( rule__Ranking__Group__3__Impl rule__Ranking__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3100:2: rule__Ranking__Group__3__Impl rule__Ranking__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__3__Impl_in_rule__Ranking__Group__36174);
            rule__Ranking__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__4_in_rule__Ranking__Group__36177);
            rule__Ranking__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__3"


    // $ANTLR start "rule__Ranking__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3107:1: rule__Ranking__Group__3__Impl : ( ( rule__Ranking__Group_3__0 )? ) ;
    public final void rule__Ranking__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3111:1: ( ( ( rule__Ranking__Group_3__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3112:1: ( ( rule__Ranking__Group_3__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3112:1: ( ( rule__Ranking__Group_3__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3113:1: ( rule__Ranking__Group_3__0 )?
            {
             before(grammarAccess.getRankingAccess().getGroup_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3114:1: ( rule__Ranking__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3114:2: rule__Ranking__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_3__0_in_rule__Ranking__Group__3__Impl6204);
                    rule__Ranking__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRankingAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__3__Impl"


    // $ANTLR start "rule__Ranking__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3124:1: rule__Ranking__Group__4 : rule__Ranking__Group__4__Impl rule__Ranking__Group__5 ;
    public final void rule__Ranking__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3128:1: ( rule__Ranking__Group__4__Impl rule__Ranking__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3129:2: rule__Ranking__Group__4__Impl rule__Ranking__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__4__Impl_in_rule__Ranking__Group__46235);
            rule__Ranking__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__5_in_rule__Ranking__Group__46238);
            rule__Ranking__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__4"


    // $ANTLR start "rule__Ranking__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3136:1: rule__Ranking__Group__4__Impl : ( ( rule__Ranking__Group_4__0 )? ) ;
    public final void rule__Ranking__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3140:1: ( ( ( rule__Ranking__Group_4__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3141:1: ( ( rule__Ranking__Group_4__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3141:1: ( ( rule__Ranking__Group_4__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3142:1: ( rule__Ranking__Group_4__0 )?
            {
             before(grammarAccess.getRankingAccess().getGroup_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3143:1: ( rule__Ranking__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3143:2: rule__Ranking__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__0_in_rule__Ranking__Group__4__Impl6265);
                    rule__Ranking__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRankingAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__4__Impl"


    // $ANTLR start "rule__Ranking__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3153:1: rule__Ranking__Group__5 : rule__Ranking__Group__5__Impl rule__Ranking__Group__6 ;
    public final void rule__Ranking__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3157:1: ( rule__Ranking__Group__5__Impl rule__Ranking__Group__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3158:2: rule__Ranking__Group__5__Impl rule__Ranking__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__5__Impl_in_rule__Ranking__Group__56296);
            rule__Ranking__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__6_in_rule__Ranking__Group__56299);
            rule__Ranking__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__5"


    // $ANTLR start "rule__Ranking__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3165:1: rule__Ranking__Group__5__Impl : ( 'choices' ) ;
    public final void rule__Ranking__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3169:1: ( ( 'choices' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3170:1: ( 'choices' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3170:1: ( 'choices' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3171:1: 'choices'
            {
             before(grammarAccess.getRankingAccess().getChoicesKeyword_5()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Ranking__Group__5__Impl6327); 
             after(grammarAccess.getRankingAccess().getChoicesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__5__Impl"


    // $ANTLR start "rule__Ranking__Group__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3184:1: rule__Ranking__Group__6 : rule__Ranking__Group__6__Impl rule__Ranking__Group__7 ;
    public final void rule__Ranking__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3188:1: ( rule__Ranking__Group__6__Impl rule__Ranking__Group__7 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3189:2: rule__Ranking__Group__6__Impl rule__Ranking__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__6__Impl_in_rule__Ranking__Group__66358);
            rule__Ranking__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__7_in_rule__Ranking__Group__66361);
            rule__Ranking__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__6"


    // $ANTLR start "rule__Ranking__Group__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3196:1: rule__Ranking__Group__6__Impl : ( '{' ) ;
    public final void rule__Ranking__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3200:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3201:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3201:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3202:1: '{'
            {
             before(grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Ranking__Group__6__Impl6389); 
             after(grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__6__Impl"


    // $ANTLR start "rule__Ranking__Group__7"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3215:1: rule__Ranking__Group__7 : rule__Ranking__Group__7__Impl rule__Ranking__Group__8 ;
    public final void rule__Ranking__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3219:1: ( rule__Ranking__Group__7__Impl rule__Ranking__Group__8 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3220:2: rule__Ranking__Group__7__Impl rule__Ranking__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__7__Impl_in_rule__Ranking__Group__76420);
            rule__Ranking__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__8_in_rule__Ranking__Group__76423);
            rule__Ranking__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__7"


    // $ANTLR start "rule__Ranking__Group__7__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3227:1: rule__Ranking__Group__7__Impl : ( ( rule__Ranking__ChoicesAssignment_7 ) ) ;
    public final void rule__Ranking__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3231:1: ( ( ( rule__Ranking__ChoicesAssignment_7 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3232:1: ( ( rule__Ranking__ChoicesAssignment_7 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3232:1: ( ( rule__Ranking__ChoicesAssignment_7 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3233:1: ( rule__Ranking__ChoicesAssignment_7 )
            {
             before(grammarAccess.getRankingAccess().getChoicesAssignment_7()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3234:1: ( rule__Ranking__ChoicesAssignment_7 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3234:2: rule__Ranking__ChoicesAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__ChoicesAssignment_7_in_rule__Ranking__Group__7__Impl6450);
            rule__Ranking__ChoicesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getChoicesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__7__Impl"


    // $ANTLR start "rule__Ranking__Group__8"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3244:1: rule__Ranking__Group__8 : rule__Ranking__Group__8__Impl rule__Ranking__Group__9 ;
    public final void rule__Ranking__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3248:1: ( rule__Ranking__Group__8__Impl rule__Ranking__Group__9 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3249:2: rule__Ranking__Group__8__Impl rule__Ranking__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__8__Impl_in_rule__Ranking__Group__86480);
            rule__Ranking__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__9_in_rule__Ranking__Group__86483);
            rule__Ranking__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__8"


    // $ANTLR start "rule__Ranking__Group__8__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3256:1: rule__Ranking__Group__8__Impl : ( ( rule__Ranking__Group_8__0 )* ) ;
    public final void rule__Ranking__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3260:1: ( ( ( rule__Ranking__Group_8__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3261:1: ( ( rule__Ranking__Group_8__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3261:1: ( ( rule__Ranking__Group_8__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3262:1: ( rule__Ranking__Group_8__0 )*
            {
             before(grammarAccess.getRankingAccess().getGroup_8()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3263:1: ( rule__Ranking__Group_8__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==13) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3263:2: rule__Ranking__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_8__0_in_rule__Ranking__Group__8__Impl6510);
            	    rule__Ranking__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getRankingAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__8__Impl"


    // $ANTLR start "rule__Ranking__Group__9"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3273:1: rule__Ranking__Group__9 : rule__Ranking__Group__9__Impl rule__Ranking__Group__10 ;
    public final void rule__Ranking__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3277:1: ( rule__Ranking__Group__9__Impl rule__Ranking__Group__10 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3278:2: rule__Ranking__Group__9__Impl rule__Ranking__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__9__Impl_in_rule__Ranking__Group__96541);
            rule__Ranking__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__10_in_rule__Ranking__Group__96544);
            rule__Ranking__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__9"


    // $ANTLR start "rule__Ranking__Group__9__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3285:1: rule__Ranking__Group__9__Impl : ( '}' ) ;
    public final void rule__Ranking__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3289:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3290:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3290:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3291:1: '}'
            {
             before(grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ranking__Group__9__Impl6572); 
             after(grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__9__Impl"


    // $ANTLR start "rule__Ranking__Group__10"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3304:1: rule__Ranking__Group__10 : rule__Ranking__Group__10__Impl ;
    public final void rule__Ranking__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3308:1: ( rule__Ranking__Group__10__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3309:2: rule__Ranking__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__10__Impl_in_rule__Ranking__Group__106603);
            rule__Ranking__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__10"


    // $ANTLR start "rule__Ranking__Group__10__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3315:1: rule__Ranking__Group__10__Impl : ( '}' ) ;
    public final void rule__Ranking__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3319:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3320:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3320:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3321:1: '}'
            {
             before(grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_10()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ranking__Group__10__Impl6631); 
             after(grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group__10__Impl"


    // $ANTLR start "rule__Ranking__Group_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3356:1: rule__Ranking__Group_3__0 : rule__Ranking__Group_3__0__Impl rule__Ranking__Group_3__1 ;
    public final void rule__Ranking__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3360:1: ( rule__Ranking__Group_3__0__Impl rule__Ranking__Group_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3361:2: rule__Ranking__Group_3__0__Impl rule__Ranking__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_3__0__Impl_in_rule__Ranking__Group_3__06684);
            rule__Ranking__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_3__1_in_rule__Ranking__Group_3__06687);
            rule__Ranking__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_3__0"


    // $ANTLR start "rule__Ranking__Group_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3368:1: rule__Ranking__Group_3__0__Impl : ( 'question' ) ;
    public final void rule__Ranking__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3372:1: ( ( 'question' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3373:1: ( 'question' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3373:1: ( 'question' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3374:1: 'question'
            {
             before(grammarAccess.getRankingAccess().getQuestionKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Ranking__Group_3__0__Impl6715); 
             after(grammarAccess.getRankingAccess().getQuestionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_3__0__Impl"


    // $ANTLR start "rule__Ranking__Group_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3387:1: rule__Ranking__Group_3__1 : rule__Ranking__Group_3__1__Impl ;
    public final void rule__Ranking__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3391:1: ( rule__Ranking__Group_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3392:2: rule__Ranking__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_3__1__Impl_in_rule__Ranking__Group_3__16746);
            rule__Ranking__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_3__1"


    // $ANTLR start "rule__Ranking__Group_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3398:1: rule__Ranking__Group_3__1__Impl : ( ( rule__Ranking__QuestionAssignment_3_1 ) ) ;
    public final void rule__Ranking__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3402:1: ( ( ( rule__Ranking__QuestionAssignment_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3403:1: ( ( rule__Ranking__QuestionAssignment_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3403:1: ( ( rule__Ranking__QuestionAssignment_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3404:1: ( rule__Ranking__QuestionAssignment_3_1 )
            {
             before(grammarAccess.getRankingAccess().getQuestionAssignment_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3405:1: ( rule__Ranking__QuestionAssignment_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3405:2: rule__Ranking__QuestionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__QuestionAssignment_3_1_in_rule__Ranking__Group_3__1__Impl6773);
            rule__Ranking__QuestionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getQuestionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_3__1__Impl"


    // $ANTLR start "rule__Ranking__Group_4__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3419:1: rule__Ranking__Group_4__0 : rule__Ranking__Group_4__0__Impl rule__Ranking__Group_4__1 ;
    public final void rule__Ranking__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3423:1: ( rule__Ranking__Group_4__0__Impl rule__Ranking__Group_4__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3424:2: rule__Ranking__Group_4__0__Impl rule__Ranking__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__0__Impl_in_rule__Ranking__Group_4__06807);
            rule__Ranking__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__1_in_rule__Ranking__Group_4__06810);
            rule__Ranking__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__0"


    // $ANTLR start "rule__Ranking__Group_4__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3431:1: rule__Ranking__Group_4__0__Impl : ( 'forks' ) ;
    public final void rule__Ranking__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3435:1: ( ( 'forks' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3436:1: ( 'forks' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3436:1: ( 'forks' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3437:1: 'forks'
            {
             before(grammarAccess.getRankingAccess().getForksKeyword_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Ranking__Group_4__0__Impl6838); 
             after(grammarAccess.getRankingAccess().getForksKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__0__Impl"


    // $ANTLR start "rule__Ranking__Group_4__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3450:1: rule__Ranking__Group_4__1 : rule__Ranking__Group_4__1__Impl rule__Ranking__Group_4__2 ;
    public final void rule__Ranking__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3454:1: ( rule__Ranking__Group_4__1__Impl rule__Ranking__Group_4__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3455:2: rule__Ranking__Group_4__1__Impl rule__Ranking__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__1__Impl_in_rule__Ranking__Group_4__16869);
            rule__Ranking__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__2_in_rule__Ranking__Group_4__16872);
            rule__Ranking__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__1"


    // $ANTLR start "rule__Ranking__Group_4__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3462:1: rule__Ranking__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Ranking__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3466:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3467:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3467:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3468:1: '{'
            {
             before(grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Ranking__Group_4__1__Impl6900); 
             after(grammarAccess.getRankingAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__1__Impl"


    // $ANTLR start "rule__Ranking__Group_4__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3481:1: rule__Ranking__Group_4__2 : rule__Ranking__Group_4__2__Impl rule__Ranking__Group_4__3 ;
    public final void rule__Ranking__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3485:1: ( rule__Ranking__Group_4__2__Impl rule__Ranking__Group_4__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3486:2: rule__Ranking__Group_4__2__Impl rule__Ranking__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__2__Impl_in_rule__Ranking__Group_4__26931);
            rule__Ranking__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__3_in_rule__Ranking__Group_4__26934);
            rule__Ranking__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__2"


    // $ANTLR start "rule__Ranking__Group_4__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3493:1: rule__Ranking__Group_4__2__Impl : ( ( rule__Ranking__ForksAssignment_4_2 ) ) ;
    public final void rule__Ranking__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3497:1: ( ( ( rule__Ranking__ForksAssignment_4_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3498:1: ( ( rule__Ranking__ForksAssignment_4_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3498:1: ( ( rule__Ranking__ForksAssignment_4_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3499:1: ( rule__Ranking__ForksAssignment_4_2 )
            {
             before(grammarAccess.getRankingAccess().getForksAssignment_4_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3500:1: ( rule__Ranking__ForksAssignment_4_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3500:2: rule__Ranking__ForksAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__ForksAssignment_4_2_in_rule__Ranking__Group_4__2__Impl6961);
            rule__Ranking__ForksAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getForksAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__2__Impl"


    // $ANTLR start "rule__Ranking__Group_4__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3510:1: rule__Ranking__Group_4__3 : rule__Ranking__Group_4__3__Impl rule__Ranking__Group_4__4 ;
    public final void rule__Ranking__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3514:1: ( rule__Ranking__Group_4__3__Impl rule__Ranking__Group_4__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3515:2: rule__Ranking__Group_4__3__Impl rule__Ranking__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__3__Impl_in_rule__Ranking__Group_4__36991);
            rule__Ranking__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__4_in_rule__Ranking__Group_4__36994);
            rule__Ranking__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__3"


    // $ANTLR start "rule__Ranking__Group_4__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3522:1: rule__Ranking__Group_4__3__Impl : ( ( rule__Ranking__Group_4_3__0 )* ) ;
    public final void rule__Ranking__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3526:1: ( ( ( rule__Ranking__Group_4_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3527:1: ( ( rule__Ranking__Group_4_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3527:1: ( ( rule__Ranking__Group_4_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3528:1: ( rule__Ranking__Group_4_3__0 )*
            {
             before(grammarAccess.getRankingAccess().getGroup_4_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3529:1: ( rule__Ranking__Group_4_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==13) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3529:2: rule__Ranking__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4_3__0_in_rule__Ranking__Group_4__3__Impl7021);
            	    rule__Ranking__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getRankingAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__3__Impl"


    // $ANTLR start "rule__Ranking__Group_4__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3539:1: rule__Ranking__Group_4__4 : rule__Ranking__Group_4__4__Impl ;
    public final void rule__Ranking__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3543:1: ( rule__Ranking__Group_4__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3544:2: rule__Ranking__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4__4__Impl_in_rule__Ranking__Group_4__47052);
            rule__Ranking__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__4"


    // $ANTLR start "rule__Ranking__Group_4__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3550:1: rule__Ranking__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Ranking__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3554:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3555:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3555:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3556:1: '}'
            {
             before(grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ranking__Group_4__4__Impl7080); 
             after(grammarAccess.getRankingAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4__4__Impl"


    // $ANTLR start "rule__Ranking__Group_4_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3579:1: rule__Ranking__Group_4_3__0 : rule__Ranking__Group_4_3__0__Impl rule__Ranking__Group_4_3__1 ;
    public final void rule__Ranking__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3583:1: ( rule__Ranking__Group_4_3__0__Impl rule__Ranking__Group_4_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3584:2: rule__Ranking__Group_4_3__0__Impl rule__Ranking__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4_3__0__Impl_in_rule__Ranking__Group_4_3__07121);
            rule__Ranking__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4_3__1_in_rule__Ranking__Group_4_3__07124);
            rule__Ranking__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4_3__0"


    // $ANTLR start "rule__Ranking__Group_4_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3591:1: rule__Ranking__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Ranking__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3595:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3596:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3596:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3597:1: ','
            {
             before(grammarAccess.getRankingAccess().getCommaKeyword_4_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Ranking__Group_4_3__0__Impl7152); 
             after(grammarAccess.getRankingAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4_3__0__Impl"


    // $ANTLR start "rule__Ranking__Group_4_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3610:1: rule__Ranking__Group_4_3__1 : rule__Ranking__Group_4_3__1__Impl ;
    public final void rule__Ranking__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3614:1: ( rule__Ranking__Group_4_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3615:2: rule__Ranking__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_4_3__1__Impl_in_rule__Ranking__Group_4_3__17183);
            rule__Ranking__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4_3__1"


    // $ANTLR start "rule__Ranking__Group_4_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3621:1: rule__Ranking__Group_4_3__1__Impl : ( ( rule__Ranking__ForksAssignment_4_3_1 ) ) ;
    public final void rule__Ranking__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3625:1: ( ( ( rule__Ranking__ForksAssignment_4_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3626:1: ( ( rule__Ranking__ForksAssignment_4_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3626:1: ( ( rule__Ranking__ForksAssignment_4_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3627:1: ( rule__Ranking__ForksAssignment_4_3_1 )
            {
             before(grammarAccess.getRankingAccess().getForksAssignment_4_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3628:1: ( rule__Ranking__ForksAssignment_4_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3628:2: rule__Ranking__ForksAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__ForksAssignment_4_3_1_in_rule__Ranking__Group_4_3__1__Impl7210);
            rule__Ranking__ForksAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getForksAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_4_3__1__Impl"


    // $ANTLR start "rule__Ranking__Group_8__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3642:1: rule__Ranking__Group_8__0 : rule__Ranking__Group_8__0__Impl rule__Ranking__Group_8__1 ;
    public final void rule__Ranking__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3646:1: ( rule__Ranking__Group_8__0__Impl rule__Ranking__Group_8__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3647:2: rule__Ranking__Group_8__0__Impl rule__Ranking__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_8__0__Impl_in_rule__Ranking__Group_8__07244);
            rule__Ranking__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_8__1_in_rule__Ranking__Group_8__07247);
            rule__Ranking__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_8__0"


    // $ANTLR start "rule__Ranking__Group_8__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3654:1: rule__Ranking__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Ranking__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3658:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3659:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3659:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3660:1: ','
            {
             before(grammarAccess.getRankingAccess().getCommaKeyword_8_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Ranking__Group_8__0__Impl7275); 
             after(grammarAccess.getRankingAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_8__0__Impl"


    // $ANTLR start "rule__Ranking__Group_8__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3673:1: rule__Ranking__Group_8__1 : rule__Ranking__Group_8__1__Impl ;
    public final void rule__Ranking__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3677:1: ( rule__Ranking__Group_8__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3678:2: rule__Ranking__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group_8__1__Impl_in_rule__Ranking__Group_8__17306);
            rule__Ranking__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_8__1"


    // $ANTLR start "rule__Ranking__Group_8__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3684:1: rule__Ranking__Group_8__1__Impl : ( ( rule__Ranking__ChoicesAssignment_8_1 ) ) ;
    public final void rule__Ranking__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3688:1: ( ( ( rule__Ranking__ChoicesAssignment_8_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3689:1: ( ( rule__Ranking__ChoicesAssignment_8_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3689:1: ( ( rule__Ranking__ChoicesAssignment_8_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3690:1: ( rule__Ranking__ChoicesAssignment_8_1 )
            {
             before(grammarAccess.getRankingAccess().getChoicesAssignment_8_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3691:1: ( rule__Ranking__ChoicesAssignment_8_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3691:2: rule__Ranking__ChoicesAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__ChoicesAssignment_8_1_in_rule__Ranking__Group_8__1__Impl7333);
            rule__Ranking__ChoicesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getChoicesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__Group_8__1__Impl"


    // $ANTLR start "rule__Dichotomous__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3705:1: rule__Dichotomous__Group__0 : rule__Dichotomous__Group__0__Impl rule__Dichotomous__Group__1 ;
    public final void rule__Dichotomous__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3709:1: ( rule__Dichotomous__Group__0__Impl rule__Dichotomous__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3710:2: rule__Dichotomous__Group__0__Impl rule__Dichotomous__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__0__Impl_in_rule__Dichotomous__Group__07367);
            rule__Dichotomous__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__1_in_rule__Dichotomous__Group__07370);
            rule__Dichotomous__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__0"


    // $ANTLR start "rule__Dichotomous__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3717:1: rule__Dichotomous__Group__0__Impl : ( () ) ;
    public final void rule__Dichotomous__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3721:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3722:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3722:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3723:1: ()
            {
             before(grammarAccess.getDichotomousAccess().getDichotomousAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3724:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3726:1: 
            {
            }

             after(grammarAccess.getDichotomousAccess().getDichotomousAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__0__Impl"


    // $ANTLR start "rule__Dichotomous__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3736:1: rule__Dichotomous__Group__1 : rule__Dichotomous__Group__1__Impl rule__Dichotomous__Group__2 ;
    public final void rule__Dichotomous__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3740:1: ( rule__Dichotomous__Group__1__Impl rule__Dichotomous__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3741:2: rule__Dichotomous__Group__1__Impl rule__Dichotomous__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__1__Impl_in_rule__Dichotomous__Group__17428);
            rule__Dichotomous__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__2_in_rule__Dichotomous__Group__17431);
            rule__Dichotomous__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__1"


    // $ANTLR start "rule__Dichotomous__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3748:1: rule__Dichotomous__Group__1__Impl : ( ( rule__Dichotomous__RequiredAssignment_1 )? ) ;
    public final void rule__Dichotomous__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3752:1: ( ( ( rule__Dichotomous__RequiredAssignment_1 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3753:1: ( ( rule__Dichotomous__RequiredAssignment_1 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3753:1: ( ( rule__Dichotomous__RequiredAssignment_1 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3754:1: ( rule__Dichotomous__RequiredAssignment_1 )?
            {
             before(grammarAccess.getDichotomousAccess().getRequiredAssignment_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3755:1: ( rule__Dichotomous__RequiredAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==56) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3755:2: rule__Dichotomous__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__RequiredAssignment_1_in_rule__Dichotomous__Group__1__Impl7458);
                    rule__Dichotomous__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDichotomousAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__1__Impl"


    // $ANTLR start "rule__Dichotomous__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3765:1: rule__Dichotomous__Group__2 : rule__Dichotomous__Group__2__Impl rule__Dichotomous__Group__3 ;
    public final void rule__Dichotomous__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3769:1: ( rule__Dichotomous__Group__2__Impl rule__Dichotomous__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3770:2: rule__Dichotomous__Group__2__Impl rule__Dichotomous__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__2__Impl_in_rule__Dichotomous__Group__27489);
            rule__Dichotomous__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__3_in_rule__Dichotomous__Group__27492);
            rule__Dichotomous__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__2"


    // $ANTLR start "rule__Dichotomous__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3777:1: rule__Dichotomous__Group__2__Impl : ( 'Dichotomous' ) ;
    public final void rule__Dichotomous__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3781:1: ( ( 'Dichotomous' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3782:1: ( 'Dichotomous' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3782:1: ( 'Dichotomous' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3783:1: 'Dichotomous'
            {
             before(grammarAccess.getDichotomousAccess().getDichotomousKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Dichotomous__Group__2__Impl7520); 
             after(grammarAccess.getDichotomousAccess().getDichotomousKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__2__Impl"


    // $ANTLR start "rule__Dichotomous__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3796:1: rule__Dichotomous__Group__3 : rule__Dichotomous__Group__3__Impl rule__Dichotomous__Group__4 ;
    public final void rule__Dichotomous__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3800:1: ( rule__Dichotomous__Group__3__Impl rule__Dichotomous__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3801:2: rule__Dichotomous__Group__3__Impl rule__Dichotomous__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__3__Impl_in_rule__Dichotomous__Group__37551);
            rule__Dichotomous__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__4_in_rule__Dichotomous__Group__37554);
            rule__Dichotomous__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__3"


    // $ANTLR start "rule__Dichotomous__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3808:1: rule__Dichotomous__Group__3__Impl : ( '{' ) ;
    public final void rule__Dichotomous__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3812:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3813:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3813:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3814:1: '{'
            {
             before(grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Dichotomous__Group__3__Impl7582); 
             after(grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__3__Impl"


    // $ANTLR start "rule__Dichotomous__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3827:1: rule__Dichotomous__Group__4 : rule__Dichotomous__Group__4__Impl rule__Dichotomous__Group__5 ;
    public final void rule__Dichotomous__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3831:1: ( rule__Dichotomous__Group__4__Impl rule__Dichotomous__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3832:2: rule__Dichotomous__Group__4__Impl rule__Dichotomous__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__4__Impl_in_rule__Dichotomous__Group__47613);
            rule__Dichotomous__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__5_in_rule__Dichotomous__Group__47616);
            rule__Dichotomous__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__4"


    // $ANTLR start "rule__Dichotomous__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3839:1: rule__Dichotomous__Group__4__Impl : ( ( rule__Dichotomous__Group_4__0 )? ) ;
    public final void rule__Dichotomous__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3843:1: ( ( ( rule__Dichotomous__Group_4__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3844:1: ( ( rule__Dichotomous__Group_4__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3844:1: ( ( rule__Dichotomous__Group_4__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3845:1: ( rule__Dichotomous__Group_4__0 )?
            {
             before(grammarAccess.getDichotomousAccess().getGroup_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3846:1: ( rule__Dichotomous__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3846:2: rule__Dichotomous__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_4__0_in_rule__Dichotomous__Group__4__Impl7643);
                    rule__Dichotomous__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDichotomousAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__4__Impl"


    // $ANTLR start "rule__Dichotomous__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3856:1: rule__Dichotomous__Group__5 : rule__Dichotomous__Group__5__Impl rule__Dichotomous__Group__6 ;
    public final void rule__Dichotomous__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3860:1: ( rule__Dichotomous__Group__5__Impl rule__Dichotomous__Group__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3861:2: rule__Dichotomous__Group__5__Impl rule__Dichotomous__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__5__Impl_in_rule__Dichotomous__Group__57674);
            rule__Dichotomous__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__6_in_rule__Dichotomous__Group__57677);
            rule__Dichotomous__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__5"


    // $ANTLR start "rule__Dichotomous__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3868:1: rule__Dichotomous__Group__5__Impl : ( ( rule__Dichotomous__Group_5__0 )? ) ;
    public final void rule__Dichotomous__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3872:1: ( ( ( rule__Dichotomous__Group_5__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3873:1: ( ( rule__Dichotomous__Group_5__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3873:1: ( ( rule__Dichotomous__Group_5__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3874:1: ( rule__Dichotomous__Group_5__0 )?
            {
             before(grammarAccess.getDichotomousAccess().getGroup_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3875:1: ( rule__Dichotomous__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3875:2: rule__Dichotomous__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__0_in_rule__Dichotomous__Group__5__Impl7704);
                    rule__Dichotomous__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDichotomousAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__5__Impl"


    // $ANTLR start "rule__Dichotomous__Group__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3885:1: rule__Dichotomous__Group__6 : rule__Dichotomous__Group__6__Impl rule__Dichotomous__Group__7 ;
    public final void rule__Dichotomous__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3889:1: ( rule__Dichotomous__Group__6__Impl rule__Dichotomous__Group__7 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3890:2: rule__Dichotomous__Group__6__Impl rule__Dichotomous__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__6__Impl_in_rule__Dichotomous__Group__67735);
            rule__Dichotomous__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__7_in_rule__Dichotomous__Group__67738);
            rule__Dichotomous__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__6"


    // $ANTLR start "rule__Dichotomous__Group__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3897:1: rule__Dichotomous__Group__6__Impl : ( ( rule__Dichotomous__Group_6__0 )? ) ;
    public final void rule__Dichotomous__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3901:1: ( ( ( rule__Dichotomous__Group_6__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3902:1: ( ( rule__Dichotomous__Group_6__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3902:1: ( ( rule__Dichotomous__Group_6__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3903:1: ( rule__Dichotomous__Group_6__0 )?
            {
             before(grammarAccess.getDichotomousAccess().getGroup_6()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3904:1: ( rule__Dichotomous__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3904:2: rule__Dichotomous__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__0_in_rule__Dichotomous__Group__6__Impl7765);
                    rule__Dichotomous__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDichotomousAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__6__Impl"


    // $ANTLR start "rule__Dichotomous__Group__7"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3914:1: rule__Dichotomous__Group__7 : rule__Dichotomous__Group__7__Impl ;
    public final void rule__Dichotomous__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3918:1: ( rule__Dichotomous__Group__7__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3919:2: rule__Dichotomous__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group__7__Impl_in_rule__Dichotomous__Group__77796);
            rule__Dichotomous__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__7"


    // $ANTLR start "rule__Dichotomous__Group__7__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3925:1: rule__Dichotomous__Group__7__Impl : ( '}' ) ;
    public final void rule__Dichotomous__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3929:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3930:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3930:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3931:1: '}'
            {
             before(grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_7()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Dichotomous__Group__7__Impl7824); 
             after(grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group__7__Impl"


    // $ANTLR start "rule__Dichotomous__Group_4__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3960:1: rule__Dichotomous__Group_4__0 : rule__Dichotomous__Group_4__0__Impl rule__Dichotomous__Group_4__1 ;
    public final void rule__Dichotomous__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3964:1: ( rule__Dichotomous__Group_4__0__Impl rule__Dichotomous__Group_4__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3965:2: rule__Dichotomous__Group_4__0__Impl rule__Dichotomous__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_4__0__Impl_in_rule__Dichotomous__Group_4__07871);
            rule__Dichotomous__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_4__1_in_rule__Dichotomous__Group_4__07874);
            rule__Dichotomous__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_4__0"


    // $ANTLR start "rule__Dichotomous__Group_4__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3972:1: rule__Dichotomous__Group_4__0__Impl : ( 'question' ) ;
    public final void rule__Dichotomous__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3976:1: ( ( 'question' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3977:1: ( 'question' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3977:1: ( 'question' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3978:1: 'question'
            {
             before(grammarAccess.getDichotomousAccess().getQuestionKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Dichotomous__Group_4__0__Impl7902); 
             after(grammarAccess.getDichotomousAccess().getQuestionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_4__0__Impl"


    // $ANTLR start "rule__Dichotomous__Group_4__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3991:1: rule__Dichotomous__Group_4__1 : rule__Dichotomous__Group_4__1__Impl ;
    public final void rule__Dichotomous__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3995:1: ( rule__Dichotomous__Group_4__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3996:2: rule__Dichotomous__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_4__1__Impl_in_rule__Dichotomous__Group_4__17933);
            rule__Dichotomous__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_4__1"


    // $ANTLR start "rule__Dichotomous__Group_4__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4002:1: rule__Dichotomous__Group_4__1__Impl : ( ( rule__Dichotomous__QuestionAssignment_4_1 ) ) ;
    public final void rule__Dichotomous__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4006:1: ( ( ( rule__Dichotomous__QuestionAssignment_4_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4007:1: ( ( rule__Dichotomous__QuestionAssignment_4_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4007:1: ( ( rule__Dichotomous__QuestionAssignment_4_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4008:1: ( rule__Dichotomous__QuestionAssignment_4_1 )
            {
             before(grammarAccess.getDichotomousAccess().getQuestionAssignment_4_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4009:1: ( rule__Dichotomous__QuestionAssignment_4_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4009:2: rule__Dichotomous__QuestionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__QuestionAssignment_4_1_in_rule__Dichotomous__Group_4__1__Impl7960);
            rule__Dichotomous__QuestionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDichotomousAccess().getQuestionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_4__1__Impl"


    // $ANTLR start "rule__Dichotomous__Group_5__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4023:1: rule__Dichotomous__Group_5__0 : rule__Dichotomous__Group_5__0__Impl rule__Dichotomous__Group_5__1 ;
    public final void rule__Dichotomous__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4027:1: ( rule__Dichotomous__Group_5__0__Impl rule__Dichotomous__Group_5__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4028:2: rule__Dichotomous__Group_5__0__Impl rule__Dichotomous__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__0__Impl_in_rule__Dichotomous__Group_5__07994);
            rule__Dichotomous__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__1_in_rule__Dichotomous__Group_5__07997);
            rule__Dichotomous__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__0"


    // $ANTLR start "rule__Dichotomous__Group_5__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4035:1: rule__Dichotomous__Group_5__0__Impl : ( 'yes' ) ;
    public final void rule__Dichotomous__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4039:1: ( ( 'yes' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4040:1: ( 'yes' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4040:1: ( 'yes' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4041:1: 'yes'
            {
             before(grammarAccess.getDichotomousAccess().getYesKeyword_5_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Dichotomous__Group_5__0__Impl8025); 
             after(grammarAccess.getDichotomousAccess().getYesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__0__Impl"


    // $ANTLR start "rule__Dichotomous__Group_5__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4054:1: rule__Dichotomous__Group_5__1 : rule__Dichotomous__Group_5__1__Impl rule__Dichotomous__Group_5__2 ;
    public final void rule__Dichotomous__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4058:1: ( rule__Dichotomous__Group_5__1__Impl rule__Dichotomous__Group_5__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4059:2: rule__Dichotomous__Group_5__1__Impl rule__Dichotomous__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__1__Impl_in_rule__Dichotomous__Group_5__18056);
            rule__Dichotomous__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__2_in_rule__Dichotomous__Group_5__18059);
            rule__Dichotomous__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__1"


    // $ANTLR start "rule__Dichotomous__Group_5__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4066:1: rule__Dichotomous__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Dichotomous__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4070:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4071:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4071:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4072:1: '{'
            {
             before(grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Dichotomous__Group_5__1__Impl8087); 
             after(grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__1__Impl"


    // $ANTLR start "rule__Dichotomous__Group_5__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4085:1: rule__Dichotomous__Group_5__2 : rule__Dichotomous__Group_5__2__Impl rule__Dichotomous__Group_5__3 ;
    public final void rule__Dichotomous__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4089:1: ( rule__Dichotomous__Group_5__2__Impl rule__Dichotomous__Group_5__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4090:2: rule__Dichotomous__Group_5__2__Impl rule__Dichotomous__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__2__Impl_in_rule__Dichotomous__Group_5__28118);
            rule__Dichotomous__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__3_in_rule__Dichotomous__Group_5__28121);
            rule__Dichotomous__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__2"


    // $ANTLR start "rule__Dichotomous__Group_5__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4097:1: rule__Dichotomous__Group_5__2__Impl : ( ( rule__Dichotomous__YesAssignment_5_2 ) ) ;
    public final void rule__Dichotomous__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4101:1: ( ( ( rule__Dichotomous__YesAssignment_5_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4102:1: ( ( rule__Dichotomous__YesAssignment_5_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4102:1: ( ( rule__Dichotomous__YesAssignment_5_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4103:1: ( rule__Dichotomous__YesAssignment_5_2 )
            {
             before(grammarAccess.getDichotomousAccess().getYesAssignment_5_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4104:1: ( rule__Dichotomous__YesAssignment_5_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4104:2: rule__Dichotomous__YesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__YesAssignment_5_2_in_rule__Dichotomous__Group_5__2__Impl8148);
            rule__Dichotomous__YesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDichotomousAccess().getYesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__2__Impl"


    // $ANTLR start "rule__Dichotomous__Group_5__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4114:1: rule__Dichotomous__Group_5__3 : rule__Dichotomous__Group_5__3__Impl rule__Dichotomous__Group_5__4 ;
    public final void rule__Dichotomous__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4118:1: ( rule__Dichotomous__Group_5__3__Impl rule__Dichotomous__Group_5__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4119:2: rule__Dichotomous__Group_5__3__Impl rule__Dichotomous__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__3__Impl_in_rule__Dichotomous__Group_5__38178);
            rule__Dichotomous__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__4_in_rule__Dichotomous__Group_5__38181);
            rule__Dichotomous__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__3"


    // $ANTLR start "rule__Dichotomous__Group_5__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4126:1: rule__Dichotomous__Group_5__3__Impl : ( ( rule__Dichotomous__Group_5_3__0 )* ) ;
    public final void rule__Dichotomous__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4130:1: ( ( ( rule__Dichotomous__Group_5_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4131:1: ( ( rule__Dichotomous__Group_5_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4131:1: ( ( rule__Dichotomous__Group_5_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4132:1: ( rule__Dichotomous__Group_5_3__0 )*
            {
             before(grammarAccess.getDichotomousAccess().getGroup_5_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4133:1: ( rule__Dichotomous__Group_5_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==13) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4133:2: rule__Dichotomous__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5_3__0_in_rule__Dichotomous__Group_5__3__Impl8208);
            	    rule__Dichotomous__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getDichotomousAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__3__Impl"


    // $ANTLR start "rule__Dichotomous__Group_5__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4143:1: rule__Dichotomous__Group_5__4 : rule__Dichotomous__Group_5__4__Impl ;
    public final void rule__Dichotomous__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4147:1: ( rule__Dichotomous__Group_5__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4148:2: rule__Dichotomous__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5__4__Impl_in_rule__Dichotomous__Group_5__48239);
            rule__Dichotomous__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__4"


    // $ANTLR start "rule__Dichotomous__Group_5__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4154:1: rule__Dichotomous__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Dichotomous__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4158:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4159:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4159:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4160:1: '}'
            {
             before(grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Dichotomous__Group_5__4__Impl8267); 
             after(grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5__4__Impl"


    // $ANTLR start "rule__Dichotomous__Group_5_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4183:1: rule__Dichotomous__Group_5_3__0 : rule__Dichotomous__Group_5_3__0__Impl rule__Dichotomous__Group_5_3__1 ;
    public final void rule__Dichotomous__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4187:1: ( rule__Dichotomous__Group_5_3__0__Impl rule__Dichotomous__Group_5_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4188:2: rule__Dichotomous__Group_5_3__0__Impl rule__Dichotomous__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5_3__0__Impl_in_rule__Dichotomous__Group_5_3__08308);
            rule__Dichotomous__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5_3__1_in_rule__Dichotomous__Group_5_3__08311);
            rule__Dichotomous__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5_3__0"


    // $ANTLR start "rule__Dichotomous__Group_5_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4195:1: rule__Dichotomous__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Dichotomous__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4199:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4200:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4200:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4201:1: ','
            {
             before(grammarAccess.getDichotomousAccess().getCommaKeyword_5_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Dichotomous__Group_5_3__0__Impl8339); 
             after(grammarAccess.getDichotomousAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5_3__0__Impl"


    // $ANTLR start "rule__Dichotomous__Group_5_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4214:1: rule__Dichotomous__Group_5_3__1 : rule__Dichotomous__Group_5_3__1__Impl ;
    public final void rule__Dichotomous__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4218:1: ( rule__Dichotomous__Group_5_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4219:2: rule__Dichotomous__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_5_3__1__Impl_in_rule__Dichotomous__Group_5_3__18370);
            rule__Dichotomous__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5_3__1"


    // $ANTLR start "rule__Dichotomous__Group_5_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4225:1: rule__Dichotomous__Group_5_3__1__Impl : ( ( rule__Dichotomous__YesAssignment_5_3_1 ) ) ;
    public final void rule__Dichotomous__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4229:1: ( ( ( rule__Dichotomous__YesAssignment_5_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4230:1: ( ( rule__Dichotomous__YesAssignment_5_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4230:1: ( ( rule__Dichotomous__YesAssignment_5_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4231:1: ( rule__Dichotomous__YesAssignment_5_3_1 )
            {
             before(grammarAccess.getDichotomousAccess().getYesAssignment_5_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4232:1: ( rule__Dichotomous__YesAssignment_5_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4232:2: rule__Dichotomous__YesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__YesAssignment_5_3_1_in_rule__Dichotomous__Group_5_3__1__Impl8397);
            rule__Dichotomous__YesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDichotomousAccess().getYesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_5_3__1__Impl"


    // $ANTLR start "rule__Dichotomous__Group_6__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4246:1: rule__Dichotomous__Group_6__0 : rule__Dichotomous__Group_6__0__Impl rule__Dichotomous__Group_6__1 ;
    public final void rule__Dichotomous__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4250:1: ( rule__Dichotomous__Group_6__0__Impl rule__Dichotomous__Group_6__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4251:2: rule__Dichotomous__Group_6__0__Impl rule__Dichotomous__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__0__Impl_in_rule__Dichotomous__Group_6__08431);
            rule__Dichotomous__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__1_in_rule__Dichotomous__Group_6__08434);
            rule__Dichotomous__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__0"


    // $ANTLR start "rule__Dichotomous__Group_6__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4258:1: rule__Dichotomous__Group_6__0__Impl : ( 'no' ) ;
    public final void rule__Dichotomous__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4262:1: ( ( 'no' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4263:1: ( 'no' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4263:1: ( 'no' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4264:1: 'no'
            {
             before(grammarAccess.getDichotomousAccess().getNoKeyword_6_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Dichotomous__Group_6__0__Impl8462); 
             after(grammarAccess.getDichotomousAccess().getNoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__0__Impl"


    // $ANTLR start "rule__Dichotomous__Group_6__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4277:1: rule__Dichotomous__Group_6__1 : rule__Dichotomous__Group_6__1__Impl rule__Dichotomous__Group_6__2 ;
    public final void rule__Dichotomous__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4281:1: ( rule__Dichotomous__Group_6__1__Impl rule__Dichotomous__Group_6__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4282:2: rule__Dichotomous__Group_6__1__Impl rule__Dichotomous__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__1__Impl_in_rule__Dichotomous__Group_6__18493);
            rule__Dichotomous__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__2_in_rule__Dichotomous__Group_6__18496);
            rule__Dichotomous__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__1"


    // $ANTLR start "rule__Dichotomous__Group_6__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4289:1: rule__Dichotomous__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Dichotomous__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4293:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4294:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4294:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4295:1: '{'
            {
             before(grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Dichotomous__Group_6__1__Impl8524); 
             after(grammarAccess.getDichotomousAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__1__Impl"


    // $ANTLR start "rule__Dichotomous__Group_6__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4308:1: rule__Dichotomous__Group_6__2 : rule__Dichotomous__Group_6__2__Impl rule__Dichotomous__Group_6__3 ;
    public final void rule__Dichotomous__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4312:1: ( rule__Dichotomous__Group_6__2__Impl rule__Dichotomous__Group_6__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4313:2: rule__Dichotomous__Group_6__2__Impl rule__Dichotomous__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__2__Impl_in_rule__Dichotomous__Group_6__28555);
            rule__Dichotomous__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__3_in_rule__Dichotomous__Group_6__28558);
            rule__Dichotomous__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__2"


    // $ANTLR start "rule__Dichotomous__Group_6__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4320:1: rule__Dichotomous__Group_6__2__Impl : ( ( rule__Dichotomous__NoAssignment_6_2 ) ) ;
    public final void rule__Dichotomous__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4324:1: ( ( ( rule__Dichotomous__NoAssignment_6_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4325:1: ( ( rule__Dichotomous__NoAssignment_6_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4325:1: ( ( rule__Dichotomous__NoAssignment_6_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4326:1: ( rule__Dichotomous__NoAssignment_6_2 )
            {
             before(grammarAccess.getDichotomousAccess().getNoAssignment_6_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4327:1: ( rule__Dichotomous__NoAssignment_6_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4327:2: rule__Dichotomous__NoAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__NoAssignment_6_2_in_rule__Dichotomous__Group_6__2__Impl8585);
            rule__Dichotomous__NoAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDichotomousAccess().getNoAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__2__Impl"


    // $ANTLR start "rule__Dichotomous__Group_6__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4337:1: rule__Dichotomous__Group_6__3 : rule__Dichotomous__Group_6__3__Impl rule__Dichotomous__Group_6__4 ;
    public final void rule__Dichotomous__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4341:1: ( rule__Dichotomous__Group_6__3__Impl rule__Dichotomous__Group_6__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4342:2: rule__Dichotomous__Group_6__3__Impl rule__Dichotomous__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__3__Impl_in_rule__Dichotomous__Group_6__38615);
            rule__Dichotomous__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__4_in_rule__Dichotomous__Group_6__38618);
            rule__Dichotomous__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__3"


    // $ANTLR start "rule__Dichotomous__Group_6__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4349:1: rule__Dichotomous__Group_6__3__Impl : ( ( rule__Dichotomous__Group_6_3__0 )* ) ;
    public final void rule__Dichotomous__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4353:1: ( ( ( rule__Dichotomous__Group_6_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4354:1: ( ( rule__Dichotomous__Group_6_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4354:1: ( ( rule__Dichotomous__Group_6_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4355:1: ( rule__Dichotomous__Group_6_3__0 )*
            {
             before(grammarAccess.getDichotomousAccess().getGroup_6_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4356:1: ( rule__Dichotomous__Group_6_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==13) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4356:2: rule__Dichotomous__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6_3__0_in_rule__Dichotomous__Group_6__3__Impl8645);
            	    rule__Dichotomous__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getDichotomousAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__3__Impl"


    // $ANTLR start "rule__Dichotomous__Group_6__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4366:1: rule__Dichotomous__Group_6__4 : rule__Dichotomous__Group_6__4__Impl ;
    public final void rule__Dichotomous__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4370:1: ( rule__Dichotomous__Group_6__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4371:2: rule__Dichotomous__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6__4__Impl_in_rule__Dichotomous__Group_6__48676);
            rule__Dichotomous__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__4"


    // $ANTLR start "rule__Dichotomous__Group_6__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4377:1: rule__Dichotomous__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Dichotomous__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4381:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4382:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4382:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4383:1: '}'
            {
             before(grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Dichotomous__Group_6__4__Impl8704); 
             after(grammarAccess.getDichotomousAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6__4__Impl"


    // $ANTLR start "rule__Dichotomous__Group_6_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4406:1: rule__Dichotomous__Group_6_3__0 : rule__Dichotomous__Group_6_3__0__Impl rule__Dichotomous__Group_6_3__1 ;
    public final void rule__Dichotomous__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4410:1: ( rule__Dichotomous__Group_6_3__0__Impl rule__Dichotomous__Group_6_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4411:2: rule__Dichotomous__Group_6_3__0__Impl rule__Dichotomous__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6_3__0__Impl_in_rule__Dichotomous__Group_6_3__08745);
            rule__Dichotomous__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6_3__1_in_rule__Dichotomous__Group_6_3__08748);
            rule__Dichotomous__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6_3__0"


    // $ANTLR start "rule__Dichotomous__Group_6_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4418:1: rule__Dichotomous__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Dichotomous__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4422:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4423:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4423:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4424:1: ','
            {
             before(grammarAccess.getDichotomousAccess().getCommaKeyword_6_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Dichotomous__Group_6_3__0__Impl8776); 
             after(grammarAccess.getDichotomousAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6_3__0__Impl"


    // $ANTLR start "rule__Dichotomous__Group_6_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4437:1: rule__Dichotomous__Group_6_3__1 : rule__Dichotomous__Group_6_3__1__Impl ;
    public final void rule__Dichotomous__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4441:1: ( rule__Dichotomous__Group_6_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4442:2: rule__Dichotomous__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__Group_6_3__1__Impl_in_rule__Dichotomous__Group_6_3__18807);
            rule__Dichotomous__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6_3__1"


    // $ANTLR start "rule__Dichotomous__Group_6_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4448:1: rule__Dichotomous__Group_6_3__1__Impl : ( ( rule__Dichotomous__NoAssignment_6_3_1 ) ) ;
    public final void rule__Dichotomous__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4452:1: ( ( ( rule__Dichotomous__NoAssignment_6_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4453:1: ( ( rule__Dichotomous__NoAssignment_6_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4453:1: ( ( rule__Dichotomous__NoAssignment_6_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4454:1: ( rule__Dichotomous__NoAssignment_6_3_1 )
            {
             before(grammarAccess.getDichotomousAccess().getNoAssignment_6_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4455:1: ( rule__Dichotomous__NoAssignment_6_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4455:2: rule__Dichotomous__NoAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dichotomous__NoAssignment_6_3_1_in_rule__Dichotomous__Group_6_3__1__Impl8834);
            rule__Dichotomous__NoAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDichotomousAccess().getNoAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__Group_6_3__1__Impl"


    // $ANTLR start "rule__SumConstant__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4469:1: rule__SumConstant__Group__0 : rule__SumConstant__Group__0__Impl rule__SumConstant__Group__1 ;
    public final void rule__SumConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4473:1: ( rule__SumConstant__Group__0__Impl rule__SumConstant__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4474:2: rule__SumConstant__Group__0__Impl rule__SumConstant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__0__Impl_in_rule__SumConstant__Group__08868);
            rule__SumConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__1_in_rule__SumConstant__Group__08871);
            rule__SumConstant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__0"


    // $ANTLR start "rule__SumConstant__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4481:1: rule__SumConstant__Group__0__Impl : ( () ) ;
    public final void rule__SumConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4485:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4486:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4486:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4487:1: ()
            {
             before(grammarAccess.getSumConstantAccess().getSumConstantAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4488:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4490:1: 
            {
            }

             after(grammarAccess.getSumConstantAccess().getSumConstantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__0__Impl"


    // $ANTLR start "rule__SumConstant__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4500:1: rule__SumConstant__Group__1 : rule__SumConstant__Group__1__Impl rule__SumConstant__Group__2 ;
    public final void rule__SumConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4504:1: ( rule__SumConstant__Group__1__Impl rule__SumConstant__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4505:2: rule__SumConstant__Group__1__Impl rule__SumConstant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__1__Impl_in_rule__SumConstant__Group__18929);
            rule__SumConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__2_in_rule__SumConstant__Group__18932);
            rule__SumConstant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__1"


    // $ANTLR start "rule__SumConstant__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4512:1: rule__SumConstant__Group__1__Impl : ( ( rule__SumConstant__RequiredAssignment_1 )? ) ;
    public final void rule__SumConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4516:1: ( ( ( rule__SumConstant__RequiredAssignment_1 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4517:1: ( ( rule__SumConstant__RequiredAssignment_1 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4517:1: ( ( rule__SumConstant__RequiredAssignment_1 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4518:1: ( rule__SumConstant__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSumConstantAccess().getRequiredAssignment_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4519:1: ( rule__SumConstant__RequiredAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4519:2: rule__SumConstant__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SumConstant__RequiredAssignment_1_in_rule__SumConstant__Group__1__Impl8959);
                    rule__SumConstant__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSumConstantAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__1__Impl"


    // $ANTLR start "rule__SumConstant__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4529:1: rule__SumConstant__Group__2 : rule__SumConstant__Group__2__Impl rule__SumConstant__Group__3 ;
    public final void rule__SumConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4533:1: ( rule__SumConstant__Group__2__Impl rule__SumConstant__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4534:2: rule__SumConstant__Group__2__Impl rule__SumConstant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__2__Impl_in_rule__SumConstant__Group__28990);
            rule__SumConstant__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__3_in_rule__SumConstant__Group__28993);
            rule__SumConstant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__2"


    // $ANTLR start "rule__SumConstant__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4541:1: rule__SumConstant__Group__2__Impl : ( 'SumConstant' ) ;
    public final void rule__SumConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4545:1: ( ( 'SumConstant' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4546:1: ( 'SumConstant' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4546:1: ( 'SumConstant' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4547:1: 'SumConstant'
            {
             before(grammarAccess.getSumConstantAccess().getSumConstantKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__SumConstant__Group__2__Impl9021); 
             after(grammarAccess.getSumConstantAccess().getSumConstantKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__2__Impl"


    // $ANTLR start "rule__SumConstant__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4560:1: rule__SumConstant__Group__3 : rule__SumConstant__Group__3__Impl rule__SumConstant__Group__4 ;
    public final void rule__SumConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4564:1: ( rule__SumConstant__Group__3__Impl rule__SumConstant__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4565:2: rule__SumConstant__Group__3__Impl rule__SumConstant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__3__Impl_in_rule__SumConstant__Group__39052);
            rule__SumConstant__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__4_in_rule__SumConstant__Group__39055);
            rule__SumConstant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__3"


    // $ANTLR start "rule__SumConstant__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4572:1: rule__SumConstant__Group__3__Impl : ( '{' ) ;
    public final void rule__SumConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4576:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4577:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4577:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4578:1: '{'
            {
             before(grammarAccess.getSumConstantAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SumConstant__Group__3__Impl9083); 
             after(grammarAccess.getSumConstantAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__3__Impl"


    // $ANTLR start "rule__SumConstant__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4591:1: rule__SumConstant__Group__4 : rule__SumConstant__Group__4__Impl rule__SumConstant__Group__5 ;
    public final void rule__SumConstant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4595:1: ( rule__SumConstant__Group__4__Impl rule__SumConstant__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4596:2: rule__SumConstant__Group__4__Impl rule__SumConstant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__4__Impl_in_rule__SumConstant__Group__49114);
            rule__SumConstant__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__5_in_rule__SumConstant__Group__49117);
            rule__SumConstant__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__4"


    // $ANTLR start "rule__SumConstant__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4603:1: rule__SumConstant__Group__4__Impl : ( ( rule__SumConstant__Group_4__0 )? ) ;
    public final void rule__SumConstant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4607:1: ( ( ( rule__SumConstant__Group_4__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4608:1: ( ( rule__SumConstant__Group_4__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4608:1: ( ( rule__SumConstant__Group_4__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4609:1: ( rule__SumConstant__Group_4__0 )?
            {
             before(grammarAccess.getSumConstantAccess().getGroup_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4610:1: ( rule__SumConstant__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4610:2: rule__SumConstant__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group_4__0_in_rule__SumConstant__Group__4__Impl9144);
                    rule__SumConstant__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSumConstantAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__4__Impl"


    // $ANTLR start "rule__SumConstant__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4620:1: rule__SumConstant__Group__5 : rule__SumConstant__Group__5__Impl ;
    public final void rule__SumConstant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4624:1: ( rule__SumConstant__Group__5__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4625:2: rule__SumConstant__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group__5__Impl_in_rule__SumConstant__Group__59175);
            rule__SumConstant__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__5"


    // $ANTLR start "rule__SumConstant__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4631:1: rule__SumConstant__Group__5__Impl : ( '}' ) ;
    public final void rule__SumConstant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4635:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4636:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4636:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4637:1: '}'
            {
             before(grammarAccess.getSumConstantAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SumConstant__Group__5__Impl9203); 
             after(grammarAccess.getSumConstantAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group__5__Impl"


    // $ANTLR start "rule__SumConstant__Group_4__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4662:1: rule__SumConstant__Group_4__0 : rule__SumConstant__Group_4__0__Impl rule__SumConstant__Group_4__1 ;
    public final void rule__SumConstant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4666:1: ( rule__SumConstant__Group_4__0__Impl rule__SumConstant__Group_4__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4667:2: rule__SumConstant__Group_4__0__Impl rule__SumConstant__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group_4__0__Impl_in_rule__SumConstant__Group_4__09246);
            rule__SumConstant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group_4__1_in_rule__SumConstant__Group_4__09249);
            rule__SumConstant__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group_4__0"


    // $ANTLR start "rule__SumConstant__Group_4__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4674:1: rule__SumConstant__Group_4__0__Impl : ( 'question' ) ;
    public final void rule__SumConstant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4678:1: ( ( 'question' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4679:1: ( 'question' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4679:1: ( 'question' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4680:1: 'question'
            {
             before(grammarAccess.getSumConstantAccess().getQuestionKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SumConstant__Group_4__0__Impl9277); 
             after(grammarAccess.getSumConstantAccess().getQuestionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group_4__0__Impl"


    // $ANTLR start "rule__SumConstant__Group_4__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4693:1: rule__SumConstant__Group_4__1 : rule__SumConstant__Group_4__1__Impl ;
    public final void rule__SumConstant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4697:1: ( rule__SumConstant__Group_4__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4698:2: rule__SumConstant__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__Group_4__1__Impl_in_rule__SumConstant__Group_4__19308);
            rule__SumConstant__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group_4__1"


    // $ANTLR start "rule__SumConstant__Group_4__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4704:1: rule__SumConstant__Group_4__1__Impl : ( ( rule__SumConstant__QuestionAssignment_4_1 ) ) ;
    public final void rule__SumConstant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4708:1: ( ( ( rule__SumConstant__QuestionAssignment_4_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4709:1: ( ( rule__SumConstant__QuestionAssignment_4_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4709:1: ( ( rule__SumConstant__QuestionAssignment_4_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4710:1: ( rule__SumConstant__QuestionAssignment_4_1 )
            {
             before(grammarAccess.getSumConstantAccess().getQuestionAssignment_4_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4711:1: ( rule__SumConstant__QuestionAssignment_4_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4711:2: rule__SumConstant__QuestionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SumConstant__QuestionAssignment_4_1_in_rule__SumConstant__Group_4__1__Impl9335);
            rule__SumConstant__QuestionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSumConstantAccess().getQuestionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__Group_4__1__Impl"


    // $ANTLR start "rule__Staple__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4725:1: rule__Staple__Group__0 : rule__Staple__Group__0__Impl rule__Staple__Group__1 ;
    public final void rule__Staple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4729:1: ( rule__Staple__Group__0__Impl rule__Staple__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4730:2: rule__Staple__Group__0__Impl rule__Staple__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__0__Impl_in_rule__Staple__Group__09369);
            rule__Staple__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__1_in_rule__Staple__Group__09372);
            rule__Staple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__0"


    // $ANTLR start "rule__Staple__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4737:1: rule__Staple__Group__0__Impl : ( () ) ;
    public final void rule__Staple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4741:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4742:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4742:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4743:1: ()
            {
             before(grammarAccess.getStapleAccess().getStapleAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4744:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4746:1: 
            {
            }

             after(grammarAccess.getStapleAccess().getStapleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__0__Impl"


    // $ANTLR start "rule__Staple__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4756:1: rule__Staple__Group__1 : rule__Staple__Group__1__Impl rule__Staple__Group__2 ;
    public final void rule__Staple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4760:1: ( rule__Staple__Group__1__Impl rule__Staple__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4761:2: rule__Staple__Group__1__Impl rule__Staple__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__1__Impl_in_rule__Staple__Group__19430);
            rule__Staple__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__2_in_rule__Staple__Group__19433);
            rule__Staple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__1"


    // $ANTLR start "rule__Staple__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4768:1: rule__Staple__Group__1__Impl : ( ( rule__Staple__RequiredAssignment_1 )? ) ;
    public final void rule__Staple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4772:1: ( ( ( rule__Staple__RequiredAssignment_1 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4773:1: ( ( rule__Staple__RequiredAssignment_1 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4773:1: ( ( rule__Staple__RequiredAssignment_1 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4774:1: ( rule__Staple__RequiredAssignment_1 )?
            {
             before(grammarAccess.getStapleAccess().getRequiredAssignment_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4775:1: ( rule__Staple__RequiredAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4775:2: rule__Staple__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__RequiredAssignment_1_in_rule__Staple__Group__1__Impl9460);
                    rule__Staple__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__1__Impl"


    // $ANTLR start "rule__Staple__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4785:1: rule__Staple__Group__2 : rule__Staple__Group__2__Impl rule__Staple__Group__3 ;
    public final void rule__Staple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4789:1: ( rule__Staple__Group__2__Impl rule__Staple__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4790:2: rule__Staple__Group__2__Impl rule__Staple__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__2__Impl_in_rule__Staple__Group__29491);
            rule__Staple__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__3_in_rule__Staple__Group__29494);
            rule__Staple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__2"


    // $ANTLR start "rule__Staple__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4797:1: rule__Staple__Group__2__Impl : ( 'Staple' ) ;
    public final void rule__Staple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4801:1: ( ( 'Staple' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4802:1: ( 'Staple' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4802:1: ( 'Staple' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4803:1: 'Staple'
            {
             before(grammarAccess.getStapleAccess().getStapleKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Staple__Group__2__Impl9522); 
             after(grammarAccess.getStapleAccess().getStapleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__2__Impl"


    // $ANTLR start "rule__Staple__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4816:1: rule__Staple__Group__3 : rule__Staple__Group__3__Impl rule__Staple__Group__4 ;
    public final void rule__Staple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4820:1: ( rule__Staple__Group__3__Impl rule__Staple__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4821:2: rule__Staple__Group__3__Impl rule__Staple__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__3__Impl_in_rule__Staple__Group__39553);
            rule__Staple__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__4_in_rule__Staple__Group__39556);
            rule__Staple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__3"


    // $ANTLR start "rule__Staple__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4828:1: rule__Staple__Group__3__Impl : ( '{' ) ;
    public final void rule__Staple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4832:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4833:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4833:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4834:1: '{'
            {
             before(grammarAccess.getStapleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Staple__Group__3__Impl9584); 
             after(grammarAccess.getStapleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__3__Impl"


    // $ANTLR start "rule__Staple__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4847:1: rule__Staple__Group__4 : rule__Staple__Group__4__Impl rule__Staple__Group__5 ;
    public final void rule__Staple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4851:1: ( rule__Staple__Group__4__Impl rule__Staple__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4852:2: rule__Staple__Group__4__Impl rule__Staple__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__4__Impl_in_rule__Staple__Group__49615);
            rule__Staple__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__5_in_rule__Staple__Group__49618);
            rule__Staple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__4"


    // $ANTLR start "rule__Staple__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4859:1: rule__Staple__Group__4__Impl : ( ( rule__Staple__Group_4__0 )? ) ;
    public final void rule__Staple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4863:1: ( ( ( rule__Staple__Group_4__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4864:1: ( ( rule__Staple__Group_4__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4864:1: ( ( rule__Staple__Group_4__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4865:1: ( rule__Staple__Group_4__0 )?
            {
             before(grammarAccess.getStapleAccess().getGroup_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4866:1: ( rule__Staple__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4866:2: rule__Staple__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_4__0_in_rule__Staple__Group__4__Impl9645);
                    rule__Staple__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__4__Impl"


    // $ANTLR start "rule__Staple__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4876:1: rule__Staple__Group__5 : rule__Staple__Group__5__Impl rule__Staple__Group__6 ;
    public final void rule__Staple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4880:1: ( rule__Staple__Group__5__Impl rule__Staple__Group__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4881:2: rule__Staple__Group__5__Impl rule__Staple__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__5__Impl_in_rule__Staple__Group__59676);
            rule__Staple__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__6_in_rule__Staple__Group__59679);
            rule__Staple__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__5"


    // $ANTLR start "rule__Staple__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4888:1: rule__Staple__Group__5__Impl : ( ( rule__Staple__Group_5__0 )? ) ;
    public final void rule__Staple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4892:1: ( ( ( rule__Staple__Group_5__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4893:1: ( ( rule__Staple__Group_5__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4893:1: ( ( rule__Staple__Group_5__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4894:1: ( rule__Staple__Group_5__0 )?
            {
             before(grammarAccess.getStapleAccess().getGroup_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4895:1: ( rule__Staple__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==33) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4895:2: rule__Staple__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_5__0_in_rule__Staple__Group__5__Impl9706);
                    rule__Staple__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__5__Impl"


    // $ANTLR start "rule__Staple__Group__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4905:1: rule__Staple__Group__6 : rule__Staple__Group__6__Impl rule__Staple__Group__7 ;
    public final void rule__Staple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4909:1: ( rule__Staple__Group__6__Impl rule__Staple__Group__7 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4910:2: rule__Staple__Group__6__Impl rule__Staple__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__6__Impl_in_rule__Staple__Group__69737);
            rule__Staple__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__7_in_rule__Staple__Group__69740);
            rule__Staple__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__6"


    // $ANTLR start "rule__Staple__Group__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4917:1: rule__Staple__Group__6__Impl : ( ( rule__Staple__Group_6__0 )? ) ;
    public final void rule__Staple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4921:1: ( ( ( rule__Staple__Group_6__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4922:1: ( ( rule__Staple__Group_6__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4922:1: ( ( rule__Staple__Group_6__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4923:1: ( rule__Staple__Group_6__0 )?
            {
             before(grammarAccess.getStapleAccess().getGroup_6()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4924:1: ( rule__Staple__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4924:2: rule__Staple__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_6__0_in_rule__Staple__Group__6__Impl9767);
                    rule__Staple__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__6__Impl"


    // $ANTLR start "rule__Staple__Group__7"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4934:1: rule__Staple__Group__7 : rule__Staple__Group__7__Impl rule__Staple__Group__8 ;
    public final void rule__Staple__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4938:1: ( rule__Staple__Group__7__Impl rule__Staple__Group__8 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4939:2: rule__Staple__Group__7__Impl rule__Staple__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__7__Impl_in_rule__Staple__Group__79798);
            rule__Staple__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__8_in_rule__Staple__Group__79801);
            rule__Staple__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__7"


    // $ANTLR start "rule__Staple__Group__7__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4946:1: rule__Staple__Group__7__Impl : ( ( rule__Staple__Group_7__0 )? ) ;
    public final void rule__Staple__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4950:1: ( ( ( rule__Staple__Group_7__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4951:1: ( ( rule__Staple__Group_7__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4951:1: ( ( rule__Staple__Group_7__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4952:1: ( rule__Staple__Group_7__0 )?
            {
             before(grammarAccess.getStapleAccess().getGroup_7()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4953:1: ( rule__Staple__Group_7__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4953:2: rule__Staple__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_7__0_in_rule__Staple__Group__7__Impl9828);
                    rule__Staple__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__7__Impl"


    // $ANTLR start "rule__Staple__Group__8"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4963:1: rule__Staple__Group__8 : rule__Staple__Group__8__Impl rule__Staple__Group__9 ;
    public final void rule__Staple__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4967:1: ( rule__Staple__Group__8__Impl rule__Staple__Group__9 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4968:2: rule__Staple__Group__8__Impl rule__Staple__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__8__Impl_in_rule__Staple__Group__89859);
            rule__Staple__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__9_in_rule__Staple__Group__89862);
            rule__Staple__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__8"


    // $ANTLR start "rule__Staple__Group__8__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4975:1: rule__Staple__Group__8__Impl : ( ( rule__Staple__Group_8__0 )? ) ;
    public final void rule__Staple__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4979:1: ( ( ( rule__Staple__Group_8__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4980:1: ( ( rule__Staple__Group_8__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4980:1: ( ( rule__Staple__Group_8__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4981:1: ( rule__Staple__Group_8__0 )?
            {
             before(grammarAccess.getStapleAccess().getGroup_8()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4982:1: ( rule__Staple__Group_8__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4982:2: rule__Staple__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_8__0_in_rule__Staple__Group__8__Impl9889);
                    rule__Staple__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__8__Impl"


    // $ANTLR start "rule__Staple__Group__9"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4992:1: rule__Staple__Group__9 : rule__Staple__Group__9__Impl rule__Staple__Group__10 ;
    public final void rule__Staple__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4996:1: ( rule__Staple__Group__9__Impl rule__Staple__Group__10 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:4997:2: rule__Staple__Group__9__Impl rule__Staple__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__9__Impl_in_rule__Staple__Group__99920);
            rule__Staple__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__10_in_rule__Staple__Group__99923);
            rule__Staple__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__9"


    // $ANTLR start "rule__Staple__Group__9__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5004:1: rule__Staple__Group__9__Impl : ( ( rule__Staple__Group_9__0 )? ) ;
    public final void rule__Staple__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5008:1: ( ( ( rule__Staple__Group_9__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5009:1: ( ( rule__Staple__Group_9__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5009:1: ( ( rule__Staple__Group_9__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5010:1: ( rule__Staple__Group_9__0 )?
            {
             before(grammarAccess.getStapleAccess().getGroup_9()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5011:1: ( rule__Staple__Group_9__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5011:2: rule__Staple__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_9__0_in_rule__Staple__Group__9__Impl9950);
                    rule__Staple__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__9__Impl"


    // $ANTLR start "rule__Staple__Group__10"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5021:1: rule__Staple__Group__10 : rule__Staple__Group__10__Impl rule__Staple__Group__11 ;
    public final void rule__Staple__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5025:1: ( rule__Staple__Group__10__Impl rule__Staple__Group__11 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5026:2: rule__Staple__Group__10__Impl rule__Staple__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__10__Impl_in_rule__Staple__Group__109981);
            rule__Staple__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__11_in_rule__Staple__Group__109984);
            rule__Staple__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__10"


    // $ANTLR start "rule__Staple__Group__10__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5033:1: rule__Staple__Group__10__Impl : ( ( rule__Staple__Group_10__0 )? ) ;
    public final void rule__Staple__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5037:1: ( ( ( rule__Staple__Group_10__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5038:1: ( ( rule__Staple__Group_10__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5038:1: ( ( rule__Staple__Group_10__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5039:1: ( rule__Staple__Group_10__0 )?
            {
             before(grammarAccess.getStapleAccess().getGroup_10()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5040:1: ( rule__Staple__Group_10__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5040:2: rule__Staple__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__0_in_rule__Staple__Group__10__Impl10011);
                    rule__Staple__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStapleAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__10__Impl"


    // $ANTLR start "rule__Staple__Group__11"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5050:1: rule__Staple__Group__11 : rule__Staple__Group__11__Impl ;
    public final void rule__Staple__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5054:1: ( rule__Staple__Group__11__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5055:2: rule__Staple__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group__11__Impl_in_rule__Staple__Group__1110042);
            rule__Staple__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__11"


    // $ANTLR start "rule__Staple__Group__11__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5061:1: rule__Staple__Group__11__Impl : ( '}' ) ;
    public final void rule__Staple__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5065:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5066:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5066:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5067:1: '}'
            {
             before(grammarAccess.getStapleAccess().getRightCurlyBracketKeyword_11()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Staple__Group__11__Impl10070); 
             after(grammarAccess.getStapleAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group__11__Impl"


    // $ANTLR start "rule__Staple__Group_4__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5104:1: rule__Staple__Group_4__0 : rule__Staple__Group_4__0__Impl rule__Staple__Group_4__1 ;
    public final void rule__Staple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5108:1: ( rule__Staple__Group_4__0__Impl rule__Staple__Group_4__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5109:2: rule__Staple__Group_4__0__Impl rule__Staple__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_4__0__Impl_in_rule__Staple__Group_4__010125);
            rule__Staple__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_4__1_in_rule__Staple__Group_4__010128);
            rule__Staple__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_4__0"


    // $ANTLR start "rule__Staple__Group_4__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5116:1: rule__Staple__Group_4__0__Impl : ( 'question' ) ;
    public final void rule__Staple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5120:1: ( ( 'question' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5121:1: ( 'question' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5121:1: ( 'question' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5122:1: 'question'
            {
             before(grammarAccess.getStapleAccess().getQuestionKeyword_4_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Staple__Group_4__0__Impl10156); 
             after(grammarAccess.getStapleAccess().getQuestionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_4__0__Impl"


    // $ANTLR start "rule__Staple__Group_4__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5135:1: rule__Staple__Group_4__1 : rule__Staple__Group_4__1__Impl ;
    public final void rule__Staple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5139:1: ( rule__Staple__Group_4__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5140:2: rule__Staple__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_4__1__Impl_in_rule__Staple__Group_4__110187);
            rule__Staple__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_4__1"


    // $ANTLR start "rule__Staple__Group_4__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5146:1: rule__Staple__Group_4__1__Impl : ( ( rule__Staple__QuestionAssignment_4_1 ) ) ;
    public final void rule__Staple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5150:1: ( ( ( rule__Staple__QuestionAssignment_4_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5151:1: ( ( rule__Staple__QuestionAssignment_4_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5151:1: ( ( rule__Staple__QuestionAssignment_4_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5152:1: ( rule__Staple__QuestionAssignment_4_1 )
            {
             before(grammarAccess.getStapleAccess().getQuestionAssignment_4_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5153:1: ( rule__Staple__QuestionAssignment_4_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5153:2: rule__Staple__QuestionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__QuestionAssignment_4_1_in_rule__Staple__Group_4__1__Impl10214);
            rule__Staple__QuestionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getQuestionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_4__1__Impl"


    // $ANTLR start "rule__Staple__Group_5__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5167:1: rule__Staple__Group_5__0 : rule__Staple__Group_5__0__Impl rule__Staple__Group_5__1 ;
    public final void rule__Staple__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5171:1: ( rule__Staple__Group_5__0__Impl rule__Staple__Group_5__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5172:2: rule__Staple__Group_5__0__Impl rule__Staple__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_5__0__Impl_in_rule__Staple__Group_5__010248);
            rule__Staple__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_5__1_in_rule__Staple__Group_5__010251);
            rule__Staple__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_5__0"


    // $ANTLR start "rule__Staple__Group_5__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5179:1: rule__Staple__Group_5__0__Impl : ( 'Min' ) ;
    public final void rule__Staple__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5183:1: ( ( 'Min' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5184:1: ( 'Min' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5184:1: ( 'Min' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5185:1: 'Min'
            {
             before(grammarAccess.getStapleAccess().getMinKeyword_5_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Staple__Group_5__0__Impl10279); 
             after(grammarAccess.getStapleAccess().getMinKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_5__0__Impl"


    // $ANTLR start "rule__Staple__Group_5__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5198:1: rule__Staple__Group_5__1 : rule__Staple__Group_5__1__Impl ;
    public final void rule__Staple__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5202:1: ( rule__Staple__Group_5__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5203:2: rule__Staple__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_5__1__Impl_in_rule__Staple__Group_5__110310);
            rule__Staple__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_5__1"


    // $ANTLR start "rule__Staple__Group_5__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5209:1: rule__Staple__Group_5__1__Impl : ( ( rule__Staple__MinAssignment_5_1 ) ) ;
    public final void rule__Staple__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5213:1: ( ( ( rule__Staple__MinAssignment_5_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5214:1: ( ( rule__Staple__MinAssignment_5_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5214:1: ( ( rule__Staple__MinAssignment_5_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5215:1: ( rule__Staple__MinAssignment_5_1 )
            {
             before(grammarAccess.getStapleAccess().getMinAssignment_5_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5216:1: ( rule__Staple__MinAssignment_5_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5216:2: rule__Staple__MinAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__MinAssignment_5_1_in_rule__Staple__Group_5__1__Impl10337);
            rule__Staple__MinAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getMinAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_5__1__Impl"


    // $ANTLR start "rule__Staple__Group_6__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5230:1: rule__Staple__Group_6__0 : rule__Staple__Group_6__0__Impl rule__Staple__Group_6__1 ;
    public final void rule__Staple__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5234:1: ( rule__Staple__Group_6__0__Impl rule__Staple__Group_6__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5235:2: rule__Staple__Group_6__0__Impl rule__Staple__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_6__0__Impl_in_rule__Staple__Group_6__010371);
            rule__Staple__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_6__1_in_rule__Staple__Group_6__010374);
            rule__Staple__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_6__0"


    // $ANTLR start "rule__Staple__Group_6__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5242:1: rule__Staple__Group_6__0__Impl : ( 'Max' ) ;
    public final void rule__Staple__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5246:1: ( ( 'Max' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5247:1: ( 'Max' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5247:1: ( 'Max' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5248:1: 'Max'
            {
             before(grammarAccess.getStapleAccess().getMaxKeyword_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Staple__Group_6__0__Impl10402); 
             after(grammarAccess.getStapleAccess().getMaxKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_6__0__Impl"


    // $ANTLR start "rule__Staple__Group_6__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5261:1: rule__Staple__Group_6__1 : rule__Staple__Group_6__1__Impl ;
    public final void rule__Staple__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5265:1: ( rule__Staple__Group_6__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5266:2: rule__Staple__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_6__1__Impl_in_rule__Staple__Group_6__110433);
            rule__Staple__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_6__1"


    // $ANTLR start "rule__Staple__Group_6__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5272:1: rule__Staple__Group_6__1__Impl : ( ( rule__Staple__MaxAssignment_6_1 ) ) ;
    public final void rule__Staple__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5276:1: ( ( ( rule__Staple__MaxAssignment_6_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5277:1: ( ( rule__Staple__MaxAssignment_6_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5277:1: ( ( rule__Staple__MaxAssignment_6_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5278:1: ( rule__Staple__MaxAssignment_6_1 )
            {
             before(grammarAccess.getStapleAccess().getMaxAssignment_6_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5279:1: ( rule__Staple__MaxAssignment_6_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5279:2: rule__Staple__MaxAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__MaxAssignment_6_1_in_rule__Staple__Group_6__1__Impl10460);
            rule__Staple__MaxAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getMaxAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_6__1__Impl"


    // $ANTLR start "rule__Staple__Group_7__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5293:1: rule__Staple__Group_7__0 : rule__Staple__Group_7__0__Impl rule__Staple__Group_7__1 ;
    public final void rule__Staple__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5297:1: ( rule__Staple__Group_7__0__Impl rule__Staple__Group_7__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5298:2: rule__Staple__Group_7__0__Impl rule__Staple__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_7__0__Impl_in_rule__Staple__Group_7__010494);
            rule__Staple__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_7__1_in_rule__Staple__Group_7__010497);
            rule__Staple__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_7__0"


    // $ANTLR start "rule__Staple__Group_7__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5305:1: rule__Staple__Group_7__0__Impl : ( 'first' ) ;
    public final void rule__Staple__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5309:1: ( ( 'first' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5310:1: ( 'first' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5310:1: ( 'first' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5311:1: 'first'
            {
             before(grammarAccess.getStapleAccess().getFirstKeyword_7_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Staple__Group_7__0__Impl10525); 
             after(grammarAccess.getStapleAccess().getFirstKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_7__0__Impl"


    // $ANTLR start "rule__Staple__Group_7__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5324:1: rule__Staple__Group_7__1 : rule__Staple__Group_7__1__Impl ;
    public final void rule__Staple__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5328:1: ( rule__Staple__Group_7__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5329:2: rule__Staple__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_7__1__Impl_in_rule__Staple__Group_7__110556);
            rule__Staple__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_7__1"


    // $ANTLR start "rule__Staple__Group_7__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5335:1: rule__Staple__Group_7__1__Impl : ( ( rule__Staple__FirstAssignment_7_1 ) ) ;
    public final void rule__Staple__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5339:1: ( ( ( rule__Staple__FirstAssignment_7_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5340:1: ( ( rule__Staple__FirstAssignment_7_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5340:1: ( ( rule__Staple__FirstAssignment_7_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5341:1: ( rule__Staple__FirstAssignment_7_1 )
            {
             before(grammarAccess.getStapleAccess().getFirstAssignment_7_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5342:1: ( rule__Staple__FirstAssignment_7_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5342:2: rule__Staple__FirstAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__FirstAssignment_7_1_in_rule__Staple__Group_7__1__Impl10583);
            rule__Staple__FirstAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getFirstAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_7__1__Impl"


    // $ANTLR start "rule__Staple__Group_8__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5356:1: rule__Staple__Group_8__0 : rule__Staple__Group_8__0__Impl rule__Staple__Group_8__1 ;
    public final void rule__Staple__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5360:1: ( rule__Staple__Group_8__0__Impl rule__Staple__Group_8__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5361:2: rule__Staple__Group_8__0__Impl rule__Staple__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_8__0__Impl_in_rule__Staple__Group_8__010617);
            rule__Staple__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_8__1_in_rule__Staple__Group_8__010620);
            rule__Staple__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_8__0"


    // $ANTLR start "rule__Staple__Group_8__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5368:1: rule__Staple__Group_8__0__Impl : ( 'last' ) ;
    public final void rule__Staple__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5372:1: ( ( 'last' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5373:1: ( 'last' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5373:1: ( 'last' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5374:1: 'last'
            {
             before(grammarAccess.getStapleAccess().getLastKeyword_8_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Staple__Group_8__0__Impl10648); 
             after(grammarAccess.getStapleAccess().getLastKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_8__0__Impl"


    // $ANTLR start "rule__Staple__Group_8__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5387:1: rule__Staple__Group_8__1 : rule__Staple__Group_8__1__Impl ;
    public final void rule__Staple__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5391:1: ( rule__Staple__Group_8__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5392:2: rule__Staple__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_8__1__Impl_in_rule__Staple__Group_8__110679);
            rule__Staple__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_8__1"


    // $ANTLR start "rule__Staple__Group_8__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5398:1: rule__Staple__Group_8__1__Impl : ( ( rule__Staple__LastAssignment_8_1 ) ) ;
    public final void rule__Staple__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5402:1: ( ( ( rule__Staple__LastAssignment_8_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5403:1: ( ( rule__Staple__LastAssignment_8_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5403:1: ( ( rule__Staple__LastAssignment_8_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5404:1: ( rule__Staple__LastAssignment_8_1 )
            {
             before(grammarAccess.getStapleAccess().getLastAssignment_8_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5405:1: ( rule__Staple__LastAssignment_8_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5405:2: rule__Staple__LastAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__LastAssignment_8_1_in_rule__Staple__Group_8__1__Impl10706);
            rule__Staple__LastAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getLastAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_8__1__Impl"


    // $ANTLR start "rule__Staple__Group_9__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5419:1: rule__Staple__Group_9__0 : rule__Staple__Group_9__0__Impl rule__Staple__Group_9__1 ;
    public final void rule__Staple__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5423:1: ( rule__Staple__Group_9__0__Impl rule__Staple__Group_9__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5424:2: rule__Staple__Group_9__0__Impl rule__Staple__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_9__0__Impl_in_rule__Staple__Group_9__010740);
            rule__Staple__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_9__1_in_rule__Staple__Group_9__010743);
            rule__Staple__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_9__0"


    // $ANTLR start "rule__Staple__Group_9__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5431:1: rule__Staple__Group_9__0__Impl : ( 'mid' ) ;
    public final void rule__Staple__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5435:1: ( ( 'mid' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5436:1: ( 'mid' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5436:1: ( 'mid' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5437:1: 'mid'
            {
             before(grammarAccess.getStapleAccess().getMidKeyword_9_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Staple__Group_9__0__Impl10771); 
             after(grammarAccess.getStapleAccess().getMidKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_9__0__Impl"


    // $ANTLR start "rule__Staple__Group_9__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5450:1: rule__Staple__Group_9__1 : rule__Staple__Group_9__1__Impl ;
    public final void rule__Staple__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5454:1: ( rule__Staple__Group_9__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5455:2: rule__Staple__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_9__1__Impl_in_rule__Staple__Group_9__110802);
            rule__Staple__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_9__1"


    // $ANTLR start "rule__Staple__Group_9__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5461:1: rule__Staple__Group_9__1__Impl : ( ( rule__Staple__MidAssignment_9_1 ) ) ;
    public final void rule__Staple__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5465:1: ( ( ( rule__Staple__MidAssignment_9_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5466:1: ( ( rule__Staple__MidAssignment_9_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5466:1: ( ( rule__Staple__MidAssignment_9_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5467:1: ( rule__Staple__MidAssignment_9_1 )
            {
             before(grammarAccess.getStapleAccess().getMidAssignment_9_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5468:1: ( rule__Staple__MidAssignment_9_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5468:2: rule__Staple__MidAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__MidAssignment_9_1_in_rule__Staple__Group_9__1__Impl10829);
            rule__Staple__MidAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getMidAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_9__1__Impl"


    // $ANTLR start "rule__Staple__Group_10__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5482:1: rule__Staple__Group_10__0 : rule__Staple__Group_10__0__Impl rule__Staple__Group_10__1 ;
    public final void rule__Staple__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5486:1: ( rule__Staple__Group_10__0__Impl rule__Staple__Group_10__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5487:2: rule__Staple__Group_10__0__Impl rule__Staple__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__0__Impl_in_rule__Staple__Group_10__010863);
            rule__Staple__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__1_in_rule__Staple__Group_10__010866);
            rule__Staple__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__0"


    // $ANTLR start "rule__Staple__Group_10__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5494:1: rule__Staple__Group_10__0__Impl : ( 'RatingForks' ) ;
    public final void rule__Staple__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5498:1: ( ( 'RatingForks' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5499:1: ( 'RatingForks' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5499:1: ( 'RatingForks' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5500:1: 'RatingForks'
            {
             before(grammarAccess.getStapleAccess().getRatingForksKeyword_10_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Staple__Group_10__0__Impl10894); 
             after(grammarAccess.getStapleAccess().getRatingForksKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__0__Impl"


    // $ANTLR start "rule__Staple__Group_10__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5513:1: rule__Staple__Group_10__1 : rule__Staple__Group_10__1__Impl rule__Staple__Group_10__2 ;
    public final void rule__Staple__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5517:1: ( rule__Staple__Group_10__1__Impl rule__Staple__Group_10__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5518:2: rule__Staple__Group_10__1__Impl rule__Staple__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__1__Impl_in_rule__Staple__Group_10__110925);
            rule__Staple__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__2_in_rule__Staple__Group_10__110928);
            rule__Staple__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__1"


    // $ANTLR start "rule__Staple__Group_10__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5525:1: rule__Staple__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Staple__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5529:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5530:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5530:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5531:1: '{'
            {
             before(grammarAccess.getStapleAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Staple__Group_10__1__Impl10956); 
             after(grammarAccess.getStapleAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__1__Impl"


    // $ANTLR start "rule__Staple__Group_10__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5544:1: rule__Staple__Group_10__2 : rule__Staple__Group_10__2__Impl rule__Staple__Group_10__3 ;
    public final void rule__Staple__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5548:1: ( rule__Staple__Group_10__2__Impl rule__Staple__Group_10__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5549:2: rule__Staple__Group_10__2__Impl rule__Staple__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__2__Impl_in_rule__Staple__Group_10__210987);
            rule__Staple__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__3_in_rule__Staple__Group_10__210990);
            rule__Staple__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__2"


    // $ANTLR start "rule__Staple__Group_10__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5556:1: rule__Staple__Group_10__2__Impl : ( ( rule__Staple__RatingForksAssignment_10_2 ) ) ;
    public final void rule__Staple__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5560:1: ( ( ( rule__Staple__RatingForksAssignment_10_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5561:1: ( ( rule__Staple__RatingForksAssignment_10_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5561:1: ( ( rule__Staple__RatingForksAssignment_10_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5562:1: ( rule__Staple__RatingForksAssignment_10_2 )
            {
             before(grammarAccess.getStapleAccess().getRatingForksAssignment_10_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5563:1: ( rule__Staple__RatingForksAssignment_10_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5563:2: rule__Staple__RatingForksAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__RatingForksAssignment_10_2_in_rule__Staple__Group_10__2__Impl11017);
            rule__Staple__RatingForksAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getRatingForksAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__2__Impl"


    // $ANTLR start "rule__Staple__Group_10__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5573:1: rule__Staple__Group_10__3 : rule__Staple__Group_10__3__Impl rule__Staple__Group_10__4 ;
    public final void rule__Staple__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5577:1: ( rule__Staple__Group_10__3__Impl rule__Staple__Group_10__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5578:2: rule__Staple__Group_10__3__Impl rule__Staple__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__3__Impl_in_rule__Staple__Group_10__311047);
            rule__Staple__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__4_in_rule__Staple__Group_10__311050);
            rule__Staple__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__3"


    // $ANTLR start "rule__Staple__Group_10__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5585:1: rule__Staple__Group_10__3__Impl : ( ( rule__Staple__Group_10_3__0 )* ) ;
    public final void rule__Staple__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5589:1: ( ( ( rule__Staple__Group_10_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5590:1: ( ( rule__Staple__Group_10_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5590:1: ( ( rule__Staple__Group_10_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5591:1: ( rule__Staple__Group_10_3__0 )*
            {
             before(grammarAccess.getStapleAccess().getGroup_10_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5592:1: ( rule__Staple__Group_10_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==13) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5592:2: rule__Staple__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10_3__0_in_rule__Staple__Group_10__3__Impl11077);
            	    rule__Staple__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getStapleAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__3__Impl"


    // $ANTLR start "rule__Staple__Group_10__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5602:1: rule__Staple__Group_10__4 : rule__Staple__Group_10__4__Impl ;
    public final void rule__Staple__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5606:1: ( rule__Staple__Group_10__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5607:2: rule__Staple__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10__4__Impl_in_rule__Staple__Group_10__411108);
            rule__Staple__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__4"


    // $ANTLR start "rule__Staple__Group_10__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5613:1: rule__Staple__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Staple__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5617:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5618:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5618:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5619:1: '}'
            {
             before(grammarAccess.getStapleAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Staple__Group_10__4__Impl11136); 
             after(grammarAccess.getStapleAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10__4__Impl"


    // $ANTLR start "rule__Staple__Group_10_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5642:1: rule__Staple__Group_10_3__0 : rule__Staple__Group_10_3__0__Impl rule__Staple__Group_10_3__1 ;
    public final void rule__Staple__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5646:1: ( rule__Staple__Group_10_3__0__Impl rule__Staple__Group_10_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5647:2: rule__Staple__Group_10_3__0__Impl rule__Staple__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10_3__0__Impl_in_rule__Staple__Group_10_3__011177);
            rule__Staple__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10_3__1_in_rule__Staple__Group_10_3__011180);
            rule__Staple__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10_3__0"


    // $ANTLR start "rule__Staple__Group_10_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5654:1: rule__Staple__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Staple__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5658:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5659:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5659:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5660:1: ','
            {
             before(grammarAccess.getStapleAccess().getCommaKeyword_10_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Staple__Group_10_3__0__Impl11208); 
             after(grammarAccess.getStapleAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10_3__0__Impl"


    // $ANTLR start "rule__Staple__Group_10_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5673:1: rule__Staple__Group_10_3__1 : rule__Staple__Group_10_3__1__Impl ;
    public final void rule__Staple__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5677:1: ( rule__Staple__Group_10_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5678:2: rule__Staple__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__Group_10_3__1__Impl_in_rule__Staple__Group_10_3__111239);
            rule__Staple__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10_3__1"


    // $ANTLR start "rule__Staple__Group_10_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5684:1: rule__Staple__Group_10_3__1__Impl : ( ( rule__Staple__RatingForksAssignment_10_3_1 ) ) ;
    public final void rule__Staple__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5688:1: ( ( ( rule__Staple__RatingForksAssignment_10_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5689:1: ( ( rule__Staple__RatingForksAssignment_10_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5689:1: ( ( rule__Staple__RatingForksAssignment_10_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5690:1: ( rule__Staple__RatingForksAssignment_10_3_1 )
            {
             before(grammarAccess.getStapleAccess().getRatingForksAssignment_10_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5691:1: ( rule__Staple__RatingForksAssignment_10_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5691:2: rule__Staple__RatingForksAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Staple__RatingForksAssignment_10_3_1_in_rule__Staple__Group_10_3__1__Impl11266);
            rule__Staple__RatingForksAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStapleAccess().getRatingForksAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__Group_10_3__1__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5705:1: rule__MultipleChoiceFork__Group__0 : rule__MultipleChoiceFork__Group__0__Impl rule__MultipleChoiceFork__Group__1 ;
    public final void rule__MultipleChoiceFork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5709:1: ( rule__MultipleChoiceFork__Group__0__Impl rule__MultipleChoiceFork__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5710:2: rule__MultipleChoiceFork__Group__0__Impl rule__MultipleChoiceFork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__0__Impl_in_rule__MultipleChoiceFork__Group__011300);
            rule__MultipleChoiceFork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__1_in_rule__MultipleChoiceFork__Group__011303);
            rule__MultipleChoiceFork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__0"


    // $ANTLR start "rule__MultipleChoiceFork__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5717:1: rule__MultipleChoiceFork__Group__0__Impl : ( 'condition' ) ;
    public final void rule__MultipleChoiceFork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5721:1: ( ( 'condition' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5722:1: ( 'condition' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5722:1: ( 'condition' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5723:1: 'condition'
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getConditionKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__MultipleChoiceFork__Group__0__Impl11331); 
             after(grammarAccess.getMultipleChoiceForkAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__0__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5736:1: rule__MultipleChoiceFork__Group__1 : rule__MultipleChoiceFork__Group__1__Impl rule__MultipleChoiceFork__Group__2 ;
    public final void rule__MultipleChoiceFork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5740:1: ( rule__MultipleChoiceFork__Group__1__Impl rule__MultipleChoiceFork__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5741:2: rule__MultipleChoiceFork__Group__1__Impl rule__MultipleChoiceFork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__1__Impl_in_rule__MultipleChoiceFork__Group__111362);
            rule__MultipleChoiceFork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__2_in_rule__MultipleChoiceFork__Group__111365);
            rule__MultipleChoiceFork__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__1"


    // $ANTLR start "rule__MultipleChoiceFork__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5748:1: rule__MultipleChoiceFork__Group__1__Impl : ( 'matcher' ) ;
    public final void rule__MultipleChoiceFork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5752:1: ( ( 'matcher' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5753:1: ( 'matcher' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5753:1: ( 'matcher' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5754:1: 'matcher'
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getMatcherKeyword_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__MultipleChoiceFork__Group__1__Impl11393); 
             after(grammarAccess.getMultipleChoiceForkAccess().getMatcherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5767:1: rule__MultipleChoiceFork__Group__2 : rule__MultipleChoiceFork__Group__2__Impl rule__MultipleChoiceFork__Group__3 ;
    public final void rule__MultipleChoiceFork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5771:1: ( rule__MultipleChoiceFork__Group__2__Impl rule__MultipleChoiceFork__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5772:2: rule__MultipleChoiceFork__Group__2__Impl rule__MultipleChoiceFork__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__2__Impl_in_rule__MultipleChoiceFork__Group__211424);
            rule__MultipleChoiceFork__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__3_in_rule__MultipleChoiceFork__Group__211427);
            rule__MultipleChoiceFork__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__2"


    // $ANTLR start "rule__MultipleChoiceFork__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5779:1: rule__MultipleChoiceFork__Group__2__Impl : ( ( rule__MultipleChoiceFork__MatcherAssignment_2 ) ) ;
    public final void rule__MultipleChoiceFork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5783:1: ( ( ( rule__MultipleChoiceFork__MatcherAssignment_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5784:1: ( ( rule__MultipleChoiceFork__MatcherAssignment_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5784:1: ( ( rule__MultipleChoiceFork__MatcherAssignment_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5785:1: ( rule__MultipleChoiceFork__MatcherAssignment_2 )
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getMatcherAssignment_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5786:1: ( rule__MultipleChoiceFork__MatcherAssignment_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5786:2: rule__MultipleChoiceFork__MatcherAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__MatcherAssignment_2_in_rule__MultipleChoiceFork__Group__2__Impl11454);
            rule__MultipleChoiceFork__MatcherAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceForkAccess().getMatcherAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__2__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5796:1: rule__MultipleChoiceFork__Group__3 : rule__MultipleChoiceFork__Group__3__Impl ;
    public final void rule__MultipleChoiceFork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5800:1: ( rule__MultipleChoiceFork__Group__3__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5801:2: rule__MultipleChoiceFork__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group__3__Impl_in_rule__MultipleChoiceFork__Group__311484);
            rule__MultipleChoiceFork__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__3"


    // $ANTLR start "rule__MultipleChoiceFork__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5807:1: rule__MultipleChoiceFork__Group__3__Impl : ( ( rule__MultipleChoiceFork__Group_3__0 )? ) ;
    public final void rule__MultipleChoiceFork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5811:1: ( ( ( rule__MultipleChoiceFork__Group_3__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5812:1: ( ( rule__MultipleChoiceFork__Group_3__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5812:1: ( ( rule__MultipleChoiceFork__Group_3__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5813:1: ( rule__MultipleChoiceFork__Group_3__0 )?
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getGroup_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5814:1: ( rule__MultipleChoiceFork__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5814:2: rule__MultipleChoiceFork__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__0_in_rule__MultipleChoiceFork__Group__3__Impl11511);
                    rule__MultipleChoiceFork__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoiceForkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group__3__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5832:1: rule__MultipleChoiceFork__Group_3__0 : rule__MultipleChoiceFork__Group_3__0__Impl rule__MultipleChoiceFork__Group_3__1 ;
    public final void rule__MultipleChoiceFork__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5836:1: ( rule__MultipleChoiceFork__Group_3__0__Impl rule__MultipleChoiceFork__Group_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5837:2: rule__MultipleChoiceFork__Group_3__0__Impl rule__MultipleChoiceFork__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__0__Impl_in_rule__MultipleChoiceFork__Group_3__011550);
            rule__MultipleChoiceFork__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__1_in_rule__MultipleChoiceFork__Group_3__011553);
            rule__MultipleChoiceFork__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__0"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5844:1: rule__MultipleChoiceFork__Group_3__0__Impl : ( 'questions' ) ;
    public final void rule__MultipleChoiceFork__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5848:1: ( ( 'questions' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5849:1: ( 'questions' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5849:1: ( 'questions' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5850:1: 'questions'
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getQuestionsKeyword_3_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__MultipleChoiceFork__Group_3__0__Impl11581); 
             after(grammarAccess.getMultipleChoiceForkAccess().getQuestionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__0__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5863:1: rule__MultipleChoiceFork__Group_3__1 : rule__MultipleChoiceFork__Group_3__1__Impl rule__MultipleChoiceFork__Group_3__2 ;
    public final void rule__MultipleChoiceFork__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5867:1: ( rule__MultipleChoiceFork__Group_3__1__Impl rule__MultipleChoiceFork__Group_3__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5868:2: rule__MultipleChoiceFork__Group_3__1__Impl rule__MultipleChoiceFork__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__1__Impl_in_rule__MultipleChoiceFork__Group_3__111612);
            rule__MultipleChoiceFork__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__2_in_rule__MultipleChoiceFork__Group_3__111615);
            rule__MultipleChoiceFork__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__1"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5875:1: rule__MultipleChoiceFork__Group_3__1__Impl : ( ':' ) ;
    public final void rule__MultipleChoiceFork__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5879:1: ( ( ':' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5880:1: ( ':' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5880:1: ( ':' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5881:1: ':'
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getColonKeyword_3_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MultipleChoiceFork__Group_3__1__Impl11643); 
             after(grammarAccess.getMultipleChoiceForkAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__1__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5894:1: rule__MultipleChoiceFork__Group_3__2 : rule__MultipleChoiceFork__Group_3__2__Impl rule__MultipleChoiceFork__Group_3__3 ;
    public final void rule__MultipleChoiceFork__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5898:1: ( rule__MultipleChoiceFork__Group_3__2__Impl rule__MultipleChoiceFork__Group_3__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5899:2: rule__MultipleChoiceFork__Group_3__2__Impl rule__MultipleChoiceFork__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__2__Impl_in_rule__MultipleChoiceFork__Group_3__211674);
            rule__MultipleChoiceFork__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__3_in_rule__MultipleChoiceFork__Group_3__211677);
            rule__MultipleChoiceFork__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__2"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5906:1: rule__MultipleChoiceFork__Group_3__2__Impl : ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2 ) ) ;
    public final void rule__MultipleChoiceFork__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5910:1: ( ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5911:1: ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5911:1: ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5912:1: ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2 )
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsAssignment_3_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5913:1: ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5913:2: rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2_in_rule__MultipleChoiceFork__Group_3__2__Impl11704);
            rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__2__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5923:1: rule__MultipleChoiceFork__Group_3__3 : rule__MultipleChoiceFork__Group_3__3__Impl ;
    public final void rule__MultipleChoiceFork__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5927:1: ( rule__MultipleChoiceFork__Group_3__3__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5928:2: rule__MultipleChoiceFork__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3__3__Impl_in_rule__MultipleChoiceFork__Group_3__311734);
            rule__MultipleChoiceFork__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__3"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5934:1: rule__MultipleChoiceFork__Group_3__3__Impl : ( ( rule__MultipleChoiceFork__Group_3_3__0 )* ) ;
    public final void rule__MultipleChoiceFork__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5938:1: ( ( ( rule__MultipleChoiceFork__Group_3_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5939:1: ( ( rule__MultipleChoiceFork__Group_3_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5939:1: ( ( rule__MultipleChoiceFork__Group_3_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5940:1: ( rule__MultipleChoiceFork__Group_3_3__0 )*
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getGroup_3_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5941:1: ( rule__MultipleChoiceFork__Group_3_3__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==13) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5941:2: rule__MultipleChoiceFork__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3_3__0_in_rule__MultipleChoiceFork__Group_3__3__Impl11761);
            	    rule__MultipleChoiceFork__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getMultipleChoiceForkAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3__3__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5959:1: rule__MultipleChoiceFork__Group_3_3__0 : rule__MultipleChoiceFork__Group_3_3__0__Impl rule__MultipleChoiceFork__Group_3_3__1 ;
    public final void rule__MultipleChoiceFork__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5963:1: ( rule__MultipleChoiceFork__Group_3_3__0__Impl rule__MultipleChoiceFork__Group_3_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5964:2: rule__MultipleChoiceFork__Group_3_3__0__Impl rule__MultipleChoiceFork__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3_3__0__Impl_in_rule__MultipleChoiceFork__Group_3_3__011800);
            rule__MultipleChoiceFork__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3_3__1_in_rule__MultipleChoiceFork__Group_3_3__011803);
            rule__MultipleChoiceFork__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3_3__0"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5971:1: rule__MultipleChoiceFork__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__MultipleChoiceFork__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5975:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5976:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5976:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5977:1: ','
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getCommaKeyword_3_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MultipleChoiceFork__Group_3_3__0__Impl11831); 
             after(grammarAccess.getMultipleChoiceForkAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3_3__0__Impl"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5990:1: rule__MultipleChoiceFork__Group_3_3__1 : rule__MultipleChoiceFork__Group_3_3__1__Impl ;
    public final void rule__MultipleChoiceFork__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5994:1: ( rule__MultipleChoiceFork__Group_3_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:5995:2: rule__MultipleChoiceFork__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__Group_3_3__1__Impl_in_rule__MultipleChoiceFork__Group_3_3__111862);
            rule__MultipleChoiceFork__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3_3__1"


    // $ANTLR start "rule__MultipleChoiceFork__Group_3_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6001:1: rule__MultipleChoiceFork__Group_3_3__1__Impl : ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1 ) ) ;
    public final void rule__MultipleChoiceFork__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6005:1: ( ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6006:1: ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6006:1: ( ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6007:1: ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1 )
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsAssignment_3_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6008:1: ( rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6008:2: rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1_in_rule__MultipleChoiceFork__Group_3_3__1__Impl11889);
            rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__Group_3_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6022:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6026:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6027:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011923);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011926);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6034:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6038:1: ( ( ( '-' )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6039:1: ( ( '-' )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6039:1: ( ( '-' )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6040:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6041:1: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6042:2: '-'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_rule__EInt__Group__0__Impl11955); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6053:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6057:1: ( rule__EInt__Group__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6058:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111988);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6064:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6068:1: ( ( RULE_INT ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6069:1: ( RULE_INT )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6069:1: ( RULE_INT )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6070:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl12015); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__RatingFork__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6085:1: rule__RatingFork__Group__0 : rule__RatingFork__Group__0__Impl rule__RatingFork__Group__1 ;
    public final void rule__RatingFork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6089:1: ( rule__RatingFork__Group__0__Impl rule__RatingFork__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6090:2: rule__RatingFork__Group__0__Impl rule__RatingFork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__0__Impl_in_rule__RatingFork__Group__012048);
            rule__RatingFork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__1_in_rule__RatingFork__Group__012051);
            rule__RatingFork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__0"


    // $ANTLR start "rule__RatingFork__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6097:1: rule__RatingFork__Group__0__Impl : ( () ) ;
    public final void rule__RatingFork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6101:1: ( ( () ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6102:1: ( () )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6102:1: ( () )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6103:1: ()
            {
             before(grammarAccess.getRatingForkAccess().getRatingForkAction_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6104:1: ()
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6106:1: 
            {
            }

             after(grammarAccess.getRatingForkAccess().getRatingForkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__0__Impl"


    // $ANTLR start "rule__RatingFork__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6116:1: rule__RatingFork__Group__1 : rule__RatingFork__Group__1__Impl rule__RatingFork__Group__2 ;
    public final void rule__RatingFork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6120:1: ( rule__RatingFork__Group__1__Impl rule__RatingFork__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6121:2: rule__RatingFork__Group__1__Impl rule__RatingFork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__1__Impl_in_rule__RatingFork__Group__112109);
            rule__RatingFork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__2_in_rule__RatingFork__Group__112112);
            rule__RatingFork__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__1"


    // $ANTLR start "rule__RatingFork__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6128:1: rule__RatingFork__Group__1__Impl : ( 'RatingFork' ) ;
    public final void rule__RatingFork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6132:1: ( ( 'RatingFork' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6133:1: ( 'RatingFork' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6133:1: ( 'RatingFork' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6134:1: 'RatingFork'
            {
             before(grammarAccess.getRatingForkAccess().getRatingForkKeyword_1()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__RatingFork__Group__1__Impl12140); 
             after(grammarAccess.getRatingForkAccess().getRatingForkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__1__Impl"


    // $ANTLR start "rule__RatingFork__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6147:1: rule__RatingFork__Group__2 : rule__RatingFork__Group__2__Impl rule__RatingFork__Group__3 ;
    public final void rule__RatingFork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6151:1: ( rule__RatingFork__Group__2__Impl rule__RatingFork__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6152:2: rule__RatingFork__Group__2__Impl rule__RatingFork__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__2__Impl_in_rule__RatingFork__Group__212171);
            rule__RatingFork__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__3_in_rule__RatingFork__Group__212174);
            rule__RatingFork__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__2"


    // $ANTLR start "rule__RatingFork__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6159:1: rule__RatingFork__Group__2__Impl : ( '{' ) ;
    public final void rule__RatingFork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6163:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6164:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6164:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6165:1: '{'
            {
             before(grammarAccess.getRatingForkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RatingFork__Group__2__Impl12202); 
             after(grammarAccess.getRatingForkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__2__Impl"


    // $ANTLR start "rule__RatingFork__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6178:1: rule__RatingFork__Group__3 : rule__RatingFork__Group__3__Impl rule__RatingFork__Group__4 ;
    public final void rule__RatingFork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6182:1: ( rule__RatingFork__Group__3__Impl rule__RatingFork__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6183:2: rule__RatingFork__Group__3__Impl rule__RatingFork__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__3__Impl_in_rule__RatingFork__Group__312233);
            rule__RatingFork__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__4_in_rule__RatingFork__Group__312236);
            rule__RatingFork__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__3"


    // $ANTLR start "rule__RatingFork__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6190:1: rule__RatingFork__Group__3__Impl : ( ( rule__RatingFork__Group_3__0 )? ) ;
    public final void rule__RatingFork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6194:1: ( ( ( rule__RatingFork__Group_3__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6195:1: ( ( rule__RatingFork__Group_3__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6195:1: ( ( rule__RatingFork__Group_3__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6196:1: ( rule__RatingFork__Group_3__0 )?
            {
             before(grammarAccess.getRatingForkAccess().getGroup_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6197:1: ( rule__RatingFork__Group_3__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==52) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6197:2: rule__RatingFork__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_3__0_in_rule__RatingFork__Group__3__Impl12263);
                    rule__RatingFork__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatingForkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__3__Impl"


    // $ANTLR start "rule__RatingFork__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6207:1: rule__RatingFork__Group__4 : rule__RatingFork__Group__4__Impl rule__RatingFork__Group__5 ;
    public final void rule__RatingFork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6211:1: ( rule__RatingFork__Group__4__Impl rule__RatingFork__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6212:2: rule__RatingFork__Group__4__Impl rule__RatingFork__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__4__Impl_in_rule__RatingFork__Group__412294);
            rule__RatingFork__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__5_in_rule__RatingFork__Group__412297);
            rule__RatingFork__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__4"


    // $ANTLR start "rule__RatingFork__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6219:1: rule__RatingFork__Group__4__Impl : ( ( rule__RatingFork__Group_4__0 )? ) ;
    public final void rule__RatingFork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6223:1: ( ( ( rule__RatingFork__Group_4__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6224:1: ( ( rule__RatingFork__Group_4__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6224:1: ( ( rule__RatingFork__Group_4__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6225:1: ( rule__RatingFork__Group_4__0 )?
            {
             before(grammarAccess.getRatingForkAccess().getGroup_4()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6226:1: ( rule__RatingFork__Group_4__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==53) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6226:2: rule__RatingFork__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_4__0_in_rule__RatingFork__Group__4__Impl12324);
                    rule__RatingFork__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatingForkAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__4__Impl"


    // $ANTLR start "rule__RatingFork__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6236:1: rule__RatingFork__Group__5 : rule__RatingFork__Group__5__Impl rule__RatingFork__Group__6 ;
    public final void rule__RatingFork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6240:1: ( rule__RatingFork__Group__5__Impl rule__RatingFork__Group__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6241:2: rule__RatingFork__Group__5__Impl rule__RatingFork__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__5__Impl_in_rule__RatingFork__Group__512355);
            rule__RatingFork__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__6_in_rule__RatingFork__Group__512358);
            rule__RatingFork__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__5"


    // $ANTLR start "rule__RatingFork__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6248:1: rule__RatingFork__Group__5__Impl : ( ( rule__RatingFork__Group_5__0 )? ) ;
    public final void rule__RatingFork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6252:1: ( ( ( rule__RatingFork__Group_5__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6253:1: ( ( rule__RatingFork__Group_5__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6253:1: ( ( rule__RatingFork__Group_5__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6254:1: ( rule__RatingFork__Group_5__0 )?
            {
             before(grammarAccess.getRatingForkAccess().getGroup_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6255:1: ( rule__RatingFork__Group_5__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==26) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6255:2: rule__RatingFork__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__0_in_rule__RatingFork__Group__5__Impl12385);
                    rule__RatingFork__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatingForkAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__5__Impl"


    // $ANTLR start "rule__RatingFork__Group__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6265:1: rule__RatingFork__Group__6 : rule__RatingFork__Group__6__Impl ;
    public final void rule__RatingFork__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6269:1: ( rule__RatingFork__Group__6__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6270:2: rule__RatingFork__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group__6__Impl_in_rule__RatingFork__Group__612416);
            rule__RatingFork__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__6"


    // $ANTLR start "rule__RatingFork__Group__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6276:1: rule__RatingFork__Group__6__Impl : ( '}' ) ;
    public final void rule__RatingFork__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6280:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6281:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6281:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6282:1: '}'
            {
             before(grammarAccess.getRatingForkAccess().getRightCurlyBracketKeyword_6()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RatingFork__Group__6__Impl12444); 
             after(grammarAccess.getRatingForkAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group__6__Impl"


    // $ANTLR start "rule__RatingFork__Group_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6309:1: rule__RatingFork__Group_3__0 : rule__RatingFork__Group_3__0__Impl rule__RatingFork__Group_3__1 ;
    public final void rule__RatingFork__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6313:1: ( rule__RatingFork__Group_3__0__Impl rule__RatingFork__Group_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6314:2: rule__RatingFork__Group_3__0__Impl rule__RatingFork__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_3__0__Impl_in_rule__RatingFork__Group_3__012489);
            rule__RatingFork__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_3__1_in_rule__RatingFork__Group_3__012492);
            rule__RatingFork__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_3__0"


    // $ANTLR start "rule__RatingFork__Group_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6321:1: rule__RatingFork__Group_3__0__Impl : ( 'min' ) ;
    public final void rule__RatingFork__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6325:1: ( ( 'min' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6326:1: ( 'min' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6326:1: ( 'min' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6327:1: 'min'
            {
             before(grammarAccess.getRatingForkAccess().getMinKeyword_3_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__RatingFork__Group_3__0__Impl12520); 
             after(grammarAccess.getRatingForkAccess().getMinKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_3__0__Impl"


    // $ANTLR start "rule__RatingFork__Group_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6340:1: rule__RatingFork__Group_3__1 : rule__RatingFork__Group_3__1__Impl ;
    public final void rule__RatingFork__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6344:1: ( rule__RatingFork__Group_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6345:2: rule__RatingFork__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_3__1__Impl_in_rule__RatingFork__Group_3__112551);
            rule__RatingFork__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_3__1"


    // $ANTLR start "rule__RatingFork__Group_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6351:1: rule__RatingFork__Group_3__1__Impl : ( ( rule__RatingFork__MinAssignment_3_1 ) ) ;
    public final void rule__RatingFork__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6355:1: ( ( ( rule__RatingFork__MinAssignment_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6356:1: ( ( rule__RatingFork__MinAssignment_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6356:1: ( ( rule__RatingFork__MinAssignment_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6357:1: ( rule__RatingFork__MinAssignment_3_1 )
            {
             before(grammarAccess.getRatingForkAccess().getMinAssignment_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6358:1: ( rule__RatingFork__MinAssignment_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6358:2: rule__RatingFork__MinAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__MinAssignment_3_1_in_rule__RatingFork__Group_3__1__Impl12578);
            rule__RatingFork__MinAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRatingForkAccess().getMinAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_3__1__Impl"


    // $ANTLR start "rule__RatingFork__Group_4__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6372:1: rule__RatingFork__Group_4__0 : rule__RatingFork__Group_4__0__Impl rule__RatingFork__Group_4__1 ;
    public final void rule__RatingFork__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6376:1: ( rule__RatingFork__Group_4__0__Impl rule__RatingFork__Group_4__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6377:2: rule__RatingFork__Group_4__0__Impl rule__RatingFork__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_4__0__Impl_in_rule__RatingFork__Group_4__012612);
            rule__RatingFork__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_4__1_in_rule__RatingFork__Group_4__012615);
            rule__RatingFork__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_4__0"


    // $ANTLR start "rule__RatingFork__Group_4__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6384:1: rule__RatingFork__Group_4__0__Impl : ( 'max' ) ;
    public final void rule__RatingFork__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6388:1: ( ( 'max' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6389:1: ( 'max' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6389:1: ( 'max' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6390:1: 'max'
            {
             before(grammarAccess.getRatingForkAccess().getMaxKeyword_4_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__RatingFork__Group_4__0__Impl12643); 
             after(grammarAccess.getRatingForkAccess().getMaxKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_4__0__Impl"


    // $ANTLR start "rule__RatingFork__Group_4__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6403:1: rule__RatingFork__Group_4__1 : rule__RatingFork__Group_4__1__Impl ;
    public final void rule__RatingFork__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6407:1: ( rule__RatingFork__Group_4__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6408:2: rule__RatingFork__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_4__1__Impl_in_rule__RatingFork__Group_4__112674);
            rule__RatingFork__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_4__1"


    // $ANTLR start "rule__RatingFork__Group_4__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6414:1: rule__RatingFork__Group_4__1__Impl : ( ( rule__RatingFork__MaxAssignment_4_1 ) ) ;
    public final void rule__RatingFork__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6418:1: ( ( ( rule__RatingFork__MaxAssignment_4_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6419:1: ( ( rule__RatingFork__MaxAssignment_4_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6419:1: ( ( rule__RatingFork__MaxAssignment_4_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6420:1: ( rule__RatingFork__MaxAssignment_4_1 )
            {
             before(grammarAccess.getRatingForkAccess().getMaxAssignment_4_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6421:1: ( rule__RatingFork__MaxAssignment_4_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6421:2: rule__RatingFork__MaxAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__MaxAssignment_4_1_in_rule__RatingFork__Group_4__1__Impl12701);
            rule__RatingFork__MaxAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRatingForkAccess().getMaxAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_4__1__Impl"


    // $ANTLR start "rule__RatingFork__Group_5__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6435:1: rule__RatingFork__Group_5__0 : rule__RatingFork__Group_5__0__Impl rule__RatingFork__Group_5__1 ;
    public final void rule__RatingFork__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6439:1: ( rule__RatingFork__Group_5__0__Impl rule__RatingFork__Group_5__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6440:2: rule__RatingFork__Group_5__0__Impl rule__RatingFork__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__0__Impl_in_rule__RatingFork__Group_5__012735);
            rule__RatingFork__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__1_in_rule__RatingFork__Group_5__012738);
            rule__RatingFork__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__0"


    // $ANTLR start "rule__RatingFork__Group_5__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6447:1: rule__RatingFork__Group_5__0__Impl : ( 'conditionals' ) ;
    public final void rule__RatingFork__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6451:1: ( ( 'conditionals' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6452:1: ( 'conditionals' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6452:1: ( 'conditionals' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6453:1: 'conditionals'
            {
             before(grammarAccess.getRatingForkAccess().getConditionalsKeyword_5_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__RatingFork__Group_5__0__Impl12766); 
             after(grammarAccess.getRatingForkAccess().getConditionalsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__0__Impl"


    // $ANTLR start "rule__RatingFork__Group_5__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6466:1: rule__RatingFork__Group_5__1 : rule__RatingFork__Group_5__1__Impl rule__RatingFork__Group_5__2 ;
    public final void rule__RatingFork__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6470:1: ( rule__RatingFork__Group_5__1__Impl rule__RatingFork__Group_5__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6471:2: rule__RatingFork__Group_5__1__Impl rule__RatingFork__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__1__Impl_in_rule__RatingFork__Group_5__112797);
            rule__RatingFork__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__2_in_rule__RatingFork__Group_5__112800);
            rule__RatingFork__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__1"


    // $ANTLR start "rule__RatingFork__Group_5__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6478:1: rule__RatingFork__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RatingFork__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6482:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6483:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6483:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6484:1: '{'
            {
             before(grammarAccess.getRatingForkAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RatingFork__Group_5__1__Impl12828); 
             after(grammarAccess.getRatingForkAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__1__Impl"


    // $ANTLR start "rule__RatingFork__Group_5__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6497:1: rule__RatingFork__Group_5__2 : rule__RatingFork__Group_5__2__Impl rule__RatingFork__Group_5__3 ;
    public final void rule__RatingFork__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6501:1: ( rule__RatingFork__Group_5__2__Impl rule__RatingFork__Group_5__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6502:2: rule__RatingFork__Group_5__2__Impl rule__RatingFork__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__2__Impl_in_rule__RatingFork__Group_5__212859);
            rule__RatingFork__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__3_in_rule__RatingFork__Group_5__212862);
            rule__RatingFork__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__2"


    // $ANTLR start "rule__RatingFork__Group_5__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6509:1: rule__RatingFork__Group_5__2__Impl : ( ( rule__RatingFork__ForkedquestionAssignment_5_2 ) ) ;
    public final void rule__RatingFork__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6513:1: ( ( ( rule__RatingFork__ForkedquestionAssignment_5_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6514:1: ( ( rule__RatingFork__ForkedquestionAssignment_5_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6514:1: ( ( rule__RatingFork__ForkedquestionAssignment_5_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6515:1: ( rule__RatingFork__ForkedquestionAssignment_5_2 )
            {
             before(grammarAccess.getRatingForkAccess().getForkedquestionAssignment_5_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6516:1: ( rule__RatingFork__ForkedquestionAssignment_5_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6516:2: rule__RatingFork__ForkedquestionAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__ForkedquestionAssignment_5_2_in_rule__RatingFork__Group_5__2__Impl12889);
            rule__RatingFork__ForkedquestionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRatingForkAccess().getForkedquestionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__2__Impl"


    // $ANTLR start "rule__RatingFork__Group_5__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6526:1: rule__RatingFork__Group_5__3 : rule__RatingFork__Group_5__3__Impl rule__RatingFork__Group_5__4 ;
    public final void rule__RatingFork__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6530:1: ( rule__RatingFork__Group_5__3__Impl rule__RatingFork__Group_5__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6531:2: rule__RatingFork__Group_5__3__Impl rule__RatingFork__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__3__Impl_in_rule__RatingFork__Group_5__312919);
            rule__RatingFork__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__4_in_rule__RatingFork__Group_5__312922);
            rule__RatingFork__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__3"


    // $ANTLR start "rule__RatingFork__Group_5__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6538:1: rule__RatingFork__Group_5__3__Impl : ( ( rule__RatingFork__Group_5_3__0 )* ) ;
    public final void rule__RatingFork__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6542:1: ( ( ( rule__RatingFork__Group_5_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6543:1: ( ( rule__RatingFork__Group_5_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6543:1: ( ( rule__RatingFork__Group_5_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6544:1: ( rule__RatingFork__Group_5_3__0 )*
            {
             before(grammarAccess.getRatingForkAccess().getGroup_5_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6545:1: ( rule__RatingFork__Group_5_3__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==13) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6545:2: rule__RatingFork__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5_3__0_in_rule__RatingFork__Group_5__3__Impl12949);
            	    rule__RatingFork__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getRatingForkAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__3__Impl"


    // $ANTLR start "rule__RatingFork__Group_5__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6555:1: rule__RatingFork__Group_5__4 : rule__RatingFork__Group_5__4__Impl ;
    public final void rule__RatingFork__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6559:1: ( rule__RatingFork__Group_5__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6560:2: rule__RatingFork__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5__4__Impl_in_rule__RatingFork__Group_5__412980);
            rule__RatingFork__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__4"


    // $ANTLR start "rule__RatingFork__Group_5__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6566:1: rule__RatingFork__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RatingFork__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6570:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6571:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6571:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6572:1: '}'
            {
             before(grammarAccess.getRatingForkAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RatingFork__Group_5__4__Impl13008); 
             after(grammarAccess.getRatingForkAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5__4__Impl"


    // $ANTLR start "rule__RatingFork__Group_5_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6595:1: rule__RatingFork__Group_5_3__0 : rule__RatingFork__Group_5_3__0__Impl rule__RatingFork__Group_5_3__1 ;
    public final void rule__RatingFork__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6599:1: ( rule__RatingFork__Group_5_3__0__Impl rule__RatingFork__Group_5_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6600:2: rule__RatingFork__Group_5_3__0__Impl rule__RatingFork__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5_3__0__Impl_in_rule__RatingFork__Group_5_3__013049);
            rule__RatingFork__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5_3__1_in_rule__RatingFork__Group_5_3__013052);
            rule__RatingFork__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5_3__0"


    // $ANTLR start "rule__RatingFork__Group_5_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6607:1: rule__RatingFork__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RatingFork__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6611:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6612:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6612:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6613:1: ','
            {
             before(grammarAccess.getRatingForkAccess().getCommaKeyword_5_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RatingFork__Group_5_3__0__Impl13080); 
             after(grammarAccess.getRatingForkAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5_3__0__Impl"


    // $ANTLR start "rule__RatingFork__Group_5_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6626:1: rule__RatingFork__Group_5_3__1 : rule__RatingFork__Group_5_3__1__Impl ;
    public final void rule__RatingFork__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6630:1: ( rule__RatingFork__Group_5_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6631:2: rule__RatingFork__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__Group_5_3__1__Impl_in_rule__RatingFork__Group_5_3__113111);
            rule__RatingFork__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5_3__1"


    // $ANTLR start "rule__RatingFork__Group_5_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6637:1: rule__RatingFork__Group_5_3__1__Impl : ( ( rule__RatingFork__ForkedquestionAssignment_5_3_1 ) ) ;
    public final void rule__RatingFork__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6641:1: ( ( ( rule__RatingFork__ForkedquestionAssignment_5_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6642:1: ( ( rule__RatingFork__ForkedquestionAssignment_5_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6642:1: ( ( rule__RatingFork__ForkedquestionAssignment_5_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6643:1: ( rule__RatingFork__ForkedquestionAssignment_5_3_1 )
            {
             before(grammarAccess.getRatingForkAccess().getForkedquestionAssignment_5_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6644:1: ( rule__RatingFork__ForkedquestionAssignment_5_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6644:2: rule__RatingFork__ForkedquestionAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RatingFork__ForkedquestionAssignment_5_3_1_in_rule__RatingFork__Group_5_3__1__Impl13138);
            rule__RatingFork__ForkedquestionAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRatingForkAccess().getForkedquestionAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__Group_5_3__1__Impl"


    // $ANTLR start "rule__RankingFork__Group__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6658:1: rule__RankingFork__Group__0 : rule__RankingFork__Group__0__Impl rule__RankingFork__Group__1 ;
    public final void rule__RankingFork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6662:1: ( rule__RankingFork__Group__0__Impl rule__RankingFork__Group__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6663:2: rule__RankingFork__Group__0__Impl rule__RankingFork__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__0__Impl_in_rule__RankingFork__Group__013172);
            rule__RankingFork__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__1_in_rule__RankingFork__Group__013175);
            rule__RankingFork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__0"


    // $ANTLR start "rule__RankingFork__Group__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6670:1: rule__RankingFork__Group__0__Impl : ( 'RankingFork' ) ;
    public final void rule__RankingFork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6674:1: ( ( 'RankingFork' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6675:1: ( 'RankingFork' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6675:1: ( 'RankingFork' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6676:1: 'RankingFork'
            {
             before(grammarAccess.getRankingForkAccess().getRankingForkKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__RankingFork__Group__0__Impl13203); 
             after(grammarAccess.getRankingForkAccess().getRankingForkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__0__Impl"


    // $ANTLR start "rule__RankingFork__Group__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6689:1: rule__RankingFork__Group__1 : rule__RankingFork__Group__1__Impl rule__RankingFork__Group__2 ;
    public final void rule__RankingFork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6693:1: ( rule__RankingFork__Group__1__Impl rule__RankingFork__Group__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6694:2: rule__RankingFork__Group__1__Impl rule__RankingFork__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__1__Impl_in_rule__RankingFork__Group__113234);
            rule__RankingFork__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__2_in_rule__RankingFork__Group__113237);
            rule__RankingFork__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__1"


    // $ANTLR start "rule__RankingFork__Group__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6701:1: rule__RankingFork__Group__1__Impl : ( '{' ) ;
    public final void rule__RankingFork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6705:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6706:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6706:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6707:1: '{'
            {
             before(grammarAccess.getRankingForkAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RankingFork__Group__1__Impl13265); 
             after(grammarAccess.getRankingForkAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__1__Impl"


    // $ANTLR start "rule__RankingFork__Group__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6720:1: rule__RankingFork__Group__2 : rule__RankingFork__Group__2__Impl rule__RankingFork__Group__3 ;
    public final void rule__RankingFork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6724:1: ( rule__RankingFork__Group__2__Impl rule__RankingFork__Group__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6725:2: rule__RankingFork__Group__2__Impl rule__RankingFork__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__2__Impl_in_rule__RankingFork__Group__213296);
            rule__RankingFork__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__3_in_rule__RankingFork__Group__213299);
            rule__RankingFork__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__2"


    // $ANTLR start "rule__RankingFork__Group__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6732:1: rule__RankingFork__Group__2__Impl : ( ( rule__RankingFork__Group_2__0 )? ) ;
    public final void rule__RankingFork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6736:1: ( ( ( rule__RankingFork__Group_2__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6737:1: ( ( rule__RankingFork__Group_2__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6737:1: ( ( rule__RankingFork__Group_2__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6738:1: ( rule__RankingFork__Group_2__0 )?
            {
             before(grammarAccess.getRankingForkAccess().getGroup_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6739:1: ( rule__RankingFork__Group_2__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==52) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6739:2: rule__RankingFork__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_2__0_in_rule__RankingFork__Group__2__Impl13326);
                    rule__RankingFork__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRankingForkAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__2__Impl"


    // $ANTLR start "rule__RankingFork__Group__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6749:1: rule__RankingFork__Group__3 : rule__RankingFork__Group__3__Impl rule__RankingFork__Group__4 ;
    public final void rule__RankingFork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6753:1: ( rule__RankingFork__Group__3__Impl rule__RankingFork__Group__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6754:2: rule__RankingFork__Group__3__Impl rule__RankingFork__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__3__Impl_in_rule__RankingFork__Group__313357);
            rule__RankingFork__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__4_in_rule__RankingFork__Group__313360);
            rule__RankingFork__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__3"


    // $ANTLR start "rule__RankingFork__Group__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6761:1: rule__RankingFork__Group__3__Impl : ( ( rule__RankingFork__Group_3__0 )? ) ;
    public final void rule__RankingFork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6765:1: ( ( ( rule__RankingFork__Group_3__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6766:1: ( ( rule__RankingFork__Group_3__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6766:1: ( ( rule__RankingFork__Group_3__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6767:1: ( rule__RankingFork__Group_3__0 )?
            {
             before(grammarAccess.getRankingForkAccess().getGroup_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6768:1: ( rule__RankingFork__Group_3__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6768:2: rule__RankingFork__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_3__0_in_rule__RankingFork__Group__3__Impl13387);
                    rule__RankingFork__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRankingForkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__3__Impl"


    // $ANTLR start "rule__RankingFork__Group__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6778:1: rule__RankingFork__Group__4 : rule__RankingFork__Group__4__Impl rule__RankingFork__Group__5 ;
    public final void rule__RankingFork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6782:1: ( rule__RankingFork__Group__4__Impl rule__RankingFork__Group__5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6783:2: rule__RankingFork__Group__4__Impl rule__RankingFork__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__4__Impl_in_rule__RankingFork__Group__413418);
            rule__RankingFork__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__5_in_rule__RankingFork__Group__413421);
            rule__RankingFork__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__4"


    // $ANTLR start "rule__RankingFork__Group__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6790:1: rule__RankingFork__Group__4__Impl : ( 'matcher' ) ;
    public final void rule__RankingFork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6794:1: ( ( 'matcher' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6795:1: ( 'matcher' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6795:1: ( 'matcher' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6796:1: 'matcher'
            {
             before(grammarAccess.getRankingForkAccess().getMatcherKeyword_4()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__RankingFork__Group__4__Impl13449); 
             after(grammarAccess.getRankingForkAccess().getMatcherKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__4__Impl"


    // $ANTLR start "rule__RankingFork__Group__5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6809:1: rule__RankingFork__Group__5 : rule__RankingFork__Group__5__Impl rule__RankingFork__Group__6 ;
    public final void rule__RankingFork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6813:1: ( rule__RankingFork__Group__5__Impl rule__RankingFork__Group__6 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6814:2: rule__RankingFork__Group__5__Impl rule__RankingFork__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__5__Impl_in_rule__RankingFork__Group__513480);
            rule__RankingFork__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__6_in_rule__RankingFork__Group__513483);
            rule__RankingFork__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__5"


    // $ANTLR start "rule__RankingFork__Group__5__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6821:1: rule__RankingFork__Group__5__Impl : ( ( rule__RankingFork__MatcherAssignment_5 ) ) ;
    public final void rule__RankingFork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6825:1: ( ( ( rule__RankingFork__MatcherAssignment_5 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6826:1: ( ( rule__RankingFork__MatcherAssignment_5 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6826:1: ( ( rule__RankingFork__MatcherAssignment_5 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6827:1: ( rule__RankingFork__MatcherAssignment_5 )
            {
             before(grammarAccess.getRankingForkAccess().getMatcherAssignment_5()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6828:1: ( rule__RankingFork__MatcherAssignment_5 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6828:2: rule__RankingFork__MatcherAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__MatcherAssignment_5_in_rule__RankingFork__Group__5__Impl13510);
            rule__RankingFork__MatcherAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRankingForkAccess().getMatcherAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__5__Impl"


    // $ANTLR start "rule__RankingFork__Group__6"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6838:1: rule__RankingFork__Group__6 : rule__RankingFork__Group__6__Impl rule__RankingFork__Group__7 ;
    public final void rule__RankingFork__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6842:1: ( rule__RankingFork__Group__6__Impl rule__RankingFork__Group__7 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6843:2: rule__RankingFork__Group__6__Impl rule__RankingFork__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__6__Impl_in_rule__RankingFork__Group__613540);
            rule__RankingFork__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__7_in_rule__RankingFork__Group__613543);
            rule__RankingFork__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__6"


    // $ANTLR start "rule__RankingFork__Group__6__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6850:1: rule__RankingFork__Group__6__Impl : ( ( rule__RankingFork__Group_6__0 )? ) ;
    public final void rule__RankingFork__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6854:1: ( ( ( rule__RankingFork__Group_6__0 )? ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6855:1: ( ( rule__RankingFork__Group_6__0 )? )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6855:1: ( ( rule__RankingFork__Group_6__0 )? )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6856:1: ( rule__RankingFork__Group_6__0 )?
            {
             before(grammarAccess.getRankingForkAccess().getGroup_6()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6857:1: ( rule__RankingFork__Group_6__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==55) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6857:2: rule__RankingFork__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__0_in_rule__RankingFork__Group__6__Impl13570);
                    rule__RankingFork__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRankingForkAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__6__Impl"


    // $ANTLR start "rule__RankingFork__Group__7"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6867:1: rule__RankingFork__Group__7 : rule__RankingFork__Group__7__Impl ;
    public final void rule__RankingFork__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6871:1: ( rule__RankingFork__Group__7__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6872:2: rule__RankingFork__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group__7__Impl_in_rule__RankingFork__Group__713601);
            rule__RankingFork__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__7"


    // $ANTLR start "rule__RankingFork__Group__7__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6878:1: rule__RankingFork__Group__7__Impl : ( '}' ) ;
    public final void rule__RankingFork__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6882:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6883:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6883:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6884:1: '}'
            {
             before(grammarAccess.getRankingForkAccess().getRightCurlyBracketKeyword_7()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RankingFork__Group__7__Impl13629); 
             after(grammarAccess.getRankingForkAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group__7__Impl"


    // $ANTLR start "rule__RankingFork__Group_2__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6913:1: rule__RankingFork__Group_2__0 : rule__RankingFork__Group_2__0__Impl rule__RankingFork__Group_2__1 ;
    public final void rule__RankingFork__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6917:1: ( rule__RankingFork__Group_2__0__Impl rule__RankingFork__Group_2__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6918:2: rule__RankingFork__Group_2__0__Impl rule__RankingFork__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_2__0__Impl_in_rule__RankingFork__Group_2__013676);
            rule__RankingFork__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_2__1_in_rule__RankingFork__Group_2__013679);
            rule__RankingFork__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_2__0"


    // $ANTLR start "rule__RankingFork__Group_2__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6925:1: rule__RankingFork__Group_2__0__Impl : ( 'min' ) ;
    public final void rule__RankingFork__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6929:1: ( ( 'min' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6930:1: ( 'min' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6930:1: ( 'min' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6931:1: 'min'
            {
             before(grammarAccess.getRankingForkAccess().getMinKeyword_2_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__RankingFork__Group_2__0__Impl13707); 
             after(grammarAccess.getRankingForkAccess().getMinKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_2__0__Impl"


    // $ANTLR start "rule__RankingFork__Group_2__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6944:1: rule__RankingFork__Group_2__1 : rule__RankingFork__Group_2__1__Impl ;
    public final void rule__RankingFork__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6948:1: ( rule__RankingFork__Group_2__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6949:2: rule__RankingFork__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_2__1__Impl_in_rule__RankingFork__Group_2__113738);
            rule__RankingFork__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_2__1"


    // $ANTLR start "rule__RankingFork__Group_2__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6955:1: rule__RankingFork__Group_2__1__Impl : ( ( rule__RankingFork__MinAssignment_2_1 ) ) ;
    public final void rule__RankingFork__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6959:1: ( ( ( rule__RankingFork__MinAssignment_2_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6960:1: ( ( rule__RankingFork__MinAssignment_2_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6960:1: ( ( rule__RankingFork__MinAssignment_2_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6961:1: ( rule__RankingFork__MinAssignment_2_1 )
            {
             before(grammarAccess.getRankingForkAccess().getMinAssignment_2_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6962:1: ( rule__RankingFork__MinAssignment_2_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6962:2: rule__RankingFork__MinAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__MinAssignment_2_1_in_rule__RankingFork__Group_2__1__Impl13765);
            rule__RankingFork__MinAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRankingForkAccess().getMinAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_2__1__Impl"


    // $ANTLR start "rule__RankingFork__Group_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6976:1: rule__RankingFork__Group_3__0 : rule__RankingFork__Group_3__0__Impl rule__RankingFork__Group_3__1 ;
    public final void rule__RankingFork__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6980:1: ( rule__RankingFork__Group_3__0__Impl rule__RankingFork__Group_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6981:2: rule__RankingFork__Group_3__0__Impl rule__RankingFork__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_3__0__Impl_in_rule__RankingFork__Group_3__013799);
            rule__RankingFork__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_3__1_in_rule__RankingFork__Group_3__013802);
            rule__RankingFork__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_3__0"


    // $ANTLR start "rule__RankingFork__Group_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6988:1: rule__RankingFork__Group_3__0__Impl : ( 'max' ) ;
    public final void rule__RankingFork__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6992:1: ( ( 'max' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6993:1: ( 'max' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6993:1: ( 'max' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:6994:1: 'max'
            {
             before(grammarAccess.getRankingForkAccess().getMaxKeyword_3_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__RankingFork__Group_3__0__Impl13830); 
             after(grammarAccess.getRankingForkAccess().getMaxKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_3__0__Impl"


    // $ANTLR start "rule__RankingFork__Group_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7007:1: rule__RankingFork__Group_3__1 : rule__RankingFork__Group_3__1__Impl ;
    public final void rule__RankingFork__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7011:1: ( rule__RankingFork__Group_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7012:2: rule__RankingFork__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_3__1__Impl_in_rule__RankingFork__Group_3__113861);
            rule__RankingFork__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_3__1"


    // $ANTLR start "rule__RankingFork__Group_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7018:1: rule__RankingFork__Group_3__1__Impl : ( ( rule__RankingFork__MaxAssignment_3_1 ) ) ;
    public final void rule__RankingFork__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7022:1: ( ( ( rule__RankingFork__MaxAssignment_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7023:1: ( ( rule__RankingFork__MaxAssignment_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7023:1: ( ( rule__RankingFork__MaxAssignment_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7024:1: ( rule__RankingFork__MaxAssignment_3_1 )
            {
             before(grammarAccess.getRankingForkAccess().getMaxAssignment_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7025:1: ( rule__RankingFork__MaxAssignment_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7025:2: rule__RankingFork__MaxAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__MaxAssignment_3_1_in_rule__RankingFork__Group_3__1__Impl13888);
            rule__RankingFork__MaxAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRankingForkAccess().getMaxAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_3__1__Impl"


    // $ANTLR start "rule__RankingFork__Group_6__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7039:1: rule__RankingFork__Group_6__0 : rule__RankingFork__Group_6__0__Impl rule__RankingFork__Group_6__1 ;
    public final void rule__RankingFork__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7043:1: ( rule__RankingFork__Group_6__0__Impl rule__RankingFork__Group_6__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7044:2: rule__RankingFork__Group_6__0__Impl rule__RankingFork__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__0__Impl_in_rule__RankingFork__Group_6__013922);
            rule__RankingFork__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__1_in_rule__RankingFork__Group_6__013925);
            rule__RankingFork__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__0"


    // $ANTLR start "rule__RankingFork__Group_6__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7051:1: rule__RankingFork__Group_6__0__Impl : ( 'forkedquestions' ) ;
    public final void rule__RankingFork__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7055:1: ( ( 'forkedquestions' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7056:1: ( 'forkedquestions' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7056:1: ( 'forkedquestions' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7057:1: 'forkedquestions'
            {
             before(grammarAccess.getRankingForkAccess().getForkedquestionsKeyword_6_0()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__RankingFork__Group_6__0__Impl13953); 
             after(grammarAccess.getRankingForkAccess().getForkedquestionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__0__Impl"


    // $ANTLR start "rule__RankingFork__Group_6__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7070:1: rule__RankingFork__Group_6__1 : rule__RankingFork__Group_6__1__Impl rule__RankingFork__Group_6__2 ;
    public final void rule__RankingFork__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7074:1: ( rule__RankingFork__Group_6__1__Impl rule__RankingFork__Group_6__2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7075:2: rule__RankingFork__Group_6__1__Impl rule__RankingFork__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__1__Impl_in_rule__RankingFork__Group_6__113984);
            rule__RankingFork__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__2_in_rule__RankingFork__Group_6__113987);
            rule__RankingFork__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__1"


    // $ANTLR start "rule__RankingFork__Group_6__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7082:1: rule__RankingFork__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RankingFork__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7086:1: ( ( '{' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7087:1: ( '{' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7087:1: ( '{' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7088:1: '{'
            {
             before(grammarAccess.getRankingForkAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RankingFork__Group_6__1__Impl14015); 
             after(grammarAccess.getRankingForkAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__1__Impl"


    // $ANTLR start "rule__RankingFork__Group_6__2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7101:1: rule__RankingFork__Group_6__2 : rule__RankingFork__Group_6__2__Impl rule__RankingFork__Group_6__3 ;
    public final void rule__RankingFork__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7105:1: ( rule__RankingFork__Group_6__2__Impl rule__RankingFork__Group_6__3 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7106:2: rule__RankingFork__Group_6__2__Impl rule__RankingFork__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__2__Impl_in_rule__RankingFork__Group_6__214046);
            rule__RankingFork__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__3_in_rule__RankingFork__Group_6__214049);
            rule__RankingFork__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__2"


    // $ANTLR start "rule__RankingFork__Group_6__2__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7113:1: rule__RankingFork__Group_6__2__Impl : ( ( rule__RankingFork__ForkedquestionsAssignment_6_2 ) ) ;
    public final void rule__RankingFork__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7117:1: ( ( ( rule__RankingFork__ForkedquestionsAssignment_6_2 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7118:1: ( ( rule__RankingFork__ForkedquestionsAssignment_6_2 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7118:1: ( ( rule__RankingFork__ForkedquestionsAssignment_6_2 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7119:1: ( rule__RankingFork__ForkedquestionsAssignment_6_2 )
            {
             before(grammarAccess.getRankingForkAccess().getForkedquestionsAssignment_6_2()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7120:1: ( rule__RankingFork__ForkedquestionsAssignment_6_2 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7120:2: rule__RankingFork__ForkedquestionsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__ForkedquestionsAssignment_6_2_in_rule__RankingFork__Group_6__2__Impl14076);
            rule__RankingFork__ForkedquestionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRankingForkAccess().getForkedquestionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__2__Impl"


    // $ANTLR start "rule__RankingFork__Group_6__3"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7130:1: rule__RankingFork__Group_6__3 : rule__RankingFork__Group_6__3__Impl rule__RankingFork__Group_6__4 ;
    public final void rule__RankingFork__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7134:1: ( rule__RankingFork__Group_6__3__Impl rule__RankingFork__Group_6__4 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7135:2: rule__RankingFork__Group_6__3__Impl rule__RankingFork__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__3__Impl_in_rule__RankingFork__Group_6__314106);
            rule__RankingFork__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__4_in_rule__RankingFork__Group_6__314109);
            rule__RankingFork__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__3"


    // $ANTLR start "rule__RankingFork__Group_6__3__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7142:1: rule__RankingFork__Group_6__3__Impl : ( ( rule__RankingFork__Group_6_3__0 )* ) ;
    public final void rule__RankingFork__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7146:1: ( ( ( rule__RankingFork__Group_6_3__0 )* ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7147:1: ( ( rule__RankingFork__Group_6_3__0 )* )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7147:1: ( ( rule__RankingFork__Group_6_3__0 )* )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7148:1: ( rule__RankingFork__Group_6_3__0 )*
            {
             before(grammarAccess.getRankingForkAccess().getGroup_6_3()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7149:1: ( rule__RankingFork__Group_6_3__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==13) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7149:2: rule__RankingFork__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6_3__0_in_rule__RankingFork__Group_6__3__Impl14136);
            	    rule__RankingFork__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getRankingForkAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__3__Impl"


    // $ANTLR start "rule__RankingFork__Group_6__4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7159:1: rule__RankingFork__Group_6__4 : rule__RankingFork__Group_6__4__Impl ;
    public final void rule__RankingFork__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7163:1: ( rule__RankingFork__Group_6__4__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7164:2: rule__RankingFork__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6__4__Impl_in_rule__RankingFork__Group_6__414167);
            rule__RankingFork__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__4"


    // $ANTLR start "rule__RankingFork__Group_6__4__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7170:1: rule__RankingFork__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RankingFork__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7174:1: ( ( '}' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7175:1: ( '}' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7175:1: ( '}' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7176:1: '}'
            {
             before(grammarAccess.getRankingForkAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RankingFork__Group_6__4__Impl14195); 
             after(grammarAccess.getRankingForkAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6__4__Impl"


    // $ANTLR start "rule__RankingFork__Group_6_3__0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7199:1: rule__RankingFork__Group_6_3__0 : rule__RankingFork__Group_6_3__0__Impl rule__RankingFork__Group_6_3__1 ;
    public final void rule__RankingFork__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7203:1: ( rule__RankingFork__Group_6_3__0__Impl rule__RankingFork__Group_6_3__1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7204:2: rule__RankingFork__Group_6_3__0__Impl rule__RankingFork__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6_3__0__Impl_in_rule__RankingFork__Group_6_3__014236);
            rule__RankingFork__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6_3__1_in_rule__RankingFork__Group_6_3__014239);
            rule__RankingFork__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6_3__0"


    // $ANTLR start "rule__RankingFork__Group_6_3__0__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7211:1: rule__RankingFork__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RankingFork__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7215:1: ( ( ',' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7216:1: ( ',' )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7216:1: ( ',' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7217:1: ','
            {
             before(grammarAccess.getRankingForkAccess().getCommaKeyword_6_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__RankingFork__Group_6_3__0__Impl14267); 
             after(grammarAccess.getRankingForkAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6_3__0__Impl"


    // $ANTLR start "rule__RankingFork__Group_6_3__1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7230:1: rule__RankingFork__Group_6_3__1 : rule__RankingFork__Group_6_3__1__Impl ;
    public final void rule__RankingFork__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7234:1: ( rule__RankingFork__Group_6_3__1__Impl )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7235:2: rule__RankingFork__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__Group_6_3__1__Impl_in_rule__RankingFork__Group_6_3__114298);
            rule__RankingFork__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6_3__1"


    // $ANTLR start "rule__RankingFork__Group_6_3__1__Impl"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7241:1: rule__RankingFork__Group_6_3__1__Impl : ( ( rule__RankingFork__ForkedquestionsAssignment_6_3_1 ) ) ;
    public final void rule__RankingFork__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7245:1: ( ( ( rule__RankingFork__ForkedquestionsAssignment_6_3_1 ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7246:1: ( ( rule__RankingFork__ForkedquestionsAssignment_6_3_1 ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7246:1: ( ( rule__RankingFork__ForkedquestionsAssignment_6_3_1 ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7247:1: ( rule__RankingFork__ForkedquestionsAssignment_6_3_1 )
            {
             before(grammarAccess.getRankingForkAccess().getForkedquestionsAssignment_6_3_1()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7248:1: ( rule__RankingFork__ForkedquestionsAssignment_6_3_1 )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7248:2: rule__RankingFork__ForkedquestionsAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RankingFork__ForkedquestionsAssignment_6_3_1_in_rule__RankingFork__Group_6_3__1__Impl14325);
            rule__RankingFork__ForkedquestionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRankingForkAccess().getForkedquestionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__Group_6_3__1__Impl"


    // $ANTLR start "rule__Model__SurveysAssignment_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7263:1: rule__Model__SurveysAssignment_1 : ( ruleSurvey ) ;
    public final void rule__Model__SurveysAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7267:1: ( ( ruleSurvey ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7268:1: ( ruleSurvey )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7268:1: ( ruleSurvey )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7269:1: ruleSurvey
            {
             before(grammarAccess.getModelAccess().getSurveysSurveyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_rule__Model__SurveysAssignment_114364);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSurveysSurveyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SurveysAssignment_1"


    // $ANTLR start "rule__Survey__QuestionsAssignment_3_0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7278:1: rule__Survey__QuestionsAssignment_3_0 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7282:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7283:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7283:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7284:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_3_014395);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__QuestionsAssignment_3_0"


    // $ANTLR start "rule__Survey__QuestionsAssignment_3_1_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7293:1: rule__Survey__QuestionsAssignment_3_1_1 : ( ruleQuestion ) ;
    public final void rule__Survey__QuestionsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7297:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7298:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7298:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7299:1: ruleQuestion
            {
             before(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_3_1_114426);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionsQuestionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__QuestionsAssignment_3_1_1"


    // $ANTLR start "rule__MultipleChoice__QuestionAssignment_4_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7308:1: rule__MultipleChoice__QuestionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__MultipleChoice__QuestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7312:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7313:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7313:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7314:1: ruleEString
            {
             before(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice__QuestionAssignment_4_114457);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getQuestionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__QuestionAssignment_4_1"


    // $ANTLR start "rule__MultipleChoice__ChoiceAssignment_5_5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7323:1: rule__MultipleChoice__ChoiceAssignment_5_5 : ( ruleChoice ) ;
    public final void rule__MultipleChoice__ChoiceAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7327:1: ( ( ruleChoice ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7328:1: ( ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7328:1: ( ruleChoice )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7329:1: ruleChoice
            {
             before(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_5_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rule__MultipleChoice__ChoiceAssignment_5_514488);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_5_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__ChoiceAssignment_5_5"


    // $ANTLR start "rule__MultipleChoice__ChoiceAssignment_5_6_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7338:1: rule__MultipleChoice__ChoiceAssignment_5_6_1 : ( ruleChoice ) ;
    public final void rule__MultipleChoice__ChoiceAssignment_5_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7342:1: ( ( ruleChoice ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7343:1: ( ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7343:1: ( ruleChoice )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7344:1: ruleChoice
            {
             before(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_5_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rule__MultipleChoice__ChoiceAssignment_5_6_114519);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getChoiceChoiceParserRuleCall_5_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__ChoiceAssignment_5_6_1"


    // $ANTLR start "rule__MultipleChoice__OtherAssignment_6_4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7353:1: rule__MultipleChoice__OtherAssignment_6_4 : ( ruleEString ) ;
    public final void rule__MultipleChoice__OtherAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7357:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7358:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7358:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7359:1: ruleEString
            {
             before(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_6_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice__OtherAssignment_6_414550);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getOtherEStringParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__OtherAssignment_6_4"


    // $ANTLR start "rule__MultipleChoice__MultipleChoiceForksAssignment_7_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7368:1: rule__MultipleChoice__MultipleChoiceForksAssignment_7_2 : ( ruleMultipleChoiceFork ) ;
    public final void rule__MultipleChoice__MultipleChoiceForksAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7372:1: ( ( ruleMultipleChoiceFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7373:1: ( ruleMultipleChoiceFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7373:1: ( ruleMultipleChoiceFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7374:1: ruleMultipleChoiceFork
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_rule__MultipleChoice__MultipleChoiceForksAssignment_7_214581);
            ruleMultipleChoiceFork();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__MultipleChoiceForksAssignment_7_2"


    // $ANTLR start "rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7383:1: rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1 : ( ruleMultipleChoiceFork ) ;
    public final void rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7387:1: ( ( ruleMultipleChoiceFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7388:1: ( ruleMultipleChoiceFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7388:1: ( ruleMultipleChoiceFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7389:1: ruleMultipleChoiceFork
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoiceFork_in_rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_114612);
            ruleMultipleChoiceFork();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getMultipleChoiceForksMultipleChoiceForkParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1"


    // $ANTLR start "rule__Open__QuestionAssignment_4"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7398:1: rule__Open__QuestionAssignment_4 : ( ruleEString ) ;
    public final void rule__Open__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7402:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7403:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7403:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7404:1: ruleEString
            {
             before(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Open__QuestionAssignment_414643);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenAccess().getQuestionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__QuestionAssignment_4"


    // $ANTLR start "rule__Open__AnswerLengthAssignment_5_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7413:1: rule__Open__AnswerLengthAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Open__AnswerLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7417:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7418:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7418:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7419:1: ruleEString
            {
             before(grammarAccess.getOpenAccess().getAnswerLengthEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Open__AnswerLengthAssignment_5_114674);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenAccess().getAnswerLengthEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__AnswerLengthAssignment_5_1"


    // $ANTLR start "rule__Rating_Impl__RequiredAssignment_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7428:1: rule__Rating_Impl__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Rating_Impl__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7432:1: ( ( ( 'required' ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7433:1: ( ( 'required' ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7433:1: ( ( 'required' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7434:1: ( 'required' )
            {
             before(grammarAccess.getRating_ImplAccess().getRequiredRequiredKeyword_1_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7435:1: ( 'required' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7436:1: 'required'
            {
             before(grammarAccess.getRating_ImplAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Rating_Impl__RequiredAssignment_114710); 
             after(grammarAccess.getRating_ImplAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getRating_ImplAccess().getRequiredRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__RequiredAssignment_1"


    // $ANTLR start "rule__Rating_Impl__QuestionAssignment_4_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7451:1: rule__Rating_Impl__QuestionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Rating_Impl__QuestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7455:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7456:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7456:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7457:1: ruleEString
            {
             before(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rating_Impl__QuestionAssignment_4_114749);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRating_ImplAccess().getQuestionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__QuestionAssignment_4_1"


    // $ANTLR start "rule__Rating_Impl__MinAssignment_5_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7466:1: rule__Rating_Impl__MinAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Rating_Impl__MinAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7470:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7471:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7471:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7472:1: ruleEInt
            {
             before(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating_Impl__MinAssignment_5_114780);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRating_ImplAccess().getMinEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__MinAssignment_5_1"


    // $ANTLR start "rule__Rating_Impl__MaxAssignment_6_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7481:1: rule__Rating_Impl__MaxAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Rating_Impl__MaxAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7485:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7486:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7486:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7487:1: ruleEInt
            {
             before(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating_Impl__MaxAssignment_6_114811);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRating_ImplAccess().getMaxEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__MaxAssignment_6_1"


    // $ANTLR start "rule__Rating_Impl__FirstAssignment_7_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7496:1: rule__Rating_Impl__FirstAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Rating_Impl__FirstAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7500:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7501:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7501:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7502:1: ruleEString
            {
             before(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rating_Impl__FirstAssignment_7_114842);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRating_ImplAccess().getFirstEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__FirstAssignment_7_1"


    // $ANTLR start "rule__Rating_Impl__LastAssignment_8_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7511:1: rule__Rating_Impl__LastAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Rating_Impl__LastAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7515:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7516:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7516:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7517:1: ruleEString
            {
             before(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rating_Impl__LastAssignment_8_114873);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRating_ImplAccess().getLastEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__LastAssignment_8_1"


    // $ANTLR start "rule__Rating_Impl__RatingForksAssignment_9_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7526:1: rule__Rating_Impl__RatingForksAssignment_9_2 : ( ruleRatingFork ) ;
    public final void rule__Rating_Impl__RatingForksAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7530:1: ( ( ruleRatingFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7531:1: ( ruleRatingFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7531:1: ( ruleRatingFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7532:1: ruleRatingFork
            {
             before(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_rule__Rating_Impl__RatingForksAssignment_9_214904);
            ruleRatingFork();

            state._fsp--;

             after(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__RatingForksAssignment_9_2"


    // $ANTLR start "rule__Rating_Impl__RatingForksAssignment_9_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7541:1: rule__Rating_Impl__RatingForksAssignment_9_3_1 : ( ruleRatingFork ) ;
    public final void rule__Rating_Impl__RatingForksAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7545:1: ( ( ruleRatingFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7546:1: ( ruleRatingFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7546:1: ( ruleRatingFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7547:1: ruleRatingFork
            {
             before(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_rule__Rating_Impl__RatingForksAssignment_9_3_114935);
            ruleRatingFork();

            state._fsp--;

             after(grammarAccess.getRating_ImplAccess().getRatingForksRatingForkParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rating_Impl__RatingForksAssignment_9_3_1"


    // $ANTLR start "rule__Ranking__RequiredAssignment_0"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7556:1: rule__Ranking__RequiredAssignment_0 : ( ( 'required' ) ) ;
    public final void rule__Ranking__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7560:1: ( ( ( 'required' ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7561:1: ( ( 'required' ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7561:1: ( ( 'required' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7562:1: ( 'required' )
            {
             before(grammarAccess.getRankingAccess().getRequiredRequiredKeyword_0_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7563:1: ( 'required' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7564:1: 'required'
            {
             before(grammarAccess.getRankingAccess().getRequiredRequiredKeyword_0_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Ranking__RequiredAssignment_014971); 
             after(grammarAccess.getRankingAccess().getRequiredRequiredKeyword_0_0()); 

            }

             after(grammarAccess.getRankingAccess().getRequiredRequiredKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__RequiredAssignment_0"


    // $ANTLR start "rule__Ranking__QuestionAssignment_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7579:1: rule__Ranking__QuestionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Ranking__QuestionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7583:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7584:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7584:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7585:1: ruleEString
            {
             before(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ranking__QuestionAssignment_3_115010);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getQuestionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__QuestionAssignment_3_1"


    // $ANTLR start "rule__Ranking__ForksAssignment_4_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7594:1: rule__Ranking__ForksAssignment_4_2 : ( ruleRankingFork ) ;
    public final void rule__Ranking__ForksAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7598:1: ( ( ruleRankingFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7599:1: ( ruleRankingFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7599:1: ( ruleRankingFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7600:1: ruleRankingFork
            {
             before(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_rule__Ranking__ForksAssignment_4_215041);
            ruleRankingFork();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__ForksAssignment_4_2"


    // $ANTLR start "rule__Ranking__ForksAssignment_4_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7609:1: rule__Ranking__ForksAssignment_4_3_1 : ( ruleRankingFork ) ;
    public final void rule__Ranking__ForksAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7613:1: ( ( ruleRankingFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7614:1: ( ruleRankingFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7614:1: ( ruleRankingFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7615:1: ruleRankingFork
            {
             before(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRankingFork_in_rule__Ranking__ForksAssignment_4_3_115072);
            ruleRankingFork();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getForksRankingForkParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__ForksAssignment_4_3_1"


    // $ANTLR start "rule__Ranking__ChoicesAssignment_7"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7624:1: rule__Ranking__ChoicesAssignment_7 : ( ruleChoice ) ;
    public final void rule__Ranking__ChoicesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7628:1: ( ( ruleChoice ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7629:1: ( ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7629:1: ( ruleChoice )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7630:1: ruleChoice
            {
             before(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rule__Ranking__ChoicesAssignment_715103);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__ChoicesAssignment_7"


    // $ANTLR start "rule__Ranking__ChoicesAssignment_8_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7639:1: rule__Ranking__ChoicesAssignment_8_1 : ( ruleChoice ) ;
    public final void rule__Ranking__ChoicesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7643:1: ( ( ruleChoice ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7644:1: ( ruleChoice )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7644:1: ( ruleChoice )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7645:1: ruleChoice
            {
             before(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rule__Ranking__ChoicesAssignment_8_115134);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getChoicesChoiceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ranking__ChoicesAssignment_8_1"


    // $ANTLR start "rule__Dichotomous__RequiredAssignment_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7654:1: rule__Dichotomous__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Dichotomous__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7658:1: ( ( ( 'required' ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7659:1: ( ( 'required' ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7659:1: ( ( 'required' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7660:1: ( 'required' )
            {
             before(grammarAccess.getDichotomousAccess().getRequiredRequiredKeyword_1_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7661:1: ( 'required' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7662:1: 'required'
            {
             before(grammarAccess.getDichotomousAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Dichotomous__RequiredAssignment_115170); 
             after(grammarAccess.getDichotomousAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getDichotomousAccess().getRequiredRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__RequiredAssignment_1"


    // $ANTLR start "rule__Dichotomous__QuestionAssignment_4_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7677:1: rule__Dichotomous__QuestionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Dichotomous__QuestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7681:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7682:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7682:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7683:1: ruleEString
            {
             before(grammarAccess.getDichotomousAccess().getQuestionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Dichotomous__QuestionAssignment_4_115209);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDichotomousAccess().getQuestionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__QuestionAssignment_4_1"


    // $ANTLR start "rule__Dichotomous__YesAssignment_5_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7692:1: rule__Dichotomous__YesAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__Dichotomous__YesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7696:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7697:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7697:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7698:1: ruleQuestion
            {
             before(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Dichotomous__YesAssignment_5_215240);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__YesAssignment_5_2"


    // $ANTLR start "rule__Dichotomous__YesAssignment_5_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7707:1: rule__Dichotomous__YesAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__Dichotomous__YesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7711:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7712:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7712:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7713:1: ruleQuestion
            {
             before(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Dichotomous__YesAssignment_5_3_115271);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getDichotomousAccess().getYesQuestionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__YesAssignment_5_3_1"


    // $ANTLR start "rule__Dichotomous__NoAssignment_6_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7722:1: rule__Dichotomous__NoAssignment_6_2 : ( ruleQuestion ) ;
    public final void rule__Dichotomous__NoAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7726:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7727:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7727:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7728:1: ruleQuestion
            {
             before(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Dichotomous__NoAssignment_6_215302);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__NoAssignment_6_2"


    // $ANTLR start "rule__Dichotomous__NoAssignment_6_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7737:1: rule__Dichotomous__NoAssignment_6_3_1 : ( ruleQuestion ) ;
    public final void rule__Dichotomous__NoAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7741:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7742:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7742:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7743:1: ruleQuestion
            {
             before(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Dichotomous__NoAssignment_6_3_115333);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getDichotomousAccess().getNoQuestionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dichotomous__NoAssignment_6_3_1"


    // $ANTLR start "rule__SumConstant__RequiredAssignment_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7752:1: rule__SumConstant__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__SumConstant__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7756:1: ( ( ( 'required' ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7757:1: ( ( 'required' ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7757:1: ( ( 'required' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7758:1: ( 'required' )
            {
             before(grammarAccess.getSumConstantAccess().getRequiredRequiredKeyword_1_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7759:1: ( 'required' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7760:1: 'required'
            {
             before(grammarAccess.getSumConstantAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__SumConstant__RequiredAssignment_115369); 
             after(grammarAccess.getSumConstantAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getSumConstantAccess().getRequiredRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__RequiredAssignment_1"


    // $ANTLR start "rule__SumConstant__QuestionAssignment_4_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7775:1: rule__SumConstant__QuestionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__SumConstant__QuestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7779:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7780:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7780:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7781:1: ruleEString
            {
             before(grammarAccess.getSumConstantAccess().getQuestionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SumConstant__QuestionAssignment_4_115408);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSumConstantAccess().getQuestionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SumConstant__QuestionAssignment_4_1"


    // $ANTLR start "rule__Staple__RequiredAssignment_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7790:1: rule__Staple__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Staple__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7794:1: ( ( ( 'required' ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7795:1: ( ( 'required' ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7795:1: ( ( 'required' ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7796:1: ( 'required' )
            {
             before(grammarAccess.getStapleAccess().getRequiredRequiredKeyword_1_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7797:1: ( 'required' )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7798:1: 'required'
            {
             before(grammarAccess.getStapleAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Staple__RequiredAssignment_115444); 
             after(grammarAccess.getStapleAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getStapleAccess().getRequiredRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__RequiredAssignment_1"


    // $ANTLR start "rule__Staple__QuestionAssignment_4_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7813:1: rule__Staple__QuestionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Staple__QuestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7817:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7818:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7818:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7819:1: ruleEString
            {
             before(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Staple__QuestionAssignment_4_115483);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getQuestionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__QuestionAssignment_4_1"


    // $ANTLR start "rule__Staple__MinAssignment_5_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7828:1: rule__Staple__MinAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Staple__MinAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7832:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7833:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7833:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7834:1: ruleEInt
            {
             before(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Staple__MinAssignment_5_115514);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getMinEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__MinAssignment_5_1"


    // $ANTLR start "rule__Staple__MaxAssignment_6_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7843:1: rule__Staple__MaxAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Staple__MaxAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7847:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7848:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7848:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7849:1: ruleEInt
            {
             before(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Staple__MaxAssignment_6_115545);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getMaxEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__MaxAssignment_6_1"


    // $ANTLR start "rule__Staple__FirstAssignment_7_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7858:1: rule__Staple__FirstAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Staple__FirstAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7862:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7863:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7863:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7864:1: ruleEString
            {
             before(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Staple__FirstAssignment_7_115576);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getFirstEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__FirstAssignment_7_1"


    // $ANTLR start "rule__Staple__LastAssignment_8_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7873:1: rule__Staple__LastAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Staple__LastAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7877:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7878:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7878:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7879:1: ruleEString
            {
             before(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Staple__LastAssignment_8_115607);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getLastEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__LastAssignment_8_1"


    // $ANTLR start "rule__Staple__MidAssignment_9_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7888:1: rule__Staple__MidAssignment_9_1 : ( ruleEString ) ;
    public final void rule__Staple__MidAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7892:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7893:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7893:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7894:1: ruleEString
            {
             before(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Staple__MidAssignment_9_115638);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getMidEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__MidAssignment_9_1"


    // $ANTLR start "rule__Staple__RatingForksAssignment_10_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7903:1: rule__Staple__RatingForksAssignment_10_2 : ( ruleRatingFork ) ;
    public final void rule__Staple__RatingForksAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7907:1: ( ( ruleRatingFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7908:1: ( ruleRatingFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7908:1: ( ruleRatingFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7909:1: ruleRatingFork
            {
             before(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_rule__Staple__RatingForksAssignment_10_215669);
            ruleRatingFork();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__RatingForksAssignment_10_2"


    // $ANTLR start "rule__Staple__RatingForksAssignment_10_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7918:1: rule__Staple__RatingForksAssignment_10_3_1 : ( ruleRatingFork ) ;
    public final void rule__Staple__RatingForksAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7922:1: ( ( ruleRatingFork ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7923:1: ( ruleRatingFork )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7923:1: ( ruleRatingFork )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7924:1: ruleRatingFork
            {
             before(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_10_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRatingFork_in_rule__Staple__RatingForksAssignment_10_3_115700);
            ruleRatingFork();

            state._fsp--;

             after(grammarAccess.getStapleAccess().getRatingForksRatingForkParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staple__RatingForksAssignment_10_3_1"


    // $ANTLR start "rule__Choice__DescriptionAssignment"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7933:1: rule__Choice__DescriptionAssignment : ( ruleEString ) ;
    public final void rule__Choice__DescriptionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7937:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7938:1: ( ruleEString )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7938:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7939:1: ruleEString
            {
             before(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Choice__DescriptionAssignment15731);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getDescriptionEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__DescriptionAssignment"


    // $ANTLR start "rule__MultipleChoiceFork__MatcherAssignment_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7948:1: rule__MultipleChoiceFork__MatcherAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MultipleChoiceFork__MatcherAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7952:1: ( ( ( RULE_ID ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7953:1: ( ( RULE_ID ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7953:1: ( ( RULE_ID ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7954:1: ( RULE_ID )
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getMatcherChoiceCrossReference_2_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7955:1: ( RULE_ID )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7956:1: RULE_ID
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getMatcherChoiceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MultipleChoiceFork__MatcherAssignment_215766); 
             after(grammarAccess.getMultipleChoiceForkAccess().getMatcherChoiceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMultipleChoiceForkAccess().getMatcherChoiceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__MatcherAssignment_2"


    // $ANTLR start "rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7967:1: rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2 : ( ruleQuestion ) ;
    public final void rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7971:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7972:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7972:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7973:1: ruleQuestion
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_215801);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2"


    // $ANTLR start "rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7982:1: rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1 : ( ruleQuestion ) ;
    public final void rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7986:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7987:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7987:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7988:1: ruleQuestion
            {
             before(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_115832);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceForkAccess().getForkedquestionsQuestionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1"


    // $ANTLR start "rule__RatingFork__MinAssignment_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:7997:1: rule__RatingFork__MinAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__RatingFork__MinAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8001:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8002:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8002:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8003:1: ruleEInt
            {
             before(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RatingFork__MinAssignment_3_115863);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRatingForkAccess().getMinEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__MinAssignment_3_1"


    // $ANTLR start "rule__RatingFork__MaxAssignment_4_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8012:1: rule__RatingFork__MaxAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__RatingFork__MaxAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8016:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8017:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8017:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8018:1: ruleEInt
            {
             before(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RatingFork__MaxAssignment_4_115894);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRatingForkAccess().getMaxEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__MaxAssignment_4_1"


    // $ANTLR start "rule__RatingFork__ForkedquestionAssignment_5_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8027:1: rule__RatingFork__ForkedquestionAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__RatingFork__ForkedquestionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8031:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8032:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8032:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8033:1: ruleQuestion
            {
             before(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__RatingFork__ForkedquestionAssignment_5_215925);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__ForkedquestionAssignment_5_2"


    // $ANTLR start "rule__RatingFork__ForkedquestionAssignment_5_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8042:1: rule__RatingFork__ForkedquestionAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__RatingFork__ForkedquestionAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8046:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8047:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8047:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8048:1: ruleQuestion
            {
             before(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__RatingFork__ForkedquestionAssignment_5_3_115956);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getRatingForkAccess().getForkedquestionQuestionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RatingFork__ForkedquestionAssignment_5_3_1"


    // $ANTLR start "rule__RankingFork__MinAssignment_2_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8057:1: rule__RankingFork__MinAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__RankingFork__MinAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8061:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8062:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8062:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8063:1: ruleEInt
            {
             before(grammarAccess.getRankingForkAccess().getMinEIntParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RankingFork__MinAssignment_2_115987);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRankingForkAccess().getMinEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__MinAssignment_2_1"


    // $ANTLR start "rule__RankingFork__MaxAssignment_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8072:1: rule__RankingFork__MaxAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__RankingFork__MaxAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8076:1: ( ( ruleEInt ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8077:1: ( ruleEInt )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8077:1: ( ruleEInt )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8078:1: ruleEInt
            {
             before(grammarAccess.getRankingForkAccess().getMaxEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RankingFork__MaxAssignment_3_116018);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRankingForkAccess().getMaxEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__MaxAssignment_3_1"


    // $ANTLR start "rule__RankingFork__MatcherAssignment_5"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8087:1: rule__RankingFork__MatcherAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__RankingFork__MatcherAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8091:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8092:1: ( ( ruleEString ) )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8092:1: ( ( ruleEString ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8093:1: ( ruleEString )
            {
             before(grammarAccess.getRankingForkAccess().getMatcherChoiceCrossReference_5_0()); 
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8094:1: ( ruleEString )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8095:1: ruleEString
            {
             before(grammarAccess.getRankingForkAccess().getMatcherChoiceEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RankingFork__MatcherAssignment_516053);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRankingForkAccess().getMatcherChoiceEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRankingForkAccess().getMatcherChoiceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__MatcherAssignment_5"


    // $ANTLR start "rule__RankingFork__ForkedquestionsAssignment_6_2"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8106:1: rule__RankingFork__ForkedquestionsAssignment_6_2 : ( ruleQuestion ) ;
    public final void rule__RankingFork__ForkedquestionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8110:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8111:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8111:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8112:1: ruleQuestion
            {
             before(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__RankingFork__ForkedquestionsAssignment_6_216088);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__ForkedquestionsAssignment_6_2"


    // $ANTLR start "rule__RankingFork__ForkedquestionsAssignment_6_3_1"
    // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8121:1: rule__RankingFork__ForkedquestionsAssignment_6_3_1 : ( ruleQuestion ) ;
    public final void rule__RankingFork__ForkedquestionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8125:1: ( ( ruleQuestion ) )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8126:1: ( ruleQuestion )
            {
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8126:1: ( ruleQuestion )
            // ../dk.itu.mddp.eank.survey.ui/src-gen/dk/itu/mddp/eank/survey/ui/contentassist/antlr/internal/InternalSurvey.g:8127:1: ruleQuestion
            {
             before(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__RankingFork__ForkedquestionsAssignment_6_3_116119);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getRankingForkAccess().getForkedquestionsQuestionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RankingFork__ForkedquestionsAssignment_6_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__0_in_ruleMultipleChoice336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpen370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group__0_in_ruleOpen396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_entryRuleRating_Impl423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating_Impl430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__0_in_ruleRating_Impl456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__0_in_ruleRanking516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_entryRuleDichotomous543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDichotomous550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__0_in_ruleDichotomous576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_entryRuleSumConstant603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumConstant610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__0_in_ruleSumConstant636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_entryRuleStaple663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStaple670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__0_in_ruleStaple696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__DescriptionAssignment_in_ruleChoice756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_entryRuleMultipleChoiceFork783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoiceFork790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__0_in_ruleMultipleChoiceFork816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_entryRuleRatingFork903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRatingFork910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__0_in_ruleRatingFork936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRankingFork_in_entryRuleRankingFork963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRankingFork970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__0_in_ruleRankingFork996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_rule__Question__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpen_in_rule__Question__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_Impl_in_rule__Question__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_rule__Question__Alternatives1083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDichotomous_in_rule__Question__Alternatives1100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumConstant_in_rule__Question__Alternatives1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStaple_in_rule__Question__Alternatives1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01214 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__SurveysAssignment_1_in_rule__Model__Group__1__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01337 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11398 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__1__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21460 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group__2__Impl1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__0_in_rule__Survey__Group__3__Impl1549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__0__Impl_in_rule__Survey__Group_3__01588 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__1_in_rule__Survey__Group_3__01591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_3_0_in_rule__Survey__Group_3__0__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__1__Impl_in_rule__Survey__Group_3__11648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3_1__0_in_rule__Survey__Group_3__1__Impl1675 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3_1__0__Impl_in_rule__Survey__Group_3_1__01710 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Survey__Group_3_1__1_in_rule__Survey__Group_3_1__01713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group_3_1__0__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3_1__1__Impl_in_rule__Survey__Group_3_1__11772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__QuestionsAssignment_3_1_1_in_rule__Survey__Group_3_1__1__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__0__Impl_in_rule__MultipleChoice__Group__01833 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__1_in_rule__MultipleChoice__Group__01836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__1__Impl_in_rule__MultipleChoice__Group__11894 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__2_in_rule__MultipleChoice__Group__11897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MultipleChoice__Group__1__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__2__Impl_in_rule__MultipleChoice__Group__21956 = new BitSet(new long[]{0x00000000044F8030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__3_in_rule__MultipleChoice__Group__21959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MultipleChoice__Group__2__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__3__Impl_in_rule__MultipleChoice__Group__32018 = new BitSet(new long[]{0x00000000044F8030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__4_in_rule__MultipleChoice__Group__32021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MultipleChoice__Group__3__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__4__Impl_in_rule__MultipleChoice__Group__42083 = new BitSet(new long[]{0x00000000044F8030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__5_in_rule__MultipleChoice__Group__42086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_4__0_in_rule__MultipleChoice__Group__4__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__5__Impl_in_rule__MultipleChoice__Group__52144 = new BitSet(new long[]{0x00000000044F8030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__6_in_rule__MultipleChoice__Group__52147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__0_in_rule__MultipleChoice__Group__5__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__6__Impl_in_rule__MultipleChoice__Group__62205 = new BitSet(new long[]{0x00000000044F8030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__7_in_rule__MultipleChoice__Group__62208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__0_in_rule__MultipleChoice__Group__6__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__7__Impl_in_rule__MultipleChoice__Group__72266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__0_in_rule__MultipleChoice__Group__7__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_4__0__Impl_in_rule__MultipleChoice__Group_4__02340 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_4__1_in_rule__MultipleChoice__Group_4__02343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MultipleChoice__Group_4__0__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_4__1__Impl_in_rule__MultipleChoice__Group_4__12405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__QuestionAssignment_4_1_in_rule__MultipleChoice__Group_4__1__Impl2432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__0__Impl_in_rule__MultipleChoice__Group_5__02466 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__1_in_rule__MultipleChoice__Group_5__02469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MultipleChoice__Group_5__0__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__1__Impl_in_rule__MultipleChoice__Group_5__12531 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__2_in_rule__MultipleChoice__Group_5__12534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MultipleChoice__Group_5__1__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__2__Impl_in_rule__MultipleChoice__Group_5__22596 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__3_in_rule__MultipleChoice__Group_5__22599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MultipleChoice__Group_5__2__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__3__Impl_in_rule__MultipleChoice__Group_5__32658 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__4_in_rule__MultipleChoice__Group_5__32661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MultipleChoice__Group_5__3__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__4__Impl_in_rule__MultipleChoice__Group_5__42723 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__5_in_rule__MultipleChoice__Group_5__42726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MultipleChoice__Group_5__4__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__5__Impl_in_rule__MultipleChoice__Group_5__52788 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__6_in_rule__MultipleChoice__Group_5__52791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__ChoiceAssignment_5_5_in_rule__MultipleChoice__Group_5__5__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5__6__Impl_in_rule__MultipleChoice__Group_5__62848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5_6__0_in_rule__MultipleChoice__Group_5__6__Impl2875 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5_6__0__Impl_in_rule__MultipleChoice__Group_5_6__02920 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5_6__1_in_rule__MultipleChoice__Group_5_6__02923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MultipleChoice__Group_5_6__0__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_5_6__1__Impl_in_rule__MultipleChoice__Group_5_6__12982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__ChoiceAssignment_5_6_1_in_rule__MultipleChoice__Group_5_6__1__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__0__Impl_in_rule__MultipleChoice__Group_6__03043 = new BitSet(new long[]{0x0000000003810030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__1_in_rule__MultipleChoice__Group_6__03046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MultipleChoice__Group_6__0__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__1__Impl_in_rule__MultipleChoice__Group_6__13105 = new BitSet(new long[]{0x0000000003810030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__2_in_rule__MultipleChoice__Group_6__13108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MultipleChoice__Group_6__1__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__2__Impl_in_rule__MultipleChoice__Group_6__23170 = new BitSet(new long[]{0x0000000003810030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__3_in_rule__MultipleChoice__Group_6__23173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MultipleChoice__Group_6__2__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__3__Impl_in_rule__MultipleChoice__Group_6__33235 = new BitSet(new long[]{0x0000000003810030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__4_in_rule__MultipleChoice__Group_6__33238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MultipleChoice__Group_6__3__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_6__4__Impl_in_rule__MultipleChoice__Group_6__43300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__OtherAssignment_6_4_in_rule__MultipleChoice__Group_6__4__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__0__Impl_in_rule__MultipleChoice__Group_7__03367 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__1_in_rule__MultipleChoice__Group_7__03370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MultipleChoice__Group_7__0__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__1__Impl_in_rule__MultipleChoice__Group_7__13429 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__2_in_rule__MultipleChoice__Group_7__13432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MultipleChoice__Group_7__1__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__2__Impl_in_rule__MultipleChoice__Group_7__23491 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__3_in_rule__MultipleChoice__Group_7__23494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__MultipleChoiceForksAssignment_7_2_in_rule__MultipleChoice__Group_7__2__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7__3__Impl_in_rule__MultipleChoice__Group_7__33551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7_3__0_in_rule__MultipleChoice__Group_7__3__Impl3578 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7_3__0__Impl_in_rule__MultipleChoice__Group_7_3__03617 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7_3__1_in_rule__MultipleChoice__Group_7_3__03620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MultipleChoice__Group_7_3__0__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group_7_3__1__Impl_in_rule__MultipleChoice__Group_7_3__13679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_1_in_rule__MultipleChoice__Group_7_3__1__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group__0__Impl_in_rule__Open__Group__03740 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Open__Group__1_in_rule__Open__Group__03743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group__1__Impl_in_rule__Open__Group__13801 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Open__Group__2_in_rule__Open__Group__13804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Open__Group__1__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group__2__Impl_in_rule__Open__Group__23863 = new BitSet(new long[]{0x0000000010018030L});
        public static final BitSet FOLLOW_rule__Open__Group__3_in_rule__Open__Group__23866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Open__Group__2__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group__3__Impl_in_rule__Open__Group__33925 = new BitSet(new long[]{0x0000000010018030L});
        public static final BitSet FOLLOW_rule__Open__Group__4_in_rule__Open__Group__33928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Open__Group__3__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group__4__Impl_in_rule__Open__Group__43990 = new BitSet(new long[]{0x0000000010018030L});
        public static final BitSet FOLLOW_rule__Open__Group__5_in_rule__Open__Group__43993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__QuestionAssignment_4_in_rule__Open__Group__4__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group__5__Impl_in_rule__Open__Group__54051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group_5__0_in_rule__Open__Group__5__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group_5__0__Impl_in_rule__Open__Group_5__04121 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Open__Group_5__1_in_rule__Open__Group_5__04124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Open__Group_5__0__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__Group_5__1__Impl_in_rule__Open__Group_5__14183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Open__AnswerLengthAssignment_5_1_in_rule__Open__Group_5__1__Impl4210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__0__Impl_in_rule__Rating_Impl__Group__04244 = new BitSet(new long[]{0x0100000020000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__1_in_rule__Rating_Impl__Group__04247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__1__Impl_in_rule__Rating_Impl__Group__14305 = new BitSet(new long[]{0x0100000020000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__2_in_rule__Rating_Impl__Group__14308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__RequiredAssignment_1_in_rule__Rating_Impl__Group__1__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__2__Impl_in_rule__Rating_Impl__Group__24366 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__3_in_rule__Rating_Impl__Group__24369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Rating_Impl__Group__2__Impl4397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__3__Impl_in_rule__Rating_Impl__Group__34428 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__4_in_rule__Rating_Impl__Group__34431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Rating_Impl__Group__3__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__4__Impl_in_rule__Rating_Impl__Group__44490 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__5_in_rule__Rating_Impl__Group__44493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_4__0_in_rule__Rating_Impl__Group__4__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__5__Impl_in_rule__Rating_Impl__Group__54551 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__6_in_rule__Rating_Impl__Group__54554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_5__0_in_rule__Rating_Impl__Group__5__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__6__Impl_in_rule__Rating_Impl__Group__64612 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__7_in_rule__Rating_Impl__Group__64615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_6__0_in_rule__Rating_Impl__Group__6__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__7__Impl_in_rule__Rating_Impl__Group__74673 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__8_in_rule__Rating_Impl__Group__74676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_7__0_in_rule__Rating_Impl__Group__7__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__8__Impl_in_rule__Rating_Impl__Group__84734 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__9_in_rule__Rating_Impl__Group__84737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_8__0_in_rule__Rating_Impl__Group__8__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__9__Impl_in_rule__Rating_Impl__Group__94795 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__10_in_rule__Rating_Impl__Group__94798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__0_in_rule__Rating_Impl__Group__9__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group__10__Impl_in_rule__Rating_Impl__Group__104856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Rating_Impl__Group__10__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_4__0__Impl_in_rule__Rating_Impl__Group_4__04937 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_4__1_in_rule__Rating_Impl__Group_4__04940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Rating_Impl__Group_4__0__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_4__1__Impl_in_rule__Rating_Impl__Group_4__14999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__QuestionAssignment_4_1_in_rule__Rating_Impl__Group_4__1__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_5__0__Impl_in_rule__Rating_Impl__Group_5__05060 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_5__1_in_rule__Rating_Impl__Group_5__05063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Rating_Impl__Group_5__0__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_5__1__Impl_in_rule__Rating_Impl__Group_5__15122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__MinAssignment_5_1_in_rule__Rating_Impl__Group_5__1__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_6__0__Impl_in_rule__Rating_Impl__Group_6__05183 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_6__1_in_rule__Rating_Impl__Group_6__05186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Rating_Impl__Group_6__0__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_6__1__Impl_in_rule__Rating_Impl__Group_6__15245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__MaxAssignment_6_1_in_rule__Rating_Impl__Group_6__1__Impl5272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_7__0__Impl_in_rule__Rating_Impl__Group_7__05306 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_7__1_in_rule__Rating_Impl__Group_7__05309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Rating_Impl__Group_7__0__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_7__1__Impl_in_rule__Rating_Impl__Group_7__15368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__FirstAssignment_7_1_in_rule__Rating_Impl__Group_7__1__Impl5395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_8__0__Impl_in_rule__Rating_Impl__Group_8__05429 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_8__1_in_rule__Rating_Impl__Group_8__05432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Rating_Impl__Group_8__0__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_8__1__Impl_in_rule__Rating_Impl__Group_8__15491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__LastAssignment_8_1_in_rule__Rating_Impl__Group_8__1__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__0__Impl_in_rule__Rating_Impl__Group_9__05552 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__1_in_rule__Rating_Impl__Group_9__05555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Rating_Impl__Group_9__0__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__1__Impl_in_rule__Rating_Impl__Group_9__15614 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__2_in_rule__Rating_Impl__Group_9__15617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Rating_Impl__Group_9__1__Impl5645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__2__Impl_in_rule__Rating_Impl__Group_9__25676 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__3_in_rule__Rating_Impl__Group_9__25679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__RatingForksAssignment_9_2_in_rule__Rating_Impl__Group_9__2__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__3__Impl_in_rule__Rating_Impl__Group_9__35736 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__4_in_rule__Rating_Impl__Group_9__35739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9_3__0_in_rule__Rating_Impl__Group_9__3__Impl5766 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9__4__Impl_in_rule__Rating_Impl__Group_9__45797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Rating_Impl__Group_9__4__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9_3__0__Impl_in_rule__Rating_Impl__Group_9_3__05866 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9_3__1_in_rule__Rating_Impl__Group_9_3__05869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Rating_Impl__Group_9_3__0__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__Group_9_3__1__Impl_in_rule__Rating_Impl__Group_9_3__15928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating_Impl__RatingForksAssignment_9_3_1_in_rule__Rating_Impl__Group_9_3__1__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__0__Impl_in_rule__Ranking__Group__05989 = new BitSet(new long[]{0x0100004000000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__1_in_rule__Ranking__Group__05992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__RequiredAssignment_0_in_rule__Ranking__Group__0__Impl6019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__1__Impl_in_rule__Ranking__Group__16050 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__2_in_rule__Ranking__Group__16053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Ranking__Group__1__Impl6081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__2__Impl_in_rule__Ranking__Group__26112 = new BitSet(new long[]{0x0000018100000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__3_in_rule__Ranking__Group__26115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Ranking__Group__2__Impl6143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__3__Impl_in_rule__Ranking__Group__36174 = new BitSet(new long[]{0x0000018100000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__4_in_rule__Ranking__Group__36177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_3__0_in_rule__Ranking__Group__3__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__4__Impl_in_rule__Ranking__Group__46235 = new BitSet(new long[]{0x0000018100000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__5_in_rule__Ranking__Group__46238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__0_in_rule__Ranking__Group__4__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__5__Impl_in_rule__Ranking__Group__56296 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__6_in_rule__Ranking__Group__56299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Ranking__Group__5__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__6__Impl_in_rule__Ranking__Group__66358 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_rule__Ranking__Group__7_in_rule__Ranking__Group__66361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Ranking__Group__6__Impl6389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__7__Impl_in_rule__Ranking__Group__76420 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__8_in_rule__Ranking__Group__76423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__ChoicesAssignment_7_in_rule__Ranking__Group__7__Impl6450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__8__Impl_in_rule__Ranking__Group__86480 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__9_in_rule__Ranking__Group__86483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_8__0_in_rule__Ranking__Group__8__Impl6510 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__9__Impl_in_rule__Ranking__Group__96541 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__10_in_rule__Ranking__Group__96544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ranking__Group__9__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__10__Impl_in_rule__Ranking__Group__106603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ranking__Group__10__Impl6631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_3__0__Impl_in_rule__Ranking__Group_3__06684 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Ranking__Group_3__1_in_rule__Ranking__Group_3__06687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Ranking__Group_3__0__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_3__1__Impl_in_rule__Ranking__Group_3__16746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__QuestionAssignment_3_1_in_rule__Ranking__Group_3__1__Impl6773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__0__Impl_in_rule__Ranking__Group_4__06807 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__1_in_rule__Ranking__Group_4__06810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Ranking__Group_4__0__Impl6838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__1__Impl_in_rule__Ranking__Group_4__16869 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__2_in_rule__Ranking__Group_4__16872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Ranking__Group_4__1__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__2__Impl_in_rule__Ranking__Group_4__26931 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__3_in_rule__Ranking__Group_4__26934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__ForksAssignment_4_2_in_rule__Ranking__Group_4__2__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__3__Impl_in_rule__Ranking__Group_4__36991 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__4_in_rule__Ranking__Group_4__36994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4_3__0_in_rule__Ranking__Group_4__3__Impl7021 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4__4__Impl_in_rule__Ranking__Group_4__47052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ranking__Group_4__4__Impl7080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4_3__0__Impl_in_rule__Ranking__Group_4_3__07121 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4_3__1_in_rule__Ranking__Group_4_3__07124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Ranking__Group_4_3__0__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_4_3__1__Impl_in_rule__Ranking__Group_4_3__17183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__ForksAssignment_4_3_1_in_rule__Ranking__Group_4_3__1__Impl7210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_8__0__Impl_in_rule__Ranking__Group_8__07244 = new BitSet(new long[]{0x0000000000310030L});
        public static final BitSet FOLLOW_rule__Ranking__Group_8__1_in_rule__Ranking__Group_8__07247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Ranking__Group_8__0__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group_8__1__Impl_in_rule__Ranking__Group_8__17306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__ChoicesAssignment_8_1_in_rule__Ranking__Group_8__1__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__0__Impl_in_rule__Dichotomous__Group__07367 = new BitSet(new long[]{0x0100020000000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__1_in_rule__Dichotomous__Group__07370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__1__Impl_in_rule__Dichotomous__Group__17428 = new BitSet(new long[]{0x0100020000000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__2_in_rule__Dichotomous__Group__17431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__RequiredAssignment_1_in_rule__Dichotomous__Group__1__Impl7458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__2__Impl_in_rule__Dichotomous__Group__27489 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__3_in_rule__Dichotomous__Group__27492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Dichotomous__Group__2__Impl7520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__3__Impl_in_rule__Dichotomous__Group__37551 = new BitSet(new long[]{0x00000C0180000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__4_in_rule__Dichotomous__Group__37554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Dichotomous__Group__3__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__4__Impl_in_rule__Dichotomous__Group__47613 = new BitSet(new long[]{0x00000C0180000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__5_in_rule__Dichotomous__Group__47616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_4__0_in_rule__Dichotomous__Group__4__Impl7643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__5__Impl_in_rule__Dichotomous__Group__57674 = new BitSet(new long[]{0x00000C0180000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__6_in_rule__Dichotomous__Group__57677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__0_in_rule__Dichotomous__Group__5__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__6__Impl_in_rule__Dichotomous__Group__67735 = new BitSet(new long[]{0x00000C0180000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__7_in_rule__Dichotomous__Group__67738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__0_in_rule__Dichotomous__Group__6__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group__7__Impl_in_rule__Dichotomous__Group__77796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Dichotomous__Group__7__Impl7824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_4__0__Impl_in_rule__Dichotomous__Group_4__07871 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_4__1_in_rule__Dichotomous__Group_4__07874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Dichotomous__Group_4__0__Impl7902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_4__1__Impl_in_rule__Dichotomous__Group_4__17933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__QuestionAssignment_4_1_in_rule__Dichotomous__Group_4__1__Impl7960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__0__Impl_in_rule__Dichotomous__Group_5__07994 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__1_in_rule__Dichotomous__Group_5__07997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Dichotomous__Group_5__0__Impl8025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__1__Impl_in_rule__Dichotomous__Group_5__18056 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__2_in_rule__Dichotomous__Group_5__18059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Dichotomous__Group_5__1__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__2__Impl_in_rule__Dichotomous__Group_5__28118 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__3_in_rule__Dichotomous__Group_5__28121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__YesAssignment_5_2_in_rule__Dichotomous__Group_5__2__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__3__Impl_in_rule__Dichotomous__Group_5__38178 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__4_in_rule__Dichotomous__Group_5__38181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5_3__0_in_rule__Dichotomous__Group_5__3__Impl8208 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5__4__Impl_in_rule__Dichotomous__Group_5__48239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Dichotomous__Group_5__4__Impl8267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5_3__0__Impl_in_rule__Dichotomous__Group_5_3__08308 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5_3__1_in_rule__Dichotomous__Group_5_3__08311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Dichotomous__Group_5_3__0__Impl8339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_5_3__1__Impl_in_rule__Dichotomous__Group_5_3__18370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__YesAssignment_5_3_1_in_rule__Dichotomous__Group_5_3__1__Impl8397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__0__Impl_in_rule__Dichotomous__Group_6__08431 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__1_in_rule__Dichotomous__Group_6__08434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Dichotomous__Group_6__0__Impl8462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__1__Impl_in_rule__Dichotomous__Group_6__18493 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__2_in_rule__Dichotomous__Group_6__18496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Dichotomous__Group_6__1__Impl8524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__2__Impl_in_rule__Dichotomous__Group_6__28555 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__3_in_rule__Dichotomous__Group_6__28558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__NoAssignment_6_2_in_rule__Dichotomous__Group_6__2__Impl8585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__3__Impl_in_rule__Dichotomous__Group_6__38615 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__4_in_rule__Dichotomous__Group_6__38618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6_3__0_in_rule__Dichotomous__Group_6__3__Impl8645 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6__4__Impl_in_rule__Dichotomous__Group_6__48676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Dichotomous__Group_6__4__Impl8704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6_3__0__Impl_in_rule__Dichotomous__Group_6_3__08745 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6_3__1_in_rule__Dichotomous__Group_6_3__08748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Dichotomous__Group_6_3__0__Impl8776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__Group_6_3__1__Impl_in_rule__Dichotomous__Group_6_3__18807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dichotomous__NoAssignment_6_3_1_in_rule__Dichotomous__Group_6_3__1__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__0__Impl_in_rule__SumConstant__Group__08868 = new BitSet(new long[]{0x0100100000000000L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__1_in_rule__SumConstant__Group__08871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__1__Impl_in_rule__SumConstant__Group__18929 = new BitSet(new long[]{0x0100100000000000L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__2_in_rule__SumConstant__Group__18932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__RequiredAssignment_1_in_rule__SumConstant__Group__1__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__2__Impl_in_rule__SumConstant__Group__28990 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__3_in_rule__SumConstant__Group__28993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__SumConstant__Group__2__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__3__Impl_in_rule__SumConstant__Group__39052 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__4_in_rule__SumConstant__Group__39055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SumConstant__Group__3__Impl9083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__4__Impl_in_rule__SumConstant__Group__49114 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__5_in_rule__SumConstant__Group__49117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group_4__0_in_rule__SumConstant__Group__4__Impl9144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group__5__Impl_in_rule__SumConstant__Group__59175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SumConstant__Group__5__Impl9203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group_4__0__Impl_in_rule__SumConstant__Group_4__09246 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__SumConstant__Group_4__1_in_rule__SumConstant__Group_4__09249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SumConstant__Group_4__0__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__Group_4__1__Impl_in_rule__SumConstant__Group_4__19308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SumConstant__QuestionAssignment_4_1_in_rule__SumConstant__Group_4__1__Impl9335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__0__Impl_in_rule__Staple__Group__09369 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Staple__Group__1_in_rule__Staple__Group__09372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__1__Impl_in_rule__Staple__Group__19430 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__Staple__Group__2_in_rule__Staple__Group__19433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__RequiredAssignment_1_in_rule__Staple__Group__1__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__2__Impl_in_rule__Staple__Group__29491 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__3_in_rule__Staple__Group__29494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Staple__Group__2__Impl9522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__3__Impl_in_rule__Staple__Group__39553 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__4_in_rule__Staple__Group__39556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Staple__Group__3__Impl9584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__4__Impl_in_rule__Staple__Group__49615 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__5_in_rule__Staple__Group__49618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_4__0_in_rule__Staple__Group__4__Impl9645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__5__Impl_in_rule__Staple__Group__59676 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__6_in_rule__Staple__Group__59679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_5__0_in_rule__Staple__Group__5__Impl9706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__6__Impl_in_rule__Staple__Group__69737 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__7_in_rule__Staple__Group__69740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_6__0_in_rule__Staple__Group__6__Impl9767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__7__Impl_in_rule__Staple__Group__79798 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__8_in_rule__Staple__Group__79801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_7__0_in_rule__Staple__Group__7__Impl9828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__8__Impl_in_rule__Staple__Group__89859 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__9_in_rule__Staple__Group__89862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_8__0_in_rule__Staple__Group__8__Impl9889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__9__Impl_in_rule__Staple__Group__99920 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__10_in_rule__Staple__Group__99923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_9__0_in_rule__Staple__Group__9__Impl9950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__10__Impl_in_rule__Staple__Group__109981 = new BitSet(new long[]{0x0000403F80000000L});
        public static final BitSet FOLLOW_rule__Staple__Group__11_in_rule__Staple__Group__109984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__0_in_rule__Staple__Group__10__Impl10011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group__11__Impl_in_rule__Staple__Group__1110042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Staple__Group__11__Impl10070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_4__0__Impl_in_rule__Staple__Group_4__010125 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Staple__Group_4__1_in_rule__Staple__Group_4__010128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Staple__Group_4__0__Impl10156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_4__1__Impl_in_rule__Staple__Group_4__110187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__QuestionAssignment_4_1_in_rule__Staple__Group_4__1__Impl10214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_5__0__Impl_in_rule__Staple__Group_5__010248 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__Staple__Group_5__1_in_rule__Staple__Group_5__010251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Staple__Group_5__0__Impl10279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_5__1__Impl_in_rule__Staple__Group_5__110310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__MinAssignment_5_1_in_rule__Staple__Group_5__1__Impl10337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_6__0__Impl_in_rule__Staple__Group_6__010371 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__Staple__Group_6__1_in_rule__Staple__Group_6__010374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Staple__Group_6__0__Impl10402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_6__1__Impl_in_rule__Staple__Group_6__110433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__MaxAssignment_6_1_in_rule__Staple__Group_6__1__Impl10460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_7__0__Impl_in_rule__Staple__Group_7__010494 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Staple__Group_7__1_in_rule__Staple__Group_7__010497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Staple__Group_7__0__Impl10525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_7__1__Impl_in_rule__Staple__Group_7__110556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__FirstAssignment_7_1_in_rule__Staple__Group_7__1__Impl10583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_8__0__Impl_in_rule__Staple__Group_8__010617 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Staple__Group_8__1_in_rule__Staple__Group_8__010620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Staple__Group_8__0__Impl10648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_8__1__Impl_in_rule__Staple__Group_8__110679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__LastAssignment_8_1_in_rule__Staple__Group_8__1__Impl10706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_9__0__Impl_in_rule__Staple__Group_9__010740 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__Staple__Group_9__1_in_rule__Staple__Group_9__010743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Staple__Group_9__0__Impl10771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_9__1__Impl_in_rule__Staple__Group_9__110802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__MidAssignment_9_1_in_rule__Staple__Group_9__1__Impl10829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__0__Impl_in_rule__Staple__Group_10__010863 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__1_in_rule__Staple__Group_10__010866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Staple__Group_10__0__Impl10894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__1__Impl_in_rule__Staple__Group_10__110925 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__2_in_rule__Staple__Group_10__110928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Staple__Group_10__1__Impl10956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__2__Impl_in_rule__Staple__Group_10__210987 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__3_in_rule__Staple__Group_10__210990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__RatingForksAssignment_10_2_in_rule__Staple__Group_10__2__Impl11017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__3__Impl_in_rule__Staple__Group_10__311047 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__4_in_rule__Staple__Group_10__311050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10_3__0_in_rule__Staple__Group_10__3__Impl11077 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10__4__Impl_in_rule__Staple__Group_10__411108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Staple__Group_10__4__Impl11136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10_3__0__Impl_in_rule__Staple__Group_10_3__011177 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__Staple__Group_10_3__1_in_rule__Staple__Group_10_3__011180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Staple__Group_10_3__0__Impl11208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__Group_10_3__1__Impl_in_rule__Staple__Group_10_3__111239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Staple__RatingForksAssignment_10_3_1_in_rule__Staple__Group_10_3__1__Impl11266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__0__Impl_in_rule__MultipleChoiceFork__Group__011300 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__1_in_rule__MultipleChoiceFork__Group__011303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__MultipleChoiceFork__Group__0__Impl11331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__1__Impl_in_rule__MultipleChoiceFork__Group__111362 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__2_in_rule__MultipleChoiceFork__Group__111365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__MultipleChoiceFork__Group__1__Impl11393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__2__Impl_in_rule__MultipleChoiceFork__Group__211424 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__3_in_rule__MultipleChoiceFork__Group__211427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__MatcherAssignment_2_in_rule__MultipleChoiceFork__Group__2__Impl11454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group__3__Impl_in_rule__MultipleChoiceFork__Group__311484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__0_in_rule__MultipleChoiceFork__Group__3__Impl11511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__0__Impl_in_rule__MultipleChoiceFork__Group_3__011550 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__1_in_rule__MultipleChoiceFork__Group_3__011553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__MultipleChoiceFork__Group_3__0__Impl11581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__1__Impl_in_rule__MultipleChoiceFork__Group_3__111612 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__2_in_rule__MultipleChoiceFork__Group_3__111615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MultipleChoiceFork__Group_3__1__Impl11643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__2__Impl_in_rule__MultipleChoiceFork__Group_3__211674 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__3_in_rule__MultipleChoiceFork__Group_3__211677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_2_in_rule__MultipleChoiceFork__Group_3__2__Impl11704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3__3__Impl_in_rule__MultipleChoiceFork__Group_3__311734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3_3__0_in_rule__MultipleChoiceFork__Group_3__3__Impl11761 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3_3__0__Impl_in_rule__MultipleChoiceFork__Group_3_3__011800 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3_3__1_in_rule__MultipleChoiceFork__Group_3_3__011803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MultipleChoiceFork__Group_3_3__0__Impl11831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__Group_3_3__1__Impl_in_rule__MultipleChoiceFork__Group_3_3__111862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_1_in_rule__MultipleChoiceFork__Group_3_3__1__Impl11889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011923 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__EInt__Group__0__Impl11955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl12015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__0__Impl_in_rule__RatingFork__Group__012048 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__1_in_rule__RatingFork__Group__012051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__1__Impl_in_rule__RatingFork__Group__112109 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__2_in_rule__RatingFork__Group__112112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__RatingFork__Group__1__Impl12140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__2__Impl_in_rule__RatingFork__Group__212171 = new BitSet(new long[]{0x0030000084000000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__3_in_rule__RatingFork__Group__212174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RatingFork__Group__2__Impl12202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__3__Impl_in_rule__RatingFork__Group__312233 = new BitSet(new long[]{0x0030000084000000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__4_in_rule__RatingFork__Group__312236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_3__0_in_rule__RatingFork__Group__3__Impl12263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__4__Impl_in_rule__RatingFork__Group__412294 = new BitSet(new long[]{0x0030000084000000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__5_in_rule__RatingFork__Group__412297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_4__0_in_rule__RatingFork__Group__4__Impl12324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__5__Impl_in_rule__RatingFork__Group__512355 = new BitSet(new long[]{0x0030000084000000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__6_in_rule__RatingFork__Group__512358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__0_in_rule__RatingFork__Group__5__Impl12385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group__6__Impl_in_rule__RatingFork__Group__612416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RatingFork__Group__6__Impl12444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_3__0__Impl_in_rule__RatingFork__Group_3__012489 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_3__1_in_rule__RatingFork__Group_3__012492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__RatingFork__Group_3__0__Impl12520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_3__1__Impl_in_rule__RatingFork__Group_3__112551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__MinAssignment_3_1_in_rule__RatingFork__Group_3__1__Impl12578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_4__0__Impl_in_rule__RatingFork__Group_4__012612 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_4__1_in_rule__RatingFork__Group_4__012615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__RatingFork__Group_4__0__Impl12643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_4__1__Impl_in_rule__RatingFork__Group_4__112674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__MaxAssignment_4_1_in_rule__RatingFork__Group_4__1__Impl12701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__0__Impl_in_rule__RatingFork__Group_5__012735 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__1_in_rule__RatingFork__Group_5__012738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__RatingFork__Group_5__0__Impl12766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__1__Impl_in_rule__RatingFork__Group_5__112797 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__2_in_rule__RatingFork__Group_5__112800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RatingFork__Group_5__1__Impl12828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__2__Impl_in_rule__RatingFork__Group_5__212859 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__3_in_rule__RatingFork__Group_5__212862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__ForkedquestionAssignment_5_2_in_rule__RatingFork__Group_5__2__Impl12889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__3__Impl_in_rule__RatingFork__Group_5__312919 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__4_in_rule__RatingFork__Group_5__312922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5_3__0_in_rule__RatingFork__Group_5__3__Impl12949 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5__4__Impl_in_rule__RatingFork__Group_5__412980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RatingFork__Group_5__4__Impl13008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5_3__0__Impl_in_rule__RatingFork__Group_5_3__013049 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5_3__1_in_rule__RatingFork__Group_5_3__013052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RatingFork__Group_5_3__0__Impl13080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__Group_5_3__1__Impl_in_rule__RatingFork__Group_5_3__113111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RatingFork__ForkedquestionAssignment_5_3_1_in_rule__RatingFork__Group_5_3__1__Impl13138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__0__Impl_in_rule__RankingFork__Group__013172 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__1_in_rule__RankingFork__Group__013175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__RankingFork__Group__0__Impl13203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__1__Impl_in_rule__RankingFork__Group__113234 = new BitSet(new long[]{0x0031000000000000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__2_in_rule__RankingFork__Group__113237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RankingFork__Group__1__Impl13265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__2__Impl_in_rule__RankingFork__Group__213296 = new BitSet(new long[]{0x0031000000000000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__3_in_rule__RankingFork__Group__213299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_2__0_in_rule__RankingFork__Group__2__Impl13326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__3__Impl_in_rule__RankingFork__Group__313357 = new BitSet(new long[]{0x0031000000000000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__4_in_rule__RankingFork__Group__313360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_3__0_in_rule__RankingFork__Group__3__Impl13387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__4__Impl_in_rule__RankingFork__Group__413418 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__5_in_rule__RankingFork__Group__413421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__RankingFork__Group__4__Impl13449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__5__Impl_in_rule__RankingFork__Group__513480 = new BitSet(new long[]{0x0080000080000000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__6_in_rule__RankingFork__Group__513483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__MatcherAssignment_5_in_rule__RankingFork__Group__5__Impl13510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__6__Impl_in_rule__RankingFork__Group__613540 = new BitSet(new long[]{0x0080000080000000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__7_in_rule__RankingFork__Group__613543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__0_in_rule__RankingFork__Group__6__Impl13570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group__7__Impl_in_rule__RankingFork__Group__713601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RankingFork__Group__7__Impl13629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_2__0__Impl_in_rule__RankingFork__Group_2__013676 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_2__1_in_rule__RankingFork__Group_2__013679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__RankingFork__Group_2__0__Impl13707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_2__1__Impl_in_rule__RankingFork__Group_2__113738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__MinAssignment_2_1_in_rule__RankingFork__Group_2__1__Impl13765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_3__0__Impl_in_rule__RankingFork__Group_3__013799 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_3__1_in_rule__RankingFork__Group_3__013802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__RankingFork__Group_3__0__Impl13830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_3__1__Impl_in_rule__RankingFork__Group_3__113861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__MaxAssignment_3_1_in_rule__RankingFork__Group_3__1__Impl13888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__0__Impl_in_rule__RankingFork__Group_6__013922 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__1_in_rule__RankingFork__Group_6__013925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__RankingFork__Group_6__0__Impl13953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__1__Impl_in_rule__RankingFork__Group_6__113984 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__2_in_rule__RankingFork__Group_6__113987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RankingFork__Group_6__1__Impl14015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__2__Impl_in_rule__RankingFork__Group_6__214046 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__3_in_rule__RankingFork__Group_6__214049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__ForkedquestionsAssignment_6_2_in_rule__RankingFork__Group_6__2__Impl14076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__3__Impl_in_rule__RankingFork__Group_6__314106 = new BitSet(new long[]{0x0000000080002000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__4_in_rule__RankingFork__Group_6__314109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6_3__0_in_rule__RankingFork__Group_6__3__Impl14136 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6__4__Impl_in_rule__RankingFork__Group_6__414167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RankingFork__Group_6__4__Impl14195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6_3__0__Impl_in_rule__RankingFork__Group_6_3__014236 = new BitSet(new long[]{0x0100324028004000L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6_3__1_in_rule__RankingFork__Group_6_3__014239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__RankingFork__Group_6_3__0__Impl14267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__Group_6_3__1__Impl_in_rule__RankingFork__Group_6_3__114298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RankingFork__ForkedquestionsAssignment_6_3_1_in_rule__RankingFork__Group_6_3__1__Impl14325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSurvey_in_rule__Model__SurveysAssignment_114364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_3_014395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Survey__QuestionsAssignment_3_1_114426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice__QuestionAssignment_4_114457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rule__MultipleChoice__ChoiceAssignment_5_514488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rule__MultipleChoice__ChoiceAssignment_5_6_114519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice__OtherAssignment_6_414550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_rule__MultipleChoice__MultipleChoiceForksAssignment_7_214581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoiceFork_in_rule__MultipleChoice__MultipleChoiceForksAssignment_7_3_114612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Open__QuestionAssignment_414643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Open__AnswerLengthAssignment_5_114674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Rating_Impl__RequiredAssignment_114710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rating_Impl__QuestionAssignment_4_114749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating_Impl__MinAssignment_5_114780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating_Impl__MaxAssignment_6_114811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rating_Impl__FirstAssignment_7_114842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rating_Impl__LastAssignment_8_114873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_rule__Rating_Impl__RatingForksAssignment_9_214904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_rule__Rating_Impl__RatingForksAssignment_9_3_114935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Ranking__RequiredAssignment_014971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ranking__QuestionAssignment_3_115010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRankingFork_in_rule__Ranking__ForksAssignment_4_215041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRankingFork_in_rule__Ranking__ForksAssignment_4_3_115072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rule__Ranking__ChoicesAssignment_715103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rule__Ranking__ChoicesAssignment_8_115134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Dichotomous__RequiredAssignment_115170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Dichotomous__QuestionAssignment_4_115209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Dichotomous__YesAssignment_5_215240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Dichotomous__YesAssignment_5_3_115271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Dichotomous__NoAssignment_6_215302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Dichotomous__NoAssignment_6_3_115333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__SumConstant__RequiredAssignment_115369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SumConstant__QuestionAssignment_4_115408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Staple__RequiredAssignment_115444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Staple__QuestionAssignment_4_115483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Staple__MinAssignment_5_115514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Staple__MaxAssignment_6_115545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Staple__FirstAssignment_7_115576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Staple__LastAssignment_8_115607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Staple__MidAssignment_9_115638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_rule__Staple__RatingForksAssignment_10_215669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRatingFork_in_rule__Staple__RatingForksAssignment_10_3_115700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Choice__DescriptionAssignment15731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MultipleChoiceFork__MatcherAssignment_215766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_215801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__MultipleChoiceFork__ForkedquestionsAssignment_3_3_115832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RatingFork__MinAssignment_3_115863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RatingFork__MaxAssignment_4_115894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__RatingFork__ForkedquestionAssignment_5_215925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__RatingFork__ForkedquestionAssignment_5_3_115956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RankingFork__MinAssignment_2_115987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RankingFork__MaxAssignment_3_116018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RankingFork__MatcherAssignment_516053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__RankingFork__ForkedquestionsAssignment_6_216088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__RankingFork__ForkedquestionsAssignment_6_3_116119 = new BitSet(new long[]{0x0000000000000002L});
    }


}