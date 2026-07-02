package com.exercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures,
 * Setup and Teardown Methods in JUnit.
 *
 * Each test is organized into three clear sections:
 *   Arrange - set up the objects/data needed for the test
 *   Act     - perform the action being tested
 *   Assert  - verify the outcome is what was expected
 *
 * @Before runs before every test method (setup / test fixture creation).
 * @After runs after every test method (teardown / cleanup).
 */
public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Runs before each test - create a fresh Calculator instance
        calculator = new Calculator();
        System.out.println("Setting up: new Calculator instance created.");
    }

    @After
    public void tearDown() {
        // Runs after each test - clean up resources
        calculator = null;
        System.out.println("Tearing down: Calculator instance discarded.");
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 4;
        int b = 6;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void testSubtract() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}
