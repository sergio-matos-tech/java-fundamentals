package org.api.calculator;

import org.api.model.Order;

import java.math.BigDecimal;

public interface PriceCalculator {
    BigDecimal total(Order order);
}
