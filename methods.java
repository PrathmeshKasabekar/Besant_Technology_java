public class methods {
    static int a = 10;
    static int b = 20;
    static float pi = 3.14f;
    public static void square()
    {
        System.out.println("area of the square"+ a*a);
    }
    public static int rectangle(){
        System.out.println("the are of rectangle is :  ");
        return a*b;
    }
    public static float circle(int b){
        System.out.println("area of the circle is ");
        return pi*(a*a);
    }
    public static void main(String[] args) {
        square();
        System.out.println(rectangle());
        System.out.println(circle(10));
    }
}
