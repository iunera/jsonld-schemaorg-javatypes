package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/GiveAction">GiveAction</a>: The reciprocal of TakeAction.</li>
 * <li><a class="localLink" href="/ReceiveAction">ReceiveAction</a>: Unlike ReceiveAction, TakeAction implies that ownership has been transfered.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/TakeAction")
public class TakeAction extends TransferAction {
}
