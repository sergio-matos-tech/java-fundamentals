package org.api.calculator.decorators;

import org.api.calculator.PriceCalculator;
import org.api.model.Order;

import java.math.BigDecimal;

public class FreteDecorator extends PriceDecorator {

    private final BigDecimal fixedCost;
    private final BigDecimal freeShippingThreshold;

    public FreteDecorator(PriceCalculator calculator, String fixedCost, String freeShippingThreshold) {
        super(calculator);
        this.fixedCost = new BigDecimal(fixedCost);
        this.freeShippingThreshold = new BigDecimal(freeShippingThreshold);
    }

    @Override
    public BigDecimal total(Order order) {
        BigDecimal currentTotal = super.total(order);

        // Se o total atual for MENOR que o limite, adiciona o frete
        if (currentTotal.compareTo(freeShippingThreshold) < 0) {
            return currentTotal.add(fixedCost);
        }

        // Senão, o frete é grátis
        return currentTotal;
    }
}
