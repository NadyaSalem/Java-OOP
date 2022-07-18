package oop.workingWithAbstractionExercise.p4TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputColors = (scanner.nextLine().split("\\s+"));

        List<TrafficLight> trafficLightsList = new ArrayList<>();

        for (String inputColor : inputColors) {
            TrafficLight trafficLight = new TrafficLight(Color.valueOf(inputColor));
            trafficLightsList.add(trafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            for (TrafficLight trafficLight: trafficLightsList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getCurrentColor() + " ");
            }
            System.out.println();
        }

    }
}
