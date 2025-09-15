package org.api.calculator.base;

import org.api.calculator.PriceCalculator;
import org.api.model.Item;
import org.api.model.Order;

import java.math.BigDecimal;

public class SubtotalCalculator implements PriceCalculator {

    @Override
    public BigDecimal total(Order order) {
        BigDecimal subtotal = BigDecimal.ZERO;
        for (Item item : order.getItems()) {
            BigDecimal itemTotal = item.getUnitPrice().multiply(new BigDecimal(item.getQuantity()));
            subtotal = subtotal.add(itemTotal);
        }
        return subtotal;
    }
}
