package application;

import domain.Category;
import domain.LightNovel;
import domain.Promotion;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {

        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shifttraea", 9.99, Category.FANTASY),
                new LightNovel("Dragon Ball", 5.99, Category.FANTASY),
                new LightNovel("Naruto", 11.99, Category.FANTASY),
                new LightNovel("Berserk", 3.99, Category.DRAMA),
                new LightNovel("Monogatari", 15.99, Category.ROMANCE)
        ));

        Map<Category, Map<Promotion, List<LightNovel>>> categoryMapMap =
                lightNovels.stream()
                        .collect(Collectors.groupingBy(
                LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));



        Map<Promotion, List<LightNovel>> promotionListMap = lightNovels.stream()
                .collect(Collectors.groupingBy(
                        ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));

        for (Map.Entry<Promotion, List<LightNovel>> entry : promotionListMap.entrySet()) {
            System.out.println();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        DoubleSummaryStatistics stats = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println("\n" + stats);

    }
}
