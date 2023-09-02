package com.vehicles;


abstract public class VehicleManufacturer
{
    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;

    //
    // The task asks to create constructors in an abstract class which is not possible.
    //

    public String getVehicleName()
    {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName)
    {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelName()
    {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName)
    {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    abstract String getManufacturerInformation();
}
