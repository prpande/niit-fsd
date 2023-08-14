package com.jap.addevens;
import java.util.Scanner;
public class AddEven
{
  //Write the logic to add evens in the methods
  public long addEvens(int n)    
  {
    if(n <= 0)
    {
      return 0;
    }
    else if(n % 2 == 0)
    {
      return n + addEvens(n - 1);
    }
    else
    {
      return addEvens(n - 1);
    }
  }

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    // Initialize the object of AddEven class
    AddEven addEven = new AddEven();

    // Declare a variable to give as input to the addEvens method
    System.out.println("Enter the number: ");
    int n = scanner.nextInt();

    // Call the addEvens method and display the result
    long evenSum = addEven.addEvens(n);
    System.out.format("Sum of Even numbers till %d is: %d\n", n, evenSum);

    scanner.close();
  }
}
