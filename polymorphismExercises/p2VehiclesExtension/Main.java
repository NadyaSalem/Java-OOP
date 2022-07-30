package oop.polymorphismExercises.p2VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = createVehicle(scanner, "car");
        Vehicle truck = createVehicle(scanner, "truck");
        Vehicle bus = createVehicle(scanner, "bus");

        int inputLines = Integer.parseInt(scanner.nextLine());

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();

        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        while (inputLines-- > 0) {

            String[] commandInformation = scanner.nextLine().split("\\s+");

            String commandType = commandInformation[0];
            String vehicleType = commandInformation[1];

            switch (commandType) {
                case "Drive":

                    double distance = Double.parseDouble(commandInformation[2]);

                    System.out.println(vehicles.get(vehicleType).driving(distance));
                    decreaseVehicleFuelQuantity(vehicles, vehicleType, distance);
                    break;

                case "Refuel":

                    double liters = Double.parseDouble(commandInformation[2]);

                    vehicles.get(vehicleType).refueling(liters);
                    break;

                case "DriveEmpty":

                    distance = Double.parseDouble(commandInformation[2]);

                    System.out.println(((Bus) vehicles.get(vehicleType)).drivingEmpty(distance));
                    decreaseVehicleFuelQuantity(vehicles, vehicleType, distance);
                    break;
            }
        }

        vehicles.forEach((s, vehicle) -> System.out.println(vehicle.fuelLeft(vehicle.getFuelQuantity())));
    }

    private static void decreaseVehicleFuelQuantity(Map<String, Vehicle> vehicles, String vehicleType, Double distance) {

        vehicles.get(vehicleType).setFuelQuantity(distance);
    }

    private static Vehicle createVehicle(Scanner scanner, String type) {

        String[] carInformation = scanner.nextLine().split("\\s+");

        double fuelQuantity = Double.parseDouble(carInformation[1]);
        double fuelConsumption = Double.parseDouble(carInformation[2]);
        int tankCapacity = Integer.parseInt(carInformation[3]);

        switch (type) {
            case "car":
                return new Car(fuelQuantity, fuelConsumption, tankCapacity);
            case "truck":
                return new Truck(fuelQuantity, fuelConsumption, tankCapacity);
            case "bus":
                return new Bus(fuelQuantity, fuelConsumption, tankCapacity);
            default:
                return null;
        }
    }
}
