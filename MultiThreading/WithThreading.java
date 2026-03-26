package MultiThreading;

public class WithThreading extends Thread {
    void test(){
        for(int i =0; i < 5; i++){
            System.out.println("test nethod itereation "+1);
        }
    }
   public void run(){
    test();
   }
   public static void main(String[] args) {
    WithThreading t1 = new WithThreading();
    t1.start();
    for(int i= 0 ; i < 5; i++){
        System.out.println("Main Method Iteration " +i);
    }
   }
}
