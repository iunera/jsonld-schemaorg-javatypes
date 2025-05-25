package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Classification of the album by it's type of content: soundtrack, live album, studio album, etc. */
@Vertex
@JsonldType("http://schema.org/MusicAlbumProductionType")
public class MusicAlbumProductionType extends Enumeration {
}
