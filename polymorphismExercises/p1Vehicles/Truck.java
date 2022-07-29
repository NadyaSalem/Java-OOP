package oop.polymorphismExercises.p1Vehicles;

public class Truck extends Vehicle {

    private final double INCREASING_fUEL_CONSUMPTION_IN_SUMMER = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = fuelConsumption + INCREASING_fUEL_CONSUMPTION_IN_SUMMER;
    }
}
