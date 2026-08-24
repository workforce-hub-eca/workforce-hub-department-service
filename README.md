# Department Service 🏢

| | |
|---|---|
| **Student** | L.K.H. Manuth Lakdiw |
| **Student Number** | 241722018 |
| **Batch** | GDSE-72 |
| **GCP Project** | `workforce-hub-cloud` |

## Project Description

Manages the core organizational hierarchy and departments for WorkForceHub. Provides a complete CRUD API for creating, reading, updating and deleting departments. Uses a fully layered architecture (Controller, Service, Repository) with centralized exception handling returning standardized `ErrorResponseDTO` responses.

## 🛠️ Technology Stack

- **Java**: 25
- **Spring Boot**: 4.1.0
- **Spring Cloud**: 2025.1.2
- **Spring Data JPA**
- **MySQL** (via MySQL Connector/J)
- **Netflix Eureka Client**
- **Spring Cloud Config Client**

## 📍 API Endpoints

Base path: `/api/v1/departments`

| Method | Path | Description |
|---|---|---|
| `POST` | `/api/v1/departments` | Create a department |
| `GET` | `/api/v1/departments` | List all departments |
| `GET` | `/api/v1/departments/{id}` | Fetch a single department |
| `PUT` | `/api/v1/departments/{id}` | Update a department |
| `DELETE` | `/api/v1/departments/{id}` | Delete a department |

## 🚀 Running Locally

- **Port**: `8081`
- Ensure MySQL is running and the Config Server and Eureka Server are available.

```bash
mvn spring-boot:run
```

## ☁️ Production Deployment

- **Runtime**: Regional Managed Instance Group (`workforce-hub-backend-mig`)
- **Region**: `asia-south1`
- **Database**: Cloud SQL (MySQL)
- **Process Manager**: PM2 with systemd automatic startup and recovery
