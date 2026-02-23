// Importing the Scanner Class for taking input 
import java.util.Scanner;

public class houseprice{
    // Using the parameterized method and intializing the variables
    public static int value(int profit, int cost){
       // Returning the values (profit + cost)
        return profit+cost;
        
    }
    // Different parameterized method used for percentage calculating
    public static double percentage (int profit, int cost ){
        // formula or operations for percentage
        double perce = ((profit * 100.0) / cost);
        // returning the values 
        return perce;
        
    }
    // Main meth
    public static void main(String[] args) {
        // Calling the scanner
        Scanner sc = new Scanner(System.in);
       
            // Taking the inputs or values for profit 
            System.out.println("enter the profit on the house : ");
            int profit = sc.nextInt();
            
            // Taking the inputs or values for cost
            System.out.println("enter the cost price / the price on whoch you bought the house");
            int cost = sc.nextInt();
            // Print
            System.out.println("The selling price for this house is : " + value(profit,cost));
            // Print
            System.out.println("the profit percentage is : " + percentage(profit, cost)+" %");
            
    }
}