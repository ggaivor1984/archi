package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double y;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите число х: ");
        double x = scanner.nextDouble();
        if(x>=5){
            y = (Math.pow(x,2) - 10)/(x+7);
            System.out.println(y);
        } else if(x>-3 && x<5){
            y = (x+3)*(Math.pow(x,2) - 2);
            System.out.println(y);
        } else {
            y = 420;
            System.out.println(y);
        }
    }
}
