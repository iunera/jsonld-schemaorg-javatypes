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
 * A property-value pair, e.g. representing a feature of a product or place. Use the 'name' property for the name of the property. If there is an additional human-readable version of the value, put that into the 'description' property.
 * Always use specific schema.org properties when a) they exist and b) you can populate them. Using PropertyValue as a substitute will typically not trigger the same effect as using the original, specific property.
 */
@Vertex
@JsonldType("http://schema.org/PropertyValue")
public class PropertyValue extends StructuredValue {
    /**
     * A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
     * (1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
     * a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
     * Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
     */
    @JsonldProperty("http://schema.org/propertyID")
    public List<String> propertyIDText;

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
     * A commonly used identifier for the characteristic represented by the property, e.g. a manufacturer or a standard code for a property. propertyID can be
     * (1) a prefixed string, mainly meant to be used with standards for product properties; (2) a site-specific, non-prefixed string (e.g. the primary key of the property or the vendor-specific id of the property), or (3)
     * a URL indicating the type of the property, either pointing to an external vocabulary, or a Web resource that describes the property (e.g. a glossary entry).
     * Standards bodies should promote a standard prefix for the identifiers of properties from their standards.
     */
    @JsonldProperty("http://schema.org/propertyID")
    public List<java.net.URL> propertyIDURL;

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
