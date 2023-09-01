package org.example;

abstract public class Engine
{
    private String modelNumber;
    private String engineType;
    private float powerOutput;
    private float torqueOutput;

    public Engine(String modelNumber, String engineType, float powerOutput, float torqueOutput)
    {
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.powerOutput = powerOutput;
        this.torqueOutput = torqueOutput;
    }

    public String getModelNumber()
    {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber)
    {
        this.modelNumber = modelNumber;
    }

    public String getEngineType()
    {
        return engineType;
    }

    public void setEngineType(String engineType)
    {
        this.engineType = engineType;
    }

    public float getPowerOutput()
    {
        return powerOutput;
    }

    public void setPowerOutput(float powerOutput)
    {
        this.powerOutput = powerOutput;
    }

    public float getTorqueOutput()
    {
        return torqueOutput;
    }

    public void setTorqueOutput(float torqueOutput)
    {
        this.torqueOutput = torqueOutput;
    }
}
