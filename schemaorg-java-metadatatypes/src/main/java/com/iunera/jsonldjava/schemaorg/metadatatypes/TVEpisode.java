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
 * A TV episode which can be part of a series or season.
 */
@Vertex
@JsonldType("http://schema.org/TVEpisode")
public class TVEpisode extends Episode {
    /**
     * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>.
     */
    @JsonldProperty("http://schema.org/subtitleLanguage")
    public List<String> subtitleLanguageText;

    /**
     * The country of the principal offices of the production company or individual responsible for the movie or program.
     */
    @JsonldProperty("http://schema.org/countryOfOrigin")
    public Country countryOfOrigin;

    /**
     * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>.
     */
    @JsonldProperty("http://schema.org/subtitleLanguage")
    public List<Language> subtitleLanguageLanguage;
}
