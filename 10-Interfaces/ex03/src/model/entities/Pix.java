package model.entities;

import model.domain.Payment;

public class Pix implements Payment {
    @Override
    public Double processPayment(double amount) {
        return amount;
    }
}
