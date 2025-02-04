package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(808, "Kakaroto", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(909, "Miroslave", 0.0, 500.0);

        // UPCASTING
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Boberson", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Mariana", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100);

        if (account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200);
            System.out.println("Loaned");
        }

        if (account3 instanceof  SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Updated");
        }

        Account account5 = new Account(1011, "Alex", 1000.0);
        account5.withdraw(200);
        System.out.println(account5.getBalance());

        Account account6 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        account6.withdraw(200);
        System.out.println(account6.getBalance());
    }
}