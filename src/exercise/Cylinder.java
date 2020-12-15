package exercise;

public class Cylinder extends BT1Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "Cylinder " +
                "Chieu Cao = " + height + " La Hinh Con Cua " +
                super.toString();
    }
}
