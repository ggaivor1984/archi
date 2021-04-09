package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(30, 10, 20, "Green"),
                new Triangle(15, 10, 20, "Red"),
                new Rectangle(10, 5, "Red"),
                new Rectangle(15, 40, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double redPerSums = 0;
        for (Figure fig : figures) {
            if (fig.getColour().equals("Red")) {
                redPerSums += fig.perimeter();
            }
        }
        return redPerSums;
    }

    public static double calculateRedArea(Figure[] figures) {
        double redSqrSums = 0;
        for (Figure fig : figures) {
            if (fig.getColour().equals("Red")) {
                redSqrSums += fig.area();
            }
        }
        return redSqrSums;
    }
}
