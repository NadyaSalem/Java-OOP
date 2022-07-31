package oop.polymorphismExercises.p3WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private final String breed;

    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.getClass().getSimpleName(), this.animalName, this.breed
                , decimalFormat.format(this.animalWeight), this.livingRegion, this.foodEaten);
    }
}
