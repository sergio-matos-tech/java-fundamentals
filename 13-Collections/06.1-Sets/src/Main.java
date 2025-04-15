import entities.Manga;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Manga> mangaSet = new HashSet<>();
        mangaSet.add(new Manga("Dragon Ball Z", 1L, 2.99));
        mangaSet.add(new Manga("Dragon Ball GT", 2L, 3.99));
        mangaSet.add(new Manga("Naruto", 3L, 1.99));

        Set<Manga> mangasTreeSet = new TreeSet<>();
        mangasTreeSet.add(new Manga("Dragon Ball Z", 1L, 2.99));
        mangasTreeSet.add(new Manga("Dragon Ball GT", 2L, 3.99));
        mangasTreeSet.add(new Manga("Naruto", 3L, 1.99));

        for (Manga m : mangaSet) {
            System.out.print(m + " hasCode: ");
            System.out.println(m.hashCode());
        }

        System.out.println();
        for (Manga m : mangasTreeSet) {
            System.out.print(m + " hasCode: ");
            System.out.println(m.hashCode());
        }
    }
}