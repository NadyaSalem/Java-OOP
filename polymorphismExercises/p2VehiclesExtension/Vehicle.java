package oop.polymorphismExercises.p2VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected int tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double distance) {

        if (this.fuelQuantity >= this.fuelConsumption * distance) {
            this.fuelQuantity -= this.fuelConsumption * distance;
        }
    }

    public String driving(Double distance) {

        if (this.fuelQuantity < this.fuelConsumption * distance) {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }

        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));

    }

    public void refueling(double liters) {

        if (this instanceof Truck) {
            // truck has a tiny hole in its tank and gets only 95% of the given fuel
            liters = liters * 0.95;
        }

        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            if (tankCapacity < this.fuelQuantity + liters) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                this.fuelQuantity = this.fuelQuantity + liters;
            }
        }
    }

    public String fuelLeft(double fuelQuantity) {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity);
    }
}


