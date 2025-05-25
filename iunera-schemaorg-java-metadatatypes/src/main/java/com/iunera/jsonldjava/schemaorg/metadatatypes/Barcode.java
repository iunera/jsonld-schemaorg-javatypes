package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An image of a visual machine-readable code such as a barcode or QR code. */
@Vertex
@JsonldType("http://schema.org/Barcode")
public class Barcode extends ImageObject {
}
