package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A trip on a commercial train line. */
@Vertex
@JsonldType("http://schema.org/TrainTrip")
public class TrainTrip extends Intangible {
  /**
   * The station from which the train departs. */
  @JsonldProperty("http://schema.org/departureStation")
  public TrainStation departureStation;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Person> providerPerson;

  /**
   * The platform where the train arrives. */
  @JsonldProperty("http://schema.org/arrivalPlatform")
  public String arrivalPlatform;

  /**
   * The unique identifier for the train. */
  @JsonldProperty("http://schema.org/trainNumber")
  public String trainNumber;

  /**
   * The name of the train (e.g. The Orient Express). */
  @JsonldProperty("http://schema.org/trainName")
  public String trainName;

  /**
   * The expected arrival time. */
  @JsonldProperty("http://schema.org/arrivalTime")
  public java.util.Date arrivalTime;

  /**
   * The platform from which the train departs. */
  @JsonldProperty("http://schema.org/departurePlatform")
  public String departurePlatform;

  /**
   * The station where the train trip ends. */
  @JsonldProperty("http://schema.org/arrivalStation")
  public TrainStation arrivalStation;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Organization> providerOrganization;

  /**
   * The expected departure time. */
  @JsonldProperty("http://schema.org/departureTime")
  public java.util.Date departureTime;
}
