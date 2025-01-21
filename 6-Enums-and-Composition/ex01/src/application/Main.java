package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateNow = LocalDateTime.now(ZoneId.systemDefault());
        Order order = new Order(1080, dateNow, OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus orderStatus1 = OrderStatus.DELIVERED;
        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

        Order order1 = new Order(720, dateNow, orderStatus2);
        System.out.println(order1);
        System.out.println(orderStatus1);
    }
}
