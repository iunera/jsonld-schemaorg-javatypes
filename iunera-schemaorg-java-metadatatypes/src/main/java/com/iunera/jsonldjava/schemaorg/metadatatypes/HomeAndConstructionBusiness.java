package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A construction business.
 * A HomeAndConstructionBusiness is a <a class="localLink" href="/LocalBusiness">LocalBusiness</a> that provides services around homes and buildings.
 * As a <a class="localLink" href="/LocalBusiness">LocalBusiness</a> it can be described as a <a class="localLink" href="/provider">provider</a> of one or more <a class="localLink" href="/Service">Service</a>(s). */
@Vertex
@JsonldType("http://schema.org/HomeAndConstructionBusiness")
public class HomeAndConstructionBusiness extends LocalBusiness {
}
