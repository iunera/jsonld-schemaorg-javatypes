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
 * A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.
 */
@Vertex
@JsonldType("http://schema.org/LiveBlogPosting")
public class LiveBlogPosting extends BlogPosting {
    /**
     * The time when the live blog will begin covering the Event. Note that coverage may begin before the Event's start time. The LiveBlogPosting may also be created before coverage begins.
     */
    @JsonldProperty("http://schema.org/coverageStartTime")
    public java.util.Date coverageStartTime;

    /**
     * The time when the live blog will stop covering the Event. Note that coverage may continue after the Event concludes.
     */
    @JsonldProperty("http://schema.org/coverageEndTime")
    public java.util.Date coverageEndTime;

    /**
     * An update to the LiveBlog.
     */
    @JsonldProperty("http://schema.org/liveBlogUpdate")
    public BlogPosting liveBlogUpdate;
}
