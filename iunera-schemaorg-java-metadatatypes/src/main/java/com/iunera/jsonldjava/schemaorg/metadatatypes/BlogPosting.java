package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A blog post. */
@Vertex
@JsonldType("http://schema.org/BlogPosting")
public class BlogPosting extends SocialMediaPosting {
}
