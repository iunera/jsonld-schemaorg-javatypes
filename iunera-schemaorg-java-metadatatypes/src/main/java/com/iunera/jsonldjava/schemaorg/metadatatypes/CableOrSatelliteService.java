package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A service which provides access to media programming like TV or radio. Access may be via cable or satellite. */
@Vertex
@JsonldType("http://schema.org/CableOrSatelliteService")
public class CableOrSatelliteService extends Service {
}
