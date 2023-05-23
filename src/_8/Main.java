package _8;

public class Main {
    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog Dog = new Dog(30, 45, " chihuahua");
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Fish fish = new Fish(10, 5, "Pesce pagliaccio" );
        Birds bird = new Birds(30, 45, 60);
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {

        Fish fish = new Fish(10, 5, "Pesce pagliaccio" );
        Birds bird = new Birds(30, 45, 60);
        Dog dog = new Dog(30, 45, " chihuahua");

        double speedDog = dog.runSpeedMetersPerSecond();
        double speedFish = fish.swimSpeedMetersPerSecond();
        double speedBird = bird.flySpeedMetersPerSecond();

        double speed = Math.max(speedDog, speedFish);
        speed = Math.max(speed, speedBird);

        System.out.println("Cane. Altezza: " + dog.getHeight() + " Peso: " + dog.getWeight() + " Razza: " + dog.getBreed());
        System.out.println("Pesce. Lunghezza: " + fish.getHeight() + " Peso: " + fish.getWeight() + " Specie: " + fish.getSpecies());
        System.out.println("Volatile. Altezza: " + bird.getHeight() + " Peso: " + bird.getWeight() + " Apertura alata: " + bird.getWingSpan());

        if(speed == speedDog){
            System.out.println("L'animale più veloce è il" + dog.getBreed()+ " con una velocità di: " + speed);
        }
        if(speed == speedBird){
            System.out.println("L'animale più veloce è il volatile con una velocità di: " + speed);
        }
        if(speed == speedDog){
            System.out.println("L'animale più veloce è " + fish.getSpecies()+  " con una velocità di: " + speed);
        }




    }

}
