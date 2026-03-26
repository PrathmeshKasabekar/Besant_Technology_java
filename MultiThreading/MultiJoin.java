package MultiThreading;

public class MultiJoin extends Thread {
    void test(){
        for(int i =0; i < 5; i++){
            System.out.println("test nethod itereation "+1);
        }
    }
   public void run(){
    test();
   }
   public static void main(String[] args) throws InterruptedException {
    MultiJoin t1 = new MultiJoin();
    t1.start();
    t1.join();
    for(int i= 0 ; i < 5; i++){
        System.out.println("Main Method Iteration " +i);
    }
   }
}
