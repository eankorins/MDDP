/**
 */
package survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link survey.Survey#getQuestions <em>Questions</em>}</li>
 *   <li>{@link survey.Survey#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see survey.surveyPackage#getSurvey()
 * @model
 * @generated
 */
public interface Survey extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see survey.surveyPackage#getSurvey_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link survey.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see survey.surveyPackage#getSurvey_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

} // Survey
