package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Natural languages such as Spanish, Tamil, Hindi, English, etc. Formal language code tags expressed in <a href="https://en.wikipedia.org/wiki/IETF_language_tag">BCP 47</a> can be used via the <a class="localLink" href="/alternateName">alternateName</a> property. The Language type previously also covered programming languages such as Scheme and Lisp, which are now best represented using <a class="localLink" href="/ComputerLanguage">ComputerLanguage</a>. */
@Vertex
@JsonldType("http://schema.org/Language")
public class Language extends Intangible {
}
