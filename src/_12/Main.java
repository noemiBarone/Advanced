package _12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    public static List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();

    /**
     * 1:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use forEach to print the selected even numbers
     *
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        ourNumbers.stream().filter(n-> (n%2)== 0).forEach(n -> System.out.println(n));
    }

    /**
     * 2:
     *
     *
     * Use filter to select only odd numbers from the list 'ourNumbers'
     *
     * Use the toSet() method to collect the selected odd numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Set<Integer> oddNumbers = ourNumbers.stream().filter(n-> (n%2)!= 0).collect(Collectors.toSet());
        oddNumbers.stream().forEach(n -> System.out.println(n));
    }

    /**
     * 3:
     *
     *
     * Use map to convert the strings to uppercase
     *
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     *
     * Print the resulting Set
     *
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        Set<String> aliceUpperCase = alice.stream().map(s -> s.toUpperCase()).collect(Collectors.toSet());
        aliceUpperCase.stream().forEach(n -> System.out.println(n));
    }

    /**
     * 4:
     *
     *
     * Use filter to select only even numbers from the list 'ourNumbers'
     *
     * Use map to multiply the even numbers by 2
     *
     * Use the toSet() method to collect the resulting numbers in a Set
     *
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        Set<Integer> evenNumbers = ourNumbers.stream().filter(n-> (n%2)== 0).collect(Collectors.toSet());
        evenNumbers.stream().map(s-> s*2).forEach(n -> System.out.println(n));

    }
}
