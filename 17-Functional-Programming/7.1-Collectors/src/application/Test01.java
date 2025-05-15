package application;

import domain.Category;
import domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {

        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shifttraea", 9.99, Category.FANTASY),
                new LightNovel("Dragon Ball", 5.99, Category.FANTASY),
                new LightNovel("Naruto", 11.99, Category.FANTASY),
                new LightNovel("Berserk", 3.99, Category.DRAMA),
                new LightNovel("Full metal Alchemist", 15.99, Category.ROMANCE)
        ));

        Map<Category, List<LightNovel>> lightNovelsByCategory = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        for (Map.Entry<Category, List<LightNovel>> entry : lightNovelsByCategory.entrySet()) {
            System.out.println();
            System.out.println("Category: " + entry.getKey());
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
