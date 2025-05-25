package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Professional service: Attorney. 
 * This type is deprecated - <a class="localLink" href="/LegalService">LegalService</a> is more inclusive and less ambiguous. */
@Vertex
@JsonldType("http://schema.org/Attorney")
public class Attorney extends LegalService {
}
