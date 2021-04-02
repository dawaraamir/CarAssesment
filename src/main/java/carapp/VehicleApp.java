package carapp;

import java.util.ArrayList;
import java.util.Collections;

public class VehicleApp {

    public static void printVehicleNamesAndPrices(Vehicle[] vehicles) {
       for (Vehicle x: vehicles){
           System.out.println(x.getName() + " "+ x.getPrice());
       }
    }

    public static void getSpeedOfDrivableVehicles(ArrayList<DriveAble> driveAbleArrayList) {
        for (DriveAble c: driveAbleArrayList){
            System.out.println(c.milesPerHour());
        }
    }

    public static void sortAndPrintDrivableVehiclesBySpeed(ArrayList<DriveAble> speedArrayList) {
        Collections.sort(speedArrayList, new VehicleSpeedComparator());
        for (DriveAble d : speedArrayList) {
            System.out.println(d.milesPerHour());
        }

    }

    public static void main(String[] args) {
        Engine carEngine = new Engine(6);
        Engine truckEngine = new Engine(8);
        Engine bikeEngine = new Engine(2);

        Car car = new Car("Honda", 5, 50.0, carEngine, 100);
        Truck truck = new Truck("GM", 5, 100.0, truckEngine, 75);
        MotorBike motorBike = new MotorBike("Suzuki", 5,75.00, bikeEngine, 50, 2);

        Vehicle[] vehicles = {car, truck, motorBike};

        ArrayList<DriveAble> vehicleArrayList = new ArrayList<>();
        vehicleArrayList.add(car);
        vehicleArrayList.add(truck);

    printVehicleNamesAndPrices(vehicles);
    getSpeedOfDrivableVehicles(vehicleArrayList);
    System.out.println(car.totalBeforeTax(car));
    car.totalAfterTax(car);
    System.out.println(truck.totalBeforeTax(truck));
    truck.totalAfterTax(truck);
    sortAndPrintDrivableVehiclesBySpeed(vehicleArrayList);
    }

}
