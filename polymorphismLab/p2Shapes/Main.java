package oop.polymorphismLab.p2Shapes;

public class Main {
    public static void main(String[] args) {

        //Not for Judge!

        Shape rectangle = new Rectangle(5.0, 2.0);

        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        Shape circle = new Circle(5.0);

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());

    }
}
