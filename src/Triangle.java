public class Triangle implements Figure {

    double firstSide;
    double secondSide;

    public Triangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getPerimeter() {
        double thirdSide = Math.sqrt((Math.pow(firstSide, 2) + Math.pow(secondSide, 2)));
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }
}
