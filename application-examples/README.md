# Schema App

A Spring Boot application for managing Schema.org Java objects in an embedded OrientDB instance using the Gremlin driver, supporting create or update operations. Furthermore, conatining an example of transforming ordinary data transfer objects in Schema org Java objects and vice versa.

## Prerequisites
- Java 17
- Maven 3.8+
- OrientDB 3.2.25 (embedded)

## Setup
1. Create the project directory:
   ```bash
   mkdir schema-app
   cd schema-app
   ```
2. Add the provided files (`pom.xml`, `src/main/java`, `src/main/resources`).
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Configuration
- `application.properties`: Configures Gremlin and OrientDB settings.
- `gremlin-client.yaml`: Configures the Gremlin client for OrientDB.

## Example Usage
### 1. Create or Update a Person with Address and Organization
```http
POST http://localhost:8080/vertices
Content-Type: application/json
{
  "@type": "Person",
  "givenName": "Jane Doe",
  "birthDate": "1990-01-01",
  "address": {
    "@type": "PostalAddress",
    "streetAddress": "123 Main St",
    "postalCode": "12345",
    "addressLocality": "City"
  },
  "worksFor": {
    "@type": "Organization",
    "name": "Tech Corp"
  }
}
```
- Creates or updates vertices for `Person`, `PostalAddress`, and `Organization`.

### 2. Update the Same Person
```http
POST http://localhost:8080/vertices
Content-Type: application/json
{
  "@type": "Person",
  "id": "vertex#456",
  "givenName": "Jane Smith",
  "birthDate": "1990-01-01",
  "address": {
    "@type": "PostalAddress",
    "streetAddress": "456 New St",
    "postalCode": "67890",
    "addressLocality": "New City"
  },
  "worksFor": {
    "@type": "Organization",
    "name": "New Corp"
  }
}
```
- Updates the `Person` vertex (ID `vertex#456`) and its related vertices.

### 3. Query All Addresses
```http
GET http://localhost:8080/addresses?mediaType=application/ld+json&includeRelated=true
```
Response:
```json
[
  {
    "@id": "vertex#123",
    "@type": "PostalAddress",
    "streetAddress": "456 New St",
    "postalCode": "67890",
    "addressLocality": "New City",
    "relatedPerson": {
      "@id": "vertex#456",
      "@type": "Person",
      "givenName": "Jane Smith"
    }
  }
]
```

### 4. Query Address by ID
```http
GET http://localhost:8080/addresses/vertex#123?mediaType=application/ld+json
```
Response:
```json
{
  "@id": "vertex#123",
  "@type": "PostalAddress",
  "streetAddress": "456 New St",
  "postalCode": "67890",
  "addressLocality": "New City"
}
```

### 5. Update Address Properties
```http
PATCH http://localhost:8080/addresses/vertex#123
Content-Type: application/json
{
  "streetAddress": "789 Updated St"
}
```

### 6. Reassign Address Reference
```http
PATCH http://localhost:8080/vertices/vertex#456/references/address?targetId=vertex#789
```

## Notes
- The embedded OrientDB stores data in `target/orientdb`.
- Ensure port 8182 is available for Gremlin connections.
- Vertex classes are created on startup (`Product`, `Person`, `PostalAddress`, `Organization`).
- Uses `schemaorg-java-metadatatypes:1.8` (verify if `1.0.2` is required).
