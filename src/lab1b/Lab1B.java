package lab1b;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author kevin.soares1
 */
public class Lab1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        System.out.print("Enter the price of the purchase: ");
        
        // Create scanner for input
        Scanner input = new Scanner(System.in);
        
        // Get input from user
        priceInput = input.nextDouble();
        
        // Get change
        changeAmount = 100.0 - priceInput;
        
        System.out.printf("The change from $100.00 is: $%.2f \n", changeAmount);
        
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
        
        if(twentyAmount > 0)
        {
            System.out.printf("Number of $20 bills is: %d \n", twentyAmount);
        }
        
        if(tensAmount > 0)
        {
            System.out.printf("Number of $10 bills is: %d \n", tensAmount);
        }
        
        if(fivesAmount > 0)
        {
            System.out.printf("Number of $5 bills is: %d \n", fivesAmount);
        }
        
        if(twoAmount > 0)
        {
            System.out.printf("Number of $2 bills is: %d \n", twoAmount);
        }
        
        if(onesAmount > 0)
        {
            System.out.printf("Number of $1 bills is: %d \n", onesAmount);
        }
        
        if(quatersAmount > 0)
        {
            System.out.printf("Number of quaters is: %d \n", quatersAmount);
        }
        
        if(dimeAmount > 0)
        {
            System.out.printf("Number of dimes is: %d \n", dimeAmount);
        }
        
        if(nickleAmount > 0)
        {
            System.out.printf("Number of nickles is: %d \n", nickleAmount);
        }
        
        if(penniesAmount > 0)
        {
            System.out.printf("Number of pennies is: %d \n", penniesAmount);
        }
    }
}
