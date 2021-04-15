package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File myfile = new File("people");
        List<Person> human = parseFileToObjList(myfile);
        System.out.println(human);
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> peopleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Person person = new Person();
                String s = scanner.nextLine();
                String[] peopleData = s.split(" ");
                if (Integer.parseInt(peopleData[1]) < 0) {
                    throw new IOException();
                }
                person.setName(peopleData[0]);
                person.setYear(Integer.parseInt(peopleData[1]));
                peopleList.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return peopleList;
    }
}
