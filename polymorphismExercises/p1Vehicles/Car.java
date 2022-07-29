package oop.polymorphismExercises.p1Vehicles;

public class Car extends Vehicle {

    private final double INCREASING_fUEL_CONSUMPTION_IN_SUMMER = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = fuelConsumption + INCREASING_fUEL_CONSUMPTION_IN_SUMMER;
    }
}
