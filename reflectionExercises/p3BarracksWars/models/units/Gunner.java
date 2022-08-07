package oop.reflectionExercises.p3BarracksWars.models.units;

import oop.reflectionExercises.p4BarracksWars.models.units.AbstractUnit;

public class Gunner extends AbstractUnit {

    private static final int GUNNER_HEALTH = 20;
    private static final int GUNNER_DAMAGE = 20;

    public Gunner() {
        super(GUNNER_HEALTH, GUNNER_DAMAGE);
    }
}

