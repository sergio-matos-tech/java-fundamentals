package estruturasRepetitivas;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int limite_superior = leitor.nextInt();
        for (int i = 1; i <= limite_superior; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
