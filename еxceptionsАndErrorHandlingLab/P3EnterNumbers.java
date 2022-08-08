package oop.еxceptionsАndErrorHandlingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;

        List<Integer> numbersInRange = new ArrayList<>();

        while (numbersInRange.size() < 10) {

            int number;

            try {
                number = readNumber(start, end, scanner);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                continue;
            }

            start = number;
            numbersInRange.add(number);
        }

        System.out.println(numbersInRange.stream().map(String::valueOf).collect(Collectors.joining(", ")));
    }

    private static int readNumber(int start, int end, Scanner scanner) {

        int number;

        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Invalid Number!");
        }

        if (number <= start || number >= end) {
            throw new IllegalStateException("Your number is not in range " + start + " - 100!");
        } else {
            return number;
        }
    }
}
