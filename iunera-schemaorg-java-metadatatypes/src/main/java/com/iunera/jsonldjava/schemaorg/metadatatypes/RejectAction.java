package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of rejecting to/adopting an object.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/AcceptAction">AcceptAction</a>: The antonym of RejectAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/RejectAction")
public class RejectAction extends AllocateAction {
}
