package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of searching for an object.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/FindAction">FindAction</a>: SearchAction generally leads to a FindAction, but not necessarily.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/SearchAction")
public class SearchAction extends Action {
  /**
   * A sub property of instrument. The query used on this action. */
  @JsonldProperty("http://schema.org/query")
  public String query;
}
