/*package _6;

import org.junit.*;
import org.junit.Test;


public class CalculatorTest {
    private Assert Assertions;


    //* 1:
    //*
    //*
    //* Create JUnit test for the add() and subtract() methods in the Calculator class.
    //*
    //* Test the methods with multiple test cases, including positive and negative numbers, and zero.
    //*
    //* Verify that the methods return the correct result for each test case.
    //*
    //* If there is an error you may have to change the code in Calculator to fix it!

    @Test
    public void exercise1() {
        System.out.println("\nExercise 1: ");
        Calculator calculator = new Calculator();
        calculator.add(5, 6);
        calculator.add(-4, 0);

        calculator.subtract(5, 6);
        calculator.subtract(-4, 0);
    }


    //* 2:
    //*
    //*
    //* Create JUnit test for the multiply() and divide() methods in the Calculator class.
    //*
    //* Test the same kind of inputs as before as exercise 1
    //*
    //* If there is an error you may have to change the code in Calculator to fix it!
    //*

    @Test
    public void exercise2() {
        System.out.println("\nExercise 2: ");
        Calculator calculator = new Calculator();
        calculator.divide(6, 3);
        calculator.divide(7, 0);
        calculator.divide(-6, 12);
        System.out.println(calculator.divide(7, 0));
        calculator.multiply(6, 3);
        calculator.multiply(7, 0);
        calculator.multiply(-6, 12);


        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }


    //* 3:
    //*
    //* Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
    //* Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
    //* Test with decimals too!
    //* Verify that the method returns the correct result for each test case.
    //*
    //* If there is an error you may have to change the code in Calculator to fix it!
    //*
    //* Don't just write tests that use the result of the program as the expected!!

    @Test
    public void exercise3() {
        System.out.println("\nExercise 3: ");
        Calculator calculator = new Calculator();
        calculator.power(0, 3);
        calculator.power(7, 2);
        calculator.power(7, 0);
        calculator.power(-6, 2);
        calculator.power(6, -2);
        calculator.power(5, 1);

    }
}

 */

