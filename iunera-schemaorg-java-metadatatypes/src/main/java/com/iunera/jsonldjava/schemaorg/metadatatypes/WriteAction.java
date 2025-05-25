package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of authoring written creative content. */
@Vertex
@JsonldType("http://schema.org/WriteAction")
public class WriteAction extends CreateAction {
  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>. */
  @JsonldProperty("http://schema.org/inLanguage")
  public List<String> inLanguageText;

  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>. */
  @JsonldProperty("http://schema.org/inLanguage")
  public List<Language> inLanguageLanguage;
}
