package test;

import dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {

        System.out.println(lightNovels.stream().anyMatch(x -> x.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(x -> x.getPrice() < 100));
        System.out.println(lightNovels.stream().noneMatch(x -> x.getPrice() < 0));

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getTitle))
                .ifPresent(System.out::println);


    }
}
