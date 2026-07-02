# JUnit Exercises 1, 3, 4 — Maven Project

This single Maven project contains solutions for:

- **Exercise 1** — JUnit setup (`pom.xml` with JUnit 4.13.2 dependency)
- **Exercise 3** — `AssertionsTest.java` (various JUnit assertions)
- **Exercise 4** — `CalculatorAAATest.java` (Arrange-Act-Assert pattern + `@Before`/`@After` fixtures), backed by `Calculator.java`

## Project Structure

```
junit-exercises/
├── pom.xml
└── src
    ├── main
    │   └── java/com/exercises/Calculator.java
    └── test
        └── java/com/exercises
            ├── AssertionsTest.java
            └── CalculatorAAATest.java
```

## How to open and run in VS Code

1. Unzip the project folder anywhere on your machine.
2. Open the folder in VS Code (`File > Open Folder...`).
3. Make sure you have the **Extension Pack for Java** and **Java Test Runner** installed (VS Code will usually prompt you).
4. VS Code will auto-detect it as a Maven project and download dependencies.
5. To run tests:
   - **Via terminal:** open a terminal in VS Code and run:
     ```
     mvn test
     ```
   - **Via UI:** open `AssertionsTest.java` or `CalculatorAAATest.java`, and click the green "Run Test" arrows that appear next to each `@Test` method / class in the gutter.

## Expected Output

Both test classes should pass all tests:
- `AssertionsTest` → 1 test passes (all assertions succeed)
- `CalculatorAAATest` → 2 tests pass (`testAdd`, `testSubtract`), with setup/teardown messages printed to console before/after each test.
