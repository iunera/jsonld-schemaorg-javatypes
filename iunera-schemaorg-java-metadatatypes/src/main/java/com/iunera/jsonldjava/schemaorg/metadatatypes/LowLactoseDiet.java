package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet appropriate for people with lactose intolerance. */
@Vertex
@JsonldType("http://schema.org/LowLactoseDiet")
public class LowLactoseDiet extends RestrictedDiet {
}
