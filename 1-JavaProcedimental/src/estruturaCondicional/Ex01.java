package estruturaCondicional;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        if (num1 > num2) {
            if (num1 % num2 == 0)
                System.out.println("São múltiplos");
            else
                System.out.println("Não são múltiplos");
        } else {
            if (num2 % num1 == 0)
                System.out.println("São múltiplos");
            else
                System.out.println("Não são múltiplos");
        }
    }
}
