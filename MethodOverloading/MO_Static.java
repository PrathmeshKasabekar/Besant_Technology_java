package MethodOverloading;
public class MO_Static{
//  method overloading in the static methods 
    public static void whatsapp(){
        System.out.println("simple chats feature");
    }
    public static void whatsapp(int ver){
        System.out.println("version of the Whatsapp" + ver);
    }
    public static void whatsapp(String features){
        System.out.println("version of the Whatsapp" + features);
    }
    public static void whatsapp(String features , int ver){
        System.out.println("features is "+features+"of"+ver);
    }
    public static void whatsapp( int ver, String features ){
        System.out.println("version is "+ver+"and features "+features);
    }

    public static void main(String[] args) {
        whatsapp();
        whatsapp(1);
        whatsapp("calls");
        whatsapp("calls", 2);
        whatsapp(3,"status");
    }
}