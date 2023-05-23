package _9.esercizio3;

public abstract class Instrument implements Playable {

    private String name;
    private String brand;


    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public void play() {

    }
}
