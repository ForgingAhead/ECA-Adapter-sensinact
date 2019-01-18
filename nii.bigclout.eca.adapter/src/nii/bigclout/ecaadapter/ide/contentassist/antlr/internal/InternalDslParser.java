package nii.bigclout.ecaadapter.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import nii.bigclout.ecaadapter.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'is'", "'are'", "'resource'", "'can'", "'be'", "','", "'app'", "'on'", "'priority'", "'if'", "'do'", "'and'", "'else'", "'environment'", "':='", "'or'", "'!='", "'=='", "'>'", "'>='", "'<'", "'=<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'.state'", "'('", "')'", "'not'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRunTimeModel"
    // InternalDsl.g:53:1: entryRuleRunTimeModel : ruleRunTimeModel EOF ;
    public final void entryRuleRunTimeModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleRunTimeModel EOF )
            // InternalDsl.g:55:1: ruleRunTimeModel EOF
            {
             before(grammarAccess.getRunTimeModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRunTimeModel();

            state._fsp--;

             after(grammarAccess.getRunTimeModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRunTimeModel"


    // $ANTLR start "ruleRunTimeModel"
    // InternalDsl.g:62:1: ruleRunTimeModel : ( ( rule__RunTimeModel__Group__0 ) ) ;
    public final void ruleRunTimeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__RunTimeModel__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__RunTimeModel__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__RunTimeModel__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__RunTimeModel__Group__0 )
            {
             before(grammarAccess.getRunTimeModelAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__RunTimeModel__Group__0 )
            // InternalDsl.g:69:4: rule__RunTimeModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunTimeModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRunTimeModel"


    // $ANTLR start "entryRuleState"
    // InternalDsl.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleState EOF )
            // InternalDsl.g:80:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDsl.g:87:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__State__NameAssignment ) ) )
            // InternalDsl.g:92:2: ( ( rule__State__NameAssignment ) )
            {
            // InternalDsl.g:92:2: ( ( rule__State__NameAssignment ) )
            // InternalDsl.g:93:3: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // InternalDsl.g:94:3: ( rule__State__NameAssignment )
            // InternalDsl.g:94:4: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleResource"
    // InternalDsl.g:103:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleResource EOF )
            // InternalDsl.g:105:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalDsl.g:112:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Resource__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Resource__Group__0 )
            // InternalDsl.g:119:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleAppMetaData"
    // InternalDsl.g:128:1: entryRuleAppMetaData : ruleAppMetaData EOF ;
    public final void entryRuleAppMetaData() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleAppMetaData EOF )
            // InternalDsl.g:130:1: ruleAppMetaData EOF
            {
             before(grammarAccess.getAppMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleAppMetaData();

            state._fsp--;

             after(grammarAccess.getAppMetaDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppMetaData"


    // $ANTLR start "ruleAppMetaData"
    // InternalDsl.g:137:1: ruleAppMetaData : ( ( rule__AppMetaData__Group__0 ) ) ;
    public final void ruleAppMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__AppMetaData__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__AppMetaData__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__AppMetaData__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__AppMetaData__Group__0 )
            {
             before(grammarAccess.getAppMetaDataAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__AppMetaData__Group__0 )
            // InternalDsl.g:144:4: rule__AppMetaData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppMetaDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppMetaData"


    // $ANTLR start "entryRuleSpecification"
    // InternalDsl.g:153:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleSpecification EOF )
            // InternalDsl.g:155:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalDsl.g:162:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Specification__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Specification__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Specification__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Specification__Group__0 )
            // InternalDsl.g:169:4: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleTrigger"
    // InternalDsl.g:178:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleTrigger EOF )
            // InternalDsl.g:180:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalDsl.g:187:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Trigger__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Trigger__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Trigger__Group__0 )
            // InternalDsl.g:194:4: rule__Trigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleIfDoSpec"
    // InternalDsl.g:203:1: entryRuleIfDoSpec : ruleIfDoSpec EOF ;
    public final void entryRuleIfDoSpec() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleIfDoSpec EOF )
            // InternalDsl.g:205:1: ruleIfDoSpec EOF
            {
             before(grammarAccess.getIfDoSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleIfDoSpec();

            state._fsp--;

             after(grammarAccess.getIfDoSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfDoSpec"


    // $ANTLR start "ruleIfDoSpec"
    // InternalDsl.g:212:1: ruleIfDoSpec : ( ( rule__IfDoSpec__Group__0 ) ) ;
    public final void ruleIfDoSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__IfDoSpec__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__IfDoSpec__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__IfDoSpec__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__IfDoSpec__Group__0 )
            {
             before(grammarAccess.getIfDoSpecAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__IfDoSpec__Group__0 )
            // InternalDsl.g:219:4: rule__IfDoSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfDoSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfDoSpec"


    // $ANTLR start "entryRuleElseIfDoSpec"
    // InternalDsl.g:228:1: entryRuleElseIfDoSpec : ruleElseIfDoSpec EOF ;
    public final void entryRuleElseIfDoSpec() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleElseIfDoSpec EOF )
            // InternalDsl.g:230:1: ruleElseIfDoSpec EOF
            {
             before(grammarAccess.getElseIfDoSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleElseIfDoSpec();

            state._fsp--;

             after(grammarAccess.getElseIfDoSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElseIfDoSpec"


    // $ANTLR start "ruleElseIfDoSpec"
    // InternalDsl.g:237:1: ruleElseIfDoSpec : ( ( rule__ElseIfDoSpec__Group__0 ) ) ;
    public final void ruleElseIfDoSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__ElseIfDoSpec__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__ElseIfDoSpec__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__ElseIfDoSpec__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__ElseIfDoSpec__Group__0 )
            {
             before(grammarAccess.getElseIfDoSpecAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__ElseIfDoSpec__Group__0 )
            // InternalDsl.g:244:4: rule__ElseIfDoSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseIfDoSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseIfDoSpec"


    // $ANTLR start "entryRuleElseDoSpec"
    // InternalDsl.g:253:1: entryRuleElseDoSpec : ruleElseDoSpec EOF ;
    public final void entryRuleElseDoSpec() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleElseDoSpec EOF )
            // InternalDsl.g:255:1: ruleElseDoSpec EOF
            {
             before(grammarAccess.getElseDoSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleElseDoSpec();

            state._fsp--;

             after(grammarAccess.getElseDoSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElseDoSpec"


    // $ANTLR start "ruleElseDoSpec"
    // InternalDsl.g:262:1: ruleElseDoSpec : ( ( rule__ElseDoSpec__Group__0 ) ) ;
    public final void ruleElseDoSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__ElseDoSpec__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__ElseDoSpec__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__ElseDoSpec__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__ElseDoSpec__Group__0 )
            {
             before(grammarAccess.getElseDoSpecAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__ElseDoSpec__Group__0 )
            // InternalDsl.g:269:4: rule__ElseDoSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseDoSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseDoSpec"


    // $ANTLR start "entryRuleEnvironmentMetaData"
    // InternalDsl.g:278:1: entryRuleEnvironmentMetaData : ruleEnvironmentMetaData EOF ;
    public final void entryRuleEnvironmentMetaData() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleEnvironmentMetaData EOF )
            // InternalDsl.g:280:1: ruleEnvironmentMetaData EOF
            {
             before(grammarAccess.getEnvironmentMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentMetaData();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnvironmentMetaData"


    // $ANTLR start "ruleEnvironmentMetaData"
    // InternalDsl.g:287:1: ruleEnvironmentMetaData : ( ( rule__EnvironmentMetaData__Group__0 ) ) ;
    public final void ruleEnvironmentMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__EnvironmentMetaData__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__EnvironmentMetaData__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__EnvironmentMetaData__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__EnvironmentMetaData__Group__0 )
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__EnvironmentMetaData__Group__0 )
            // InternalDsl.g:294:4: rule__EnvironmentMetaData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentMetaDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironmentMetaData"


    // $ANTLR start "entryRuleAction"
    // InternalDsl.g:303:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleAction EOF )
            // InternalDsl.g:305:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDsl.g:312:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Action__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Action__Group__0 )
            // InternalDsl.g:319:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleOrElement"
    // InternalDsl.g:328:1: entryRuleOrElement : ruleOrElement EOF ;
    public final void entryRuleOrElement() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleOrElement EOF )
            // InternalDsl.g:330:1: ruleOrElement EOF
            {
             before(grammarAccess.getOrElementRule()); 
            pushFollow(FOLLOW_1);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getOrElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrElement"


    // $ANTLR start "ruleOrElement"
    // InternalDsl.g:337:1: ruleOrElement : ( ( rule__OrElement__Group__0 ) ) ;
    public final void ruleOrElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__OrElement__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__OrElement__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__OrElement__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__OrElement__Group__0 )
            {
             before(grammarAccess.getOrElementAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__OrElement__Group__0 )
            // InternalDsl.g:344:4: rule__OrElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrElement"


    // $ANTLR start "entryRuleAndElement"
    // InternalDsl.g:353:1: entryRuleAndElement : ruleAndElement EOF ;
    public final void entryRuleAndElement() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleAndElement EOF )
            // InternalDsl.g:355:1: ruleAndElement EOF
            {
             before(grammarAccess.getAndElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAndElement();

            state._fsp--;

             after(grammarAccess.getAndElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndElement"


    // $ANTLR start "ruleAndElement"
    // InternalDsl.g:362:1: ruleAndElement : ( ( rule__AndElement__Group__0 ) ) ;
    public final void ruleAndElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__AndElement__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__AndElement__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__AndElement__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__AndElement__Group__0 )
            {
             before(grammarAccess.getAndElementAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__AndElement__Group__0 )
            // InternalDsl.g:369:4: rule__AndElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndElement"


    // $ANTLR start "entryRuleDiffEqualElement"
    // InternalDsl.g:378:1: entryRuleDiffEqualElement : ruleDiffEqualElement EOF ;
    public final void entryRuleDiffEqualElement() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleDiffEqualElement EOF )
            // InternalDsl.g:380:1: ruleDiffEqualElement EOF
            {
             before(grammarAccess.getDiffEqualElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDiffEqualElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiffEqualElement"


    // $ANTLR start "ruleDiffEqualElement"
    // InternalDsl.g:387:1: ruleDiffEqualElement : ( ( rule__DiffEqualElement__Group__0 ) ) ;
    public final void ruleDiffEqualElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__DiffEqualElement__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__DiffEqualElement__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__DiffEqualElement__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__DiffEqualElement__Group__0 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__DiffEqualElement__Group__0 )
            // InternalDsl.g:394:4: rule__DiffEqualElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiffEqualElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiffEqualElement"


    // $ANTLR start "entryRuleCompareElement"
    // InternalDsl.g:403:1: entryRuleCompareElement : ruleCompareElement EOF ;
    public final void entryRuleCompareElement() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleCompareElement EOF )
            // InternalDsl.g:405:1: ruleCompareElement EOF
            {
             before(grammarAccess.getCompareElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getCompareElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompareElement"


    // $ANTLR start "ruleCompareElement"
    // InternalDsl.g:412:1: ruleCompareElement : ( ( rule__CompareElement__Group__0 ) ) ;
    public final void ruleCompareElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__CompareElement__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__CompareElement__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__CompareElement__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__CompareElement__Group__0 )
            {
             before(grammarAccess.getCompareElementAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__CompareElement__Group__0 )
            // InternalDsl.g:419:4: rule__CompareElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareElement"


    // $ANTLR start "entryRulePlusMinusElement"
    // InternalDsl.g:428:1: entryRulePlusMinusElement : rulePlusMinusElement EOF ;
    public final void entryRulePlusMinusElement() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( rulePlusMinusElement EOF )
            // InternalDsl.g:430:1: rulePlusMinusElement EOF
            {
             before(grammarAccess.getPlusMinusElementRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusMinusElement"


    // $ANTLR start "rulePlusMinusElement"
    // InternalDsl.g:437:1: rulePlusMinusElement : ( ( rule__PlusMinusElement__Group__0 ) ) ;
    public final void rulePlusMinusElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__PlusMinusElement__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__PlusMinusElement__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__PlusMinusElement__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__PlusMinusElement__Group__0 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__PlusMinusElement__Group__0 )
            // InternalDsl.g:444:4: rule__PlusMinusElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusMinusElement"


    // $ANTLR start "entryRuleMultiplicationDivisionElement"
    // InternalDsl.g:453:1: entryRuleMultiplicationDivisionElement : ruleMultiplicationDivisionElement EOF ;
    public final void entryRuleMultiplicationDivisionElement() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleMultiplicationDivisionElement EOF )
            // InternalDsl.g:455:1: ruleMultiplicationDivisionElement EOF
            {
             before(grammarAccess.getMultiplicationDivisionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicationDivisionElement"


    // $ANTLR start "ruleMultiplicationDivisionElement"
    // InternalDsl.g:462:1: ruleMultiplicationDivisionElement : ( ( rule__MultiplicationDivisionElement__Group__0 ) ) ;
    public final void ruleMultiplicationDivisionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__MultiplicationDivisionElement__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__MultiplicationDivisionElement__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__MultiplicationDivisionElement__Group__0 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__MultiplicationDivisionElement__Group__0 )
            // InternalDsl.g:469:4: rule__MultiplicationDivisionElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationDivisionElement"


    // $ANTLR start "entryRuleUnaryElement"
    // InternalDsl.g:478:1: entryRuleUnaryElement : ruleUnaryElement EOF ;
    public final void entryRuleUnaryElement() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleUnaryElement EOF )
            // InternalDsl.g:480:1: ruleUnaryElement EOF
            {
             before(grammarAccess.getUnaryElementRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getUnaryElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnaryElement"


    // $ANTLR start "ruleUnaryElement"
    // InternalDsl.g:487:1: ruleUnaryElement : ( ( rule__UnaryElement__Alternatives ) ) ;
    public final void ruleUnaryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__UnaryElement__Alternatives ) ) )
            // InternalDsl.g:492:2: ( ( rule__UnaryElement__Alternatives ) )
            {
            // InternalDsl.g:492:2: ( ( rule__UnaryElement__Alternatives ) )
            // InternalDsl.g:493:3: ( rule__UnaryElement__Alternatives )
            {
             before(grammarAccess.getUnaryElementAccess().getAlternatives()); 
            // InternalDsl.g:494:3: ( rule__UnaryElement__Alternatives )
            // InternalDsl.g:494:4: rule__UnaryElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryElement"


    // $ANTLR start "entryRuleLBRACE"
    // InternalDsl.g:503:1: entryRuleLBRACE : ruleLBRACE EOF ;
    public final void entryRuleLBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleLBRACE EOF )
            // InternalDsl.g:505:1: ruleLBRACE EOF
            {
             before(grammarAccess.getLBRACERule()); 
            pushFollow(FOLLOW_1);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getLBRACERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLBRACE"


    // $ANTLR start "ruleLBRACE"
    // InternalDsl.g:512:1: ruleLBRACE : ( '{' ) ;
    public final void ruleLBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( '{' ) )
            // InternalDsl.g:517:2: ( '{' )
            {
            // InternalDsl.g:517:2: ( '{' )
            // InternalDsl.g:518:3: '{'
            {
             before(grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLBRACEAccess().getLeftCurlyBracketKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLBRACE"


    // $ANTLR start "entryRuleRBRACE"
    // InternalDsl.g:528:1: entryRuleRBRACE : ruleRBRACE EOF ;
    public final void entryRuleRBRACE() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleRBRACE EOF )
            // InternalDsl.g:530:1: ruleRBRACE EOF
            {
             before(grammarAccess.getRBRACERule()); 
            pushFollow(FOLLOW_1);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getRBRACERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRBRACE"


    // $ANTLR start "ruleRBRACE"
    // InternalDsl.g:537:1: ruleRBRACE : ( '}' ) ;
    public final void ruleRBRACE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( '}' ) )
            // InternalDsl.g:542:2: ( '}' )
            {
            // InternalDsl.g:542:2: ( '}' )
            // InternalDsl.g:543:3: '}'
            {
             before(grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRBRACEAccess().getRightCurlyBracketKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRBRACE"


    // $ANTLR start "entryRuleNUMBER"
    // InternalDsl.g:553:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleNUMBER EOF )
            // InternalDsl.g:555:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalDsl.g:562:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // InternalDsl.g:567:2: ( ( rule__NUMBER__Alternatives ) )
            {
            // InternalDsl.g:567:2: ( ( rule__NUMBER__Alternatives ) )
            // InternalDsl.g:568:3: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // InternalDsl.g:569:3: ( rule__NUMBER__Alternatives )
            // InternalDsl.g:569:4: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "rule__Trigger__Alternatives_1"
    // InternalDsl.g:577:1: rule__Trigger__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__Trigger__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:581:1: ( ( 'is' ) | ( 'are' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:582:2: ( 'is' )
                    {
                    // InternalDsl.g:582:2: ( 'is' )
                    // InternalDsl.g:583:3: 'is'
                    {
                     before(grammarAccess.getTriggerAccess().getIsKeyword_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTriggerAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:588:2: ( 'are' )
                    {
                    // InternalDsl.g:588:2: ( 'are' )
                    // InternalDsl.g:589:3: 'are'
                    {
                     before(grammarAccess.getTriggerAccess().getAreKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTriggerAccess().getAreKeyword_1_1()); 

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
    // $ANTLR end "rule__Trigger__Alternatives_1"


    // $ANTLR start "rule__DiffEqualElement__Alternatives_1"
    // InternalDsl.g:598:1: rule__DiffEqualElement__Alternatives_1 : ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) );
    public final void rule__DiffEqualElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:602:1: ( ( ( rule__DiffEqualElement__Group_1_0__0 ) ) | ( ( rule__DiffEqualElement__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:603:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:603:2: ( ( rule__DiffEqualElement__Group_1_0__0 ) )
                    // InternalDsl.g:604:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:605:3: ( rule__DiffEqualElement__Group_1_0__0 )
                    // InternalDsl.g:605:4: rule__DiffEqualElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiffEqualElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDiffEqualElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:609:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:609:2: ( ( rule__DiffEqualElement__Group_1_1__0 ) )
                    // InternalDsl.g:610:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:611:3: ( rule__DiffEqualElement__Group_1_1__0 )
                    // InternalDsl.g:611:4: rule__DiffEqualElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiffEqualElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDiffEqualElementAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__DiffEqualElement__Alternatives_1"


    // $ANTLR start "rule__CompareElement__Alternatives_1"
    // InternalDsl.g:619:1: rule__CompareElement__Alternatives_1 : ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) );
    public final void rule__CompareElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:623:1: ( ( ( rule__CompareElement__Group_1_0__0 ) ) | ( ( rule__CompareElement__Group_1_1__0 ) ) | ( ( rule__CompareElement__Group_1_2__0 ) ) | ( ( rule__CompareElement__Group_1_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:624:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:624:2: ( ( rule__CompareElement__Group_1_0__0 ) )
                    // InternalDsl.g:625:3: ( rule__CompareElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:626:3: ( rule__CompareElement__Group_1_0__0 )
                    // InternalDsl.g:626:4: rule__CompareElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:630:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:630:2: ( ( rule__CompareElement__Group_1_1__0 ) )
                    // InternalDsl.g:631:3: ( rule__CompareElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:632:3: ( rule__CompareElement__Group_1_1__0 )
                    // InternalDsl.g:632:4: rule__CompareElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:636:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:636:2: ( ( rule__CompareElement__Group_1_2__0 ) )
                    // InternalDsl.g:637:3: ( rule__CompareElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:638:3: ( rule__CompareElement__Group_1_2__0 )
                    // InternalDsl.g:638:4: rule__CompareElement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:642:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    {
                    // InternalDsl.g:642:2: ( ( rule__CompareElement__Group_1_3__0 ) )
                    // InternalDsl.g:643:3: ( rule__CompareElement__Group_1_3__0 )
                    {
                     before(grammarAccess.getCompareElementAccess().getGroup_1_3()); 
                    // InternalDsl.g:644:3: ( rule__CompareElement__Group_1_3__0 )
                    // InternalDsl.g:644:4: rule__CompareElement__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompareElement__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareElementAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__CompareElement__Alternatives_1"


    // $ANTLR start "rule__PlusMinusElement__Alternatives_1"
    // InternalDsl.g:652:1: rule__PlusMinusElement__Alternatives_1 : ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) );
    public final void rule__PlusMinusElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:656:1: ( ( ( rule__PlusMinusElement__Group_1_0__0 ) ) | ( ( rule__PlusMinusElement__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:657:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:657:2: ( ( rule__PlusMinusElement__Group_1_0__0 ) )
                    // InternalDsl.g:658:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:659:3: ( rule__PlusMinusElement__Group_1_0__0 )
                    // InternalDsl.g:659:4: rule__PlusMinusElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinusElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:663:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:663:2: ( ( rule__PlusMinusElement__Group_1_1__0 ) )
                    // InternalDsl.g:664:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:665:3: ( rule__PlusMinusElement__Group_1_1__0 )
                    // InternalDsl.g:665:4: rule__PlusMinusElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinusElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusElementAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__PlusMinusElement__Alternatives_1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Alternatives_1"
    // InternalDsl.g:673:1: rule__MultiplicationDivisionElement__Alternatives_1 : ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) );
    public final void rule__MultiplicationDivisionElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:677:1: ( ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) ) | ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:678:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:678:2: ( ( rule__MultiplicationDivisionElement__Group_1_0__0 ) )
                    // InternalDsl.g:679:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 
                    // InternalDsl.g:680:3: ( rule__MultiplicationDivisionElement__Group_1_0__0 )
                    // InternalDsl.g:680:4: rule__MultiplicationDivisionElement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationDivisionElement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:684:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:684:2: ( ( rule__MultiplicationDivisionElement__Group_1_1__0 ) )
                    // InternalDsl.g:685:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 
                    // InternalDsl.g:686:3: ( rule__MultiplicationDivisionElement__Group_1_1__0 )
                    // InternalDsl.g:686:4: rule__MultiplicationDivisionElement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationDivisionElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:690:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:690:2: ( ( rule__MultiplicationDivisionElement__Group_1_2__0 ) )
                    // InternalDsl.g:691:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    {
                     before(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 
                    // InternalDsl.g:692:3: ( rule__MultiplicationDivisionElement__Group_1_2__0 )
                    // InternalDsl.g:692:4: rule__MultiplicationDivisionElement__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationDivisionElement__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationDivisionElementAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Alternatives_1"


    // $ANTLR start "rule__UnaryElement__Alternatives"
    // InternalDsl.g:700:1: rule__UnaryElement__Alternatives : ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) | ( ( rule__UnaryElement__Group_5__0 ) ) );
    public final void rule__UnaryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:704:1: ( ( ( rule__UnaryElement__Group_0__0 ) ) | ( ( rule__UnaryElement__Group_1__0 ) ) | ( ( rule__UnaryElement__Group_2__0 ) ) | ( ( rule__UnaryElement__Group_3__0 ) ) | ( ( rule__UnaryElement__Group_4__0 ) ) | ( ( rule__UnaryElement__Group_5__0 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==41) ) {
                    alt6=3;
                }
                else if ( (LA6_3==EOF||(LA6_3>=24 && LA6_3<=25)||(LA6_3>=29 && LA6_3<=40)||LA6_3==43) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt6=5;
                }
                break;
            case 44:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:705:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    {
                    // InternalDsl.g:705:2: ( ( rule__UnaryElement__Group_0__0 ) )
                    // InternalDsl.g:706:3: ( rule__UnaryElement__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_0()); 
                    // InternalDsl.g:707:3: ( rule__UnaryElement__Group_0__0 )
                    // InternalDsl.g:707:4: rule__UnaryElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:711:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    {
                    // InternalDsl.g:711:2: ( ( rule__UnaryElement__Group_1__0 ) )
                    // InternalDsl.g:712:3: ( rule__UnaryElement__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_1()); 
                    // InternalDsl.g:713:3: ( rule__UnaryElement__Group_1__0 )
                    // InternalDsl.g:713:4: rule__UnaryElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:717:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    {
                    // InternalDsl.g:717:2: ( ( rule__UnaryElement__Group_2__0 ) )
                    // InternalDsl.g:718:3: ( rule__UnaryElement__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_2()); 
                    // InternalDsl.g:719:3: ( rule__UnaryElement__Group_2__0 )
                    // InternalDsl.g:719:4: rule__UnaryElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:723:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    {
                    // InternalDsl.g:723:2: ( ( rule__UnaryElement__Group_3__0 ) )
                    // InternalDsl.g:724:3: ( rule__UnaryElement__Group_3__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_3()); 
                    // InternalDsl.g:725:3: ( rule__UnaryElement__Group_3__0 )
                    // InternalDsl.g:725:4: rule__UnaryElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:729:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    {
                    // InternalDsl.g:729:2: ( ( rule__UnaryElement__Group_4__0 ) )
                    // InternalDsl.g:730:3: ( rule__UnaryElement__Group_4__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_4()); 
                    // InternalDsl.g:731:3: ( rule__UnaryElement__Group_4__0 )
                    // InternalDsl.g:731:4: rule__UnaryElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:735:2: ( ( rule__UnaryElement__Group_5__0 ) )
                    {
                    // InternalDsl.g:735:2: ( ( rule__UnaryElement__Group_5__0 ) )
                    // InternalDsl.g:736:3: ( rule__UnaryElement__Group_5__0 )
                    {
                     before(grammarAccess.getUnaryElementAccess().getGroup_5()); 
                    // InternalDsl.g:737:3: ( rule__UnaryElement__Group_5__0 )
                    // InternalDsl.g:737:4: rule__UnaryElement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryElement__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryElementAccess().getGroup_5()); 

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
    // $ANTLR end "rule__UnaryElement__Alternatives"


    // $ANTLR start "rule__NUMBER__Alternatives"
    // InternalDsl.g:745:1: rule__NUMBER__Alternatives : ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:749:1: ( ( RULE_INT ) | ( ( rule__NUMBER__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=24 && LA7_1<=25)||(LA7_1>=29 && LA7_1<=40)||LA7_1==43) ) {
                    alt7=1;
                }
                else if ( (LA7_1==45) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:750:2: ( RULE_INT )
                    {
                    // InternalDsl.g:750:2: ( RULE_INT )
                    // InternalDsl.g:751:3: RULE_INT
                    {
                     before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:756:2: ( ( rule__NUMBER__Group_1__0 ) )
                    {
                    // InternalDsl.g:756:2: ( ( rule__NUMBER__Group_1__0 ) )
                    // InternalDsl.g:757:3: ( rule__NUMBER__Group_1__0 )
                    {
                     before(grammarAccess.getNUMBERAccess().getGroup_1()); 
                    // InternalDsl.g:758:3: ( rule__NUMBER__Group_1__0 )
                    // InternalDsl.g:758:4: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNUMBERAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__RunTimeModel__Group__0"
    // InternalDsl.g:766:1: rule__RunTimeModel__Group__0 : rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 ;
    public final void rule__RunTimeModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:770:1: ( rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1 )
            // InternalDsl.g:771:2: rule__RunTimeModel__Group__0__Impl rule__RunTimeModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RunTimeModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__1();

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
    // $ANTLR end "rule__RunTimeModel__Group__0"


    // $ANTLR start "rule__RunTimeModel__Group__0__Impl"
    // InternalDsl.g:778:1: rule__RunTimeModel__Group__0__Impl : ( () ) ;
    public final void rule__RunTimeModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:782:1: ( ( () ) )
            // InternalDsl.g:783:1: ( () )
            {
            // InternalDsl.g:783:1: ( () )
            // InternalDsl.g:784:2: ()
            {
             before(grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0()); 
            // InternalDsl.g:785:2: ()
            // InternalDsl.g:785:3: 
            {
            }

             after(grammarAccess.getRunTimeModelAccess().getRunTimeModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__0__Impl"


    // $ANTLR start "rule__RunTimeModel__Group__1"
    // InternalDsl.g:793:1: rule__RunTimeModel__Group__1 : rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 ;
    public final void rule__RunTimeModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:797:1: ( rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2 )
            // InternalDsl.g:798:2: rule__RunTimeModel__Group__1__Impl rule__RunTimeModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RunTimeModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__2();

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
    // $ANTLR end "rule__RunTimeModel__Group__1"


    // $ANTLR start "rule__RunTimeModel__Group__1__Impl"
    // InternalDsl.g:805:1: rule__RunTimeModel__Group__1__Impl : ( ( rule__RunTimeModel__EnvDataAssignment_1 ) ) ;
    public final void rule__RunTimeModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:809:1: ( ( ( rule__RunTimeModel__EnvDataAssignment_1 ) ) )
            // InternalDsl.g:810:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 ) )
            {
            // InternalDsl.g:810:1: ( ( rule__RunTimeModel__EnvDataAssignment_1 ) )
            // InternalDsl.g:811:2: ( rule__RunTimeModel__EnvDataAssignment_1 )
            {
             before(grammarAccess.getRunTimeModelAccess().getEnvDataAssignment_1()); 
            // InternalDsl.g:812:2: ( rule__RunTimeModel__EnvDataAssignment_1 )
            // InternalDsl.g:812:3: rule__RunTimeModel__EnvDataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__EnvDataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRunTimeModelAccess().getEnvDataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__1__Impl"


    // $ANTLR start "rule__RunTimeModel__Group__2"
    // InternalDsl.g:820:1: rule__RunTimeModel__Group__2 : rule__RunTimeModel__Group__2__Impl ;
    public final void rule__RunTimeModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:824:1: ( rule__RunTimeModel__Group__2__Impl )
            // InternalDsl.g:825:2: rule__RunTimeModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__Group__2__Impl();

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
    // $ANTLR end "rule__RunTimeModel__Group__2"


    // $ANTLR start "rule__RunTimeModel__Group__2__Impl"
    // InternalDsl.g:831:1: rule__RunTimeModel__Group__2__Impl : ( ( rule__RunTimeModel__AppDataAssignment_2 ) ) ;
    public final void rule__RunTimeModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:835:1: ( ( ( rule__RunTimeModel__AppDataAssignment_2 ) ) )
            // InternalDsl.g:836:1: ( ( rule__RunTimeModel__AppDataAssignment_2 ) )
            {
            // InternalDsl.g:836:1: ( ( rule__RunTimeModel__AppDataAssignment_2 ) )
            // InternalDsl.g:837:2: ( rule__RunTimeModel__AppDataAssignment_2 )
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAssignment_2()); 
            // InternalDsl.g:838:2: ( rule__RunTimeModel__AppDataAssignment_2 )
            // InternalDsl.g:838:3: rule__RunTimeModel__AppDataAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RunTimeModel__AppDataAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRunTimeModelAccess().getAppDataAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalDsl.g:847:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:851:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalDsl.g:852:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalDsl.g:859:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:863:1: ( ( 'resource' ) )
            // InternalDsl.g:864:1: ( 'resource' )
            {
            // InternalDsl.g:864:1: ( 'resource' )
            // InternalDsl.g:865:2: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalDsl.g:874:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:878:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalDsl.g:879:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalDsl.g:886:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:890:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalDsl.g:891:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalDsl.g:891:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalDsl.g:892:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalDsl.g:893:2: ( rule__Resource__NameAssignment_1 )
            // InternalDsl.g:893:3: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalDsl.g:901:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:905:1: ( rule__Resource__Group__2__Impl )
            // InternalDsl.g:906:2: rule__Resource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__2__Impl();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalDsl.g:912:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__Group_2__0 )? ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:916:1: ( ( ( rule__Resource__Group_2__0 )? ) )
            // InternalDsl.g:917:1: ( ( rule__Resource__Group_2__0 )? )
            {
            // InternalDsl.g:917:1: ( ( rule__Resource__Group_2__0 )? )
            // InternalDsl.g:918:2: ( rule__Resource__Group_2__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_2()); 
            // InternalDsl.g:919:2: ( rule__Resource__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:919:3: rule__Resource__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group_2__0"
    // InternalDsl.g:928:1: rule__Resource__Group_2__0 : rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1 ;
    public final void rule__Resource__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:932:1: ( rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1 )
            // InternalDsl.g:933:2: rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__1();

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
    // $ANTLR end "rule__Resource__Group_2__0"


    // $ANTLR start "rule__Resource__Group_2__0__Impl"
    // InternalDsl.g:940:1: rule__Resource__Group_2__0__Impl : ( 'can' ) ;
    public final void rule__Resource__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:944:1: ( ( 'can' ) )
            // InternalDsl.g:945:1: ( 'can' )
            {
            // InternalDsl.g:945:1: ( 'can' )
            // InternalDsl.g:946:2: 'can'
            {
             before(grammarAccess.getResourceAccess().getCanKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCanKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_2__0__Impl"


    // $ANTLR start "rule__Resource__Group_2__1"
    // InternalDsl.g:955:1: rule__Resource__Group_2__1 : rule__Resource__Group_2__1__Impl rule__Resource__Group_2__2 ;
    public final void rule__Resource__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:959:1: ( rule__Resource__Group_2__1__Impl rule__Resource__Group_2__2 )
            // InternalDsl.g:960:2: rule__Resource__Group_2__1__Impl rule__Resource__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__2();

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
    // $ANTLR end "rule__Resource__Group_2__1"


    // $ANTLR start "rule__Resource__Group_2__1__Impl"
    // InternalDsl.g:967:1: rule__Resource__Group_2__1__Impl : ( 'be' ) ;
    public final void rule__Resource__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:971:1: ( ( 'be' ) )
            // InternalDsl.g:972:1: ( 'be' )
            {
            // InternalDsl.g:972:1: ( 'be' )
            // InternalDsl.g:973:2: 'be'
            {
             before(grammarAccess.getResourceAccess().getBeKeyword_2_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getBeKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_2__1__Impl"


    // $ANTLR start "rule__Resource__Group_2__2"
    // InternalDsl.g:982:1: rule__Resource__Group_2__2 : rule__Resource__Group_2__2__Impl rule__Resource__Group_2__3 ;
    public final void rule__Resource__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:986:1: ( rule__Resource__Group_2__2__Impl rule__Resource__Group_2__3 )
            // InternalDsl.g:987:2: rule__Resource__Group_2__2__Impl rule__Resource__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Resource__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__3();

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
    // $ANTLR end "rule__Resource__Group_2__2"


    // $ANTLR start "rule__Resource__Group_2__2__Impl"
    // InternalDsl.g:994:1: rule__Resource__Group_2__2__Impl : ( ( rule__Resource__StatesAssignment_2_2 ) ) ;
    public final void rule__Resource__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:998:1: ( ( ( rule__Resource__StatesAssignment_2_2 ) ) )
            // InternalDsl.g:999:1: ( ( rule__Resource__StatesAssignment_2_2 ) )
            {
            // InternalDsl.g:999:1: ( ( rule__Resource__StatesAssignment_2_2 ) )
            // InternalDsl.g:1000:2: ( rule__Resource__StatesAssignment_2_2 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_2_2()); 
            // InternalDsl.g:1001:2: ( rule__Resource__StatesAssignment_2_2 )
            // InternalDsl.g:1001:3: rule__Resource__StatesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__StatesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getStatesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_2__2__Impl"


    // $ANTLR start "rule__Resource__Group_2__3"
    // InternalDsl.g:1009:1: rule__Resource__Group_2__3 : rule__Resource__Group_2__3__Impl ;
    public final void rule__Resource__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1013:1: ( rule__Resource__Group_2__3__Impl )
            // InternalDsl.g:1014:2: rule__Resource__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__3__Impl();

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
    // $ANTLR end "rule__Resource__Group_2__3"


    // $ANTLR start "rule__Resource__Group_2__3__Impl"
    // InternalDsl.g:1020:1: rule__Resource__Group_2__3__Impl : ( ( rule__Resource__Group_2_3__0 )* ) ;
    public final void rule__Resource__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1024:1: ( ( ( rule__Resource__Group_2_3__0 )* ) )
            // InternalDsl.g:1025:1: ( ( rule__Resource__Group_2_3__0 )* )
            {
            // InternalDsl.g:1025:1: ( ( rule__Resource__Group_2_3__0 )* )
            // InternalDsl.g:1026:2: ( rule__Resource__Group_2_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_2_3()); 
            // InternalDsl.g:1027:2: ( rule__Resource__Group_2_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1027:3: rule__Resource__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Resource__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_2__3__Impl"


    // $ANTLR start "rule__Resource__Group_2_3__0"
    // InternalDsl.g:1036:1: rule__Resource__Group_2_3__0 : rule__Resource__Group_2_3__0__Impl rule__Resource__Group_2_3__1 ;
    public final void rule__Resource__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1040:1: ( rule__Resource__Group_2_3__0__Impl rule__Resource__Group_2_3__1 )
            // InternalDsl.g:1041:2: rule__Resource__Group_2_3__0__Impl rule__Resource__Group_2_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_2_3__1();

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
    // $ANTLR end "rule__Resource__Group_2_3__0"


    // $ANTLR start "rule__Resource__Group_2_3__0__Impl"
    // InternalDsl.g:1048:1: rule__Resource__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1052:1: ( ( ',' ) )
            // InternalDsl.g:1053:1: ( ',' )
            {
            // InternalDsl.g:1053:1: ( ',' )
            // InternalDsl.g:1054:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_2_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_2_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_2_3__1"
    // InternalDsl.g:1063:1: rule__Resource__Group_2_3__1 : rule__Resource__Group_2_3__1__Impl ;
    public final void rule__Resource__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1067:1: ( rule__Resource__Group_2_3__1__Impl )
            // InternalDsl.g:1068:2: rule__Resource__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_2_3__1"


    // $ANTLR start "rule__Resource__Group_2_3__1__Impl"
    // InternalDsl.g:1074:1: rule__Resource__Group_2_3__1__Impl : ( ( rule__Resource__StatesAssignment_2_3_1 ) ) ;
    public final void rule__Resource__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1078:1: ( ( ( rule__Resource__StatesAssignment_2_3_1 ) ) )
            // InternalDsl.g:1079:1: ( ( rule__Resource__StatesAssignment_2_3_1 ) )
            {
            // InternalDsl.g:1079:1: ( ( rule__Resource__StatesAssignment_2_3_1 ) )
            // InternalDsl.g:1080:2: ( rule__Resource__StatesAssignment_2_3_1 )
            {
             before(grammarAccess.getResourceAccess().getStatesAssignment_2_3_1()); 
            // InternalDsl.g:1081:2: ( rule__Resource__StatesAssignment_2_3_1 )
            // InternalDsl.g:1081:3: rule__Resource__StatesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__StatesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getStatesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_2_3__1__Impl"


    // $ANTLR start "rule__AppMetaData__Group__0"
    // InternalDsl.g:1090:1: rule__AppMetaData__Group__0 : rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 ;
    public final void rule__AppMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1094:1: ( rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1 )
            // InternalDsl.g:1095:2: rule__AppMetaData__Group__0__Impl rule__AppMetaData__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AppMetaData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__1();

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
    // $ANTLR end "rule__AppMetaData__Group__0"


    // $ANTLR start "rule__AppMetaData__Group__0__Impl"
    // InternalDsl.g:1102:1: rule__AppMetaData__Group__0__Impl : ( 'app' ) ;
    public final void rule__AppMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1106:1: ( ( 'app' ) )
            // InternalDsl.g:1107:1: ( 'app' )
            {
            // InternalDsl.g:1107:1: ( 'app' )
            // InternalDsl.g:1108:2: 'app'
            {
             before(grammarAccess.getAppMetaDataAccess().getAppKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAppMetaDataAccess().getAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMetaData__Group__0__Impl"


    // $ANTLR start "rule__AppMetaData__Group__1"
    // InternalDsl.g:1117:1: rule__AppMetaData__Group__1 : rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 ;
    public final void rule__AppMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1121:1: ( rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2 )
            // InternalDsl.g:1122:2: rule__AppMetaData__Group__1__Impl rule__AppMetaData__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AppMetaData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__2();

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
    // $ANTLR end "rule__AppMetaData__Group__1"


    // $ANTLR start "rule__AppMetaData__Group__1__Impl"
    // InternalDsl.g:1129:1: rule__AppMetaData__Group__1__Impl : ( ( rule__AppMetaData__AppIDAssignment_1 ) ) ;
    public final void rule__AppMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1133:1: ( ( ( rule__AppMetaData__AppIDAssignment_1 ) ) )
            // InternalDsl.g:1134:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            {
            // InternalDsl.g:1134:1: ( ( rule__AppMetaData__AppIDAssignment_1 ) )
            // InternalDsl.g:1135:2: ( rule__AppMetaData__AppIDAssignment_1 )
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 
            // InternalDsl.g:1136:2: ( rule__AppMetaData__AppIDAssignment_1 )
            // InternalDsl.g:1136:3: rule__AppMetaData__AppIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__AppIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppMetaDataAccess().getAppIDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMetaData__Group__1__Impl"


    // $ANTLR start "rule__AppMetaData__Group__2"
    // InternalDsl.g:1144:1: rule__AppMetaData__Group__2 : rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 ;
    public final void rule__AppMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1148:1: ( rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3 )
            // InternalDsl.g:1149:2: rule__AppMetaData__Group__2__Impl rule__AppMetaData__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__AppMetaData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__3();

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
    // $ANTLR end "rule__AppMetaData__Group__2"


    // $ANTLR start "rule__AppMetaData__Group__2__Impl"
    // InternalDsl.g:1156:1: rule__AppMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__AppMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1160:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:1161:1: ( ruleLBRACE )
            {
            // InternalDsl.g:1161:1: ( ruleLBRACE )
            // InternalDsl.g:1162:2: ruleLBRACE
            {
             before(grammarAccess.getAppMetaDataAccess().getLBRACEParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getLBRACEParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMetaData__Group__2__Impl"


    // $ANTLR start "rule__AppMetaData__Group__3"
    // InternalDsl.g:1171:1: rule__AppMetaData__Group__3 : rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 ;
    public final void rule__AppMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1175:1: ( rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4 )
            // InternalDsl.g:1176:2: rule__AppMetaData__Group__3__Impl rule__AppMetaData__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__AppMetaData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__4();

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
    // $ANTLR end "rule__AppMetaData__Group__3"


    // $ANTLR start "rule__AppMetaData__Group__3__Impl"
    // InternalDsl.g:1183:1: rule__AppMetaData__Group__3__Impl : ( ( rule__AppMetaData__SpecificationAssignment_3 ) ) ;
    public final void rule__AppMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1187:1: ( ( ( rule__AppMetaData__SpecificationAssignment_3 ) ) )
            // InternalDsl.g:1188:1: ( ( rule__AppMetaData__SpecificationAssignment_3 ) )
            {
            // InternalDsl.g:1188:1: ( ( rule__AppMetaData__SpecificationAssignment_3 ) )
            // InternalDsl.g:1189:2: ( rule__AppMetaData__SpecificationAssignment_3 )
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationAssignment_3()); 
            // InternalDsl.g:1190:2: ( rule__AppMetaData__SpecificationAssignment_3 )
            // InternalDsl.g:1190:3: rule__AppMetaData__SpecificationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__SpecificationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAppMetaDataAccess().getSpecificationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMetaData__Group__3__Impl"


    // $ANTLR start "rule__AppMetaData__Group__4"
    // InternalDsl.g:1198:1: rule__AppMetaData__Group__4 : rule__AppMetaData__Group__4__Impl ;
    public final void rule__AppMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1202:1: ( rule__AppMetaData__Group__4__Impl )
            // InternalDsl.g:1203:2: rule__AppMetaData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppMetaData__Group__4__Impl();

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
    // $ANTLR end "rule__AppMetaData__Group__4"


    // $ANTLR start "rule__AppMetaData__Group__4__Impl"
    // InternalDsl.g:1209:1: rule__AppMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__AppMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1213:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:1214:1: ( ruleRBRACE )
            {
            // InternalDsl.g:1214:1: ( ruleRBRACE )
            // InternalDsl.g:1215:2: ruleRBRACE
            {
             before(grammarAccess.getAppMetaDataAccess().getRBRACEParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getRBRACEParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMetaData__Group__4__Impl"


    // $ANTLR start "rule__Specification__Group__0"
    // InternalDsl.g:1225:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1229:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalDsl.g:1230:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__1();

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
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // InternalDsl.g:1237:1: rule__Specification__Group__0__Impl : ( ( rule__Specification__SpecIDAssignment_0 )? ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1241:1: ( ( ( rule__Specification__SpecIDAssignment_0 )? ) )
            // InternalDsl.g:1242:1: ( ( rule__Specification__SpecIDAssignment_0 )? )
            {
            // InternalDsl.g:1242:1: ( ( rule__Specification__SpecIDAssignment_0 )? )
            // InternalDsl.g:1243:2: ( rule__Specification__SpecIDAssignment_0 )?
            {
             before(grammarAccess.getSpecificationAccess().getSpecIDAssignment_0()); 
            // InternalDsl.g:1244:2: ( rule__Specification__SpecIDAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1244:3: rule__Specification__SpecIDAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Specification__SpecIDAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getSpecIDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // InternalDsl.g:1252:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1256:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalDsl.g:1257:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__2();

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
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // InternalDsl.g:1264:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__Group_1__0 )? ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1268:1: ( ( ( rule__Specification__Group_1__0 )? ) )
            // InternalDsl.g:1269:1: ( ( rule__Specification__Group_1__0 )? )
            {
            // InternalDsl.g:1269:1: ( ( rule__Specification__Group_1__0 )? )
            // InternalDsl.g:1270:2: ( rule__Specification__Group_1__0 )?
            {
             before(grammarAccess.getSpecificationAccess().getGroup_1()); 
            // InternalDsl.g:1271:2: ( rule__Specification__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1271:3: rule__Specification__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Specification__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Specification__Group__2"
    // InternalDsl.g:1279:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1283:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalDsl.g:1284:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Specification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__3();

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
    // $ANTLR end "rule__Specification__Group__2"


    // $ANTLR start "rule__Specification__Group__2__Impl"
    // InternalDsl.g:1291:1: rule__Specification__Group__2__Impl : ( 'on' ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1295:1: ( ( 'on' ) )
            // InternalDsl.g:1296:1: ( 'on' )
            {
            // InternalDsl.g:1296:1: ( 'on' )
            // InternalDsl.g:1297:2: 'on'
            {
             before(grammarAccess.getSpecificationAccess().getOnKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getOnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2__Impl"


    // $ANTLR start "rule__Specification__Group__3"
    // InternalDsl.g:1306:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl rule__Specification__Group__4 ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1310:1: ( rule__Specification__Group__3__Impl rule__Specification__Group__4 )
            // InternalDsl.g:1311:2: rule__Specification__Group__3__Impl rule__Specification__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Specification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__4();

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
    // $ANTLR end "rule__Specification__Group__3"


    // $ANTLR start "rule__Specification__Group__3__Impl"
    // InternalDsl.g:1318:1: rule__Specification__Group__3__Impl : ( ( rule__Specification__TriggerAssignment_3 ) ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1322:1: ( ( ( rule__Specification__TriggerAssignment_3 ) ) )
            // InternalDsl.g:1323:1: ( ( rule__Specification__TriggerAssignment_3 ) )
            {
            // InternalDsl.g:1323:1: ( ( rule__Specification__TriggerAssignment_3 ) )
            // InternalDsl.g:1324:2: ( rule__Specification__TriggerAssignment_3 )
            {
             before(grammarAccess.getSpecificationAccess().getTriggerAssignment_3()); 
            // InternalDsl.g:1325:2: ( rule__Specification__TriggerAssignment_3 )
            // InternalDsl.g:1325:3: rule__Specification__TriggerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Specification__TriggerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getTriggerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__3__Impl"


    // $ANTLR start "rule__Specification__Group__4"
    // InternalDsl.g:1333:1: rule__Specification__Group__4 : rule__Specification__Group__4__Impl rule__Specification__Group__5 ;
    public final void rule__Specification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1337:1: ( rule__Specification__Group__4__Impl rule__Specification__Group__5 )
            // InternalDsl.g:1338:2: rule__Specification__Group__4__Impl rule__Specification__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Specification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__5();

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
    // $ANTLR end "rule__Specification__Group__4"


    // $ANTLR start "rule__Specification__Group__4__Impl"
    // InternalDsl.g:1345:1: rule__Specification__Group__4__Impl : ( ( rule__Specification__Group_4__0 )* ) ;
    public final void rule__Specification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1349:1: ( ( ( rule__Specification__Group_4__0 )* ) )
            // InternalDsl.g:1350:1: ( ( rule__Specification__Group_4__0 )* )
            {
            // InternalDsl.g:1350:1: ( ( rule__Specification__Group_4__0 )* )
            // InternalDsl.g:1351:2: ( rule__Specification__Group_4__0 )*
            {
             before(grammarAccess.getSpecificationAccess().getGroup_4()); 
            // InternalDsl.g:1352:2: ( rule__Specification__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1352:3: rule__Specification__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Specification__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__4__Impl"


    // $ANTLR start "rule__Specification__Group__5"
    // InternalDsl.g:1360:1: rule__Specification__Group__5 : rule__Specification__Group__5__Impl rule__Specification__Group__6 ;
    public final void rule__Specification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1364:1: ( rule__Specification__Group__5__Impl rule__Specification__Group__6 )
            // InternalDsl.g:1365:2: rule__Specification__Group__5__Impl rule__Specification__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Specification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__6();

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
    // $ANTLR end "rule__Specification__Group__5"


    // $ANTLR start "rule__Specification__Group__5__Impl"
    // InternalDsl.g:1372:1: rule__Specification__Group__5__Impl : ( ( rule__Specification__IfdoAssignment_5 ) ) ;
    public final void rule__Specification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1376:1: ( ( ( rule__Specification__IfdoAssignment_5 ) ) )
            // InternalDsl.g:1377:1: ( ( rule__Specification__IfdoAssignment_5 ) )
            {
            // InternalDsl.g:1377:1: ( ( rule__Specification__IfdoAssignment_5 ) )
            // InternalDsl.g:1378:2: ( rule__Specification__IfdoAssignment_5 )
            {
             before(grammarAccess.getSpecificationAccess().getIfdoAssignment_5()); 
            // InternalDsl.g:1379:2: ( rule__Specification__IfdoAssignment_5 )
            // InternalDsl.g:1379:3: rule__Specification__IfdoAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Specification__IfdoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getIfdoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__5__Impl"


    // $ANTLR start "rule__Specification__Group__6"
    // InternalDsl.g:1387:1: rule__Specification__Group__6 : rule__Specification__Group__6__Impl rule__Specification__Group__7 ;
    public final void rule__Specification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1391:1: ( rule__Specification__Group__6__Impl rule__Specification__Group__7 )
            // InternalDsl.g:1392:2: rule__Specification__Group__6__Impl rule__Specification__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Specification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__7();

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
    // $ANTLR end "rule__Specification__Group__6"


    // $ANTLR start "rule__Specification__Group__6__Impl"
    // InternalDsl.g:1399:1: rule__Specification__Group__6__Impl : ( ( rule__Specification__ElseIfDoAssignment_6 )* ) ;
    public final void rule__Specification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1403:1: ( ( ( rule__Specification__ElseIfDoAssignment_6 )* ) )
            // InternalDsl.g:1404:1: ( ( rule__Specification__ElseIfDoAssignment_6 )* )
            {
            // InternalDsl.g:1404:1: ( ( rule__Specification__ElseIfDoAssignment_6 )* )
            // InternalDsl.g:1405:2: ( rule__Specification__ElseIfDoAssignment_6 )*
            {
             before(grammarAccess.getSpecificationAccess().getElseIfDoAssignment_6()); 
            // InternalDsl.g:1406:2: ( rule__Specification__ElseIfDoAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==23) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1406:3: rule__Specification__ElseIfDoAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Specification__ElseIfDoAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpecificationAccess().getElseIfDoAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__6__Impl"


    // $ANTLR start "rule__Specification__Group__7"
    // InternalDsl.g:1414:1: rule__Specification__Group__7 : rule__Specification__Group__7__Impl ;
    public final void rule__Specification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1418:1: ( rule__Specification__Group__7__Impl )
            // InternalDsl.g:1419:2: rule__Specification__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__7__Impl();

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
    // $ANTLR end "rule__Specification__Group__7"


    // $ANTLR start "rule__Specification__Group__7__Impl"
    // InternalDsl.g:1425:1: rule__Specification__Group__7__Impl : ( ( rule__Specification__ElseDoAssignment_7 )? ) ;
    public final void rule__Specification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1429:1: ( ( ( rule__Specification__ElseDoAssignment_7 )? ) )
            // InternalDsl.g:1430:1: ( ( rule__Specification__ElseDoAssignment_7 )? )
            {
            // InternalDsl.g:1430:1: ( ( rule__Specification__ElseDoAssignment_7 )? )
            // InternalDsl.g:1431:2: ( rule__Specification__ElseDoAssignment_7 )?
            {
             before(grammarAccess.getSpecificationAccess().getElseDoAssignment_7()); 
            // InternalDsl.g:1432:2: ( rule__Specification__ElseDoAssignment_7 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1432:3: rule__Specification__ElseDoAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Specification__ElseDoAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecificationAccess().getElseDoAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__7__Impl"


    // $ANTLR start "rule__Specification__Group_1__0"
    // InternalDsl.g:1441:1: rule__Specification__Group_1__0 : rule__Specification__Group_1__0__Impl rule__Specification__Group_1__1 ;
    public final void rule__Specification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1445:1: ( rule__Specification__Group_1__0__Impl rule__Specification__Group_1__1 )
            // InternalDsl.g:1446:2: rule__Specification__Group_1__0__Impl rule__Specification__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Specification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group_1__1();

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
    // $ANTLR end "rule__Specification__Group_1__0"


    // $ANTLR start "rule__Specification__Group_1__0__Impl"
    // InternalDsl.g:1453:1: rule__Specification__Group_1__0__Impl : ( 'priority' ) ;
    public final void rule__Specification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1457:1: ( ( 'priority' ) )
            // InternalDsl.g:1458:1: ( 'priority' )
            {
            // InternalDsl.g:1458:1: ( 'priority' )
            // InternalDsl.g:1459:2: 'priority'
            {
             before(grammarAccess.getSpecificationAccess().getPriorityKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getPriorityKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_1__0__Impl"


    // $ANTLR start "rule__Specification__Group_1__1"
    // InternalDsl.g:1468:1: rule__Specification__Group_1__1 : rule__Specification__Group_1__1__Impl ;
    public final void rule__Specification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1472:1: ( rule__Specification__Group_1__1__Impl )
            // InternalDsl.g:1473:2: rule__Specification__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group_1__1__Impl();

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
    // $ANTLR end "rule__Specification__Group_1__1"


    // $ANTLR start "rule__Specification__Group_1__1__Impl"
    // InternalDsl.g:1479:1: rule__Specification__Group_1__1__Impl : ( ( rule__Specification__PriorityAssignment_1_1 ) ) ;
    public final void rule__Specification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1483:1: ( ( ( rule__Specification__PriorityAssignment_1_1 ) ) )
            // InternalDsl.g:1484:1: ( ( rule__Specification__PriorityAssignment_1_1 ) )
            {
            // InternalDsl.g:1484:1: ( ( rule__Specification__PriorityAssignment_1_1 ) )
            // InternalDsl.g:1485:2: ( rule__Specification__PriorityAssignment_1_1 )
            {
             before(grammarAccess.getSpecificationAccess().getPriorityAssignment_1_1()); 
            // InternalDsl.g:1486:2: ( rule__Specification__PriorityAssignment_1_1 )
            // InternalDsl.g:1486:3: rule__Specification__PriorityAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Specification__PriorityAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getPriorityAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_1__1__Impl"


    // $ANTLR start "rule__Specification__Group_4__0"
    // InternalDsl.g:1495:1: rule__Specification__Group_4__0 : rule__Specification__Group_4__0__Impl rule__Specification__Group_4__1 ;
    public final void rule__Specification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1499:1: ( rule__Specification__Group_4__0__Impl rule__Specification__Group_4__1 )
            // InternalDsl.g:1500:2: rule__Specification__Group_4__0__Impl rule__Specification__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Specification__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group_4__1();

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
    // $ANTLR end "rule__Specification__Group_4__0"


    // $ANTLR start "rule__Specification__Group_4__0__Impl"
    // InternalDsl.g:1507:1: rule__Specification__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Specification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1511:1: ( ( ',' ) )
            // InternalDsl.g:1512:1: ( ',' )
            {
            // InternalDsl.g:1512:1: ( ',' )
            // InternalDsl.g:1513:2: ','
            {
             before(grammarAccess.getSpecificationAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__0__Impl"


    // $ANTLR start "rule__Specification__Group_4__1"
    // InternalDsl.g:1522:1: rule__Specification__Group_4__1 : rule__Specification__Group_4__1__Impl ;
    public final void rule__Specification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1526:1: ( rule__Specification__Group_4__1__Impl )
            // InternalDsl.g:1527:2: rule__Specification__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group_4__1__Impl();

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
    // $ANTLR end "rule__Specification__Group_4__1"


    // $ANTLR start "rule__Specification__Group_4__1__Impl"
    // InternalDsl.g:1533:1: rule__Specification__Group_4__1__Impl : ( ( rule__Specification__TriggerAssignment_4_1 ) ) ;
    public final void rule__Specification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1537:1: ( ( ( rule__Specification__TriggerAssignment_4_1 ) ) )
            // InternalDsl.g:1538:1: ( ( rule__Specification__TriggerAssignment_4_1 ) )
            {
            // InternalDsl.g:1538:1: ( ( rule__Specification__TriggerAssignment_4_1 ) )
            // InternalDsl.g:1539:2: ( rule__Specification__TriggerAssignment_4_1 )
            {
             before(grammarAccess.getSpecificationAccess().getTriggerAssignment_4_1()); 
            // InternalDsl.g:1540:2: ( rule__Specification__TriggerAssignment_4_1 )
            // InternalDsl.g:1540:3: rule__Specification__TriggerAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Specification__TriggerAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getTriggerAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group_4__1__Impl"


    // $ANTLR start "rule__Trigger__Group__0"
    // InternalDsl.g:1549:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1553:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // InternalDsl.g:1554:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__1();

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
    // $ANTLR end "rule__Trigger__Group__0"


    // $ANTLR start "rule__Trigger__Group__0__Impl"
    // InternalDsl.g:1561:1: rule__Trigger__Group__0__Impl : ( ( rule__Trigger__ResourceAssignment_0 ) ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1565:1: ( ( ( rule__Trigger__ResourceAssignment_0 ) ) )
            // InternalDsl.g:1566:1: ( ( rule__Trigger__ResourceAssignment_0 ) )
            {
            // InternalDsl.g:1566:1: ( ( rule__Trigger__ResourceAssignment_0 ) )
            // InternalDsl.g:1567:2: ( rule__Trigger__ResourceAssignment_0 )
            {
             before(grammarAccess.getTriggerAccess().getResourceAssignment_0()); 
            // InternalDsl.g:1568:2: ( rule__Trigger__ResourceAssignment_0 )
            // InternalDsl.g:1568:3: rule__Trigger__ResourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getResourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0__Impl"


    // $ANTLR start "rule__Trigger__Group__1"
    // InternalDsl.g:1576:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl rule__Trigger__Group__2 ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1580:1: ( rule__Trigger__Group__1__Impl rule__Trigger__Group__2 )
            // InternalDsl.g:1581:2: rule__Trigger__Group__1__Impl rule__Trigger__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Trigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigger__Group__2();

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
    // $ANTLR end "rule__Trigger__Group__1"


    // $ANTLR start "rule__Trigger__Group__1__Impl"
    // InternalDsl.g:1588:1: rule__Trigger__Group__1__Impl : ( ( rule__Trigger__Alternatives_1 ) ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1592:1: ( ( ( rule__Trigger__Alternatives_1 ) ) )
            // InternalDsl.g:1593:1: ( ( rule__Trigger__Alternatives_1 ) )
            {
            // InternalDsl.g:1593:1: ( ( rule__Trigger__Alternatives_1 ) )
            // InternalDsl.g:1594:2: ( rule__Trigger__Alternatives_1 )
            {
             before(grammarAccess.getTriggerAccess().getAlternatives_1()); 
            // InternalDsl.g:1595:2: ( rule__Trigger__Alternatives_1 )
            // InternalDsl.g:1595:3: rule__Trigger__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__1__Impl"


    // $ANTLR start "rule__Trigger__Group__2"
    // InternalDsl.g:1603:1: rule__Trigger__Group__2 : rule__Trigger__Group__2__Impl ;
    public final void rule__Trigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1607:1: ( rule__Trigger__Group__2__Impl )
            // InternalDsl.g:1608:2: rule__Trigger__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__Group__2__Impl();

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
    // $ANTLR end "rule__Trigger__Group__2"


    // $ANTLR start "rule__Trigger__Group__2__Impl"
    // InternalDsl.g:1614:1: rule__Trigger__Group__2__Impl : ( ( rule__Trigger__StateAssignment_2 ) ) ;
    public final void rule__Trigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1618:1: ( ( ( rule__Trigger__StateAssignment_2 ) ) )
            // InternalDsl.g:1619:1: ( ( rule__Trigger__StateAssignment_2 ) )
            {
            // InternalDsl.g:1619:1: ( ( rule__Trigger__StateAssignment_2 ) )
            // InternalDsl.g:1620:2: ( rule__Trigger__StateAssignment_2 )
            {
             before(grammarAccess.getTriggerAccess().getStateAssignment_2()); 
            // InternalDsl.g:1621:2: ( rule__Trigger__StateAssignment_2 )
            // InternalDsl.g:1621:3: rule__Trigger__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Trigger__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__2__Impl"


    // $ANTLR start "rule__IfDoSpec__Group__0"
    // InternalDsl.g:1630:1: rule__IfDoSpec__Group__0 : rule__IfDoSpec__Group__0__Impl rule__IfDoSpec__Group__1 ;
    public final void rule__IfDoSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1634:1: ( rule__IfDoSpec__Group__0__Impl rule__IfDoSpec__Group__1 )
            // InternalDsl.g:1635:2: rule__IfDoSpec__Group__0__Impl rule__IfDoSpec__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__IfDoSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group__1();

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
    // $ANTLR end "rule__IfDoSpec__Group__0"


    // $ANTLR start "rule__IfDoSpec__Group__0__Impl"
    // InternalDsl.g:1642:1: rule__IfDoSpec__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfDoSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1646:1: ( ( 'if' ) )
            // InternalDsl.g:1647:1: ( 'if' )
            {
            // InternalDsl.g:1647:1: ( 'if' )
            // InternalDsl.g:1648:2: 'if'
            {
             before(grammarAccess.getIfDoSpecAccess().getIfKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIfDoSpecAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__Group__0__Impl"


    // $ANTLR start "rule__IfDoSpec__Group__1"
    // InternalDsl.g:1657:1: rule__IfDoSpec__Group__1 : rule__IfDoSpec__Group__1__Impl rule__IfDoSpec__Group__2 ;
    public final void rule__IfDoSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1661:1: ( rule__IfDoSpec__Group__1__Impl rule__IfDoSpec__Group__2 )
            // InternalDsl.g:1662:2: rule__IfDoSpec__Group__1__Impl rule__IfDoSpec__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__IfDoSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group__2();

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
    // $ANTLR end "rule__IfDoSpec__Group__1"


    // $ANTLR start "rule__IfDoSpec__Group__1__Impl"
    // InternalDsl.g:1669:1: rule__IfDoSpec__Group__1__Impl : ( ( rule__IfDoSpec__ConditionAssignment_1 ) ) ;
    public final void rule__IfDoSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1673:1: ( ( ( rule__IfDoSpec__ConditionAssignment_1 ) ) )
            // InternalDsl.g:1674:1: ( ( rule__IfDoSpec__ConditionAssignment_1 ) )
            {
            // InternalDsl.g:1674:1: ( ( rule__IfDoSpec__ConditionAssignment_1 ) )
            // InternalDsl.g:1675:2: ( rule__IfDoSpec__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfDoSpecAccess().getConditionAssignment_1()); 
            // InternalDsl.g:1676:2: ( rule__IfDoSpec__ConditionAssignment_1 )
            // InternalDsl.g:1676:3: rule__IfDoSpec__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfDoSpec__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfDoSpecAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__Group__1__Impl"


    // $ANTLR start "rule__IfDoSpec__Group__2"
    // InternalDsl.g:1684:1: rule__IfDoSpec__Group__2 : rule__IfDoSpec__Group__2__Impl rule__IfDoSpec__Group__3 ;
    public final void rule__IfDoSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1688:1: ( rule__IfDoSpec__Group__2__Impl rule__IfDoSpec__Group__3 )
            // InternalDsl.g:1689:2: rule__IfDoSpec__Group__2__Impl rule__IfDoSpec__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IfDoSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group__3();

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
    // $ANTLR end "rule__IfDoSpec__Group__2"


    // $ANTLR start "rule__IfDoSpec__Group__2__Impl"
    // InternalDsl.g:1696:1: rule__IfDoSpec__Group__2__Impl : ( 'do' ) ;
    public final void rule__IfDoSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1700:1: ( ( 'do' ) )
            // InternalDsl.g:1701:1: ( 'do' )
            {
            // InternalDsl.g:1701:1: ( 'do' )
            // InternalDsl.g:1702:2: 'do'
            {
             before(grammarAccess.getIfDoSpecAccess().getDoKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIfDoSpecAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__Group__2__Impl"


    // $ANTLR start "rule__IfDoSpec__Group__3"
    // InternalDsl.g:1711:1: rule__IfDoSpec__Group__3 : rule__IfDoSpec__Group__3__Impl rule__IfDoSpec__Group__4 ;
    public final void rule__IfDoSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1715:1: ( rule__IfDoSpec__Group__3__Impl rule__IfDoSpec__Group__4 )
            // InternalDsl.g:1716:2: rule__IfDoSpec__Group__3__Impl rule__IfDoSpec__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__IfDoSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group__4();

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
    // $ANTLR end "rule__IfDoSpec__Group__3"


    // $ANTLR start "rule__IfDoSpec__Group__3__Impl"
    // InternalDsl.g:1723:1: rule__IfDoSpec__Group__3__Impl : ( ( rule__IfDoSpec__ActionAssignment_3 ) ) ;
    public final void rule__IfDoSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1727:1: ( ( ( rule__IfDoSpec__ActionAssignment_3 ) ) )
            // InternalDsl.g:1728:1: ( ( rule__IfDoSpec__ActionAssignment_3 ) )
            {
            // InternalDsl.g:1728:1: ( ( rule__IfDoSpec__ActionAssignment_3 ) )
            // InternalDsl.g:1729:2: ( rule__IfDoSpec__ActionAssignment_3 )
            {
             before(grammarAccess.getIfDoSpecAccess().getActionAssignment_3()); 
            // InternalDsl.g:1730:2: ( rule__IfDoSpec__ActionAssignment_3 )
            // InternalDsl.g:1730:3: rule__IfDoSpec__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfDoSpec__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfDoSpecAccess().getActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__Group__3__Impl"


    // $ANTLR start "rule__IfDoSpec__Group__4"
    // InternalDsl.g:1738:1: rule__IfDoSpec__Group__4 : rule__IfDoSpec__Group__4__Impl ;
    public final void rule__IfDoSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1742:1: ( rule__IfDoSpec__Group__4__Impl )
            // InternalDsl.g:1743:2: rule__IfDoSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group__4__Impl();

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
    // $ANTLR end "rule__IfDoSpec__Group__4"


    // $ANTLR start "rule__IfDoSpec__Group__4__Impl"
    // InternalDsl.g:1749:1: rule__IfDoSpec__Group__4__Impl : ( ( rule__IfDoSpec__Group_4__0 )* ) ;
    public final void rule__IfDoSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1753:1: ( ( ( rule__IfDoSpec__Group_4__0 )* ) )
            // InternalDsl.g:1754:1: ( ( rule__IfDoSpec__Group_4__0 )* )
            {
            // InternalDsl.g:1754:1: ( ( rule__IfDoSpec__Group_4__0 )* )
            // InternalDsl.g:1755:2: ( rule__IfDoSpec__Group_4__0 )*
            {
             before(grammarAccess.getIfDoSpecAccess().getGroup_4()); 
            // InternalDsl.g:1756:2: ( rule__IfDoSpec__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:1756:3: rule__IfDoSpec__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__IfDoSpec__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIfDoSpecAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__Group__4__Impl"


    // $ANTLR start "rule__IfDoSpec__Group_4__0"
    // InternalDsl.g:1765:1: rule__IfDoSpec__Group_4__0 : rule__IfDoSpec__Group_4__0__Impl rule__IfDoSpec__Group_4__1 ;
    public final void rule__IfDoSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1769:1: ( rule__IfDoSpec__Group_4__0__Impl rule__IfDoSpec__Group_4__1 )
            // InternalDsl.g:1770:2: rule__IfDoSpec__Group_4__0__Impl rule__IfDoSpec__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__IfDoSpec__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group_4__1();

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
    // $ANTLR end "rule__IfDoSpec__Group_4__0"


    // $ANTLR start "rule__IfDoSpec__Group_4__0__Impl"
    // InternalDsl.g:1777:1: rule__IfDoSpec__Group_4__0__Impl : ( 'and' ) ;
    public final void rule__IfDoSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1781:1: ( ( 'and' ) )
            // InternalDsl.g:1782:1: ( 'and' )
            {
            // InternalDsl.g:1782:1: ( 'and' )
            // InternalDsl.g:1783:2: 'and'
            {
             before(grammarAccess.getIfDoSpecAccess().getAndKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIfDoSpecAccess().getAndKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__Group_4__0__Impl"


    // $ANTLR start "rule__IfDoSpec__Group_4__1"
    // InternalDsl.g:1792:1: rule__IfDoSpec__Group_4__1 : rule__IfDoSpec__Group_4__1__Impl ;
    public final void rule__IfDoSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1796:1: ( rule__IfDoSpec__Group_4__1__Impl )
            // InternalDsl.g:1797:2: rule__IfDoSpec__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfDoSpec__Group_4__1__Impl();

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
    // $ANTLR end "rule__IfDoSpec__Group_4__1"


    // $ANTLR start "rule__IfDoSpec__Group_4__1__Impl"
    // InternalDsl.g:1803:1: rule__IfDoSpec__Group_4__1__Impl : ( ( rule__IfDoSpec__ActionAssignment_4_1 ) ) ;
    public final void rule__IfDoSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1807:1: ( ( ( rule__IfDoSpec__ActionAssignment_4_1 ) ) )
            // InternalDsl.g:1808:1: ( ( rule__IfDoSpec__ActionAssignment_4_1 ) )
            {
            // InternalDsl.g:1808:1: ( ( rule__IfDoSpec__ActionAssignment_4_1 ) )
            // InternalDsl.g:1809:2: ( rule__IfDoSpec__ActionAssignment_4_1 )
            {
             before(grammarAccess.getIfDoSpecAccess().getActionAssignment_4_1()); 
            // InternalDsl.g:1810:2: ( rule__IfDoSpec__ActionAssignment_4_1 )
            // InternalDsl.g:1810:3: rule__IfDoSpec__ActionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IfDoSpec__ActionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIfDoSpecAccess().getActionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__Group_4__1__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group__0"
    // InternalDsl.g:1819:1: rule__ElseIfDoSpec__Group__0 : rule__ElseIfDoSpec__Group__0__Impl rule__ElseIfDoSpec__Group__1 ;
    public final void rule__ElseIfDoSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1823:1: ( rule__ElseIfDoSpec__Group__0__Impl rule__ElseIfDoSpec__Group__1 )
            // InternalDsl.g:1824:2: rule__ElseIfDoSpec__Group__0__Impl rule__ElseIfDoSpec__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ElseIfDoSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group__1();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group__0"


    // $ANTLR start "rule__ElseIfDoSpec__Group__0__Impl"
    // InternalDsl.g:1831:1: rule__ElseIfDoSpec__Group__0__Impl : ( 'else' ) ;
    public final void rule__ElseIfDoSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1835:1: ( ( 'else' ) )
            // InternalDsl.g:1836:1: ( 'else' )
            {
            // InternalDsl.g:1836:1: ( 'else' )
            // InternalDsl.g:1837:2: 'else'
            {
             before(grammarAccess.getElseIfDoSpecAccess().getElseKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElseIfDoSpecAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group__0__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group__1"
    // InternalDsl.g:1846:1: rule__ElseIfDoSpec__Group__1 : rule__ElseIfDoSpec__Group__1__Impl rule__ElseIfDoSpec__Group__2 ;
    public final void rule__ElseIfDoSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1850:1: ( rule__ElseIfDoSpec__Group__1__Impl rule__ElseIfDoSpec__Group__2 )
            // InternalDsl.g:1851:2: rule__ElseIfDoSpec__Group__1__Impl rule__ElseIfDoSpec__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ElseIfDoSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group__2();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group__1"


    // $ANTLR start "rule__ElseIfDoSpec__Group__1__Impl"
    // InternalDsl.g:1858:1: rule__ElseIfDoSpec__Group__1__Impl : ( 'if' ) ;
    public final void rule__ElseIfDoSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1862:1: ( ( 'if' ) )
            // InternalDsl.g:1863:1: ( 'if' )
            {
            // InternalDsl.g:1863:1: ( 'if' )
            // InternalDsl.g:1864:2: 'if'
            {
             before(grammarAccess.getElseIfDoSpecAccess().getIfKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getElseIfDoSpecAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group__1__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group__2"
    // InternalDsl.g:1873:1: rule__ElseIfDoSpec__Group__2 : rule__ElseIfDoSpec__Group__2__Impl rule__ElseIfDoSpec__Group__3 ;
    public final void rule__ElseIfDoSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1877:1: ( rule__ElseIfDoSpec__Group__2__Impl rule__ElseIfDoSpec__Group__3 )
            // InternalDsl.g:1878:2: rule__ElseIfDoSpec__Group__2__Impl rule__ElseIfDoSpec__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ElseIfDoSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group__3();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group__2"


    // $ANTLR start "rule__ElseIfDoSpec__Group__2__Impl"
    // InternalDsl.g:1885:1: rule__ElseIfDoSpec__Group__2__Impl : ( ( rule__ElseIfDoSpec__ConditionAssignment_2 ) ) ;
    public final void rule__ElseIfDoSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1889:1: ( ( ( rule__ElseIfDoSpec__ConditionAssignment_2 ) ) )
            // InternalDsl.g:1890:1: ( ( rule__ElseIfDoSpec__ConditionAssignment_2 ) )
            {
            // InternalDsl.g:1890:1: ( ( rule__ElseIfDoSpec__ConditionAssignment_2 ) )
            // InternalDsl.g:1891:2: ( rule__ElseIfDoSpec__ConditionAssignment_2 )
            {
             before(grammarAccess.getElseIfDoSpecAccess().getConditionAssignment_2()); 
            // InternalDsl.g:1892:2: ( rule__ElseIfDoSpec__ConditionAssignment_2 )
            // InternalDsl.g:1892:3: rule__ElseIfDoSpec__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseIfDoSpecAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group__2__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group__3"
    // InternalDsl.g:1900:1: rule__ElseIfDoSpec__Group__3 : rule__ElseIfDoSpec__Group__3__Impl rule__ElseIfDoSpec__Group__4 ;
    public final void rule__ElseIfDoSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1904:1: ( rule__ElseIfDoSpec__Group__3__Impl rule__ElseIfDoSpec__Group__4 )
            // InternalDsl.g:1905:2: rule__ElseIfDoSpec__Group__3__Impl rule__ElseIfDoSpec__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ElseIfDoSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group__4();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group__3"


    // $ANTLR start "rule__ElseIfDoSpec__Group__3__Impl"
    // InternalDsl.g:1912:1: rule__ElseIfDoSpec__Group__3__Impl : ( 'do' ) ;
    public final void rule__ElseIfDoSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1916:1: ( ( 'do' ) )
            // InternalDsl.g:1917:1: ( 'do' )
            {
            // InternalDsl.g:1917:1: ( 'do' )
            // InternalDsl.g:1918:2: 'do'
            {
             before(grammarAccess.getElseIfDoSpecAccess().getDoKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getElseIfDoSpecAccess().getDoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group__3__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group__4"
    // InternalDsl.g:1927:1: rule__ElseIfDoSpec__Group__4 : rule__ElseIfDoSpec__Group__4__Impl rule__ElseIfDoSpec__Group__5 ;
    public final void rule__ElseIfDoSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1931:1: ( rule__ElseIfDoSpec__Group__4__Impl rule__ElseIfDoSpec__Group__5 )
            // InternalDsl.g:1932:2: rule__ElseIfDoSpec__Group__4__Impl rule__ElseIfDoSpec__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ElseIfDoSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group__5();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group__4"


    // $ANTLR start "rule__ElseIfDoSpec__Group__4__Impl"
    // InternalDsl.g:1939:1: rule__ElseIfDoSpec__Group__4__Impl : ( ( rule__ElseIfDoSpec__ActionAssignment_4 ) ) ;
    public final void rule__ElseIfDoSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1943:1: ( ( ( rule__ElseIfDoSpec__ActionAssignment_4 ) ) )
            // InternalDsl.g:1944:1: ( ( rule__ElseIfDoSpec__ActionAssignment_4 ) )
            {
            // InternalDsl.g:1944:1: ( ( rule__ElseIfDoSpec__ActionAssignment_4 ) )
            // InternalDsl.g:1945:2: ( rule__ElseIfDoSpec__ActionAssignment_4 )
            {
             before(grammarAccess.getElseIfDoSpecAccess().getActionAssignment_4()); 
            // InternalDsl.g:1946:2: ( rule__ElseIfDoSpec__ActionAssignment_4 )
            // InternalDsl.g:1946:3: rule__ElseIfDoSpec__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElseIfDoSpecAccess().getActionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group__4__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group__5"
    // InternalDsl.g:1954:1: rule__ElseIfDoSpec__Group__5 : rule__ElseIfDoSpec__Group__5__Impl ;
    public final void rule__ElseIfDoSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1958:1: ( rule__ElseIfDoSpec__Group__5__Impl )
            // InternalDsl.g:1959:2: rule__ElseIfDoSpec__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group__5__Impl();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group__5"


    // $ANTLR start "rule__ElseIfDoSpec__Group__5__Impl"
    // InternalDsl.g:1965:1: rule__ElseIfDoSpec__Group__5__Impl : ( ( rule__ElseIfDoSpec__Group_5__0 )* ) ;
    public final void rule__ElseIfDoSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1969:1: ( ( ( rule__ElseIfDoSpec__Group_5__0 )* ) )
            // InternalDsl.g:1970:1: ( ( rule__ElseIfDoSpec__Group_5__0 )* )
            {
            // InternalDsl.g:1970:1: ( ( rule__ElseIfDoSpec__Group_5__0 )* )
            // InternalDsl.g:1971:2: ( rule__ElseIfDoSpec__Group_5__0 )*
            {
             before(grammarAccess.getElseIfDoSpecAccess().getGroup_5()); 
            // InternalDsl.g:1972:2: ( rule__ElseIfDoSpec__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1972:3: rule__ElseIfDoSpec__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ElseIfDoSpec__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getElseIfDoSpecAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group__5__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group_5__0"
    // InternalDsl.g:1981:1: rule__ElseIfDoSpec__Group_5__0 : rule__ElseIfDoSpec__Group_5__0__Impl rule__ElseIfDoSpec__Group_5__1 ;
    public final void rule__ElseIfDoSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1985:1: ( rule__ElseIfDoSpec__Group_5__0__Impl rule__ElseIfDoSpec__Group_5__1 )
            // InternalDsl.g:1986:2: rule__ElseIfDoSpec__Group_5__0__Impl rule__ElseIfDoSpec__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ElseIfDoSpec__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group_5__1();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group_5__0"


    // $ANTLR start "rule__ElseIfDoSpec__Group_5__0__Impl"
    // InternalDsl.g:1993:1: rule__ElseIfDoSpec__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__ElseIfDoSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1997:1: ( ( 'and' ) )
            // InternalDsl.g:1998:1: ( 'and' )
            {
            // InternalDsl.g:1998:1: ( 'and' )
            // InternalDsl.g:1999:2: 'and'
            {
             before(grammarAccess.getElseIfDoSpecAccess().getAndKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getElseIfDoSpecAccess().getAndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group_5__0__Impl"


    // $ANTLR start "rule__ElseIfDoSpec__Group_5__1"
    // InternalDsl.g:2008:1: rule__ElseIfDoSpec__Group_5__1 : rule__ElseIfDoSpec__Group_5__1__Impl ;
    public final void rule__ElseIfDoSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2012:1: ( rule__ElseIfDoSpec__Group_5__1__Impl )
            // InternalDsl.g:2013:2: rule__ElseIfDoSpec__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__Group_5__1__Impl();

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
    // $ANTLR end "rule__ElseIfDoSpec__Group_5__1"


    // $ANTLR start "rule__ElseIfDoSpec__Group_5__1__Impl"
    // InternalDsl.g:2019:1: rule__ElseIfDoSpec__Group_5__1__Impl : ( ( rule__ElseIfDoSpec__ActionAssignment_5_1 ) ) ;
    public final void rule__ElseIfDoSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2023:1: ( ( ( rule__ElseIfDoSpec__ActionAssignment_5_1 ) ) )
            // InternalDsl.g:2024:1: ( ( rule__ElseIfDoSpec__ActionAssignment_5_1 ) )
            {
            // InternalDsl.g:2024:1: ( ( rule__ElseIfDoSpec__ActionAssignment_5_1 ) )
            // InternalDsl.g:2025:2: ( rule__ElseIfDoSpec__ActionAssignment_5_1 )
            {
             before(grammarAccess.getElseIfDoSpecAccess().getActionAssignment_5_1()); 
            // InternalDsl.g:2026:2: ( rule__ElseIfDoSpec__ActionAssignment_5_1 )
            // InternalDsl.g:2026:3: rule__ElseIfDoSpec__ActionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfDoSpec__ActionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getElseIfDoSpecAccess().getActionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__Group_5__1__Impl"


    // $ANTLR start "rule__ElseDoSpec__Group__0"
    // InternalDsl.g:2035:1: rule__ElseDoSpec__Group__0 : rule__ElseDoSpec__Group__0__Impl rule__ElseDoSpec__Group__1 ;
    public final void rule__ElseDoSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2039:1: ( rule__ElseDoSpec__Group__0__Impl rule__ElseDoSpec__Group__1 )
            // InternalDsl.g:2040:2: rule__ElseDoSpec__Group__0__Impl rule__ElseDoSpec__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ElseDoSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__Group__1();

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
    // $ANTLR end "rule__ElseDoSpec__Group__0"


    // $ANTLR start "rule__ElseDoSpec__Group__0__Impl"
    // InternalDsl.g:2047:1: rule__ElseDoSpec__Group__0__Impl : ( 'else' ) ;
    public final void rule__ElseDoSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2051:1: ( ( 'else' ) )
            // InternalDsl.g:2052:1: ( 'else' )
            {
            // InternalDsl.g:2052:1: ( 'else' )
            // InternalDsl.g:2053:2: 'else'
            {
             before(grammarAccess.getElseDoSpecAccess().getElseKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElseDoSpecAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__Group__0__Impl"


    // $ANTLR start "rule__ElseDoSpec__Group__1"
    // InternalDsl.g:2062:1: rule__ElseDoSpec__Group__1 : rule__ElseDoSpec__Group__1__Impl rule__ElseDoSpec__Group__2 ;
    public final void rule__ElseDoSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2066:1: ( rule__ElseDoSpec__Group__1__Impl rule__ElseDoSpec__Group__2 )
            // InternalDsl.g:2067:2: rule__ElseDoSpec__Group__1__Impl rule__ElseDoSpec__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ElseDoSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__Group__2();

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
    // $ANTLR end "rule__ElseDoSpec__Group__1"


    // $ANTLR start "rule__ElseDoSpec__Group__1__Impl"
    // InternalDsl.g:2074:1: rule__ElseDoSpec__Group__1__Impl : ( 'do' ) ;
    public final void rule__ElseDoSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2078:1: ( ( 'do' ) )
            // InternalDsl.g:2079:1: ( 'do' )
            {
            // InternalDsl.g:2079:1: ( 'do' )
            // InternalDsl.g:2080:2: 'do'
            {
             before(grammarAccess.getElseDoSpecAccess().getDoKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getElseDoSpecAccess().getDoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__Group__1__Impl"


    // $ANTLR start "rule__ElseDoSpec__Group__2"
    // InternalDsl.g:2089:1: rule__ElseDoSpec__Group__2 : rule__ElseDoSpec__Group__2__Impl rule__ElseDoSpec__Group__3 ;
    public final void rule__ElseDoSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2093:1: ( rule__ElseDoSpec__Group__2__Impl rule__ElseDoSpec__Group__3 )
            // InternalDsl.g:2094:2: rule__ElseDoSpec__Group__2__Impl rule__ElseDoSpec__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ElseDoSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__Group__3();

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
    // $ANTLR end "rule__ElseDoSpec__Group__2"


    // $ANTLR start "rule__ElseDoSpec__Group__2__Impl"
    // InternalDsl.g:2101:1: rule__ElseDoSpec__Group__2__Impl : ( ( rule__ElseDoSpec__ActionAssignment_2 ) ) ;
    public final void rule__ElseDoSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2105:1: ( ( ( rule__ElseDoSpec__ActionAssignment_2 ) ) )
            // InternalDsl.g:2106:1: ( ( rule__ElseDoSpec__ActionAssignment_2 ) )
            {
            // InternalDsl.g:2106:1: ( ( rule__ElseDoSpec__ActionAssignment_2 ) )
            // InternalDsl.g:2107:2: ( rule__ElseDoSpec__ActionAssignment_2 )
            {
             before(grammarAccess.getElseDoSpecAccess().getActionAssignment_2()); 
            // InternalDsl.g:2108:2: ( rule__ElseDoSpec__ActionAssignment_2 )
            // InternalDsl.g:2108:3: rule__ElseDoSpec__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__ActionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseDoSpecAccess().getActionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__Group__2__Impl"


    // $ANTLR start "rule__ElseDoSpec__Group__3"
    // InternalDsl.g:2116:1: rule__ElseDoSpec__Group__3 : rule__ElseDoSpec__Group__3__Impl ;
    public final void rule__ElseDoSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2120:1: ( rule__ElseDoSpec__Group__3__Impl )
            // InternalDsl.g:2121:2: rule__ElseDoSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__Group__3__Impl();

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
    // $ANTLR end "rule__ElseDoSpec__Group__3"


    // $ANTLR start "rule__ElseDoSpec__Group__3__Impl"
    // InternalDsl.g:2127:1: rule__ElseDoSpec__Group__3__Impl : ( ( rule__ElseDoSpec__Group_3__0 )* ) ;
    public final void rule__ElseDoSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2131:1: ( ( ( rule__ElseDoSpec__Group_3__0 )* ) )
            // InternalDsl.g:2132:1: ( ( rule__ElseDoSpec__Group_3__0 )* )
            {
            // InternalDsl.g:2132:1: ( ( rule__ElseDoSpec__Group_3__0 )* )
            // InternalDsl.g:2133:2: ( rule__ElseDoSpec__Group_3__0 )*
            {
             before(grammarAccess.getElseDoSpecAccess().getGroup_3()); 
            // InternalDsl.g:2134:2: ( rule__ElseDoSpec__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:2134:3: rule__ElseDoSpec__Group_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ElseDoSpec__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getElseDoSpecAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__Group__3__Impl"


    // $ANTLR start "rule__ElseDoSpec__Group_3__0"
    // InternalDsl.g:2143:1: rule__ElseDoSpec__Group_3__0 : rule__ElseDoSpec__Group_3__0__Impl rule__ElseDoSpec__Group_3__1 ;
    public final void rule__ElseDoSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2147:1: ( rule__ElseDoSpec__Group_3__0__Impl rule__ElseDoSpec__Group_3__1 )
            // InternalDsl.g:2148:2: rule__ElseDoSpec__Group_3__0__Impl rule__ElseDoSpec__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ElseDoSpec__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__Group_3__1();

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
    // $ANTLR end "rule__ElseDoSpec__Group_3__0"


    // $ANTLR start "rule__ElseDoSpec__Group_3__0__Impl"
    // InternalDsl.g:2155:1: rule__ElseDoSpec__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__ElseDoSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2159:1: ( ( 'and' ) )
            // InternalDsl.g:2160:1: ( 'and' )
            {
            // InternalDsl.g:2160:1: ( 'and' )
            // InternalDsl.g:2161:2: 'and'
            {
             before(grammarAccess.getElseDoSpecAccess().getAndKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getElseDoSpecAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__Group_3__0__Impl"


    // $ANTLR start "rule__ElseDoSpec__Group_3__1"
    // InternalDsl.g:2170:1: rule__ElseDoSpec__Group_3__1 : rule__ElseDoSpec__Group_3__1__Impl ;
    public final void rule__ElseDoSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2174:1: ( rule__ElseDoSpec__Group_3__1__Impl )
            // InternalDsl.g:2175:2: rule__ElseDoSpec__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__Group_3__1__Impl();

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
    // $ANTLR end "rule__ElseDoSpec__Group_3__1"


    // $ANTLR start "rule__ElseDoSpec__Group_3__1__Impl"
    // InternalDsl.g:2181:1: rule__ElseDoSpec__Group_3__1__Impl : ( ( rule__ElseDoSpec__ActionAssignment_3_1 ) ) ;
    public final void rule__ElseDoSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2185:1: ( ( ( rule__ElseDoSpec__ActionAssignment_3_1 ) ) )
            // InternalDsl.g:2186:1: ( ( rule__ElseDoSpec__ActionAssignment_3_1 ) )
            {
            // InternalDsl.g:2186:1: ( ( rule__ElseDoSpec__ActionAssignment_3_1 ) )
            // InternalDsl.g:2187:2: ( rule__ElseDoSpec__ActionAssignment_3_1 )
            {
             before(grammarAccess.getElseDoSpecAccess().getActionAssignment_3_1()); 
            // InternalDsl.g:2188:2: ( rule__ElseDoSpec__ActionAssignment_3_1 )
            // InternalDsl.g:2188:3: rule__ElseDoSpec__ActionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ElseDoSpec__ActionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElseDoSpecAccess().getActionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__Group_3__1__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__0"
    // InternalDsl.g:2197:1: rule__EnvironmentMetaData__Group__0 : rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 ;
    public final void rule__EnvironmentMetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2201:1: ( rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1 )
            // InternalDsl.g:2202:2: rule__EnvironmentMetaData__Group__0__Impl rule__EnvironmentMetaData__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnvironmentMetaData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__1();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__0"


    // $ANTLR start "rule__EnvironmentMetaData__Group__0__Impl"
    // InternalDsl.g:2209:1: rule__EnvironmentMetaData__Group__0__Impl : ( () ) ;
    public final void rule__EnvironmentMetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2213:1: ( ( () ) )
            // InternalDsl.g:2214:1: ( () )
            {
            // InternalDsl.g:2214:1: ( () )
            // InternalDsl.g:2215:2: ()
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0()); 
            // InternalDsl.g:2216:2: ()
            // InternalDsl.g:2216:3: 
            {
            }

             after(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentMetaDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__1"
    // InternalDsl.g:2224:1: rule__EnvironmentMetaData__Group__1 : rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 ;
    public final void rule__EnvironmentMetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2228:1: ( rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2 )
            // InternalDsl.g:2229:2: rule__EnvironmentMetaData__Group__1__Impl rule__EnvironmentMetaData__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EnvironmentMetaData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__2();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__1"


    // $ANTLR start "rule__EnvironmentMetaData__Group__1__Impl"
    // InternalDsl.g:2236:1: rule__EnvironmentMetaData__Group__1__Impl : ( 'environment' ) ;
    public final void rule__EnvironmentMetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2240:1: ( ( 'environment' ) )
            // InternalDsl.g:2241:1: ( 'environment' )
            {
            // InternalDsl.g:2241:1: ( 'environment' )
            // InternalDsl.g:2242:2: 'environment'
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEnvironmentMetaDataAccess().getEnvironmentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__2"
    // InternalDsl.g:2251:1: rule__EnvironmentMetaData__Group__2 : rule__EnvironmentMetaData__Group__2__Impl rule__EnvironmentMetaData__Group__3 ;
    public final void rule__EnvironmentMetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2255:1: ( rule__EnvironmentMetaData__Group__2__Impl rule__EnvironmentMetaData__Group__3 )
            // InternalDsl.g:2256:2: rule__EnvironmentMetaData__Group__2__Impl rule__EnvironmentMetaData__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__EnvironmentMetaData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__3();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__2"


    // $ANTLR start "rule__EnvironmentMetaData__Group__2__Impl"
    // InternalDsl.g:2263:1: rule__EnvironmentMetaData__Group__2__Impl : ( ruleLBRACE ) ;
    public final void rule__EnvironmentMetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2267:1: ( ( ruleLBRACE ) )
            // InternalDsl.g:2268:1: ( ruleLBRACE )
            {
            // InternalDsl.g:2268:1: ( ruleLBRACE )
            // InternalDsl.g:2269:2: ruleLBRACE
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getLBRACEParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleLBRACE();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataAccess().getLBRACEParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__3"
    // InternalDsl.g:2278:1: rule__EnvironmentMetaData__Group__3 : rule__EnvironmentMetaData__Group__3__Impl rule__EnvironmentMetaData__Group__4 ;
    public final void rule__EnvironmentMetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2282:1: ( rule__EnvironmentMetaData__Group__3__Impl rule__EnvironmentMetaData__Group__4 )
            // InternalDsl.g:2283:2: rule__EnvironmentMetaData__Group__3__Impl rule__EnvironmentMetaData__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EnvironmentMetaData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__4();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__3"


    // $ANTLR start "rule__EnvironmentMetaData__Group__3__Impl"
    // InternalDsl.g:2290:1: rule__EnvironmentMetaData__Group__3__Impl : ( ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 ) ) ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* ) ) ;
    public final void rule__EnvironmentMetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2294:1: ( ( ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 ) ) ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* ) ) )
            // InternalDsl.g:2295:1: ( ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 ) ) ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* ) )
            {
            // InternalDsl.g:2295:1: ( ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 ) ) ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* ) )
            // InternalDsl.g:2296:2: ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 ) ) ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* )
            {
            // InternalDsl.g:2296:2: ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 ) )
            // InternalDsl.g:2297:3: ( rule__EnvironmentMetaData__ResourcesAssignment_3 )
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_3()); 
            // InternalDsl.g:2298:3: ( rule__EnvironmentMetaData__ResourcesAssignment_3 )
            // InternalDsl.g:2298:4: rule__EnvironmentMetaData__ResourcesAssignment_3
            {
            pushFollow(FOLLOW_24);
            rule__EnvironmentMetaData__ResourcesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_3()); 

            }

            // InternalDsl.g:2301:2: ( ( rule__EnvironmentMetaData__ResourcesAssignment_3 )* )
            // InternalDsl.g:2302:3: ( rule__EnvironmentMetaData__ResourcesAssignment_3 )*
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_3()); 
            // InternalDsl.g:2303:3: ( rule__EnvironmentMetaData__ResourcesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:2303:4: rule__EnvironmentMetaData__ResourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__EnvironmentMetaData__ResourcesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEnvironmentMetaDataAccess().getResourcesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentMetaData__Group__4"
    // InternalDsl.g:2312:1: rule__EnvironmentMetaData__Group__4 : rule__EnvironmentMetaData__Group__4__Impl ;
    public final void rule__EnvironmentMetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2316:1: ( rule__EnvironmentMetaData__Group__4__Impl )
            // InternalDsl.g:2317:2: rule__EnvironmentMetaData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentMetaData__Group__4__Impl();

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
    // $ANTLR end "rule__EnvironmentMetaData__Group__4"


    // $ANTLR start "rule__EnvironmentMetaData__Group__4__Impl"
    // InternalDsl.g:2323:1: rule__EnvironmentMetaData__Group__4__Impl : ( ruleRBRACE ) ;
    public final void rule__EnvironmentMetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2327:1: ( ( ruleRBRACE ) )
            // InternalDsl.g:2328:1: ( ruleRBRACE )
            {
            // InternalDsl.g:2328:1: ( ruleRBRACE )
            // InternalDsl.g:2329:2: ruleRBRACE
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getRBRACEParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleRBRACE();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataAccess().getRBRACEParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalDsl.g:2339:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2343:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalDsl.g:2344:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalDsl.g:2351:1: rule__Action__Group__0__Impl : ( ( rule__Action__ResourceAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2355:1: ( ( ( rule__Action__ResourceAssignment_0 ) ) )
            // InternalDsl.g:2356:1: ( ( rule__Action__ResourceAssignment_0 ) )
            {
            // InternalDsl.g:2356:1: ( ( rule__Action__ResourceAssignment_0 ) )
            // InternalDsl.g:2357:2: ( rule__Action__ResourceAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getResourceAssignment_0()); 
            // InternalDsl.g:2358:2: ( rule__Action__ResourceAssignment_0 )
            // InternalDsl.g:2358:3: rule__Action__ResourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getResourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalDsl.g:2366:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2370:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalDsl.g:2371:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalDsl.g:2378:1: rule__Action__Group__1__Impl : ( ':=' ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2382:1: ( ( ':=' ) )
            // InternalDsl.g:2383:1: ( ':=' )
            {
            // InternalDsl.g:2383:1: ( ':=' )
            // InternalDsl.g:2384:2: ':='
            {
             before(grammarAccess.getActionAccess().getColonEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalDsl.g:2393:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2397:1: ( rule__Action__Group__2__Impl )
            // InternalDsl.g:2398:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalDsl.g:2404:1: rule__Action__Group__2__Impl : ( ( rule__Action__StateAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2408:1: ( ( ( rule__Action__StateAssignment_2 ) ) )
            // InternalDsl.g:2409:1: ( ( rule__Action__StateAssignment_2 ) )
            {
            // InternalDsl.g:2409:1: ( ( rule__Action__StateAssignment_2 ) )
            // InternalDsl.g:2410:2: ( rule__Action__StateAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getStateAssignment_2()); 
            // InternalDsl.g:2411:2: ( rule__Action__StateAssignment_2 )
            // InternalDsl.g:2411:3: rule__Action__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__OrElement__Group__0"
    // InternalDsl.g:2420:1: rule__OrElement__Group__0 : rule__OrElement__Group__0__Impl rule__OrElement__Group__1 ;
    public final void rule__OrElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2424:1: ( rule__OrElement__Group__0__Impl rule__OrElement__Group__1 )
            // InternalDsl.g:2425:2: rule__OrElement__Group__0__Impl rule__OrElement__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__OrElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrElement__Group__1();

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
    // $ANTLR end "rule__OrElement__Group__0"


    // $ANTLR start "rule__OrElement__Group__0__Impl"
    // InternalDsl.g:2432:1: rule__OrElement__Group__0__Impl : ( ruleAndElement ) ;
    public final void rule__OrElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2436:1: ( ( ruleAndElement ) )
            // InternalDsl.g:2437:1: ( ruleAndElement )
            {
            // InternalDsl.g:2437:1: ( ruleAndElement )
            // InternalDsl.g:2438:2: ruleAndElement
            {
             before(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndElement();

            state._fsp--;

             after(grammarAccess.getOrElementAccess().getAndElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrElement__Group__0__Impl"


    // $ANTLR start "rule__OrElement__Group__1"
    // InternalDsl.g:2447:1: rule__OrElement__Group__1 : rule__OrElement__Group__1__Impl ;
    public final void rule__OrElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2451:1: ( rule__OrElement__Group__1__Impl )
            // InternalDsl.g:2452:2: rule__OrElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__Group__1__Impl();

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
    // $ANTLR end "rule__OrElement__Group__1"


    // $ANTLR start "rule__OrElement__Group__1__Impl"
    // InternalDsl.g:2458:1: rule__OrElement__Group__1__Impl : ( ( rule__OrElement__Group_1__0 )* ) ;
    public final void rule__OrElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2462:1: ( ( ( rule__OrElement__Group_1__0 )* ) )
            // InternalDsl.g:2463:1: ( ( rule__OrElement__Group_1__0 )* )
            {
            // InternalDsl.g:2463:1: ( ( rule__OrElement__Group_1__0 )* )
            // InternalDsl.g:2464:2: ( rule__OrElement__Group_1__0 )*
            {
             before(grammarAccess.getOrElementAccess().getGroup_1()); 
            // InternalDsl.g:2465:2: ( rule__OrElement__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2465:3: rule__OrElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__OrElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getOrElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrElement__Group__1__Impl"


    // $ANTLR start "rule__OrElement__Group_1__0"
    // InternalDsl.g:2474:1: rule__OrElement__Group_1__0 : rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 ;
    public final void rule__OrElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2478:1: ( rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1 )
            // InternalDsl.g:2479:2: rule__OrElement__Group_1__0__Impl rule__OrElement__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__OrElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrElement__Group_1__1();

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
    // $ANTLR end "rule__OrElement__Group_1__0"


    // $ANTLR start "rule__OrElement__Group_1__0__Impl"
    // InternalDsl.g:2486:1: rule__OrElement__Group_1__0__Impl : ( 'or' ) ;
    public final void rule__OrElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2490:1: ( ( 'or' ) )
            // InternalDsl.g:2491:1: ( 'or' )
            {
            // InternalDsl.g:2491:1: ( 'or' )
            // InternalDsl.g:2492:2: 'or'
            {
             before(grammarAccess.getOrElementAccess().getOrKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOrElementAccess().getOrKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrElement__Group_1__0__Impl"


    // $ANTLR start "rule__OrElement__Group_1__1"
    // InternalDsl.g:2501:1: rule__OrElement__Group_1__1 : rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 ;
    public final void rule__OrElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2505:1: ( rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2 )
            // InternalDsl.g:2506:2: rule__OrElement__Group_1__1__Impl rule__OrElement__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__OrElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrElement__Group_1__2();

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
    // $ANTLR end "rule__OrElement__Group_1__1"


    // $ANTLR start "rule__OrElement__Group_1__1__Impl"
    // InternalDsl.g:2513:1: rule__OrElement__Group_1__1__Impl : ( () ) ;
    public final void rule__OrElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2517:1: ( ( () ) )
            // InternalDsl.g:2518:1: ( () )
            {
            // InternalDsl.g:2518:1: ( () )
            // InternalDsl.g:2519:2: ()
            {
             before(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 
            // InternalDsl.g:2520:2: ()
            // InternalDsl.g:2520:3: 
            {
            }

             after(grammarAccess.getOrElementAccess().getOrElementLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrElement__Group_1__1__Impl"


    // $ANTLR start "rule__OrElement__Group_1__2"
    // InternalDsl.g:2528:1: rule__OrElement__Group_1__2 : rule__OrElement__Group_1__2__Impl ;
    public final void rule__OrElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2532:1: ( rule__OrElement__Group_1__2__Impl )
            // InternalDsl.g:2533:2: rule__OrElement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrElement__Group_1__2"


    // $ANTLR start "rule__OrElement__Group_1__2__Impl"
    // InternalDsl.g:2539:1: rule__OrElement__Group_1__2__Impl : ( ( rule__OrElement__RightAssignment_1_2 ) ) ;
    public final void rule__OrElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2543:1: ( ( ( rule__OrElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2544:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2544:1: ( ( rule__OrElement__RightAssignment_1_2 ) )
            // InternalDsl.g:2545:2: ( rule__OrElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2546:2: ( rule__OrElement__RightAssignment_1_2 )
            // InternalDsl.g:2546:3: rule__OrElement__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrElement__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrElementAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrElement__Group_1__2__Impl"


    // $ANTLR start "rule__AndElement__Group__0"
    // InternalDsl.g:2555:1: rule__AndElement__Group__0 : rule__AndElement__Group__0__Impl rule__AndElement__Group__1 ;
    public final void rule__AndElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2559:1: ( rule__AndElement__Group__0__Impl rule__AndElement__Group__1 )
            // InternalDsl.g:2560:2: rule__AndElement__Group__0__Impl rule__AndElement__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AndElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndElement__Group__1();

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
    // $ANTLR end "rule__AndElement__Group__0"


    // $ANTLR start "rule__AndElement__Group__0__Impl"
    // InternalDsl.g:2567:1: rule__AndElement__Group__0__Impl : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2571:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:2572:1: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:2572:1: ( ruleDiffEqualElement )
            // InternalDsl.g:2573:2: ruleDiffEqualElement
            {
             before(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDiffEqualElement();

            state._fsp--;

             after(grammarAccess.getAndElementAccess().getDiffEqualElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndElement__Group__0__Impl"


    // $ANTLR start "rule__AndElement__Group__1"
    // InternalDsl.g:2582:1: rule__AndElement__Group__1 : rule__AndElement__Group__1__Impl ;
    public final void rule__AndElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2586:1: ( rule__AndElement__Group__1__Impl )
            // InternalDsl.g:2587:2: rule__AndElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__Group__1__Impl();

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
    // $ANTLR end "rule__AndElement__Group__1"


    // $ANTLR start "rule__AndElement__Group__1__Impl"
    // InternalDsl.g:2593:1: rule__AndElement__Group__1__Impl : ( ( rule__AndElement__Group_1__0 )* ) ;
    public final void rule__AndElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2597:1: ( ( ( rule__AndElement__Group_1__0 )* ) )
            // InternalDsl.g:2598:1: ( ( rule__AndElement__Group_1__0 )* )
            {
            // InternalDsl.g:2598:1: ( ( rule__AndElement__Group_1__0 )* )
            // InternalDsl.g:2599:2: ( rule__AndElement__Group_1__0 )*
            {
             before(grammarAccess.getAndElementAccess().getGroup_1()); 
            // InternalDsl.g:2600:2: ( rule__AndElement__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2600:3: rule__AndElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__AndElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAndElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndElement__Group__1__Impl"


    // $ANTLR start "rule__AndElement__Group_1__0"
    // InternalDsl.g:2609:1: rule__AndElement__Group_1__0 : rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 ;
    public final void rule__AndElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2613:1: ( rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1 )
            // InternalDsl.g:2614:2: rule__AndElement__Group_1__0__Impl rule__AndElement__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__AndElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndElement__Group_1__1();

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
    // $ANTLR end "rule__AndElement__Group_1__0"


    // $ANTLR start "rule__AndElement__Group_1__0__Impl"
    // InternalDsl.g:2621:1: rule__AndElement__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__AndElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2625:1: ( ( 'and' ) )
            // InternalDsl.g:2626:1: ( 'and' )
            {
            // InternalDsl.g:2626:1: ( 'and' )
            // InternalDsl.g:2627:2: 'and'
            {
             before(grammarAccess.getAndElementAccess().getAndKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAndElementAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndElement__Group_1__0__Impl"


    // $ANTLR start "rule__AndElement__Group_1__1"
    // InternalDsl.g:2636:1: rule__AndElement__Group_1__1 : rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 ;
    public final void rule__AndElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2640:1: ( rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2 )
            // InternalDsl.g:2641:2: rule__AndElement__Group_1__1__Impl rule__AndElement__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__AndElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndElement__Group_1__2();

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
    // $ANTLR end "rule__AndElement__Group_1__1"


    // $ANTLR start "rule__AndElement__Group_1__1__Impl"
    // InternalDsl.g:2648:1: rule__AndElement__Group_1__1__Impl : ( () ) ;
    public final void rule__AndElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2652:1: ( ( () ) )
            // InternalDsl.g:2653:1: ( () )
            {
            // InternalDsl.g:2653:1: ( () )
            // InternalDsl.g:2654:2: ()
            {
             before(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 
            // InternalDsl.g:2655:2: ()
            // InternalDsl.g:2655:3: 
            {
            }

             after(grammarAccess.getAndElementAccess().getAndElementLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndElement__Group_1__1__Impl"


    // $ANTLR start "rule__AndElement__Group_1__2"
    // InternalDsl.g:2663:1: rule__AndElement__Group_1__2 : rule__AndElement__Group_1__2__Impl ;
    public final void rule__AndElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2667:1: ( rule__AndElement__Group_1__2__Impl )
            // InternalDsl.g:2668:2: rule__AndElement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndElement__Group_1__2"


    // $ANTLR start "rule__AndElement__Group_1__2__Impl"
    // InternalDsl.g:2674:1: rule__AndElement__Group_1__2__Impl : ( ( rule__AndElement__RightAssignment_1_2 ) ) ;
    public final void rule__AndElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2678:1: ( ( ( rule__AndElement__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2679:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2679:1: ( ( rule__AndElement__RightAssignment_1_2 ) )
            // InternalDsl.g:2680:2: ( rule__AndElement__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2681:2: ( rule__AndElement__RightAssignment_1_2 )
            // InternalDsl.g:2681:3: rule__AndElement__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndElement__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndElementAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndElement__Group_1__2__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group__0"
    // InternalDsl.g:2690:1: rule__DiffEqualElement__Group__0 : rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 ;
    public final void rule__DiffEqualElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2694:1: ( rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1 )
            // InternalDsl.g:2695:2: rule__DiffEqualElement__Group__0__Impl rule__DiffEqualElement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DiffEqualElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group__1();

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
    // $ANTLR end "rule__DiffEqualElement__Group__0"


    // $ANTLR start "rule__DiffEqualElement__Group__0__Impl"
    // InternalDsl.g:2702:1: rule__DiffEqualElement__Group__0__Impl : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2706:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:2707:1: ( ruleCompareElement )
            {
            // InternalDsl.g:2707:1: ( ruleCompareElement )
            // InternalDsl.g:2708:2: ruleCompareElement
            {
             before(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementAccess().getCompareElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group__0__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group__1"
    // InternalDsl.g:2717:1: rule__DiffEqualElement__Group__1 : rule__DiffEqualElement__Group__1__Impl ;
    public final void rule__DiffEqualElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2721:1: ( rule__DiffEqualElement__Group__1__Impl )
            // InternalDsl.g:2722:2: rule__DiffEqualElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group__1__Impl();

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
    // $ANTLR end "rule__DiffEqualElement__Group__1"


    // $ANTLR start "rule__DiffEqualElement__Group__1__Impl"
    // InternalDsl.g:2728:1: rule__DiffEqualElement__Group__1__Impl : ( ( rule__DiffEqualElement__Alternatives_1 )* ) ;
    public final void rule__DiffEqualElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2732:1: ( ( ( rule__DiffEqualElement__Alternatives_1 )* ) )
            // InternalDsl.g:2733:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2733:1: ( ( rule__DiffEqualElement__Alternatives_1 )* )
            // InternalDsl.g:2734:2: ( rule__DiffEqualElement__Alternatives_1 )*
            {
             before(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2735:2: ( rule__DiffEqualElement__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=31)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:2735:3: rule__DiffEqualElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__DiffEqualElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDiffEqualElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group__1__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__0"
    // InternalDsl.g:2744:1: rule__DiffEqualElement__Group_1_0__0 : rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 ;
    public final void rule__DiffEqualElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2748:1: ( rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1 )
            // InternalDsl.g:2749:2: rule__DiffEqualElement__Group_1_0__0__Impl rule__DiffEqualElement__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__DiffEqualElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_0__1();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__0"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__0__Impl"
    // InternalDsl.g:2756:1: rule__DiffEqualElement__Group_1_0__0__Impl : ( '!=' ) ;
    public final void rule__DiffEqualElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2760:1: ( ( '!=' ) )
            // InternalDsl.g:2761:1: ( '!=' )
            {
            // InternalDsl.g:2761:1: ( '!=' )
            // InternalDsl.g:2762:2: '!='
            {
             before(grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDiffEqualElementAccess().getExclamationMarkEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__1"
    // InternalDsl.g:2771:1: rule__DiffEqualElement__Group_1_0__1 : rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 ;
    public final void rule__DiffEqualElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2775:1: ( rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2 )
            // InternalDsl.g:2776:2: rule__DiffEqualElement__Group_1_0__1__Impl rule__DiffEqualElement__Group_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__DiffEqualElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_0__2();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__1"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__1__Impl"
    // InternalDsl.g:2783:1: rule__DiffEqualElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2787:1: ( ( () ) )
            // InternalDsl.g:2788:1: ( () )
            {
            // InternalDsl.g:2788:1: ( () )
            // InternalDsl.g:2789:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 
            // InternalDsl.g:2790:2: ()
            // InternalDsl.g:2790:3: 
            {
            }

             after(grammarAccess.getDiffEqualElementAccess().getDiffElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__2"
    // InternalDsl.g:2798:1: rule__DiffEqualElement__Group_1_0__2 : rule__DiffEqualElement__Group_1_0__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2802:1: ( rule__DiffEqualElement__Group_1_0__2__Impl )
            // InternalDsl.g:2803:2: rule__DiffEqualElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__2"


    // $ANTLR start "rule__DiffEqualElement__Group_1_0__2__Impl"
    // InternalDsl.g:2809:1: rule__DiffEqualElement__Group_1_0__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2813:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:2814:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:2814:1: ( ( rule__DiffEqualElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:2815:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:2816:2: ( rule__DiffEqualElement__RightAssignment_1_0_2 )
            // InternalDsl.g:2816:3: rule__DiffEqualElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__0"
    // InternalDsl.g:2825:1: rule__DiffEqualElement__Group_1_1__0 : rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 ;
    public final void rule__DiffEqualElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2829:1: ( rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1 )
            // InternalDsl.g:2830:2: rule__DiffEqualElement__Group_1_1__0__Impl rule__DiffEqualElement__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__DiffEqualElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_1__1();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__0"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__0__Impl"
    // InternalDsl.g:2837:1: rule__DiffEqualElement__Group_1_1__0__Impl : ( '==' ) ;
    public final void rule__DiffEqualElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2841:1: ( ( '==' ) )
            // InternalDsl.g:2842:1: ( '==' )
            {
            // InternalDsl.g:2842:1: ( '==' )
            // InternalDsl.g:2843:2: '=='
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDiffEqualElementAccess().getEqualsSignEqualsSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__1"
    // InternalDsl.g:2852:1: rule__DiffEqualElement__Group_1_1__1 : rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 ;
    public final void rule__DiffEqualElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2856:1: ( rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2 )
            // InternalDsl.g:2857:2: rule__DiffEqualElement__Group_1_1__1__Impl rule__DiffEqualElement__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__DiffEqualElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_1__2();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__1"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__1__Impl"
    // InternalDsl.g:2864:1: rule__DiffEqualElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__DiffEqualElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2868:1: ( ( () ) )
            // InternalDsl.g:2869:1: ( () )
            {
            // InternalDsl.g:2869:1: ( () )
            // InternalDsl.g:2870:2: ()
            {
             before(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:2871:2: ()
            // InternalDsl.g:2871:3: 
            {
            }

             after(grammarAccess.getDiffEqualElementAccess().getEqualElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__2"
    // InternalDsl.g:2879:1: rule__DiffEqualElement__Group_1_1__2 : rule__DiffEqualElement__Group_1_1__2__Impl ;
    public final void rule__DiffEqualElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2883:1: ( rule__DiffEqualElement__Group_1_1__2__Impl )
            // InternalDsl.g:2884:2: rule__DiffEqualElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__2"


    // $ANTLR start "rule__DiffEqualElement__Group_1_1__2__Impl"
    // InternalDsl.g:2890:1: rule__DiffEqualElement__Group_1_1__2__Impl : ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__DiffEqualElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2894:1: ( ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:2895:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:2895:1: ( ( rule__DiffEqualElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:2896:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:2897:2: ( rule__DiffEqualElement__RightAssignment_1_1_2 )
            // InternalDsl.g:2897:3: rule__DiffEqualElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DiffEqualElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDiffEqualElementAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__CompareElement__Group__0"
    // InternalDsl.g:2906:1: rule__CompareElement__Group__0 : rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 ;
    public final void rule__CompareElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2910:1: ( rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1 )
            // InternalDsl.g:2911:2: rule__CompareElement__Group__0__Impl rule__CompareElement__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__CompareElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group__1();

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
    // $ANTLR end "rule__CompareElement__Group__0"


    // $ANTLR start "rule__CompareElement__Group__0__Impl"
    // InternalDsl.g:2918:1: rule__CompareElement__Group__0__Impl : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2922:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:2923:1: ( rulePlusMinusElement )
            {
            // InternalDsl.g:2923:1: ( rulePlusMinusElement )
            // InternalDsl.g:2924:2: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getPlusMinusElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group__0__Impl"


    // $ANTLR start "rule__CompareElement__Group__1"
    // InternalDsl.g:2933:1: rule__CompareElement__Group__1 : rule__CompareElement__Group__1__Impl ;
    public final void rule__CompareElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2937:1: ( rule__CompareElement__Group__1__Impl )
            // InternalDsl.g:2938:2: rule__CompareElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group__1__Impl();

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
    // $ANTLR end "rule__CompareElement__Group__1"


    // $ANTLR start "rule__CompareElement__Group__1__Impl"
    // InternalDsl.g:2944:1: rule__CompareElement__Group__1__Impl : ( ( rule__CompareElement__Alternatives_1 )* ) ;
    public final void rule__CompareElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2948:1: ( ( ( rule__CompareElement__Alternatives_1 )* ) )
            // InternalDsl.g:2949:1: ( ( rule__CompareElement__Alternatives_1 )* )
            {
            // InternalDsl.g:2949:1: ( ( rule__CompareElement__Alternatives_1 )* )
            // InternalDsl.g:2950:2: ( rule__CompareElement__Alternatives_1 )*
            {
             before(grammarAccess.getCompareElementAccess().getAlternatives_1()); 
            // InternalDsl.g:2951:2: ( rule__CompareElement__Alternatives_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=32 && LA22_0<=35)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:2951:3: rule__CompareElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__CompareElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCompareElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_0__0"
    // InternalDsl.g:2960:1: rule__CompareElement__Group_1_0__0 : rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 ;
    public final void rule__CompareElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2964:1: ( rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1 )
            // InternalDsl.g:2965:2: rule__CompareElement__Group_1_0__0__Impl rule__CompareElement__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_0__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_0__0"


    // $ANTLR start "rule__CompareElement__Group_1_0__0__Impl"
    // InternalDsl.g:2972:1: rule__CompareElement__Group_1_0__0__Impl : ( '>' ) ;
    public final void rule__CompareElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2976:1: ( ( '>' ) )
            // InternalDsl.g:2977:1: ( '>' )
            {
            // InternalDsl.g:2977:1: ( '>' )
            // InternalDsl.g:2978:2: '>'
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getGreaterThanSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_0__1"
    // InternalDsl.g:2987:1: rule__CompareElement__Group_1_0__1 : rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 ;
    public final void rule__CompareElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2991:1: ( rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2 )
            // InternalDsl.g:2992:2: rule__CompareElement__Group_1_0__1__Impl rule__CompareElement__Group_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_0__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_0__1"


    // $ANTLR start "rule__CompareElement__Group_1_0__1__Impl"
    // InternalDsl.g:2999:1: rule__CompareElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3003:1: ( ( () ) )
            // InternalDsl.g:3004:1: ( () )
            {
            // InternalDsl.g:3004:1: ( () )
            // InternalDsl.g:3005:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 
            // InternalDsl.g:3006:2: ()
            // InternalDsl.g:3006:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getLargerElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_0__2"
    // InternalDsl.g:3014:1: rule__CompareElement__Group_1_0__2 : rule__CompareElement__Group_1_0__2__Impl ;
    public final void rule__CompareElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3018:1: ( rule__CompareElement__Group_1_0__2__Impl )
            // InternalDsl.g:3019:2: rule__CompareElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_0__2"


    // $ANTLR start "rule__CompareElement__Group_1_0__2__Impl"
    // InternalDsl.g:3025:1: rule__CompareElement__Group_1_0__2__Impl : ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__CompareElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3029:1: ( ( ( rule__CompareElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:3030:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:3030:1: ( ( rule__CompareElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:3031:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:3032:2: ( rule__CompareElement__RightAssignment_1_0_2 )
            // InternalDsl.g:3032:3: rule__CompareElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_1__0"
    // InternalDsl.g:3041:1: rule__CompareElement__Group_1_1__0 : rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 ;
    public final void rule__CompareElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3045:1: ( rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1 )
            // InternalDsl.g:3046:2: rule__CompareElement__Group_1_1__0__Impl rule__CompareElement__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_1__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_1__0"


    // $ANTLR start "rule__CompareElement__Group_1_1__0__Impl"
    // InternalDsl.g:3053:1: rule__CompareElement__Group_1_1__0__Impl : ( '>=' ) ;
    public final void rule__CompareElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3057:1: ( ( '>=' ) )
            // InternalDsl.g:3058:1: ( '>=' )
            {
            // InternalDsl.g:3058:1: ( '>=' )
            // InternalDsl.g:3059:2: '>='
            {
             before(grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getGreaterThanSignEqualsSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_1__1"
    // InternalDsl.g:3068:1: rule__CompareElement__Group_1_1__1 : rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 ;
    public final void rule__CompareElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3072:1: ( rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2 )
            // InternalDsl.g:3073:2: rule__CompareElement__Group_1_1__1__Impl rule__CompareElement__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_1__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_1__1"


    // $ANTLR start "rule__CompareElement__Group_1_1__1__Impl"
    // InternalDsl.g:3080:1: rule__CompareElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3084:1: ( ( () ) )
            // InternalDsl.g:3085:1: ( () )
            {
            // InternalDsl.g:3085:1: ( () )
            // InternalDsl.g:3086:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 
            // InternalDsl.g:3087:2: ()
            // InternalDsl.g:3087:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getLargerEqualElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_1__2"
    // InternalDsl.g:3095:1: rule__CompareElement__Group_1_1__2 : rule__CompareElement__Group_1_1__2__Impl ;
    public final void rule__CompareElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3099:1: ( rule__CompareElement__Group_1_1__2__Impl )
            // InternalDsl.g:3100:2: rule__CompareElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_1__2"


    // $ANTLR start "rule__CompareElement__Group_1_1__2__Impl"
    // InternalDsl.g:3106:1: rule__CompareElement__Group_1_1__2__Impl : ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__CompareElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3110:1: ( ( ( rule__CompareElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3111:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3111:1: ( ( rule__CompareElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3112:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3113:2: ( rule__CompareElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3113:3: rule__CompareElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_2__0"
    // InternalDsl.g:3122:1: rule__CompareElement__Group_1_2__0 : rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 ;
    public final void rule__CompareElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3126:1: ( rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1 )
            // InternalDsl.g:3127:2: rule__CompareElement__Group_1_2__0__Impl rule__CompareElement__Group_1_2__1
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_2__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_2__0"


    // $ANTLR start "rule__CompareElement__Group_1_2__0__Impl"
    // InternalDsl.g:3134:1: rule__CompareElement__Group_1_2__0__Impl : ( '<' ) ;
    public final void rule__CompareElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3138:1: ( ( '<' ) )
            // InternalDsl.g:3139:1: ( '<' )
            {
            // InternalDsl.g:3139:1: ( '<' )
            // InternalDsl.g:3140:2: '<'
            {
             before(grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getLessThanSignKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_2__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_2__1"
    // InternalDsl.g:3149:1: rule__CompareElement__Group_1_2__1 : rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 ;
    public final void rule__CompareElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3153:1: ( rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2 )
            // InternalDsl.g:3154:2: rule__CompareElement__Group_1_2__1__Impl rule__CompareElement__Group_1_2__2
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_2__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_2__1"


    // $ANTLR start "rule__CompareElement__Group_1_2__1__Impl"
    // InternalDsl.g:3161:1: rule__CompareElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3165:1: ( ( () ) )
            // InternalDsl.g:3166:1: ( () )
            {
            // InternalDsl.g:3166:1: ( () )
            // InternalDsl.g:3167:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 
            // InternalDsl.g:3168:2: ()
            // InternalDsl.g:3168:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getSmallerElementLeftAction_1_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_2__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_2__2"
    // InternalDsl.g:3176:1: rule__CompareElement__Group_1_2__2 : rule__CompareElement__Group_1_2__2__Impl ;
    public final void rule__CompareElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3180:1: ( rule__CompareElement__Group_1_2__2__Impl )
            // InternalDsl.g:3181:2: rule__CompareElement__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_2__2"


    // $ANTLR start "rule__CompareElement__Group_1_2__2__Impl"
    // InternalDsl.g:3187:1: rule__CompareElement__Group_1_2__2__Impl : ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__CompareElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3191:1: ( ( ( rule__CompareElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:3192:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:3192:1: ( ( rule__CompareElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:3193:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:3194:2: ( rule__CompareElement__RightAssignment_1_2_2 )
            // InternalDsl.g:3194:3: rule__CompareElement__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_2__2__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_3__0"
    // InternalDsl.g:3203:1: rule__CompareElement__Group_1_3__0 : rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 ;
    public final void rule__CompareElement__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3207:1: ( rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1 )
            // InternalDsl.g:3208:2: rule__CompareElement__Group_1_3__0__Impl rule__CompareElement__Group_1_3__1
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_3__1();

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
    // $ANTLR end "rule__CompareElement__Group_1_3__0"


    // $ANTLR start "rule__CompareElement__Group_1_3__0__Impl"
    // InternalDsl.g:3215:1: rule__CompareElement__Group_1_3__0__Impl : ( '=<' ) ;
    public final void rule__CompareElement__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3219:1: ( ( '=<' ) )
            // InternalDsl.g:3220:1: ( '=<' )
            {
            // InternalDsl.g:3220:1: ( '=<' )
            // InternalDsl.g:3221:2: '=<'
            {
             before(grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompareElementAccess().getEqualsSignLessThanSignKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_3__0__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_3__1"
    // InternalDsl.g:3230:1: rule__CompareElement__Group_1_3__1 : rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 ;
    public final void rule__CompareElement__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3234:1: ( rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2 )
            // InternalDsl.g:3235:2: rule__CompareElement__Group_1_3__1__Impl rule__CompareElement__Group_1_3__2
            {
            pushFollow(FOLLOW_18);
            rule__CompareElement__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_3__2();

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
    // $ANTLR end "rule__CompareElement__Group_1_3__1"


    // $ANTLR start "rule__CompareElement__Group_1_3__1__Impl"
    // InternalDsl.g:3242:1: rule__CompareElement__Group_1_3__1__Impl : ( () ) ;
    public final void rule__CompareElement__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3246:1: ( ( () ) )
            // InternalDsl.g:3247:1: ( () )
            {
            // InternalDsl.g:3247:1: ( () )
            // InternalDsl.g:3248:2: ()
            {
             before(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 
            // InternalDsl.g:3249:2: ()
            // InternalDsl.g:3249:3: 
            {
            }

             after(grammarAccess.getCompareElementAccess().getSmallerEqualElementLeftAction_1_3_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_3__1__Impl"


    // $ANTLR start "rule__CompareElement__Group_1_3__2"
    // InternalDsl.g:3257:1: rule__CompareElement__Group_1_3__2 : rule__CompareElement__Group_1_3__2__Impl ;
    public final void rule__CompareElement__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3261:1: ( rule__CompareElement__Group_1_3__2__Impl )
            // InternalDsl.g:3262:2: rule__CompareElement__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__CompareElement__Group_1_3__2"


    // $ANTLR start "rule__CompareElement__Group_1_3__2__Impl"
    // InternalDsl.g:3268:1: rule__CompareElement__Group_1_3__2__Impl : ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) ;
    public final void rule__CompareElement__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3272:1: ( ( ( rule__CompareElement__RightAssignment_1_3_2 ) ) )
            // InternalDsl.g:3273:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            {
            // InternalDsl.g:3273:1: ( ( rule__CompareElement__RightAssignment_1_3_2 ) )
            // InternalDsl.g:3274:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 
            // InternalDsl.g:3275:2: ( rule__CompareElement__RightAssignment_1_3_2 )
            // InternalDsl.g:3275:3: rule__CompareElement__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CompareElement__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareElementAccess().getRightAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__Group_1_3__2__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group__0"
    // InternalDsl.g:3284:1: rule__PlusMinusElement__Group__0 : rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 ;
    public final void rule__PlusMinusElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3288:1: ( rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1 )
            // InternalDsl.g:3289:2: rule__PlusMinusElement__Group__0__Impl rule__PlusMinusElement__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__PlusMinusElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group__1();

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
    // $ANTLR end "rule__PlusMinusElement__Group__0"


    // $ANTLR start "rule__PlusMinusElement__Group__0__Impl"
    // InternalDsl.g:3296:1: rule__PlusMinusElement__Group__0__Impl : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3300:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:3301:1: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:3301:1: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:3302:2: ruleMultiplicationDivisionElement
            {
             before(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementAccess().getMultiplicationDivisionElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group__0__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group__1"
    // InternalDsl.g:3311:1: rule__PlusMinusElement__Group__1 : rule__PlusMinusElement__Group__1__Impl ;
    public final void rule__PlusMinusElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3315:1: ( rule__PlusMinusElement__Group__1__Impl )
            // InternalDsl.g:3316:2: rule__PlusMinusElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group__1__Impl();

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
    // $ANTLR end "rule__PlusMinusElement__Group__1"


    // $ANTLR start "rule__PlusMinusElement__Group__1__Impl"
    // InternalDsl.g:3322:1: rule__PlusMinusElement__Group__1__Impl : ( ( rule__PlusMinusElement__Alternatives_1 )* ) ;
    public final void rule__PlusMinusElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3326:1: ( ( ( rule__PlusMinusElement__Alternatives_1 )* ) )
            // InternalDsl.g:3327:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            {
            // InternalDsl.g:3327:1: ( ( rule__PlusMinusElement__Alternatives_1 )* )
            // InternalDsl.g:3328:2: ( rule__PlusMinusElement__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 
            // InternalDsl.g:3329:2: ( rule__PlusMinusElement__Alternatives_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=36 && LA23_0<=37)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:3329:3: rule__PlusMinusElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__PlusMinusElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPlusMinusElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group__1__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__0"
    // InternalDsl.g:3338:1: rule__PlusMinusElement__Group_1_0__0 : rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 ;
    public final void rule__PlusMinusElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3342:1: ( rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1 )
            // InternalDsl.g:3343:2: rule__PlusMinusElement__Group_1_0__0__Impl rule__PlusMinusElement__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__PlusMinusElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_0__1();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__0"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__0__Impl"
    // InternalDsl.g:3350:1: rule__PlusMinusElement__Group_1_0__0__Impl : ( '+' ) ;
    public final void rule__PlusMinusElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3354:1: ( ( '+' ) )
            // InternalDsl.g:3355:1: ( '+' )
            {
            // InternalDsl.g:3355:1: ( '+' )
            // InternalDsl.g:3356:2: '+'
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPlusMinusElementAccess().getPlusSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__1"
    // InternalDsl.g:3365:1: rule__PlusMinusElement__Group_1_0__1 : rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 ;
    public final void rule__PlusMinusElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3369:1: ( rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2 )
            // InternalDsl.g:3370:2: rule__PlusMinusElement__Group_1_0__1__Impl rule__PlusMinusElement__Group_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__PlusMinusElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_0__2();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__1"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__1__Impl"
    // InternalDsl.g:3377:1: rule__PlusMinusElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3381:1: ( ( () ) )
            // InternalDsl.g:3382:1: ( () )
            {
            // InternalDsl.g:3382:1: ( () )
            // InternalDsl.g:3383:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 
            // InternalDsl.g:3384:2: ()
            // InternalDsl.g:3384:3: 
            {
            }

             after(grammarAccess.getPlusMinusElementAccess().getPlusElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__2"
    // InternalDsl.g:3392:1: rule__PlusMinusElement__Group_1_0__2 : rule__PlusMinusElement__Group_1_0__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3396:1: ( rule__PlusMinusElement__Group_1_0__2__Impl )
            // InternalDsl.g:3397:2: rule__PlusMinusElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__2"


    // $ANTLR start "rule__PlusMinusElement__Group_1_0__2__Impl"
    // InternalDsl.g:3403:1: rule__PlusMinusElement__Group_1_0__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3407:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:3408:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:3408:1: ( ( rule__PlusMinusElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:3409:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:3410:2: ( rule__PlusMinusElement__RightAssignment_1_0_2 )
            // InternalDsl.g:3410:3: rule__PlusMinusElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__0"
    // InternalDsl.g:3419:1: rule__PlusMinusElement__Group_1_1__0 : rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 ;
    public final void rule__PlusMinusElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3423:1: ( rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1 )
            // InternalDsl.g:3424:2: rule__PlusMinusElement__Group_1_1__0__Impl rule__PlusMinusElement__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__PlusMinusElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_1__1();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__0"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__0__Impl"
    // InternalDsl.g:3431:1: rule__PlusMinusElement__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__PlusMinusElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3435:1: ( ( '-' ) )
            // InternalDsl.g:3436:1: ( '-' )
            {
            // InternalDsl.g:3436:1: ( '-' )
            // InternalDsl.g:3437:2: '-'
            {
             before(grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPlusMinusElementAccess().getHyphenMinusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__1"
    // InternalDsl.g:3446:1: rule__PlusMinusElement__Group_1_1__1 : rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 ;
    public final void rule__PlusMinusElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3450:1: ( rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2 )
            // InternalDsl.g:3451:2: rule__PlusMinusElement__Group_1_1__1__Impl rule__PlusMinusElement__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__PlusMinusElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_1__2();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__1"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__1__Impl"
    // InternalDsl.g:3458:1: rule__PlusMinusElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__PlusMinusElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3462:1: ( ( () ) )
            // InternalDsl.g:3463:1: ( () )
            {
            // InternalDsl.g:3463:1: ( () )
            // InternalDsl.g:3464:2: ()
            {
             before(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 
            // InternalDsl.g:3465:2: ()
            // InternalDsl.g:3465:3: 
            {
            }

             after(grammarAccess.getPlusMinusElementAccess().getMinusElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__2"
    // InternalDsl.g:3473:1: rule__PlusMinusElement__Group_1_1__2 : rule__PlusMinusElement__Group_1_1__2__Impl ;
    public final void rule__PlusMinusElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3477:1: ( rule__PlusMinusElement__Group_1_1__2__Impl )
            // InternalDsl.g:3478:2: rule__PlusMinusElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__2"


    // $ANTLR start "rule__PlusMinusElement__Group_1_1__2__Impl"
    // InternalDsl.g:3484:1: rule__PlusMinusElement__Group_1_1__2__Impl : ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinusElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3488:1: ( ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3489:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3489:1: ( ( rule__PlusMinusElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3490:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3491:2: ( rule__PlusMinusElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3491:3: rule__PlusMinusElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinusElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusElementAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__0"
    // InternalDsl.g:3500:1: rule__MultiplicationDivisionElement__Group__0 : rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 ;
    public final void rule__MultiplicationDivisionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3504:1: ( rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1 )
            // InternalDsl.g:3505:2: rule__MultiplicationDivisionElement__Group__0__Impl rule__MultiplicationDivisionElement__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__MultiplicationDivisionElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__0__Impl"
    // InternalDsl.g:3512:1: rule__MultiplicationDivisionElement__Group__0__Impl : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3516:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:3517:1: ( ruleUnaryElement )
            {
            // InternalDsl.g:3517:1: ( ruleUnaryElement )
            // InternalDsl.g:3518:2: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getUnaryElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__1"
    // InternalDsl.g:3527:1: rule__MultiplicationDivisionElement__Group__1 : rule__MultiplicationDivisionElement__Group__1__Impl ;
    public final void rule__MultiplicationDivisionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3531:1: ( rule__MultiplicationDivisionElement__Group__1__Impl )
            // InternalDsl.g:3532:2: rule__MultiplicationDivisionElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group__1__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group__1__Impl"
    // InternalDsl.g:3538:1: rule__MultiplicationDivisionElement__Group__1__Impl : ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) ;
    public final void rule__MultiplicationDivisionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3542:1: ( ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* ) )
            // InternalDsl.g:3543:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            {
            // InternalDsl.g:3543:1: ( ( rule__MultiplicationDivisionElement__Alternatives_1 )* )
            // InternalDsl.g:3544:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 
            // InternalDsl.g:3545:2: ( rule__MultiplicationDivisionElement__Alternatives_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:3545:3: rule__MultiplicationDivisionElement__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__MultiplicationDivisionElement__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMultiplicationDivisionElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__0"
    // InternalDsl.g:3554:1: rule__MultiplicationDivisionElement__Group_1_0__0 : rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3558:1: ( rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1 )
            // InternalDsl.g:3559:2: rule__MultiplicationDivisionElement__Group_1_0__0__Impl rule__MultiplicationDivisionElement__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__MultiplicationDivisionElement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_0__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__0__Impl"
    // InternalDsl.g:3566:1: rule__MultiplicationDivisionElement__Group_1_0__0__Impl : ( '*' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3570:1: ( ( '*' ) )
            // InternalDsl.g:3571:1: ( '*' )
            {
            // InternalDsl.g:3571:1: ( '*' )
            // InternalDsl.g:3572:2: '*'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMultiplicationDivisionElementAccess().getAsteriskKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__1"
    // InternalDsl.g:3581:1: rule__MultiplicationDivisionElement__Group_1_0__1 : rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3585:1: ( rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2 )
            // InternalDsl.g:3586:2: rule__MultiplicationDivisionElement__Group_1_0__1__Impl rule__MultiplicationDivisionElement__Group_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__MultiplicationDivisionElement__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_0__2();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__1__Impl"
    // InternalDsl.g:3593:1: rule__MultiplicationDivisionElement__Group_1_0__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3597:1: ( ( () ) )
            // InternalDsl.g:3598:1: ( () )
            {
            // InternalDsl.g:3598:1: ( () )
            // InternalDsl.g:3599:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 
            // InternalDsl.g:3600:2: ()
            // InternalDsl.g:3600:3: 
            {
            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getMultiplicationElementLeftAction_1_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__2"
    // InternalDsl.g:3608:1: rule__MultiplicationDivisionElement__Group_1_0__2 : rule__MultiplicationDivisionElement__Group_1_0__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3612:1: ( rule__MultiplicationDivisionElement__Group_1_0__2__Impl )
            // InternalDsl.g:3613:2: rule__MultiplicationDivisionElement__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__2"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_0__2__Impl"
    // InternalDsl.g:3619:1: rule__MultiplicationDivisionElement__Group_1_0__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3623:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:3624:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:3624:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 ) )
            // InternalDsl.g:3625:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 
            // InternalDsl.g:3626:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_0_2 )
            // InternalDsl.g:3626:3: rule__MultiplicationDivisionElement__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_0__2__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__0"
    // InternalDsl.g:3635:1: rule__MultiplicationDivisionElement__Group_1_1__0 : rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3639:1: ( rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1 )
            // InternalDsl.g:3640:2: rule__MultiplicationDivisionElement__Group_1_1__0__Impl rule__MultiplicationDivisionElement__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__MultiplicationDivisionElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_1__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__0__Impl"
    // InternalDsl.g:3647:1: rule__MultiplicationDivisionElement__Group_1_1__0__Impl : ( '/' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3651:1: ( ( '/' ) )
            // InternalDsl.g:3652:1: ( '/' )
            {
            // InternalDsl.g:3652:1: ( '/' )
            // InternalDsl.g:3653:2: '/'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMultiplicationDivisionElementAccess().getSolidusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__1"
    // InternalDsl.g:3662:1: rule__MultiplicationDivisionElement__Group_1_1__1 : rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3666:1: ( rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2 )
            // InternalDsl.g:3667:2: rule__MultiplicationDivisionElement__Group_1_1__1__Impl rule__MultiplicationDivisionElement__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__MultiplicationDivisionElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_1__2();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__1__Impl"
    // InternalDsl.g:3674:1: rule__MultiplicationDivisionElement__Group_1_1__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3678:1: ( ( () ) )
            // InternalDsl.g:3679:1: ( () )
            {
            // InternalDsl.g:3679:1: ( () )
            // InternalDsl.g:3680:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 
            // InternalDsl.g:3681:2: ()
            // InternalDsl.g:3681:3: 
            {
            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getDivisionElementLeftAction_1_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__2"
    // InternalDsl.g:3689:1: rule__MultiplicationDivisionElement__Group_1_1__2 : rule__MultiplicationDivisionElement__Group_1_1__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3693:1: ( rule__MultiplicationDivisionElement__Group_1_1__2__Impl )
            // InternalDsl.g:3694:2: rule__MultiplicationDivisionElement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__2"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_1__2__Impl"
    // InternalDsl.g:3700:1: rule__MultiplicationDivisionElement__Group_1_1__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3704:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:3705:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:3705:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 ) )
            // InternalDsl.g:3706:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 
            // InternalDsl.g:3707:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_1_2 )
            // InternalDsl.g:3707:3: rule__MultiplicationDivisionElement__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__0"
    // InternalDsl.g:3716:1: rule__MultiplicationDivisionElement__Group_1_2__0 : rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3720:1: ( rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1 )
            // InternalDsl.g:3721:2: rule__MultiplicationDivisionElement__Group_1_2__0__Impl rule__MultiplicationDivisionElement__Group_1_2__1
            {
            pushFollow(FOLLOW_18);
            rule__MultiplicationDivisionElement__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_2__1();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__0"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__0__Impl"
    // InternalDsl.g:3728:1: rule__MultiplicationDivisionElement__Group_1_2__0__Impl : ( '%' ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3732:1: ( ( '%' ) )
            // InternalDsl.g:3733:1: ( '%' )
            {
            // InternalDsl.g:3733:1: ( '%' )
            // InternalDsl.g:3734:2: '%'
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMultiplicationDivisionElementAccess().getPercentSignKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__0__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__1"
    // InternalDsl.g:3743:1: rule__MultiplicationDivisionElement__Group_1_2__1 : rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3747:1: ( rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2 )
            // InternalDsl.g:3748:2: rule__MultiplicationDivisionElement__Group_1_2__1__Impl rule__MultiplicationDivisionElement__Group_1_2__2
            {
            pushFollow(FOLLOW_18);
            rule__MultiplicationDivisionElement__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_2__2();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__1"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__1__Impl"
    // InternalDsl.g:3755:1: rule__MultiplicationDivisionElement__Group_1_2__1__Impl : ( () ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3759:1: ( ( () ) )
            // InternalDsl.g:3760:1: ( () )
            {
            // InternalDsl.g:3760:1: ( () )
            // InternalDsl.g:3761:2: ()
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 
            // InternalDsl.g:3762:2: ()
            // InternalDsl.g:3762:3: 
            {
            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getModuloElementLeftAction_1_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__1__Impl"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__2"
    // InternalDsl.g:3770:1: rule__MultiplicationDivisionElement__Group_1_2__2 : rule__MultiplicationDivisionElement__Group_1_2__2__Impl ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3774:1: ( rule__MultiplicationDivisionElement__Group_1_2__2__Impl )
            // InternalDsl.g:3775:2: rule__MultiplicationDivisionElement__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__2"


    // $ANTLR start "rule__MultiplicationDivisionElement__Group_1_2__2__Impl"
    // InternalDsl.g:3781:1: rule__MultiplicationDivisionElement__Group_1_2__2__Impl : ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) ;
    public final void rule__MultiplicationDivisionElement__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3785:1: ( ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:3786:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:3786:1: ( ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 ) )
            // InternalDsl.g:3787:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 
            // InternalDsl.g:3788:2: ( rule__MultiplicationDivisionElement__RightAssignment_1_2_2 )
            // InternalDsl.g:3788:3: rule__MultiplicationDivisionElement__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationDivisionElement__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__Group_1_2__2__Impl"


    // $ANTLR start "rule__UnaryElement__Group_0__0"
    // InternalDsl.g:3797:1: rule__UnaryElement__Group_0__0 : rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 ;
    public final void rule__UnaryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3801:1: ( rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1 )
            // InternalDsl.g:3802:2: rule__UnaryElement__Group_0__0__Impl rule__UnaryElement__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__UnaryElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_0__1();

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
    // $ANTLR end "rule__UnaryElement__Group_0__0"


    // $ANTLR start "rule__UnaryElement__Group_0__0__Impl"
    // InternalDsl.g:3809:1: rule__UnaryElement__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3813:1: ( ( () ) )
            // InternalDsl.g:3814:1: ( () )
            {
            // InternalDsl.g:3814:1: ( () )
            // InternalDsl.g:3815:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 
            // InternalDsl.g:3816:2: ()
            // InternalDsl.g:3816:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getNumber_ObjectAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_0__1"
    // InternalDsl.g:3824:1: rule__UnaryElement__Group_0__1 : rule__UnaryElement__Group_0__1__Impl ;
    public final void rule__UnaryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3828:1: ( rule__UnaryElement__Group_0__1__Impl )
            // InternalDsl.g:3829:2: rule__UnaryElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_0__1__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_0__1"


    // $ANTLR start "rule__UnaryElement__Group_0__1__Impl"
    // InternalDsl.g:3835:1: rule__UnaryElement__Group_0__1__Impl : ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) ;
    public final void rule__UnaryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3839:1: ( ( ( rule__UnaryElement__ValueAssignment_0_1 ) ) )
            // InternalDsl.g:3840:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            {
            // InternalDsl.g:3840:1: ( ( rule__UnaryElement__ValueAssignment_0_1 ) )
            // InternalDsl.g:3841:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 
            // InternalDsl.g:3842:2: ( rule__UnaryElement__ValueAssignment_0_1 )
            // InternalDsl.g:3842:3: rule__UnaryElement__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_1__0"
    // InternalDsl.g:3851:1: rule__UnaryElement__Group_1__0 : rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 ;
    public final void rule__UnaryElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3855:1: ( rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1 )
            // InternalDsl.g:3856:2: rule__UnaryElement__Group_1__0__Impl rule__UnaryElement__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__UnaryElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_1__1();

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
    // $ANTLR end "rule__UnaryElement__Group_1__0"


    // $ANTLR start "rule__UnaryElement__Group_1__0__Impl"
    // InternalDsl.g:3863:1: rule__UnaryElement__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3867:1: ( ( () ) )
            // InternalDsl.g:3868:1: ( () )
            {
            // InternalDsl.g:3868:1: ( () )
            // InternalDsl.g:3869:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_1_0()); 
            // InternalDsl.g:3870:2: ()
            // InternalDsl.g:3870:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getBoolean_ObjectAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_1__1"
    // InternalDsl.g:3878:1: rule__UnaryElement__Group_1__1 : rule__UnaryElement__Group_1__1__Impl ;
    public final void rule__UnaryElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3882:1: ( rule__UnaryElement__Group_1__1__Impl )
            // InternalDsl.g:3883:2: rule__UnaryElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_1__1__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_1__1"


    // $ANTLR start "rule__UnaryElement__Group_1__1__Impl"
    // InternalDsl.g:3889:1: rule__UnaryElement__Group_1__1__Impl : ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) ;
    public final void rule__UnaryElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3893:1: ( ( ( rule__UnaryElement__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:3894:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:3894:1: ( ( rule__UnaryElement__ValueAssignment_1_1 ) )
            // InternalDsl.g:3895:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:3896:2: ( rule__UnaryElement__ValueAssignment_1_1 )
            // InternalDsl.g:3896:3: rule__UnaryElement__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_2__0"
    // InternalDsl.g:3905:1: rule__UnaryElement__Group_2__0 : rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 ;
    public final void rule__UnaryElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3909:1: ( rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1 )
            // InternalDsl.g:3910:2: rule__UnaryElement__Group_2__0__Impl rule__UnaryElement__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__UnaryElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_2__1();

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
    // $ANTLR end "rule__UnaryElement__Group_2__0"


    // $ANTLR start "rule__UnaryElement__Group_2__0__Impl"
    // InternalDsl.g:3917:1: rule__UnaryElement__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3921:1: ( ( () ) )
            // InternalDsl.g:3922:1: ( () )
            {
            // InternalDsl.g:3922:1: ( () )
            // InternalDsl.g:3923:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getResource_ObjectAction_2_0()); 
            // InternalDsl.g:3924:2: ()
            // InternalDsl.g:3924:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getResource_ObjectAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_2__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_2__1"
    // InternalDsl.g:3932:1: rule__UnaryElement__Group_2__1 : rule__UnaryElement__Group_2__1__Impl rule__UnaryElement__Group_2__2 ;
    public final void rule__UnaryElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3936:1: ( rule__UnaryElement__Group_2__1__Impl rule__UnaryElement__Group_2__2 )
            // InternalDsl.g:3937:2: rule__UnaryElement__Group_2__1__Impl rule__UnaryElement__Group_2__2
            {
            pushFollow(FOLLOW_37);
            rule__UnaryElement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_2__2();

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
    // $ANTLR end "rule__UnaryElement__Group_2__1"


    // $ANTLR start "rule__UnaryElement__Group_2__1__Impl"
    // InternalDsl.g:3944:1: rule__UnaryElement__Group_2__1__Impl : ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) ;
    public final void rule__UnaryElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3948:1: ( ( ( rule__UnaryElement__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:3949:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:3949:1: ( ( rule__UnaryElement__ValueAssignment_2_1 ) )
            // InternalDsl.g:3950:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:3951:2: ( rule__UnaryElement__ValueAssignment_2_1 )
            // InternalDsl.g:3951:3: rule__UnaryElement__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_2__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_2__2"
    // InternalDsl.g:3959:1: rule__UnaryElement__Group_2__2 : rule__UnaryElement__Group_2__2__Impl ;
    public final void rule__UnaryElement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3963:1: ( rule__UnaryElement__Group_2__2__Impl )
            // InternalDsl.g:3964:2: rule__UnaryElement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_2__2__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_2__2"


    // $ANTLR start "rule__UnaryElement__Group_2__2__Impl"
    // InternalDsl.g:3970:1: rule__UnaryElement__Group_2__2__Impl : ( '.state' ) ;
    public final void rule__UnaryElement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3974:1: ( ( '.state' ) )
            // InternalDsl.g:3975:1: ( '.state' )
            {
            // InternalDsl.g:3975:1: ( '.state' )
            // InternalDsl.g:3976:2: '.state'
            {
             before(grammarAccess.getUnaryElementAccess().getStateKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getStateKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_2__2__Impl"


    // $ANTLR start "rule__UnaryElement__Group_3__0"
    // InternalDsl.g:3986:1: rule__UnaryElement__Group_3__0 : rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 ;
    public final void rule__UnaryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3990:1: ( rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1 )
            // InternalDsl.g:3991:2: rule__UnaryElement__Group_3__0__Impl rule__UnaryElement__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__UnaryElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_3__1();

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
    // $ANTLR end "rule__UnaryElement__Group_3__0"


    // $ANTLR start "rule__UnaryElement__Group_3__0__Impl"
    // InternalDsl.g:3998:1: rule__UnaryElement__Group_3__0__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4002:1: ( ( () ) )
            // InternalDsl.g:4003:1: ( () )
            {
            // InternalDsl.g:4003:1: ( () )
            // InternalDsl.g:4004:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getState_ObjectAction_3_0()); 
            // InternalDsl.g:4005:2: ()
            // InternalDsl.g:4005:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getState_ObjectAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_3__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_3__1"
    // InternalDsl.g:4013:1: rule__UnaryElement__Group_3__1 : rule__UnaryElement__Group_3__1__Impl ;
    public final void rule__UnaryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4017:1: ( rule__UnaryElement__Group_3__1__Impl )
            // InternalDsl.g:4018:2: rule__UnaryElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_3__1__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_3__1"


    // $ANTLR start "rule__UnaryElement__Group_3__1__Impl"
    // InternalDsl.g:4024:1: rule__UnaryElement__Group_3__1__Impl : ( ( rule__UnaryElement__ValueAssignment_3_1 ) ) ;
    public final void rule__UnaryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4028:1: ( ( ( rule__UnaryElement__ValueAssignment_3_1 ) ) )
            // InternalDsl.g:4029:1: ( ( rule__UnaryElement__ValueAssignment_3_1 ) )
            {
            // InternalDsl.g:4029:1: ( ( rule__UnaryElement__ValueAssignment_3_1 ) )
            // InternalDsl.g:4030:2: ( rule__UnaryElement__ValueAssignment_3_1 )
            {
             before(grammarAccess.getUnaryElementAccess().getValueAssignment_3_1()); 
            // InternalDsl.g:4031:2: ( rule__UnaryElement__ValueAssignment_3_1 )
            // InternalDsl.g:4031:3: rule__UnaryElement__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_3__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_4__0"
    // InternalDsl.g:4040:1: rule__UnaryElement__Group_4__0 : rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 ;
    public final void rule__UnaryElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4044:1: ( rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1 )
            // InternalDsl.g:4045:2: rule__UnaryElement__Group_4__0__Impl rule__UnaryElement__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__UnaryElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_4__1();

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
    // $ANTLR end "rule__UnaryElement__Group_4__0"


    // $ANTLR start "rule__UnaryElement__Group_4__0__Impl"
    // InternalDsl.g:4052:1: rule__UnaryElement__Group_4__0__Impl : ( '(' ) ;
    public final void rule__UnaryElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4056:1: ( ( '(' ) )
            // InternalDsl.g:4057:1: ( '(' )
            {
            // InternalDsl.g:4057:1: ( '(' )
            // InternalDsl.g:4058:2: '('
            {
             before(grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_4__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_4__1"
    // InternalDsl.g:4067:1: rule__UnaryElement__Group_4__1 : rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 ;
    public final void rule__UnaryElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4071:1: ( rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2 )
            // InternalDsl.g:4072:2: rule__UnaryElement__Group_4__1__Impl rule__UnaryElement__Group_4__2
            {
            pushFollow(FOLLOW_38);
            rule__UnaryElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_4__2();

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
    // $ANTLR end "rule__UnaryElement__Group_4__1"


    // $ANTLR start "rule__UnaryElement__Group_4__1__Impl"
    // InternalDsl.g:4079:1: rule__UnaryElement__Group_4__1__Impl : ( ruleOrElement ) ;
    public final void rule__UnaryElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4083:1: ( ( ruleOrElement ) )
            // InternalDsl.g:4084:1: ( ruleOrElement )
            {
            // InternalDsl.g:4084:1: ( ruleOrElement )
            // InternalDsl.g:4085:2: ruleOrElement
            {
             before(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getOrElementParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_4__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_4__2"
    // InternalDsl.g:4094:1: rule__UnaryElement__Group_4__2 : rule__UnaryElement__Group_4__2__Impl ;
    public final void rule__UnaryElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4098:1: ( rule__UnaryElement__Group_4__2__Impl )
            // InternalDsl.g:4099:2: rule__UnaryElement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_4__2__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_4__2"


    // $ANTLR start "rule__UnaryElement__Group_4__2__Impl"
    // InternalDsl.g:4105:1: rule__UnaryElement__Group_4__2__Impl : ( ')' ) ;
    public final void rule__UnaryElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4109:1: ( ( ')' ) )
            // InternalDsl.g:4110:1: ( ')' )
            {
            // InternalDsl.g:4110:1: ( ')' )
            // InternalDsl.g:4111:2: ')'
            {
             before(grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_4_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_4__2__Impl"


    // $ANTLR start "rule__UnaryElement__Group_5__0"
    // InternalDsl.g:4121:1: rule__UnaryElement__Group_5__0 : rule__UnaryElement__Group_5__0__Impl rule__UnaryElement__Group_5__1 ;
    public final void rule__UnaryElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4125:1: ( rule__UnaryElement__Group_5__0__Impl rule__UnaryElement__Group_5__1 )
            // InternalDsl.g:4126:2: rule__UnaryElement__Group_5__0__Impl rule__UnaryElement__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__UnaryElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_5__1();

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
    // $ANTLR end "rule__UnaryElement__Group_5__0"


    // $ANTLR start "rule__UnaryElement__Group_5__0__Impl"
    // InternalDsl.g:4133:1: rule__UnaryElement__Group_5__0__Impl : ( 'not' ) ;
    public final void rule__UnaryElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4137:1: ( ( 'not' ) )
            // InternalDsl.g:4138:1: ( 'not' )
            {
            // InternalDsl.g:4138:1: ( 'not' )
            // InternalDsl.g:4139:2: 'not'
            {
             before(grammarAccess.getUnaryElementAccess().getNotKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getNotKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_5__0__Impl"


    // $ANTLR start "rule__UnaryElement__Group_5__1"
    // InternalDsl.g:4148:1: rule__UnaryElement__Group_5__1 : rule__UnaryElement__Group_5__1__Impl rule__UnaryElement__Group_5__2 ;
    public final void rule__UnaryElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4152:1: ( rule__UnaryElement__Group_5__1__Impl rule__UnaryElement__Group_5__2 )
            // InternalDsl.g:4153:2: rule__UnaryElement__Group_5__1__Impl rule__UnaryElement__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__UnaryElement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_5__2();

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
    // $ANTLR end "rule__UnaryElement__Group_5__1"


    // $ANTLR start "rule__UnaryElement__Group_5__1__Impl"
    // InternalDsl.g:4160:1: rule__UnaryElement__Group_5__1__Impl : ( () ) ;
    public final void rule__UnaryElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4164:1: ( ( () ) )
            // InternalDsl.g:4165:1: ( () )
            {
            // InternalDsl.g:4165:1: ( () )
            // InternalDsl.g:4166:2: ()
            {
             before(grammarAccess.getUnaryElementAccess().getNegateElementAction_5_1()); 
            // InternalDsl.g:4167:2: ()
            // InternalDsl.g:4167:3: 
            {
            }

             after(grammarAccess.getUnaryElementAccess().getNegateElementAction_5_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_5__1__Impl"


    // $ANTLR start "rule__UnaryElement__Group_5__2"
    // InternalDsl.g:4175:1: rule__UnaryElement__Group_5__2 : rule__UnaryElement__Group_5__2__Impl ;
    public final void rule__UnaryElement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4179:1: ( rule__UnaryElement__Group_5__2__Impl )
            // InternalDsl.g:4180:2: rule__UnaryElement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__Group_5__2__Impl();

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
    // $ANTLR end "rule__UnaryElement__Group_5__2"


    // $ANTLR start "rule__UnaryElement__Group_5__2__Impl"
    // InternalDsl.g:4186:1: rule__UnaryElement__Group_5__2__Impl : ( ( rule__UnaryElement__ExpAssignment_5_2 ) ) ;
    public final void rule__UnaryElement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4190:1: ( ( ( rule__UnaryElement__ExpAssignment_5_2 ) ) )
            // InternalDsl.g:4191:1: ( ( rule__UnaryElement__ExpAssignment_5_2 ) )
            {
            // InternalDsl.g:4191:1: ( ( rule__UnaryElement__ExpAssignment_5_2 ) )
            // InternalDsl.g:4192:2: ( rule__UnaryElement__ExpAssignment_5_2 )
            {
             before(grammarAccess.getUnaryElementAccess().getExpAssignment_5_2()); 
            // InternalDsl.g:4193:2: ( rule__UnaryElement__ExpAssignment_5_2 )
            // InternalDsl.g:4193:3: rule__UnaryElement__ExpAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryElement__ExpAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryElementAccess().getExpAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__Group_5__2__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // InternalDsl.g:4202:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4206:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalDsl.g:4207:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1();

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
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // InternalDsl.g:4214:1: rule__NUMBER__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4218:1: ( ( RULE_INT ) )
            // InternalDsl.g:4219:1: ( RULE_INT )
            {
            // InternalDsl.g:4219:1: ( RULE_INT )
            // InternalDsl.g:4220:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // InternalDsl.g:4229:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4233:1: ( rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2 )
            // InternalDsl.g:4234:2: rule__NUMBER__Group_1__1__Impl rule__NUMBER__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__2();

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
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // InternalDsl.g:4241:1: rule__NUMBER__Group_1__1__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4245:1: ( ( '.' ) )
            // InternalDsl.g:4246:1: ( '.' )
            {
            // InternalDsl.g:4246:1: ( '.' )
            // InternalDsl.g:4247:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__2"
    // InternalDsl.g:4256:1: rule__NUMBER__Group_1__2 : rule__NUMBER__Group_1__2__Impl ;
    public final void rule__NUMBER__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4260:1: ( rule__NUMBER__Group_1__2__Impl )
            // InternalDsl.g:4261:2: rule__NUMBER__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__2__Impl();

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
    // $ANTLR end "rule__NUMBER__Group_1__2"


    // $ANTLR start "rule__NUMBER__Group_1__2__Impl"
    // InternalDsl.g:4267:1: rule__NUMBER__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4271:1: ( ( RULE_INT ) )
            // InternalDsl.g:4272:1: ( RULE_INT )
            {
            // InternalDsl.g:4272:1: ( RULE_INT )
            // InternalDsl.g:4273:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__2__Impl"


    // $ANTLR start "rule__RunTimeModel__EnvDataAssignment_1"
    // InternalDsl.g:4283:1: rule__RunTimeModel__EnvDataAssignment_1 : ( ruleEnvironmentMetaData ) ;
    public final void rule__RunTimeModel__EnvDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4287:1: ( ( ruleEnvironmentMetaData ) )
            // InternalDsl.g:4288:2: ( ruleEnvironmentMetaData )
            {
            // InternalDsl.g:4288:2: ( ruleEnvironmentMetaData )
            // InternalDsl.g:4289:3: ruleEnvironmentMetaData
            {
             before(grammarAccess.getRunTimeModelAccess().getEnvDataEnvironmentMetaDataParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentMetaData();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getEnvDataEnvironmentMetaDataParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__EnvDataAssignment_1"


    // $ANTLR start "rule__RunTimeModel__AppDataAssignment_2"
    // InternalDsl.g:4298:1: rule__RunTimeModel__AppDataAssignment_2 : ( ruleAppMetaData ) ;
    public final void rule__RunTimeModel__AppDataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4302:1: ( ( ruleAppMetaData ) )
            // InternalDsl.g:4303:2: ( ruleAppMetaData )
            {
            // InternalDsl.g:4303:2: ( ruleAppMetaData )
            // InternalDsl.g:4304:3: ruleAppMetaData
            {
             before(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAppMetaData();

            state._fsp--;

             after(grammarAccess.getRunTimeModelAccess().getAppDataAppMetaDataParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunTimeModel__AppDataAssignment_2"


    // $ANTLR start "rule__State__NameAssignment"
    // InternalDsl.g:4313:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4317:1: ( ( RULE_ID ) )
            // InternalDsl.g:4318:2: ( RULE_ID )
            {
            // InternalDsl.g:4318:2: ( RULE_ID )
            // InternalDsl.g:4319:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // InternalDsl.g:4328:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4332:1: ( ( RULE_ID ) )
            // InternalDsl.g:4333:2: ( RULE_ID )
            {
            // InternalDsl.g:4333:2: ( RULE_ID )
            // InternalDsl.g:4334:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__StatesAssignment_2_2"
    // InternalDsl.g:4343:1: rule__Resource__StatesAssignment_2_2 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4347:1: ( ( ruleState ) )
            // InternalDsl.g:4348:2: ( ruleState )
            {
            // InternalDsl.g:4348:2: ( ruleState )
            // InternalDsl.g:4349:3: ruleState
            {
             before(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__StatesAssignment_2_2"


    // $ANTLR start "rule__Resource__StatesAssignment_2_3_1"
    // InternalDsl.g:4358:1: rule__Resource__StatesAssignment_2_3_1 : ( ruleState ) ;
    public final void rule__Resource__StatesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4362:1: ( ( ruleState ) )
            // InternalDsl.g:4363:2: ( ruleState )
            {
            // InternalDsl.g:4363:2: ( ruleState )
            // InternalDsl.g:4364:3: ruleState
            {
             before(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getStatesStateParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__StatesAssignment_2_3_1"


    // $ANTLR start "rule__AppMetaData__AppIDAssignment_1"
    // InternalDsl.g:4373:1: rule__AppMetaData__AppIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__AppMetaData__AppIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4377:1: ( ( RULE_ID ) )
            // InternalDsl.g:4378:2: ( RULE_ID )
            {
            // InternalDsl.g:4378:2: ( RULE_ID )
            // InternalDsl.g:4379:3: RULE_ID
            {
             before(grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAppMetaDataAccess().getAppIDIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMetaData__AppIDAssignment_1"


    // $ANTLR start "rule__AppMetaData__SpecificationAssignment_3"
    // InternalDsl.g:4388:1: rule__AppMetaData__SpecificationAssignment_3 : ( ruleSpecification ) ;
    public final void rule__AppMetaData__SpecificationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4392:1: ( ( ruleSpecification ) )
            // InternalDsl.g:4393:2: ( ruleSpecification )
            {
            // InternalDsl.g:4393:2: ( ruleSpecification )
            // InternalDsl.g:4394:3: ruleSpecification
            {
             before(grammarAccess.getAppMetaDataAccess().getSpecificationSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getAppMetaDataAccess().getSpecificationSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppMetaData__SpecificationAssignment_3"


    // $ANTLR start "rule__Specification__SpecIDAssignment_0"
    // InternalDsl.g:4403:1: rule__Specification__SpecIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__Specification__SpecIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4407:1: ( ( RULE_ID ) )
            // InternalDsl.g:4408:2: ( RULE_ID )
            {
            // InternalDsl.g:4408:2: ( RULE_ID )
            // InternalDsl.g:4409:3: RULE_ID
            {
             before(grammarAccess.getSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getSpecIDIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__SpecIDAssignment_0"


    // $ANTLR start "rule__Specification__PriorityAssignment_1_1"
    // InternalDsl.g:4418:1: rule__Specification__PriorityAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Specification__PriorityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4422:1: ( ( RULE_INT ) )
            // InternalDsl.g:4423:2: ( RULE_INT )
            {
            // InternalDsl.g:4423:2: ( RULE_INT )
            // InternalDsl.g:4424:3: RULE_INT
            {
             before(grammarAccess.getSpecificationAccess().getPriorityINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getPriorityINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__PriorityAssignment_1_1"


    // $ANTLR start "rule__Specification__TriggerAssignment_3"
    // InternalDsl.g:4433:1: rule__Specification__TriggerAssignment_3 : ( ruleTrigger ) ;
    public final void rule__Specification__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4437:1: ( ( ruleTrigger ) )
            // InternalDsl.g:4438:2: ( ruleTrigger )
            {
            // InternalDsl.g:4438:2: ( ruleTrigger )
            // InternalDsl.g:4439:3: ruleTrigger
            {
             before(grammarAccess.getSpecificationAccess().getTriggerTriggerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getTriggerTriggerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__TriggerAssignment_3"


    // $ANTLR start "rule__Specification__TriggerAssignment_4_1"
    // InternalDsl.g:4448:1: rule__Specification__TriggerAssignment_4_1 : ( ruleTrigger ) ;
    public final void rule__Specification__TriggerAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4452:1: ( ( ruleTrigger ) )
            // InternalDsl.g:4453:2: ( ruleTrigger )
            {
            // InternalDsl.g:4453:2: ( ruleTrigger )
            // InternalDsl.g:4454:3: ruleTrigger
            {
             before(grammarAccess.getSpecificationAccess().getTriggerTriggerParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getTriggerTriggerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__TriggerAssignment_4_1"


    // $ANTLR start "rule__Specification__IfdoAssignment_5"
    // InternalDsl.g:4463:1: rule__Specification__IfdoAssignment_5 : ( ruleIfDoSpec ) ;
    public final void rule__Specification__IfdoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4467:1: ( ( ruleIfDoSpec ) )
            // InternalDsl.g:4468:2: ( ruleIfDoSpec )
            {
            // InternalDsl.g:4468:2: ( ruleIfDoSpec )
            // InternalDsl.g:4469:3: ruleIfDoSpec
            {
             before(grammarAccess.getSpecificationAccess().getIfdoIfDoSpecParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleIfDoSpec();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getIfdoIfDoSpecParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__IfdoAssignment_5"


    // $ANTLR start "rule__Specification__ElseIfDoAssignment_6"
    // InternalDsl.g:4478:1: rule__Specification__ElseIfDoAssignment_6 : ( ruleElseIfDoSpec ) ;
    public final void rule__Specification__ElseIfDoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4482:1: ( ( ruleElseIfDoSpec ) )
            // InternalDsl.g:4483:2: ( ruleElseIfDoSpec )
            {
            // InternalDsl.g:4483:2: ( ruleElseIfDoSpec )
            // InternalDsl.g:4484:3: ruleElseIfDoSpec
            {
             before(grammarAccess.getSpecificationAccess().getElseIfDoElseIfDoSpecParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleElseIfDoSpec();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getElseIfDoElseIfDoSpecParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__ElseIfDoAssignment_6"


    // $ANTLR start "rule__Specification__ElseDoAssignment_7"
    // InternalDsl.g:4493:1: rule__Specification__ElseDoAssignment_7 : ( ruleElseDoSpec ) ;
    public final void rule__Specification__ElseDoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4497:1: ( ( ruleElseDoSpec ) )
            // InternalDsl.g:4498:2: ( ruleElseDoSpec )
            {
            // InternalDsl.g:4498:2: ( ruleElseDoSpec )
            // InternalDsl.g:4499:3: ruleElseDoSpec
            {
             before(grammarAccess.getSpecificationAccess().getElseDoElseDoSpecParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleElseDoSpec();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getElseDoElseDoSpecParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__ElseDoAssignment_7"


    // $ANTLR start "rule__Trigger__ResourceAssignment_0"
    // InternalDsl.g:4508:1: rule__Trigger__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Trigger__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4512:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4513:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4513:2: ( ( RULE_ID ) )
            // InternalDsl.g:4514:3: ( RULE_ID )
            {
             before(grammarAccess.getTriggerAccess().getResourceResourceCrossReference_0_0()); 
            // InternalDsl.g:4515:3: ( RULE_ID )
            // InternalDsl.g:4516:4: RULE_ID
            {
             before(grammarAccess.getTriggerAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTriggerAccess().getResourceResourceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__ResourceAssignment_0"


    // $ANTLR start "rule__Trigger__StateAssignment_2"
    // InternalDsl.g:4527:1: rule__Trigger__StateAssignment_2 : ( ruleState ) ;
    public final void rule__Trigger__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4531:1: ( ( ruleState ) )
            // InternalDsl.g:4532:2: ( ruleState )
            {
            // InternalDsl.g:4532:2: ( ruleState )
            // InternalDsl.g:4533:3: ruleState
            {
             before(grammarAccess.getTriggerAccess().getStateStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getStateStateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__StateAssignment_2"


    // $ANTLR start "rule__IfDoSpec__ConditionAssignment_1"
    // InternalDsl.g:4542:1: rule__IfDoSpec__ConditionAssignment_1 : ( ruleOrElement ) ;
    public final void rule__IfDoSpec__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4546:1: ( ( ruleOrElement ) )
            // InternalDsl.g:4547:2: ( ruleOrElement )
            {
            // InternalDsl.g:4547:2: ( ruleOrElement )
            // InternalDsl.g:4548:3: ruleOrElement
            {
             before(grammarAccess.getIfDoSpecAccess().getConditionOrElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getIfDoSpecAccess().getConditionOrElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__ConditionAssignment_1"


    // $ANTLR start "rule__IfDoSpec__ActionAssignment_3"
    // InternalDsl.g:4557:1: rule__IfDoSpec__ActionAssignment_3 : ( ruleAction ) ;
    public final void rule__IfDoSpec__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4561:1: ( ( ruleAction ) )
            // InternalDsl.g:4562:2: ( ruleAction )
            {
            // InternalDsl.g:4562:2: ( ruleAction )
            // InternalDsl.g:4563:3: ruleAction
            {
             before(grammarAccess.getIfDoSpecAccess().getActionActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getIfDoSpecAccess().getActionActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__ActionAssignment_3"


    // $ANTLR start "rule__IfDoSpec__ActionAssignment_4_1"
    // InternalDsl.g:4572:1: rule__IfDoSpec__ActionAssignment_4_1 : ( ruleAction ) ;
    public final void rule__IfDoSpec__ActionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4576:1: ( ( ruleAction ) )
            // InternalDsl.g:4577:2: ( ruleAction )
            {
            // InternalDsl.g:4577:2: ( ruleAction )
            // InternalDsl.g:4578:3: ruleAction
            {
             before(grammarAccess.getIfDoSpecAccess().getActionActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getIfDoSpecAccess().getActionActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDoSpec__ActionAssignment_4_1"


    // $ANTLR start "rule__ElseIfDoSpec__ConditionAssignment_2"
    // InternalDsl.g:4587:1: rule__ElseIfDoSpec__ConditionAssignment_2 : ( ruleOrElement ) ;
    public final void rule__ElseIfDoSpec__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4591:1: ( ( ruleOrElement ) )
            // InternalDsl.g:4592:2: ( ruleOrElement )
            {
            // InternalDsl.g:4592:2: ( ruleOrElement )
            // InternalDsl.g:4593:3: ruleOrElement
            {
             before(grammarAccess.getElseIfDoSpecAccess().getConditionOrElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrElement();

            state._fsp--;

             after(grammarAccess.getElseIfDoSpecAccess().getConditionOrElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__ConditionAssignment_2"


    // $ANTLR start "rule__ElseIfDoSpec__ActionAssignment_4"
    // InternalDsl.g:4602:1: rule__ElseIfDoSpec__ActionAssignment_4 : ( ruleAction ) ;
    public final void rule__ElseIfDoSpec__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4606:1: ( ( ruleAction ) )
            // InternalDsl.g:4607:2: ( ruleAction )
            {
            // InternalDsl.g:4607:2: ( ruleAction )
            // InternalDsl.g:4608:3: ruleAction
            {
             before(grammarAccess.getElseIfDoSpecAccess().getActionActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getElseIfDoSpecAccess().getActionActionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__ActionAssignment_4"


    // $ANTLR start "rule__ElseIfDoSpec__ActionAssignment_5_1"
    // InternalDsl.g:4617:1: rule__ElseIfDoSpec__ActionAssignment_5_1 : ( ruleAction ) ;
    public final void rule__ElseIfDoSpec__ActionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4621:1: ( ( ruleAction ) )
            // InternalDsl.g:4622:2: ( ruleAction )
            {
            // InternalDsl.g:4622:2: ( ruleAction )
            // InternalDsl.g:4623:3: ruleAction
            {
             before(grammarAccess.getElseIfDoSpecAccess().getActionActionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getElseIfDoSpecAccess().getActionActionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfDoSpec__ActionAssignment_5_1"


    // $ANTLR start "rule__ElseDoSpec__ActionAssignment_2"
    // InternalDsl.g:4632:1: rule__ElseDoSpec__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__ElseDoSpec__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4636:1: ( ( ruleAction ) )
            // InternalDsl.g:4637:2: ( ruleAction )
            {
            // InternalDsl.g:4637:2: ( ruleAction )
            // InternalDsl.g:4638:3: ruleAction
            {
             before(grammarAccess.getElseDoSpecAccess().getActionActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getElseDoSpecAccess().getActionActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__ActionAssignment_2"


    // $ANTLR start "rule__ElseDoSpec__ActionAssignment_3_1"
    // InternalDsl.g:4647:1: rule__ElseDoSpec__ActionAssignment_3_1 : ( ruleAction ) ;
    public final void rule__ElseDoSpec__ActionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4651:1: ( ( ruleAction ) )
            // InternalDsl.g:4652:2: ( ruleAction )
            {
            // InternalDsl.g:4652:2: ( ruleAction )
            // InternalDsl.g:4653:3: ruleAction
            {
             before(grammarAccess.getElseDoSpecAccess().getActionActionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getElseDoSpecAccess().getActionActionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseDoSpec__ActionAssignment_3_1"


    // $ANTLR start "rule__EnvironmentMetaData__ResourcesAssignment_3"
    // InternalDsl.g:4662:1: rule__EnvironmentMetaData__ResourcesAssignment_3 : ( ruleResource ) ;
    public final void rule__EnvironmentMetaData__ResourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4666:1: ( ( ruleResource ) )
            // InternalDsl.g:4667:2: ( ruleResource )
            {
            // InternalDsl.g:4667:2: ( ruleResource )
            // InternalDsl.g:4668:3: ruleResource
            {
             before(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getEnvironmentMetaDataAccess().getResourcesResourceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentMetaData__ResourcesAssignment_3"


    // $ANTLR start "rule__Action__ResourceAssignment_0"
    // InternalDsl.g:4677:1: rule__Action__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4681:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4682:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4682:2: ( ( RULE_ID ) )
            // InternalDsl.g:4683:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0()); 
            // InternalDsl.g:4684:3: ( RULE_ID )
            // InternalDsl.g:4685:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActionAccess().getResourceResourceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ResourceAssignment_0"


    // $ANTLR start "rule__Action__StateAssignment_2"
    // InternalDsl.g:4696:1: rule__Action__StateAssignment_2 : ( ruleState ) ;
    public final void rule__Action__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4700:1: ( ( ruleState ) )
            // InternalDsl.g:4701:2: ( ruleState )
            {
            // InternalDsl.g:4701:2: ( ruleState )
            // InternalDsl.g:4702:3: ruleState
            {
             before(grammarAccess.getActionAccess().getStateStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getActionAccess().getStateStateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__StateAssignment_2"


    // $ANTLR start "rule__OrElement__RightAssignment_1_2"
    // InternalDsl.g:4711:1: rule__OrElement__RightAssignment_1_2 : ( ruleAndElement ) ;
    public final void rule__OrElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4715:1: ( ( ruleAndElement ) )
            // InternalDsl.g:4716:2: ( ruleAndElement )
            {
            // InternalDsl.g:4716:2: ( ruleAndElement )
            // InternalDsl.g:4717:3: ruleAndElement
            {
             before(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndElement();

            state._fsp--;

             after(grammarAccess.getOrElementAccess().getRightAndElementParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrElement__RightAssignment_1_2"


    // $ANTLR start "rule__AndElement__RightAssignment_1_2"
    // InternalDsl.g:4726:1: rule__AndElement__RightAssignment_1_2 : ( ruleDiffEqualElement ) ;
    public final void rule__AndElement__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4730:1: ( ( ruleDiffEqualElement ) )
            // InternalDsl.g:4731:2: ( ruleDiffEqualElement )
            {
            // InternalDsl.g:4731:2: ( ruleDiffEqualElement )
            // InternalDsl.g:4732:3: ruleDiffEqualElement
            {
             before(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDiffEqualElement();

            state._fsp--;

             after(grammarAccess.getAndElementAccess().getRightDiffEqualElementParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndElement__RightAssignment_1_2"


    // $ANTLR start "rule__DiffEqualElement__RightAssignment_1_0_2"
    // InternalDsl.g:4741:1: rule__DiffEqualElement__RightAssignment_1_0_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4745:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4746:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4746:2: ( ruleCompareElement )
            // InternalDsl.g:4747:3: ruleCompareElement
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__DiffEqualElement__RightAssignment_1_1_2"
    // InternalDsl.g:4756:1: rule__DiffEqualElement__RightAssignment_1_1_2 : ( ruleCompareElement ) ;
    public final void rule__DiffEqualElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4760:1: ( ( ruleCompareElement ) )
            // InternalDsl.g:4761:2: ( ruleCompareElement )
            {
            // InternalDsl.g:4761:2: ( ruleCompareElement )
            // InternalDsl.g:4762:3: ruleCompareElement
            {
             before(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareElement();

            state._fsp--;

             after(grammarAccess.getDiffEqualElementAccess().getRightCompareElementParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiffEqualElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_0_2"
    // InternalDsl.g:4771:1: rule__CompareElement__RightAssignment_1_0_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4775:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4776:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4776:2: ( rulePlusMinusElement )
            // InternalDsl.g:4777:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_1_2"
    // InternalDsl.g:4786:1: rule__CompareElement__RightAssignment_1_1_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4790:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4791:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4791:2: ( rulePlusMinusElement )
            // InternalDsl.g:4792:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_2_2"
    // InternalDsl.g:4801:1: rule__CompareElement__RightAssignment_1_2_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4805:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4806:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4806:2: ( rulePlusMinusElement )
            // InternalDsl.g:4807:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__RightAssignment_1_2_2"


    // $ANTLR start "rule__CompareElement__RightAssignment_1_3_2"
    // InternalDsl.g:4816:1: rule__CompareElement__RightAssignment_1_3_2 : ( rulePlusMinusElement ) ;
    public final void rule__CompareElement__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4820:1: ( ( rulePlusMinusElement ) )
            // InternalDsl.g:4821:2: ( rulePlusMinusElement )
            {
            // InternalDsl.g:4821:2: ( rulePlusMinusElement )
            // InternalDsl.g:4822:3: rulePlusMinusElement
            {
             before(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinusElement();

            state._fsp--;

             after(grammarAccess.getCompareElementAccess().getRightPlusMinusElementParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareElement__RightAssignment_1_3_2"


    // $ANTLR start "rule__PlusMinusElement__RightAssignment_1_0_2"
    // InternalDsl.g:4831:1: rule__PlusMinusElement__RightAssignment_1_0_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4835:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4836:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4836:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4837:3: ruleMultiplicationDivisionElement
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__PlusMinusElement__RightAssignment_1_1_2"
    // InternalDsl.g:4846:1: rule__PlusMinusElement__RightAssignment_1_1_2 : ( ruleMultiplicationDivisionElement ) ;
    public final void rule__PlusMinusElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4850:1: ( ( ruleMultiplicationDivisionElement ) )
            // InternalDsl.g:4851:2: ( ruleMultiplicationDivisionElement )
            {
            // InternalDsl.g:4851:2: ( ruleMultiplicationDivisionElement )
            // InternalDsl.g:4852:3: ruleMultiplicationDivisionElement
            {
             before(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationDivisionElement();

            state._fsp--;

             after(grammarAccess.getPlusMinusElementAccess().getRightMultiplicationDivisionElementParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinusElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__MultiplicationDivisionElement__RightAssignment_1_0_2"
    // InternalDsl.g:4861:1: rule__MultiplicationDivisionElement__RightAssignment_1_0_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4865:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4866:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4866:2: ( ruleUnaryElement )
            // InternalDsl.g:4867:3: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__RightAssignment_1_0_2"


    // $ANTLR start "rule__MultiplicationDivisionElement__RightAssignment_1_1_2"
    // InternalDsl.g:4876:1: rule__MultiplicationDivisionElement__RightAssignment_1_1_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4880:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4881:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4881:2: ( ruleUnaryElement )
            // InternalDsl.g:4882:3: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__RightAssignment_1_1_2"


    // $ANTLR start "rule__MultiplicationDivisionElement__RightAssignment_1_2_2"
    // InternalDsl.g:4891:1: rule__MultiplicationDivisionElement__RightAssignment_1_2_2 : ( ruleUnaryElement ) ;
    public final void rule__MultiplicationDivisionElement__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4895:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4896:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4896:2: ( ruleUnaryElement )
            // InternalDsl.g:4897:3: ruleUnaryElement
            {
             before(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getMultiplicationDivisionElementAccess().getRightUnaryElementParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationDivisionElement__RightAssignment_1_2_2"


    // $ANTLR start "rule__UnaryElement__ValueAssignment_0_1"
    // InternalDsl.g:4906:1: rule__UnaryElement__ValueAssignment_0_1 : ( ruleNUMBER ) ;
    public final void rule__UnaryElement__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4910:1: ( ( ruleNUMBER ) )
            // InternalDsl.g:4911:2: ( ruleNUMBER )
            {
            // InternalDsl.g:4911:2: ( ruleNUMBER )
            // InternalDsl.g:4912:3: ruleNUMBER
            {
             before(grammarAccess.getUnaryElementAccess().getValueNUMBERParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getValueNUMBERParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__ValueAssignment_0_1"


    // $ANTLR start "rule__UnaryElement__ValueAssignment_1_1"
    // InternalDsl.g:4921:1: rule__UnaryElement__ValueAssignment_1_1 : ( RULE_BOOLEAN ) ;
    public final void rule__UnaryElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4925:1: ( ( RULE_BOOLEAN ) )
            // InternalDsl.g:4926:2: ( RULE_BOOLEAN )
            {
            // InternalDsl.g:4926:2: ( RULE_BOOLEAN )
            // InternalDsl.g:4927:3: RULE_BOOLEAN
            {
             before(grammarAccess.getUnaryElementAccess().getValueBOOLEANTerminalRuleCall_1_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getValueBOOLEANTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__ValueAssignment_1_1"


    // $ANTLR start "rule__UnaryElement__ValueAssignment_2_1"
    // InternalDsl.g:4936:1: rule__UnaryElement__ValueAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UnaryElement__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4940:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4941:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4941:2: ( ( RULE_ID ) )
            // InternalDsl.g:4942:3: ( RULE_ID )
            {
             before(grammarAccess.getUnaryElementAccess().getValueResourceCrossReference_2_1_0()); 
            // InternalDsl.g:4943:3: ( RULE_ID )
            // InternalDsl.g:4944:4: RULE_ID
            {
             before(grammarAccess.getUnaryElementAccess().getValueResourceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnaryElementAccess().getValueResourceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getUnaryElementAccess().getValueResourceCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__ValueAssignment_2_1"


    // $ANTLR start "rule__UnaryElement__ValueAssignment_3_1"
    // InternalDsl.g:4955:1: rule__UnaryElement__ValueAssignment_3_1 : ( ruleState ) ;
    public final void rule__UnaryElement__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4959:1: ( ( ruleState ) )
            // InternalDsl.g:4960:2: ( ruleState )
            {
            // InternalDsl.g:4960:2: ( ruleState )
            // InternalDsl.g:4961:3: ruleState
            {
             before(grammarAccess.getUnaryElementAccess().getValueStateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getValueStateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__ValueAssignment_3_1"


    // $ANTLR start "rule__UnaryElement__ExpAssignment_5_2"
    // InternalDsl.g:4970:1: rule__UnaryElement__ExpAssignment_5_2 : ( ruleUnaryElement ) ;
    public final void rule__UnaryElement__ExpAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4974:1: ( ( ruleUnaryElement ) )
            // InternalDsl.g:4975:2: ( ruleUnaryElement )
            {
            // InternalDsl.g:4975:2: ( ruleUnaryElement )
            // InternalDsl.g:4976:3: ruleUnaryElement
            {
             before(grammarAccess.getUnaryElementAccess().getExpUnaryElementParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryElement();

            state._fsp--;

             after(grammarAccess.getUnaryElementAccess().getExpUnaryElementParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryElement__ExpAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000140000000070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});

}