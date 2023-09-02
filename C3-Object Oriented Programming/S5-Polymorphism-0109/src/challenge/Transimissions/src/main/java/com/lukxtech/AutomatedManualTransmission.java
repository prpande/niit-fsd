package com.lukxtech;

public class AutomatedManualTransmission extends Transmission
{
    public AutomatedManualTransmission(String modelNumber, int forwardGears, float[] gearRatios)
    {
        super(Transmission.AUTOMATED_MANUAL_TYPE, modelNumber, forwardGears, gearRatios);
    }
}
