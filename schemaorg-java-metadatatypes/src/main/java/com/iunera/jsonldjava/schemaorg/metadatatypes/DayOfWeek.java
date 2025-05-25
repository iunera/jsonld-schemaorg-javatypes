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

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The day of the week, e.g. used to specify to which day the opening hours of an OpeningHoursSpecification refer.
 * Originally, URLs from <a href="http://purl.org/goodrelations/v1">GoodRelations</a> were used (for <a class="localLink" href="/Monday">Monday</a>, <a class="localLink" href="/Tuesday">Tuesday</a>, <a class="localLink" href="/Wednesday">Wednesday</a>, <a class="localLink" href="/Thursday">Thursday</a>, <a class="localLink" href="/Friday">Friday</a>, <a class="localLink" href="/Saturday">Saturday</a>, <a class="localLink" href="/Sunday">Sunday</a> plus a special entry for <a class="localLink" href="/PublicHolidays">PublicHolidays</a>); these have now been integrated directly into schema.org.
 */
@Vertex
@JsonldType("http://schema.org/DayOfWeek")
public class DayOfWeek extends Enumeration {
}
