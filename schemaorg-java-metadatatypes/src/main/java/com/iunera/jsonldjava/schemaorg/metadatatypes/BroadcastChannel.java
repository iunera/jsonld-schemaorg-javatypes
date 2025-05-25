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
 * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
 */
@Vertex
@JsonldType("http://schema.org/BroadcastChannel")
public class BroadcastChannel extends Intangible {
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     */
    @JsonldProperty("http://schema.org/broadcastServiceTier")
    public String broadcastServiceTier;

    /**
     * The BroadcastService offered on this channel.
     */
    @JsonldProperty("http://schema.org/providesBroadcastService")
    public BroadcastService providesBroadcastService;

    /**
     * The CableOrSatelliteService offering the channel.
     */
    @JsonldProperty("http://schema.org/inBroadcastLineup")
    public CableOrSatelliteService inBroadcastLineup;

    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     */
    @JsonldProperty("http://schema.org/broadcastChannelId")
    public String broadcastChannelId;
}
