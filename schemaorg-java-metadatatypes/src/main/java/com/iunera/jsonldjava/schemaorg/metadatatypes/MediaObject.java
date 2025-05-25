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
 * A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
 */
@Vertex
@JsonldType("http://schema.org/MediaObject")
public class MediaObject extends CreativeWork {
    /**
     * The CreativeWork encoded by this media object.
     */
    @JsonldProperty("http://schema.org/encodesCreativeWork")
    public CreativeWork encodesCreativeWork;

    /**
     * The height of the item.
     */
    @JsonldProperty("http://schema.org/height")
    public List<Distance> heightDistance;

    /**
     * Date the content expires and is no longer useful or available. Useful for videos.
     */
    @JsonldProperty("http://schema.org/expires")
    public java.util.Date expires;

    /**
     * File size in (mega/kilo) bytes.
     */
    @JsonldProperty("http://schema.org/contentSize")
    public String contentSize;

    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are <code>true</code> or <code>false</code> (note that an earlier version had 'yes', 'no').
     */
    @JsonldProperty("http://schema.org/requiresSubscription")
    public Boolean requiresSubscription;

    /**
     * The width of the item.
     */
    @JsonldProperty("http://schema.org/width")
    public List<Distance> widthDistance;

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     */
    @JsonldProperty("http://schema.org/productionCompany")
    public Organization productionCompany;

    /**
     * The regions where the media is allowed. If not specified, then it's assumed to be allowed everywhere. Specify the countries in <a href="http://en.wikipedia.org/wiki/ISO_3166">ISO 3166 format</a>.
     */
    @JsonldProperty("http://schema.org/regionsAllowed")
    public Place regionsAllowed;

    /**
     * A URL pointing to a player for a specific video. In general, this is the information in the <code>src</code> element of an <code>embed</code> tag and should not be the same as the content of the <code>loc</code> tag.
     */
    @JsonldProperty("http://schema.org/embedUrl")
    public java.net.URL embedUrl;

    /**
     * The height of the item.
     */
    @JsonldProperty("http://schema.org/height")
    public List<QuantitativeValue> heightQuantitativeValue;

    /**
     * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
     */
    @JsonldProperty("http://schema.org/duration")
    public Duration duration;

    /**
     * The bitrate of the media object.
     */
    @JsonldProperty("http://schema.org/bitrate")
    public String bitrate;

    /**
     * A NewsArticle associated with the Media Object.
     */
    @JsonldProperty("http://schema.org/associatedArticle")
    public NewsArticle associatedArticle;

    /**
     * mp3, mpeg4, etc.
     */
    @JsonldProperty("http://schema.org/encodingFormat")
    public String encodingFormat;

    /**
     * The width of the item.
     */
    @JsonldProperty("http://schema.org/width")
    public List<QuantitativeValue> widthQuantitativeValue;

    /**
     * Actual bytes of the media object, for example the image file or video file.
     */
    @JsonldProperty("http://schema.org/contentUrl")
    public java.net.URL contentUrl;

    /**
     * Date when this media object was uploaded to this site.
     */
    @JsonldProperty("http://schema.org/uploadDate")
    public java.util.Date uploadDate;

    /**
     * Player type required&#x2014;for example, Flash or Silverlight.
     */
    @JsonldProperty("http://schema.org/playerType")
    public String playerType;
}
