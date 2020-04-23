public class Rectangle implements Figure {

    double firstSide;
    double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getPerimeter() {
        return firstSide + firstSide + secondSide + secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
