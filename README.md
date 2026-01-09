# User Management System – Spring Boot REST API

A backend-only **User Management System** built with **Spring Boot**, providing secure RESTful APIs for user authentication, authorization, and role-based access control (RBAC). This project is designed to be consumed by frontend applications such as Angular or React.

## Features

* User authentication and authorization
* Role-based access control (RBAC)
* User CRUD operations (Create, Read, Update, Delete)
* Secure RESTful APIs
* Layered architecture (Controller, Service, Repository)
* Exception handling and validation
* Scalable and maintainable backend design

## Tech Stack

* Java
* Spring Boot
* Spring Security
* Maven
* JPA / Hibernate
* RESTful APIs

## Database

* MySQL

## Project Structure

```
src/main/java/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 ├── dto/
 ├── security/
 └── exception/
```

## Getting Started

### Prerequisites

* Java 17+
* Maven

### Run the Application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080/`.

## API Usage

This project exposes REST APIs that can be consumed by any frontend framework (Angular, React, etc.) or API client tools like Postman.

## Security

* Spring Security–based authentication
* Role-based authorization
* Protected endpoints
* Secure request handling

## Future Enhancements

* Session based authentication
* Refresh token support
* Pagination and filtering
* API documentation with Swagger/OpenAPI
* Dockerization

## License

This project is licensed under the MIT License.
