package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A software application. */
@Vertex
@JsonldType("http://schema.org/SoftwareApplication")
public class SoftwareApplication extends CreativeWork {
  /**
   * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime). */
  @JsonldProperty("http://schema.org/softwareRequirements")
  public List<String> softwareRequirementsText;

  /**
   * Minimum memory requirements. */
  @JsonldProperty("http://schema.org/memoryRequirements")
  public List<java.net.URL> memoryRequirementsURL;

  /**
   * Features or modules provided by this application (and possibly required by other applications). */
  @JsonldProperty("http://schema.org/featureList")
  public List<String> featureListText;

  /**
   * Storage requirements (free space required). */
  @JsonldProperty("http://schema.org/storageRequirements")
  public List<String> storageRequirementsText;

  /**
   * Features or modules provided by this application (and possibly required by other applications). */
  @JsonldProperty("http://schema.org/featureList")
  public List<java.net.URL> featureListURL;

  /**
   * Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed. */
  @JsonldProperty("http://schema.org/fileSize")
  public String fileSize;

  /**
   * Operating systems supported (Windows 7, OSX 10.6, Android 1.6). */
  @JsonldProperty("http://schema.org/operatingSystem")
  public String operatingSystem;

  /**
   * Version of the software instance. */
  @JsonldProperty("http://schema.org/softwareVersion")
  public String softwareVersion;

  /**
   * Software application help. */
  @JsonldProperty("http://schema.org/softwareHelp")
  public CreativeWork softwareHelp;

  /**
   * If the file can be downloaded, URL to download the binary. */
  @JsonldProperty("http://schema.org/downloadUrl")
  public java.net.URL downloadUrl;

  /**
   * Description of what changed in this version. */
  @JsonldProperty("http://schema.org/releaseNotes")
  public List<java.net.URL> releaseNotesURL;

  /**
   * Supporting data for a SoftwareApplication. */
  @JsonldProperty("http://schema.org/supportingData")
  public DataFeed supportingData;

  /**
   * Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi). */
  @JsonldProperty("http://schema.org/permissions")
  public String permissions;

  /**
   * Description of what changed in this version. */
  @JsonldProperty("http://schema.org/releaseNotes")
  public List<String> releaseNotesText;

  /**
   * Subcategory of the application, e.g. 'Arcade Game'. */
  @JsonldProperty("http://schema.org/applicationSubCategory")
  public List<String> applicationSubCategoryText;

  /**
   * A link to a screenshot image of the app. */
  @JsonldProperty("http://schema.org/screenshot")
  public List<java.net.URL> screenshotURL;

  /**
   * Device required to run the application. Used in cases where a specific make/model is required to run the application. */
  @JsonldProperty("http://schema.org/availableOnDevice")
  public String availableOnDevice;

  /**
   * Storage requirements (free space required). */
  @JsonldProperty("http://schema.org/storageRequirements")
  public List<java.net.URL> storageRequirementsURL;

  /**
   * Processor architecture required to run the application (e.g. IA64). */
  @JsonldProperty("http://schema.org/processorRequirements")
  public String processorRequirements;

  /**
   * URL at which the app may be installed, if different from the URL of the item. */
  @JsonldProperty("http://schema.org/installUrl")
  public java.net.URL installUrl;

  /**
   * The name of the application suite to which the application belongs (e.g. Excel belongs to Office). */
  @JsonldProperty("http://schema.org/applicationSuite")
  public String applicationSuite;

  /**
   * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code. */
  @JsonldProperty("http://schema.org/countriesNotSupported")
  public String countriesNotSupported;

  /**
   * Subcategory of the application, e.g. 'Arcade Game'. */
  @JsonldProperty("http://schema.org/applicationSubCategory")
  public List<java.net.URL> applicationSubCategoryURL;

  /**
   * Additional content for a software application. */
  @JsonldProperty("http://schema.org/softwareAddOn")
  public SoftwareApplication softwareAddOn;

  /**
   * Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code. */
  @JsonldProperty("http://schema.org/countriesSupported")
  public String countriesSupported;

  /**
   * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (Examples: DirectX, Java or .NET runtime). */
  @JsonldProperty("http://schema.org/softwareRequirements")
  public List<java.net.URL> softwareRequirementsURL;

  /**
   * A link to a screenshot image of the app. */
  @JsonldProperty("http://schema.org/screenshot")
  public List<ImageObject> screenshotImageObject;

  /**
   * Type of software application, e.g. 'Game, Multimedia'. */
  @JsonldProperty("http://schema.org/applicationCategory")
  public List<String> applicationCategoryText;

  /**
   * Minimum memory requirements. */
  @JsonldProperty("http://schema.org/memoryRequirements")
  public List<String> memoryRequirementsText;

  /**
   * Type of software application, e.g. 'Game, Multimedia'. */
  @JsonldProperty("http://schema.org/applicationCategory")
  public List<java.net.URL> applicationCategoryURL;
}
