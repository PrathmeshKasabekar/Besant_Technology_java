public class Exception_2 {

    static void looparray() throws InterruptedException {
        int a[] = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 4) {
                Thread.sleep(5000); // pause for 5 seconds
            }
            System.out.println(a[i]);
        }
    }

    public static void main(StringSession[] args) throws InterruptedException {
        looparray();
    }
}