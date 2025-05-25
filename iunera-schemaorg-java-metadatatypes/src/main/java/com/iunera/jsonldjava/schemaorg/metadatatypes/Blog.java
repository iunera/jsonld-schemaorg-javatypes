package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A blog. */
@Vertex
@JsonldType("http://schema.org/Blog")
public class Blog extends CreativeWork {
  /**
   * A posting that is part of this blog. */
  @JsonldProperty("http://schema.org/blogPost")
  public BlogPosting blogPost;
}
