package estruturaSequencial;

import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number and 3 strings: ");
        int num = sc.nextInt();
        sc.nextLine();
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        String string3 = sc.nextLine();

        System.out.printf("You entered [%d], [%s], [%s] and [%s]", num, string1, string2, string3);
    }
}
