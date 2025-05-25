package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/BefriendAction">BefriendAction</a>: Unlike BefriendAction, FollowAction implies that the connection is <em>not</em> necessarily reciprocal.</li>
 * <li><a class="localLink" href="/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.</li>
 * <li><a class="localLink" href="/RegisterAction">RegisterAction</a>: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.</li>
 * <li><a class="localLink" href="/JoinAction">JoinAction</a>: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.</li>
 * <li><a class="localLink" href="/TrackAction">TrackAction</a>: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it).</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/FollowAction")
public class FollowAction extends InteractAction {
  /**
   * A sub property of object. The person or organization being followed. */
  @JsonldProperty("http://schema.org/followee")
  public List<Organization> followeeOrganization;

  /**
   * A sub property of object. The person or organization being followed. */
  @JsonldProperty("http://schema.org/followee")
  public List<Person> followeePerson;
}
