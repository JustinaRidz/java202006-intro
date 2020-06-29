package lt.bit.java.p13;

public class Calculations {
    static double calculateTriangleArea(Triangle t) {
        double s = (t.getA() + t.getB() + t.getC()) / 2;
        return Math.sqrt(s * (s - t.getA()) * (s - t.getB()) * (s - t.getC()));
    }

    static double calculateCircleArea(Circle c) {
        return Math.PI * c.getRadius() * c.getRadius();
    }
}
