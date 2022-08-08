package oop.еxceptionsАndErrorHandlingLab;

import java.util.Scanner;

public class P2SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sqrt = 0;

        try {
            sqrt = sqrt(Integer.parseInt(input));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        }

        if (sqrt > 0) {
            System.out.printf("%.2f%n", sqrt);
        }

        System.out.println("Goodbye");
    }

    public static double sqrt(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(number);
    }
}
