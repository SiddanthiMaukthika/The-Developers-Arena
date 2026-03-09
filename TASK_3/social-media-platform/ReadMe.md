# Social Media Microservices Platform

## Overview
This project is a microservices-based social media platform developed as part of this month's task.  
The system demonstrates how multiple services can work together using Spring Boot, API Gateway, and service discovery.

The application allows users to log in, create posts, and retrieve posts through secured APIs.

---

## Architecture

The system follows a microservices architecture:

Frontend (React)
        ↓
API Gateway
        ↓
Service Discovery (Eureka)
        ↓
User Service
Post Service
Notification Service

Each service runs independently and communicates through REST APIs.

---

## Technologies Used

Backend:
- Spring Boot
- Spring Cloud Gateway
- Spring Security
- JWT Authentication
- Eureka Service Discovery
- MySQL

Frontend:
- React
- Axios

Tools:
- Maven
- Postman
- GitHub

---

## Microservices Implemented

### 1. Service Discovery
- Implemented using Eureka Server
- Registers all microservices

### 2. API Gateway
- Handles routing of requests
- Acts as the entry point for all APIs

### 3. User Service
- Handles user login
- Generates JWT tokens for authentication

### 4. Post Service
- Allows users to create posts
- Retrieves posts from the database

### 5. Notification Service
- Receives messages when a new post is created

---

## Features

- User authentication using JWT
- Create posts
- Retrieve posts
- Microservices communication
- API Gateway routing
- Service discovery

---

## How to Run

Start services in the following order:

1. Service Discovery (Eureka)
2. API Gateway
3. User Service
4. Post Service
5. Notification Service
6. Frontend (React)

Frontend runs on:

http://localhost:3001

API Gateway runs on:

http://localhost:8080

---

## Testing

APIs were tested using Postman.

Example endpoints:

Login  
POST /api/auth/login?username=test

Create Post  
POST /api/posts

Get Posts  
GET /api/posts

---

