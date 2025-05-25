package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#Labor-BringIn</li>
 * <li>http://purl.org/goodrelations/v1#PartsAndLabor-BringIn</li>
 * <li>http://purl.org/goodrelations/v1#PartsAndLabor-PickUp</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/WarrantyScope")
public class WarrantyScope extends Enumeration {
}
