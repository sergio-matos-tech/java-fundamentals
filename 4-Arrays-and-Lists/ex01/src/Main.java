import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many heights of people would you like to inform: ");
        int n = input.nextInt();
        double[] heights = new double[n];
        double sumOfHeights = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Height (%d): ", i + 1);
            heights[i] = input.nextDouble();
            sumOfHeights += heights[i];
        }

        System.out.println(Arrays.toString(heights));
        double averageHeight = sumOfHeights / heights.length;
        System.out.printf("Average height: %.2f", averageHeight);
    }
}