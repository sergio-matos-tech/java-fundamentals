package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now(ZoneId.systemDefault());
        Order order = new Order(1080, OrderStatus.PENDING, localDate1);

        System.out.println(order);

        order.setStatus(OrderStatus.valueOf("DELIVERED"));

        System.out.println(order);
    }
}
