package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An ItemList ordered with higher values listed first. */
@Vertex
@JsonldType("http://schema.org/ItemListOrderDescending")
public class ItemListOrderDescending extends ItemListOrderType {
}
