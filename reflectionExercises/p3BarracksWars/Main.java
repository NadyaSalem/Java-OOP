package oop.reflectionExercises.p3BarracksWars;

import oop.reflectionExercises.p4BarracksWars.interfaces.Repository;
import oop.reflectionExercises.p4BarracksWars.interfaces.Runnable;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;
import oop.reflectionExercises.p4BarracksWars.core.Engine;
import oop.reflectionExercises.p4BarracksWars.core.factories.UnitFactoryImpl;
import oop.reflectionExercises.p4BarracksWars.data.UnitRepository;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}