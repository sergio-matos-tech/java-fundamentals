package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = input.nextInt();

        for (int i = 0; i < numberOfShapes; i++) {
            System.out.printf("SHAPE DATA #%d\n", i + 1);
            System.out.print("Rectangle or circle? (r/c): ");
            char rect_or_circle = input.next().toLowerCase().charAt(0);
            input.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            String colorStr = input.nextLine().toUpperCase();
            Color color = Color.valueOf(colorStr);

            if (rect_or_circle == 'r') {
                System.out.print("Width (m): ");
                Double width = input.nextDouble();
                System.out.print("Height (m): ");
                Double height = input.nextDouble();

                Shape rect = new Rectangle(color, width, height);
                shapes.add(rect);
                input.nextLine();
            } else if (rect_or_circle == 'c') {
                System.out.print("Radius: (m) ");
                Double radius = input.nextDouble();

                Shape circle = new Circle(color, radius);
                shapes.add(circle);
                input.nextLine();
            }
        }

        System.out.println("\nSHAPE AREAS: ");
        for (Shape s : shapes) {
            String shapeName = (s instanceof Circle) ? "Circle" :
                               (s instanceof Rectangle) ? "Rectangle" : "Unknown";
            System.out.printf("%s -> %.3fm²\n", s.getColor(), s.area());
        }

        input.close();
    }
}