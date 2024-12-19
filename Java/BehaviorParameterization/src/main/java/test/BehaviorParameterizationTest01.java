package test;

import dominio.Car;

import java.util.ArrayList;
import java.util.List;

//Some tests without the Behavior Parameterization
public class BehaviorParameterizationTest01 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2016));
    public static void main(String[] args) {

        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("---------");
        System.out.println(filterByAgeAfter(cars, 1998));

    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : cars){
            if(car.getColor().equals("green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : cars){
            if(car.getColor().equals("red")){
                 filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : cars){
            if(car.getColor().equals(color)){
                 filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByAgeAfter(List<Car> cars, Integer age){
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : cars){
            if(car.getYear() > age){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
