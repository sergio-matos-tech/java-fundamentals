package application;

import domain.Account;

public class App1 {
    public static void main(String[] args) {

        Account account = new Account(50.0);
        account.deposit(100.0);
        for (int i = 0; i < 5; i++) {
            account.withdrawalAmount(10);
        }


        System.out.println(account.getBalance());



    }

}
