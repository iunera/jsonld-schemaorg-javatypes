package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet focused on reduced sodium intake. */
@Vertex
@JsonldType("http://schema.org/LowSaltDiet")
public class LowSaltDiet extends RestrictedDiet {
}
