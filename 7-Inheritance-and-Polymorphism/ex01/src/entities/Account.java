package entities;

public abstract class Account {

    protected Integer number;
    protected String holder;
    protected Double balance;

    protected Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withdraw(double amount) {
        balance -= amount + (amount * 0.05);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
