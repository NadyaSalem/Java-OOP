package oop.reflectionExercises.p4BarracksWars.core.factories;

import oop.reflectionExercises.p4BarracksWars.interfaces.Unit;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "oop.reflectionExercises.p4BarracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        try {
            Class clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor constructor = clazz.getConstructor();
            return (Unit) constructor.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}