import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[6];
        int[] array2 = new int[6];
        int[] array3 = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.printf("Enter the %dº of array A: ", i + 1);
            array1[i] = input.nextInt();
        }

        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.printf("Enter the %dº of array B: ", i + 1);
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("\nArray A + Array B: ");
        System.out.println(Arrays.toString(array3));

        input.close();
    }
}