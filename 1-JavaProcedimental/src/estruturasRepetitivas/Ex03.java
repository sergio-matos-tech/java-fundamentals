package estruturasRepetitivas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int password;
        while (true) {
            password = reader.nextInt();
            if (password == 2002) {
                System.out.println("Access granted!");
                break;
            } else {
                System.out.println("Invalid password! Try again!");
            }
        }
    }
}
