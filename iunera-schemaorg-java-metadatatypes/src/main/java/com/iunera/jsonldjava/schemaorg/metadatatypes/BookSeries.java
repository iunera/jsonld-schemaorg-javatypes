package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A series of books. Included books can be indicated with the hasPart property. */
@Vertex
@JsonldType("http://schema.org/BookSeries")
public class BookSeries extends CreativeWorkSeries {
}
