package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File myfile = new File("people");
        System.out.println(parseFileToStringList(myfile));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peopleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] array = s.split(" ");
                if (Integer.parseInt(array[1]) < 0) throw new IOException();
                peopleList.add(s);

            }
            scanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (java.io.IOException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return peopleList;
    }
}
