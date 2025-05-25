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
 * Intended audience for an item, i.e. the group for whom the item was created.
 */
@Vertex
@JsonldType("http://schema.org/Audience")
public class Audience extends Intangible {
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    @JsonldProperty("http://schema.org/audienceType")
    public String audienceType;

    /**
     * The geographic area associated with the audience.
     */
    @JsonldProperty("http://schema.org/geographicArea")
    public AdministrativeArea geographicArea;
}
