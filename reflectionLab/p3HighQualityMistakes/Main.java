package oop.reflectionLab.p3HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflection = Reflection.class;

        Arrays.stream(reflection.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .forEach(field -> {
                    if (!Modifier.isPrivate(field.getModifiers())) {
                        System.out.printf("%s must be private!%n", field.getName());
                    }
                });

        Arrays.stream(reflection.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("get") || method.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(Main::printMethod);
    }

    private static void printMethod(Method method) {
        if (method.getName().contains("get") && !Modifier.isPublic(method.getModifiers())) {
            System.out.printf("%s have to be public!%n", method.getName());
        } else if (method.getName().contains("set") && !Modifier.isPrivate(method.getModifiers())) {
            System.out.printf("%s have to be private!%n", method.getName());
        }
    }

}
