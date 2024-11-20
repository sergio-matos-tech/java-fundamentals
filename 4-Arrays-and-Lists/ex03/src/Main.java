import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter? (maximum = 10): ");
        int amountOfNumbers = input.nextInt();

        int[] numbers = (amountOfNumbers > 0 && amountOfNumbers < 11) ? new int[amountOfNumbers]: new int[10];
        ArrayList<Integer> negativeNumbers = new ArrayList<>();

        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.printf("Enter the %dº integer: ", i + 1);
            numbers[i] = input.nextInt();
            if (numbers[i] < 0) {
                negativeNumbers.add(numbers[i]);
            }
        }
        System.out.println("\nALL NUMBERS WRITTEN: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("NEGATIVE NUMBERS");
        System.out.println(negativeNumbers);

        input.close();
    }
}