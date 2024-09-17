import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int teste = 10;
        double teste2 = 1.2354353;
        System.out.println(teste);
        System.out.println("oi " + teste);
        System.out.printf("%d\n", teste);
        System.out.printf("%.3f\n", teste2);
        System.out.println("Hello world!");
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f\n", teste2);
    }
}