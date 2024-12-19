package tests;

import dominio.Anime;
import service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {

    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Vinland Saga", 25), new Anime("One piece", 1080), new Anime("Samurai Shamploo", 24)));

//        Collections.sort(animes, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        System.out.println(animes);

        animes.sort(AnimeComparators::compareByTitle);
        System.out.println(animes);

        animes.sort(AnimeComparators::compareByEpisode);
        System.out.println(animes);
    }

}
