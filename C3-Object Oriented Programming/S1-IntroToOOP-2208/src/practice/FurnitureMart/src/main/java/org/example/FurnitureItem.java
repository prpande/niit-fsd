package org.example;

public class FurnitureItem
{
    String name;
    String color; // red, blue, green
    int plasticGrade; // 1, 2 or 3
    String useCase; //  indoor, outdoor or indoor-outdoor
    String type; // tables, chairs, cupboards & stools
    float price;

    // Gets the discounted price
    // 5% flat discount if the use case is outdoor or both
    public float getDiscountedPrice()
    {
        float discountedPrice = price;
        switch(useCase)
        {
            case "outdoor":
            case "indoor-outdoor":
                discountedPrice = 0.95f * price;
        }

        return discountedPrice;
    }
}
