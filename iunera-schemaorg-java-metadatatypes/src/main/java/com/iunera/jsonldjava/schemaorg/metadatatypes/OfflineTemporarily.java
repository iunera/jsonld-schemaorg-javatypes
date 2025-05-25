package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Game server status: OfflineTemporarily. Server is offline now but it can be online soon. */
@Vertex
@JsonldType("http://schema.org/OfflineTemporarily")
public class OfflineTemporarily extends GameServerStatus {
}
