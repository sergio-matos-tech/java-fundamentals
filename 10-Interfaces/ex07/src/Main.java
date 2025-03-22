import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball");
        mangas.add("Naruto");

        List<Double> valores = new ArrayList<>();
        valores.add(100.21);
        valores.add(23.93);
        valores.add(32.445);

        Collections.sort(valores);
        System.out.println(valores);

        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}