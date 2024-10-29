package ex03;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, width;

        System.out.print("Enter the height of the triangle: ");
        height = input.nextDouble();
        System.out.print("Enter the width of the triangle: ");
        width = input.nextDouble();
        Rectangle rectangle1 = new Rectangle(height, width);
        System.out.println(rectangle1);

        input.close();
    }
}
