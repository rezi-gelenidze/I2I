# Car Park Simulation

Welcome to the Car Park project repository! The goal of this assignment is to simulate a car park using Java classes. This README will provide a brief overview of the project and its key features.

## Project Description

### LicensePlate

The `LicensePlate` class represents a license plate with attributes `regionalCode`, `letters`, and `digits`. It includes a constructor to create a license plate object.

### Car

The `Car` class represents a car with attributes `brand`, `licensePlate`, and `chassisNumber`. The `chassisNumber` is automatically incremented for each newly created car object. It also includes a meaningful constructor.

### CarPark

The `CarPark` class simulates a car park with a specified number of spaces. It includes the following methods:

- `int park(Car c)`: Parks a car in the first available space and returns the number of the occupied space. If the car park is full, it returns -1.
- `int search(LicensePlate lp)`: Searches for a car by its license plate and returns the number of the occupied space if found, or -1 if not found.
- `Car driveOff(LicensePlate lp)`: Empties the space occupied by the car with the given license plate and returns the corresponding car. Returns `null` if the car is not found.
- `public String toString()`: Provides a String representation of the car park, displaying the occupied spaces and their corresponding cars.

### LicensePlate Method

- `boolean isEqual(LicensePlate other)`: Extends the `LicensePlate` class with a method that returns `true` if and only if two license plates describe the same license plate.

## Conclusion

The Car Park project is a practical simulation of a car park with the ability to park, search for cars, and drive them off. It demonstrates object-oriented programming principles and the use of Java classes. Feel free to explore the code and use it as a reference for your own projects.
