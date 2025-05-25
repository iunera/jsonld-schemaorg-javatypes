package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet exclusive of all animal products. */
@Vertex
@JsonldType("http://schema.org/VeganDiet")
public class VeganDiet extends RestrictedDiet {
}
