package com.lukxtech;

public class Transmission
{
    static final String MANUAL_TYPE = "Manual";
    static final String AUTOMATED_MANUAL_TYPE = "Automated Manual";
    private String transmissionType;
    private String modelNumber;
    private int forwardGears;
    private float[] gearRatios;

    public Transmission(String transmissionType, String modelNumber, int forwardGears, float[] gearRatios)
    {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
        this.gearRatios = gearRatios;
    }

    public void showSpecs()
    {
        System.out.println("Transmission Type\t\t\t:\t" + transmissionType);
        System.out.println("Transmission Model Number\t:\t" + modelNumber);
        System.out.println("Key Specifications:");
        System.out.println("\t1. Forward Gears\t\t:\t" + forwardGears);
        for (int i = 0; i < gearRatios.length; i++)
        {
            System.out.printf("\t%d. %d Gear Ratio\t\t\t:\t%.3f\n",
                                i + 2, i + 1, gearRatios[i]);
        }
    }
}
