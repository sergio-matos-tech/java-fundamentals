package org.api.model;

import java.util.List;

public class Order {
    private List<Item> items;
    private String uf;
    private CustomerLevel customerLevel;
    private String couponCode;

    public Order(List<Item> items, String uf, CustomerLevel customerLevel, String couponCode) {
        this.items = items;
        this.uf = uf;
        this.customerLevel = customerLevel;
        this.couponCode = couponCode;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getUf() {
        return uf;
    }

    public CustomerLevel getCustomerLevel() {
        return customerLevel;
    }

    public String getCouponCode() {
        return couponCode;
    }
}
