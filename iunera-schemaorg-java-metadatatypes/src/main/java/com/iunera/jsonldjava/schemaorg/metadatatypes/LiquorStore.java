package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits. */
@Vertex
@JsonldType("http://schema.org/LiquorStore")
public class LiquorStore extends Store {
}
