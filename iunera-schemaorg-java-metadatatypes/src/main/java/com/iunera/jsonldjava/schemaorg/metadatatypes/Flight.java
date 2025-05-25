package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An airline flight. */
@Vertex
@JsonldType("http://schema.org/Flight")
public class Flight extends Intangible {
  /**
   * The distance of the flight. */
  @JsonldProperty("http://schema.org/flightDistance")
  public List<Distance> flightDistanceDistance;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Person> sellerPerson;

  /**
   * The airport where the flight terminates. */
  @JsonldProperty("http://schema.org/arrivalAirport")
  public Airport arrivalAirport;

  /**
   * Identifier of the flight's departure gate. */
  @JsonldProperty("http://schema.org/departureGate")
  public String departureGate;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Organization> sellerOrganization;

  /**
   * The expected departure time. */
  @JsonldProperty("http://schema.org/departureTime")
  public java.util.Date departureTime;

  /**
   * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'. */
  @JsonldProperty("http://schema.org/flightNumber")
  public String flightNumber;

  /**
   * The airport where the flight originates. */
  @JsonldProperty("http://schema.org/departureAirport")
  public Airport departureAirport;

  /**
   * The type of boarding policy used by the airline (e.g. zone-based or group-based). */
  @JsonldProperty("http://schema.org/boardingPolicy")
  public BoardingPolicyType boardingPolicy;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Person> providerPerson;

  /**
   * Description of the meals that will be provided or available for purchase. */
  @JsonldProperty("http://schema.org/mealService")
  public String mealService;

  /**
   * The kind of aircraft (e.g., "Boeing 747"). */
  @JsonldProperty("http://schema.org/aircraft")
  public List<Vehicle> aircraftVehicle;

  /**
   * Identifier of the flight's arrival gate. */
  @JsonldProperty("http://schema.org/arrivalGate")
  public String arrivalGate;

  /**
   * Identifier of the flight's departure terminal. */
  @JsonldProperty("http://schema.org/departureTerminal")
  public String departureTerminal;

  /**
   * The estimated time the flight will take. */
  @JsonldProperty("http://schema.org/estimatedFlightDuration")
  public List<Duration> estimatedFlightDurationDuration;

  /**
   * The expected arrival time. */
  @JsonldProperty("http://schema.org/arrivalTime")
  public java.util.Date arrivalTime;

  /**
   * The estimated time the flight will take. */
  @JsonldProperty("http://schema.org/estimatedFlightDuration")
  public List<String> estimatedFlightDurationText;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Organization> providerOrganization;

  /**
   * The kind of aircraft (e.g., "Boeing 747"). */
  @JsonldProperty("http://schema.org/aircraft")
  public List<String> aircraftText;

  /**
   * The time when a passenger can check into the flight online. */
  @JsonldProperty("http://schema.org/webCheckinTime")
  public java.util.Date webCheckinTime;

  /**
   * The distance of the flight. */
  @JsonldProperty("http://schema.org/flightDistance")
  public List<String> flightDistanceText;

  /**
   * Identifier of the flight's arrival terminal. */
  @JsonldProperty("http://schema.org/arrivalTerminal")
  public String arrivalTerminal;
}
