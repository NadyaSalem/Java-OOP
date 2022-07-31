package oop.polymorphismExercises.p3WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    protected String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]", this.getClass().getSimpleName(), this.animalName
                , decimalFormat.format(this.animalWeight), this.livingRegion, this.getFoodEaten());
    }
}
