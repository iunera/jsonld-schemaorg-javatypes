package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Structured values are used when the value of a property has a more complex structure than simply being a textual value or a reference to another thing. */
@Vertex
@JsonldType("http://schema.org/StructuredValue")
public class StructuredValue extends Intangible {
}
