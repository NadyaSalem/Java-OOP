package oop.reflectionExercises.p4BarracksWars.core.commands;
import oop.reflectionExercises.p4BarracksWars.interfaces.Repository;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;

public class Report extends Command {
    public Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String output = this.getRepository().getStatistics();
        return output;
    }
}