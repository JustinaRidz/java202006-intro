package lt.bit.java.p13;

import java.util.*;

public class TestFigureObj {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();

        figures.add(new Triangle("T1", 3, 4, 5));
        figures.add(new Circle("C2", 4.5));
        figures.add(new Circle("C3", 10));
        figures.add(new Triangle("T2", 6, 7, 9));

        double totalArea = 0;
        for (Figure f : figures) {
            totalArea += f.area();
        }

        System.out.println("Total area: " + totalArea);
    }
}
