package oop.polymorphismExercises.p3WildFarm;

public class Tiger extends Felime{

    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            this.setFoodEaten(food.getQuantity());
        } else {
            this.setFoodEaten(0);
            System.out.println("Tigers are not eating that type of food!");
        }
    }
}
