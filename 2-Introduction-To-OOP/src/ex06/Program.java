package ex06;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o valor do dólar atualmente? ");
        double valorDolar = input.nextDouble();
        System.out.print("Quantos dólares deseja comprar? $");
        double quantidadeDeDolares = input.nextDouble();
        System.out.printf("Quantidade a pagar em reais: R$ %.3f",
                CurrencyConverter.amountToBePaid(valorDolar, quantidadeDeDolares));

        input.close();
    }
}
