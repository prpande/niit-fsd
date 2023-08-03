package practice;

public class SellingPrice 
{
    public static void main(String[] args)
    {
        String itemName = "Kaisa Bowl";
        float sellingPrice = 10.99f;

        float revisedSellingPrice = 1.05f * sellingPrice;
        System.out.println("Revised Selling Price for " + itemName + " is $" + revisedSellingPrice);
    }
}
