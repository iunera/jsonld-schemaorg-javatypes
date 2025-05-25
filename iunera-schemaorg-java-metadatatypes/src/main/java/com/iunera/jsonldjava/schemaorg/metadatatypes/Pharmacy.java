package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A pharmacy or drugstore. */
@Vertex
@JsonldType("http://schema.org/Pharmacy")
public class Pharmacy extends MedicalOrganization {
}
