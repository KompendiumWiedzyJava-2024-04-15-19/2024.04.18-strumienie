package pl.comarch.szkolenia.strumienie.sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Janusz");
        list.add("Adam");
        list.add("Zbyszek");
        list.add("Bogdan");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 200));
        cars.add(new Car("Audi", "A5", 400));
        cars.add(new Car("Ford", "Focus", 150));
        cars.add(new Car("BMW", "3", 300));

        System.out.println(cars);

        Collections.sort(cars);

        System.out.println(cars);

        Collections.sort(cars, new PorownywaczSamochodowPoCenie());
        System.out.println(cars);
        Collections.sort(cars, new PorownywaczSamochodowPoMarce());
        System.out.println(cars);

        Collections.sort(cars,
                (c1, c2) -> c1.getPrice() - c2.getPrice());

        Collections.sort(cars,
                (c1, c2) -> c2.getPrice() - c1.getPrice());


        Collections.sort(cars, (c1, c2) -> c1.getBrand().compareTo(c2.getBrand()));

        Comparator<Car> x = (c1, c2) -> c1.getBrand().compareTo(c2.getBrand());
    }

    public static void metoda() {

    }
}
