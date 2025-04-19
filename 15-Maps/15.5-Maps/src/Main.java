import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Goku");
        Consumidor consumidor2 = new Consumidor("Vegeta");

        Manga manga1 = new Manga(19.99, "Dragon Ball");
        Manga manga2 = new Manga(39.99, "Berserk");
        Manga manga3 = new Manga(9.99, "Naruto");
        List<Manga> mangaList = new ArrayList<>();
        Collections.addAll(mangaList, manga1, manga2, manga3);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaList);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " Comprou os mangas: ");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
        }
    }
}