package test;

import dominio.Car;
import interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


//Using a Behavior Parameterization with things more generic
public class BehaviorParameterizationTest03 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2016));

    public static void main(String[] args) {
        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getColor().equals("red")));
        System.out.println(filter(cars, car -> car.getYear() > 1998));

        List<Integer> numbs =  List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println((filter(numbs, num -> num % 2 == 0)));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList     ;
    }
}
