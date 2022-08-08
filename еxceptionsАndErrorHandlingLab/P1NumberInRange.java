package oop.еxceptionsАndErrorHandlingLab;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class P1NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int start = range[0];
        int end = range[1];

        System.out.println("Range: [" + start + "..." + end + "]");

        boolean validNumber = false;

        while (!validNumber) {

            String input = scanner.nextLine();

            Optional<Integer> number = Optional.empty();

            try {
                number = Optional.of(Integer.parseInt(input));
            } catch (NumberFormatException ignored) {
            }

            if (number.isEmpty() || number.get() < start || number.get() > end) {
                System.out.println("Invalid number: " + input);
            } else {
                System.out.println("Valid number: " + number.get());
                validNumber = true;
            }
        }
    }
}
