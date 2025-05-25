package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * TThe act of finding an object.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/SearchAction">SearchAction</a>: FindAction is generally lead by a SearchAction, but not necessarily.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/FindAction")
public class FindAction extends Action {
}
