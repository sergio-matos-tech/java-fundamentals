package application;

import domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Naruto", 11.99),
                new LightNovel("Tensei Shifttraea", 9.99),
                new LightNovel("Dragon Ball", 5.99),
                new LightNovel("Berserk", 3.99),
                new LightNovel("Fullmetal Alchemist", 15.99)
        ));

        lightNovels.stream()
                .filter(ln -> ln.getPrice() < 10)
                .findFirst()
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(ln -> ln.getPrice() < 10)
                .findAny()
                .ifPresent(System.out::println);


        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() >= 10));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() >= 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() <= 0));
    }
}
