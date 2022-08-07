package oop.reflectionExercises.p3BarracksWars.interfaces;

import oop.reflectionExercises.p4BarracksWars.interfaces.Unit;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}