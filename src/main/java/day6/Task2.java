package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2010, 150, 200);
        airplane.setYear(2015);
        airplane.setLength(311);
        airplane.fillUp(400);
        airplane.fillUp(500);

        airplane.info();
    }
}
