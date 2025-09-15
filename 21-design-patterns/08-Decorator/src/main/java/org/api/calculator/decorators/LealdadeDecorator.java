package org.api.calculator.decorators;

import org.api.calculator.PriceCalculator;
import org.api.model.Order;

import java.math.BigDecimal;

public class LealdadeDecorator extends PriceDecorator {

    public LealdadeDecorator(PriceCalculator calculator) {
        super(calculator);
    }

    @Override
    public BigDecimal total(Order order) {
        BigDecimal currentTotal = super.total(order);
        BigDecimal discountPercent = order.getCustomerLevel().getDiscountPercent();

        if (discountPercent.compareTo(BigDecimal.ZERO) == 0) {
            return currentTotal;
        }

        BigDecimal discount = currentTotal.multiply(discountPercent);
        return currentTotal.subtract(discount);
    }
}
