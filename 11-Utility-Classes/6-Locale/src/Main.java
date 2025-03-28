import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        System.out.println(localeBR);
        System.out.println(localeJP);

        NumberFormatter numberFormatter = new NumberFormatter();
        System.out.println(numberFormatter);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeBR);
        double valor = 100000000f;
        System.out.println(numberFormat.format(valor));


    }
}