package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates. */
@Vertex
@JsonldType("http://schema.org/LiveBlogPosting")
public class LiveBlogPosting extends BlogPosting {
  /**
   * The time when the live blog will begin covering the Event. Note that coverage may begin before the Event's start time. The LiveBlogPosting may also be created before coverage begins. */
  @JsonldProperty("http://schema.org/coverageStartTime")
  public java.util.Date coverageStartTime;

  /**
   * The time when the live blog will stop covering the Event. Note that coverage may continue after the Event concludes. */
  @JsonldProperty("http://schema.org/coverageEndTime")
  public java.util.Date coverageEndTime;

  /**
   * An update to the LiveBlog. */
  @JsonldProperty("http://schema.org/liveBlogUpdate")
  public BlogPosting liveBlogUpdate;
}
