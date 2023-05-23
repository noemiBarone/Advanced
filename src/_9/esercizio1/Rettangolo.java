package _9.esercizio1;

public class Rettangolo extends Shape {
    public Rettangolo(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return Math.round(getHeight()*getWidth());
    }
}
