package lt.bit.java.p13;

public class TestFigure {
    public static void main(String[] args) {

        Figure[] figures = new Figure[] {
                new Triangle("T1", 3, 4, 5),
                new Circle("C2", 4.5),
                new Circle("C3", 10),
                new Triangle("T2", 6, 7, 9)
        };

        double totalArea = 0;
//        for (int i = 0; i < figures.length; i++) {
//            Figure f = figures[i];
        for (Figure f : figures) {
            if (f instanceof Triangle) {
                totalArea += Calculations.calculateTriangleArea((Triangle) f);
            } else if (f instanceof Circle) {
                totalArea += Calculations.calculateCircleArea((Circle) f);
            }
        }
        System.out.println("Total area: " + totalArea);

    }
}
