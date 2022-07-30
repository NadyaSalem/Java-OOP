package oop.polymorphismExercises.p1Vehicles;

import java.text.DecimalFormat;

public class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
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

        this.fuelQuantity = this.fuelQuantity + liters;
    }

    public String fuelLeft(double fuelQuantity) {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity);
    }
}


