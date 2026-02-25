package Constant;
// Write a program to intialize object data
public class Cons_Obj {
    String StudentName;
    Cons_Obj(String name){
        StudentName=name;
        System.out.println();
    }
    public static void main(String[] args) {
        Cons_Obj ref = new Cons_Obj("pallavi");
        System.out.println(ref.StudentName);
    }
    }
