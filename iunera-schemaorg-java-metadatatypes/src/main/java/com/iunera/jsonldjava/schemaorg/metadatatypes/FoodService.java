package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A food service, like breakfast, lunch, or dinner. */
@Vertex
@JsonldType("http://schema.org/FoodService")
public class FoodService extends Service {
}
