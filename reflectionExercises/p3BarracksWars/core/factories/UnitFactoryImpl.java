package oop.reflectionExercises.p3BarracksWars.core.factories;
import oop.reflectionExercises.p4BarracksWars.interfaces.Unit;
import oop.reflectionExercises.p4BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"oop.reflectionExercises.p3BarracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		// TODO: implement for problem 3

		Class<?> reflection = Class.forName(UNITS_PACKAGE_NAME + unitType);

		return (Unit) reflection.getDeclaredConstructor().newInstance();
	}
}
