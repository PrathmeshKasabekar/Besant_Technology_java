package Constant;
public class Cons {
    public Cons(){
        // return type and it is alwasy non static
        // constructor name should be same as class name
        // constructor can be overloadede
        // ill be invojed whenver an object is created 
    System.out.println("Defaut Constructor");
    }
    public Cons(int num){
        System.out.println("age :  j"+num);
    }
    public Cons(String name){
        System.out.println("name is : "+name);
    }
    public static void main(String[] args) {
        new Cons();
        new Cons(25);
        new Cons("prathm");
    }
}
