package oop.inheritanceExercises.p5Restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{

    private  double milliliters;

    public Beverage(String name, BigDecimal price, Double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
