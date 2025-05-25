package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Reference documentation for application programming interfaces (APIs). */
@Vertex
@JsonldType("http://schema.org/APIReference")
public class APIReference extends TechArticle {
  /**
   * Library file name e.g., mscorlib.dll, system.web.dll. */
  @JsonldProperty("http://schema.org/executableLibraryName")
  public String executableLibraryName;

  /**
   * Indicates whether API is managed or unmanaged. */
  @JsonldProperty("http://schema.org/programmingModel")
  public String programmingModel;

  /**
   * Type of app development: phone, Metro style, desktop, XBox, etc. */
  @JsonldProperty("http://schema.org/targetPlatform")
  public String targetPlatform;

  /**
   * Associated product/technology version. e.g., .NET Framework 4.5. */
  @JsonldProperty("http://schema.org/assemblyVersion")
  public String assemblyVersion;
}
