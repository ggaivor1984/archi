package day6;

public class Car {
    private int yearOfIssue;
    private String colour;
    private String model;

    public void setYearOfIssue(int year) {
        yearOfIssue = year;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    private int difference;

    public int yearDifference(int inputYear) {
        difference = inputYear - this.yearOfIssue;
        return Math.abs(difference);

    }
}

