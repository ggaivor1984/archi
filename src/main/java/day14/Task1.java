package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File myfile = new File("digits");
        printSumDigits(myfile);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String fileDigits = scanner.nextLine();
            String[] splitedDigits = fileDigits.split(" ");

            if (splitedDigits.length < 10 || splitedDigits.length > 10) {
                throw new IOException();
            }
            int[] myDigits = new int[10];
            int i = 0;
            for (String x : splitedDigits) {
                myDigits[i++] = Integer.parseInt(x);
            }
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += myDigits[j];
            }
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (java.io.IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
