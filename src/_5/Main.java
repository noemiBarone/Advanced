package _5;

import com.sun.jdi.connect.Connector;

import javax.naming.NameNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main{
    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (Exception exception){
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        String userInputFileName = "test-file.txt";
        System.out.println("\nExercise 2: ");
        try{
            Files.readAllLines(Path.of(userInputFileName));
        } catch (IOException exception){
            System.err.println("Il file non puo essere trovato");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException exception){
            System.err.println("L'input è sbagliato");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 4:
     *
     * Write a try block that around this print statement that attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";

        try {
            Double risultato = divideByZeroException(num1, Double.parseDouble(num2AsString));
        } catch (NumberFormatException exception1){
            System.err.println("L'input è sbagliato");
            exception1.printStackTrace();
            System.exit(0);
        } catch(ArithmeticException exception){
                System.err.println("L'input è sbagliato");
                exception.printStackTrace();
                System.exit(0);
            }

    }

    private static Double divideByZeroException (double n1, double n2) throws ArithmeticException{
        if (n2 == 0){
            throw new ArithmeticException("Divide by Zero Exception");
        }
        return n1/n2;
    }



}
