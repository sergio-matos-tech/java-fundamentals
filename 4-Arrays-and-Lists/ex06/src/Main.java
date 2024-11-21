import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers would you like to input? ");
        int amountOfNumbers = input.nextInt();
        int[] numbers = new int[amountOfNumbers];
        int amountOfEvenNumbers = 0;
        int maxNumber = 0;
        int maxIndex = 0;

        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.printf("Enter the %dº number: ", i + 1);
            numbers[i] = input.nextInt();
            if (i == 0) {
                maxNumber = numbers[0];
            }
            if (numbers[i] % 2 == 0)
                amountOfEvenNumbers += 1;

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }

        if (amountOfEvenNumbers >= 0) {
            System.out.println("\nEven Numbers: ");
            for (int i = 0; i < amountOfNumbers; i++) {
                if (numbers[i] % 2 == 0) {
                    System.out.printf("%d  ", numbers[i]);
                }
            }
        } else {
            System.out.println("Any even number! ");
        }

        System.out.printf("Highest entered number: %d\n", maxNumber);
        System.out.printf("Index of the highest entered number: %d", maxIndex);

        input.close();
    }
}