# Product Catalog Service

A REST API built with **Spring Boot**, **Spring MVC**, **Spring Data JPA**, and **MySQL**.

## Requirements

- Java 17+
- Maven 3.6+
- MySQL 8+

## 1. Create the database

Run this in MySQL (the JDBC URL also has `createDatabaseIfNotExist=true`):

```sql
CREATE DATABASE product_catalog;
```

## 2. Configure the database

The defaults in `src/main/resources/application.properties` are:

- URL: `jdbc:mysql://localhost:3306/product_catalog`
- Username: `root`
- Password: `root`

Change these values or set environment variables:

```bash
DB_URL=jdbc:mysql://localhost:3306/product_catalog
DB_USERNAME=root
DB_PASSWORD=your_password
```

## 3. Run the application

From the project root:

```bash
mvn spring-boot:run
```

The API starts at `http://localhost:8080`.

To package it:

```bash
mvn clean package
java -jar target/product-catalog-service-0.0.1-SNAPSHOT.jar
```

## REST endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | List all products |
| GET | `/api/products/{id}` | Get one product |
| POST | `/api/products` | Create a product |
| PUT | `/api/products/{id}` | Update a product |
| DELETE | `/api/products/{id}` | Delete a product |
| GET | `/api/products/search?name=phone` | Search by product name |
| GET | `/api/products/category/{category}` | Filter by category |

## Example requests

### Create a product

```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{
    "name": "LG 55-inch 4K Smart TV",
    "description": "4K UHD smart television",
    "price": 54999.00,
    "stockQuantity": 12,
    "category": "Television",
    "active": true
  }'
```

### Get all products

```bash
curl http://localhost:8080/api/products
```

### Search by name

```bash
curl "http://localhost:8080/api/products/search?name=LG"
```

### Update a product

```bash
curl -X PUT http://localhost:8080/api/products/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "LG 65-inch 4K Smart TV",
    "description": "Updated model",
    "price": 69999.00,
    "stockQuantity": 8,
    "category": "Television",
    "active": true
  }'
```

### Delete a product

```bash
curl -X DELETE http://localhost:8080/api/products/1
```

## Project structure

```text
src/main/java/com/example/productcatalog/
├── ProductCatalogServiceApplication.java
├── controller/
│   └── ProductController.java
├── entity/
│   └── Product.java
├── repository/
│   └── ProductRepository.java
└── service/
    └── ProductService.java
```

## Notes

- `spring-boot-starter-web` provides Spring MVC and the embedded web server.
- `spring-boot-starter-data-jpa` provides repository support and Hibernate ORM.
- `mysql-connector-j` is the MySQL JDBC driver.
- Hibernate creates/updates the `products` table using `ddl-auto=update` for local development. For production, use schema migrations (for example Flyway) and set credentials through secrets/environment variables.
- This starter returns entities directly to keep the example easy to follow. For a production API, consider DTO response models, pagination, centralized error responses, authentication, and integration tests.
