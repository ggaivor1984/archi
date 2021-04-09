package day9.Task2;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideC, double sideA, double sideB, String colour) {
        super(colour);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double p = (sideA + sideB + sideC) / 2;


    @Override
    public double area() {
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
