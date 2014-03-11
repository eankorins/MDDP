/**
 */
package survey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see survey.surveyFactory
 * @model kind="package"
 * @generated
 */
public interface surveyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "survey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/dk.itu.mddp.eank.project/model/SurveyModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "surveyModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	surveyPackage eINSTANCE = survey.impl.surveyPackageImpl.init();

	/**
	 * The meta object id for the '{@link survey.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ModelImpl
	 * @see survey.impl.surveyPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Surveys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SURVEYS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.NamedElementImpl
	 * @see survey.impl.surveyPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SurveyImpl
	 * @see survey.impl.surveyPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__QUESTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.QuestionImpl
	 * @see survey.impl.surveyPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SECTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.MultipleChoiceImpl
	 * @see survey.impl.surveyPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__SECTION = QUESTION__SECTION;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__CHOICE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi FORKS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__MULTI_FORKS = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__OTHER = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.OpenImpl
	 * @see survey.impl.surveyPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__SECTION = QUESTION__SECTION;

	/**
	 * The feature id for the '<em><b>Answer Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__ANSWER_LENGTH = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RatingImpl <em>Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RatingImpl
	 * @see survey.impl.surveyPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__SECTION = QUESTION__SECTION;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MIN = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MAX = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__FIRST = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__LAST = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rating Forks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__RATING_FORKS = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ChoiceImpl
	 * @see survey.impl.surveyPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SectionImpl
	 * @see survey.impl.surveyPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RankingImpl
	 * @see survey.impl.surveyPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__SECTION = QUESTION__SECTION;

	/**
	 * The feature id for the '<em><b>Forks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__FORKS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__CHOICES = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.DichotomousImpl <em>Dichotomous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.DichotomousImpl
	 * @see survey.impl.surveyPackageImpl#getDichotomous()
	 * @generated
	 */
	int DICHOTOMOUS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__SECTION = QUESTION__SECTION;

	/**
	 * The feature id for the '<em><b>Yes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__YES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__NO = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dichotomous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dichotomous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.SumConstantImpl <em>Sum Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SumConstantImpl
	 * @see survey.impl.surveyPackageImpl#getSumConstant()
	 * @generated
	 */
	int SUM_CONSTANT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__SECTION = QUESTION__SECTION;

	/**
	 * The number of structural features of the '<em>Sum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.StapleImpl <em>Staple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.StapleImpl
	 * @see survey.impl.surveyPackageImpl#getStaple()
	 * @generated
	 */
	int STAPLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__NAME = RATING__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__QUESTION = RATING__QUESTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__OPTIONAL = RATING__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__SECTION = RATING__SECTION;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MIN = RATING__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MAX = RATING__MAX;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__FIRST = RATING__FIRST;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__LAST = RATING__LAST;

	/**
	 * The feature id for the '<em><b>Rating Forks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__RATING_FORKS = RATING__RATING_FORKS;

	/**
	 * The feature id for the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MID = RATING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Staple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE_FEATURE_COUNT = RATING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Staple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE_OPERATION_COUNT = RATING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.rankingFORKImpl <em>ranking FORK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.rankingFORKImpl
	 * @see survey.impl.surveyPackageImpl#getrankingFORK()
	 * @generated
	 */
	int RANKING_FORK = 13;

	/**
	 * The feature id for the '<em><b>Forkedquestions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__FORKEDQUESTIONS = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__MIN = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__MAX = 2;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK__MATCHER = 3;

	/**
	 * The number of structural features of the '<em>ranking FORK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ranking FORK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.multiForkImpl <em>multi Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.multiForkImpl
	 * @see survey.impl.surveyPackageImpl#getmultiFork()
	 * @generated
	 */
	int MULTI_FORK = 14;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FORK__MATCHER = 0;

	/**
	 * The feature id for the '<em><b>Forkedquestions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FORK__FORKEDQUESTIONS = 1;

	/**
	 * The number of structural features of the '<em>multi Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>multi Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.ratingForkImpl <em>rating Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ratingForkImpl
	 * @see survey.impl.surveyPackageImpl#getratingFork()
	 * @generated
	 */
	int RATING_FORK = 15;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__MAX = 1;

	/**
	 * The feature id for the '<em><b>Forkedquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__FORKEDQUESTION = 2;

	/**
	 * The number of structural features of the '<em>rating Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>rating Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link survey.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see survey.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Model#getSurveys <em>Surveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surveys</em>'.
	 * @see survey.Model#getSurveys()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Surveys();

	/**
	 * Returns the meta object for class '{@link survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see survey.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Survey#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see survey.Survey#getQuestions()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Questions();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Survey#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see survey.Survey#getSections()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Sections();

	/**
	 * Returns the meta object for class '{@link survey.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see survey.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see survey.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see survey.Question#isOptional()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Optional();

	/**
	 * Returns the meta object for the reference '{@link survey.Question#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section</em>'.
	 * @see survey.Question#getSection()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Section();

	/**
	 * Returns the meta object for class '{@link survey.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see survey.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoice#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see survey.MultipleChoice#getChoice()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoice#getMultiFORKS <em>Multi FORKS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi FORKS</em>'.
	 * @see survey.MultipleChoice#getMultiFORKS()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_MultiFORKS();

	/**
	 * Returns the meta object for the attribute '{@link survey.MultipleChoice#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see survey.MultipleChoice#getOther()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Other();

	/**
	 * Returns the meta object for class '{@link survey.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open</em>'.
	 * @see survey.Open
	 * @generated
	 */
	EClass getOpen();

	/**
	 * Returns the meta object for the attribute '{@link survey.Open#getAnswerLength <em>Answer Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Length</em>'.
	 * @see survey.Open#getAnswerLength()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_AnswerLength();

	/**
	 * Returns the meta object for class '{@link survey.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating</em>'.
	 * @see survey.Rating
	 * @generated
	 */
	EClass getRating();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.Rating#getMin()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.Rating#getMax()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Max();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First</em>'.
	 * @see survey.Rating#getFirst()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_First();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last</em>'.
	 * @see survey.Rating#getLast()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Last();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Rating#getRatingForks <em>Rating Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rating Forks</em>'.
	 * @see survey.Rating#getRatingForks()
	 * @see #getRating()
	 * @generated
	 */
	EReference getRating_RatingForks();

	/**
	 * Returns the meta object for class '{@link survey.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see survey.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link survey.Choice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see survey.Choice#getDescription()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Description();

	/**
	 * Returns the meta object for class '{@link survey.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see survey.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link survey.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link survey.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see survey.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for class '{@link survey.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see survey.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Ranking#getForks <em>Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forks</em>'.
	 * @see survey.Ranking#getForks()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Forks();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Ranking#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see survey.Ranking#getChoices()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Choices();

	/**
	 * Returns the meta object for class '{@link survey.Dichotomous <em>Dichotomous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dichotomous</em>'.
	 * @see survey.Dichotomous
	 * @generated
	 */
	EClass getDichotomous();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Dichotomous#getYes <em>Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Yes</em>'.
	 * @see survey.Dichotomous#getYes()
	 * @see #getDichotomous()
	 * @generated
	 */
	EReference getDichotomous_Yes();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Dichotomous#getNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>No</em>'.
	 * @see survey.Dichotomous#getNo()
	 * @see #getDichotomous()
	 * @generated
	 */
	EReference getDichotomous_No();

	/**
	 * Returns the meta object for class '{@link survey.SumConstant <em>Sum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Constant</em>'.
	 * @see survey.SumConstant
	 * @generated
	 */
	EClass getSumConstant();

	/**
	 * Returns the meta object for class '{@link survey.Staple <em>Staple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staple</em>'.
	 * @see survey.Staple
	 * @generated
	 */
	EClass getStaple();

	/**
	 * Returns the meta object for the attribute '{@link survey.Staple#getMid <em>Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid</em>'.
	 * @see survey.Staple#getMid()
	 * @see #getStaple()
	 * @generated
	 */
	EAttribute getStaple_Mid();

	/**
	 * Returns the meta object for class '{@link survey.rankingFORK <em>ranking FORK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ranking FORK</em>'.
	 * @see survey.rankingFORK
	 * @generated
	 */
	EClass getrankingFORK();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.rankingFORK#getForkedquestions <em>Forkedquestions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forkedquestions</em>'.
	 * @see survey.rankingFORK#getForkedquestions()
	 * @see #getrankingFORK()
	 * @generated
	 */
	EReference getrankingFORK_Forkedquestions();

	/**
	 * Returns the meta object for the attribute '{@link survey.rankingFORK#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.rankingFORK#getMin()
	 * @see #getrankingFORK()
	 * @generated
	 */
	EAttribute getrankingFORK_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.rankingFORK#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.rankingFORK#getMax()
	 * @see #getrankingFORK()
	 * @generated
	 */
	EAttribute getrankingFORK_Max();

	/**
	 * Returns the meta object for the reference '{@link survey.rankingFORK#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matcher</em>'.
	 * @see survey.rankingFORK#getMatcher()
	 * @see #getrankingFORK()
	 * @generated
	 */
	EReference getrankingFORK_Matcher();

	/**
	 * Returns the meta object for class '{@link survey.multiFork <em>multi Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>multi Fork</em>'.
	 * @see survey.multiFork
	 * @generated
	 */
	EClass getmultiFork();

	/**
	 * Returns the meta object for the reference '{@link survey.multiFork#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matcher</em>'.
	 * @see survey.multiFork#getMatcher()
	 * @see #getmultiFork()
	 * @generated
	 */
	EReference getmultiFork_Matcher();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.multiFork#getForkedquestions <em>Forkedquestions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forkedquestions</em>'.
	 * @see survey.multiFork#getForkedquestions()
	 * @see #getmultiFork()
	 * @generated
	 */
	EReference getmultiFork_Forkedquestions();

	/**
	 * Returns the meta object for class '{@link survey.ratingFork <em>rating Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>rating Fork</em>'.
	 * @see survey.ratingFork
	 * @generated
	 */
	EClass getratingFork();

	/**
	 * Returns the meta object for the attribute '{@link survey.ratingFork#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.ratingFork#getMin()
	 * @see #getratingFork()
	 * @generated
	 */
	EAttribute getratingFork_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.ratingFork#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.ratingFork#getMax()
	 * @see #getratingFork()
	 * @generated
	 */
	EAttribute getratingFork_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.ratingFork#getForkedquestion <em>Forkedquestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forkedquestion</em>'.
	 * @see survey.ratingFork#getForkedquestion()
	 * @see #getratingFork()
	 * @generated
	 */
	EReference getratingFork_Forkedquestion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	surveyFactory getsurveyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link survey.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ModelImpl
		 * @see survey.impl.surveyPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Surveys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SURVEYS = eINSTANCE.getModel_Surveys();

		/**
		 * The meta object literal for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SurveyImpl
		 * @see survey.impl.surveyPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__QUESTIONS = eINSTANCE.getSurvey_Questions();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__SECTIONS = eINSTANCE.getSurvey_Sections();

		/**
		 * The meta object literal for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.QuestionImpl
		 * @see survey.impl.surveyPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__OPTIONAL = eINSTANCE.getQuestion_Optional();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__SECTION = eINSTANCE.getQuestion_Section();

		/**
		 * The meta object literal for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.MultipleChoiceImpl
		 * @see survey.impl.surveyPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__CHOICE = eINSTANCE.getMultipleChoice_Choice();

		/**
		 * The meta object literal for the '<em><b>Multi FORKS</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__MULTI_FORKS = eINSTANCE.getMultipleChoice_MultiFORKS();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__OTHER = eINSTANCE.getMultipleChoice_Other();

		/**
		 * The meta object literal for the '{@link survey.impl.OpenImpl <em>Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.OpenImpl
		 * @see survey.impl.surveyPackageImpl#getOpen()
		 * @generated
		 */
		EClass OPEN = eINSTANCE.getOpen();

		/**
		 * The meta object literal for the '<em><b>Answer Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__ANSWER_LENGTH = eINSTANCE.getOpen_AnswerLength();

		/**
		 * The meta object literal for the '{@link survey.impl.RatingImpl <em>Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RatingImpl
		 * @see survey.impl.surveyPackageImpl#getRating()
		 * @generated
		 */
		EClass RATING = eINSTANCE.getRating();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__MIN = eINSTANCE.getRating_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__MAX = eINSTANCE.getRating_Max();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__FIRST = eINSTANCE.getRating_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__LAST = eINSTANCE.getRating_Last();

		/**
		 * The meta object literal for the '<em><b>Rating Forks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATING__RATING_FORKS = eINSTANCE.getRating_RatingForks();

		/**
		 * The meta object literal for the '{@link survey.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ChoiceImpl
		 * @see survey.impl.surveyPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DESCRIPTION = eINSTANCE.getChoice_Description();

		/**
		 * The meta object literal for the '{@link survey.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.NamedElementImpl
		 * @see survey.impl.surveyPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link survey.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SectionImpl
		 * @see survey.impl.surveyPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '{@link survey.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RankingImpl
		 * @see survey.impl.surveyPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '<em><b>Forks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__FORKS = eINSTANCE.getRanking_Forks();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__CHOICES = eINSTANCE.getRanking_Choices();

		/**
		 * The meta object literal for the '{@link survey.impl.DichotomousImpl <em>Dichotomous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.DichotomousImpl
		 * @see survey.impl.surveyPackageImpl#getDichotomous()
		 * @generated
		 */
		EClass DICHOTOMOUS = eINSTANCE.getDichotomous();

		/**
		 * The meta object literal for the '<em><b>Yes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICHOTOMOUS__YES = eINSTANCE.getDichotomous_Yes();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICHOTOMOUS__NO = eINSTANCE.getDichotomous_No();

		/**
		 * The meta object literal for the '{@link survey.impl.SumConstantImpl <em>Sum Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SumConstantImpl
		 * @see survey.impl.surveyPackageImpl#getSumConstant()
		 * @generated
		 */
		EClass SUM_CONSTANT = eINSTANCE.getSumConstant();

		/**
		 * The meta object literal for the '{@link survey.impl.StapleImpl <em>Staple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.StapleImpl
		 * @see survey.impl.surveyPackageImpl#getStaple()
		 * @generated
		 */
		EClass STAPLE = eINSTANCE.getStaple();

		/**
		 * The meta object literal for the '<em><b>Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAPLE__MID = eINSTANCE.getStaple_Mid();

		/**
		 * The meta object literal for the '{@link survey.impl.rankingFORKImpl <em>ranking FORK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.rankingFORKImpl
		 * @see survey.impl.surveyPackageImpl#getrankingFORK()
		 * @generated
		 */
		EClass RANKING_FORK = eINSTANCE.getrankingFORK();

		/**
		 * The meta object literal for the '<em><b>Forkedquestions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_FORK__FORKEDQUESTIONS = eINSTANCE.getrankingFORK_Forkedquestions();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_FORK__MIN = eINSTANCE.getrankingFORK_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_FORK__MAX = eINSTANCE.getrankingFORK_Max();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_FORK__MATCHER = eINSTANCE.getrankingFORK_Matcher();

		/**
		 * The meta object literal for the '{@link survey.impl.multiForkImpl <em>multi Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.multiForkImpl
		 * @see survey.impl.surveyPackageImpl#getmultiFork()
		 * @generated
		 */
		EClass MULTI_FORK = eINSTANCE.getmultiFork();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FORK__MATCHER = eINSTANCE.getmultiFork_Matcher();

		/**
		 * The meta object literal for the '<em><b>Forkedquestions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FORK__FORKEDQUESTIONS = eINSTANCE.getmultiFork_Forkedquestions();

		/**
		 * The meta object literal for the '{@link survey.impl.ratingForkImpl <em>rating Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ratingForkImpl
		 * @see survey.impl.surveyPackageImpl#getratingFork()
		 * @generated
		 */
		EClass RATING_FORK = eINSTANCE.getratingFork();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_FORK__MIN = eINSTANCE.getratingFork_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_FORK__MAX = eINSTANCE.getratingFork_Max();

		/**
		 * The meta object literal for the '<em><b>Forkedquestion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATING_FORK__FORKEDQUESTION = eINSTANCE.getratingFork_Forkedquestion();

	}

} //surveyPackage
