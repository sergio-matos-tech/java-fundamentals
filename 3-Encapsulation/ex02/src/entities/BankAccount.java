package entities;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount() {}

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public void setName(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getName() {
        return this.accountHolder;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            amount += 5;
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "\nAccount Data{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=$" + balance +
                '}';
    }
}
