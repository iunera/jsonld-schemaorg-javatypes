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
 * An over the air or online broadcast event.
 */
@Vertex
@JsonldType("http://schema.org/BroadcastEvent")
public class BroadcastEvent extends PublicationEvent {
    /**
     * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
     */
    @JsonldProperty("http://schema.org/videoFormat")
    public String videoFormat;

    /**
     * True is the broadcast is of a live event.
     */
    @JsonldProperty("http://schema.org/isLiveBroadcast")
    public Boolean isLiveBroadcast;

    /**
     * The event being broadcast such as a sporting event or awards ceremony.
     */
    @JsonldProperty("http://schema.org/broadcastOfEvent")
    public Event broadcastOfEvent;
}
