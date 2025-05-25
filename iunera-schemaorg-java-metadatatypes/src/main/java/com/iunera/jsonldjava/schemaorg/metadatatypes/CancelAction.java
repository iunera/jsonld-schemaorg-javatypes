package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of asserting that a future event/action is no longer going to happen.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/ConfirmAction">ConfirmAction</a>: The antonym of CancelAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/CancelAction")
public class CancelAction extends PlanAction {
}
