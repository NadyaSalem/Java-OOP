package oop.polymorphismExercises.p1Vehicles;

public class Truck extends Vehicle {

    private final double INCREASING_fUEL_CONSUMPTION_IN_SUMMER = 1.6;
    private final double PERCENTAGE_fUEL_LEFT_AFTER_LEAKING = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = fuelConsumption + INCREASING_fUEL_CONSUMPTION_IN_SUMMER;
    }

    @Override
    public void refueling(double liters) {

        liters *= PERCENTAGE_fUEL_LEFT_AFTER_LEAKING;;
        super.refueling(liters);
    }
}
