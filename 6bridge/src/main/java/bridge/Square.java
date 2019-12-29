package bridge;

public class Square extends Shape {
    double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }
}
