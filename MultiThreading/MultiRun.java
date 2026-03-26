package MultiThreading;
public class MultiRun implements Runnable {
    void test () throws InterruptedException{
        for (int i = 0; 1 < 5; i++){
            if (i==2){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(5000);
            }
            System.out.println("test method iteration" + i);
        }
    }
public void run(){
    try{
        test();
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}
public static void main(String[] args) {
    MultiRun t1 = new MultiRun();
    Thread t = new Thread(t1,"first thread");
    t.start();
    System.out.println(t.getName());
}
}