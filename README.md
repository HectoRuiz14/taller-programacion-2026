# Programming Workshop 2026 - Soccer Tournament Management System

## Project Overview
This project is a Java-based application designed to manage a soccer tournament. It was developed as part of the Programming Workshop course (Sessions 1 and 2) to demonstrate advanced concepts in Object-Oriented Programming (OOP) and software architecture. The main objective of this repository is to showcase the practical application of the six core pillars of OOP (Abstraction, Encapsulation, Inheritance, Polymorphism, Association, and Cohesion) alongside the SOLID principles for clean and maintainable code.

## Key Features and Architecture
Throughout the development of this system, several modern software engineering practices were implemented:
* **SOLID Principles:** The project refactored initial monolithic structures (God Classes) into single-responsibility components, such as separating the `TournamentService` for business logic and `PlayerRepository` for data persistence. We also applied the Dependency Inversion Principle by using generic repository interfaces.
* **Custom Exception Hierarchy:** A robust, three-level exception handling system was built using `AppException` as the base, extending into `DomainException`, and finally into specific cases like `EntityNotFoundException`, `ValidationException`, and `BusinessRuleException`. Logging is handled via SLF4J.
* **Functional Interfaces:** The domain includes custom `@FunctionalInterface` implementations using various lambda expressions and method references to validate player data dynamically.
* **Unit Testing:** The application's core logic and exception handling are thoroughly verified using JUnit 5 and AssertJ.

## Technologies Used
* Java
* Maven (Project Management and Build Tool)
* JUnit 5 & AssertJ (Unit Testing)
* SLF4J (Logging)
* GitHub Copilot (AI-assisted coding and code review)

## Setup Instructions
To run this project locally, clone the repository and ensure you have Java and Maven installed. You can execute the test suite using your preferred IDE or by running standard Maven commands in the terminal.