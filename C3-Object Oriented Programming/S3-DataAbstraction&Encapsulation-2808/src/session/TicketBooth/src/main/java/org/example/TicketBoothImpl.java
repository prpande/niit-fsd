package org.example;
import java.util.Scanner;
public class TicketBoothImpl
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        TicketBooth ticketBooth = new TicketBooth();

        boolean done = false;
        do
        {
            System.out.println("------------------MENU------------------");
            System.out.println("Please choose on option:");
            System.out.println("1. Register Visitor.");
            System.out.println("2. Register Visitor but Ticket Sold Out.");
            System.out.println("3. Display Totals information.");
            System.out.println("4. Display number of tickets sold.");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    ticketBooth.registerVisitor(false);
                    break;
                case 2:
                    ticketBooth.registerVisitor(true);
                    break;
                case 3:
                    ticketBooth.displayTotalInfo();
                    break;
                case 4:
                    ticketBooth.displayNumberOfTicketsSold();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
                    break;
            }

        } while(!done);

        scanner.close();
    }
}
