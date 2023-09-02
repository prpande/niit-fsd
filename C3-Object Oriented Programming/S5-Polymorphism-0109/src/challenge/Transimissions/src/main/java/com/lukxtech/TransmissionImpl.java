package com.lukxtech;

public class TransmissionImpl
{
    public static void main(String[] args)
    {
        String modelNumber = "AMTD5";
        int forwardGears = 5;
        float[] gearRatios = {2.950f,1.940f,1.340f,1.0f,0.630f};

        AutomatedManualTransmission amt1 = new AutomatedManualTransmission(modelNumber, forwardGears, gearRatios);
        amt1.showSpecs();
        System.out.println("");

        modelNumber = "MP4";
        forwardGears = 4;
        gearRatios = new float[]{2.540f,1.920f,1.510f,1.0f};

        ManualTransmission mt1 = new ManualTransmission(modelNumber, forwardGears, gearRatios);
        mt1.showSpecs();
    }
}
