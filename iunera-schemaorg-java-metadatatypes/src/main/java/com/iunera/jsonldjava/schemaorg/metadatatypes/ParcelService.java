package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A private parcel service as the delivery mode available for a certain offer.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#DHL</li>
 * <li>http://purl.org/goodrelations/v1#FederalExpress</li>
 * <li>http://purl.org/goodrelations/v1#UPS</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/ParcelService")
public class ParcelService extends DeliveryMethod {
}
