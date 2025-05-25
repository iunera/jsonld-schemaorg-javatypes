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
 * A single item within a larger data feed.
 */
@Vertex
@JsonldType("http://schema.org/DataFeedItem")
public class DataFeedItem extends Intangible {
    /**
     * The datetime the item was removed from the DataFeed.
     */
    @JsonldProperty("http://schema.org/dateDeleted")
    public java.util.Date dateDeleted;

    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateModified")
    public List<java.util.Date> dateModifiedDateTime;

    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateCreated")
    public List<java.util.Date> dateCreatedDate;

    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateModified")
    public List<java.util.Date> dateModifiedDate;

    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateCreated")
    public List<java.util.Date> dateCreatedDateTime;

    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
     */
    @JsonldProperty("http://schema.org/item")
    public Thing item;
}
