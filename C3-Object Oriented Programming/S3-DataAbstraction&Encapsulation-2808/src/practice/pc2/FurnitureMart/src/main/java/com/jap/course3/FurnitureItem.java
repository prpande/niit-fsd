package com.jap.course3;

public class FurnitureItem
{
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private float furniturePrice;

    static final int DISCOUNT = 5;

    public FurnitureItem()
    {
        furnitureCode = -1;
        furnitureType = "";
        gradeOfFurniture = "";
        furnitureUsage = "";
        furniturePrice = 0.0f;
    }

    public int getFurnitureCode()
    {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode)
    {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType()
    {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType)
    {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture()
    {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture)
    {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getFurnitureUsage()
    {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage)
    {
        this.furnitureUsage = furnitureUsage;
    }

    public float getFurniturePrice()
    {
        return furniturePrice;
    }

    public void setFurniturePrice(float furniturePrice)
    {
        this.furniturePrice = furniturePrice;
    }

    public float calculateDiscount()
    {
        float discountApplicable = 0f;
        if(getGradeOfFurniture().equals("grade1") && getFurnitureUsage().equals("outdoor"))
        {
            discountApplicable = getFurniturePrice() * DISCOUNT / 100.0f;
        }

        return discountApplicable;
    }
}
