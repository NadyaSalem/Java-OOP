package oop.workingWithAbstractionExercise.p5JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readCoordinates(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxyMatrix = new int[rows][cols];

        fillMatrix(galaxyMatrix, rows, cols);

        String input = scanner.nextLine();

        long totalStars = 0;

        while (!input.equals("Let the Force be with you")) {

            int[] jediCoordinates = readCoordinates(input);
            int[] evilCoordinates = readCoordinates(scanner.nextLine());

            int evelRow = evilCoordinates[0];
            int evelCol = evilCoordinates[1];

            while (evelRow >= 0 && evelCol >= 0) {
                if (evelRow < rows && evelCol < cols) {
                    galaxyMatrix[evelRow][evelCol] = 0;
                }
                evelRow--;
                evelCol--;
            }

            int jediRow = jediCoordinates[0];
            int jediCol = jediCoordinates[1];

            while (jediRow >= 0 && jediCol < cols) {
                if (jediRow < rows && jediCol >= 0) {
                    totalStars += galaxyMatrix[jediRow][jediCol];
                }
                jediRow--;
                jediCol++;
            }

            input = scanner.nextLine();
        }

        System.out.println(totalStars);

    }

    private static int[] readCoordinates(String input) {
        return Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillMatrix(int[][] matrix, int rows, int cols) {
        int value = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value;
                value++;
            }
        }
    }
}
