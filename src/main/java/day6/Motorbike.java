package day6;

public class Motorbike {
    private int yearOfIssue;
    private String colour;
    private String model;

    public Motorbike(int yearOfIssue, String colour, String model){
        this.yearOfIssue = yearOfIssue;
        this.colour = colour;
        this.model = model;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }
    public String getColour() {
        return colour;
    }
    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    private int difference;

    public int yearDifference(int inputYear) {
        difference = inputYear - this.yearOfIssue;
        return Math.abs(difference);

    }
}
