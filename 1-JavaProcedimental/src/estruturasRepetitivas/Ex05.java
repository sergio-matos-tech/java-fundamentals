package estruturasRepetitivas;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeDeNumeros = leitor.nextInt();
        int numero;
        int in = 0;
        int out = 0;
        for (int i = 0; i < quantidadeDeNumeros; i++) {
            numero = leitor.nextInt();
            if (numero >= 10 && numero <= 20)
                in++;
            else
                out++;
        }
        System.out.printf("\n%d in\n%d out\n", in, out);

    }
}
