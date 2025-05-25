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
 * A monetary value or range. This type can be used to describe an amount of money such as 50 USD, or a range as in describing a bank account being suitable for a balance between £1,000 and £1,000,000 GBP, or the value of a salary, etc. It is recommended to use <a class="localLink" href="/PriceSpecification">PriceSpecification</a> Types to describe the price of an Offer, Invoice, etc.
 */
@Vertex
@JsonldType("http://schema.org/MonetaryAmount")
public class MonetaryAmount extends StructuredValue {
    /**
     * The value of the quantitative value or property value node.
     * <ul>
     * <li>For <a class="localLink" href="/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
     * <li>For <a class="localLink" href="/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
     * </ul>
     */
    @JsonldProperty("http://schema.org/value")
    public List<Boolean> valueBoolean;

    /**
     * The lower value of some characteristic or property.
     */
    @JsonldProperty("http://schema.org/minValue")
    public java.math.BigDecimal minValue;

    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @JsonldProperty("http://schema.org/validThrough")
    public java.util.Date validThrough;

    /**
     * The date when the item becomes valid.
     */
    @JsonldProperty("http://schema.org/validFrom")
    public java.util.Date validFrom;

    /**
     * The value of the quantitative value or property value node.
     * <ul>
     * <li>For <a class="localLink" href="/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
     * <li>For <a class="localLink" href="/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
     * </ul>
     */
    @JsonldProperty("http://schema.org/value")
    public List<java.math.BigDecimal> valueNumber;

    /**
     * The currency in which the monetary amount is expressed (in 3-letter <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> format).
     */
    @JsonldProperty("http://schema.org/currency")
    public String currency;

    /**
     * The value of the quantitative value or property value node.
     * <ul>
     * <li>For <a class="localLink" href="/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
     * <li>For <a class="localLink" href="/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
     * </ul>
     */
    @JsonldProperty("http://schema.org/value")
    public List<StructuredValue> valueStructuredValue;

    /**
     * The value of the quantitative value or property value node.
     * <ul>
     * <li>For <a class="localLink" href="/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
     * <li>For <a class="localLink" href="/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
     * </ul>
     */
    @JsonldProperty("http://schema.org/value")
    public List<String> valueText;

    /**
     * The upper value of some characteristic or property.
     */
    @JsonldProperty("http://schema.org/maxValue")
    public java.math.BigDecimal maxValue;
}
