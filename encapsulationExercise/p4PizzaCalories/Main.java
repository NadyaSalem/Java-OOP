package oop.encapsulationExercise.p4PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaDetails = scanner.nextLine().split(" ");
        String pizzaName = pizzaDetails[1];
        int numberOfToppings = Integer.parseInt(pizzaDetails[2]);

        String[] doughDetails = scanner.nextLine().split(" ");
        String flourType = doughDetails[1];
        String bakingTechnique = doughDetails[2];
        double doughWeightInGrams = Double.parseDouble(doughDetails[3]);

        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(flourType, bakingTechnique, doughWeightInGrams);
            pizza.setDough(dough);

            String inputToppings = scanner.nextLine();

            while (!"END".equals(inputToppings)) {

                String[] toppingsDetails = inputToppings.split(" ");
                String toppingType = toppingsDetails[1];
                double toppingWeightInGrams = Double.parseDouble(toppingsDetails[2]);

                Topping topping = new Topping(toppingType, toppingWeightInGrams);

                pizza.addTopping(topping);

                inputToppings = scanner.nextLine();
            }

            Double pizzaCalories = pizza.getOverallCalories();
            System.out.printf("%s - %.2f", pizzaName, pizzaCalories);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
