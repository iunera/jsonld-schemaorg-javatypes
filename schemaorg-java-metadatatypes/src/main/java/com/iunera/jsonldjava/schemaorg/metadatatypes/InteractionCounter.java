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
 * A summary of how users have interacted with this CreativeWork. In most cases, authors will use a subtype to specify the specific type of interaction.
 */
@Vertex
@JsonldType("http://schema.org/InteractionCounter")
public class InteractionCounter extends StructuredValue {
    /**
     * The Action representing the type of interaction. For up votes, +1s, etc. use <a class="localLink" href="/LikeAction">LikeAction</a>. For down votes use <a class="localLink" href="/DislikeAction">DislikeAction</a>. Otherwise, use the most specific Action.
     */
    @JsonldProperty("http://schema.org/interactionType")
    public Action interactionType;

    /**
     * The WebSite or SoftwareApplication where the interactions took place.
     */
    @JsonldProperty("http://schema.org/interactionService")
    public List<WebSite> interactionServiceWebSite;

    /**
     * The WebSite or SoftwareApplication where the interactions took place.
     */
    @JsonldProperty("http://schema.org/interactionService")
    public List<SoftwareApplication> interactionServiceSoftwareApplication;

    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.
     */
    @JsonldProperty("http://schema.org/userInteractionCount")
    public Integer userInteractionCount;
}
