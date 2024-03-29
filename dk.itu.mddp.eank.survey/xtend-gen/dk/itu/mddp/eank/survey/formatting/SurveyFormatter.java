/**
 * generated by Xtext
 */
package dk.itu.mddp.eank.survey.formatting;

import com.google.inject.Inject;
import dk.itu.mddp.eank.survey.services.SurveyGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class SurveyFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private SurveyGrammarAccess _surveyGrammarAccess;
  
  protected void configureFormatting(final FormattingConfig c) {
    List<Pair<Keyword,Keyword>> _findKeywordPairs = this._surveyGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword,Keyword> pair : _findKeywordPairs) {
      {
        Keyword _first = pair.getFirst();
        Keyword _second = pair.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
        Keyword _first_1 = pair.getFirst();
        _setLinewrap.after(_first_1);
        FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(1);
        Keyword _second_1 = pair.getSecond();
        _setLinewrap_1.before(_second_1);
        FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(1);
        Keyword _second_2 = pair.getSecond();
        _setLinewrap_2.after(_second_2);
      }
    }
    List<Keyword> _findKeywords = this._surveyGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comma);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(comma);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap();
        _setLinewrap.after(comma);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this._surveyGrammarAccess.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this._surveyGrammarAccess.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this._surveyGrammarAccess.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
  }
}
