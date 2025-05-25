package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates. */
@Vertex
@JsonldType("http://schema.org/SoftwareSourceCode")
public class SoftwareSourceCode extends CreativeWork {
  /**
   * The computer programming language. */
  @JsonldProperty("http://schema.org/programmingLanguage")
  public List<ComputerLanguage> programmingLanguageComputerLanguage;

  /**
   * Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0). */
  @JsonldProperty("http://schema.org/runtimePlatform")
  public String runtimePlatform;

  /**
   * The computer programming language. */
  @JsonldProperty("http://schema.org/programmingLanguage")
  public List<String> programmingLanguageText;

  /**
   * Link to the repository where the un-compiled, human readable code and related code is located (SVN, github, CodePlex). */
  @JsonldProperty("http://schema.org/codeRepository")
  public java.net.URL codeRepository;

  /**
   * Target Operating System / Product to which the code applies.  If applies to several versions, just the product name can be used. */
  @JsonldProperty("http://schema.org/targetProduct")
  public SoftwareApplication targetProduct;

  /**
   * What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template. */
  @JsonldProperty("http://schema.org/codeSampleType")
  public String codeSampleType;
}
