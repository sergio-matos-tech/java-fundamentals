package model.entities;

import model.domain.Payment;

public class PaymentSlip implements Payment {
    @Override
    public Double processPayment(double amount) {
        return amount * 1.05;
    }
}
