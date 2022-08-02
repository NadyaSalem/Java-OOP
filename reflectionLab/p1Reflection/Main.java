package oop.reflectionLab.p1Reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<Reflection> reflection = Reflection.class;
        System.out.println("class " + reflection.getSimpleName());

        Class superClass = reflection.getSuperclass();
        System.out.println("class " + superClass.getName());

        Class[] interfaces = reflection.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        Object reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);
    }
}
