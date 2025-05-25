package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of stopping or deactivating a device or application (e.g. stopping a timer or turning off a flashlight). */
@Vertex
@JsonldType("http://schema.org/DeactivateAction")
public class DeactivateAction extends ControlAction {
}
