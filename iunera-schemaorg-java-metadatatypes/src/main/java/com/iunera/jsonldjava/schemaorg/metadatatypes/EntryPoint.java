package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An entry point, within some Web-based protocol. */
@Vertex
@JsonldType("http://schema.org/EntryPoint")
public class EntryPoint extends Intangible {
  /**
   * An application that can complete the request. */
  @JsonldProperty("http://schema.org/actionApplication")
  public SoftwareApplication actionApplication;

  /**
   * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication. */
  @JsonldProperty("http://schema.org/actionPlatform")
  public List<java.net.URL> actionPlatformURL;

  /**
   * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP. */
  @JsonldProperty("http://schema.org/httpMethod")
  public String httpMethod;

  /**
   * The supported encoding type(s) for an EntryPoint request. */
  @JsonldProperty("http://schema.org/encodingType")
  public String encodingType;

  /**
   * The supported content type(s) for an EntryPoint response. */
  @JsonldProperty("http://schema.org/contentType")
  public String contentType;

  /**
   * An url template (RFC6570) that will be used to construct the target of the execution of the action. */
  @JsonldProperty("http://schema.org/urlTemplate")
  public String urlTemplate;

  /**
   * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication. */
  @JsonldProperty("http://schema.org/actionPlatform")
  public List<String> actionPlatformText;
}
