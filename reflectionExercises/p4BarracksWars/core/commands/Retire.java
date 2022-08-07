package oop.reflectionExercises.p4BarracksWars.core.commands;

import oop.reflectionExercises.p4BarracksWars.interfaces.Repository;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Retire extends Command{
    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        String message = String.format("%s retired!",unitType);
        try{
            this.getRepository().removeUnit(unitType);
        } catch (IllegalArgumentException | ExecutionControl.NotImplementedException ex){
            message = ex.getMessage();
        }

        return message;
    }
}