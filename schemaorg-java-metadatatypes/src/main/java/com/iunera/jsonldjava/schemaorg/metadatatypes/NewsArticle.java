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
 * A news article.
 */
@Vertex
@JsonldType("http://schema.org/NewsArticle")
public class NewsArticle extends Article {
    /**
     * If this NewsArticle appears in print, this field indicates the name of the page on which the article is found. Please note that this field is intended for the exact page name (e.g. A5, B18).
     */
    @JsonldProperty("http://schema.org/printPage")
    public String printPage;

    /**
     * The edition of the print product in which the NewsArticle appears.
     */
    @JsonldProperty("http://schema.org/printEdition")
    public String printEdition;

    /**
     * The location where the NewsArticle was produced.
     */
    @JsonldProperty("http://schema.org/dateline")
    public String dateline;

    /**
     * The number of the column in which the NewsArticle appears in the print edition.
     */
    @JsonldProperty("http://schema.org/printColumn")
    public String printColumn;

    /**
     * If this NewsArticle appears in print, this field indicates the print section in which the article appeared.
     */
    @JsonldProperty("http://schema.org/printSection")
    public String printSection;
}
