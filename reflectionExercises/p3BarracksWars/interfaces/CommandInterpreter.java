package oop.reflectionExercises.p3BarracksWars.interfaces;

import oop.reflectionExercises.p4BarracksWars.interfaces.Executable;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
