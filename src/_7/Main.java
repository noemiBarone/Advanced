package _7;

public class Main {
    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        private boolean typeOfDay;

        Days(boolean typeOfDay) {
            this.typeOfDay = typeOfDay;
        }

        public boolean isTypeOfDay() {
            return typeOfDay;
        }
    }

    private enum Seasons {
        SPRING("Marzo, Aprile, Maggio"),
        SUMMER("Giugno, Luglio, Agosto"),
        FALL("Settembre, Ottobre, Novembre"),
        WINTER("Dicembre, Gennaio, Febbraio");

        public String mesi;


        Seasons(String mesi) {
            this.mesi = mesi;
        }

        public String getMesi() {
            return mesi;
        }
    }

    private enum TrafficLight {
        RED, YELLOW, GREEN;

    }


    private enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE;
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        verificaMesi(Seasons.WINTER);

    }

    private static void verificaMesi(Seasons season) {
        System.out.println(season + ": " + season.getMesi());
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        successivo(TrafficLight.RED);

    }

    public static void successivo(TrafficLight light) {
        if (light.equals(TrafficLight.RED)) {
            System.out.println(light);
            System.out.println(TrafficLight.GREEN);
            System.out.println(TrafficLight.YELLOW);
        } else if (light.equals(TrafficLight.GREEN)) {
            System.out.println(light);
            System.out.println(TrafficLight.YELLOW);
            System.out.println(TrafficLight.RED);
        } else if (light.equals(TrafficLight.YELLOW)) {
            System.out.println(light);
            System.out.println(TrafficLight.RED);
            System.out.println(TrafficLight.GREEN);
        }
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        System.out.println("I giorni feriali sono: ");
        for (Days day : Days.values()) {
            if (day.typeOfDay == false) {
                System.out.println(day);
            }
        }
        System.out.println("I giorni festivi sono: ");
        for (Days day : Days.values()) {
            if (day.isTypeOfDay() == true) {
                System.out.println(day);
            }
        }
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        Operator operator = Operator.DIVIDE;

        double risultato = calcolate(num1, num2, operator);
        System.out.println(num1 + " " + operator + " " + num2 + " ha come risultato " + risultato);
    }

    private static Double calcolate(double num1, double num2, Operator operator) {
        switch (operator) {
            case ADD -> {
                return num1 + num2;
            }
            case DIVIDE -> {
                return num1 / num2;
            }
            case MULTIPLY -> {
                return num1 * num2;
            }
            case SUBTRACT -> {
                return num1 - num2;
            }
            default -> System.out.println("Non è stato inserito un operatore corretto");
        }
        return 0.0;
    }
}
