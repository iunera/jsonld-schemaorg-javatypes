package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of expressing a negative sentiment about the object. An agent dislikes an object (a proposition, topic or theme) with participants. */
@Vertex
@JsonldType("http://schema.org/DislikeAction")
public class DislikeAction extends ReactAction {
}
