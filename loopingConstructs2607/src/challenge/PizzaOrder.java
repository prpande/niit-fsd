package challenge;

import java.util.Scanner;
/*
 * Veggie Pizza
 * Veggie Pizza is popular for delivering custom-made vegetarian
 * pizzas. To further promote their product, they are offering a
 * discount of 10% for any bill that is greater than $50
 * Write a Java program to store a customer's personal details and
 * the orders made by him.
 * Calculate the total bill amount for all the items
 * ordered and then calculate the total discount
 * received by the customer
 */
public class PizzaOrder 
{
    public static void main(String[] args)
    {
        int discountOffered = 10, discountThreshold = 50;
        float pizzaPrice = 12.99f;
        float beveragePrice = 1.99f;
        float garlicBreadPrice = 5.99f;
        char pizzaSize = 'M';

        Scanner scanner = new Scanner(System.in);
        String customerName ,customerEmail, address;
        long phoneNo;

        String itemChosenName = null;
        int itemChosen, noOfItemsOrdered, choice;
        boolean invalidChoice;
        
        float totalBill = 0f, loopBill = 0f, perItemPrice = 0f, discountedBill = 0f;
         
        System.out.println("!!! Welcome !!!");
        System.out.println("!!! Enter customer details for placing an order !!!");

        System.out.println("Enter your Name");
        customerName = scanner.nextLine();
        
        System.out.println("Enter your Email");
        customerEmail = scanner.nextLine();
        
        System.out.println("Enter your ContactNo.");
        phoneNo = Long.parseLong(scanner.nextLine());
        
        System.out.println("Enter your Address");
        address = scanner.nextLine();
        System.out.println("\n");

        System.out.println("!!! Thank you for providing your details !!!\n\n");

        do
        {
            invalidChoice = false;
            System.out.println("Select the item from the Main Menu\n\n");
            System.out.println("Sl No\tItem Category");
            System.out.println("--------------------------");
            System.out.println("1)\tPizza\n2)\tGarlic Bread\n3)\tBeverages");
            System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
            itemChosen = Integer.parseInt(scanner.nextLine());
            
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
                noOfItemsOrdered = Integer.parseInt(scanner.nextLine());

                loopBill = noOfItemsOrdered * perItemPrice;
                System.out.format("Your total %s Bill: $ %.2f\n", itemChosenName, loopBill);

                totalBill += loopBill;
            }

            System.out.println("Do you want to place another order enter 1 to continue or O to exit");
            choice = Integer.parseInt(scanner.nextLine());

        } while(choice == 1);

        System.out.format("The total bill amount is : $ %.2f\n", totalBill);

        if(totalBill > discountThreshold)
        {
            discountedBill = totalBill * (1 - discountOffered/100f);
            System.out.format("The total discounted bill amount : $ %.3f\n", discountedBill);
        }
        else
        {
            System.out.format("No discount provided since bill amount is less than $ %d\n", (int)discountThreshold);
        }

        scanner.close();
    }
}
