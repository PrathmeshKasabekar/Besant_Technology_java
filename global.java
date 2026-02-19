public class global {
        static byte a ;
        // declaring a static byte byte value
        // the globall varibale cant be intialized and reintializeed later it should only be intialized when 
        static short b;
        // declaring a static short byte value
        static int c;
        // declaring a static int byte value
        static long d;
        // declaring a static long byte value
        static float e;
        // declaring a static float byte value
        static double f;
        // declaring a static double byte value
        static String g;
        // declaring a static string byte value
        static boolean h;
        // declaring a static boolean byte value
    
public static void main(String[] args) {
         System.out.println(a);
        //  print the glabal value of byte
         System.out.println(b);
         //  print the glabal value of short
         System.out.println(c);
         //  print the glabal value of int
         System.out.println(d);
         //  print the glabal value of long
         System.out.println(e);
         //  print the glabal value of float
         System.out.println(f);
         //  print the glabal value of double
         System.out.println(g);
         //  print the glabal value of string
         System.out.println(h);
         //  print the glabal value of boolean


         byte c1 =123;
        //  the local variable is intialized
        // local variable should be initialized before utilization
         c1 = 111;
        //  local varibale can be reintialized again
         System.out.println(c1);
        //  printing of local variable
    }
}

