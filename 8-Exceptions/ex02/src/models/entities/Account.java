package models.entities;

import models.exceptions.DomainException;

public class Account {
    private Integer accountNumber;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer accountNumber, Double withdrawLimit, Double balance, String holder) throws DomainException {
        if (balance >= 0) {
            this.accountNumber = accountNumber;
            this.withdrawLimit = withdrawLimit;
            this.balance = balance;
            this.holder = holder;
        } else {
            throw new DomainException("Balance must be 0 or greater");
        }
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
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

    public void deposit(Double amount) throws DomainException {
        if (amount >= 0) {
            balance += amount;
        } else {
            throw new DomainException("Amount must be greater than $0.");
        }
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount > balance) {
            throw new DomainException("Withdraw amount must be greater than balance");
        } else if (balance == 0) {
            throw new DomainException("Balance must be greater than $0");
        } else if (amount > withdrawLimit) {
            throw new DomainException("Withdraw amount must be less than the withdraw limit");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account { " +
                "account number = " + accountNumber +
                ", holder = '" + holder + '\'' +
                ", balance = $" + balance +
                ", withdrawLimit = $" + withdrawLimit +
                '}';
    }
}
