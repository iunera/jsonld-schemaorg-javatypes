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
 * An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.
 * See also <a href="http://blog.schema.org/2014/04/announcing-schemaorg-actions.html">blog post</a> and <a href="http://schema.org/docs/actions.html">Actions overview document</a>.
 */
@Vertex
@JsonldType("http://schema.org/Action")
public class Action extends Thing {
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. <em>John</em> wrote a book.
     */
    @JsonldProperty("http://schema.org/agent")
    public List<Organization> agentOrganization;

    /**
     * The object that helped the agent perform the action. e.g. John wrote a book with <em>a pen</em>.
     */
    @JsonldProperty("http://schema.org/instrument")
    public Thing instrument;

    /**
     * The object upon the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read <em>a book</em>.
     */
    @JsonldProperty("http://schema.org/object")
    public Thing object;

    /**
     * Indicates a target EntryPoint for an Action.
     */
    @JsonldProperty("http://schema.org/target")
    public EntryPoint target;

    /**
     * The result produced in the action. e.g. John wrote <em>a book</em>.
     */
    @JsonldProperty("http://schema.org/result")
    public Thing result;

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>.
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonldProperty("http://schema.org/endTime")
    public java.util.Date endTime;

    /**
     * For failed actions, more information on the cause of the failure.
     */
    @JsonldProperty("http://schema.org/error")
    public Thing error;

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December.
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonldProperty("http://schema.org/startTime")
    public java.util.Date startTime;

    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with <em>Steve</em>.
     */
    @JsonldProperty("http://schema.org/participant")
    public List<Organization> participantOrganization;

    /**
     * The location of for example where the event is happening, an organization is located, or where an action takes place.
     */
    @JsonldProperty("http://schema.org/location")
    public List<Place> locationPlace;

    /**
     * The location of for example where the event is happening, an organization is located, or where an action takes place.
     */
    @JsonldProperty("http://schema.org/location")
    public List<String> locationText;

    /**
     * Indicates the current disposition of the Action.
     */
    @JsonldProperty("http://schema.org/actionStatus")
    public ActionStatusType actionStatus;

    /**
     * The location of for example where the event is happening, an organization is located, or where an action takes place.
     */
    @JsonldProperty("http://schema.org/location")
    public List<PostalAddress> locationPostalAddress;

    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. <em>John</em> wrote a book.
     */
    @JsonldProperty("http://schema.org/agent")
    public List<Person> agentPerson;

    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with <em>Steve</em>.
     */
    @JsonldProperty("http://schema.org/participant")
    public List<Person> participantPerson;
}
