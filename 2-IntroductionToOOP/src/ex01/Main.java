package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(23, 23, 32);

        System.out.print("Enter the measures of the triangle: (a, b, c) ");
        triangle1.l1 = input.nextDouble();
        triangle1.l2 = input.nextDouble();
        triangle1.l3 = input.nextDouble();

        System.out.println(triangle1);
        System.out.println("Area of the triangle: " + triangle1.area());
        System.out.println(triangle2);
        System.out.println("Area of the triangle: " + triangle2.area());

        input.close();
    }
}