package oop.inheritanceExercises.p3PlayersAndMonsters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        int level = Integer.parseInt(scanner.nextLine());

        Elf elf = new Elf(username, level);
        System.out.println(elf);

        System.out.println(new Hero(username, level));
        System.out.println(new Wizard(username, level));
    }
}
