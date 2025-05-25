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
 * An entry point, within some Web-based protocol.
 */
@Vertex
@JsonldType("http://schema.org/EntryPoint")
public class EntryPoint extends Intangible {
    /**
     * An application that can complete the request.
     */
    @JsonldProperty("http://schema.org/actionApplication")
    public SoftwareApplication actionApplication;

    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     */
    @JsonldProperty("http://schema.org/actionPlatform")
    public List<java.net.URL> actionPlatformURL;

    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     */
    @JsonldProperty("http://schema.org/httpMethod")
    public String httpMethod;

    /**
     * The supported encoding type(s) for an EntryPoint request.
     */
    @JsonldProperty("http://schema.org/encodingType")
    public String encodingType;

    /**
     * The supported content type(s) for an EntryPoint response.
     */
    @JsonldProperty("http://schema.org/contentType")
    public String contentType;

    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     */
    @JsonldProperty("http://schema.org/urlTemplate")
    public String urlTemplate;

    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     */
    @JsonldProperty("http://schema.org/actionPlatform")
    public List<String> actionPlatformText;
}
