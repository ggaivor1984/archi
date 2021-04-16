package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File myfile = new File("digits");
        printResult(myfile);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String s = scanner.nextLine();
            String[] nums = s.split(" ");
            double sum = 0;
            double average = 0;
            for (String buf : nums) {
                sum += Double.parseDouble(buf);
            }
            average = sum / nums.length;
            System.out.printf(average + " --> %.3f", average);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

