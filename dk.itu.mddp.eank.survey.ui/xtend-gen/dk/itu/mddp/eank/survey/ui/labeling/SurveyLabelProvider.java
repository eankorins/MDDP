/**
 * generated by Xtext
 */
package dk.itu.mddp.eank.survey.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class SurveyLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public SurveyLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}