import domain.Country;
import domain.factory.CurrencyFactory;

public class CurrencyFactoryTest {

    public static void main(String[] args) {

        System.out.println(CurrencyFactory.newCurrency(Country.USA).getSymbol());
        System.out.println(CurrencyFactory.newCurrency(Country.BRAZIL).getSymbol());
    }
}
