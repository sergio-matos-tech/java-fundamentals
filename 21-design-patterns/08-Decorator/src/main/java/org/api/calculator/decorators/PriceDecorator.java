package org.api.calculator.decorators;

import org.api.calculator.PriceCalculator;
import org.api.model.Order;

import java.math.BigDecimal;

public abstract class PriceDecorator implements PriceCalculator {

    // Referência para o objeto "envolvido" (wrapped)
    protected PriceCalculator calculator;

    public PriceDecorator(PriceCalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Por padrão, o decorator apenas delega a chamada para o objeto envolvido.
     * As subclasses (decorators concretos) irão sobrescrever este método
     * para adicionar seu próprio comportamento.
     */
    @Override
    public BigDecimal total(Order order) {
        return calculator.total(order);
    }
}
