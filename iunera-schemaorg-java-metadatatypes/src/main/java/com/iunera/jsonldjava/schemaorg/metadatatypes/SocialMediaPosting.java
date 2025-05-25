package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A post to a social media platform, including blog posts, tweets, Facebook posts, etc. */
@Vertex
@JsonldType("http://schema.org/SocialMediaPosting")
public class SocialMediaPosting extends Article {
  /**
   * A CreativeWork such as an image, video, or audio clip shared as part of this posting. */
  @JsonldProperty("http://schema.org/sharedContent")
  public CreativeWork sharedContent;
}
