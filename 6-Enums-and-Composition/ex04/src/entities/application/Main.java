package entities.application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss ");


        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = input.nextLine();
        System.out.print("Email: ");
        String clientEmail = input.nextLine();

        System.out.print("Birth date (dd/MM/yyyy): ");
        String birthDateOfClient = input.nextLine();
        LocalDate birthLocalDate = LocalDate.parse(birthDateOfClient, customFormatter);
        Client client = new Client(clientName, birthLocalDate, clientEmail);

        LocalDateTime orderMoment = LocalDateTime.now();
        orderMoment.format(dateTimeFormatter);
        System.out.print("Status: (PENDING_PAYMENT/PROCESSING/SHIPPED/DELIVERED/) ");
        OrderStatus status = OrderStatus.valueOf(input.nextLine());
        Order order = new Order(orderMoment, status, client);

        System.out.print("How many items to order? ");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data: \n", i + 1);

            System.out.print("Product name: ");
            String productName = input.nextLine();
            System.out.print("Product price: $");
            Double productPrice = input.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = input.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);
            order.addItem(item);

            input.nextLine();
        }
        
        System.out.println(order);

        input.close();
    }
}
