package entities;

import entities.enums.OrderStatus;

import java.time.LocalDate;

public class Order {
    private Integer id;
    private LocalDate moment;
    private OrderStatus Status;

    public Order() {}

    public Order(Integer id, OrderStatus status, LocalDate moment) {
        this.id = id;
        Status = status;
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return Status;
    }

    public void setStatus(OrderStatus status) {
        Status = status;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", Status=" + Status +
                '}';
    }
}
