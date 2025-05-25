package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of notifying someone that a future event/action is going to happen as expected.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/CancelAction">CancelAction</a>: The antonym of ConfirmAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/ConfirmAction")
public class ConfirmAction extends InformAction {
}
