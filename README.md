# Schema.org Datatypes for Java

[Schema.org Datatypes](https://schema.org/) are vital for [NLWeb](https://www.iunera.com/kraken/machine-learning-ai/nlweb-enables-ai-powered-websites/) and AI
projects. AI training is often most efficient when data is structured in [JSON-LD](https://json-ld.org/) according to Schema.org principles. Since much
enterprise data resides in the [Java ecosystem](https://www.oracle.com/java/), we faced requirements in past [AI projects](https://iunera.com) to serialize Java
objects into compliant Schema.org JSON-LD.

We regularly faced challenges retrieving data from graph databases (using TinkerPop, Gremlin, Azure Graph, Spring Data, and more) and transforming it into
JSON-LD for AI training. A collection of semantically clear Java classes proved invaluable for mapping and serialization.

The rise of NLWeb prompted us to share our proven Java Schema.org JSON-LD collection, previously used to enable semantic data storage in graph databases for
enterprise applications. We believe an open web requires sharing knowledge to promote semantic data.

Fundamentally, we share three things:

1. A collection of Java classes representing JSON-LD Schema.org entities.
2. Example utilities:
   a. A class for mapping enterprise Java objects to [JSON-LD Java](https://github.com/jsonld-java/jsonld-java) objects.
   b. An extendable serializer for compliant Schema.org JSON-LD output.
3. A root generator (pre-manual cleanup) to create custom Java classes for JSON-LD entities or modify generation logic.

Components 1 and 2 are available as a [Maven](https://maven.apache.org/) module for easy integration. Learn more about Iunera’s initiatives in
our [blog post](https://www.iunera.com/kraken/machine-learning-ai/nlweb-enables-ai-powered-websites/).

## How it works

1. Just instantiate and fill the fields of the classes in ```com.iunera.jsonldjava.schemaorg.metadatatypes``` which are named after Schema.org Things and
   contain their fields.
2. Use a ```SimpleSerializer.toJsonLd(myFilledObject)``` and obtain a JSON-LD string of the object compliant to Schema.org
3. Feed this JSON-LD string into your NLWeb instance or in another way into an AI.

## Table of Contents

- [Overview](#overview)
- [How it works](#how-it-works)
- [Key Features](#key-features)
- [Why Use Schema.org Datatypes in Java?](#why-use-schemaorg-datatypes-in-java)
- [Examples and JSON LD generation for Schema.org Classes](#examples-and-json-ld-generation-for-schemaorg-classes)
- [Mapping Enterprise Data to Schema.org Classes](#mapping-enterprise-data-to-schemaorg-classes)
- [Remarks on Annotations](#remarks-on-annotations)
- [Generating JSON-LD](#generating-json-ld)
- [How to Generate your Schema.org Java Classes from scratch](#how-to-generate-your-schemaorg-java-classes-from-scratch)
- [Contributing](#contributing)
- [Credits](#credits)
- [License](#license)

## Overview

Schema.org Datatypes for Java provides a robust solution for integrating Schema.org structured data into Java applications, particularly
for [NLWeb](https://news.microsoft.com/source/features/company-news/introducing-nlweb-bringing-conversational-interfaces-directly-to-the-web/) and AI-driven
projects. The project consists of two modules:

- **Library**: Distributes the generated classes (e.g., `Person`, `Product`) and utility classes for mapping and JSON-LD serialization, supporting semantic data
  storage in graph databases like OrientDB (used successfully and [Azure Cosmos DB](https://learn.microsoft.com/en-us/azure/cosmos-db/gremlin/introduction)
  worked well for the JSON-LD types).
- **Generator**: Processes schema.org JSON-LD to generate Java classes with annotations for JSON-LD and graph database compatibility[^1].

[^1]: Spring Data Gremlin is [deprecated](https://github.com/microsoft/spring-data-gremlin). However, we keep our implementation generic and provide a generic
Vertex annotation to avoid deprecated dependencies. Just annotate the Vertex annotation to the DB native one and it will work well, in case you require a graph
DB as backend. In all other cases the provided mapping helper class for DTO or DAOs works well.

## Key Features

- Provides a library of Schema.org-based Java classes and utilities (datatypes module).
- Supports Schema.org hierarchies (e.g., `Person` extends `Thing`, `AutoRepair` extends `AutomotiveBusiness`).
- Handles multi-inheritance via aggregation.
- Maps Schema.org datatypes to Java (e.g., Text to String, Number to BigDecimal).
- Includes utilities for mapping enterprise objects and JSON-LD serialization.
- Generates Java classes from schema.org JSON-LD using JavaPoet (generator module).
- Built to be integrated with enterprise standards like TinkerPop Gremlin and Spring Data.

## Why Use Schema.org Datatypes in Java?

For developers working with Schema.org in Java, this project offers a comprehensive solution for building AI-driven applications and NLWeb projects. By
providing pre-built Java classes for Schema.org entities, it simplifies JSON-LD serialization and integration with graph databases like OrientDB, Neo4j, or
Azure Cosmos DB. Key benefits include:

- **Efficient AI Training**: Structured JSON-LD data enhances AI model training by providing semantically rich, machine-readable data.
- **Enterprise Integration**: Seamless compatibility with Java ecosystems, Spring Data, and TinkerPop Gremlin for enterprise applications.
- **Semantic Interoperability**: Ensures consistent data models across systems, ideal for NLWeb AI and semantic web projects.
- **Customizable Generation**: The generator module allows tailored Java class creation for specific Schema.org needs.

This project is meant for developers who want to map their enterprise objects to JSON-LD to use them for AI training. We included even the generator that in
case there are [custom JSON-LD objects or extensions](https://json-ld.org/spec/ED/json-ld-syntax/20111016/#vocabulary-prefixes) (which is quite often the case
in enterprises).

## Examples and JSON LD generation for Schema.org Classes

The datatypes library includes Java classes in the `com.iunera.jsonldjava.schemaorg.metadatatypes` package, representing Schema.org entities. Below are
examples, including `Person` and `CreativeWork`, demonstrating their structure and usage.

### CreativeWork Datatype Example

The `CreativeWork` class represents creative outputs like books, movies, or datasets, ideal for AI training data.

```java
package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.net.URL;
import java.util.List;

/**
 * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
 */
@Vertex
@JsonldType("http://schema.org/CreativeWork")
public class CreativeWork extends Thing {
  @JsonldProperty("http://schema.org/about")
  public Thing about;
  @JsonldProperty("http://schema.org/keywords")
  public String keywords;
  @JsonldProperty("http://schema.org/license")
  public List<URL> licenseURL;
  // Other properties...
}
```

**Instantiating CreativeWork**
Below is an example of instantiating a JSON-LD object with the OCTL license:

```java
import com.iunera.jsonldjava.schemaorg.metadatatypes.CreativeWork;
import com.iunera.jsonldjava.schemaorg.metadatatypes.Thing;
import java.net.URL;
import java.util.Date;
import java.util.List;

public class CreativeWorkExample {
    public static void main(String[] args) throws Exception {
        CreativeWork aiTrainingData = new CreativeWork();
        aiTrainingData.about = new Thing() {{ name = "AI Training Dataset"; }};
        aiTrainingData.keywords = "AI, machine learning, semantic data";
        aiTrainingData.licenseURL = List.of(new URL("https://github.com/open-compensation-token-license/license/blob/main/LICENSE.md"));
        aiTrainingData.dateCreatedDate = List.of(new Date());
    }
}

## Mapping Enterprise Data to Schema.org Classes
Use the `FieldMapper` utility to map fields from a source object (e.g., a DTO) to Schema.org classes (e.g., `Person`, `PostalAddress`) based on a field name mapping, then serialize to JSON-LD.

**Note**: The `FieldMapper` class is available in `com.iunera.jsonldjava.schemaorg.utils` within the datatypes module.

```

### Person Datatype Example

```java
@Vertex
@JsonldType("http://schema.org/Person")
public abstract class Person extends Thing {
  @JsonldProperty("http://schema.org/givenName")
  public String givenName;
  @JsonldProperty("http://schema.org/birthDate")
  public java.util.Date birthDate;
  @JsonldProperty("http://schema.org/address")
  public List<PostalAddress> addressPostalAddress;
  // Other properties...
}
```

**Mapping a Person**

```java
import com.iunera.jsonldjava.schemaorg.metadatatypes.Person;
import com.iunera.jsonldjava.schemaorg.metadatatypes.PostalAddress;
import com.iunera.jsonldjava.schemaorg.utils.FieldMapper;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Example DTO class
class PersonDTO {
    public String firstName;
    public Date birthDate;
    public String street;
    public String city;
    public String zipCode;
}

public class MappingAPerson {
    public static void main(String[] args) throws Exception {
        // Define field mappings (source field -> target field)
        Map<String, String> fieldMappings = Map.of(
            "firstName", "givenName",
            "birthDate", "birthDate",
            "street", "streetAddress",
            "city", "addressLocality",
            "zipCode", "postalCode"
        );

        // Create a source DTO
        PersonDTO source = new PersonDTO();
        source.firstName = "John Doe";
        source.birthDate = new Date();
        source.street = "123 Main St";
        source.city = "Springfield";
        source.zipCode = "12345";

        // Create target Person and PostalAddress
        Person target = new Person() {
            @Override
            public Set<TwitterAccount> getAssociatedTwitterAccounts() {
                return null; // Implement if needed
            }
        };
        PostalAddress address = new PostalAddress();
        target.addressPostalAddress = List.of(address);

        // Copy fields with mapping
        FieldMapper mapper = new FieldMapper(fieldMappings, new HashSet<>(List.of("ignoredField")));
        mapper.copyFieldsWithMapping(target, source);
        mapper.copyFieldsWithMapping(address, source);
    }
}
```

### Example: Mapping NLWeb as SoftwareApplication

Below is another example mapping a `SoftwareApplication` DTO representing the NLWeb Project with an MIT license.

```java
import com.iunera.jsonldjava.schemaorg.metadatatypes.SoftwareApplication;
import com.iunera.jsonldjava.schemaorg.utils.FieldMapper;
import java.net.URL;
import java.util.Map;
import java.util.Set;

// Example DTO for NLWeb
class NLWebDTO {
    public String appName;
    public String appVersion;
    public String licenseUrl;
}

public class NLWebMappingExample {
    public static void main(String[] args) throws Exception {
        // Define field mappings (source field -> target field)
        Map<String, String> fieldMappings = Map.of(
            "appName", "name",
            "appVersion", "softwareVersion",
            "licenseUrl", "license"
        );

        // Create a source DTO
        NLWebDTO source = new NLWebDTO();
        source.appName = "NLWeb";
        source.appVersion = "1.0";
        source.licenseUrl = "https://opensource.org/licenses/MIT";

        // Create target SoftwareApplication
        SoftwareApplication target = new SoftwareApplication();

        // Copy fields with mapping
        FieldMapper mapper = new FieldMapper(fieldMappings, new HashSet<>(List.of("ignoredField")));
        mapper.copyFieldsWithMapping(target, source);
    }
}
```

## Remarks on Annotations

One saw the annotations on the datatypes.
Annotations guide users to the Schema.org documentation, add semantics to the code, and serve as input for storage or JSON-LD generation. They also support
composition interpretation for Schema.org’s multi-inheritance cases. They are located in the `com.iunera.jsonldjava.schemaorg.associations` package:

- **`@Vertex`**: Marks classes as graph database vertices.
- **`@JsonldType`**: Specifies the Schema.org type (e.g., `http://schema.org/Product`).
- **`@JsonldProperty`**: Maps fields to Schema.org properties.
- **`@Edge`**: Marks graph database relationships.
- **`@JsonldLink`**: Defines link metadata (rel, name, href).
- **`@JsonldLinks`**: Container for multiple `@JsonldLink` annotations.

## Generating JSON-LD

The datatypes library provides Schema.org Java classes and utilities for enterprise applications or JSON-LD serialization.

### 1. Add the Dependency

In your project’s `pom.xml`, if published to Maven Central:

```xml
<dependency>
  <groupId>com.iunera.schemaorg</groupId>
  <artifactId>schemaorg-java-datatypes</artifactId>
  <version>1.0</version>
</dependency>
```

For a local JAR:

```bash
mvn install:install-file -Dfile=schemaorg-java-datatypes-1.0.jar -DgroupId=com.iunera.schemaorg -DartifactId=schemaorg-java-datatypes -Dversion=1.0 -Dpackaging=jar
```

### 2. Add JSON-LD Java (Optional)

For JSON-LD serialization:

```xml
<dependency>
  <groupId>com.github.jsonld-java</groupId>
  <artifactId>jsonld-java</artifactId>
  <version>0.13.4</version>
</dependency>
```

### 3. Serializing

The `SimpleSerializer` class is included in the library. You can implement more complex serialization scenarios using JSON-LD Java, similar to
`SimpleSerializer`, which is sufficient for many cases. For a complete serializer implementation, create a custom serializer to map `@JsonldType`,
`@JsonldProperty`, and other annotations.

```java
// Serialize to JSON-LD
String jsonLd = SimpleSerializer.toJsonLd(target);
System.out.println(jsonLd);
```

Here is an example of usage and output:

#### Person Example generated

**Output**:

```json
{
  "@context": "http://schema.org",
  "@type": "Person",
  "givenName": "John Doe",
  "birthDate": "2025-05-26T00:35:00.000Z",
  "address": {
    "@type": "PostalAddress",
    "streetAddress": "123 Main St",
    "addressLocality": "Springfield",
    "postalCode": "12345"
  }
}
```

#### CreativeWork Example generated

**Output**:

```json
{
  "@context": "http://schema.org",
  "@type": "CreativeWork",
  "about": {
    "@type": "Thing",
    "name": "AI Training Dataset"
  },
  "keywords": "AI, machine learning, semantic data",
  "license": "https://github.com/open-compensation-token-license/license/blob/main/LICENSE.md",
  "dateCreated": "2025-05-26T00:35:00.000Z"
}
```

#### SoftwareApplication Example generated

```json
{
  "@context": "http://schema.org",
  "@type": "SoftwareApplication",
  "name": "NLWeb",
  "softwareVersion": "1.0",
  "license": "https://opensource.org/licenses/MIT"
}
```

## How to Generate your Schema.org Java Classes from scratch

To generate custom Schema.org Java classes using the generator module:

1. Clone the repository:
   ```bash
   git clone https://github.com/iunera/schemaorg-java-datatypes.git
   cd schemaorg-java/schemaorg-java-generator
   ```

2. Download `schema.jsonld`:
    - Obtain the latest `schema.jsonld` from schema.org.
    - Place it in `schemaorg-java-generator/src/main/resources/`.

3. Customize the Generator:
    - Adjust the code of `com.iunera.schemaorg.generator.SimpleGenerator` and related classes (`RDFClassToJavaClassExtraktor`, `RDFProperty`) in
      `src/main/java/com/iunera/schemaorg/generator/`. You can:
        - Add custom annotations to the generated classes.
        - Change the output directory (default: `src/main/java/com/iunera/jsonldjava/schemaorg/metadatatypes/`).
        - Modify the generation logic (e.g., field naming, class structure).
    - **Note**: The generation uses JavaPoet, which is deprecated but effective for one-time generation. The process may encounter issues with certain JSON-LD
      types, requiring manual cleanup (e.g., fixing missing fields or incorrect annotations).

4. Build the project:
   ```bash
   mvn clean install
   ```

5. Run the Generator:
    - Execute the `SimpleGenerator`:
      ```bash
      mvn exec:java -Dexec.mainClass="com.iunera.schemaorg.generator.SimpleGenerator"
      ```
    - Classes are output to the specified directory (default: `src/main/java/com/iunera/jsonldjava/schemaorg/metadatatypes/`).

6. Verify Output:
    - Check classes (e.g., `Person.java`, `CreativeWork.java`) in the output directory.

## Contributing

We welcome contributions! To contribute:

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature/your-feature`).
3. Register your OCTL SID at [https://www.license-token.com/license/submit](https://www.license-token.com/license/submit).
4. Commit changes (`git commit -m "Add your feature"`).
5. Push to the branch (`git push origin feature/your-feature`).
6. Open a pull request and mention your OCTL SID to ensure fair earnings for commercial use.

Ensure code follows the project’s style, includes tests, and complies with OCTL 1.0 terms via
the [license token link](https://www.license-token.com/license/new-procurement/x-octl-sid%3A4efebf98-4efe-ff98-bf98-00004eb04127).

## Credits

Developed by:

- Dr. Tim Frey (contact@iunera.com)
- Christian Schmitt (contact@iunera.com)

## License

We choose fair [code, fair work, fair payment, open collaboration](https://www.license-token.com).

## [Open Compensation Token License](https://www.license-token.com/license/text)

```
Licensed under the OPEN COMPENSATION TOKEN LICENSE (the "License").

You may not use this file except in compliance with the License.

You may obtain a copy of the License at
[https://github.com/open-compensation-token-license/license/blob/main/LICENSE.md](https://github.com/open-compensation-token-license/license/blob/main/LICENSE.md)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
See the License for the specific language governing permissions and
limitations under the License.

@octl.sid: 4efebf98-4efe-ff98-bf98-00004eb04127
```

@octl.sid: [x-octl-sid:4efebf98-4efe-ff98-bf98-00004eb04127](https://www.license-token.com/license/new-procurement/x-octl-sid%3A4efebf98-4efe-ff98-bf98-00004eb04127)

* Why did we [choose the OCTL as alternative to the BSD 3-Clause License](https://www.license-token.com/wiki/unveiling-bsd-3-clause-license-summary)?
* Why we [do NOT apply Apache 2.0 License](https://www.license-token.com/wiki/the-downside-of-apache-license-and-why-i-never-would-use-it)?

This project is licensed under the Open Compensation Token License (OCTL), with the unique project identifier
`X-octl-sid: 4efebf98-4efe-ff98-bf98-00004eb04127`. The OCTL enables blockchain-based licensing and royalty distribution via NFTs. View the license token
at [https://www.license-token.com/license/new-procurement/x-octl-sid%3A4efebf98-4efe-ff98-bf98-00004eb04127](https://www.license-token.com/license/new-procurement/x-octl-sid%3A4efebf98-4efe-ff98-bf98-00004eb04127).
See the [LICENSE](LICENSE) file or [OCTL license text](https://github.com/open-compensation-token-license/license/blob/main/LICENSE.md) for details. For OCTL
compliance, ensure contributions are registered with the project’s `X-octl-sid` using the license token link.
