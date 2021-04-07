package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", 2010, 800, 50000);
        Airplane a2 = new Airplane("Airbus", 2004, 700, 40000);
        Airplane.compareAirplanes(a1, a2);
    }
}