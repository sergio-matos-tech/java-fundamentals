package application;

import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order1);

        OrderStatus orderStatus = OrderStatus.DELIVERED;
        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(orderStatus);
        System.out.println(orderStatus2);
    }
}
