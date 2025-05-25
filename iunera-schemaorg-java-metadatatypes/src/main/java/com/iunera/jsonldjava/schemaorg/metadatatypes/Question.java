package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document. */
@Vertex
@JsonldType("http://schema.org/Question")
public class Question extends CreativeWork {
  /**
   * The answer that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author. */
  @JsonldProperty("http://schema.org/acceptedAnswer")
  public Answer acceptedAnswer;

  /**
   * The number of downvotes this question, answer or comment has received from the community. */
  @JsonldProperty("http://schema.org/downvoteCount")
  public Integer downvoteCount;

  /**
   * The number of answers this question has received. */
  @JsonldProperty("http://schema.org/answerCount")
  public Integer answerCount;

  /**
   * The number of upvotes this question, answer or comment has received from the community. */
  @JsonldProperty("http://schema.org/upvoteCount")
  public Integer upvoteCount;

  /**
   * An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site. */
  @JsonldProperty("http://schema.org/suggestedAnswer")
  public Answer suggestedAnswer;
}
