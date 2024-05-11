# Spring Boot 3.0 Security with JWT Implementation

This project demonstrates the implementation of security using Spring Boot 3.0 and JSON Web Tokens (JWT).
It includes the following features:

## Features

- User Registration and Login with JWT authentication.
- Password Encryption using BCrypt.
- Role-based authorization with Spring Security.
- Customized access denied Handling.
- Logout mechanism.
- Refresh token.
- Password Change Functionality
- JPA Auditing for User Reports.

## Technologies

- Spring Boot 3.0
- Spring Security 6.0
- JSON Web Tokens (JWT)
- BCrypt
- Maven

## Getting Started

To get started with this project, you will need to have the following installed on your local machine:

- JDK 21+
- Maven 3+

To build and run the project, follow these steps:

1. Clone the repository: `git clone https://github.com/kasodeep/jwt-auth-springboot.git`
2. Build the project: `mvn clean install`
3. Run the project: `mvn spring-boot:run`

The application will be available at [http://localhost:8080](http://localhost:8080).
The documentation will be available at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

## Security Config

The security configuration is done in the security filter chain:

1. Disabled CORS.
2. Added authentication provider (The configuration for the same is in Application Config class.).
3. Added custom JWT filter.
4. Defined logout URL.

### JWT Filter

- Extracts the token and checks for its validity.
- Sets the new token as UsernamePasswordAuthenticationToken.

## Auditing

- Provides a method to get the current auditor/user from Security Context.
- Must add the annotation to the main class.
- Annotations can be added as done in the book class.

