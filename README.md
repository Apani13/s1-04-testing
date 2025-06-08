# Java JUnit Testing Practice

🛠️ Java Unit Testing with JUnit Exercises

---

## 📝 Description

This repository contains structured Java exercises focused on practicing unit testing using JUnit. The goal is to reinforce the creation and management of Java classes through rigorous automated tests, following best practices for test-driven development.

Using project managers like Maven or Gradle, the exercises cover common scenarios such as managing collections, calculating values, and handling exceptions, with a strong emphasis on writing clear and maintainable tests.

---

## 🚀 Objectives

- Learn how to use JUnit for writing unit tests in Java.
- Practice test-driven development (TDD) principles.
- Understand how to test collection management methods.
- Implement parameterized tests for validating multiple input cases.
- Handle and verify exception throwing via tests.
- Follow best practices for project structure and test organization.

---

## 📚 Exercise Overview

### Level 1: JUnit Fundamentals

**Exercise 1 – Library Book Collection Manager**

- **Description:** Manages a collection of books, allowing operations such as adding, retrieving, and removing books.
- **JUnit Tests:**
    - Verifies that the book list is not null upon creation.
    - Confirms the list size after adding multiple books.
    - Asserts the presence of specific books in correct positions.
    - Ensures no duplicate titles exist.
    - Validates retrieving titles by position.
    - Checks list updates correctly after additions and removals.
    - Confirms the list remains alphabetically ordered after changes.

**Exercise 2 – DNI Letter Calculation**

- **Description:** Calculates the letter corresponding to a Spanish DNI number.
- **JUnit Tests:**
    - Parameterized tests to validate the letter calculation for 10 predefined DNI numbers.

**Exercise 3 – Exception Handling Test**

- **Description:** Demonstrates throwing an `ArrayIndexOutOfBoundsException`.
- **JUnit Tests:**
    - Verifies that the exception is correctly thrown under specified conditions.

---

## ⚙️ Technologies Used

- Java 17 or higher
- Maven (project management and dependencies)
- JUnit 5 (unit testing framework)
- IntelliJ IDEA or Eclipse (IDE)
- GitHub (version control and repository hosting)

---

## 📋 Requirements

- Java JDK 17+
- Maven installed
- Git for version control
- IDE such as IntelliJ IDEA or Eclipse

---

## 🛠️ Installation

```bash
git clone https://github.com/Apani13/s1-04-testing.git
cd s1-04-testing
```

Open the project in your preferred IDE and ensure the Java SDK and Maven settings are properly configured.

---

## ▶️ Execution

Run tests through your IDE’s test runner or via command line:

For Maven:

```bash
mvn test
```

---

## 🤝 Contributions

Feel free to contribute by:

- Forking the repository
- Creating a feature branch (`git checkout -b feature/MyFeature`)
- Committing your changes (`git commit -m "Add MyFeature"`)
- Pushing to your branch (`git push origin feature/MyFeature`)
- Opening a pull request

---

## ✅ Author Notes

These exercises are designed to strengthen your skills in unit testing with JUnit and help you build robust, maintainable Java applications. Mastery of testing techniques is essential for professional Java development.

Happy coding! 🚀
