package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2013);
        car1.info();
        System.out.println(car1.yearDifference(2001));

        Motorbike bike1 = new Motorbike(1978,"Green", "Karpaty");
        bike1.info();
        System.out.println(bike1.yearDifference(2020));

    }
}
