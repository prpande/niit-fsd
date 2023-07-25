package practice;

import java.util.Scanner;
/*
 * Practice 1: Aquarium Water pH Value
 * The chemical formula of water is H20 (2 hydrogen atoms
 * + 1 oxygen atom). The pH of an aquarium measures how
 * acidic or basic the water is. It ranges from 0 to 14, with 0
 * being the most acidic and 14 the most alkaline (basic).
 * Neutral water has a pH value of 7.
 * 
 * For a goldfish to survive in an aquarium, the pH value
 * must range between 7 to 8. The pH of the aquarium itself
 * can change over time.
 * 
 * Write a program that takes the aquarium water's pH
 * value, checks the condition of the pH value of water an
 * displays the result.
 */
public class PhLevelAnalyser 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float pH;

        System.out.println("Enter aquarium water's pH value:");
        pH = scanner.nextFloat();

        if(pH > 8)
        {
            System.out.println("pH value is high, partial water change required.");
        }
        else if(pH >= 7)
        {
            System.out.println("pH value is fine.");
        }
        else
        {
            System.out.println("pH value is low, partial water change required.");
        }

        scanner.close();
    }
}
