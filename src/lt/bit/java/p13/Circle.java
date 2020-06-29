package lt.bit.java.p13;

public class Circle extends Figure{
    private double radius;

    public Circle(String name, double radius) {
        setName(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
