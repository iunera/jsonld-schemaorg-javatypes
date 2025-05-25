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
 * A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#Labor-BringIn</li>
 * <li>http://purl.org/goodrelations/v1#PartsAndLabor-BringIn</li>
 * <li>http://purl.org/goodrelations/v1#PartsAndLabor-PickUp</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/WarrantyScope")
public class WarrantyScope extends Enumeration {
}
