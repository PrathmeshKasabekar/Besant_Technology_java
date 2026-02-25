package Constant;
public class Cons_call {
    String StudentName;
   public Cons_call(){
    this("palllavi");
   }
   public Cons_call(String StudentName){
    this.StudentName=StudentName;
   }
    public static void main(String[] args) {
       Cons_call obj =new Cons_call();
       System.out.println(obj.StudentName);
    }
}
