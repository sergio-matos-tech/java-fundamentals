package domain;

public class Account {
    private Double balance;


    public Account(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            throw new ArithmeticException();
        }
    }

    public void withdrawalAmount(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + ": Withdrawing " + amount + " from balance " + balance);
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + ": Withdrawing " + amount + " from balance " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + ": Insufficient balance");
            throw new ArithmeticException();
        }

    }



    public Double getBalance() {
        return balance;
    }
}
