package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of registering to an organization/service without the guarantee to receive it.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/RegisterAction">RegisterAction</a>: Unlike RegisterAction, ApplyAction has no guarantees that the application will be accepted.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/ApplyAction")
public class ApplyAction extends OrganizeAction {
}
