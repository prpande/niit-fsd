package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle
{
    public Car(String vehicleName, String vehicleModelName, String vehicleType)
    {
        setVehicleName(vehicleName);
        setVehicleModelName(vehicleModelName);
        setVehicleType(vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType)
    {
        int speed = 0;
        String type = getVehicleType();
        switch(type)
        {
            case "SportsCar":
                speed = 250;
                break;
            case "Sedan":
                speed = 170;
                break;
            default:
                System.out.println("Maximum speed not defined for vehicleType: " + type);
                break;
        }

        if(speed > 0)
        {
            System.out.println("Car type is " + type + " its speed is " + speed);
        }

        return speed;
    }

    @Override
    public String getManufacturerInformation()
    {
        return String.format("Car{Manufacturer name: %s, Model Name: %s, Type: %s}",
                getVehicleName(), getVehicleModelName(), getVehicleType());
    }
}
