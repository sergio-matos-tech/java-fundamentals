package entities;

import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order() {}

    public Order(Client client, LocalDate moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    private Double total() {
        Double total =  0.0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public void printSummary() {
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + moment);
        System.out.println("Order status: " + status);
        System.out.println("Client: " + client.getName() + " (" + client.getBirthDate() + ") - " + client.getEmail());
        System.out.println("- Ordered items:");
        for (OrderItem item : items) {
            System.out.println(item.getProduct().getName() + ", $" + item.getProduct().getPrice() +
                    ", Quantity: " + item.getQuantity() + ", Subtotal: $" + item.subTotal());
        }
        System.out.println("Total price: $" + total());
    }
}
