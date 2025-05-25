package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A publication event e.g. catch-up TV or radio podcast, during which a program is available on-demand. */
@Vertex
@JsonldType("http://schema.org/OnDemandEvent")
public class OnDemandEvent extends PublicationEvent {
}
