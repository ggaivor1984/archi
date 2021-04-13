package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> enumNumbers = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i == 31) {
                i = 300;
            }
            if (i % 2 == 0) {
                enumNumbers.add(i);
            }
        }
        //System.out.println(enumNumbers);
       /*for (int j = 300; j <= 350; j++) {
            if (j % 2 == 0) {
                enumNumbers.add(j);
            }
        }*/

        System.out.println(enumNumbers);
    }
}
