package oop.reflectionLab.p2GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> reflection = Reflection.class;

        Method[] methods = reflection.getDeclaredMethods();

        System.out.println(Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("get") && method.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .map(method -> String.format("%s will return class %s", method.getName(), method.getReturnType().getName()))
                .collect(Collectors.joining(System.lineSeparator())));

        System.out.println(Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName))
                .map(method -> String.format("%s and will set field of class %s",
                        method.getName(), method.getParameterTypes()[0].getName()))
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
