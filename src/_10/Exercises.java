package _10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {

        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Person person = new Person("Paolo", "Rossi", "Via Roma 11");
        System.out.println(person.toString());
    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        List<Person> listaPersone = new ArrayList<>();
        Person person1 = new Person("Paolo", "Rossi", "Via Roma 11");
        Person person3 = new Person("Paolo", "Rossi", "Via Roma 11");
        Person person2 = new Person("Giovanni", "Bianchi", "Via Torino 112");

        listaPersone.add(person1);
        listaPersone.add(person2);
        listaPersone.add(person3);

        stampaUguali(person1, person3);
        stampaUguali(person2, person1);



    }

    private static void stampaUguali (Person p1, Person p2){
        if(p1.hashCode() == p2.hashCode()) {
            System.out.println("Sono uguali");
        } else {
            System.out.println("Non sono uguali");
        }
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}
