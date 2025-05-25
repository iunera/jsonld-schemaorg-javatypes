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
 * A business entity type is a conceptual entity representing the legal form, the size, the main line of business, the position in the value chain, or any combination thereof, of an organization or business person.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#Business</li>
 * <li>http://purl.org/goodrelations/v1#Enduser</li>
 * <li>http://purl.org/goodrelations/v1#PublicInstitution</li>
 * <li>http://purl.org/goodrelations/v1#Reseller</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/BusinessEntityType")
public class BusinessEntityType extends Enumeration {
}
