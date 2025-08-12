package domain.factory;

import domain.Country;
import domain.Currency;
import domain.Real;
import domain.USDollar;

public class CurrencyFactory {

    public static Currency newCurrency(Country country) {

        switch (country) {
            case USA -> {
                return new USDollar();
            }
            case BRAZIL -> {
                return new Real();
            }
            default -> throw new IllegalArgumentException("No currency");
        }
    }
}
