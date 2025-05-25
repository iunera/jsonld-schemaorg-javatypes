package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Original definition: "provider of professional services."
 * The general <a class="localLink" href="/ProfessionalService">ProfessionalService</a> type for local businesses was deprecated due to confusion with <a class="localLink" href="/Service">Service</a>. For reference, the types that it included were: <a class="localLink" href="/Dentist">Dentist</a>,
 *         <a class="localLink" href="/AccountingService">AccountingService</a>, <a class="localLink" href="/Attorney">Attorney</a>, <a class="localLink" href="/Notary">Notary</a>, as well as types for several kinds of <a class="localLink" href="/HomeAndConstructionBusiness">HomeAndConstructionBusiness</a>: <a class="localLink" href="/Electrician">Electrician</a>, <a class="localLink" href="/GeneralContractor">GeneralContractor</a>,
 *         <a class="localLink" href="/HousePainter">HousePainter</a>, <a class="localLink" href="/Locksmith">Locksmith</a>, <a class="localLink" href="/Plumber">Plumber</a>, <a class="localLink" href="/RoofingContractor">RoofingContractor</a>. <a class="localLink" href="/LegalService">LegalService</a> was introduced as a more inclusive supertype of <a class="localLink" href="/Attorney">Attorney</a>. */
@Vertex
@JsonldType("http://schema.org/ProfessionalService")
public class ProfessionalService extends LocalBusiness {
}
