package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An emergency service, such as a fire station or ER. */
@Vertex
@JsonldType("http://schema.org/EmergencyService")
public class EmergencyService extends LocalBusiness {
}
