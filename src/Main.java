import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a radius of a circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Write first side of a triangle: ");
        double firstSide = scanner.nextDouble();
        System.out.println("Write second side of a triangle: ");
        double secondSide = scanner.nextDouble();
        Triangle triangle = new Triangle(firstSide, secondSide);
        System.out.println("Write first side of a rectangle: ");
        double firstSideRectangle = scanner.nextDouble();
        System.out.println("Write second side of a rectangle: ");
        double secondSideRectangle = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(firstSideRectangle, secondSideRectangle);

        Figure[] array = {circle, triangle, rectangle};

        for (int i = 0; i <= array.length - 1; i++){
            System.out.println(array[i].getArea());
            System.out.println(array[i].getPerimeter());
        }
    }

}
