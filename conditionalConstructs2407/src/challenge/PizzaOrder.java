package challenge;

import java.util.Scanner;
/*
 * Veggie Pizza
 * Veggie Pizza delivers custom-made vegetarian pizzas. It has
 * become quite popular over the years.
 * To keep track of its customers, the delivery joint wants to store
 * their details in a database. Write a
 * Java program that stores each customer's personal
 * details and order history. The program should also
 * calculate the bill amount for each item ordered.
 */
public class PizzaOrder 
{
    public static void main(String[] args)
    {
        float pizzaPrice = 12.5f;
        float beveragePrice = 1.99f;
        float garlicBreadPrice = 5.99f;
        char pizzaSize = 'M';

        Scanner scanner = new Scanner(System.in);
        String customerName ,customerEmail, address;
        long phoneNo;

        String itemChosenName = null;
        int itemChosen, noOfItemsOrdered;
        boolean invalidChoice = false;
        
        float totalBill = 0f, perItemPrice = 0f;
         
        System.out.println("!!! Welcome !!!");
        System.out.println("!!! Enter customer details for lacing an order !!!");

        System.out.println("Enter your Name");
        customerName = scanner.nextLine();
        
        System.out.println("Enter your Email");
        customerEmail = scanner.next();
        
        System.out.println("Enter your ContactNo.");
        phoneNo = scanner.nextLong();
        
        scanner.nextLine(); // consuming the leftover new line after the nextLong() call in the last line.
        
        System.out.println("Enter your Address");
        address = scanner.nextLine();
        System.out.println("\n");

        System.out.println("!!! Thank you for providing your details !!!\n\n");

        System.out.println("Select the item from the Main Menu\n\n");
        System.out.println("Sl No\tItem Category");
        System.out.println("--------------------------");
        System.out.println("1)\tPizza\n2)\tGarlic Bread\n3)\tBeverages");
        System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
        itemChosen = scanner.nextInt();
        
        switch(itemChosen)
        {
            case 1:
                itemChosenName = "pizzas";
                perItemPrice = pizzaPrice;
                break;
            case 2:
                itemChosenName = "garlic breads";
                perItemPrice = garlicBreadPrice;
                break;
            case 3:
                itemChosenName = "beverages";
                perItemPrice = beveragePrice;
                break;
            default:
                invalidChoice = true;
                System.out.println("Invalid item chosen!");
        }

        if(!invalidChoice)
        {
            System.out.format("Please enter the number of %s you want to order:\n", itemChosenName);
            noOfItemsOrdered = scanner.nextInt();

            totalBill = noOfItemsOrdered * perItemPrice;
            System.out.format("Your total %s Bill: $%.2f\n", itemChosenName, totalBill);
        }

        scanner.close();
    }
}
