package oop.polymorphismExercises.p2VehiclesExtension;

public class Bus extends Vehicle {

    private final double INCREASING_fUEL_CONSUMPTION_IF_PEOPLE_IN_BUS = 1.4;


    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.fuelConsumption = fuelConsumption + INCREASING_fUEL_CONSUMPTION_IF_PEOPLE_IN_BUS;
    }

    public String drivingEmpty(Double distance) {

        this.fuelConsumption -= INCREASING_fUEL_CONSUMPTION_IF_PEOPLE_IN_BUS;
        String message = super.driving(distance);
        this.fuelConsumption += INCREASING_fUEL_CONSUMPTION_IF_PEOPLE_IN_BUS;
        return message;
    }

}
