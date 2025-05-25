package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of inserting at the beginning if an ordered collection. */
@Vertex
@JsonldType("http://schema.org/PrependAction")
public class PrependAction extends InsertAction {
}
