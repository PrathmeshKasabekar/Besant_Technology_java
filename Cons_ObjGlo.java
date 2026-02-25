// Write a program to intialize object data
public class Cons_ObjGlo {
    String StudentName;
    Cons_ObjGlo(String StudentName){
        this.StudentName=StudentName;
        System.out.println();
    }
    public static void main(String[] args) {
        Cons_Obj ref = new Cons_Obj("pallavi");
        System.out.println(ref.StudentName);
    }
    }

