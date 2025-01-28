package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o X da cordenada (x, y)");
        double x = leitor.nextDouble();
        System.out.println("Digite o Y da cordenada (x, y)");
        double y = leitor.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("origem");
        } else {
            if (x > 0)
                if (y > 0)
                    System.out.println("Q1");
                else
                    System.out.println("Q4");
            else if (x < 0)
                if (y > 0)
                    System.out.println("Q2");
                else
                    System.out.println("Q3");
        }

        leitor.close();
    }
}
