package _8;

public class Birds extends Animal {

    private int wingSpan;

    public Birds(double height, double weight, int wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double flySpeedMetersPerSecond(){
        return this.wingSpan * 4;
    }
}
