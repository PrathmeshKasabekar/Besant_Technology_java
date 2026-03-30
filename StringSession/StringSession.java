package StringSession;
// EXPLAIN THE COMPARISON OF STRING FOR THE GIVEN CODE ........Assignment
public class StringSession {
    
    public static void main(String[] args) {
     String s1 = "Hello";
     String s2 =  "Hello";
        System.out.println(s1 == s2); 
        // the code will try to match the addresss of the Strig not the actual values as s1 and s2 both have the same value it is assigned to the same addreess so the value here will be true
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        // here the new object is created for both the values and is not in tha same address it will kept in s
        System.out.println("s1 == str "+ (s1 == str1));
        System.out.println("s1.equal(str) "+ (s1.equals(str1)));
        System.out.println("str == str2 "+ (str1 == str2));
        System.out.println("str.equal(str2) "+ (str1.equals(str2)));
        String str3 =str2;
        System.out.println(str3==str2);
    }
}