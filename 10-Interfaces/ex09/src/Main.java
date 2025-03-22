import entities.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Manga> mangaList = new ArrayList<>();

        Manga manga1 = new Manga(333L, "DBZ", 25.5);
        Manga manga2 = new Manga(555L, "Naruto", 30.0);
        Manga manga3 = new Manga(111L, "Pokemon", 32.12);
        Manga manga4 = new Manga(999L, "DB Super", 31.4);

        Collections.addAll(mangaList, manga1, manga2, manga3, manga4);
        System.out.println(mangaList);

        Collections.sort(mangaList);
        System.out.println(mangaList);

    }
}