package MultiThreading;
public class MultiThreading{
void test() {
for (int i = 0; i < 5; i++) {
System.out.println("test method iteration "+i);
}}
public static void main(String[] args) {
MultiThreading t1 = new MultiThreading();
t1.test ();
for (int i = 0; 1 < 5; i++) {
System.out.println("Main method iteration "+i);
}
}
}