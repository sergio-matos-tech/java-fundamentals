package estruturaSequencial;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Raio: ");
        double raio = leitor.nextDouble();

        System.out.printf("Área = %.4f", Math.PI * (Math.pow(raio, 2)));
    }
}
