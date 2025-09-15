package org.api.model;

import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal unitPrice;
    private int quantity;

    public Item(String name, String unitPrice, int quantity) {
        this.name = name;
        // Use o construtor String do BigDecimal para evitar problemas de precisão
        this.unitPrice = new BigDecimal(unitPrice);
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
