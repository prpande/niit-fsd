package org.example;

public class TicketBooth
{
    private int numberOfVisitors;
    private float totalMoneyCollected;
    final static float TICKET_PRICE = 2.50f;

    public TicketBooth()
    {
        numberOfVisitors = 0;
        totalMoneyCollected = 0.0f;
    }

    public void registerVisitor(boolean soldOut)
    {
        numberOfVisitors++;
        if(!soldOut)
        {
            totalMoneyCollected += TICKET_PRICE;
        }
    }

    public void displayTotalInfo()
    {
        System.out.printf("# of Visitors\t\t\t:\t%d\nTotal Money Collected\t:\tRs.%.2f\n",
                            numberOfVisitors, totalMoneyCollected);
    }

    public void displayNumberOfTicketsSold()
    {
        int numberOfTicketsSold = (int)(totalMoneyCollected / TICKET_PRICE);
        System.out.printf("# of tickets sold\t:\t%d\n", numberOfTicketsSold);
    }
}
