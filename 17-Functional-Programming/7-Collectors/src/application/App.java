package application;

import domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shifttraea", 9.99),
                new LightNovel("Dragon Ball", 5.99),
                new LightNovel("Naruto", 11.99),
                new LightNovel("Berserk", 3.99),
                new LightNovel("Fullmetal Alchemist", 15.99)
        ));

        System.out.println((long) lightNovels.size());

        lightNovels.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        System.out.println();
        DoubleSummaryStatistics stats = lightNovels.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(stats);

        String titles = lightNovels.stream()
                .map(LightNovel::getTitle)
                        .collect(Collectors.joining(", "));

        System.out.println(titles);
    }
}
