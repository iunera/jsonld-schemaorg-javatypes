package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Properties that take Energy as values are of the form '&lt;Number&gt; &lt;Energy unit of measure&gt;'. */
@Vertex
@JsonldType("http://schema.org/Energy")
public class Energy extends Quantity {
}
