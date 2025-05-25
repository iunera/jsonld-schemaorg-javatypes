package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A diet conforming to Jewish dietary practices. */
@Vertex
@JsonldType("http://schema.org/KosherDiet")
public class KosherDiet extends RestrictedDiet {
}
