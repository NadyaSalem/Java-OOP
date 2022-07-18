package oop.workingWithAbstractionLab.p2PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectangleCoordinates = getCoordinates(scanner);

        Point pointA = new Point(rectangleCoordinates[0], rectangleCoordinates[1]);
        Point pointC = new Point(rectangleCoordinates[2], rectangleCoordinates[3]);

        Rectangle rectangle = new Rectangle(pointA, pointC);

        int inputLines = Integer.parseInt(scanner.nextLine());

        while (inputLines-- > 0) {

            int[] pointCoordinates = getCoordinates(scanner);

            Point p = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rectangle.containsPoint(p));
        }
    }

    private static int[] getCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
