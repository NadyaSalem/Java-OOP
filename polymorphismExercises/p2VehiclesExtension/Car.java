package oop.polymorphismExercises.p2VehiclesExtension;

public class Car extends Vehicle {

    private final double INCREASING_fUEL_CONSUMPTION_IN_SUMMER = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.fuelConsumption = fuelConsumption + INCREASING_fUEL_CONSUMPTION_IN_SUMMER;
    }
}
