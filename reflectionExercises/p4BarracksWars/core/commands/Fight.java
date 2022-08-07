package oop.reflectionExercises.p4BarracksWars.core.commands;

import oop.reflectionExercises.p4BarracksWars.interfaces.Repository;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;

public class Fight extends Command{
    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}