import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double sum = 0;

        System.out.print("How many floating numbers would you like to enter (maximum = 10): ");
        int amountOfNumbers = input.nextInt();

        double[] floatingNumbers = (amountOfNumbers > 0 && amountOfNumbers < 11) ?
                new double[amountOfNumbers]: new double[10];

        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.printf("Enter the %dº number: ", i + 1);
            floatingNumbers[i] = input.nextDouble();
        }

        System.out.println("\nNumbers written: \n" + Arrays.toString(floatingNumbers));
        for (int i = 0; i < amountOfNumbers; i++) {
            sum += floatingNumbers[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / amountOfNumbers);

        input.close();
    }
}