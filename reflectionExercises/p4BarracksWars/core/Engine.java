package oop.reflectionExercises.p4BarracksWars.core;

import oop.reflectionExercises.p4BarracksWars.core.commands.Command;
import oop.reflectionExercises.p4BarracksWars.interfaces.*;
import oop.reflectionExercises.p4BarracksWars.interfaces.Runnable;
import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

public class Engine implements Runnable {

    private static final String COMMANDS_PACKAGE_NAME =
            "oop.reflectionExercises.p4BarracksWars.core.commands.";
    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        while (true) {
            String input = null;
            try {
                input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpretCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // TODO: refactor for problem 4
    private String interpretCommand(String[] data, String commandName) {
        commandName = normalizeCommandName(commandName);
        try {
            Class clazz = Class.forName(COMMANDS_PACKAGE_NAME+commandName);
            Command command = (Command) clazz.getConstructor(String[].class , Repository.class , UnitFactory.class )
                    .newInstance(data, repository, unitFactory);
            return command.execute();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | ExecutionControl.NotImplementedException e) {
            return "Invalid Command!";
        }
    }

    private String normalizeCommandName(String commandName) {
        return String.valueOf(commandName.charAt(0)).toUpperCase(Locale.ROOT) + commandName.substring(1);
    }
}