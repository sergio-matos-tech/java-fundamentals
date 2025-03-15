package application;

import model.domain.Payment;
import model.entities.CreditCard;
import model.entities.PaymentSlip;
import model.entities.Pix;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("PAYMENT: ");
        System.out.print("Enter the amount to pay: $");
        double amountToPay = input.nextDouble();
        int choice = -1;
        do {
            System.out.print("Enter the way of paying: \n" +
                    "1-> (Credit Card)\n" +
                    "2-> (Payment Slip)\n" +
                    "3 -> (PIX) \n");
            choice = input.nextInt();
        } while (choice != 1 && choice != 2 && choice != 3);

        switch (choice) {
            case 1:
                CreditCard creditCard = new CreditCard();
                System.out.printf("Payment of $%.3f done via CREDIT CARD\n", creditCard.processPayment(amountToPay));
                break;
            case 2:
                PaymentSlip paymentSlip = new PaymentSlip();
                System.out.printf("Payment of $%.3f via PAYMENT SLIP\n", paymentSlip.processPayment(amountToPay));
                break;
            case 3:
                Pix pix = new Pix();
                System.out.printf("Payment of $%.3f via PIX\n", pix.processPayment(amountToPay));
            default:
                break;
        }

        input.close();
    }
}