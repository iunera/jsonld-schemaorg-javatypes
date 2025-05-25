package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Quantity: Duration (use <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>). */
@Vertex
@JsonldType("http://schema.org/Duration")
public class Duration extends Quantity {
}
