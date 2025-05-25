package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A business entity type is a conceptual entity representing the legal form, the size, the main line of business, the position in the value chain, or any combination thereof, of an organization or business person.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#Business</li>
 * <li>http://purl.org/goodrelations/v1#Enduser</li>
 * <li>http://purl.org/goodrelations/v1#PublicInstitution</li>
 * <li>http://purl.org/goodrelations/v1#Reseller</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/BusinessEntityType")
public class BusinessEntityType extends Enumeration {
}
