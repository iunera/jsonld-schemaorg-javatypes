package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet conforming to Islamic dietary practices. */
@Vertex
@JsonldType("http://schema.org/HalalDiet")
public class HalalDiet extends RestrictedDiet {
}
