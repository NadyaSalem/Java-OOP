
package oop.workingWithAbstractionExercise.p6GreedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safeItems = scanner.nextLine().split("\\s+");

        Map<String, TreeMap<String, Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < safeItems.length; i += 2) {
            String item = safeItems[i];
            long quantity = Long.parseLong(safeItems[i + 1]);

            String currentItem = getItemName(item);

            if (currentItemIsSuitable(currentItem, quantity, bagCapacity)) {

                switch (currentItem) {
                    case "Gem":
                        if (thereIsNotSpaceForItemAmount(bag, quantity, currentItem, "Gold")) continue;
                        break;
                    case "Cash":
                        if (thereIsNotSpaceForItemAmount(bag, quantity, currentItem, "Gem")) continue;
                        break;
                }

                putItemsInBag(bag, currentItem, item, quantity, bagCapacity);
                bagCapacity -= quantity;
            }

        }

        printItemsInBag(bag);
    }

    private static String getItemName(String item) {
        String currentItem = null;

        if (item.length() == 3) {
            currentItem = "Cash";
        } else if (item.toLowerCase().endsWith("gem")) {
            currentItem = "Gem";
        } else if (item.equalsIgnoreCase("gold")) {
            currentItem = "Gold";
        }
        return currentItem;
    }

    private static boolean thereIsNotSpaceForItemAmount(Map<String, TreeMap<String, Long>> bag, long quantity, String currentItem, String item) {
        if (bag.containsKey(currentItem)) {
            return getItemAmount(bag, currentItem) + quantity > getItemAmount(bag, item);
        } else if (bag.containsKey(item)) {
            return quantity > getItemAmount(bag, item);
        } else {
            return true;
        }
    }

    private static long getItemAmount(Map<String, TreeMap<String, Long>> bag, String item) {
        return bag.get(item).values().stream().mapToLong(e -> e).sum();
    }

    private static void putItemsInBag(Map<String, TreeMap<String, Long>> bag, String currentItem, String item, long quantity, long bagCapacityLeft) {
        bag.putIfAbsent(currentItem, new TreeMap<>());
        bag.get(currentItem).putIfAbsent(item, 0L);
        bag.get(currentItem).put(item, bag.get(currentItem).get(item) + quantity);
    }

    private static void printItemsInBag(Map<String, TreeMap<String, Long>> bag) {
        for (var entry : bag.entrySet()) {

            Long sumValues = entry.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.printf("<%s> $%s%n", entry.getKey(), sumValues);

            entry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean currentItemIsSuitable(String currentItem, long quantity, long bagCapacity) {
        return (currentItem != null && quantity <= bagCapacity);
    }
}