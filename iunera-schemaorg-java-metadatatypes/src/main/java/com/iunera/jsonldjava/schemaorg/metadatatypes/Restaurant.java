package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A restaurant. */
@Vertex
@JsonldType("http://schema.org/Restaurant")
public class Restaurant extends FoodEstablishment {
}
