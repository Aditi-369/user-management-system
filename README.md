# Angular & Spring Boot User Management System

A full-stack User Management System built with **Angular** and **Spring Boot**, featuring secure authentication, role-based access control (RBAC), and user administration. This project demonstrates best practices for building scalable, maintainable enterprise applications.

## Features

* User authentication and authorization
* Role-based access control (RBAC)
* User CRUD operations (Create, Read, Update, Delete)
* Protected routes using Angular Route Guards
* RESTful API communication
* Modular and reusable frontend components
* Clean layered backend architecture
* Responsive UI

## Tech Stack

### Frontend

* Angular
* TypeScript
* Angular Router & Guards
* HTTP Client

### Backend

* Spring Boot
* Maven
* RESTful APIs
* Spring Security
* JPA / Hibernate

### Database

* MySQL 

## Project Structure

### Frontend (Angular)

```
src/app/
 ├── auth/
 ├── users/
 ├── roles/
 ├── guards/
 ├── services/
 └── shared/
```

### Backend (Spring Boot)

```
src/main/java/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 └── security/
```

## Getting Started

### Prerequisites

* Node.js (v14+ recommended)
* Angular CLI
* Java 17+
* Maven

### Backend Setup

```bash
./mvnw spring-boot:run
```

The backend will start on `http://localhost:8080/`.

### Frontend Setup

```bash
npm install
ng serve
```

Navigate to `http://localhost:4200/`.

## Security

* Session-based authentication
* Role-based authorization at API and UI level
* Secured endpoints using Spring Security
* Client-side route protection using Angular Guards

## Future Improvements

* Refresh token support
* User activity audit logs
* Pagination, sorting, and filtering
* Unit and integration tests
* Docker support

## License

This project is licensed under the MIT License.
