# Order Management -- Service‑Based Architecture

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Spring
Boot](https://img.shields.io/badge/Spring_Boot-Framework-6DB33F?logo=springboot)
![Spring Cloud
Gateway](https://img.shields.io/badge/Spring_Cloud-Gateway-6DB33F?logo=spring)
![Docker](https://img.shields.io/badge/Docker-Containerization-2496ED?logo=docker)
![Architecture](https://img.shields.io/badge/Architecture-Service--Based-blue)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A **Service‑Based Architecture** backend project demonstrating how to
structure a distributed backend system using **API Gateway, BFF (Backend
for Frontend), and domain services**.

The project simulates an **Order Management System** composed of
independent services communicating via REST APIs. It was built as a
**portfolio and learning project** to explore modern backend
architecture patterns.

------------------------------------------------------------------------

# Architecture

The system is organized using a **Service‑Based Architecture**, where
services are separated by domain while remaining relatively simple to
orchestrate.

Client requests pass through the **API Gateway**, which routes requests
to the **BFF layer**, responsible for aggregating and orchestrating
calls to domain services.

    Client
       │
       ▼
    API Gateway
       │
       ▼
    BFF (Backend For Frontend)
       │
       ├── Users Service
       │
       └── Orders Service

------------------------------------------------------------------------

# Tech Stack

  ---------------------------------------------------------------------------------------------------------------------------
  Technology                                                                           Description
  ------------------------------------------------------------------------------------ --------------------------------------
  ![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)                    Main programming language

  ![Spring                                                                             Backend framework
  Boot](https://img.shields.io/badge/Spring_Boot-Framework-6DB33F?logo=springboot)     

  ![Spring                                                                             API Gateway routing
  Cloud](https://img.shields.io/badge/Spring_Cloud-Gateway-6DB33F?logo=spring)         

  ![Docker](https://img.shields.io/badge/Docker-Containerization-2496ED?logo=docker)   Containerization

  REST APIs                                                                            Service communication

  BFF Pattern                                                                          API aggregation layer
  ---------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------

# Project Structure

    order-management-service-based-architecture
    │
    ├── api-gateway
    │   └── Entry point for client requests
    │
    ├── bff-service
    │   └── Aggregates and orchestrates service calls
    │
    ├── users-service
    │   └── Manages user domain logic
    │
    └── orders-service
        └── Manages order domain logic

Each service represents a **domain capability** of the system.

------------------------------------------------------------------------

# Running the Project

## Requirements

-   Java 21
-   Docker
-   Docker Compose

------------------------------------------------------------------------

## Clone repository

    git clone https://github.com/felipematheus1337/order-management-service-based-architecture
    cd order-management-service-based-architecture

------------------------------------------------------------------------

## Run with Docker

    docker-compose up --build

------------------------------------------------------------------------

# Services

  Service          Port
  ---------------- ------
  API Gateway      8080
  BFF              8081
  Users Service    8082
  Orders Service   8083

------------------------------------------------------------------------

# Example Endpoints

### Get User

    GET /api/v1/users/{id}

### Get Order

    GET /api/v1/orders/{id}

The **API Gateway routes requests** to the **BFF**, which orchestrates
calls to the appropriate services.

------------------------------------------------------------------------

# Architectural Concepts Demonstrated

-   Service‑Based Architecture
-   API Gateway Pattern
-   Backend For Frontend (BFF)
-   Domain separation
-   Service orchestration

------------------------------------------------------------------------

# Possible Future Improvements

-   OAuth2 / JWT authentication
-   Observability (Tracing + Metrics)
-   Rate limiting at Gateway
-   Event‑Driven architecture (Kafka)
-   Service discovery
-   Kubernetes deployment

------------------------------------------------------------------------

# Author

Felipe Matheus\
Backend / Software Developer

GitHub: https://github.com/felipematheus1337
