// EXPLAIN THE COMPARISON OF STRING FOR THE GIVEN CODE ........Assignment
public class StringSession {
    
    public static void main(String[] args) {
     String s1 = "Hello";
     String s2 =  "Hello";
        System.out.println(s1 == s2);
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("s1 == str "+ (s1 == str1));
        System.out.println("s1.equal(str) "+ (s1.equals(str1)));
        System.out.println("str == str2 "+ (str1 == str2));
        System.out.println("str.equal(str2) "+ (str1.equals(str2)));
        String str3 =str2;
        System.out.println(str3==str2);
    }
}