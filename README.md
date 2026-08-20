# Department Service 🏢

Manages the core organizational hierarchy and departments for WorkForceHub.

## 🛠️ Tech Stack
- **Java**: 25
- **Spring Boot**: 4.1.0
- **Database**: MySQL

## ✨ Architecture Highlights
- Fully layered architecture (Controller, Service, Repository).
- Follows the central exception handling schema returning standardized `ErrorResponseDTO`.

## 📍 Key Endpoints
- `POST /api/v1/departments` - Create a department
- `GET /api/v1/departments` - List all departments
- `GET /api/v1/departments/{id}` - Fetch single department
- `PUT /api/v1/departments/{id}` - Update a department
- `DELETE /api/v1/departments/{id}` - Delete a department

## 🚀 Running Locally
- Port: Configured via Config Server.
- Ensure MySQL is running and Config/Eureka servers are available.
