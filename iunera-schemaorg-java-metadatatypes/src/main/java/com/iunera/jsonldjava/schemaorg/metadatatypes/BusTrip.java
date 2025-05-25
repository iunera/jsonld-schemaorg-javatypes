package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A trip on a commercial bus line. */
@Vertex
@JsonldType("http://schema.org/BusTrip")
public class BusTrip extends Intangible {
  /**
   * The stop or station from which the bus departs. */
  @JsonldProperty("http://schema.org/departureBusStop")
  public List<BusStation> departureBusStopBusStation;

  /**
   * The stop or station from which the bus departs. */
  @JsonldProperty("http://schema.org/departureBusStop")
  public List<BusStop> departureBusStopBusStop;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Person> providerPerson;

  /**
   * The expected arrival time. */
  @JsonldProperty("http://schema.org/arrivalTime")
  public java.util.Date arrivalTime;

  /**
   * The name of the bus (e.g. Bolt Express). */
  @JsonldProperty("http://schema.org/busName")
  public String busName;

  /**
   * The stop or station from which the bus arrives. */
  @JsonldProperty("http://schema.org/arrivalBusStop")
  public List<BusStation> arrivalBusStopBusStation;

  /**
   * The unique identifier for the bus. */
  @JsonldProperty("http://schema.org/busNumber")
  public String busNumber;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Organization> providerOrganization;

  /**
   * The expected departure time. */
  @JsonldProperty("http://schema.org/departureTime")
  public java.util.Date departureTime;

  /**
   * The stop or station from which the bus arrives. */
  @JsonldProperty("http://schema.org/arrivalBusStop")
  public List<BusStop> arrivalBusStopBusStop;
}
