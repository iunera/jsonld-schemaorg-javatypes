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
 * A Property value specification.
 */
@Vertex
@JsonldType("http://schema.org/PropertyValueSpecification")
public class PropertyValueSpecification extends Intangible {
    /**
     * The lower value of some characteristic or property.
     */
    @JsonldProperty("http://schema.org/minValue")
    public java.math.BigDecimal minValue;

    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @JsonldProperty("http://schema.org/valueMinLength")
    public java.math.BigDecimal valueMinLength;

    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @JsonldProperty("http://schema.org/defaultValue")
    public List<String> defaultValueText;

    /**
     * Whether multiple values are allowed for the property.  Default is false.
     */
    @JsonldProperty("http://schema.org/multipleValues")
    public Boolean multipleValues;

    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     */
    @JsonldProperty("http://schema.org/valueRequired")
    public Boolean valueRequired;

    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @JsonldProperty("http://schema.org/valueMaxLength")
    public java.math.BigDecimal valueMaxLength;

    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     */
    @JsonldProperty("http://schema.org/valueName")
    public String valueName;

    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @JsonldProperty("http://schema.org/defaultValue")
    public List<Thing> defaultValueThing;

    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     */
    @JsonldProperty("http://schema.org/readonlyValue")
    public Boolean readonlyValue;

    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @JsonldProperty("http://schema.org/stepValue")
    public java.math.BigDecimal stepValue;

    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     */
    @JsonldProperty("http://schema.org/valuePattern")
    public String valuePattern;

    /**
     * The upper value of some characteristic or property.
     */
    @JsonldProperty("http://schema.org/maxValue")
    public java.math.BigDecimal maxValue;
}
