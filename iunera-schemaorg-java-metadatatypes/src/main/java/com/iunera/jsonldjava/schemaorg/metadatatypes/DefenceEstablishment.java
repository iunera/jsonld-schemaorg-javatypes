package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A defence establishment, such as an army or navy base. */
@Vertex
@JsonldType("http://schema.org/DefenceEstablishment")
public class DefenceEstablishment extends GovernmentBuilding {
}
