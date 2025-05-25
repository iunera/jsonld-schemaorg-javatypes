package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The kind of release which this album is: single, EP or album. */
@Vertex
@JsonldType("http://schema.org/MusicAlbumReleaseType")
public class MusicAlbumReleaseType extends Enumeration {
}
