package aplication;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = input.nextLine();
        BankAccount bankAccount1 = new BankAccount();

        char isThereInitialDeposit;
        do {
            System.out.print("Is there initial deposit? (y/n) ");
            isThereInitialDeposit = input.next().charAt(0);
            if (isThereInitialDeposit == 'y') {
                System.out.print("Enter the initial deposit: $");
                double initialDeposit = input.nextDouble();
                bankAccount1 = new BankAccount(accountHolder, accountNumber, initialDeposit);
            } else if (isThereInitialDeposit == 'n') {
                bankAccount1 = new BankAccount(accountHolder, accountNumber);
            } else {
                System.out.println("Please try again! ");
            }
        } while (isThereInitialDeposit != 'y' && isThereInitialDeposit != 'n');

        System.out.println(bankAccount1);

        System.out.print("Enter a deposit value: $");
        double depositValue = input.nextDouble();
        bankAccount1.deposit(depositValue);
        System.out.println(bankAccount1);

        System.out.print("Enter a withdraw value: $");
        double withdrawValue = input.nextDouble();
        bankAccount1.withdraw(withdrawValue);
        System.out.println(bankAccount1);

        input.close();
    }
}