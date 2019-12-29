package bridge;

public class Calculator extends AbstractCalculator {
    public Calculator(Shape shape) {
        this.shape = shape;
    }

    public double getArea() {
        return shape.getArea();
    }
}
