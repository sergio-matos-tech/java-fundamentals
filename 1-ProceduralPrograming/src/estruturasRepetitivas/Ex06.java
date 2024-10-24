package estruturasRepetitivas;

import java.util.Scanner;

public class Ex06 {
    public int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Ex06 fat = new Ex06();
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int n = leitor.nextInt();
        System.out.println("Fatorial de " + n + " é: " + fat.fatorial(n));
    }
}

