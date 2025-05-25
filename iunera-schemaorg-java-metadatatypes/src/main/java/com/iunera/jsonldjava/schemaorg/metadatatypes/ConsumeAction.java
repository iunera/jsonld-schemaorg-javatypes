package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of ingesting information/resources/food. */
@Vertex
@JsonldType("http://schema.org/ConsumeAction")
public class ConsumeAction extends Action {
  /**
   * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it. */
  @JsonldProperty("http://schema.org/expectsAcceptanceOf")
  public Offer expectsAcceptanceOf;
}
