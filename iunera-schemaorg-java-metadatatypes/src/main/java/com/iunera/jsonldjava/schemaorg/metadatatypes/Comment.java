package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the <a class="localLink" href="/text">text</a> property, and its topic via <a class="localLink" href="/about">about</a>, properties shared with all CreativeWorks. */
@Vertex
@JsonldType("http://schema.org/Comment")
public class Comment extends CreativeWork {
  /**
   * The parent of a question, answer or item in general. */
  @JsonldProperty("http://schema.org/parentItem")
  public Question parentItem;

  /**
   * The number of downvotes this question, answer or comment has received from the community. */
  @JsonldProperty("http://schema.org/downvoteCount")
  public Integer downvoteCount;

  /**
   * The number of upvotes this question, answer or comment has received from the community. */
  @JsonldProperty("http://schema.org/upvoteCount")
  public Integer upvoteCount;
}
