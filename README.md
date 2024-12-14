# Employee Commission Management System

## Description

This project implements a simple Employee Commission Management System in Java. The system calculates an employee's earnings based on their gross sales and commission rate. It also includes the option for employees to receive a base salary in addition to commissions. The system is built using **Object-Oriented Programming (OOP)** principles, including **inheritance**, **encapsulation**, and **polymorphism**.

The system contains three main classes:
1. `CommisionEmployee`: Represents an employee whose earnings are based solely on commissions from sales.
2. `BasePlusCommisionEmployee`: Inherits from `CommisionEmployee` and adds a base salary to the earnings calculation.
3. `InheritanceTest`: A test class to demonstrate how the `BasePlusCommisionEmployee` class works, including setting and updating the base salary.

## Features

- **Commission Calculation**: Employees can earn a percentage of their sales (commission).
- **Base Salary**: The `BasePlusCommisionEmployee` class allows employees to receive a base salary in addition to their commissions.
- **Data Validation**: The system validates the input values such as gross sales and commission rate to ensure that they are within valid ranges.
- **Inheritance**: The project demonstrates the use of inheritance where `BasePlusCommisionEmployee` extends `CommisionEmployee`.
- **Getter and Setter Methods**: Data fields are encapsulated with private access, and getter and setter methods are used to access or modify them.
- **Custom Exception Handling**: In case of invalid input values, the system prints error messages and stops execution (using `System.exit(1)`).

## Classes

### `CommisionEmployee`
- Represents an employee who earns based on a commission rate.
- Contains fields for the employee's first name, last name, social security number, gross sales, and commission rate.
- Validates that `grossSales` is non-negative and that `commissionRate` is between 0 and 1.
- Contains methods for calculating earnings and printing the employee's information.

### `BasePlusCommisionEmployee`
- Extends `CommisionEmployee` to add a base salary to the earnings calculation.
- Contains a method to calculate the total earnings (base salary + commission).
- Overrides the `toString()` method to include the base salary and total earnings in the output.

### `InheritanceTest`
- A test class to create an instance of `BasePlusCommisionEmployee`.
- Prints the employee's information before and after updating the base salary.

## Usage


