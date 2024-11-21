import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float[] numbers = new float[4];
        float sum = 0;
        float average;

        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter the %dº number: ", i + 1);
            numbers[i] = input.nextFloat();
            sum += numbers[i];
        }
        average = sum / numbers.length;
        System.out.printf("Average of the array: %.3f\n", average);

        System.out.println("Values lower than average: ");
        for (int i = 0; i < 4; i++) {
            if (numbers[i] < average) {
                System.out.println(numbers[i]);
            }
        }

        input.close();
    }
}