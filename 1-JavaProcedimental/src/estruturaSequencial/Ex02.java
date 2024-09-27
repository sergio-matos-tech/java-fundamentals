package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex02
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        // Entrada de dados para uma String
        Scanner entrada = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String palavra = entrada.nextLine();
        System.out.printf("You entered [%s]\n", palavra);

        // Entrada de dados para um inteiro
        System.out.print("Enter an integer number: ");
        int num = entrada.nextInt();
        System.out.printf("You entered [%d]\n", num);

        // Entrada de dados para um número com ponto flutuante
        System.out.print("Enter a float number: ");
        double num2 = entrada.nextDouble();
        System.out.printf("\nYou entered [%.3f]\n", num2);

        // Entrada de dados para um caractere
        System.out.print("Enter a character: ");
        char letra = entrada.next().charAt(0);
        System.out.printf("\nYou entered [%c]", letra);

        entrada.close();
    }
}
