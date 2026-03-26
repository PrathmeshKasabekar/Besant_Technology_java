package MultiThreading;

public class Sychronize implements Runnable{
    synchronized void test(){
        for(int i = 0; i < 5; i++ ){
            System.out.println(Thread.currentThread().getName()+"iteration"+i);
        }
    }
    public void run(){
        test();
    }
    public static void main(String[] args) {
        Sychronize t1 = new Sychronize();
        Thread t = new Thread(t1,"First iteration");
        Thread t2 = new Thread(t1,"Second iteration");
    }
}
