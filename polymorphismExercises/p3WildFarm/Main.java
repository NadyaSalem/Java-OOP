package oop.polymorphismExercises.p3WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        List<Animal> animals = new ArrayList<>();

        while (!"End".equals(inputLine)) {

            String[] animalInformation = inputLine.split("\\s+");
            String[] foodInformation = scanner.nextLine().split("\\s+");

            Animal animal = createAnimal(animalInformation);
            animal.makeSound();

            Food food = createFood(foodInformation);
            animal.eat(food);

            animals.add(animal);

            inputLine = scanner.nextLine();
        }

        animals.forEach(System.out::println);
    }

    private static Food createFood(String[] information) {

        String foodType = information[0];
        Integer quantity = Integer.parseInt(information[1]);

        switch (foodType) {
            case "Vegetable":
                return new Vegetable(quantity);
            case "Meat":
                return new Meat(quantity);
            default:
                throw new IllegalArgumentException("Invalid food");
        }
    }

    private static Animal createAnimal(String[] information) {

        String animalType = information[0];
        String animalName = information[1];
        Double animalWeight = Double.parseDouble(information[2]);
        String animalLivingRegion = information[3];

        Integer defaultFoodEaten = 0;

        switch (animalType) {
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, defaultFoodEaten, animalLivingRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, defaultFoodEaten, animalLivingRegion);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, defaultFoodEaten, animalLivingRegion);
            case "Cat":
                String breed = information[4];
                return new Cat(animalName, animalType, animalWeight, defaultFoodEaten, animalLivingRegion, breed);
            default:
                throw new IllegalArgumentException("Invalid animal");
        }

    }
}
