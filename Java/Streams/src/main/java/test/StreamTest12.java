package test;

import dominio.Category;
import dominio.LightNovel;
import dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static dominio.Promotion.NORMAL_PRICE;
import static dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

//Grouping lightNovel by category using collect(Collectors.groupingBy)
public class StreamTest12 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {

        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(groupingBy(StreamTest12::getPromotion));
        System.out.println(collect);

        System.out.println();
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, groupingBy(StreamTest12::getPromotion)));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
