package MultiThreading;

public class MultiSleep extends Thread {
    void test(){
        for(int i =0; i < 5; i++){
            if(i==0){
                Thread.sleep(5000);
            }
            System.out.println("test nethod itereation "+1);
        }
    }
   public void run(){
    try{
    test();
   } catch (InterruptedException e){
    e.printStackTrace();
   }
}
   public static void main(String[] args) throws InterruptedException {
    MultiSleep t1 = new MultiSleep();
    t1.start();
    t1.join();
    for(int i= 0 ; i < 5; i++){
        System.out.println("Main Method Iteration " +i);
    }
   }
}

