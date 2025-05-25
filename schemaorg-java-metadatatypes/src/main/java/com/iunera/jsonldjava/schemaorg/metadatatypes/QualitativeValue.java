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
 * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
 */
@Vertex
@JsonldType("http://schema.org/QualitativeValue")
public class QualitativeValue extends Enumeration {
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<Enumeration> valueReferenceEnumeration;

    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<StructuredValue> valueReferenceStructuredValue;

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    @JsonldProperty("http://schema.org/greater")
    public QualitativeValue greater;

    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    @JsonldProperty("http://schema.org/equal")
    public QualitativeValue equal;

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    @JsonldProperty("http://schema.org/lesserOrEqual")
    public QualitativeValue lesserOrEqual;

    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<QualitativeValue> valueReferenceQualitativeValue;

    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    @JsonldProperty("http://schema.org/greaterOrEqual")
    public QualitativeValue greaterOrEqual;

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    @JsonldProperty("http://schema.org/lesser")
    public QualitativeValue lesser;

    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @JsonldProperty("http://schema.org/valueReference")
    public List<PropertyValue> valueReferencePropertyValue;

    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    @JsonldProperty("http://schema.org/nonEqual")
    public QualitativeValue nonEqual;

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
}
