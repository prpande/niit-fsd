package org.example;

public class ElectricPowertrain extends Engine
{
    private float voltage;
    private float batterySizeInKwh;
    private int numberOfMotors;

    public ElectricPowertrain(String modelNumber, float powerOutput, float torqueOutput,
                              float voltage, float batterySizeInKwh, int numberOfMotors)
    {
        super(modelNumber, "Electric", powerOutput, torqueOutput);
        this.voltage = voltage;
        this.batterySizeInKwh = batterySizeInKwh;
        this.numberOfMotors = numberOfMotors;
    }

    public float getBatterySizeInKwh()
    {
        return batterySizeInKwh;
    }

    public void setBatterySizeInKwh(float batterySizeInKwh)
    {
        this.batterySizeInKwh = batterySizeInKwh;
    }

    public int getNumberOfMotors()
    {
        return numberOfMotors;
    }

    public void setNumberOfMotors(int numberOfMotors)
    {
        this.numberOfMotors = numberOfMotors;
    }
}
