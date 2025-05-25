package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of expressing a desire about the object. An agent wants an object. */
@Vertex
@JsonldType("http://schema.org/WantAction")
public class WantAction extends ReactAction {
}
