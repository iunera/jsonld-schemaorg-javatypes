package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc. */
@Vertex
@JsonldType("http://schema.org/TechArticle")
public class TechArticle extends Article {
  /**
   * Proficiency needed for this content; expected values: 'Beginner', 'Expert'. */
  @JsonldProperty("http://schema.org/proficiencyLevel")
  public String proficiencyLevel;

  /**
   * Prerequisites needed to fulfill steps in article. */
  @JsonldProperty("http://schema.org/dependencies")
  public String dependencies;
}
