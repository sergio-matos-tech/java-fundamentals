package org.api.calculator.decorators;

import org.api.calculator.PriceCalculator;
import org.api.model.Order;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArredondamentoDecorator extends PriceDecorator {

    public ArredondamentoDecorator(PriceCalculator calculator) {
        super(calculator);
    }

    @Override
    public BigDecimal total(Order order) {
        BigDecimal currentTotal = super.total(order);

        // Padrão bancário (HALF_EVEN)
        return currentTotal.setScale(2, RoundingMode.HALF_EVEN);
    }
}
