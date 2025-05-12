package application;

import domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shifttraea", 9.99),
                new LightNovel("Dragon Ball", 5.99),
                new LightNovel("Naruto", 11.99),
                new LightNovel("Berserk", 3.99),
                new LightNovel("Fullmetal Alchemist", 15.99)
        ));

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .filter(ln -> ln.getPrice() <= 10)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList();

        System.out.println(titles);
    }
}
