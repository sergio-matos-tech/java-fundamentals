package org.api.calculator.decorators;

import org.api.calculator.PriceCalculator;
import org.api.model.Order;

import java.math.BigDecimal;
import java.util.Map;

public class CouponDecorator extends PriceDecorator {

    // Regras de negócio de cupons encapsuladas
    private record CouponRule(BigDecimal percent, BigDecimal maxDiscount) {}

    private static final Map<String, CouponRule> COUPON_RULES = Map.of(
            "PROMO10", new CouponRule(new BigDecimal("0.10"), new BigDecimal("50.00")),
            "PROMO20", new CouponRule(new BigDecimal("0.20"), new BigDecimal("100.00"))
    );

    public CouponDecorator(PriceCalculator calculator) {
        super(calculator);
    }

    @Override
    public BigDecimal total(Order order) {
        BigDecimal currentTotal = super.total(order);

        if (order.getCouponCode() == null || !COUPON_RULES.containsKey(order.getCouponCode())) {
            return currentTotal; // Nenhum cupom válido, retorna o total atual
        }

        CouponRule rule = COUPON_RULES.get(order.getCouponCode());
        BigDecimal discount = currentTotal.multiply(rule.percent());

        // Respeita o teto máximo
        if (discount.compareTo(rule.maxDiscount()) > 0) {
            discount = rule.maxDiscount();
        }

        return currentTotal.subtract(discount);
    }
}
