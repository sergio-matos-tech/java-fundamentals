package application;

import models.entities.Account;
import models.exceptions.DomainException;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DomainException {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        LinkedList<Account> accounts = new LinkedList<>();

        System.out.println("CREATING A BANK ACCOUNT");
        System.out.println("----- Enter account data -----");
        System.out.print("Holder name of the account: ");
        String holder = input.nextLine();
        System.out.print("Account number: ");
        Integer accountNumber = input.nextInt();
        System.out.print("Initial Balance: $");
        Double balance = input.useLocale(Locale.US).nextDouble();
        System.out.print("Withdraw limit: $");
        Double withdrawLimit = input.useLocale(Locale.US).nextDouble();
        Account account1 = new Account(accountNumber, withdrawLimit, balance, holder);
        accounts.add(account1);

        System.out.println("\n------ WITHDRAW FUNCTION ------");
        System.out.print("Enter amount for withdraw: $");
        Double withdrawAmount = input.useLocale(Locale.US).nextDouble();
        account1.withdraw(withdrawAmount);

        System.out.println("ACCOUNT DATA: ");
        System.out.println(account1);

        input.close();
    }
}