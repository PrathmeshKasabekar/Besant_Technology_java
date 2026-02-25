//  to call static value you dont need to create a object
public class static_q {
    // Declaring the Static Variable
    static int num = 10;
    // Creating a Static method/class
    public static void test(){
        // Reintiolizing the global variable 
        num = 250;
        // print statement
        System.out.println("this is a static method");
    }
    // declaring a non static class/ method 
    public int num2=100;
    public int add(){
        int c = num + num2;
        return c;
    }
    public void test2(){
        num2=9;
        System.out.println("Hey i am not static");
        System.out.println(num);
    }
    // Main method 
    public static void main(String[] args) {
        //  This statement will print the Global Value of the variable declared in the Static variable/ 1st value
        System.out.println(static_q.num);
        // This statmnet will print the test method 
        static_q.test();
        //  here it will print the reintiallized value of te global varibale 
        System.out.println(num);

        // there is no need but e can call the static member with use of the object but used in non static to static conversion 
        // example
        static_q ref = new static_q();
        ref.add();
        System.out.println("after the reintializing");
        System.out.println(num);
        
        
    }
}
