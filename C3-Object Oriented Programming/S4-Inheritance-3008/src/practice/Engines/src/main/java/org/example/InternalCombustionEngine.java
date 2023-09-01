package org.example;

public class InternalCombustionEngine extends Engine
{
    private float engineDisplacement;
    private int numberOfCylinders;
    private int maximumRpm;
    private String fuelType;

    public InternalCombustionEngine(String modelNumber, float powerOutput, float torqueOutput,
                                    float engineDisplacement, int numberOfCylinders, int maximumRpm, String fuelType) {
        super(modelNumber, "InternalCombustion", powerOutput, torqueOutput);
        this.engineDisplacement = engineDisplacement;
        this.numberOfCylinders = numberOfCylinders;
        this.maximumRpm = maximumRpm;
        this.fuelType = fuelType;
    }

    public float getEngineDisplacement()
    {
        return engineDisplacement;
    }

    public void setEngineDisplacement(float engineDisplacement)
    {
        this.engineDisplacement = engineDisplacement;
    }

    public int getNumberOfCylinders()
    {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders)
    {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getMaximumRpm()
    {
        return maximumRpm;
    }

    public void setMaximumRpm(int maximumRpm)
    {
        this.maximumRpm = maximumRpm;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }
}
