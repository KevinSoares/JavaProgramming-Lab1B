package lab1b;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author Kevin Soares 000374322
 * Date: 02/04/16
 * Purpose: To calculate the amount of change needed for 1 dollar and out the amount in the respective denominations.
 * Statement of Authorship: I, Kevin Soares, 000374322 certify that this material is my original work. No other person's work has been used without due acknowledgement.
 */
public class Lab1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables needed
        DecimalFormat df = new DecimalFormat("#.##");
        double priceInput;
        double changeAmount;
        int twentyAmount = 0;
        int tensAmount = 0;
        int fivesAmount = 0;
        int twoAmount = 0;
        int onesAmount = 0;
        int quatersAmount = 0;
        int dimeAmount = 0;
        int nickleAmount = 0;
        int penniesAmount = 0;
        
        // Create object of type Scanner
        Scanner input = new Scanner(System.in);
        
        // Output and get the user input
        System.out.print("Enter the price of the purchase: ");
        priceInput = input.nextDouble();
        
        // Get the change for 100 dollars and display
        changeAmount = 100.0 - priceInput;
        System.out.printf("The change from $100.00 is: $%.2f \n", changeAmount);
        
        
        // While loops to count the amount of denominations
        while(changeAmount >= 20.0)
        {
            ++twentyAmount;
            changeAmount -= 20.0;
        }
        
        while(changeAmount >= 10.0)
        {
            ++tensAmount;
            changeAmount -= 10.0;
        }
        
        while(changeAmount >= 05.0)
        {
            ++fivesAmount;
            changeAmount -= 05.0;
        }
        
        while(changeAmount >= 02.0)
        {
            ++twoAmount;
            changeAmount -= 02.0;
        }
        
        while(changeAmount >= 01.0)
        {
            ++onesAmount;
            changeAmount -= 01.0;
        }
        
        while(changeAmount >= 0.25)
        {
            ++quatersAmount;
            changeAmount -= 0.25;
        }
        
        while(changeAmount >= 0.10)
        {
            ++dimeAmount;
            changeAmount -= 0.10;
        }
        
        while(changeAmount >= 0.05)
        {
            ++nickleAmount;
            changeAmount -= 0.05;
        }
    
        while(changeAmount >= 0.01)
        {
            ++penniesAmount;
            changeAmount -= 0.01;
        }
        
        // Display if needed the count of denominations
        DisplayOutput("20", twentyAmount);
        DisplayOutput("10", tensAmount);
        DisplayOutput("5", fivesAmount);
        DisplayOutput("2", twoAmount);
        DisplayOutput("1", onesAmount);
        DisplayOutput("Quaters", quatersAmount);
        DisplayOutput("Dimes", dimeAmount);
        DisplayOutput("Nickles", nickleAmount);
        DisplayOutput("Pennies", penniesAmount);
    }
    
    /**
     * Display the current denomination count
     * @param denAmount The denomination amount outputted
     * @param changeAmount The current count of change to output
     */
    public static void DisplayOutput(String denAmount, int changeAmount)
    { 
        if(changeAmount > 0)
        {
            if(null != denAmount)
            switch (denAmount) {
                case "Quaters":
                case "Dimes":
                case "Nickles":
                case "Pennies":
                    System.out.printf("Number of %s is: %d \n", denAmount, changeAmount);
                    break;
                case "20":
                case "10":
                case "5":
                    System.out.printf("Number of %s bills is: %d \n", denAmount, changeAmount);
                    break;
                case "2":
                case "1":
                    System.out.printf("Number of %s coins is: %d \n", denAmount, changeAmount);
                    break;
                default:
                    break;
            }
        }
    }
}
