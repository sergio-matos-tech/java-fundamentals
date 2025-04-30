package application;

import entities.Car;
import entities.CarPredicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        Car car1 = new Car("Audi", "Black", 2015);
        Car car2 = new Car("BMW", "Blue", 2018);
        Car car3 = new Car("Mercedes", "Silver", 2012);

        Collections.addAll(carList, car2, car1, car3);

        List<Car> blackCars = filter(carList, car -> car.getColor().equals("Black"));

        System.out.println(blackCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
