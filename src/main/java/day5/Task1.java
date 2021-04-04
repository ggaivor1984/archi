package day5;

public class Task1 {
    public static void main(String[] args) {
        Car peugeout  = new Car();
        peugeout.setYearOfIssue(2013);
        peugeout.setColour("Grey");
        peugeout.setModel("408 Hdi");

        System.out.println("Peugeout's year of issue is " + peugeout.getYearOfIssue());
        System.out.println("Peugeout's colour is " + peugeout.getColour());
        System.out.println("Peugeout's model is " + peugeout.getModel());

    }
}
