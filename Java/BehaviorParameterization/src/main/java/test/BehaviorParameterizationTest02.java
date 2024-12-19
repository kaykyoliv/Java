package test;

import dominio.Car;
import interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;


//Using a Behavior Parameterization with Predicate
public class BehaviorParameterizationTest02 {

    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2016));

    public static void main(String[] args) {

//        "Anonymous class"
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getColor().equals("red")));
        System.out.println(filter(cars, car -> car.getYear() > 1998));
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : cars){
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
