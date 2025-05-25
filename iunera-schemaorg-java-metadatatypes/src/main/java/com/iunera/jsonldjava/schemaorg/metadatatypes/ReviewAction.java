package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review. */
@Vertex
@JsonldType("http://schema.org/ReviewAction")
public class ReviewAction extends AssessAction {
  /**
   * A sub property of result. The review that resulted in the performing of the action. */
  @JsonldProperty("http://schema.org/resultReview")
  public Review resultReview;
}
