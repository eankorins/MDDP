package dk.itu.mddp.eank.survey.serializer;

import com.google.inject.Inject;
import dk.itu.mddp.eank.survey.services.SurveyGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSurveySyntacticSequencer extends AbstractSyntacticSequencer {

	protected SurveyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MultipleChoice_AskKeyword_4_0_q;
	protected AbstractElementAlias match_MultipleChoice_CanKeyword_5_1_q;
	protected AbstractElementAlias match_MultipleChoice_ChoiceKeyword_6_3_q;
	protected AbstractElementAlias match_MultipleChoice_FormKeyword_6_2_q;
	protected AbstractElementAlias match_MultipleChoice_FreeKeyword_6_1_q;
	protected AbstractElementAlias match_MultipleChoice_FromKeyword_5_3_q;
	protected AbstractElementAlias match_MultipleChoice_IsRequiredKeyword_3_q;
	protected AbstractElementAlias match_MultipleChoice_TheseKeyword_5_4_q;
	protected AbstractElementAlias match_MultipleChoice_YouKeyword_5_0_q;
	protected AbstractElementAlias match_Open_IsRequiredKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SurveyGrammarAccess) access;
		match_MultipleChoice_AskKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getAskKeyword_4_0());
		match_MultipleChoice_CanKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getCanKeyword_5_1());
		match_MultipleChoice_ChoiceKeyword_6_3_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getChoiceKeyword_6_3());
		match_MultipleChoice_FormKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getFormKeyword_6_2());
		match_MultipleChoice_FreeKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getFreeKeyword_6_1());
		match_MultipleChoice_FromKeyword_5_3_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getFromKeyword_5_3());
		match_MultipleChoice_IsRequiredKeyword_3_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getIsRequiredKeyword_3());
		match_MultipleChoice_TheseKeyword_5_4_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getTheseKeyword_5_4());
		match_MultipleChoice_YouKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getMultipleChoiceAccess().getYouKeyword_5_0());
		match_Open_IsRequiredKeyword_3_q = new TokenAlias(false, true, grammarAccess.getOpenAccess().getIsRequiredKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_MultipleChoice_AskKeyword_4_0_q.equals(syntax))
				emit_MultipleChoice_AskKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_CanKeyword_5_1_q.equals(syntax))
				emit_MultipleChoice_CanKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_ChoiceKeyword_6_3_q.equals(syntax))
				emit_MultipleChoice_ChoiceKeyword_6_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_FormKeyword_6_2_q.equals(syntax))
				emit_MultipleChoice_FormKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_FreeKeyword_6_1_q.equals(syntax))
				emit_MultipleChoice_FreeKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_FromKeyword_5_3_q.equals(syntax))
				emit_MultipleChoice_FromKeyword_5_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_IsRequiredKeyword_3_q.equals(syntax))
				emit_MultipleChoice_IsRequiredKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_TheseKeyword_5_4_q.equals(syntax))
				emit_MultipleChoice_TheseKeyword_5_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleChoice_YouKeyword_5_0_q.equals(syntax))
				emit_MultipleChoice_YouKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Open_IsRequiredKeyword_3_q.equals(syntax))
				emit_Open_IsRequiredKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'ask'?
	 */
	protected void emit_MultipleChoice_AskKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'can'?
	 */
	protected void emit_MultipleChoice_CanKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'choice'?
	 */
	protected void emit_MultipleChoice_ChoiceKeyword_6_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'form'?
	 */
	protected void emit_MultipleChoice_FormKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'free'?
	 */
	protected void emit_MultipleChoice_FreeKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'from'?
	 */
	protected void emit_MultipleChoice_FromKeyword_5_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is required'?
	 */
	protected void emit_MultipleChoice_IsRequiredKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'these'?
	 */
	protected void emit_MultipleChoice_TheseKeyword_5_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'you'?
	 */
	protected void emit_MultipleChoice_YouKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is required'?
	 */
	protected void emit_Open_IsRequiredKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
