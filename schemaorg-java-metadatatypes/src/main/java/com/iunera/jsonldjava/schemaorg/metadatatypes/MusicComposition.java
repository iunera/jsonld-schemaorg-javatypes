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
 * A musical composition.
 */
@Vertex
@JsonldType("http://schema.org/MusicComposition")
public class MusicComposition extends CreativeWork {
    /**
     * The words in the song.
     */
    @JsonldProperty("http://schema.org/lyrics")
    public CreativeWork lyrics;

    /**
     * The person who wrote the words.
     */
    @JsonldProperty("http://schema.org/lyricist")
    public Person lyricist;

    /**
     * The date and place the work was first performed.
     */
    @JsonldProperty("http://schema.org/firstPerformance")
    public Event firstPerformance;

    /**
     * Smaller compositions included in this work (e.g. a movement in a symphony).
     */
    @JsonldProperty("http://schema.org/includedComposition")
    public MusicComposition includedComposition;

    /**
     * The International Standard Musical Work Code for the composition.
     */
    @JsonldProperty("http://schema.org/iswcCode")
    public String iswcCode;

    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @JsonldProperty("http://schema.org/composer")
    public List<Organization> composerOrganization;

    /**
     * The type of composition (e.g. overture, sonata, symphony, etc.).
     */
    @JsonldProperty("http://schema.org/musicCompositionForm")
    public String musicCompositionForm;

    /**
     * The key, mode, or scale this composition uses.
     */
    @JsonldProperty("http://schema.org/musicalKey")
    public String musicalKey;

    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @JsonldProperty("http://schema.org/composer")
    public List<Person> composerPerson;

    /**
     * An arrangement derived from the composition.
     */
    @JsonldProperty("http://schema.org/musicArrangement")
    public MusicComposition musicArrangement;
}
