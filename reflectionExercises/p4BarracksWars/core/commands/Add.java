package oop.reflectionExercises.p4BarracksWars.core.commands;

import oop.reflectionExercises.p4BarracksWars.interfaces.Repository;
import oop.reflectionExercises.p4BarracksWars.interfaces.Unit;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class Add extends Command {
    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String unitType = this.getData()[1];
        Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
        this.getRepository().addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}