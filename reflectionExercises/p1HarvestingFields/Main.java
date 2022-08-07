package oop.reflectionExercises.p1HarvestingFields;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCommand = scanner.nextLine();

        Class<RichSoilLand> richSoilLand = RichSoilLand.class;

        while (!"HARVEST".equals(inputCommand)) {

            String requiredModifier = inputCommand;

            Arrays.stream(richSoilLand.getDeclaredFields())
                    .forEach(field -> {
                        if (requiredModifier.equals(Modifier.toString(field.getModifiers())) || requiredModifier.equals("all")) {
                            System.out.printf("%s %s %s%n"
                                    , Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
                        }
                    });

            inputCommand = scanner.nextLine();
        }
    }
}
