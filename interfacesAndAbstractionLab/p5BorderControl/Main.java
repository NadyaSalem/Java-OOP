package oop.interfacesAndAbstractionLab.p5BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Identifiable> citizensAndRobotsIds = new ArrayList<>();

        while (!"End".equals(command)) {

            String[] personalInformation = command.split("\\s+");

            String id = personalInformation[personalInformation.length - 1];

            Identifiable identifiableObjects = personalInformation.length == 3
                    ? new Citizen(personalInformation[0], Integer.parseInt(personalInformation[1]), id)
                    : new Robot(id, personalInformation[0]);

            citizensAndRobotsIds.add(identifiableObjects);

            command = scanner.nextLine();
        }

        String fakeIdsLastDigits = scanner.nextLine();

        citizensAndRobotsIds.stream().map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeIdsLastDigits))
                .forEach(System.out::println);

    }
}
