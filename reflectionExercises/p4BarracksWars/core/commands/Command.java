package oop.reflectionExercises.p4BarracksWars.core.commands;
import oop.reflectionExercises.p4BarracksWars.interfaces.Executable;
import oop.reflectionExercises.p4BarracksWars.interfaces.Repository;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }

    protected String[] getData() {
        return data;
    }
}