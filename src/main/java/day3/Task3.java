package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while(counter<=5){
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          if(b==0) {
              System.out.println("Деление на 0");
              counter++;
              continue;

          }
          double result = a/b;
            System.out.println(result);
            counter++;

        }
    }
}
