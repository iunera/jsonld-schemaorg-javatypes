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
 * Reference documentation for application programming interfaces (APIs).
 */
@Vertex
@JsonldType("http://schema.org/APIReference")
public class APIReference extends TechArticle {
    /**
     * Library file name e.g., mscorlib.dll, system.web.dll.
     */
    @JsonldProperty("http://schema.org/executableLibraryName")
    public String executableLibraryName;

    /**
     * Indicates whether API is managed or unmanaged.
     */
    @JsonldProperty("http://schema.org/programmingModel")
    public String programmingModel;

    /**
     * Type of app development: phone, Metro style, desktop, XBox, etc.
     */
    @JsonldProperty("http://schema.org/targetPlatform")
    public String targetPlatform;

    /**
     * Associated product/technology version. e.g., .NET Framework 4.5.
     */
    @JsonldProperty("http://schema.org/assemblyVersion")
    public String assemblyVersion;
}
