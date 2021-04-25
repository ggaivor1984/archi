package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File dushi = new File("src/main/resources/dushi.txt");
        try (Scanner scanner = new Scanner(dushi)) {
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            Map<String, Integer> wordsInText = new HashMap<>();
            int counter = 0;
            while (scanner.hasNext()) {
                String s = scanner.next();
                if (wordsInText.containsKey(s)) {
                    counter = wordsInText.get(s);
                    wordsInText.put(s, counter + 1);
                } else wordsInText.put(s, 1);
            }
            //System.out.println(wordsInText.get("бричка"));

           /* for (Map.Entry<String, Integer> entry : wordsInText.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }*/
            Map<String, Integer> sortedByValue = wordsInText.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors
                            .toMap(Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (e1, e2) -> e1,
                                    LinkedHashMap::new));
            //System.out.println(sortedByValue.get("Чичиков"));
            //System.out.println(sortedByValue.size());
            int count = 0;
            int numberOfsouts = 0;
            for (Map.Entry<String, Integer> entry : sortedByValue.entrySet()) {
                count++;
                if (count >= sortedByValue.size() - 99) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                    numberOfsouts++;
                }
            }
            System.out.println(numberOfsouts);// Чичиков 601

        } catch (FileNotFoundException e) {
            System.out.println("Искомый файл не найден");
        }
    }
}
