package oop.reflectionExercises.p3BarracksWars.interfaces;

import oop.reflectionExercises.p4BarracksWars.interfaces.Unit;
import jdk.jshell.spi.ExecutionControl;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
