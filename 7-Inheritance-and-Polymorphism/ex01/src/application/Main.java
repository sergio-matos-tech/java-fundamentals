package application;

import entities.Account;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        // example of polymorphism
       Account account1 = new Account(9090, "Henri", 1000.0);
       Account account2 = new SavingsAccount(8080, "Mats", 1000.0, 0.01);

       account1.withdraw(50.0);
       account2.withdraw(50.0);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}