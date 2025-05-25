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
 * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
 */
@Vertex
@JsonldType("http://schema.org/TypeAndQuantityNode")
public class TypeAndQuantityNode extends StructuredValue {
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @JsonldProperty("http://schema.org/unitCode")
    public List<java.net.URL> unitCodeURL;

    /**
     * The product that this structured value is referring to.
     */
    @JsonldProperty("http://schema.org/typeOfGood")
    public List<Service> typeOfGoodService;

    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     */
    @JsonldProperty("http://schema.org/unitText")
    public String unitText;

    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @JsonldProperty("http://schema.org/unitCode")
    public List<String> unitCodeText;

    /**
     * The quantity of the goods included in the offer.
     */
    @JsonldProperty("http://schema.org/amountOfThisGood")
    public java.math.BigDecimal amountOfThisGood;

    /**
     * The product that this structured value is referring to.
     */
    @JsonldProperty("http://schema.org/typeOfGood")
    public List<Product> typeOfGoodProduct;

    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @JsonldProperty("http://schema.org/businessFunction")
    public BusinessFunction businessFunction;
}
