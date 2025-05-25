package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A service for a vehicle for hire with a driver for local travel. Fares are usually calculated based on distance traveled. */
@Vertex
@JsonldType("http://schema.org/TaxiService")
public class TaxiService extends Service {
}
