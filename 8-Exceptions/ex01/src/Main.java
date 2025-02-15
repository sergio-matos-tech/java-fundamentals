import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testMethod();


    }

    public static void testMethod() {
        Scanner input = new Scanner(System.in);
        try {
            String[] string = input.nextLine().split(" ");
            int index = input.nextInt();
            System.out.println(string[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INDEX ERROR! ");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("ERROR");

        }
        input.close();
    }
}