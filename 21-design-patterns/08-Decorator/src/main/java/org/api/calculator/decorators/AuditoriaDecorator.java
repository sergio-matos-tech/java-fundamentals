package org.api.calculator.decorators;

import org.api.calculator.PriceCalculator;
import org.api.model.Order;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class AuditoriaDecorator extends PriceDecorator {

    private final String stepName;

    public AuditoriaDecorator(PriceCalculator calculator, String stepName) {
        super(calculator);
        this.stepName = stepName;
    }

    @Override
    public BigDecimal total(Order order) {
        // 1. Pega o valor do passo anterior
        BigDecimal value = super.total(order);

        // 2. Loga o valor (o "comportamento" deste decorator)
        String formattedValue = NumberFormat.getCurrencyInstance().format(value);
        System.out.printf("[AUDIT | %-20s] Valor parcial: %s\n", stepName, formattedValue);

        // 3. Retorna o valor sem modificação
        return value;
    }
}
