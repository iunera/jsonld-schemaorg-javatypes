package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of allocating an action/event/task to some destination (someone or something). */
@Vertex
@JsonldType("http://schema.org/AssignAction")
public class AssignAction extends AllocateAction {
}
