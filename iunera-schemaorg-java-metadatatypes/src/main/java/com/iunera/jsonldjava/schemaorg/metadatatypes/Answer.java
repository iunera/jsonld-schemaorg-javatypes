package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An answer offered to a question; perhaps correct, perhaps opinionated or wrong. */
@Vertex
@JsonldType("http://schema.org/Answer")
public class Answer extends Comment {
}
