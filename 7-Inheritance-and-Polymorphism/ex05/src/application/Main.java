package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Pessoa> taxPayers = new LinkedList<>();

        System.out.print("Quantos pagadores de impostos a cadastrar? ");
        int numberOfTaxPayers = input.nextInt();
        input.nextLine();
        char opcao;
        for (int i = 0; i < numberOfTaxPayers; i++) {
            System.out.printf("TAX PAYER #%d DATA: \n", i + 1);
            do {
                System.out.print("Pessoa Física ou Pessoa Jurídica? (f/j) ");
                opcao = input.next().toLowerCase().charAt(0);
                input.nextLine();
            } while (opcao != 'f' && opcao != 'j');
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Endereço: ");
            String endereco = input.nextLine();
            System.out.print("Renda anual: ");
            Double rendaAnual = input.nextDouble();
            input.nextLine();
            if (opcao == 'f') {
                System.out.print("CPF: ");
                String CPF = input.nextLine();
                System.out.print("Gasto com saúde no ano: R$");
                Double gastoSaude = input.nextDouble();

                Pessoa pessoaFisica = new PessoaFisica(nome, endereco, rendaAnual, CPF, gastoSaude);
                taxPayers.add(pessoaFisica);
                input.nextLine();
            } else if (opcao == 'j') {
                System.out.print("CNPJ: ");
                String CNPJ = input.nextLine();
                System.out.print("Quantidade de funcionários: ");
                int qtdFuncionarios = input.nextInt();

                Pessoa pessoaJuridica = new PessoaJuridica(nome, endereco, rendaAnual, qtdFuncionarios, CNPJ);
                taxPayers.add(pessoaJuridica);
                input.nextLine();
            }
        }

        System.out.println("\nVALORES DOS IMPOSTOS A PAGAR: ");
        for (Pessoa p : taxPayers) {
            System.out.printf("%s: R$%.3f\n", p.getNome(), p.calcularImpostoDeRenda2024());
        }
    }
}