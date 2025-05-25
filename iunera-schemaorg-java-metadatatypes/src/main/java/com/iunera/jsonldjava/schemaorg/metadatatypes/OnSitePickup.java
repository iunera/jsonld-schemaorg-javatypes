package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A DeliveryMethod in which an item is collected on site, e.g. in a store or at a box office. */
@Vertex
@JsonldType("http://schema.org/OnSitePickup")
public class OnSitePickup extends DeliveryMethod {
}
