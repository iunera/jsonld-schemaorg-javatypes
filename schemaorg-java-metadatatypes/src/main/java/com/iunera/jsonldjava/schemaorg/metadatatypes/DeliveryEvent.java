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

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An event involving the delivery of an item.
 */
@Vertex
@JsonldType("http://schema.org/DeliveryEvent")
public class DeliveryEvent extends Event {
    /**
     * Method used for delivery or shipping.
     */
    @JsonldProperty("http://schema.org/hasDeliveryMethod")
    public DeliveryMethod hasDeliveryMethod;

    /**
     * After this date, the item will no longer be available for pickup.
     */
    @JsonldProperty("http://schema.org/availableThrough")
    public java.util.Date availableThrough;

    /**
     * When the item is available for pickup from the store, locker, etc.
     */
    @JsonldProperty("http://schema.org/availableFrom")
    public java.util.Date availableFrom;

    /**
     * Password, PIN, or access code needed for delivery (e.g. from a locker).
     */
    @JsonldProperty("http://schema.org/accessCode")
    public String accessCode;
}
