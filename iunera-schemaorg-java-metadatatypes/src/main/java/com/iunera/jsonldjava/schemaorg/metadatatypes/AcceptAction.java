package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of committing to/adopting an object.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/RejectAction">RejectAction</a>: The antonym of AcceptAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/AcceptAction")
public class AcceptAction extends AllocateAction {
}
