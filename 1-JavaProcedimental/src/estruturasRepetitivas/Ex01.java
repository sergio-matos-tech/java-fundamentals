package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;


// códgio simples para testar o debug
public class Ex01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double largura = leitor.nextDouble();
        double comprimento = leitor.nextDouble();
        double metroQuadrado = leitor.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("ÁREA = %.2fm²", area);
        System.out.printf("PREÇO = R$%.2f", preco);

        leitor.close();
    }
}
