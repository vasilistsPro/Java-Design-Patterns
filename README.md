# Java-Design-Patterns
# Car Factory Project

This Java project demonstrates the use of Factory Pattern and Builder Pattern in creating and managing different car models.

## Table of Contents
- [Introduction](#introduction)
- [Design Patterns](#design-patterns)
- [Classes](#classes)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Car Factory project showcases the implementation of two key design patterns in Java: Factory Pattern and Builder Pattern. These patterns are employed to create and configure instances of different car models, providing flexibility and maintainability in the codebase.

## Design Patterns

### 1. Factory Pattern
The Factory Pattern is used to create instances of different car models without exposing the instantiation logic to the client code. It involves the use of a common interface (`CarFactory`) and concrete implementations (`FordFactory` and `SuzukiFactory`) for creating specific car types (`Ford` and `Suzuki`).

### 2. Builder Pattern
The Builder Pattern is utilized to construct `Car` objects with complex configurations in a step-by-step manner. The `CarBuilder` class allows the client code to specify various attributes of the car, providing a clean and readable way to create instances of the `Car` class.

## Classes

### Car (Abstract Class)
- **Description**: Represents a generic car.
- **Methods**:
  - `start()`: Starts the car.
  - `stop()`: Stops the car.
  - `turn()`: Makes the car turn.

### Ford (Concrete Class)
- **Description**: Concrete implementation of the `Car` abstract class for Ford cars.
- **Methods**:
  - Overrides the abstract methods of the `Car` class.

### Suzuki (Concrete Class)
- **Description**: Concrete implementation of the `Car` abstract class for Suzuki cars.
- **Methods**:
  - Overrides the abstract methods of the `Car` class.

### CarFactory (Factory Pattern)
- **Description**: Interface for creating instances of the `Car` class.
- **Methods**:
  - `createCar()`: Creates a new instance of the `Car` class.

### FordFactory (Factory Pattern)
- **Description**: Concrete implementation of the `CarFactory` interface for creating Ford cars.
- **Methods**:
  - Implements `createCar()` to instantiate a `Ford` car.

### SuzukiFactory (Factory Pattern)
- **Description**: Concrete implementation of the `CarFactory` interface for creating Suzuki cars.
- **Methods**:
  - Implements `createCar()` to instantiate a `Suzuki` car.

### Car.CarBuilder (Builder Pattern)
- **Description**: Inner static class for building `Car` objects using the Builder Pattern.
- **Methods**:
  - `setBrand(String brand)`: Sets the brand of the car.
  - `setStartMessage(String startMessage)`: Sets the start message of the car.
  - `setStopMessage(String stopMessage)`: Sets the stop message of the car.
  - `setTurnMessage(String turnMessage)`: Sets the turn message of the car.
  - `build()`: Constructs and returns the `Car` object.

## How to Run

To run the project, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `Main` class.

## Contributing

If you would like to contribute to the project, please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push the changes to your fork.
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

