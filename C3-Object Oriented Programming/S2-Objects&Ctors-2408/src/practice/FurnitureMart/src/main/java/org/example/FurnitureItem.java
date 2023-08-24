package org.example;

public class FurnitureItem
{
    String furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsage;
    float price;

    public FurnitureItem()
    {
        furnitureCode = "T001";
        furnitureType = "table";
        gradeOfFurniture = 1;
        color = "blue";
        furnitureUsage = "indoor-outdoor";
        price = 1000.0f;
    }

    // Gets the discounted price
    // 5% flat discount if the use case is outdoor or both
    public float getDiscountedPrice()
    {
        float discountedPrice = price;
        switch(furnitureUsage)
        {
            case "outdoor":
            case "indoor-outdoor":
                discountedPrice = 0.95f * price;
        }

        return discountedPrice;
    }

    public void displayInfo()
    {
        float discountedPrice = getDiscountedPrice();
        System.out.printf("Code:%s\tType:%s\tGrade:%d\tColor:%s\tUsage:%s\tPrice:%.2f\tDiscountedPrice:%.2f\n",
                furnitureCode, furnitureType,gradeOfFurniture,color,furnitureUsage, price, discountedPrice);
    }
}
