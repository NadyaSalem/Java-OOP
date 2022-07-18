package oop.workingWithAbstractionLab;

import java.util.Scanner;

public class P1RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        printTopOfTheRhombusRows(size);

        printBottomOfTheRhombusRows(size);
    }

    private static void printBottomOfTheRhombusRows(int size) {
        for (int row = size - 2; row >= 0; row--) {
            printRows(size, row);
            System.out.println();
        }
    }

    private static void printTopOfTheRhombusRows(int size) {
        for (int row = 0; row < size; row++) {
            printRows(size, row);
            System.out.println();
        }
    }

    private static void printRows(int size, int row) {
        for (int i = 1; i <= size; i++) {
            if (i < size - row) {
                System.out.print(" ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
