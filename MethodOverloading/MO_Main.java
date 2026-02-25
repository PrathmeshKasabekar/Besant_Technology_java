package MethodOverloading;
public class MO_Main {
    // main method overloading
    public static void main(int num) {
        System.out.println("name is " + num);
    }
    public static void main(String name) {
        System.out.println("name is " + name);
    }
    public static void main(float CGP) {
        System.out.println("name is " + CGP);
    }
    public static void main(String[] args) {
        main(21);
        main("prathm");
        main(9.75f);
    }
}
