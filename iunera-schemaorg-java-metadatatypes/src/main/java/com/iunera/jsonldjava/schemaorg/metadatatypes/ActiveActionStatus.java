package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An in-progress action (e.g, while watching the movie, or driving to a location). */
@Vertex
@JsonldType("http://schema.org/ActiveActionStatus")
public class ActiveActionStatus extends ActionStatusType {
}
