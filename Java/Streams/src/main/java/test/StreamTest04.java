package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> tech = new ArrayList<>();
        List<String> graphicDesigners = List.of("Kayky", "Kaua");
        List<String> developers = List.of("Vinnicius", "Ana", "Julia");
        List<String> students = List.of("Joye", "Gustavo", "Guilherme", "Mateus");
        tech.add(graphicDesigners);
        tech.add(developers);
        tech.add(students);

        for (List<String> people : tech) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----");
        tech.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
