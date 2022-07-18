package oop.encapsulationExercise.p3ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputPersonsData = scanner.nextLine().split("[=;]");
        String[] inputProductsData = scanner.nextLine().split("[=;]");

        Map<String, Double> personsMoneyByName = new LinkedHashMap<>();
        fillInputDataMap(inputPersonsData, personsMoneyByName);

        Map<String, Double> productsPriceByName = new LinkedHashMap<>();
        fillInputDataMap(inputProductsData, productsPriceByName);

        Map<String, List<String>> personsBoughtProducts = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!"END".equals(command)) {

            String[] dataCommands = command.split("\\s+");
            String personName = dataCommands[0];
            String productName = dataCommands[1];

            try {
                Person person = new Person(personName, personsMoneyByName.get(personName));
                Product product = new Product(productName, productsPriceByName.get(productName));

                personsBoughtProducts.putIfAbsent(personName, new ArrayList<>());

                try {
                    person.buyProduct(product);

                    personsMoneyByName.put(personName, personsMoneyByName.get(personName) - productsPriceByName.get(productName));
                    personsBoughtProducts.get(personName).add(productName);

                    System.out.println(personName + " bought " + productName);

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        printPeopleBoughtProducts(personsBoughtProducts);
    }

    private static void printPeopleBoughtProducts(Map<String, List<String>> personsBoughtProducts) {
        for (Map.Entry<String, List<String>> entry : personsBoughtProducts.entrySet()) {
            if (entry.getValue().size() == 0) {
                System.out.println(entry.getKey() + " - " + "Nothing bought");
            } else {
                System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
            }
        }
    }

    private static void fillInputDataMap(String[] input, Map<String, Double> map) {

        for (int i = 0; i < input.length; i += 2) {
            String name = input[i];
            double money = Double.parseDouble(input[i + 1]);
            map.put(name, money);
        }
    }
}
