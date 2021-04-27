package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {
        File taxi = new File("src/main/resources/taxi_cars.txt");
        Map<Integer, Point> carMap = new HashMap<>();
        try (Scanner scanner = new Scanner(taxi)) {
            int[] arrayForMap = new int[3];
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] array = s.split(" ");
                for (int i = 0; i < 3; i++)
                    arrayForMap[i] = Integer.parseInt(array[i]);
                carMap.put(arrayForMap[0], new Point(arrayForMap[1], arrayForMap[2]));
            }
            //System.out.println(carMap.get(500));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату квадрата х1: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите координату квадрата y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Введите координату квадрата х2: ");
        int x2 = scanner.nextInt();
        System.out.println("Введите координату квадрата y2: ");
        int y2 = scanner.nextInt();
        scanner.close();
        Set<Point> square = new HashSet<>();
        //int counter = 0;
        for (int i = x1 + 1; i < x2; i++) {
            for (int j = y2 + 1; j < y1; j++) {
                square.add(new Point(i, j));
                //counter++;
            }
        }

        //System.out.println(square);
        //System.out.println(counter);
        int carsCounter = 0;
        System.out.println("Номера машин, доступных в пределах обозначенного квадрата: ");
        for (Map.Entry<Integer, Point> entry : carMap.entrySet()) {
            for (Point point : square) {
                if (entry.getValue().equals(point)) {
                    System.out.println(entry.getKey());
                    carsCounter++;
                }
            }
        }
        System.out.println("Итого доступных машин в обозначенном квадрате: " + carsCounter);
    }
}

