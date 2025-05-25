package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A camping pitch is an individual place for overnight stay in the outdoors, typically being part of a larger camping site.
 * <br /><br />
 * See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>. */
@Vertex
@JsonldType("http://schema.org/CampingPitch")
public class CampingPitch extends Accommodation {
}
