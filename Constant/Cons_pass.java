package Constant;
public class Cons_pass {
    String StudentName;
    public Cons_pass(String StudentName){
        this.StudentName=StudentName;

    }
    public static void DisplayName(Cons_pass ref){
        System.out.println(ref.StudentName);
    }
    public void SendObj(){
        DisplayName(this);
    }
    public static void main(String[] args) {
        Cons_pass ref= new Cons_pass("pallavi");
        ref.SendObj();
    }
}
