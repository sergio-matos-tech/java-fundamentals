package application;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateStr = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);

        System.out.println("Enter order data:");
        System.out.print("Status: (PENDING_PAYMENT/PROCESSING/SHIPPED/DELIVERED) ");
        String statusStr = input.nextLine();
        OrderStatus status = OrderStatus.valueOf(statusStr.toUpperCase());

        System.out.print("How many items to this order? ");
        int numItems = input.nextInt();
        input.nextLine();
        List<OrderItem> items = new ArrayList<>();

        for (int i = 0; i < numItems; i++) {
            System.out.println("\nEnter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = input.nextLine();
            System.out.print("Product price: $");
            Double productPrice = input.nextDouble();

            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            input.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);

            items.add(item);
        }

        LocalDate localDateNow = LocalDate.now(ZoneId.systemDefault());
        Client client = new Client(name, email, birthDate);
        Order order = new Order(client, localDateNow,  status);
        for (OrderItem item : items) {
            order.addItem(item);
        }

        System.out.println();
        order.printSummary();

        input.close();
    }
}