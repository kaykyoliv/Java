package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Kame", "Hame", "Ha");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream().map(x -> x.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);
        List<String> letters2 = words.stream()
                .map(w -> w.split(""))//Stream<String[]>
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());//Stream<String>

        System.out.println(letters2);

    }
}
