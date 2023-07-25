package challenge;

public class PizzaOrder1 
{
    public static void main(String[] args)
    {
        int discountOffered = 10;
        String customerName = "Gary";
        String customerEmail = "gary@123.com";
        long phoneNo = 412312345l;
        String address = "20, Marble Drive, Eville";
        int noOfPizzasOrdered = 5;
        float pizzaPrice = 12.5f;
        char pizzaSize = 'M';
        int noOfGarlicBreadOrdered = 3;
        float garlicBreadPrice = 5.99f;
        int noOfBeveragesOrdered = 3;
        float beveragePrice = 1.99f;

        float totalPizzaPrice = noOfPizzasOrdered * pizzaPrice;
        float totalGarlicBreadPrice = noOfGarlicBreadOrdered * garlicBreadPrice;
        float totalBeveragePrice = noOfBeveragesOrdered * beveragePrice;

        float totalBillAmount = totalPizzaPrice + totalGarlicBreadPrice + totalBeveragePrice;

        boolean checkBillAmount = totalBillAmount >= 100;

        float discountedBillAmount = (1 - discountOffered/100f) * totalBillAmount;

        System.out.println("------------------------");
        System.out.println("    Customer Details");
        System.out.println("------------------------");

        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Phone Number : " + phoneNo);
        System.out.println("Customer email : " + customerEmail);
        System.out.println("Customer Address : " + address);

        System.out.println("\n\n");

        System.out.println("---------------------");
        System.out.println("    Order Summary");
        System.out.println("---------------------");

        System.out.println("\n");

        System.out.println("Sr no.\tItemName\tItemQuantity\t$Price/Unit\t$TotalPrice");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1\tPizza\t\t     " + noOfPizzasOrdered +"\t\t" + pizzaPrice + "\t\t" + totalPizzaPrice);
        System.out.println("2\tGarlic Bread\t     " + noOfGarlicBreadOrdered +"\t\t" + garlicBreadPrice + "\t\t" + totalGarlicBreadPrice);
        System.out.println("3\tBeverages\t     " + noOfBeveragesOrdered +"\t\t" + beveragePrice + "\t\t" + totalBeveragePrice);

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Total Bill Amount: $" + totalBillAmount);
        System.out.println("Discount Offered : " + discountOffered + "%");
        System.out.println("Amount to be paid: $" + discountedBillAmount);
        System.out.println("---------------Thank You-------------------------------------------");

    }
}
