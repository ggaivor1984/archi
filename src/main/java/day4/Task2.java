package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
int [] numbers = new int[100];
for(int i = 0; i< numbers.length;i++) numbers[i] = (int)(Math.random()*10001);
        System.out.println(Arrays.toString(numbers));
        int max = 0;
        for(int number:numbers)
            if (number > max) {
                max = number;
            }
        System.out.println(max);

        int min = 10000;
        for(int number:numbers)
            if (number < min) {
                min = number;
            }
        System.out.println(min);

        int counterZero = 0;
        for(int number:numbers)
            if (number%10 == 0) {
                counterZero++;
            }
        System.out.println(counterZero);

        int sumZero = 0;
        for(int number:numbers)
            if (number%10 == 0) {
                sumZero+=number;
            }
        System.out.println(sumZero);

    }
}
