package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An intangible item that describes an alignment between a learning resource and a node in an educational framework. */
@Vertex
@JsonldType("http://schema.org/AlignmentObject")
public class AlignmentObject extends Intangible {
  /**
   * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationLevel'. */
  @JsonldProperty("http://schema.org/alignmentType")
  public String alignmentType;

  /**
   * The framework to which the resource being described is aligned. */
  @JsonldProperty("http://schema.org/educationalFramework")
  public String educationalFramework;

  /**
   * The name of a node in an established educational framework. */
  @JsonldProperty("http://schema.org/targetName")
  public String targetName;

  /**
   * The description of a node in an established educational framework. */
  @JsonldProperty("http://schema.org/targetDescription")
  public String targetDescription;

  /**
   * The URL of a node in an established educational framework. */
  @JsonldProperty("http://schema.org/targetUrl")
  public java.net.URL targetUrl;
}
