# ThinkOn

Project: User Management REST API
Author: Hugo Albuquerque
Date: October 2024

Description:
This project is a RESTful API for managing user data.
It allows clients to create, retrieve, update, and delete users.
The data persists across application restarts, and the API
communicates using JSON.

API Endpoints:
- POST /users         - Create a new user
- GET /users          - Retrieve all users
- GET /users/{id}     - Retrieve a specific user by ID
- PUT /users/{id}     - Update an existing user
- DELETE /users/{id}  - Delete a user by ID

Technologies:
- Java 17
- Spring Boot
- H2 Database
- Hibernate (JPA)
- Gradle

For testing purposes, use the following address: http://localhost:8080.

Database is available at http://localhost:8080/h2-console, using the following credentials:

username=sa

password=
