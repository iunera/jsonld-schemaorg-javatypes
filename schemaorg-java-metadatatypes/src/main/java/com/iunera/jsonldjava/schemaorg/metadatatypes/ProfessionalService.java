/*
 * Copyright (C) 2025.  Tim Frey, Christian Schmitt
 *
 * Licensed under the OPEN COMPENSATION TOKEN LICENSE (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at <a href="https://www.license-token.com/license/text">https://www.license-token.com/license/text</a>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @octl.sid: 4efebf98-4efe-ff98-bf98-00004eb04127
 *
 */

package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Original definition: "provider of professional services."
 * The general <a class="localLink" href="/ProfessionalService">ProfessionalService</a> type for local businesses was deprecated due to confusion with <a class="localLink" href="/Service">Service</a>. For reference, the types that it included were: <a class="localLink" href="/Dentist">Dentist</a>,
 * <a class="localLink" href="/AccountingService">AccountingService</a>, <a class="localLink" href="/Attorney">Attorney</a>, <a class="localLink" href="/Notary">Notary</a>, as well as types for several kinds of <a class="localLink" href="/HomeAndConstructionBusiness">HomeAndConstructionBusiness</a>: <a class="localLink" href="/Electrician">Electrician</a>, <a class="localLink" href="/GeneralContractor">GeneralContractor</a>,
 * <a class="localLink" href="/HousePainter">HousePainter</a>, <a class="localLink" href="/Locksmith">Locksmith</a>, <a class="localLink" href="/Plumber">Plumber</a>, <a class="localLink" href="/RoofingContractor">RoofingContractor</a>. <a class="localLink" href="/LegalService">LegalService</a> was introduced as a more inclusive supertype of <a class="localLink" href="/Attorney">Attorney</a>.
 */
@Vertex
@JsonldType("http://schema.org/ProfessionalService")
public class ProfessionalService extends LocalBusiness {
}
