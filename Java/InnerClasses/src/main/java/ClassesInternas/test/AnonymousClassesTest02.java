package ClassesInternas.test;

import ClassesInternas.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        //Anonymous class
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //Using lambda
        //barcoList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(barcoList);
    }
}
