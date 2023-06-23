package ua.javarush.task.pro.task18.task1820;

import java.util.Optional;
import java.util.stream.Stream;

/* 
Найдорожча автівка
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X3", 54_000),
                new Car("X5", 110_000),

                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
      Optional <Car> mostExpensiveCar = cars.max((o1, o2) -> o1.getPrice()- o2.getPrice());
        return mostExpensiveCar;
    }

//    ArrayList<String> list = new ArrayList<String>();
//Collections.addAll(list, "Привіт", "як", "справи?");
//    String max = list.stream().max( (s1, s2)-> s1.length()-s2.length() ).get();
    //Stream<String> stream = list.stream();
    //Optional<String> result = stream.findFirst();
    //String str = result.get(); // Привіт

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice()).findFirst();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобіль " + name + ", ціна - " + price + " USD";
    }
}
