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
 * An intangible item that describes an alignment between a learning resource and a node in an educational framework.
 */
@Vertex
@JsonldType("http://schema.org/AlignmentObject")
public class AlignmentObject extends Intangible {
    /**
     * A category of alignment between the learning resource and the framework node. Recommended values include: 'assesses', 'teaches', 'requires', 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationLevel'.
     */
    @JsonldProperty("http://schema.org/alignmentType")
    public String alignmentType;

    /**
     * The framework to which the resource being described is aligned.
     */
    @JsonldProperty("http://schema.org/educationalFramework")
    public String educationalFramework;

    /**
     * The name of a node in an established educational framework.
     */
    @JsonldProperty("http://schema.org/targetName")
    public String targetName;

    /**
     * The description of a node in an established educational framework.
     */
    @JsonldProperty("http://schema.org/targetDescription")
    public String targetDescription;

    /**
     * The URL of a node in an established educational framework.
     */
    @JsonldProperty("http://schema.org/targetUrl")
    public java.net.URL targetUrl;
}
