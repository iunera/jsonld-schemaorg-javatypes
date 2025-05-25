package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of  departing from a place. An agent departs from an fromLocation for a destination, optionally with participants. */
@Vertex
@JsonldType("http://schema.org/DepartAction")
public class DepartAction extends MoveAction {
}
