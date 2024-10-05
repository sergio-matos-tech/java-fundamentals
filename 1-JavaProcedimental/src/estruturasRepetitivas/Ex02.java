package estruturasRepetitivas;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int valor;
        int soma = 0;
        do {
            valor = leitor.nextInt();
            soma += valor;
        } while (valor != 0);
    }
}
