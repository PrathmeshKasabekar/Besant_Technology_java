import java.util.Random;

class Parking {

    static int totalSpace = 50;
    static int entry = 0;
    static int exit = 0;
    static int remaining = totalSpace;

    // synchronized so both threads don't update at same time
    public synchronized static void carEntry() {
        if (remaining > 0) {
            entry++;
            remaining--;
            System.out.println("Car Entered | Entry Count: " + entry +
                    " | Remaining Space: " + remaining);
        } else {
            System.out.println("Parking Full!");
        }
    }

    public synchronized static void carExit() {
        if (remaining < totalSpace) {
            exit++;
            remaining++;
            System.out.println("Car Exited | Exit Count: " + exit +
                    " | Remaining Space: " + remaining);
        } else {
            System.out.println("Parking Empty!");
        }
    }
}

class EntryThread extends Thread {
    Random r = new Random();

    public void run() {
        while (true) {
            try {
                Thread.sleep(1   000); // 5 seconds
            } catch (Exception e) {}

            // random decision to enter
            if (r.nextBoolean()) {
                Parking.carEntry();
            }
        }
    }
}

class ExitThread extends Thread {
    Random r = new Random();

    public void run() {
        while (true) {
            try {
                Thread.sleep(5000); // 5 seconds
            } catch (Exception e) {}

            // random decision to exit
            if (r.nextBoolean()) {
                Parking.carExit();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        EntryThread t1 = new EntryThread();
        ExitThread t2 = new ExitThread();

        t1.start();
        t2.start();
    }
}