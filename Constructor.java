public class Constructor {
    public Constructor(){
        // return type and it is alwasy non static
        // constructor name should be same as class name
        // constructor can be overloadede
        // ill be invojed whenver an object is created 
    System.out.println("Defaut Constructor");
    }
    public Constructor(int num){
        System.out.println("age"+num);
    }
    public Constructor(String name){
        System.out.println("name is"+name);
    }
    public static void main(String[] args) {
        new Constructor();
        new Constructor(25);
        new Constructor("prathm");
    }
}
