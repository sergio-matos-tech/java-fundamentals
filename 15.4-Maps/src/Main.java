import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Goku");
        Consumidor consumidor2 = new Consumidor("Vegeta");

        Manga manga1 = new Manga(19.99, "Dragon Ball");
        Manga manga2 = new Manga(39.99, "Berserk");
        Manga manga3 = new Manga(9.99, "Naruto");

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga2);
        consumidorMangaMap.put(consumidor2, manga1);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()) {
            System.out.printf("O consumidor [%s] comprou o mangá [%s] \n",
                    entry.getKey().getNome(), entry.getValue().getNome());
        }
    }
}