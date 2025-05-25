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
 * A point value or interval for product characteristics and other purposes.
 */
@Vertex
@JsonldType("http://schema.org/QuantitativeValue")
public class QuantitativeValue extends StructuredValue {
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @JsonldProperty("http://schema.org/unitCode")
    public List<java.net.URL> unitCodeURL;

    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<StructuredValue> valueReferenceStructuredValue;

    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @JsonldProperty("http://schema.org/unitCode")
    public List<String> unitCodeText;

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
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<QualitativeValue> valueReferenceQualitativeValue;

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
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.
     * Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     */
    @JsonldProperty("http://schema.org/additionalProperty")
    public PropertyValue additionalProperty;

    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<QuantitativeValue> valueReferenceQuantitativeValue;

    /**
     * The upper value of some characteristic or property.
     */
    @JsonldProperty("http://schema.org/maxValue")
    public java.math.BigDecimal maxValue;

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
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<Enumeration> valueReferenceEnumeration;

    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     */
    @JsonldProperty("http://schema.org/unitText")
    public String unitText;

    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<PropertyValue> valueReferencePropertyValue;

    /**
     * The value of the quantitative value or property value node.
     * <ul>
     * <li>For <a class="localLink" href="/QuantitativeValue">QuantitativeValue</a> and <a class="localLink" href="/MonetaryAmount">MonetaryAmount</a>, the recommended type for values is 'Number'.</li>
     * <li>For <a class="localLink" href="/PropertyValue">PropertyValue</a>, it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.</li>
     * </ul>
     */
    @JsonldProperty("http://schema.org/value")
    public List<String> valueText;
}
