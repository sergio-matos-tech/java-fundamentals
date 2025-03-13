package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the data of the Car Rental ");
        System.out.print("Car Model: ");
        String carModel = input.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), dateTimeFormatter);
        System.out.print("Check-out date (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(start, new Vehicle(carModel), finish);

        System.out.print("Enter the price per hour: $");
        double pricePerHour = input.nextDouble();
        System.out.print("Enter the price per day: $");
        double pricePerDay = input.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(carRental);
        System.out.println("FATURA: ");
        System.out.println("Basic Payment: $" + carRental.getInvoice().getBasicPayment());
        System.out.println("Tax: $" + carRental.getInvoice().getTax());
        System.out.println("Total Payment: $" + carRental.getInvoice().getTotalPayment());

        input.close();
    }
}