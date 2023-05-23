package _11;


public record Person (int age, String address) {
    @Override
    public String toString() {
        return "Age: " + age +
                "    Address:   " + address.toUpperCase();
    }
};

