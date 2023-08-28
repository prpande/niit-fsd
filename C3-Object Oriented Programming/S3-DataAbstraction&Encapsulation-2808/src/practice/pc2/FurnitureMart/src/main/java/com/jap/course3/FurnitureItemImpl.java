package com.jap.course3;

public class FurnitureItemImpl
{
    public static void main(String[] args)
    {
        FurnitureItem item1 = new FurnitureItem();

        item1.setFurnitureCode(101);
        item1.setFurnitureType("table");
        item1.setGradeOfFurniture("grade1");
        item1.setFurnitureUsage("outdoor");
        item1.setFurniturePrice(10.0f);

        float discount = item1.calculateDiscount();
        float discountedPrice = item1.getFurniturePrice() - discount;

        System.out.println("Discounted price is $" + discountedPrice + ".");
    }
}
