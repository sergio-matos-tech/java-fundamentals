package estruturaSequencial;

import java.util.Locale;

public class Ex01
{
    public static void main (String[] args)
    {
        String product01 = "Computer";
        String product02 = "Mouse";

        int age = 30;
        int code = 2354;
        char gender = 'F';

        double price1 = 2999.99;
        double price2 = 650.233;
        double measure = 53.352334;

        System.out.println("Products:");
        System.out.printf("%s, which the price is $ %.2f\n", product01, price1);
        System.out.printf("%s, which the price is $ %.2f\n", product02, price2);

        System.out.printf("Record: %d years old, code %d and gender %c\n", age, code, gender);
        System.out.printf("Measure with 8 decimal places: %.8f\n", measure);
        System.out.printf("Measure with 3 decimal places: %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);
    }
}
