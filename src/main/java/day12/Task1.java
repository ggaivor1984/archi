package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Peugeout");
        cars.add("Mercedes");
        cars.add("Lada");
        cars.add("BMW");
        cars.add("KIA");
        System.out.println(cars);
        cars.add(2, "Jeep");
        cars.remove(0);
        System.out.println(cars);
    }
}
