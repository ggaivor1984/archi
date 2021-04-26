package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File billion = new File("src/main/resources/numbers19.txt");
        try {
            Scanner scanner = new Scanner(billion);
            Set<Integer> numbers = new HashSet<>();
            //List<Integer> numbers1 = new ArrayList<>();
            while (scanner.hasNext()) {
                numbers.add(scanner.nextInt());
                //numbers1.add(scanner.nextInt());
            }
            scanner.close();
            //System.out.println(numbers);
            int counter = 0;
            for (int x : numbers) {
                if (x >= 500000000 && x <= 600000000)
                    counter++;
            }
            System.out.println("количество числе от 500 до 600 млн. равно: " + counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
