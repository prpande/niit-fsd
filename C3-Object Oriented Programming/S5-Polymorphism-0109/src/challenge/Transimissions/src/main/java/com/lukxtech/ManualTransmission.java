package com.lukxtech;

public class ManualTransmission extends Transmission
{
    public ManualTransmission(String modelNumber, int forwardGears, float[] gearRatios)
    {
        super(Transmission.MANUAL_TYPE, modelNumber, forwardGears, gearRatios);
    }
}
