package oop.workingWithAbstractionLab.p3StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StudentSystem studentSystem = new StudentSystem();

        while (!input.equals("Exit")) {

            String[] inputData = input.split("\\s+");

            studentSystem.ParseCommand(inputData);

            input = scanner.nextLine();
        }
    }
}
