package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A shop that will buy, or lend money against the security of, personal possessions. */
@Vertex
@JsonldType("http://schema.org/PawnShop")
public class PawnShop extends Store {
}
