package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of intentionally disregarding the object. An agent ignores an object. */
@Vertex
@JsonldType("http://schema.org/IgnoreAction")
public class IgnoreAction extends AssessAction {
}
