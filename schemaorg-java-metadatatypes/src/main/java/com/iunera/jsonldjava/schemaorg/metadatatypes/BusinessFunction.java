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
 * The business function specifies the type of activity or access (i.e., the bundle of rights) offered by the organization or business person through the offer. Typical are sell, rental or lease, maintenance or repair, manufacture / produce, recycle / dispose, engineering / construction, or installation. Proprietary specifications of access rights are also instances of this class.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#ConstructionInstallation</li>
 * <li>http://purl.org/goodrelations/v1#Dispose</li>
 * <li>http://purl.org/goodrelations/v1#LeaseOut</li>
 * <li>http://purl.org/goodrelations/v1#Maintain</li>
 * <li>http://purl.org/goodrelations/v1#ProvideService</li>
 * <li>http://purl.org/goodrelations/v1#Repair</li>
 * <li>http://purl.org/goodrelations/v1#Sell</li>
 * <li>http://purl.org/goodrelations/v1#Buy</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/BusinessFunction")
public class BusinessFunction extends Enumeration {
}
