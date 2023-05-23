package _9.esercizio1;

public class Cerchio extends Shape {

    public Cerchio(double height, double width) {
        super(height, width);
        if(height != width){
            System.out.println("Errore: i valori non sono uguali");
        }
    }

    @Override
    public double calculateArea() {
        if(getHeight() == getWidth()) {
            return Math.round(Math.PI * Math.pow((getHeight() / 2), 2));
        }
        System.out.println("Non è stato possibile calcolare l'area del cerchio");
        return 0;
    }

}
