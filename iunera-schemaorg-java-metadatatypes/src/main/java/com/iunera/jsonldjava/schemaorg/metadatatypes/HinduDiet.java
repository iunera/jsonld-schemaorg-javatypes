package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet conforming to Hindu dietary practices, in particular, beef-free. */
@Vertex
@JsonldType("http://schema.org/HinduDiet")
public class HinduDiet extends RestrictedDiet {
}
