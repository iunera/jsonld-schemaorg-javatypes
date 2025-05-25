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
 * A delivery method is a standardized procedure for transferring the product or service to the destination of fulfillment chosen by the customer. Delivery methods are characterized by the means of transportation used, and by the organization or group that is the contracting party for the sending organization or person.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#DeliveryModeDirectDownload</li>
 * <li>http://purl.org/goodrelations/v1#DeliveryModeFreight</li>
 * <li>http://purl.org/goodrelations/v1#DeliveryModeMail</li>
 * <li>http://purl.org/goodrelations/v1#DeliveryModeOwnFleet</li>
 * <li>http://purl.org/goodrelations/v1#DeliveryModePickUp</li>
 * <li>http://purl.org/goodrelations/v1#DHL</li>
 * <li>http://purl.org/goodrelations/v1#FederalExpress</li>
 * <li>http://purl.org/goodrelations/v1#UPS</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/DeliveryMethod")
public class DeliveryMethod extends Enumeration {
}
