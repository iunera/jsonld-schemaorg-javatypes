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
 * The costs of settling the payment using a particular payment method.
 */
@Vertex
@JsonldType("http://schema.org/PaymentChargeSpecification")
public class PaymentChargeSpecification extends PriceSpecification {
    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     */
    @JsonldProperty("http://schema.org/appliesToDeliveryMethod")
    public DeliveryMethod appliesToDeliveryMethod;

    /**
     * The payment method(s) to which the payment charge specification applies.
     */
    @JsonldProperty("http://schema.org/appliesToPaymentMethod")
    public PaymentMethod appliesToPaymentMethod;
}
