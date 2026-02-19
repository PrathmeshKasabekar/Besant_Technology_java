public class operations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c= 5;

// assignmnet operators
        System.out.println("at=a "+(a+=a)) ;//20
        // a=a+a operation will be done 
        System.out.println("a*=a "+(a*=b)) ;
        // a=a*a operation will be done 
        System.out.println("b/=a "+(b/=b)) ;//
        System.out.println("a%=a "+ (b%=a)) ;
        
        
        System.out.println(--a);
        // the operaotor is incremented or decremented before the utilization
        System.out.println(++a);
        // the operator is utilzed later so the output will not chaange the value updation wil be print later on
        System.out.println(a);
        // the operation or this was done is above  statement

// logical operators

    // AND operator chekcs if both the statemnets are true.. if its true it will give you true.. if even one statement is false it will give false
        System.out.println(a<b && a>c);
        // both values or statemets are true so true
        System.out.println(a<b && a<c);
        // one value is false so false
        System.out.println(a>b && a>c);
        // both values are false so false

    // OR operator checks and even if a single statement is true in it it will give true as output
        System.out.println(a<b && a>c);
        // both values or statemets are true so true
        System.out.println(a<b && a<c);
        // one value is true so true
        System.out.println(a>b && a>c);
        // both values are false so false

// Relational operators
        System.out.println(a>b);
        // compares the two varibales here it is checcking if a is bigger than b
        System.out.println(a<b);
        // subtracts the two varibales here it is checcking if b is bigger than a
        System.out.println(a==b);
        // comapring both the values and looking if both values are equal
        System.out.println(a!=b);
        // comapring both the values and looking if both values are not equal
// arthematic operations
        System.out.println(a+b);
        // adds the two varibales
        System.out.println(a-b);
        // subtracts the two varibales
        System.out.println(a*b);
        // multiplies the two varibales
        System.out.println(a/b);
        // devides the two varibales
    }
}
