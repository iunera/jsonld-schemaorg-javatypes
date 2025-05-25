package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A doctor's office. */
@Vertex
@JsonldType("http://schema.org/Physician")
public class Physician extends MedicalOrganization {
}
