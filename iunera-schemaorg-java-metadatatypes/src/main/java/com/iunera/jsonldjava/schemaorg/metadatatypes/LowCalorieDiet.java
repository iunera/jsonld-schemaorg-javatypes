package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet focused on reduced calorie intake. */
@Vertex
@JsonldType("http://schema.org/LowCalorieDiet")
public class LowCalorieDiet extends RestrictedDiet {
}
