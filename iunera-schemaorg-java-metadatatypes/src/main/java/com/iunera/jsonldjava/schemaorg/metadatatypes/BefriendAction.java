package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of forming a personal connection with someone (object) mutually/bidirectionally/symmetrically.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/FollowAction">FollowAction</a>: Unlike FollowAction, BefriendAction implies that the connection is reciprocal.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/BefriendAction")
public class BefriendAction extends InteractAction {
}
