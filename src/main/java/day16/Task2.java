package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final int PORTION = 20;
        int[] thousand = new int[1000];
        for (int i = 0; i < 1000; i++) {
            thousand[i] = (int) (Math.random() * 101);
        }
        //System.out.println(Arrays.toString(thousand));
        File myfile = new File("D:\\JavaMarathon2021\\file1.txt");
        try {
            PrintWriter pw = new PrintWriter(myfile);
            for (int d : thousand) {
                pw.print(d + " ");
            }
            pw.close();

            File myfile1 = new File("D:\\JavaMarathon2021\\file1.txt");
            Scanner scanner = new Scanner(myfile1);
            String s = scanner.nextLine();
            String[] splited = s.split(" ");
            int[] file1Digits = new int[thousand.length];
            int counter = 0;
            for (String d : splited) {
                file1Digits[counter++] = Integer.parseInt(d);
            }
            //System.out.println(Arrays.toString(file1Digits));
            double[] averageArray = new double[file1Digits.length / PORTION];
            int k = 0;
            for (int i = 0; i < file1Digits.length / PORTION; i++) {
                double sum = 0;
                double average = 0;
                for (int j = k; j < k + PORTION; j++) {
                    sum += file1Digits[j];
                }
                k += PORTION;
                average = sum / PORTION;
                averageArray[i] = average;
            }
            //System.out.println(Arrays.toString(averageArray));
            File myfile2 = new File("D:\\JavaMarathon2021\\file2.txt");
            PrintWriter printWriter = new PrintWriter(myfile2);
            for (double f : averageArray) {
                printWriter.print(f + " ");
            }
            printWriter.close();
            File testfile = new File("D:\\JavaMarathon2021\\file2.txt");
            printResult(testfile);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public static void printResult(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found, sorry");
            ;
        }
        String s = scanner.nextLine();
        String[] nums = s.split(" ");
        double sum = 0;
        for (String buf : nums) {
            sum += Double.parseDouble(buf);
        }

        System.out.println((int) sum + "");
    }
}
