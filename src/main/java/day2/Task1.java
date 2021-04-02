package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        //System.out.println("Введите этажность дома: ");
        int floors  = scanner.nextInt();
        if(floors>=1&&floors<=4) System.out.println("Малоэтажный дом");
        else if(floors>=5&&floors<=8) System.out.println("Cреднеэтажный дом");
        else if(floors<=0) System.out.println("Ошибка ввода");
        else {
            System.out.println("Многоэтажный дом");
        }

    }
}
