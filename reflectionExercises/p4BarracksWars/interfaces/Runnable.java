package oop.reflectionExercises.p4BarracksWars.interfaces;

import java.lang.reflect.InvocationTargetException;

public interface Runnable {
	void run() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
}
