package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        // example of polymorphism
       Account account1 = new BusinessAccount(5050, "Cats", 2000.0, 5000.0);
       Account account2 = new SavingsAccount(8080, "Mats", 1000.0, 0.01);
       accounts.add(account1);
       accounts.add(account2);

       account1.withdraw(50.0);
       account2.withdraw(50.0);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());

        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}