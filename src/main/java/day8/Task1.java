package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.nanoTime();

        String result = "";
        for (int i = 0; i <= 20000; i++) {
            result = result + " " + i;
        }
        System.out.println(result);
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Время работы программы String: " + time);

        long start1 = System.nanoTime();
        StringBuilder result1 = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) result1 = result1.append(i + " ");
        System.out.println(result1);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        System.out.println("Время работы программы Stringbuilder: " + time1);

    }
}
