package oop.reflectionExercises.p2BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scan = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Object blackBoxInt = createInstance(clazz);
        Field innerValue = getField(clazz);

        String input = scan.nextLine();

        while (!"END".equals(input)) {

            String[] inputData = input.split("_");

            String methodName = inputData[0];
            Integer value = Integer.parseInt(inputData[1]);

            Method method = getMethod(clazz, methodName);
            method.invoke(blackBoxInt, value);

            System.out.println(innerValue.get(blackBoxInt));

            input = scan.nextLine();
        }
    }

    private static Field getField(Class<BlackBoxInt> clazz) throws NoSuchFieldException {

        Field innerValue = clazz.getDeclaredField("innerValue");
        innerValue.setAccessible(true);
        return innerValue;
    }

    private static Method getMethod(Class<BlackBoxInt> clazz, String command) throws NoSuchMethodException {

        Method method = clazz.getDeclaredMethod(command, int.class);
        method.setAccessible(true);
        return method;
    }

    private static Object createInstance(Class<BlackBoxInt> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }
}
