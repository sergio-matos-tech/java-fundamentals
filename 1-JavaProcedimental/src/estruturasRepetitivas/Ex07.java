package estruturasRepetitivas;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        String original = "   ---Elden Ring is the best game of all time---   ";

        String originaLowerCase = original.toLowerCase();
        String originalUpperCase = original.toUpperCase();
        String originalWithoutSpaces = original.trim();
        String palavra2 = original.substring(17);
        String palavra3 = original.substring(17, 25);
        String trocar_E_por_X = original.replace('e', 'X');
        String trocarPalavra = original.replace("Elden Ring", "RDR2");


        int indexElden = original.indexOf("Elden");
        int indexLast = original.lastIndexOf("e");
        int lengthOriginal = original.length();

        System.out.println(original + "-");
        System.out.println(originaLowerCase+ "-");
        System.out.println(originalUpperCase+ "-");
        System.out.println(originalWithoutSpaces + "-");
        System.out.println(palavra2);
        System.out.println(palavra3);
        System.out.println(trocar_E_por_X);
        System.out.println(trocarPalavra);
        System.out.println(indexElden);
        System.out.println(indexLast);
        System.out.println(lengthOriginal);


        String example = "potato apple lemon";

        String[] vector = example.split(" ");
        System.out.println(Arrays.toString(vector));
    }
}
