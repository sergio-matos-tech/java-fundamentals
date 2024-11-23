import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumbers = new Random();

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = randomNumbers.nextInt(-10, 10);
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print("[ ");
            for (int j = 0; j < cols; j++) {
                System.out.printf(" %d  ", matrix[i][j]);
            }
            System.out.println("]");
        }

        int amountOfNegatives = 0;
        System.out.println("\nDiagonal of the matrix");
        for (int i = 0; i < rows; i++) {
            System.out.print("[ ");
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    System.out.printf(" %d  ", matrix[i][j]);
                } else {
                    System.out.print("    ");
                }
                if (matrix[i][j] < 0)
                    amountOfNegatives += 1;

            }
            System.out.println("]");
        }

        System.out.println("\nAmount of negative numbers in the matrix: " + amountOfNegatives);

        input.close();
    }
}