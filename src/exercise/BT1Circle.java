package exercise;

public class BT1Circle {
    private double radius = 1.0;
    private String color = "red";

    public BT1Circle() {
    }

    public BT1Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius;
    }

    @Override
    public String toString() {
        return "Hinh Tron {" +
                "Ban Kinh = " + radius +
                ", Mau Sac = '" + color + '\'' +
                '}';
    }
}
