package oop.interfacesAndAbstractionExercises.p3BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Birthable> citizensAndPets = new ArrayList<>();

        while (!"End".equals(command)) {

            String[] data = command.split("\\s+");

            if (!data[0].equals("Robbot")) {

                Birthable birthableObjects = data.length == 5
                        ? new Citizen(data[1], Integer.parseInt(data[2]), data[3], data[4])
                        : new Pet(data[1], data[2]);

                citizensAndPets.add(birthableObjects);
            }

            command = scanner.nextLine();
        }

        String specificYear = scanner.nextLine();

        citizensAndPets.stream().map(Birthable::getBirthDate)
                .filter(obj -> obj.endsWith(specificYear))
                .forEach(System.out::println);
    }

}
