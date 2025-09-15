package org.api.calculator.decorators;

import org.api.calculator.PriceCalculator;
import org.api.model.Order;

import java.math.BigDecimal;
import java.util.Map;

public class ICMSDecorator extends PriceDecorator {

    // Regras de negócio do ICMS encapsuladas aqui
    private static final Map<String, BigDecimal> ICMS_RATES = Map.of(
            "MG", new BigDecimal("0.18"),
            "SP", new BigDecimal("0.17"),
            "RJ", new BigDecimal("0.20")
    );
    private static final BigDecimal DEFAULT_RATE = new BigDecimal("0.18"); // Padrão MG

    public ICMSDecorator(PriceCalculator calculator) {
        super(calculator);
    }

    @Override
    public BigDecimal total(Order order) {
        // 1. Pega o valor calculado ATÉ AGORA (pelo componente/decorator envolvido)
        BigDecimal currentTotal = super.total(order);

        // 2. Adiciona o novo comportamento (calcular e somar ICMS)
        BigDecimal icmsRate = ICMS_RATES.getOrDefault(order.getUf().toUpperCase(), DEFAULT_RATE);
        BigDecimal icmsValue = currentTotal.multiply(icmsRate);

        // Retorna o novo total
        return currentTotal.add(icmsValue);
    }
}
