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
 * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
 */
@Vertex
@JsonldType("http://schema.org/SoftwareSourceCode")
public class SoftwareSourceCode extends CreativeWork {
    /**
     * The computer programming language.
     */
    @JsonldProperty("http://schema.org/programmingLanguage")
    public List<ComputerLanguage> programmingLanguageComputerLanguage;

    /**
     * Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0).
     */
    @JsonldProperty("http://schema.org/runtimePlatform")
    public String runtimePlatform;

    /**
     * The computer programming language.
     */
    @JsonldProperty("http://schema.org/programmingLanguage")
    public List<String> programmingLanguageText;

    /**
     * Link to the repository where the un-compiled, human readable code and related code is located (SVN, github, CodePlex).
     */
    @JsonldProperty("http://schema.org/codeRepository")
    public java.net.URL codeRepository;

    /**
     * Target Operating System / Product to which the code applies.  If applies to several versions, just the product name can be used.
     */
    @JsonldProperty("http://schema.org/targetProduct")
    public SoftwareApplication targetProduct;

    /**
     * What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.
     */
    @JsonldProperty("http://schema.org/codeSampleType")
    public String codeSampleType;
}
