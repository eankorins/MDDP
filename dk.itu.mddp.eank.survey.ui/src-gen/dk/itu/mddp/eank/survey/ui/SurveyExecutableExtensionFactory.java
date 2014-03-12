/*
 * generated by Xtext
 */
package dk.itu.mddp.eank.survey.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import dk.itu.mddp.eank.survey.ui.internal.SurveyActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SurveyExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SurveyActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SurveyActivator.getInstance().getInjector(SurveyActivator.DK_ITU_MDDP_EANK_SURVEY_SURVEY);
	}
	
}