package repository;

import domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Samurai Shamploo", 25), new Manga(2, "Cowboy Bebop", 24));

    public static Optional<Manga> findById(Integer id){
        return findBy(x -> x.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(x -> x.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for(Manga manga : mangas){
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);

    }
}
