import java.util.Scanner;

public class triangle {
    public static double area(int height, int base){
        double Tarea = 0.5*height*base;
        return Tarea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height of the triangle");
        int height = sc.nextInt();
        System.out.println("enter the base of the Triangle");
        int base = sc.nextInt();
        System.out.println("the area of the Triangle is : " + area(height, base));
    }
}
