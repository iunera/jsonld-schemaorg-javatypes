package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of arriving at a place. An agent arrives at a destination from a fromLocation, optionally with participants. */
@Vertex
@JsonldType("http://schema.org/ArriveAction")
public class ArriveAction extends MoveAction {
}
