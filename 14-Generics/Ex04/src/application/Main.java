package application;

import domain.Circle;
import domain.Rectangle;
import domain.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Rectangle(3.0, 2.0));
        shapesList.add(new Circle(2.0));

        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(2.0));
        circleList.add(new Circle(3.0));

        System.out.printf("Total area: %.3f\n", totalArea(shapesList));
        System.out.printf("Total area: %.3f", totalArea(circleList));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}