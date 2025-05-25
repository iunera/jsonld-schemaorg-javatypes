package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of resuming a device or application which was formerly paused (e.g. resume music playback or resume a timer). */
@Vertex
@JsonldType("http://schema.org/ResumeAction")
public class ResumeAction extends ControlAction {
}
