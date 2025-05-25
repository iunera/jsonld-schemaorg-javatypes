package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet exclusive of animal meat. */
@Vertex
@JsonldType("http://schema.org/VegetarianDiet")
public class VegetarianDiet extends RestrictedDiet {
}
