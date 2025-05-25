package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A specific payment status. For example, PaymentDue, PaymentComplete, etc. */
@Vertex
@JsonldType("http://schema.org/PaymentStatusType")
public class PaymentStatusType extends Enumeration {
}
