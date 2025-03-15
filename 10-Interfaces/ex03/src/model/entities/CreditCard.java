package model.entities;

import model.domain.Payment;

public class CreditCard implements Payment {


    @Override
    public Double processPayment(double amount) {
        return amount * 1.1;
    }
}
