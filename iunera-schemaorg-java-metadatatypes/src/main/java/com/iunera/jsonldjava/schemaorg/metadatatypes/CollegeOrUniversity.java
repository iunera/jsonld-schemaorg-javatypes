package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A college, university, or other third-level educational institution. */
@Vertex
@JsonldType("http://schema.org/CollegeOrUniversity")
public class CollegeOrUniversity extends EducationalOrganization {
}
