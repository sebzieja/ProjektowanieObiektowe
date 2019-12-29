package bridge;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Triangle(7, 10, 5));
        System.out.println("Triangle area: " + calculator.getArea());
        Calculator squareCalculator = new Calculator(new Square(2));
        System.out.println("Square area: " + squareCalculator.getArea());
        Calculator circleCalculator = new Calculator(new Circle(2));
        System.out.println("Square area: " + circleCalculator.getArea());

    }
}
