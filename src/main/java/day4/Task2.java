package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) numbers[i] = (int) (Math.random() * 10001);
        System.out.println(Arrays.toString(numbers));
        int max = 0;
        int min = 10000;
        int counterZero = 0;
        int sumZero = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            if (number % 10 == 0) {
                counterZero++;
                sumZero += number;
            }

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(counterZero);
        System.out.println(sumZero);


    }
}
