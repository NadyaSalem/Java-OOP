package oop.interfacesAndAbstractionExercises.p4FoodShortage;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputDataLines = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();

        while (inputDataLines-- > 0) {

            String[] data = scanner.nextLine().split("\\s+");

            Buyer persons = data.length == 4
                    ? new Citizen(data[0], Integer.parseInt(data[1]), data[2], data[3])
                    : new Rebel(data[0], Integer.parseInt(data[1]), data[2]);

            buyers.put(data[0], persons);
        }

        String byerName = scanner.nextLine();

        while (!"End".equals(byerName)) {

            if (buyers.containsKey(byerName)) {
                buyers.get(byerName).buyFood();
            }

            byerName = scanner.nextLine();
        }

        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());

    }
}
