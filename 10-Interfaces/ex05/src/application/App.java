package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");
        System.out.print("Contract Number: ");
        int contractNumber = input.nextInt();
        input.nextLine();
        System.out.print("Contract Date (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(input.nextLine(), dateTimeFormatter);
        System.out.print("Value of Contract: $");
        double contractValue = input.nextDouble();
        System.out.print("Installment amount: ");
        int installmentAmount = input.nextInt();
        input.nextLine();

        Contract contract = new Contract(contractNumber, contractValue, contractDate);
        ContractService service = new ContractService(new PayPalService());
        service.processContract(contract, installmentAmount);
        System.out.println("Installments: \n");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        input.close();
    }
}