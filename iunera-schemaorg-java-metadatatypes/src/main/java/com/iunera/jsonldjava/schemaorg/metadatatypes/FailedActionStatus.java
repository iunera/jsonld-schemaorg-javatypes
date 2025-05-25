package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An action that failed to complete. The action's error property and the HTTP return code contain more information about the failure. */
@Vertex
@JsonldType("http://schema.org/FailedActionStatus")
public class FailedActionStatus extends ActionStatusType {
}
