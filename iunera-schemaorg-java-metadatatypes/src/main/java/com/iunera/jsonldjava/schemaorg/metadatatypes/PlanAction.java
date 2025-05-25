package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of planning the execution of an event/task/action/reservation/plan to a future date. */
@Vertex
@JsonldType("http://schema.org/PlanAction")
public class PlanAction extends OrganizeAction {
  /**
   * The time the object is scheduled to. */
  @JsonldProperty("http://schema.org/scheduledTime")
  public java.util.Date scheduledTime;
}
