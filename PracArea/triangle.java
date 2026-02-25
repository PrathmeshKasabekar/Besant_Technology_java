// Importing the Scanner Class for taking input 
import java.util.Scanner;

public class triangle {
    
    // Using the parameterized method and intializing the variables
    public static double area(int height, int base){
        // Formula for area of traingle and storing it in Tarea variable
        double Tarea = 0.5*height*base;
        // Returning the value 
        return Tarea;
    }
    // Main Method
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);

        // Taking the Values from users for Height
        System.out.println("enter the height of the triangle");
        int height = sc.nextInt();

        // Taking the Values from users for Base
        System.out.println("enter the base of the Triangle");
        int base = sc.nextInt();

        // Printing the value by using/calling the parameterize method
        System.out.println("the area of the Triangle is : " + area(height, base));
    }
}
