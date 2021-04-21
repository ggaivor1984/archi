package day18;

public class Task2 {
    public static void main(String[] args) {
        int x = -789776760;
        System.out.println(count7(x));

    }

    public static int count7(int num) {
        if (Math.abs(num) < 1) return 0;
        if (Math.abs(num % 10) == 7) {
            num = num / 10;
            return 1 + count7(num);
        } else {
            num = num / 10;
            return 0 + count7(num);
        }
    }
}
