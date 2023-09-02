package com.vehicles;

public class VehicleImpl
{
    public static void main(String[] args)
    {
        Bike bike1 = new Bike("Hayabusa","GSX1300R","SportsBike");
        Car car1 = new Car("911 Turbo S", "991.2", "SportsCar");

        int maxSpeed = bike1.maxSpeed(bike1.getVehicleType());
        System.out.println(bike1.getManufacturerInformation());

        maxSpeed = car1.maxSpeed(car1.getVehicleType());
        System.out.println(car1.getManufacturerInformation());

    }
}
