package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of expressing a preference from a set of options or a large or unbounded set of choices/options. */
@Vertex
@JsonldType("http://schema.org/ChooseAction")
public class ChooseAction extends AssessAction {
  /**
   * A sub property of object. The options subject to this action. */
  @JsonldProperty("http://schema.org/actionOption")
  public List<String> actionOptionText;

  /**
   * A sub property of object. The options subject to this action. */
  @JsonldProperty("http://schema.org/actionOption")
  public List<Thing> actionOptionThing;
}
