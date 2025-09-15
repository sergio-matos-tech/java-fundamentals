package org.api.model;

import java.math.BigDecimal;

public enum CustomerLevel {
    STANDARD(new BigDecimal("0.00")), // 0%
    SILVER(new BigDecimal("0.03")),   // 3%
    GOLD(new BigDecimal("0.05")),     // 5%
    PLATINUM(new BigDecimal("0.07")); // 7%

    private final BigDecimal discountPercent;

    CustomerLevel(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }
}
