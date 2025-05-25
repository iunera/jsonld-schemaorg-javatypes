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
 * The act of conveying information to another person via a communication medium (instrument) such as speech, email, or telephone conversation.
 */
@Vertex
@JsonldType("http://schema.org/CommunicateAction")
public class CommunicateAction extends InteractAction {
    /**
     * The subject matter of the content.
     */
    @JsonldProperty("http://schema.org/about")
    public Thing about;

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>.
     */
    @JsonldProperty("http://schema.org/inLanguage")
    public List<String> inLanguageText;

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonldProperty("http://schema.org/recipient")
    public List<Audience> recipientAudience;

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonldProperty("http://schema.org/recipient")
    public List<Person> recipientPerson;

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonldProperty("http://schema.org/recipient")
    public List<Organization> recipientOrganization;

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>.
     */
    @JsonldProperty("http://schema.org/inLanguage")
    public List<Language> inLanguageLanguage;
}
