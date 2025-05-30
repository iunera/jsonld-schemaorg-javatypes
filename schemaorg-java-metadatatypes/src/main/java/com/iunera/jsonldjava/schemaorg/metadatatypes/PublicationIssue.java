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
 * A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.
 * <a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.
 */
@Vertex
@JsonldType("http://schema.org/PublicationIssue")
public class PublicationIssue extends CreativeWork {
    /**
     * The page on which the work ends; for example "138" or "xvi".
     */
    @JsonldProperty("http://schema.org/pageEnd")
    public List<String> pageEndText;

    /**
     * Identifies the issue of publication; for example, "iii" or "2".
     */
    @JsonldProperty("http://schema.org/issueNumber")
    public List<Integer> issueNumberInteger;

    /**
     * Identifies the issue of publication; for example, "iii" or "2".
     */
    @JsonldProperty("http://schema.org/issueNumber")
    public List<String> issueNumberText;

    /**
     * The page on which the work starts; for example "135" or "xiii".
     */
    @JsonldProperty("http://schema.org/pageStart")
    public List<String> pageStartText;

    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     */
    @JsonldProperty("http://schema.org/pagination")
    public String pagination;

    /**
     * The page on which the work starts; for example "135" or "xiii".
     */
    @JsonldProperty("http://schema.org/pageStart")
    public List<Integer> pageStartInteger;

    /**
     * The page on which the work ends; for example "138" or "xvi".
     */
    @JsonldProperty("http://schema.org/pageEnd")
    public List<Integer> pageEndInteger;
}
