package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space. */
@Vertex
@JsonldType("http://schema.org/Vehicle")
public class Vehicle extends Product {
  /**
   * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience. */
  @JsonldProperty("http://schema.org/vehicleInteriorType")
  public String vehicleInteriorType;

  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars). */
  @JsonldProperty("http://schema.org/vehicleTransmission")
  public List<java.net.URL> vehicleTransmissionURL;

  /**
   * The number of owners of the vehicle, including the current one.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfPreviousOwners")
  public List<java.math.BigDecimal> numberOfPreviousOwnersNumber;

  /**
   * The date of production of the item, e.g. vehicle. */
  @JsonldProperty("http://schema.org/productionDate")
  public java.util.Date productionDate;

  /**
   * The number of owners of the vehicle, including the current one.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfPreviousOwners")
  public List<QuantitativeValue> numberOfPreviousOwnersQuantitativeValue;

  /**
   * A textual description of known damages, both repaired and unrepaired. */
  @JsonldProperty("http://schema.org/knownVehicleDamages")
  public String knownVehicleDamages;

  /**
   * The number of doors.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfDoors")
  public List<java.math.BigDecimal> numberOfDoorsNumber;

  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle. */
  @JsonldProperty("http://schema.org/fuelType")
  public List<String> fuelTypeText;

  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars). */
  @JsonldProperty("http://schema.org/vehicleTransmission")
  public List<QualitativeValue> vehicleTransmissionQualitativeValue;

  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.
   * Typical unit code(s): C62 for persons. */
  @JsonldProperty("http://schema.org/vehicleSeatingCapacity")
  public List<QuantitativeValue> vehicleSeatingCapacityQuantitativeValue;

  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle. */
  @JsonldProperty("http://schema.org/fuelType")
  public List<QualitativeValue> fuelTypeQualitativeValue;

  /**
   * The number of axles.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfAxles")
  public List<java.math.BigDecimal> numberOfAxlesNumber;

  /**
   * The number of doors.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfDoors")
  public List<QuantitativeValue> numberOfDoorsQuantitativeValue;

  /**
   * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.
   * Typical unit code(s): KMT for kilometers, SMI for statute miles */
  @JsonldProperty("http://schema.org/mileageFromOdometer")
  public QuantitativeValue mileageFromOdometer;

  /**
   * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.
   * Typical unit code(s): C62 for persons. */
  @JsonldProperty("http://schema.org/vehicleSeatingCapacity")
  public List<java.math.BigDecimal> vehicleSeatingCapacityNumber;

  /**
   * The position of the steering wheel or similar device (mostly for cars). */
  @JsonldProperty("http://schema.org/steeringPosition")
  public SteeringPositionValue steeringPosition;

  /**
   * The number of axles.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfAxles")
  public List<QuantitativeValue> numberOfAxlesQuantitativeValue;

  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle. */
  @JsonldProperty("http://schema.org/fuelType")
  public List<java.net.URL> fuelTypeURL;

  /**
   * The number or type of airbags in the vehicle. */
  @JsonldProperty("http://schema.org/numberOfAirbags")
  public List<java.math.BigDecimal> numberOfAirbagsNumber;

  /**
   * The total number of forward gears available for the transmission system of the vehicle.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfForwardGears")
  public List<java.math.BigDecimal> numberOfForwardGearsNumber;

  /**
   * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles. */
  @JsonldProperty("http://schema.org/vehicleIdentificationNumber")
  public String vehicleIdentificationNumber;

  /**
   * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars). */
  @JsonldProperty("http://schema.org/vehicleTransmission")
  public List<String> vehicleTransmissionText;

  /**
   * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale. */
  @JsonldProperty("http://schema.org/vehicleSpecialUsage")
  public String vehicleSpecialUsage;

  /**
   * The date the item e.g. vehicle was purchased by the current owner. */
  @JsonldProperty("http://schema.org/purchaseDate")
  public java.util.Date purchaseDate;

  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain. */
  @JsonldProperty("http://schema.org/driveWheelConfiguration")
  public List<String> driveWheelConfigurationText;

  /**
   * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain. */
  @JsonldProperty("http://schema.org/driveWheelConfiguration")
  public List<DriveWheelConfigurationValue> driveWheelConfigurationDriveWheelConfigurationValue;

  /**
   * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).
   * <ul>
   * <li>Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use <a class="localLink" href="/unitText">unitText</a> to indicate the unit of measurement, e.g. L/100 km.</li>
   * <li>Note 2: There are two ways of indicating the fuel consumption, <a class="localLink" href="/fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a class="localLink" href="/fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.</li>
   * <li>Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a class="localLink" href="/valueReference">valueReference</a> to link the value for the fuel consumption to another value.</li>
   * </ul> */
  @JsonldProperty("http://schema.org/fuelConsumption")
  public QuantitativeValue fuelConsumption;

  /**
   * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'. */
  @JsonldProperty("http://schema.org/vehicleConfiguration")
  public String vehicleConfiguration;

  /**
   * The number or type of airbags in the vehicle. */
  @JsonldProperty("http://schema.org/numberOfAirbags")
  public List<String> numberOfAirbagsText;

  /**
   * The date of the first registration of the vehicle with the respective public authorities. */
  @JsonldProperty("http://schema.org/dateVehicleFirstRegistered")
  public java.util.Date dateVehicleFirstRegistered;

  /**
   * The total number of forward gears available for the transmission system of the vehicle.
   * Typical unit code(s): C62 */
  @JsonldProperty("http://schema.org/numberOfForwardGears")
  public List<QuantitativeValue> numberOfForwardGearsQuantitativeValue;

  /**
   * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).
   * <ul>
   * <li>Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use <a class="localLink" href="/unitText">unitText</a> to indicate the unit of measurement, e.g. mpg or km/L.</li>
   * <li>Note 2: There are two ways of indicating the fuel consumption, <a class="localLink" href="/fuelConsumption">fuelConsumption</a> (e.g. 8 liters per 100 km) and <a class="localLink" href="/fuelEfficiency">fuelEfficiency</a> (e.g. 30 miles per gallon). They are reciprocal.</li>
   * <li>Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use <a class="localLink" href="/valueReference">valueReference</a> to link the value for the fuel economy to another value.</li>
   * </ul> */
  @JsonldProperty("http://schema.org/fuelEfficiency")
  public QuantitativeValue fuelEfficiency;

  /**
   * The release date of a vehicle model (often used to differentiate versions of the same make and model). */
  @JsonldProperty("http://schema.org/vehicleModelDate")
  public java.util.Date vehicleModelDate;

  /**
   * The color or color combination of the interior of the vehicle. */
  @JsonldProperty("http://schema.org/vehicleInteriorColor")
  public String vehicleInteriorColor;

  /**
   * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.
   * Typical unit code(s): LTR for liters, FTQ for cubic foot/feet
   * Note: You can use <a class="localLink" href="/minValue">minValue</a> and <a class="localLink" href="/maxValue">maxValue</a> to indicate ranges. */
  @JsonldProperty("http://schema.org/cargoVolume")
  public QuantitativeValue cargoVolume;

  /**
   * Information about the engine or engines of the vehicle. */
  @JsonldProperty("http://schema.org/vehicleEngine")
  public EngineSpecification vehicleEngine;
}
