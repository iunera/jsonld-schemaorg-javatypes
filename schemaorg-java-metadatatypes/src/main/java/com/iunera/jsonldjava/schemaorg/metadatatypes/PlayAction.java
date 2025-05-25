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
 * The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/ListenAction">ListenAction</a>: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.</li>
 * <li><a class="localLink" href="/WatchAction">WatchAction</a>: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content.</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/PlayAction")
public class PlayAction extends Action {
    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @JsonldProperty("http://schema.org/audience")
    public Audience audience;

    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @JsonldProperty("http://schema.org/event")
    public Event event;
}
