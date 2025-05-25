package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A LegalService is a business that provides legally-oriented services, advice and representation, e.g. law firms.
 * As a <a class="localLink" href="/LocalBusiness">LocalBusiness</a> it can be described as a <a class="localLink" href="/provider">provider</a> of one or more <a class="localLink" href="/Service">Service</a>(s). */
@Vertex
@JsonldType("http://schema.org/LegalService")
public class LegalService extends LocalBusiness {
}
