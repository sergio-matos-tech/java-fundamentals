package estruturaSequencial;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 decimal numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.printf("The square root of %.1f is %f\n", num1, Math.sqrt(num1));
        System.out.printf("The square of %.1f is %.3f\n", num1, Math.pow(num1, 2));
        System.out.printf("%.1f ^ %.1f is %.3f\n", num1, num2, Math.pow(num1, num2));

        int num3 = -23;
        System.out.println(Math.abs(num3));

        sc.close();
    }
}
