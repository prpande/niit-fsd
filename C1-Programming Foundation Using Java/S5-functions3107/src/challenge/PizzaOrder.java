package challenge;

import java.util.Scanner;
/*
 * Veggie Pizza
 * Veggie Pizza delivers custom-made vegetarian pizzas along
 * with other accompaniments. As a seasonal-promotional offer,
 * the pizza joint is providing a discount of 10% on any bill that is
 * greater than $50.
 * Write a Java program to store the personal and order details of
 * a customer. Also, calculate the bill amount for the
 * items ordered and the total discount received
 * on them.
 * Write the methods used to perform these
 * calculations.
 */
public class PizzaOrder 
{
    public void displayCustomerDetails(String name, String email, long phoneNo, String address)
    {
        System.out.println("Customer Details");
        System.out.println("-----------------");
        System.out.println("Name of the Customer is : " + name);
        System.out.println("Email of the Customer is : " + email);
        System.out.println("Contact No of the Customer is : " + phoneNo);
        System.out.println("Address of the Customer is : " + address);
        System.out.println("---------------------------------------------");
    }

    public void displayMenu()
    {
        System.out.println("Select the items to order");
        System.out.println("Sl No\tItem Category");
        System.out.println("----------------------------");
        System.out.println("1) Pizza");
        System.out.println("\tPrice of One Regular Pizza\t: $9.99");  
        System.out.println("\tPrice of One Medium Pizza\t: $11.99");
        System.out.println("\tPrice of One Large Pizza\t: $13.99");
        System.out.println("2) Garlic Bread");
        System.out.println("\tPrice of One Garlic Bread\t: $5.99");
        System.out.println("3) Beverages");
        System.out.println("\tPrice of One Beverage\t: $1.99");
        System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
    }

    public float getPriceOfPizzaBasedOnSize(int size)
    {
        float priceOfPizza = 0;
        if(size == 1)
        {
            priceOfPizza = 9.99f;
        }
        else if(size == 2)
        {
            priceOfPizza = 11.99f;
        }
        else if(size == 3)
        {
            priceOfPizza = 13.99f;
        }
        else
        {
            System.out.println("Invalid size, Enter 1,2 or 3");
            priceOfPizza = 0;
        }

        return priceOfPizza;
    }

    public float getPriceOfGarlicBread() {return 5.99f; }
    public float getPriceOfBeverage() {return 1.99f; }

    public float calculatePriceOfPizza(int noOfPizza, float priceOfPizza)
    {
        return noOfPizza * priceOfPizza;
    }

    public float calculatePriceOfGarlicBread(int noOfGarlicBread, float priceOfGarlicBread)
    {
        return noOfGarlicBread * priceOfGarlicBread;
    }

    public float calculatePriceOfBeverage(int noOfBeverages, float priceOfBeverages)
    {
        return noOfBeverages * priceOfBeverages;
    }

    public float calculateTotalBill(float totalPizzaPrice, float totalGarlicBreadPrice, float totalBeveragePrice)
    {
        return totalPizzaPrice + totalGarlicBreadPrice + totalBeveragePrice;
    }

    public float calculateDiscountAndReturnBillAmount(float totalBillAmount)
    {
        if(totalBillAmount > 50)
        {
            return 0.9f * totalBillAmount;
        }
        else
        {
            return totalBillAmount;
        }
    }

    public void displayOrderDetails (int noOfPizza, 
                                    int noOfGarlicBread, 
                                    int noOfBeverages, 
                                    int size, 
                                    float totalPrice,  
                                    float totalPriceAfterDiscount)
    {
        System.out.println("Order Details");
        System.out.println("--------------");
        System.out.println("The number of pizzas ordered\t\t: " + noOfPizza);
        System.out.println("The number of garlic bread ordered\t: " + noOfGarlicBread);
        System.out.println("The number of beverages ordered\t\t: " + noOfBeverages);
        System.out.println("--------------------------------------------------");
        System.out.println("The Total Bill Amount is\t: $" + totalPrice);

        if(totalPrice != totalPriceAfterDiscount)
        {
            System.out.println("The Discounted Bill Amount is\t: $" + totalPriceAfterDiscount);
        }
        else
        {
            System.out.println("No Discount on Bill");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        PizzaOrder pizzaOrder = new PizzaOrder();
        String customerName ,customerEmail, address;
        long phoneNo;

        int itemChosen, choice;
        float perItemPrice = 0, totalPizzaPrice = 0, totalGarlicBreadPrice = 0, totalBeveragePrice = 0;
        int noOfPizza = 0, noOfGarlicBread = 0, noOfBeverages = 0, pizzaSize = 0;
        
        float totalBillAmount = 0f, totalPriceAfterDiscount = 0f;
         
        System.out.println("!!! Welcome !!!");
        System.out.println("!!! Enter customer details for placing an order !!!");

        System.out.println("Enter your Name");
        customerName = scanner.nextLine();
        
        System.out.println("Enter your Email");
        customerEmail = scanner.nextLine();
        
        System.out.println("Enter your Address");
        address = scanner.nextLine();
        
        System.out.println("Enter your ContactNo.");
        phoneNo = Long.parseLong(scanner.nextLine());

        System.out.println("\n");

        System.out.println("!!! Thank you for providing your details !!!\n\n");

        do
        {
            pizzaOrder.displayMenu();
            itemChosen = scanner.nextInt();
            
            switch(itemChosen)
            {
                case 1:
                    System.out.println("Please enter the size of pizza:");
                    pizzaSize =  scanner.nextInt();
                    perItemPrice = pizzaOrder.getPriceOfPizzaBasedOnSize(pizzaSize);
                    System.out.println("Please enter the number of pizzas you want to order:");
                    noOfPizza += scanner.nextInt();
                    totalPizzaPrice += pizzaOrder.calculatePriceOfPizza(noOfPizza, perItemPrice);
                    break;
                case 2:
                    perItemPrice = pizzaOrder.getPriceOfGarlicBread();
                    System.out.println("Please enter the number of garlic breads you want to order:");
                    noOfGarlicBread += scanner.nextInt();
                    totalGarlicBreadPrice += pizzaOrder.calculatePriceOfGarlicBread(noOfGarlicBread, perItemPrice);
                    break;
                case 3:
                    perItemPrice = pizzaOrder.getPriceOfBeverage();
                    System.out.println("Please enter the number of beverages you want to order:");
                    noOfBeverages += scanner.nextInt();
                    totalBeveragePrice += pizzaOrder.calculatePriceOfBeverage(noOfBeverages, perItemPrice);
                    break;
                default:
                    System.out.println("Invalid item chosen!");
            }

            System.out.println("Do you want to place another order enter 1 to continue or O to exit");
            choice = scanner.nextInt();

        } while(choice == 1);

        pizzaOrder.displayCustomerDetails(customerName, customerEmail, phoneNo, address);

        totalBillAmount = pizzaOrder.calculateTotalBill(totalPizzaPrice, totalGarlicBreadPrice, totalBeveragePrice);
        totalPriceAfterDiscount = pizzaOrder.calculateDiscountAndReturnBillAmount(totalBillAmount);

        pizzaOrder.displayOrderDetails(noOfPizza, noOfGarlicBread, noOfBeverages, pizzaSize, totalBillAmount, totalPriceAfterDiscount);

        scanner.close();
    }
}
