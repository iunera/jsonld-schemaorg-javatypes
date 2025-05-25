package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A store that sells materials useful or necessary for various hobbies. */
@Vertex
@JsonldType("http://schema.org/HobbyShop")
public class HobbyShop extends Store {
}
