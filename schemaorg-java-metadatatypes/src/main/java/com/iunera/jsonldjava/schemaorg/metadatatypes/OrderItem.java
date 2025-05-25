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

import java.util.List;

/**
 * An order item is a line of an order. It includes the quantity and shipping details of a bought offer.
 */
@Vertex
@JsonldType("http://schema.org/OrderItem")
public class OrderItem extends Intangible {
    /**
     * The item ordered.
     */
    @JsonldProperty("http://schema.org/orderedItem")
    public List<Product> orderedItemProduct;

    /**
     * The item ordered.
     */
    @JsonldProperty("http://schema.org/orderedItem")
    public List<OrderItem> orderedItemOrderItem;

    /**
     * The identifier of the order item.
     */
    @JsonldProperty("http://schema.org/orderItemNumber")
    public String orderItemNumber;

    /**
     * The delivery of the parcel related to this order or order item.
     */
    @JsonldProperty("http://schema.org/orderDelivery")
    public ParcelDelivery orderDelivery;

    /**
     * The current status of the order item.
     */
    @JsonldProperty("http://schema.org/orderItemStatus")
    public OrderStatus orderItemStatus;

    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @JsonldProperty("http://schema.org/orderQuantity")
    public java.math.BigDecimal orderQuantity;
}
