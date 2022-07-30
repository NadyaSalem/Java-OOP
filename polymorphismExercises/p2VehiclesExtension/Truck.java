package oop.polymorphismExercises.p2VehiclesExtension;

public class Truck extends Vehicle {

    private final double INCREASING_fUEL_CONSUMPTION_IN_SUMMER = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.fuelConsumption = fuelConsumption + INCREASING_fUEL_CONSUMPTION_IN_SUMMER;
    }


}
