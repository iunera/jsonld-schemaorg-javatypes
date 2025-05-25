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
 * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
 */
@Vertex
@JsonldType("http://schema.org/GeoShape")
public class GeoShape extends StructuredValue {
    /**
     * The elevation of a location (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
     */
    @JsonldProperty("http://schema.org/elevation")
    public List<java.math.BigDecimal> elevationNumber;

    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     */
    @JsonldProperty("http://schema.org/polygon")
    public String polygon;

    /**
     * Physical address of the item.
     */
    @JsonldProperty("http://schema.org/address")
    public List<PostalAddress> addressPostalAddress;

    /**
     * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>.
     */
    @JsonldProperty("http://schema.org/addressCountry")
    public List<String> addressCountryText;

    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     */
    @JsonldProperty("http://schema.org/circle")
    public String circle;

    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     */
    @JsonldProperty("http://schema.org/box")
    public String box;

    /**
     * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>.
     */
    @JsonldProperty("http://schema.org/addressCountry")
    public List<Country> addressCountryCountry;

    /**
     * The elevation of a location (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
     */
    @JsonldProperty("http://schema.org/elevation")
    public List<String> elevationText;

    /**
     * Physical address of the item.
     */
    @JsonldProperty("http://schema.org/address")
    public List<String> addressText;

    /**
     * The postal code. For example, 94043.
     */
    @JsonldProperty("http://schema.org/postalCode")
    public String postalCode;

    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     */
    @JsonldProperty("http://schema.org/line")
    public String line;
}
