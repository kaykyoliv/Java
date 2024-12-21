package tests;

import domain.Manga;
import repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Samurai Shamploo");
        mangaByTitle.ifPresent(x -> x.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle.get());

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalAccessError::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Naruto")
                .orElseGet(() -> new Manga(3, "Naruto", 500));
        System.out.println(newManga);

    }
}
